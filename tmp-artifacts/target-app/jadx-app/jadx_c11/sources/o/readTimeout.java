package o;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.attachAppLovinSdk;
import o.readTimeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class readTimeout {
    private static int asBinder = 1;
    private static int onTransact;
    private int onExtraCallbackWithResult = -1;
    private int IAuthTabCallback = -1;
    private int onWarmupCompleted = -1;
    private AnimateText.IAuthTabCallback IAuthTabCallbackStub = AnimateText.IAuthTabCallback.None;
    private Function1<? super AppLovinSdkSettings, Unit> onNavigationEvent = new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(AppLovinSdkSettings) obj};
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (i3 == 0) {
                return (Unit) readTimeout.onNavigationEvent(-1882104843, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, objArr, 1882104844, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
            }
            int i4 = 98 / 0;
            return (Unit) readTimeout.onNavigationEvent(-1882104843, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, objArr, 1882104844, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
        }
    };
    private Function1<? super AppLovinSdkSettings, Unit> onExtraCallback = new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = readTimeout.IAuthTabCallback((AppLovinSdkSettings) obj);
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }
    };

    public interface onWarmupCompleted {
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinSdkSettings);
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i6) | i7)) | i9;
        int i11 = (~(i6 | i7)) | i9;
        int i12 = ~(i8 | i);
        int i13 = i + i4 + i3 + (104229478 * i2) + ((-1414784667) * i5);
        int i14 = i13 * i13;
        int i15 = ((i * (-393484327)) - 513802240) + ((-393484327) * i4) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i3) + ((-1784676352) * i2) + ((-1146093568) * i5) + ((-1043988480) * i14);
        int i16 = ((i * 256725217) - 1927268364) + (i4 * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i3 * 256726089) + (i2 * (-1692676330)) + (i5 * (-87465523)) + (i14 * 964034560);
        if (i15 + (i16 * i16 * (-1055260672)) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i17 = 2 % 2;
        int i18 = onTransact + 19;
        asBinder = i18 % 128;
        int i19 = i18 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(655220864, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{appLovinSdkSettings}, -655220864, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
        int i20 = onTransact + 17;
        asBinder = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public abstract int IAuthTabCallback();

    public int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return -1;
        }
        int i3 = 70 / 0;
        return -1;
    }

    public abstract AnimateText.IAuthTabCallback onExtraCallback();

    public abstract int onExtraCallbackWithResult();

    public abstract AppLovinSdkSettings onNavigationEvent();

    public abstract AppLovinSdkSettings onWarmupCompleted();

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.onExtraCallbackWithResult;
        if (i3 != -1) {
            return i3;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onTransact + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (i != -1) {
            int i6 = i4 + 67;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            this.onExtraCallbackWithResult = i;
            if (i7 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        if (i5 != -1) {
            return i5;
        }
        int i6 = i3 + 45;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int asInterface() {
        int interfaceDescriptor;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceDescriptor = this.onWarmupCompleted;
            int i3 = 66 / 0;
            if (interfaceDescriptor == -1) {
                interfaceDescriptor = getInterfaceDescriptor();
            }
        } else {
            interfaceDescriptor = this.onWarmupCompleted;
            if (interfaceDescriptor == -1) {
            }
        }
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public final AnimateText.IAuthTabCallback access100() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        AnimateText.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStub;
        if (iAuthTabCallback != AnimateText.IAuthTabCallback.None) {
            return iAuthTabCallback;
        }
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onExtraCallback();
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final readTimeout IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(i);
        int i5 = onTransact + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return this;
    }

    public final readTimeout IAuthTabCallback(@NotNull Function1<? super AppLovinSdkSettings, Unit> function1) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
        int i4 = onTransact + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppLovinSdkSettings onTransact() {
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            appLovinSdkSettingsOnWarmupCompleted = onWarmupCompleted();
            this.onNavigationEvent.invoke(appLovinSdkSettingsOnWarmupCompleted);
            int i3 = 74 / 0;
        } else {
            appLovinSdkSettingsOnWarmupCompleted = onWarmupCompleted();
            this.onNavigationEvent.invoke(appLovinSdkSettingsOnWarmupCompleted);
        }
        int i4 = onTransact + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnWarmupCompleted;
    }

    public final AppLovinSdkSettings IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent();
        this.onExtraCallback.invoke(appLovinSdkSettingsOnNavigationEvent);
        int i4 = asBinder + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSettingsOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public interface asInterface {

        public static final class onNavigationEvent extends readTimeout implements asInterface {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            static {
                int i = onExtraCallback + 121;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(attachapplovinsdk);
                    obj.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
                int i3 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 115;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 41 / 0;
                }
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0 ? 44 : 40;
            }

            private onNavigationEvent() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.2f), fValueOf, null, 4, null};
                Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings2;
            }

            private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 8314;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 400;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$Slide$Char$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 45;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = readTimeout.asInterface.onNavigationEvent.onWarmupCompleted((attachAppLovinSdk) obj);
                        int i5 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.2f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettings2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                if (i3 == 0) {
                    int i4 = 71 / 0;
                }
                return iAuthTabCallback;
            }
        }

        public static final class onExtraCallback extends readTimeout implements asInterface {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 33;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
                int i4 = onWarmupCompleted + 85;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 100;
            }

            private onExtraCallback() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.3f), fValueOf, null, 4, null};
                Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onNavigationEvent + 25;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettings2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                attachapplovinsdk.IAuthTabCallback(300);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 51;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 34 / 0;
                }
                return unit;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$Slide$Line$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 119;
                        onNavigationEvent = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            readTimeout.asInterface.onExtraCallback.onNavigationEvent(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnNavigationEvent = readTimeout.asInterface.onExtraCallback.onNavigationEvent(attachapplovinsdk);
                        int i4 = onNavigationEvent + 31;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return unitOnNavigationEvent;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.3f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettings2;
                }
                throw null;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Line;
                int i4 = onWarmupCompleted + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }
        }
    }

    public interface IAuthTabCallbackStubProxy {

        public static final class onWarmupCompleted extends readTimeout implements IAuthTabCallbackStubProxy {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onExtraCallback + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 93;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 49;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 96 / 0;
                }
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 91;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return 40;
                }
                throw null;
            }

            private onWarmupCompleted() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf = Float.valueOf(2.0f);
                    Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(2.0f), (Function1) null, 5, (Object) null), Float.valueOf(0.2f), fValueOf, null, 5, null};
                    Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 7};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr3 = {isMuted.onNavigationEvent(appLovinSdkSettings2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.2f), fValueOf2, null, 4, null};
                    Object[] objArr4 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr3, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr4, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                AppLovinSdkSettings appLovinSdkSettings3 = (AppLovinSdkSettings) objOnExtraCallbackWithResult;
                int i3 = onNavigationEvent + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return appLovinSdkSettings3;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 20830;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 400;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$SlideFast$Char$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 17;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallback = readTimeout.IAuthTabCallbackStubProxy.onWarmupCompleted.onExtraCallback((attachAppLovinSdk) obj);
                        int i5 = onWarmupCompleted + 13;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallback;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.2f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onNavigationEvent + 1;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettings2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                int i4 = onNavigationEvent + 101;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent extends readTimeout implements IAuthTabCallbackStubProxy {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 119;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
                int i4 = onWarmupCompleted + 119;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 99 / 0;
                }
                return unitOnNavigationEvent;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 111;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 41 / 0;
                }
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 80 / 0;
                }
                return 100;
            }

            private onNavigationEvent() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf = Float.valueOf(2.0f);
                    Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(2.0f), (Function1) null, 2, (Object) null), Float.valueOf(0.3f), fValueOf, null, 5, null};
                    Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 47};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr3 = {isMuted.onNavigationEvent(appLovinSdkSettings2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.3f), fValueOf2, null, 4, null};
                    Object[] objArr4 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr3, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr4, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                return (AppLovinSdkSettings) objOnExtraCallbackWithResult;
            }

            private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 23168;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 300;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 35;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$SlideFast$Line$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 125;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallbackWithResult = readTimeout.IAuthTabCallbackStubProxy.onNavigationEvent.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                        int i5 = onExtraCallback + 61;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.3f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onWarmupCompleted + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettings2;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Line;
                int i4 = onWarmupCompleted + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }
        }
    }

    public interface IAuthTabCallbackDefault {

        public static final class IAuthTabCallback extends readTimeout implements IAuthTabCallbackDefault {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 31;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 49 / 0;
                }
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onWarmupCompleted + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2 != 0 ? 28 : 20;
                int i5 = i2 + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return i4;
                }
                throw null;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 17;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return 30;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
                Float fValueOf3 = Float.valueOf(0.5f);
                int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                Object[] objArr = {isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -570811141, new Object[]{appLovinSdkSettingsOnNavigationEvent, fValueOf3, fValueOf, null, 4, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2), fValueOf3, fValueOf, null, 4, null), Float.valueOf(-90.0f), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(0.9f), fValueOf2, null, 4, null), 20};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onWarmupCompleted + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings2;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 30471;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 250;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$Roll$Char$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 121;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnNavigationEvent = readTimeout.IAuthTabCallbackDefault.IAuthTabCallback.onNavigationEvent((attachAppLovinSdk) obj);
                        int i5 = onNavigationEvent + 55;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnNavigationEvent;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.45f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(isMuted.asBinder(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), null, Float.valueOf(0.9f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null);
                int i2 = onExtraCallback + 25;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                int i4 = onExtraCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }
        }
    }

    public interface IAuthTabCallback_Parcel {

        public static final class onWarmupCompleted extends readTimeout implements IAuthTabCallback_Parcel {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = onNavigationEvent + 35;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback(attachapplovinsdk);
                }
                IAuthTabCallback(attachapplovinsdk);
                throw null;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 == 0 ? 58 : 20;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 == 0 ? 120 : 60;
            }

            private onWarmupCompleted() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf = Float.valueOf(0.0f);
                    Object[] objArr = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(2.0f), (Function1) null, 2, (Object) null), Float.valueOf(0.25f), fValueOf, null, 4, null), 109};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr2 = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettings2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.25f), fValueOf2, null, 4, null), 40};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                return (AppLovinSdkSettings) objOnExtraCallbackWithResult;
            }

            private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                attachapplovinsdk.IAuthTabCallback(250);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 61;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStubProxy = isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$SlideX$Line$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 3;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallbackWithResult = readTimeout.IAuthTabCallback_Parcel.onWarmupCompleted.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                        int i5 = onWarmupCompleted + 119;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.25f), null, 5, null);
                int i2 = onExtraCallbackWithResult + 103;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettingsIAuthTabCallbackStubProxy;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Line;
                int i4 = onExtraCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }
        }
    }

    public interface onTransact {

        public static final class onExtraCallback extends readTimeout implements onTransact {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 95;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 59 / 0;
                }
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onExtraCallbackWithResult(attachapplovinsdk);
                }
                onExtraCallbackWithResult(attachapplovinsdk);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 87;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 52 / 0;
                }
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 20;
            }

            private onExtraCallback() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.IAuthTabCallback(), 550);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(1.2f), fValueOf, null, 4, null};
                Object[] objArr2 = {isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.1f), Float.valueOf(0.5f), null, 4, null), Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 20};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                throw null;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                attachapplovinsdk.IAuthTabCallback(150);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 95;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$RollBounce$Char$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 113;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnNavigationEvent = readTimeout.onTransact.onExtraCallback.onNavigationEvent((attachAppLovinSdk) obj);
                        int i5 = IAuthTabCallback + 5;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.75f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.9f), null, 5, null);
                int i2 = IAuthTabCallback + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsAsBinder;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                if (i3 != 0) {
                    int i4 = 32 / 0;
                }
                return iAuthTabCallback;
            }
        }

        public static final class onNavigationEvent extends readTimeout implements onTransact {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            static {
                int i = onExtraCallbackWithResult + 63;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallback(attachapplovinsdk);
                }
                onExtraCallback(attachapplovinsdk);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0 ? 58 : 120;
            }

            private onNavigationEvent() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.IAuthTabCallback(), 550);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(2.0f), fValueOf, null, 4, null};
                Object[] objArr2 = {isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.1f), Float.valueOf(0.5f), null, 4, null), Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 20};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onExtraCallback + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 23;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 17022;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
                    i = 250;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.anim.text.preset.AnimateTextMotionPreset$RollBounce$Line$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            readTimeout.onTransact.onNavigationEvent.onExtraCallbackWithResult(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = readTimeout.onTransact.onNavigationEvent.onExtraCallbackWithResult(attachapplovinsdk);
                        int i4 = onWarmupCompleted + 25;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 41 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.75f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.9f), null, 5, null);
                int i2 = IAuthTabCallback + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsAsBinder;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Line;
                int i4 = IAuthTabCallback + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }
        }
    }

    public interface onNavigationEvent {

        public static final class IAuthTabCallback extends readTimeout implements onNavigationEvent {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 1;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 75 / 0;
                }
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            private IAuthTabCallback() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 200};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 115;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                AppLovinSdkSettings appLovinSdkSettings;
                Float f;
                Float fValueOf;
                Function1 function1;
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 17;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    f = null;
                    fValueOf = Float.valueOf(0.0f);
                    function1 = null;
                    i = 2;
                } else {
                    appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    f = null;
                    fValueOf = Float.valueOf(0.0f);
                    function1 = null;
                    i = 5;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(appLovinSdkSettings, f, fValueOf, function1, i, (Object) null);
                int i4 = IAuthTabCallback + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Line;
                int i4 = IAuthTabCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }
        }
    }

    public interface asBinder {

        public static final class IAuthTabCallback extends readTimeout implements asBinder {
            public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 31;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            @Override // o.readTimeout
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            @Override // o.readTimeout
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallback = i2 % 128;
                return i2 % 2 == 0 ? 62 : 30;
            }

            private IAuthTabCallback() {
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.IAuthTabCallback(), 550);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(15.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 100};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onWarmupCompleted + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            @Override // o.readTimeout
            public AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 200), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null);
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.readTimeout
            public AnimateText.IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnimateText.IAuthTabCallback iAuthTabCallback = AnimateText.IAuthTabCallback.Char;
                int i4 = onExtraCallback + 27;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return iAuthTabCallback;
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1882104843, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{appLovinSdkSettings}, 1882104844, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(655220864, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{appLovinSdkSettings}, -655220864, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }
}
