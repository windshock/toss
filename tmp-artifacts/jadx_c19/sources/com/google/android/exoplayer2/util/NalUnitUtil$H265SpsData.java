package com.google.android.exoplayer2.util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NalUnitUtil$H265SpsData {
    public final int[] constraintBytes;
    public final int generalLevelIdc;
    public final int generalProfileCompatibilityFlags;
    public final int generalProfileIdc;
    public final int generalProfileSpace;
    public final boolean generalTierFlag;
    public final int height;
    public final float pixelWidthHeightRatio;
    public final int seqParameterSetId;
    public final int width;

    public NalUnitUtil$H265SpsData(int i2, boolean z, int i3, int i4, int[] iArr, int i5, int i6, int i7, int i8, float f) {
        this.generalProfileSpace = i2;
        this.generalTierFlag = z;
        this.generalProfileIdc = i3;
        this.generalProfileCompatibilityFlags = i4;
        this.constraintBytes = iArr;
        this.generalLevelIdc = i5;
        this.seqParameterSetId = i6;
        this.width = i7;
        this.height = i8;
        this.pixelWidthHeightRatio = f;
    }
}
