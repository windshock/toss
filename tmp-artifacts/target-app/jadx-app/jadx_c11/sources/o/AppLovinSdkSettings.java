package o;

import android.view.animation.Interpolator;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkSettings extends getEventService implements getCmpService {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private Boolean IAuthTabCallback;
    private int onExtraCallback;
    private Integer onExtraCallbackWithResult;
    private int onNavigationEvent;
    private Interpolator onWarmupCompleted;
    private final getTermsAndPrivacyPolicyFlowSettings IAuthTabCallbackStub = new getTermsAndPrivacyPolicyFlowSettings();
    private isVerboseLoggingEnabled IAuthTabCallbackDefault = isVerboseLoggingEnabled.OVERRIDE;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[isVerboseLoggingEnabled.values().length];
            try {
                iArr[isVerboseLoggingEnabled.SERIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isVerboseLoggingEnabled.PARALLEL.ordinal()] = 2;
                int i = onExtraCallback + 59;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = IAuthTabCallback + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i2) | i4);
        int i8 = ~((~i4) | i5);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i5) | i4));
        int i11 = i4 + i5 + i3 + (762724209 * i6) + (1201824936 * i);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i4) + 43253760 + (1339426419 * i5) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i3) + (1302855680 * i6) + (1514143744 * i) + (1905524736 * i12);
        int i14 = ((i4 * 162561953) - 555857873) + (i5 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i3 * 162560975) + (i6 * 701011807) + (i * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public final getTermsAndPrivacyPolicyFlowSettings IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getTermsAndPrivacyPolicyFlowSettings gettermsandprivacypolicyflowsettings = this.IAuthTabCallbackStub;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return gettermsandprivacypolicyflowsettings;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull isVerboseLoggingEnabled isverboseloggingenabled) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isverboseloggingenabled, "");
        this.onExtraCallback = 0;
        this.IAuthTabCallbackDefault = isverboseloggingenabled;
        int i4 = asBinder + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        appLovinSdkSettings.onExtraCallbackWithResult = Integer.valueOf(iIntValue);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = asBinder + 79;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinSdkSettings;
        }
        throw null;
    }

    public final AppLovinSdkSettings onWarmupCompleted(@NotNull Interpolator interpolator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        this.onWarmupCompleted = interpolator;
        if (this.onExtraCallbackWithResult == null) {
            int i2 = asBinder + 73;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = interpolator instanceof deprecated_dns;
                throw null;
            }
            if (interpolator instanceof deprecated_dns) {
                this.onExtraCallbackWithResult = Integer.valueOf(((deprecated_dns) interpolator).IAuthTabCallback());
            }
        }
        int i3 = asBinder + 33;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        appLovinSdkSettings.onNavigationEvent = iIntValue;
        if (i3 != 0) {
            return appLovinSdkSettings;
        }
        throw null;
    }

    public final AppLovinSdkSettings onExtraCallback(@NotNull getVersionCode getversioncode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getversioncode, "");
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = onNavigationEvent(new attachAppLovinSdk(new setUserIdentifier(getversioncode)));
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }

    public final AppLovinSdkSettings onNavigationEvent(@NotNull attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int i4 = onExtraCallback.onExtraCallbackWithResult[this.IAuthTabCallbackDefault.ordinal()];
        if (i4 == 1) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
            this.IAuthTabCallbackStub.onNavigationEvent(attachapplovinsdk, this.onExtraCallback);
            this.onExtraCallback += iOnExtraCallbackWithResult;
        } else if (i4 != 2) {
            int i5 = asBinder + 99;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                this.IAuthTabCallbackStub.IAuthTabCallback(attachapplovinsdk);
                throw null;
            }
            this.IAuthTabCallbackStub.IAuthTabCallback(attachapplovinsdk);
        } else {
            this.IAuthTabCallbackStub.onExtraCallback(attachapplovinsdk);
        }
        attachapplovinsdk.IAuthTabCallback(this.IAuthTabCallbackDefault);
        return this;
    }

    public final Integer access100() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 75;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
        return i5;
    }

    public final Interpolator IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Interpolator interpolator = this.onWarmupCompleted;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return interpolator;
        }
        throw null;
    }

    public final Boolean access000() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Boolean bool = this.IAuthTabCallback;
        int i5 = i3 + 9;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getTermsAndPrivacyPolicyFlowSettings gettermsandprivacypolicyflowsettings = this.IAuthTabCallbackStub;
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iIntValue = ((Integer) onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, 1996159218, new Object[]{this}, -1996159216, iOnExtraCallback3)).intValue();
        gettermsandprivacypolicyflowsettings.onExtraCallbackWithResult(Integer.valueOf(iIntValue), readTypedObject(), this.onNavigationEvent, Boolean.valueOf(ICustomTabsCallback()));
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Interpolator readTypedObject() {
        Interpolator interpolatorIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            interpolatorIAuthTabCallbackDefault = this.onWarmupCompleted;
            int i4 = 37 / 0;
            if (interpolatorIAuthTabCallbackDefault == null) {
                int i5 = i2 + 75;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                interpolatorIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                if (interpolatorIAuthTabCallbackDefault == null) {
                    interpolatorIAuthTabCallbackDefault = Address.onNavigationEvent.asBinder();
                }
            }
        } else {
            interpolatorIAuthTabCallbackDefault = this.onWarmupCompleted;
            if (interpolatorIAuthTabCallbackDefault == null) {
            }
        }
        int i6 = asBinder + 87;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return interpolatorIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Integer num = appLovinSdkSettings.onExtraCallbackWithResult;
        if (num != null) {
            int iIntValue2 = num.intValue();
            int i4 = asBinder + 45;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return Integer.valueOf(iIntValue2);
            }
            int i5 = 12 / 0;
            return Integer.valueOf(iIntValue2);
        }
        Integer numOnTransact = appLovinSdkSettings.onTransact();
        if (numOnTransact != null) {
            int i6 = asBinder + 79;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                numOnTransact.intValue();
                throw null;
            }
            iIntValue = numOnTransact.intValue();
        } else {
            iIntValue = 500;
        }
        return Integer.valueOf(iIntValue);
    }

    private final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            Boolean boolAsInterface = asInterface();
            if (boolAsInterface == null) {
                return true;
            }
            int i2 = asBinder + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return boolAsInterface.booleanValue();
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[PHI: r5
      0x0056: PHI (r5v2 java.lang.Integer) = (r5v1 java.lang.Integer), (r5v5 java.lang.Integer), (r5v9 java.lang.Integer) binds: [B:12:0x002a, B:15:0x002f, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int iIntValue;
        int iIAuthTabCallback;
        int i = 2 % 2;
        Integer numOnExtraCallback = attachapplovinsdk.onExtraCallback();
        if (numOnExtraCallback != null) {
            int i2 = asBinder + 15;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = numOnExtraCallback.intValue();
        } else {
            iIntValue = 0;
        }
        Interpolator interpolatorOnNavigationEvent = attachapplovinsdk.onNavigationEvent();
        if (interpolatorOnNavigationEvent == null && (interpolatorOnNavigationEvent = this.onWarmupCompleted) == null) {
            interpolatorOnNavigationEvent = IAuthTabCallbackDefault();
        }
        Integer numIAuthTabCallback = attachapplovinsdk.IAuthTabCallback();
        if (numIAuthTabCallback == null && (numIAuthTabCallback = this.onExtraCallbackWithResult) == null) {
            int i4 = onTransact + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            numIAuthTabCallback = onTransact();
            iIAuthTabCallback = numIAuthTabCallback == null ? interpolatorOnNavigationEvent instanceof deprecated_dns ? ((deprecated_dns) interpolatorOnNavigationEvent).IAuthTabCallback() : !(interpolatorOnNavigationEvent instanceof AppLovinWebViewActivityaExternalSyntheticLambda0) ? 500 : 1000 : numIAuthTabCallback.intValue();
        }
        return iIntValue + iIAuthTabCallback;
    }

    public final AppLovinSdkSettings onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((Integer) null);
        extraCallback();
        onExtraCallback(true);
        int i4 = asBinder + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return this;
    }

    public final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback();
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getEventService
    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return iOnExtraCallback;
    }

    public final void onExtraCallbackWithResult(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        this.IAuthTabCallbackStub.onExtraCallback(setcreativedebuggerenabled, f);
        int i4 = asBinder + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final int writeTypedObject() {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return ((Integer) onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, 1996159218, new Object[]{this}, -1996159216, iOnExtraCallback3)).intValue();
    }

    public final AppLovinSdkSettings onNavigationEvent(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (AppLovinSdkSettings) onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    public final AppLovinSdkSettings onExtraCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (AppLovinSdkSettings) onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, objArr, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }
}
