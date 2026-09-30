package com.tnkfactory.ad.rwd;

import android.view.View;
import android.widget.ToggleButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class y implements View.OnClickListener {
    public final /* synthetic */ VideoAdView a;

    public y(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoAdView videoAdView = this.a;
        if (view == null) {
            return;
        }
        boolean zIsChecked = ((ToggleButton) view).isChecked();
        videoAdView.f52o = zIsChecked;
        videoAdView.b.setVolumeOn(!zIsChecked);
    }
}
