package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ AdsMediaSource.AdPrepareListener f$0;
    public final /* synthetic */ MediaSource.MediaPeriodId f$1;
    public final /* synthetic */ IOException f$2;

    public /* synthetic */ AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0(AdsMediaSource.AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        this.f$0 = adPrepareListener;
        this.f$1 = mediaPeriodId;
        this.f$2 = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdsMediaSource.AdPrepareListener.$r8$lambda$aWLwoVWFBG6p75yrusUcKHf6rhQ(this.f$0, this.f$1, this.f$2);
    }
}
