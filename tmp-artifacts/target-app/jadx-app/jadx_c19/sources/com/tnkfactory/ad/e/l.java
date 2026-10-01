package com.tnkfactory.ad.e;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import android.widget.TextView;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.e.l$;
import com.tnkfactory.ad.rwd.VideoActionListener;
import com.tnkfactory.ad.rwd.VideoProgressListener;
import com.tnkfactory.ad.rwd.YouTubeVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class l {
    public final /* synthetic */ YouTubeVideoView a;

    public l(YouTubeVideoView youTubeVideoView) {
        this.a = youTubeVideoView;
    }

    public static final void a(YouTubeVideoView youTubeVideoView) {
        youTubeVideoView.startVideo();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendError(int i2) {
        String str;
        if (i2 == 2) {
            str = "invalid parameter.";
        } else if (i2 == 5) {
            str = "HTML5 error.";
        } else if (i2 == 150) {
            str = "not authorized play.";
        } else if (i2 == 100) {
            str = "video not found.";
        } else if (i2 != 101) {
            str = "";
        }
        Logger.e("youtube_player_failuer : " + str);
    }

    @JavascriptInterface
    public final void sendReady() {
        this.a.f55o = true;
        if (this.a.f54i) {
            new Handler().postDelayed(new l$.ExternalSyntheticLambda0(this.a), 1000L);
        }
    }

    @JavascriptInterface
    public final void sendStateChange(int i2) {
        this.a.e = i2;
        int i3 = this.a.e;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.a.p = false;
                    this.a.setPanelVisible(true);
                    YouTubeVideoView.access$hidePanelDelayed(this.a, -1L);
                    return;
                }
                return;
            }
            this.a.p = true;
            if (this.a.u == null || this.a.j) {
                return;
            }
            this.a.j = true;
            VideoProgressListener videoProgressListener = this.a.u;
            Intrinsics.checkNotNull(videoProgressListener);
            videoProgressListener.onProgress(0);
            return;
        }
        this.a.g = 0.0f;
        this.a.h = 0;
        this.a.p = false;
        YouTubeVideoView.access$hidePanelDelayed(this.a, -1L);
        if (this.a.c != null) {
            ImageView imageView = this.a.c;
            Intrinsics.checkNotNull(imageView);
            Drawable drawable = imageView.getDrawable();
            Intrinsics.checkNotNull(drawable, "");
            ((ClipDrawable) drawable).setLevel(0);
        }
        if (this.a.d != null) {
            TextView textView = this.a.d;
            Intrinsics.checkNotNull(textView);
            textView.setText("");
        }
        if (this.a.t != null) {
            VideoActionListener videoActionListener = this.a.t;
            Intrinsics.checkNotNull(videoActionListener);
            videoActionListener.onCompletion(this.a);
        }
        if (this.a.u == null || this.a.n) {
            return;
        }
        this.a.n = true;
        VideoProgressListener videoProgressListener2 = this.a.u;
        Intrinsics.checkNotNull(videoProgressListener2);
        videoProgressListener2.onProgress(100);
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(float f) {
        YouTubeVideoView youTubeVideoView = this.a;
        youTubeVideoView.g = youTubeVideoView.f - f;
        float f2 = (this.a.f - this.a.g) / this.a.f;
        if (this.a.c != null) {
            ImageView imageView = this.a.c;
            Intrinsics.checkNotNull(imageView);
            Drawable drawable = imageView.getDrawable();
            Intrinsics.checkNotNull(drawable, "");
            ((ClipDrawable) drawable).setLevel((int) (10000.0f * f2));
        }
        if (this.a.d != null) {
            if (this.a.g > 0.3f) {
                TextView textView = this.a.d;
                Intrinsics.checkNotNull(textView);
                textView.setText(String.valueOf((int) this.a.g));
            } else {
                TextView textView2 = this.a.d;
                Intrinsics.checkNotNull(textView2);
                textView2.setText("");
            }
        }
        if (this.a.f <= 0.0f || this.a.u == null) {
            return;
        }
        int i2 = (int) f;
        if (this.a.h != i2) {
            this.a.h = i2;
            VideoProgressListener videoProgressListener = this.a.u;
            Intrinsics.checkNotNull(videoProgressListener);
            videoProgressListener.onSeekTime(this.a.h);
        }
        double d = f2;
        if (d >= 0.25d && !this.a.k) {
            this.a.k = true;
            VideoProgressListener videoProgressListener2 = this.a.u;
            Intrinsics.checkNotNull(videoProgressListener2);
            videoProgressListener2.onProgress(25);
        }
        if (d >= 0.5d && !this.a.l) {
            this.a.l = true;
            VideoProgressListener videoProgressListener3 = this.a.u;
            Intrinsics.checkNotNull(videoProgressListener3);
            videoProgressListener3.onProgress(50);
        }
        if (d < 0.75d || this.a.m) {
            return;
        }
        this.a.m = true;
        VideoProgressListener videoProgressListener4 = this.a.u;
        Intrinsics.checkNotNull(videoProgressListener4);
        videoProgressListener4.onProgress(75);
    }

    @JavascriptInterface
    public final void sendVideoDuration(float f) {
        this.a.f = f;
        this.a.g = f;
        this.a.h = 0;
        YouTubeVideoView.access$hidePanelDelayed(this.a, 700L);
    }
}
