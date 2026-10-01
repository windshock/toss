package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ AdsMediaSource.AdPrepareListener f$0;
    public final /* synthetic */ MediaSource.MediaPeriodId f$1;

    public /* synthetic */ AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1(AdsMediaSource.AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId) {
        this.f$0 = adPrepareListener;
        this.f$1 = mediaPeriodId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdsMediaSource.AdPrepareListener.$r8$lambda$ITg3c4B9VmF4WUKYZFmOXg0aJyM(this.f$0, this.f$1);
    }
}
