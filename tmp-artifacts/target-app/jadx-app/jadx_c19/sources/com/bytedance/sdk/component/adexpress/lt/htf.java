package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.animation.PathInterpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class htf extends FrameLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 42302;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 6447;
    private static char onNavigationEvent = 22181;
    private static char onWarmupCompleted = 63403;
    private ImageView dj;
    private AnimatorSet fby;
    private AnimatorSet jw;
    private AnimatorSet lt;
    private TextView lud;
    private ImageView sya;
    private AnimatorSet ul;
    private Context ycx;
    private ImageView zb;

    static /* synthetic */ ImageView dj(htf htfVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        ImageView imageView = htfVar.dj;
        int i6 = i3 + 11;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return imageView;
        }
        throw null;
    }

    static /* synthetic */ AnimatorSet lud(htf htfVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        AnimatorSet animatorSet = htfVar.lt;
        int i6 = i4 + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return animatorSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Context sya(htf htfVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        Context context = htfVar.ycx;
        int i6 = i4 + 1;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return context;
    }

    static /* synthetic */ ImageView ycx(htf htfVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = htfVar.zb;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        return imageView;
    }

    static /* synthetic */ ImageView zb(htf htfVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = htfVar.sya;
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
        return imageView;
    }

    public htf(@NonNull Context context) {
        super(context);
        this.lt = new AnimatorSet();
        this.ul = new AnimatorSet();
        this.fby = new AnimatorSet();
        this.jw = new AnimatorSet();
        this.ycx = context;
        sya();
    }

    private void sya() {
        int i2 = 2 % 2;
        ImageView imageView = new ImageView(this.ycx);
        this.dj = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.wwx.dj(this.ycx, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 30.0f);
        addView(this.dj, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.ycx);
        this.sya = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.ycx, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 50.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 30.0f);
        addView(this.sya, layoutParams2);
        ImageView imageView3 = new ImageView(this.ycx);
        this.zb = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.ycx, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 30.0f);
        addView(this.zb, layoutParams3);
        TextView textView = new TextView(this.ycx);
        this.lud = textView;
        textView.setTextColor(-1);
        this.lud.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.lud, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.htf.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) htf.ycx(htf.this).getLayoutParams();
                layoutParams5.topMargin = (int) ((htf.zb(htf.this).getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(htf.this.getContext(), 7.0f));
                int iYcx = (-htf.zb(htf.this).getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(htf.sya(htf.this), 30.0f));
                layoutParams5.leftMargin = iYcx;
                layoutParams5.setMarginStart(iYcx);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                htf.ycx(htf.this).setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) htf.dj(htf.this).getLayoutParams();
                layoutParams6.topMargin = (int) ((htf.zb(htf.this).getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(htf.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((htf.zb(htf.this).getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(htf.sya(htf.this), 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                htf.dj(htf.this).setLayoutParams(layoutParams6);
            }
        });
        int i3 = asBinder + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str;
        int i5 = 2;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i8 = $11 + 5;
            $10 = i8 % 128;
            int i9 = 58224;
            if (i8 % i5 != 0) {
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i3 = 1;
            } else {
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i7;
            }
            while (i3 < 16) {
                int i10 = $11 + 13;
                $10 = i10 % 128;
                int i11 = i10 % i5;
                char c = cArr3[1];
                char c2 = cArr3[i7];
                int i12 = (c2 + i9) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[i5] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i7] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cBlue = (char) Color.blue(i7);
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        str = "";
                        int offsetAfter = 12434 - TextUtils.getOffsetAfter(str, i7);
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, keyRepeatTimeout, offsetAfter, -787580090, false, "C", clsArr);
                    } else {
                        str = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 10 - (Process.myPid() >> 22), KeyEvent.keyCodeFromString(str) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i5 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i4 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 15, 19900 - TextUtils.lastIndexOf("", '0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i4 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i5 = i4;
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private void dj() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{52615, 29040, 34313, 49793, 61050, 24993}, 5 - KeyEvent.getDeadChar(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.zb, strIntern, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.sya, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.sya, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.dj, strIntern, 0.0f, 1.0f);
        this.fby.setDuration(300L);
        this.fby.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.zb, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lt.htf.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) htf.dj(htf.this).getLayoutParams();
                layoutParams.width = num.intValue();
                htf.dj(htf.this).setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.sya, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.jw.setDuration(1500L);
        this.jw.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.zb, strIntern, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.dj, strIntern, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.sya, strIntern, 1.0f, 0.0f);
        this.ul.setDuration(50L);
        this.ul.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.lt.playSequentially(this.fby, this.jw, this.ul);
        int i3 = asBinder + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public void ycx() throws Throwable {
        int i2 = 2 % 2;
        dj();
        this.lt.start();
        this.lt.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.lt.htf.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                htf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.htf.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        htf.lud(htf.this).start();
                    }
                }, 200L);
            }
        });
        int i3 = onExtraCallback + 109;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public void zb() {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        try {
            AnimatorSet animatorSet = this.lt;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.fby;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.jw;
            if (animatorSet3 != null) {
                int i4 = asBinder + 47;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    animatorSet3.cancel();
                    throw null;
                }
                animatorSet3.cancel();
                int i5 = asBinder + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            AnimatorSet animatorSet4 = this.ul;
            if (animatorSet4 != null) {
                int i7 = onExtraCallback + 93;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                animatorSet4.cancel();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOIkkQaOYMCIXuFUiQY=", "WO8jlgawSMmJR9ZJhR6u", 189);
        }
    }

    public void setGuideText(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.lud.setText(str);
        int i5 = onExtraCallback + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 81;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        super.onSizeChanged(i2, i3, i4, i5);
        int i9 = asBinder + 117;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }
}
