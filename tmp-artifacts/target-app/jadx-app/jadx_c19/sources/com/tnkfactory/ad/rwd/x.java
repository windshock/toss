package com.tnkfactory.ad.rwd;

import android.view.View;
import android.widget.ToggleButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class x implements View.OnClickListener {
    public final /* synthetic */ VideoAdView a;

    public x(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoAdView videoAdView = this.a;
        ToggleButton toggleButton = (ToggleButton) view;
        if (videoAdView.b == null) {
            return;
        }
        if (!toggleButton.isChecked()) {
            videoAdView.pauseVideo();
            return;
        }
        videoAdView.q = true;
        videoAdView.b.startVideo();
        videoAdView.a(700L);
    }
}
