package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc extends FrameLayout {
    private AnimatorSet dj;
    private TextView lt;
    private boolean lud;
    private wwx sya;
    private Context ycx;
    private ImageView zb;

    public syc(@NonNull Context context) {
        super(context);
        this.lud = true;
        this.ycx = context;
        this.dj = new AnimatorSet();
        sya();
        dj();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.syc.1
            @Override // java.lang.Runnable
            public void run() {
                int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.ycx, 50.0f);
                int iYcx2 = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.ycx, 50.0f);
                if (syc.this.sya.getMeasuredHeight() > 0) {
                    iYcx = syc.this.sya.getMeasuredHeight();
                }
                if (syc.this.sya.getMeasuredWidth() > 0) {
                    iYcx2 = syc.this.sya.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) syc.this.zb.getLayoutParams();
                layoutParams.topMargin = ((int) ((iYcx / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.ycx, 40.0f));
                layoutParams.leftMargin = ((int) ((iYcx2 / 2.0f) - com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.ycx, 20.0f));
                layoutParams.bottomMargin = (int) (((-iYcx) / 2.0f) + com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iYcx2) / 2.0f) + com.bytedance.sdk.component.adexpress.dj.ul.ycx(syc.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                syc.this.zb.setLayoutParams(layoutParams);
            }
        });
    }

    private void sya() {
        this.sya = new wwx(this.ycx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 50.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 40.0f);
        int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 20.0f);
        layoutParams.leftMargin = iYcx;
        layoutParams.setMarginStart(iYcx);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.sya, layoutParams);
        this.zb = new ImageView(this.ycx);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 78.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 78.0f));
        this.zb.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.ycx, "tt_splash_hand"));
        addView(this.zb, layoutParams2);
        TextView textView = new TextView(this.ycx);
        this.lt = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 10.0f);
        addView(this.lt, layoutParams3);
        this.lt.setVisibility(8);
    }

    private void dj() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.zb, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lt.syc.2
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallbackWithResult;
            private static char[] IAuthTabCallback = {32739, 32536, 32540, 32740};
            private static int onExtraCallback = -1184333940;
            private static boolean onWarmupCompleted = true;
            private static boolean onNavigationEvent = true;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 21;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 83 / 0;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws Throwable {
                int i2 = 2 % 2;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-127, -124, -125, -126, -127}, View.combineMeasuredStates(0, 0) + 127, objArr);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(syc.this.zb, ((String) objArr[0]).intern(), 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                syc.this.zb.setVisibility(0);
                int i3 = onExtraCallbackWithResult + 67;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                int i2 = 2 % 2;
                if (syc.this.lud) {
                    syc.this.sya.ycx();
                    int i3 = onExtraCallbackWithResult + 27;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 / 3;
                    }
                }
                syc.this.lud = !r0.lud;
                int i5 = onExtraCallbackWithResult + 19;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = IAuthTabCallback;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = $10 + 71;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $10 + 123;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, (ViewConfiguration.getPressedStateDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                                }
                                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 77 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6++;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 75 - (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                if (onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 63 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr6);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.zb, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.dj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(String str) {
        this.lt.setVisibility(0);
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
        wwx wwxVar = this.sya;
        if (wwxVar != null) {
            wwxVar.zb();
        }
        ImageView imageView = this.zb;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
