package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtpVp9Reader implements RtpPayloadReader {
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int SCALABILITY_STRUCTURE_SIZE = 4;
    private static final String TAG = "RtpVp9Reader";
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = -9223372036854775807L;
    private long startTimeOffsetUs = 0;
    private int previousSequenceNumber = -1;
    private int width = -1;
    private int height = -1;
    private boolean gotFirstPacketOfVP9Frame = false;
    private boolean reportedOutputFormat = false;

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i2) {
    }

    public RtpVp9Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i2) {
        TrackOutput trackOutputTrack = extractorOutput.track(i2, 2);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i2, boolean z) {
        int i3;
        int i4;
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp9Descriptor(parsableByteArray, i2)) {
            int i5 = (this.fragmentedSampleSizeBytes == 0 && this.gotFirstPacketOfVP9Frame && (parsableByteArray.peekUnsignedByte() & 4) == 0) ? 1 : 0;
            if (!this.reportedOutputFormat && (i3 = this.width) != -1 && (i4 = this.height) != -1) {
                Format format = this.payloadFormat.format;
                if (i3 != format.width || i4 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.reportedOutputFormat = true;
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
            this.fragmentedSampleSizeBytes += iBytesLeft;
            if (z) {
                if (this.firstReceivedTimestamp == -9223372036854775807L) {
                    this.firstReceivedTimestamp = j;
                }
                this.trackOutput.sampleMetadata(toSampleUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp), i5, this.fragmentedSampleSizeBytes, 0, (TrackOutput.CryptoData) null);
                this.fragmentedSampleSizeBytes = 0;
                this.gotFirstPacketOfVP9Frame = false;
            }
            this.previousSequenceNumber = i2;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j2;
    }

    private boolean validateVp9Descriptor(ParsableByteArray parsableByteArray, int i2) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (!this.gotFirstPacketOfVP9Frame) {
            if ((unsignedByte & 8) == 0) {
                Log.w(TAG, "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            this.gotFirstPacketOfVP9Frame = true;
        } else {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i2 != nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", new Object[]{Integer.valueOf(nextSequenceNumber), Integer.valueOf(i2)}));
                return false;
            }
        }
        if ((unsignedByte & 128) != 0 && (parsableByteArray.readUnsignedByte() & 128) != 0 && parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        int i3 = unsignedByte & 16;
        Assertions.checkArgument(i3 == 0, "VP9 flexible mode is not supported.");
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(1);
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (i3 == 0) {
                parsableByteArray.skipBytes(1);
            }
        }
        if ((unsignedByte & 2) != 0) {
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            if ((unsignedByte2 & 16) != 0) {
                int i4 = ((unsignedByte2 >> 5) & 7) + 1;
                if (parsableByteArray.bytesLeft() < (i4 << 2)) {
                    return false;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    this.width = parsableByteArray.readUnsignedShort();
                    this.height = parsableByteArray.readUnsignedShort();
                }
            }
            if ((unsignedByte2 & 8) != 0) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                if (parsableByteArray.bytesLeft() < unsignedByte3) {
                    return false;
                }
                for (int i6 = 0; i6 < unsignedByte3; i6++) {
                    int unsignedShort = (parsableByteArray.readUnsignedShort() & 12) >> 2;
                    if (parsableByteArray.bytesLeft() < unsignedShort) {
                        return false;
                    }
                    parsableByteArray.skipBytes(unsignedShort);
                }
            }
        }
        return true;
    }

    private static long toSampleUs(long j, long j2, long j3) {
        return j + Util.scaleLargeTimestamp(j2 - j3, 1000000L, MEDIA_CLOCK_FREQUENCY);
    }
}
