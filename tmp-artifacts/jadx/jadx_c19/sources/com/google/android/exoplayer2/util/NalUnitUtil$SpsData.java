package com.google.android.exoplayer2.util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NalUnitUtil$SpsData {
    public final int constraintsFlagsAndReservedZero2Bits;
    public final boolean deltaPicOrderAlwaysZeroFlag;
    public final boolean frameMbsOnlyFlag;
    public final int frameNumLength;
    public final int height;
    public final int levelIdc;
    public final int maxNumRefFrames;
    public final int picOrderCntLsbLength;
    public final int picOrderCountType;
    public final float pixelWidthHeightRatio;
    public final int profileIdc;
    public final boolean separateColorPlaneFlag;
    public final int seqParameterSetId;
    public final int width;

    public NalUnitUtil$SpsData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, boolean z, boolean z2, int i9, int i10, int i11, boolean z3) {
        this.profileIdc = i2;
        this.constraintsFlagsAndReservedZero2Bits = i3;
        this.levelIdc = i4;
        this.seqParameterSetId = i5;
        this.maxNumRefFrames = i6;
        this.width = i7;
        this.height = i8;
        this.pixelWidthHeightRatio = f;
        this.separateColorPlaneFlag = z;
        this.frameMbsOnlyFlag = z2;
        this.frameNumLength = i9;
        this.picOrderCountType = i10;
        this.picOrderCntLsbLength = i11;
        this.deltaPicOrderAlwaysZeroFlag = z3;
    }
}
