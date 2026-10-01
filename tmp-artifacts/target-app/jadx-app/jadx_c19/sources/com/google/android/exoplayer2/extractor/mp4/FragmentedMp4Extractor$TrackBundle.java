package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FragmentedMp4Extractor$TrackBundle {
    private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
    public int currentSampleInTrackRun;
    public int currentSampleIndex;
    public int currentTrackRunIndex;
    private boolean currentlyInFragment;
    public DefaultSampleValues defaultSampleValues;
    public int firstSampleToOutputIndex;
    public TrackSampleTable moovSampleTable;
    public final TrackOutput output;
    public final TrackFragment fragment = new TrackFragment();
    public final ParsableByteArray scratch = new ParsableByteArray();
    private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
    private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

    public FragmentedMp4Extractor$TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
        this.output = trackOutput;
        this.moovSampleTable = trackSampleTable;
        this.defaultSampleValues = defaultSampleValues;
        reset(trackSampleTable, defaultSampleValues);
    }

    public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
        this.moovSampleTable = trackSampleTable;
        this.defaultSampleValues = defaultSampleValues;
        this.output.format(trackSampleTable.track.format);
        resetFragmentInfo();
    }

    public void updateDrmInitData(DrmInitData drmInitData) {
        TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
        this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
    }

    public void resetFragmentInfo() {
        this.fragment.reset();
        this.currentSampleIndex = 0;
        this.currentTrackRunIndex = 0;
        this.currentSampleInTrackRun = 0;
        this.firstSampleToOutputIndex = 0;
        this.currentlyInFragment = false;
    }

    public void seek(long j) {
        int i2 = this.currentSampleIndex;
        while (true) {
            TrackFragment trackFragment = this.fragment;
            if (i2 >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i2) >= j) {
                return;
            }
            if (this.fragment.sampleIsSyncFrameTable[i2]) {
                this.firstSampleToOutputIndex = i2;
            }
            i2++;
        }
    }

    public long getCurrentSamplePresentationTimeUs() {
        if (!this.currentlyInFragment) {
            return this.moovSampleTable.timestampsUs[this.currentSampleIndex];
        }
        return this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
    }

    public long getCurrentSampleOffset() {
        if (!this.currentlyInFragment) {
            return this.moovSampleTable.offsets[this.currentSampleIndex];
        }
        return this.fragment.trunDataPosition[this.currentTrackRunIndex];
    }

    public int getCurrentSampleSize() {
        if (!this.currentlyInFragment) {
            return this.moovSampleTable.sizes[this.currentSampleIndex];
        }
        return this.fragment.sampleSizeTable[this.currentSampleIndex];
    }

    public int getCurrentSampleFlags() {
        int i2;
        if (!this.currentlyInFragment) {
            i2 = this.moovSampleTable.flags[this.currentSampleIndex];
        } else {
            i2 = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
        }
        return getEncryptionBoxIfEncrypted() != null ? i2 | 1073741824 : i2;
    }

    public boolean next() {
        this.currentSampleIndex++;
        if (!this.currentlyInFragment) {
            return false;
        }
        int i2 = this.currentSampleInTrackRun + 1;
        this.currentSampleInTrackRun = i2;
        int[] iArr = this.fragment.trunLength;
        int i3 = this.currentTrackRunIndex;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.currentTrackRunIndex = i3 + 1;
        this.currentSampleInTrackRun = 0;
        return false;
    }

    public int outputSampleEncryptionData(int i2, int i3) {
        ParsableByteArray parsableByteArray;
        TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
        if (encryptionBoxIfEncrypted == null) {
            return 0;
        }
        int length = encryptionBoxIfEncrypted.perSampleIvSize;
        if (length != 0) {
            parsableByteArray = this.fragment.sampleEncryptionData;
        } else {
            byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
            this.defaultInitializationVector.reset(bArr, bArr.length);
            ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
            length = bArr.length;
            parsableByteArray = parsableByteArray2;
        }
        boolean zSampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
        boolean z = zSampleHasSubsampleEncryptionTable || i3 != 0;
        this.encryptionSignalByte.getData()[0] = (byte) ((z ? 128 : 0) | length);
        this.encryptionSignalByte.setPosition(0);
        this.output.sampleData(this.encryptionSignalByte, 1, 1);
        this.output.sampleData(parsableByteArray, length, 1);
        if (!z) {
            return length + 1;
        }
        if (!zSampleHasSubsampleEncryptionTable) {
            this.scratch.reset(8);
            byte[] data = this.scratch.getData();
            data[0] = 0;
            data[1] = 1;
            data[2] = (byte) (i3 >> 8);
            data[3] = (byte) i3;
            data[4] = (byte) (i2 >>> 24);
            data[5] = (byte) (i2 >> 16);
            data[6] = (byte) (i2 >> 8);
            data[7] = (byte) i2;
            this.output.sampleData(this.scratch, 8, 1);
            return length + 9;
        }
        ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
        int unsignedShort = parsableByteArray3.readUnsignedShort();
        parsableByteArray3.skipBytes(-2);
        int i4 = (unsignedShort * 6) + 2;
        if (i3 != 0) {
            this.scratch.reset(i4);
            byte[] data2 = this.scratch.getData();
            parsableByteArray3.readBytes(data2, 0, i4);
            int i5 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i3;
            data2[2] = (byte) (i5 >> 8);
            data2[3] = (byte) i5;
            parsableByteArray3 = this.scratch;
        }
        this.output.sampleData(parsableByteArray3, i4, 1);
        return length + 1 + i4;
    }

    public void skipSampleEncryptionData() {
        TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
        if (encryptionBoxIfEncrypted != null) {
            ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            int i2 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i2 != 0) {
                parsableByteArray.skipBytes(i2);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }
    }

    public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
        if (!this.currentlyInFragment) {
            return null;
        }
        int i2 = ((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
        TrackEncryptionBox sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
        if (sampleDescriptionEncryptionBox == null) {
            sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i2);
        }
        if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
            return null;
        }
        return sampleDescriptionEncryptionBox;
    }
}
