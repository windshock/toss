package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil$Header;
import com.google.android.exoplayer2.extractor.SeekMap$SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    public boolean isSeekable() {
        return true;
    }

    public static VbriSeeker create(long j, long j2, MpegAudioUtil$Header mpegAudioUtil$Header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(10);
        int i2 = parsableByteArray.readInt();
        if (i2 <= 0) {
            return null;
        }
        int i3 = mpegAudioUtil$Header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i2, (i3 >= 32000 ? 1152 : 576) * 1000000, i3);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j3 = j2 + mpegAudioUtil$Header.frameSize;
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i4 = 0;
        long j4 = j2;
        while (i4 < unsignedShort) {
            int i5 = unsignedShort2;
            long j5 = j3;
            jArr[i4] = (i4 * jScaleLargeTimestamp) / unsignedShort;
            jArr2[i4] = Math.max(j4, j5);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j4 += unsignedByte * i5;
            i4++;
            jArr = jArr;
            unsignedShort2 = i5;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            Log.w(TAG, "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new VbriSeeker(jArr3, jArr2, jScaleLargeTimestamp, j4);
    }

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataEndPosition = j2;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs < j) {
            long[] jArr = this.timesUs;
            if (iBinarySearchFloor != jArr.length - 1) {
                int i2 = iBinarySearchFloor + 1;
                return new SeekMap$SeekPoints(seekPoint, new SeekPoint(jArr[i2], this.positions[i2]));
            }
        }
        return new SeekMap$SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true, true)];
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }
}
