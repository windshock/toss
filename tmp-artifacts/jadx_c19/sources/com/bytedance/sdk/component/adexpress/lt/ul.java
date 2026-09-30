package com.bytedance.sdk.component.adexpress.lt;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul extends thx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private AnimatorSet sya;
    private TextView ycx;
    private View zb;
    private static char[] onWarmupCompleted = {32510, 32491, 32495, 32503};
    private static int onExtraCallbackWithResult = -1184334177;
    private static boolean onExtraCallback = true;
    private static boolean IAuthTabCallback = true;

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    protected void ycx(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public ul(Context context) {
        super(context);
        this.sya = new AnimatorSet();
        zb(context);
    }

    private void zb(Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View viewYcx = com.bytedance.sdk.component.adexpress.sya.ycx.ycx(context);
        this.zb = viewYcx;
        addView(viewYcx);
        setClipChildren(false);
        this.ycx = (TextView) findViewById(2097610748);
        int i5 = onNavigationEvent + 55;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setButtonText(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            if (this.ycx != null) {
                int i5 = i3 + 75;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i7 = IAuthTabCallbackStub + 55;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                this.ycx.setText(str);
                if (i8 != 0) {
                    int i9 = 58 / 0;
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    private void dj() throws Throwable {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.zb, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        Object[] objArr = new Object[1];
        b(null, new byte[]{-127, -124, -125, -126, -127}, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.zb, ((String) objArr[0]).intern(), 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.sya.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.sya.setDuration(1000L);
        this.sya.start();
        int i3 = IAuthTabCallbackStub + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    public void ycx() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        dj();
        int i5 = IAuthTabCallbackStub + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    public void zb() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.sya.cancel();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 99;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 77 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
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
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 77, Color.rgb(0, 0, 0) + 16798168, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 75 - TextUtils.indexOf("", ""), 16037 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getTrimmedLength("") + 63, 12214 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
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
        int i8 = $11 + 113;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }
}
