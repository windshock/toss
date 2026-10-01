package com.tnkfactory.ad.rwd;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class t implements Runnable {
    public final /* synthetic */ VideoAdView a;

    public t(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoAdView videoAdView = this.a;
        if (!videoAdView.n || videoAdView.b.getPlayTimeLeft() <= 0) {
            return;
        }
        this.a.setPanelVisible(false);
    }
}
