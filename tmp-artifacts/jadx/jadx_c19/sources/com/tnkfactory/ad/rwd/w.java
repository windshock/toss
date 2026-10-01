package com.tnkfactory.ad.rwd;

import android.graphics.drawable.ClipDrawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.tnkfactory.ad.rwd.VideoAdView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class w implements VideoAdView.VideoPlayListener {
    public final /* synthetic */ VideoAdView a;

    public w(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onCompletion() {
        VideoAdView videoAdView = this.a;
        videoAdView.p = false;
        if (!videoAdView.k) {
            videoAdView.q = false;
        }
        videoAdView.a(-1L);
        TextView textView = this.a.h;
        if (textView != null) {
            textView.setText("");
        }
        ToggleButton toggleButton = this.a.e;
        if (toggleButton != null) {
            toggleButton.setChecked(false);
            this.a.setPanelVisible(true);
        }
        VideoAdView videoAdView2 = this.a;
        VideoActionListener videoActionListener = videoAdView2.r;
        if (videoActionListener != null && !videoAdView2.k) {
            videoActionListener.onCompletion(videoAdView2);
        }
        VideoAdView videoAdView3 = this.a;
        VideoProgressListener videoProgressListener = videoAdView3.s;
        if (videoProgressListener == null || videoAdView3.y) {
            return;
        }
        videoAdView3.y = true;
        videoProgressListener.onProgress(100);
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onPause(int i2) {
        VideoAdView videoAdView = this.a;
        videoAdView.p = false;
        videoAdView.removeCallbacks(videoAdView.A);
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onPlay(int i2) {
        VideoAdView videoAdView = this.a;
        videoAdView.p = true;
        videoAdView.l = false;
        videoAdView.f51i = i2;
        videoAdView.removeCallbacks(videoAdView.A);
        VideoAdView videoAdView2 = this.a;
        videoAdView2.postDelayed(videoAdView2.A, 200L);
        ToggleButton toggleButton = this.a.e;
        if (toggleButton != null) {
            toggleButton.setChecked(true);
            this.a.a(700L);
        }
        VideoAdView videoAdView3 = this.a;
        VideoProgressListener videoProgressListener = videoAdView3.s;
        if (videoProgressListener != null && !videoAdView3.u) {
            videoAdView3.u = true;
            videoProgressListener.onProgress(0);
        }
        this.a.b.setVolumeOn(!r6.f52o);
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onPrepare() {
        VideoAdView videoAdView = this.a;
        if (videoAdView.l || videoAdView.k) {
            videoAdView.b.startVideo();
        }
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onRelease() {
        ClipDrawable clipDrawable;
        VideoAdView videoAdView = this.a;
        videoAdView.p = false;
        ImageView imageView = videoAdView.g;
        if (imageView != null && (clipDrawable = (ClipDrawable) imageView.getDrawable()) != null) {
            clipDrawable.setLevel(0);
        }
        TextView textView = this.a.h;
        if (textView != null) {
            textView.setText("");
        }
        ToggleButton toggleButton = this.a.e;
        if (toggleButton != null) {
            toggleButton.setChecked(false);
            this.a.setPanelVisible(true);
        }
    }

    @Override // com.tnkfactory.ad.rwd.VideoAdView.VideoPlayListener
    public final void onSize(int i2, int i3) {
        VideoAdView videoAdView = this.a;
        if (videoAdView.m) {
            float width = videoAdView.getWidth();
            float height = videoAdView.getHeight();
            int paddingLeft = videoAdView.getPaddingLeft();
            int paddingRight = videoAdView.getPaddingRight();
            RelativeLayout.LayoutParams layoutParams = videoAdView.c;
            float f = width - (((paddingRight + paddingLeft) + layoutParams.leftMargin) + layoutParams.rightMargin);
            int paddingTop = videoAdView.getPaddingTop();
            int paddingBottom = videoAdView.getPaddingBottom();
            RelativeLayout.LayoutParams layoutParams2 = videoAdView.c;
            float f2 = height - (((paddingBottom + paddingTop) + layoutParams2.topMargin) + layoutParams2.bottomMargin);
            float f3 = i2;
            float f4 = i3;
            float f5 = f / f2 > f3 / f4 ? f2 / f4 : f / f3;
            int i4 = (int) (f3 * f5);
            int i5 = (int) (f5 * f4);
            layoutParams2.width = i4;
            layoutParams2.height = i5;
            RelativeLayout.LayoutParams layoutParams3 = videoAdView.d;
            layoutParams3.width = i4;
            layoutParams3.height = i5;
            videoAdView.a.setLayoutParams(layoutParams2);
            videoAdView.a.requestLayout();
            videoAdView.b.setLayoutParams(videoAdView.d);
            videoAdView.b.requestLayout();
        }
        VideoActionListener videoActionListener = this.a.r;
        if (videoActionListener != null) {
            videoActionListener.onSize(i2, i3);
        }
    }
}
