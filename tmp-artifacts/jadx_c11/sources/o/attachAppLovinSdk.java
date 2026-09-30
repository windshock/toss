package o;

import android.view.View;
import android.view.animation.Interpolator;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.attachAppLovinSdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class attachAppLovinSdk {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private isVerboseLoggingEnabled IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final WeakHashMap<View, AppLovinSdkUtils> asBinder;
    private final isCreativeDebuggerEnabled asInterface;
    private Interpolator onExtraCallback;
    private Boolean onExtraCallbackWithResult;
    private Integer onNavigationEvent;
    private Integer onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8 | (~i))) | (~(i6 | i5 | i));
        int i10 = (~(i8 | i)) | (~(i8 | i6));
        int i11 = (~(i | i5)) | i6;
        int i12 = i6 + i5 + i4 + (1661237432 * i2) + (961048624 * i3);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i6) - 281083904) + ((-1329838950) * i5) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i4) + ((-1559232512) * i2) + (1553989632 * i3) + (2020540416 * i13);
        int i15 = (i6 * (-2040814728)) + 92927091 + (i5 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i4 * (-2040814133)) + (i2 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        if (i16 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        boolean z = false;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        setCreativeDebuggerEnabled<?> setcreativedebuggerenabled = (setCreativeDebuggerEnabled) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallbackStub;
        int i19 = i18 + 71;
        onTransact = i19 % 128;
        if (i19 % 2 != 0 ? (4 & iIntValue) == 0 : (4 & iIntValue) == 0) {
            z = zBooleanValue;
        } else {
            int i20 = i18 + 43;
            onTransact = i20 % 128;
            int i21 = i20 % 2;
        }
        attachapplovinsdk.onExtraCallback(setcreativedebuggerenabled, fFloatValue, z);
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk, setCreativeDebuggerEnabled setcreativedebuggerenabled, float f, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk, setcreativedebuggerenabled, f, view);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
        int i4 = IAuthTabCallbackStub + 107;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public attachAppLovinSdk(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        this.asInterface = iscreativedebuggerenabled;
        this.IAuthTabCallbackDefault = -1;
        this.IAuthTabCallback = isVerboseLoggingEnabled.OVERRIDE;
        this.asBinder = new WeakHashMap<>();
    }

    public final isCreativeDebuggerEnabled asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        isCreativeDebuggerEnabled iscreativedebuggerenabled = this.asInterface;
        int i5 = i2 + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return iscreativedebuggerenabled;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        attachapplovinsdk.onNavigationEvent = num;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallback() {
        Integer num;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            num = this.onNavigationEvent;
            int i4 = 25 / 0;
        } else {
            num = this.onNavigationEvent;
        }
        int i5 = i3 + 61;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Interpolator onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Interpolator interpolator = this.onExtraCallback;
        int i5 = i2 + 103;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return interpolator;
    }

    public final void onNavigationEvent(@Nullable Interpolator interpolator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = interpolator;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }

    public final Integer IAuthTabCallback() {
        Integer num;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.onWarmupCompleted;
            int i4 = 27 / 0;
        } else {
            num = this.onWarmupCompleted;
        }
        int i5 = i2 + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return num;
    }

    public final void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = num;
        int i5 = i2 + 93;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = bool;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Boolean bool = this.onExtraCallbackWithResult;
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallbackDefault;
        int i6 = i3 + 63;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 119;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        this.IAuthTabCallbackDefault = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 103;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void IAuthTabCallback(@NotNull isVerboseLoggingEnabled isverboseloggingenabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isverboseloggingenabled, "");
            this.IAuthTabCallback = isverboseloggingenabled;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(isverboseloggingenabled, "");
        this.IAuthTabCallback = isverboseloggingenabled;
        int i3 = IAuthTabCallbackStub + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
    }

    public final isVerboseLoggingEnabled onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        isVerboseLoggingEnabled isverboseloggingenabled = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return isverboseloggingenabled;
    }

    public final int onTransact() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onTransact + 111;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Integer num = this.onNavigationEvent;
        int iIntValue2 = 0;
        if (num != null) {
            int i5 = i3 + 9;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                num.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = this.onWarmupCompleted;
        if (num2 != null) {
            int i6 = onTransact + 57;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int iIntValue3 = num2.intValue();
                int i7 = 6 / 0;
                iIntValue2 = iIntValue3;
            } else {
                iIntValue2 = num2.intValue();
            }
        }
        return iIntValue + iIntValue2;
    }

    public final attachAppLovinSdk IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.asInterface, Float.valueOf(f)};
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            isCreativeDebuggerEnabled.onWarmupCompleted(1476872107, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -1476872107, objArr, iOnWarmupCompleted);
            int i3 = 60 / 0;
        } else {
            Object[] objArr2 = {this.asInterface, Float.valueOf(f)};
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            isCreativeDebuggerEnabled.onWarmupCompleted(1476872107, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted4, -1476872107, objArr2, iOnWarmupCompleted3);
        }
        int i4 = onTransact + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final attachAppLovinSdk onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface.IAuthTabCallback(Float.valueOf(f));
            int i3 = 71 / 0;
        } else {
            this.asInterface.IAuthTabCallback(Float.valueOf(f));
        }
        int i4 = onTransact + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unit;
    }

    public final attachAppLovinSdk onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = Integer.valueOf(i);
        if (i4 != 0) {
            return this;
        }
        throw null;
    }

    public final attachAppLovinSdk IAuthTabCallback(@NotNull Interpolator interpolator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        this.onExtraCallback = interpolator;
        if (this.onWarmupCompleted == null && !(!(interpolator instanceof deprecated_dns))) {
            int i4 = onTransact + 43;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback(((deprecated_dns) interpolator).IAuthTabCallback());
        }
        return this;
    }

    public final attachAppLovinSdk IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = Integer.valueOf(i);
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        return this;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        attachapplovinsdk.onExtraCallbackWithResult = Boolean.valueOf(zBooleanValue);
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return attachapplovinsdk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk, setCreativeDebuggerEnabled setcreativedebuggerenabled, float f, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            attachapplovinsdk.onExtraCallbackWithResult(setcreativedebuggerenabled, f);
            unit = Unit.INSTANCE;
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            attachapplovinsdk.onExtraCallbackWithResult(setcreativedebuggerenabled, f);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        final setCreativeDebuggerEnabled<?> setcreativedebuggerenabled = (setCreativeDebuggerEnabled) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        if (setcreativedebuggerenabled instanceof AppLovinWebViewActivity) {
            int i4 = IAuthTabCallbackStub + 115;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                ((AppLovinWebViewActivity) setcreativedebuggerenabled).ICustomTabsCallback().isLaidOut();
                throw null;
            }
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) setcreativedebuggerenabled;
            if (!appLovinWebViewActivity.ICustomTabsCallback().isLaidOut() && appLovinWebViewActivity.ICustomTabsCallback().isLayoutRequested()) {
                View viewICustomTabsCallback = appLovinWebViewActivity.ICustomTabsCallback();
                AppLovinSdkUtils appLovinSdkUtils = attachapplovinsdk.asBinder.get(viewICustomTabsCallback);
                if (appLovinSdkUtils != null) {
                    viewICustomTabsCallback.removeOnLayoutChangeListener(appLovinSdkUtils);
                }
                AppLovinSdkUtils appLovinSdkUtils2 = new AppLovinSdkUtils(new Function1() { // from class: im.toss.tds.foundation.anim.rally.MotionEvaluator$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 57;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnExtraCallback = attachAppLovinSdk.onExtraCallback(this.f$0, setcreativedebuggerenabled, fFloatValue, (View) obj);
                        int i8 = onExtraCallbackWithResult + 91;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 43 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                });
                attachapplovinsdk.asBinder.put(viewICustomTabsCallback, appLovinSdkUtils2);
                viewICustomTabsCallback.addOnLayoutChangeListener(appLovinSdkUtils2);
                return null;
            }
        }
        attachapplovinsdk.onExtraCallbackWithResult(setcreativedebuggerenabled, fFloatValue);
        int i5 = IAuthTabCallbackStub + 83;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, float f) {
        int i = 2 % 2;
        if (onTransact() > 0) {
            Integer num = this.onNavigationEvent;
            int iIntValue = num != null ? num.intValue() : 0;
            float f2 = iIntValue;
            float fOnTransact = f2 / onTransact();
            if (f > fOnTransact || !Intrinsics.areEqual(this.onExtraCallbackWithResult, Boolean.FALSE)) {
                if (f > fOnTransact) {
                    float fOnTransact2 = onTransact();
                    int iOnTransact = onTransact() - iIntValue;
                    onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, setcreativedebuggerenabled, Float.valueOf(iOnTransact > 0 ? ((fOnTransact2 * f) - f2) / iOnTransact : 1.0f), false, 4, null}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -471763898, 471763901);
                    return;
                }
                return;
            }
            int i2 = onTransact + 97;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, setcreativedebuggerenabled, Float.valueOf(1.0f), true, 5, null}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -471763898, 471763901);
                return;
            } else {
                onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, setcreativedebuggerenabled, Float.valueOf(0.0f), false, 4, null}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -471763898, 471763901);
                return;
            }
        }
        if (f == 0.0f) {
            int i3 = onTransact + 111;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            f = 0.0f;
        }
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, setcreativedebuggerenabled, Float.valueOf(f), false, 4, null}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -471763898, 471763901);
        int i5 = onTransact + 111;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.asInterface.access000();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.asInterface.access000();
        int i3 = onTransact + 41;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1 r3
      0x001f: PHI (r1v5 o.isCreativeDebuggerEnabled) = (r1v4 o.isCreativeDebuggerEnabled), (r1v7 o.isCreativeDebuggerEnabled) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r3v1 android.view.animation.Interpolator) = (r3v0 android.view.animation.Interpolator), (r3v3 android.view.animation.Interpolator) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, float f, boolean z) {
        isCreativeDebuggerEnabled iscreativedebuggerenabled;
        Interpolator interpolator;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            iscreativedebuggerenabled = this.asInterface;
            interpolator = this.onExtraCallback;
            int i4 = 45 / 0;
            if (interpolator != null) {
                int i5 = i3 + 25;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                f = interpolator.getInterpolation(f);
                int i7 = onTransact + 23;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 2;
                }
            }
        } else {
            iscreativedebuggerenabled = this.asInterface;
            interpolator = this.onExtraCallback;
            if (interpolator != null) {
            }
        }
        Float fOnNavigationEvent = iscreativedebuggerenabled.onNavigationEvent(f, setcreativedebuggerenabled.onWarmupCompleted(this.asInterface), z);
        if (fOnNavigationEvent != null) {
            setcreativedebuggerenabled.onExtraCallbackWithResult(this.asInterface, fOnNavigationEvent.floatValue());
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{attachapplovinsdk}, iOnWarmupCompleted2, -367941913, 367941915);
    }

    static /* synthetic */ void IAuthTabCallback(attachAppLovinSdk attachapplovinsdk, setCreativeDebuggerEnabled setcreativedebuggerenabled, float f, boolean z, int i, Object obj) {
        Object[] objArr = {attachapplovinsdk, setcreativedebuggerenabled, Float.valueOf(f), Boolean.valueOf(z), Integer.valueOf(i), obj};
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -471763898, 471763901);
    }

    public final attachAppLovinSdk IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return (attachAppLovinSdk) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1329795186, 1329795187);
    }

    public final void onExtraCallback(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, float f) {
        Object[] objArr = {this, setcreativedebuggerenabled, Float.valueOf(f)};
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 890616228, -890616224);
    }

    public final void onExtraCallback(@Nullable Integer num) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, num}, iOnWarmupCompleted2, -341507598, 341507598);
    }
}
