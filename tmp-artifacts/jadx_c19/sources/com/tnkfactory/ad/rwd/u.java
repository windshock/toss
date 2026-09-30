package com.tnkfactory.ad.rwd;

import android.graphics.drawable.ClipDrawable;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class u implements Runnable {
    public final /* synthetic */ VideoAdView a;

    public u(VideoAdView videoAdView) {
        this.a = videoAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int playTimeLeft;
        VideoAdView videoAdView = this.a;
        if (videoAdView.f51i <= 0 || (playTimeLeft = videoAdView.b.getPlayTimeLeft()) < 0) {
            return;
        }
        VideoAdView videoAdView2 = this.a;
        float f = (r2 - playTimeLeft) / videoAdView2.f51i;
        ImageView imageView = videoAdView2.g;
        if (imageView != null) {
            ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();
            if (this.a.p) {
                if (clipDrawable != null) {
                    clipDrawable.setLevel((int) (10000.0f * f));
                }
            } else if (clipDrawable != null) {
                clipDrawable.setLevel(0);
            }
        }
        VideoAdView videoAdView3 = this.a;
        TextView textView = videoAdView3.h;
        if (textView != null) {
            if (!videoAdView3.p || playTimeLeft <= 300) {
                textView.setText("");
            } else {
                textView.setText(String.valueOf(playTimeLeft / 1000));
            }
        }
        VideoAdView videoAdView4 = this.a;
        if (videoAdView4.p) {
            videoAdView4.postDelayed(this, 200L);
        }
        VideoAdView videoAdView5 = this.a;
        if (videoAdView5.s != null) {
            int playSeekTime = videoAdView5.b.getPlaySeekTime() / 1000;
            VideoAdView videoAdView6 = this.a;
            if (videoAdView6.j != playSeekTime) {
                videoAdView6.j = playSeekTime;
                videoAdView6.s.onSeekTime(playSeekTime);
            }
            double d = f;
            if (d >= 0.25d) {
                VideoAdView videoAdView7 = this.a;
                if (!videoAdView7.v) {
                    videoAdView7.v = true;
                    videoAdView7.s.onProgress(25);
                }
            }
            if (d >= 0.5d) {
                VideoAdView videoAdView8 = this.a;
                if (!videoAdView8.w) {
                    videoAdView8.w = true;
                    videoAdView8.s.onProgress(50);
                }
            }
            if (d >= 0.75d) {
                VideoAdView videoAdView9 = this.a;
                if (videoAdView9.x) {
                    return;
                }
                videoAdView9.x = true;
                videoAdView9.s.onProgress(75);
            }
        }
    }
}
