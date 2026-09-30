package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.e.h;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class VideoAdView extends RelativeLayout {
    public final u A;
    public final RelativeLayout a;
    public final VideoPlayView b;
    public RelativeLayout.LayoutParams c;
    public final RelativeLayout.LayoutParams d;
    public final ToggleButton e;
    public final ToggleButton f;
    public final ImageView g;
    public final TextView h;

    /* renamed from: i, reason: collision with root package name */
    public int f51i;
    public int j;
    public final boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52o;
    public boolean p;
    public boolean q;
    public VideoActionListener r;
    public VideoProgressListener s;
    public v t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final t z;

    public interface VideoPlayListener {
        void onCompletion();

        void onPause(int i2);

        void onPlay(int i2);

        void onPrepare();

        void onRelease();

        void onSize(int i2, int i3);
    }

    public VideoAdView(Context context, int i2, boolean z, int i3, boolean z2) {
        super(context);
        this.c = null;
        this.d = null;
        this.f51i = 0;
        this.j = 0;
        this.l = false;
        this.m = true;
        this.n = true;
        this.f52o = false;
        this.p = false;
        this.q = false;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = new t(this);
        this.A = new u(this);
        this.k = z;
        if (z) {
            this.q = true;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.c = layoutParams;
        layoutParams.addRule(13);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.a = relativeLayout;
        relativeLayout.setLayoutParams(this.c);
        addView(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        this.d = layoutParams2;
        layoutParams2.addRule(13);
        VideoPlayView videoPlayView = new VideoPlayView(context);
        this.b = videoPlayView;
        videoPlayView.setLayoutParams(layoutParams2);
        videoPlayView.setVideoPlayListener(new w(this));
        relativeLayout.addView(videoPlayView);
        if ((i2 & 1) != 0) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Utils.dip(2));
            layoutParams3.addRule(12);
            ImageView imageView = new ImageView(context);
            this.g = imageView;
            imageView.setLayoutParams(layoutParams3);
            imageView.setBackgroundColor(0);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16729344), 3, 1);
            clipDrawable.setLevel(0);
            imageView.setImageDrawable(clipDrawable);
            addView(imageView);
        }
        if ((i2 & 2) != 0) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(12);
            layoutParams4.addRule(9);
            layoutParams4.leftMargin = 10;
            layoutParams4.bottomMargin = 10;
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setLayoutParams(layoutParams4);
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            addView(textView);
        }
        if (z) {
            videoPlayView.setLooping(true);
            videoPlayView.setMute(true);
            return;
        }
        int iDip = Utils.dip(50);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iDip, iDip);
        layoutParams5.addRule(13);
        if (z2) {
            ToggleButton toggleButton = new ToggleButton(context);
            this.e = toggleButton;
            toggleButton.setLayoutParams(layoutParams5);
            toggleButton.setText((CharSequence) null);
            toggleButton.setTextOn(null);
            toggleButton.setTextOff(null);
            toggleButton.setBackgroundResource(R.drawable.com_tnk_offerwall_btn_video_play);
            toggleButton.setOnClickListener(new x(this));
            relativeLayout.addView(toggleButton);
        }
        int iDip2 = Utils.dip(20);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(iDip2, iDip2);
        if ((i3 & 1) == 0) {
            layoutParams6.addRule(11);
        } else {
            layoutParams6.addRule(9);
        }
        if ((i3 & 2) == 0) {
            layoutParams6.addRule(10);
        } else {
            layoutParams6.addRule(12);
        }
        int i4 = iDip2 / 4;
        layoutParams6.rightMargin = i4;
        layoutParams6.topMargin = i4;
        layoutParams6.leftMargin = i4;
        layoutParams6.bottomMargin = i4;
        ToggleButton toggleButton2 = new ToggleButton(context);
        this.f = toggleButton2;
        toggleButton2.setLayoutParams(layoutParams6);
        toggleButton2.setText((CharSequence) null);
        toggleButton2.setTextOn(null);
        toggleButton2.setTextOff(null);
        toggleButton2.setBackgroundResource(R.drawable.com_tnk_offerwall_btn_video_volume);
        toggleButton2.setOnClickListener(new y(this));
        relativeLayout.addView(toggleButton2);
        toggleButton2.setChecked(this.f52o);
        toggleButton2.setSelected(this.f52o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanelVisible(boolean z) {
        this.n = z;
        int i2 = z ? 0 : 4;
        ToggleButton toggleButton = this.e;
        if (toggleButton != null && toggleButton.getVisibility() != i2) {
            this.e.setVisibility(i2);
            if (i2 == 4) {
                ToggleButton toggleButton2 = this.e;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                toggleButton2.startAnimation(alphaAnimation);
            }
        }
        ToggleButton toggleButton3 = this.f;
        if (toggleButton3 != null) {
            toggleButton3.setVisibility(i2);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setVisibility(i2);
        }
    }

    public final void a(long j) {
        removeCallbacks(this.z);
        if (j > 0) {
            postDelayed(this.z, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t == null) {
            this.t = new v(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this.t);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.t != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.t);
            this.t = null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.p) {
            setPanelVisible(true);
            a(2000L);
        }
        return true;
    }

    public void pauseVideo() {
        this.q = false;
        ToggleButton toggleButton = this.e;
        if (toggleButton != null) {
            toggleButton.setChecked(false);
        }
        VideoPlayView videoPlayView = this.b;
        if (videoPlayView == null || !this.p) {
            return;
        }
        videoPlayView.pauseVideo();
        setPanelVisible(true);
        a(-1L);
    }

    public void resumeVideo() {
        this.q = true;
        ToggleButton toggleButton = this.e;
        if (toggleButton != null) {
            toggleButton.setChecked(true);
        }
        VideoPlayView videoPlayView = this.b;
        if (videoPlayView != null) {
            videoPlayView.startVideo();
            a(700L);
        }
    }

    public void setAutoStart(boolean z) {
        this.l = z;
        if (z) {
            this.q = true;
        }
    }

    public void setKeepRatio(boolean z) {
        this.m = z;
    }

    public void setMediaPath(String str) {
        this.b.setMediaPath(str);
    }

    public void setMuteOnStart(boolean z) {
        this.f52o = z;
        ToggleButton toggleButton = this.f;
        if (toggleButton != null) {
            toggleButton.setChecked(z);
            this.f.setSelected(this.f52o);
        }
    }

    public void setVideoActionListener(VideoActionListener videoActionListener) {
        this.r = videoActionListener;
    }

    public void setVideoFrameLayoutParams(RelativeLayout.LayoutParams layoutParams) {
        this.c = layoutParams;
    }

    public void setVideoProgressListener(VideoProgressListener videoProgressListener) {
        this.s = videoProgressListener;
    }

    public void startVideo() {
        VideoPlayView videoPlayView = this.b;
        if (videoPlayView != null) {
            this.l = true;
            this.q = true;
            videoPlayView.startVideo();
            ToggleButton toggleButton = this.e;
            if (toggleButton != null) {
                toggleButton.setChecked(true);
                a(700L);
            }
        }
    }

    public void setVideoClipRound(int i2) {
        this.a.setOutlineProvider(new h(i2));
    }
}
