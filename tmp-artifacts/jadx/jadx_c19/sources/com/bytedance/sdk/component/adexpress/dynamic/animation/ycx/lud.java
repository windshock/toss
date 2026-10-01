package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends dj {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 16098;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 62154;
    private static char onExtraCallbackWithResult = 25679;
    private static char onNavigationEvent = 8010;
    private static int onWarmupCompleted;

    public lud(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String strThx = this.zb.thx();
        switch (strThx.hashCode()) {
            case 3029889:
                if (strThx.equals("both")) {
                    ycx(arrayList);
                    return arrayList;
                }
                break;
            case 3387192:
                Object[] objArr = new Object[1];
                a(new char[]{32536, 44958, 35075, 15524}, 4 - TextUtils.indexOf("", ""), objArr);
                strThx.equals(((String) objArr[0]).intern());
                break;
            case 483313230:
                if (strThx.equals("forwards")) {
                    int i3 = IAuthTabCallbackDefault + 73;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    dj(arrayList);
                    return arrayList;
                }
                break;
            case 1356771568:
                if (!(!strThx.equals("backwards"))) {
                    int i5 = onWarmupCompleted + 29;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    zb(arrayList);
                    return arrayList;
                }
                break;
            default:
                int i7 = IAuthTabCallbackDefault + 11;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                break;
        }
        sya(arrayList);
        return arrayList;
    }

    private void ycx(List<ObjectAnimator> list) {
        int i2 = 2 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.htf())).setDuration(((int) (this.zb.jc() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar = this.zb;
        ycxVar.lt(ycxVar.syc() << 1);
        list.add(ycx(duration));
        int i3 = onWarmupCompleted + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private void zb(List<ObjectAnimator> list) {
        int i2 = 2 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.htf())).setDuration((int) (this.zb.jc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.lud.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                lud.this.sya.setTranslationY(0.0f);
            }
        });
        list.add(ycx(duration));
        int i3 = onWarmupCompleted + 119;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 11;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = $10 + 21;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 58224;
            int i10 = i4;
            while (i10 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[c] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, scrollDefaultDelay, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i13 = i10;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 10 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10 = i13 + 1;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 16014), (Process.myPid() >> 22) + 14, Drawable.resolveOpacity(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i4 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i14 = $11 + 83;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i15 = 62 / 0;
            objArr[0] = str;
        }
    }

    private void sya(List<ObjectAnimator> list) {
        int i2 = 2 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.htf())).setDuration((int) (this.zb.jc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.lud.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                lud.this.sya.setTranslationY(0.0f);
            }
        });
        list.add(ycx(duration));
        int i3 = onWarmupCompleted + 5;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void dj(List<ObjectAnimator> list) {
        int i2 = 2 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.htf())).setDuration((int) (this.zb.jc() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(ycx(duration));
        int i3 = onWarmupCompleted + 109;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }
}
