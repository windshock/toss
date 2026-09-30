package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ry extends FrameLayout {
    private AnimatorSet dj;
    private TextView lt;
    private boolean lud;
    private dj sya;
    private Context ycx;
    private ImageView zb;

    public ry(@NonNull Context context) {
        super(context);
        this.lud = true;
        this.ycx = context;
        this.dj = new AnimatorSet();
        sya();
        dj();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.ry.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ry.this.zb.getLayoutParams();
                layoutParams.topMargin = ((int) ((ry.this.sya.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.ycx, 20.0f));
                layoutParams.leftMargin = ((int) ((ry.this.sya.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.ycx, 20.0f));
                layoutParams.bottomMargin = (int) (((-ry.this.sya.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-ry.this.sya.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.dj.ul.ycx(ry.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                ry.this.zb.setLayoutParams(layoutParams);
            }
        });
    }

    private void sya() {
        this.sya = new dj(this.ycx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 20.0f);
        int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 20.0f);
        layoutParams.leftMargin = iYcx;
        layoutParams.setMarginStart(iYcx);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.sya, layoutParams);
        this.sya.ycx();
        this.zb = new ImageView(this.ycx);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f));
        this.zb.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.ycx, "tt_splash_hand"));
        addView(this.zb, layoutParams2);
        TextView textView = new TextView(this.ycx);
        this.lt = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 10.0f);
        addView(this.lt, layoutParams3);
    }

    private void dj() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.zb, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lt.ry.2
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static long onNavigationEvent = 6785029318256351824L;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i2);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                int i4 = $11 + 119;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i6 = $11 + 111;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 45812), 85 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 21233 - Color.argb(0, 0, 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14185), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.keyCodeFromString("") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws Throwable {
                int i2 = 2 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{18485, 51532, 18516, 26748, 31683, 14603, 27931, 35175, 52516}, Color.red(0), objArr);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ry.this.zb, ((String) objArr[0]).intern(), 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                ry.this.zb.setVisibility(0);
                int i3 = onExtraCallback + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                int i2 = 2 % 2;
                if (ry.this.lud) {
                    int i3 = onWarmupCompleted + 17;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    ry.this.sya.ycx();
                    ry.this.sya.setAlpha(1.0f);
                    int i5 = onExtraCallback + 73;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ry.this.sya.zb();
                    ry.this.sya.setAlpha(0.0f);
                }
                ry.this.lud = !r3.lud;
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.zb, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.dj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(String str) {
        this.lt.setText(str);
    }

    public void setGuideTextColor(int i2) {
        this.lt.setTextColor(i2);
    }

    public void ycx() {
        this.dj.start();
    }

    public void zb() {
        AnimatorSet animatorSet = this.dj;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dj djVar = this.sya;
        if (djVar != null) {
            djVar.zb();
        }
    }
}
