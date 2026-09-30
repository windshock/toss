package com.tnkfactory.ad.rwd;

import android.view.ViewTreeObserver;
import android.widget.ToggleButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class v implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ VideoAdView a;

    public v(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zIsViewVisible = LayoutUtils.isViewVisible(this.a, true);
        VideoAdView videoAdView = this.a;
        if (zIsViewVisible) {
            if (!videoAdView.q || videoAdView.p) {
                return;
            }
            ToggleButton toggleButton = videoAdView.e;
            if (toggleButton != null) {
                toggleButton.setChecked(true);
            }
            VideoPlayView videoPlayView = videoAdView.b;
            if (videoPlayView != null) {
                videoPlayView.startVideo();
                videoAdView.a(700L);
                return;
            }
            return;
        }
        if (videoAdView.p) {
            ToggleButton toggleButton2 = videoAdView.e;
            if (toggleButton2 != null) {
                toggleButton2.setChecked(false);
            }
            VideoPlayView videoPlayView2 = videoAdView.b;
            if (videoPlayView2 == null || !videoAdView.p) {
                return;
            }
            videoPlayView2.pauseVideo();
            videoAdView.setPanelVisible(true);
            videoAdView.a(-1L);
        }
    }
}
