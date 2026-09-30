package com.google.android.exoplayer2.util;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NalUnitUtil$PpsData {
    public final boolean bottomFieldPicOrderInFramePresentFlag;
    public final int picParameterSetId;
    public final int seqParameterSetId;

    public NalUnitUtil$PpsData(int i2, int i3, boolean z) {
        this.picParameterSetId = i2;
        this.seqParameterSetId = i3;
        this.bottomFieldPicOrderInFramePresentFlag = z;
    }
}
