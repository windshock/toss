package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerType;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinSdkSettings;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RuntimeEnvironmentProxy;
import o.SessionProcessorCaptureCallback;
import o.SetDetectableSize;
import o.decrementVideoUsage;
import o.getPreRenderJob;
import o.isInVideoUsage;
import o.readFully;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RuntimeEnvironmentProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = {27337, 27457, 27462, 27468, 27468, 27462, 27457, 27462, 27252, 27168, 27168, 27198, 27174, 27137, 27372, 27364, 27366, 27366, 27373, 27374, 27366, 27365, 27360, 27360, 27371};
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        String strOnExtraCallbackWithResult;
        int i7 = ~i5;
        int i8 = ~((~i4) | i7);
        int i9 = ~i6;
        int i10 = ~(i9 | i5);
        int i11 = ~(i7 | i6);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i4);
        int i14 = (~(i4 | i7)) | i10 | i11;
        int i15 = i6 + i5 + i2 + (2052055731 * i3) + (1687666023 * i);
        int i16 = i15 * i15;
        int i17 = (i6 * 1533266457) + 1248777597 + (i5 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (1533266057 * i2) + (706030027 * i3) + (1023530015 * i) + (i16 * (-2088042496));
        int i18 = (i6 * (-1966771951)) + 1000013824 + ((-1966771951) * i5) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i2) + (632946688 * i3) + ((-741212160) * i) + (2121465856 * i16) + (i17 * i17 * 1434255360);
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 3) {
            return onExtraCallback(objArr);
        }
        if (i18 == 4) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 5) {
            return onExtraCallbackWithResult(objArr);
        }
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents = (CreditHomeLargeBannerResponse.DualCtaContents) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i19 = 2 % 2;
        int i20 = onExtraCallback + 9;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 8, 157, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        setDetectableSize.onExtraCallback("banner_type", ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted)).name());
        setDetectableSize.onExtraCallback("log_type", creditHomeLargeBannerResponse.asInterface());
        Object[] objArr3 = new Object[1];
        a(new int[]{8, 5, 0, 0}, false, new byte[]{0, 1, 1, 0, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), dualCtaContents.onTransact());
        setDetectableSize.onExtraCallback("sub_title", dualCtaContents.IAuthTabCallbackDefault());
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonOnExtraCallback = dualCtaContents.onExtraCallback();
        if (ctaButtonOnExtraCallback != null) {
            int i22 = onExtraCallback + 21;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
            strOnExtraCallbackWithResult = ctaButtonOnExtraCallback.onExtraCallbackWithResult();
        } else {
            int i24 = onWarmupCompleted + 83;
            onExtraCallback = i24 % 128;
            int i25 = i24 % 2;
            strOnExtraCallbackWithResult = null;
        }
        Object[] objArr4 = new Object[1];
        a(new int[]{13, 12, 58, 0}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1}, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), strOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 35 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(attachapplovinsdk);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback(rally);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return appLovinSdkSettingsOnExtraCallback;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallback = onExtraCallback(rally, isinvideousage);
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{str, creditHomeLargeBannerResponse, dualCtaContents, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted, 698772846, -698772843);
        }
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unitOnNavigationEvent;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            int i3 = 59 / 0;
        } else {
            unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, dualCtaContents, str, creditHomeLargeBannerResponse);
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(addFixedPosition addfixedposition, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        removeObserverLocked removeobserverlocked = (removeObserverLocked) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{addfixedposition, sessionProcessorCaptureCallback}, iOnWarmupCompleted3, iOnWarmupCompleted, -1489337315, 1489337316);
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlocked;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{str, creditHomeLargeBannerResponse, dualCtaContents, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted, 247045663, -247045663);
        }
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(function1, dualCtaContents, str, creditHomeLargeBannerResponse);
        }
        onExtraCallback(function1, dualCtaContents, str, creditHomeLargeBannerResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {attachapplovinsdk};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        if (i3 == 0) {
            unit = (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -1327809692, 1327809696);
            int i4 = 76 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -1327809692, 1327809696);
        }
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(readfully, setorientationdegrees);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(readfully, setorientationdegrees);
        int i3 = onWarmupCompleted + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(rally, isinvideousage);
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return decrementvideousageOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = onWarmupCompleted(rally);
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 121;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Rally onNavigationEvent;

        public onExtraCallback(Rally rally) {
            this.onNavigationEvent = rally;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.ICustomTabsServiceStub();
            int i4 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Rally onNavigationEvent;

        public onWarmupCompleted(Rally rally) {
            this.onNavigationEvent = rally;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.ICustomTabsServiceStub();
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final Unit IAuthTabCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readfully, 0.0f, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        addFixedPosition addfixedposition = (addFixedPosition) objArr[0];
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{addfixedposition}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0.1f)), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(addfixedposition.IAuthTabCallback(), 0.1f)), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())}), 0L, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                    int i4 = 2 / 0;
                } else {
                    unitOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                }
                int i5 = onExtraCallback + 97;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents = (CreditHomeLargeBannerResponse.DualCtaContents) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 8, 157, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        setDetectableSize.onExtraCallback("banner_type", ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted)).name());
        setDetectableSize.onExtraCallback("log_type", creditHomeLargeBannerResponse.asInterface());
        Object[] objArr3 = new Object[1];
        a(new int[]{8, 5, 0, 0}, false, new byte[]{0, 1, 1, 0, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), dualCtaContents.onTransact());
        setDetectableSize.onExtraCallback("sub_title", dualCtaContents.IAuthTabCallbackDefault());
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonIAuthTabCallback = dualCtaContents.IAuthTabCallback();
        String strOnExtraCallbackWithResult = ctaButtonIAuthTabCallback != null ? ctaButtonIAuthTabCallback.onExtraCallbackWithResult() : null;
        Object[] objArr4 = new Object[1];
        a(new int[]{13, 12, 58, 0}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1}, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), strOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function1 function1, final CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, final String str, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) throws Throwable {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1652780L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda10
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = RuntimeEnvironmentProxy.onExtraCallback(str, creditHomeLargeBannerResponse, dualCtaContents, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 14, null);
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonIAuthTabCallback = dualCtaContents.IAuthTabCallback();
        if (ctaButtonIAuthTabCallback != null) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                strOnWarmupCompleted = ctaButtonIAuthTabCallback.onWarmupCompleted();
                int i3 = 30 / 0;
                if (strOnWarmupCompleted == null) {
                    int i4 = onExtraCallback + 35;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    strOnWarmupCompleted = "";
                }
            } else {
                strOnWarmupCompleted = ctaButtonIAuthTabCallback.onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                }
            }
        }
        function1.invoke(strOnWarmupCompleted);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Function1 function1, final CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, final String str, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) throws Throwable {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1652780L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda11
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 65;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent(str, creditHomeLargeBannerResponse, dualCtaContents, (SetDetectableSize) obj);
                    int i4 = 89 / 0;
                } else {
                    unitOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent(str, creditHomeLargeBannerResponse, dualCtaContents, (SetDetectableSize) obj);
                }
                int i5 = onNavigationEvent + 79;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 14, null);
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonOnExtraCallback = dualCtaContents.onExtraCallback();
        if (ctaButtonOnExtraCallback != null) {
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            strOnWarmupCompleted = ctaButtonOnExtraCallback.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = "";
            }
        }
        function1.invoke(strOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @NotNull final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        long jIPostMessageService_Parcel;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        addFixedPosition addfixedposition;
        float f;
        int i4;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        String strOnExtraCallbackWithResult;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2094655906);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onExtraCallback + 45;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditHomeLargeBannerResponse) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            int i8 = onExtraCallback + 7;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2094655906, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBanner (CreditHomeDualCtaBanner.kt:53)");
            }
            final CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents = (CreditHomeLargeBannerResponse.DualCtaContents) CreditHomeLargeBannerResponse.onNavigationEvent(-1313771003, zzgsa.onWarmupCompleted(), 1313771004, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, zzgsa.onWarmupCompleted());
            if (dualCtaContents == null) {
                int i10 = onWarmupCompleted + 111;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = onExtraCallback + 83;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 27;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            String str2 = str;
                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = creditHomeLargeBannerResponse;
                            Function1 function12 = function1;
                            int i16 = i;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {quirksExternalSyntheticBackport02, str2, creditHomeLargeBannerResponse2, function12, Integer.valueOf(i16), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                            Unit unit = (Unit) RuntimeEnvironmentProxy.IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 2018540160, -2018540155);
                            int i17 = onNavigationEvent + 83;
                            IAuthTabCallback = i17 % 128;
                            int i18 = i17 % 2;
                            return unit;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return;
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
            addFixedPosition addfixedpositionIAuthTabCallback = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setHoverListener.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (updateFocusedState) null, (Function2) null, 3, (Object) null);
            if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                int i13 = onWarmupCompleted + 5;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1375321939);
                jIPostMessageService_Parcel = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1375320851);
                jIPostMessageService_Parcel = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jIPostMessageService_Parcel, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f))));
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i15 = onExtraCallback + 101;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), (DefaultConstructorMarker) null)), y3externalsyntheticlambda02.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = setExtensionStrength.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.getInterfaceDescriptor(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i16 = onExtraCallback + 39;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            String strOnNavigationEvent = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? dualCtaContents.onNavigationEvent() : dualCtaContents.onWarmupCompleted();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), onextracallbackwithresult.getInterfaceDescriptor());
            if (StringsKt.endsWith$default(strOnNavigationEvent, ".json", false, 2, (Object) null)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-848574817);
                y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
                addfixedposition = addfixedpositionIAuthTabCallback;
                f = 0.0f;
                i3 = i2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinStarRatingView.IAuthTabCallback(strOnNavigationEvent, quirksExternalSyntheticBackport0OnWarmupCompleted4, false, false, Integer.MAX_VALUE, 0.0f, false, 0.0f, 0.0f, onextracallbackwithresult.getInterfaceDescriptor(), immediateFailedFuture.Companion.onWarmupCompleted(), false, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 805330944, 6, 6636);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                i3 = i2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
                addfixedposition = addfixedpositionIAuthTabCallback;
                f = 0.0f;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-848258028);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(strOnNavigationEvent, quirksExternalSyntheticBackport0OnWarmupCompleted4, 0L, (Function1) null, (Function1) null, (Function1) null, onextracallbackwithresult.getInterfaceDescriptor(), immediateFailedFuture.Companion.onWarmupCompleted(), (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 14155776, 316);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CaptureNoResponseQuirk.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-120.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-40.0f));
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
            final addFixedPosition addfixedposition2 = addfixedposition;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(addfixedposition2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 111;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = RuntimeEnvironmentProxy.onExtraCallbackWithResult(addfixedposition2, (SessionProcessorCaptureCallback) obj2);
                        int i21 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        return removeobserverlockedOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized);
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, (Function1) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult4, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.access100()), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), 7, (Object) null);
            component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult4, 0);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult4.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult4, quirksExternalSyntheticBackport0OnExtraCallback4);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult4.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult4.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult4.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(function0IAuthTabCallback4);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f), 0.0f, 8, (Object) null);
            String strOnTransact = dualCtaContents.onTransact();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = appLovinPostbackService.IAuthTabCallbackStub();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda03 = y3externalsyntheticlambda0;
            long jIAuthTabCallbackDefault = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6).IAuthTabCallbackDefault();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnTransact, quirksExternalSyntheticBackport0OnExtraCallback5, gethumanreadablenameIAuthTabCallbackStub, Long.valueOf(jIAuthTabCallbackDefault), 0L, 0L, null, null, null, Float.valueOf(f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult4, 0, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 8, (Object) null);
            String strIAuthTabCallbackDefault = dualCtaContents.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault == null) {
                int i18 = onWarmupCompleted + 87;
                onExtraCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 95 / 0;
                }
                strIAuthTabCallbackDefault = "";
            }
            getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda03, cameraCaptureResultEmptyCameraCaptureResult4, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i20 = onWarmupCompleted + 29;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(367774497);
                    jLongValue = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 72).ICustomTabsService();
                    i4 = 6;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(367774497);
                    i4 = 6;
                    jLongValue = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6).ICustomTabsService();
                }
            } else {
                i4 = 6;
                cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(367775457);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault, quirksExternalSyntheticBackport0OnExtraCallback6, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(f), null, null, 0L, 0, false, isrepeatingenabled.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult4, 0, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult4.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult4.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, f, 1, (Object) null);
            Rally rallyIAuthTabCallback = IAuthTabCallback(200, cameraCaptureResultEmptyCameraCaptureResult4, i4, 0);
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback7, rallyIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult4, 6, 2);
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonIAuthTabCallback = dualCtaContents.IAuthTabCallback();
            String str2 = (ctaButtonIAuthTabCallback == null || (strOnExtraCallbackWithResult = ctaButtonIAuthTabCallback.onExtraCallbackWithResult()) == null) ? "" : strOnExtraCallbackWithResult;
            int i21 = i3;
            int i22 = i21 & 112;
            boolean z = i22 == 32;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(creditHomeLargeBannerResponse);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(dualCtaContents);
            int i23 = i21 & 7168;
            if (i23 == 2048) {
                int i24 = onExtraCallback + 27;
                onWarmupCompleted = i24 % 128;
                boolean z2 = i24 % 2 != 0;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!(z2 | zOnExtraCallback | z | zOnExtraCallback2)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() throws Throwable {
                                int i25 = 2 % 2;
                                int i26 = IAuthTabCallback + 1;
                                onExtraCallback = i26 % 128;
                                int i27 = i26 % 2;
                                Function1 function12 = function1;
                                if (i27 != 0) {
                                    return RuntimeEnvironmentProxy.onNavigationEvent(function12, dualCtaContents, str, creditHomeLargeBannerResponse);
                                }
                                RuntimeEnvironmentProxy.onNavigationEvent(function12, dualCtaContents, str, creditHomeLargeBannerResponse);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0);
                        obj2 = function0;
                    }
                    Function0 function02 = (Function0) obj2;
                    CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonOnExtraCallback = dualCtaContents.onExtraCallback();
                    String strOnExtraCallbackWithResult2 = ctaButtonOnExtraCallback != null ? ctaButtonOnExtraCallback.onExtraCallbackWithResult() : null;
                    boolean z3 = i22 == 32;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(creditHomeLargeBannerResponse);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(dualCtaContents);
                    boolean z4 = i23 == 2048;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (!(zOnExtraCallback3 | z3 | zOnExtraCallback4 | z4)) {
                        Object obj3 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda6
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke() throws Throwable {
                                    int i25 = 2 % 2;
                                    int i26 = IAuthTabCallback + 71;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    Unit unitOnExtraCallbackWithResult = RuntimeEnvironmentProxy.onExtraCallbackWithResult(function1, dualCtaContents, str, creditHomeLargeBannerResponse);
                                    int i28 = onExtraCallbackWithResult + 73;
                                    IAuthTabCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function03);
                            obj3 = function03;
                        }
                        appendInfo.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -784402036, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0IAuthTabCallback, str2, function02, strOnExtraCallbackWithResult2, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult3, 0, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 784402037);
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitIAuthTabCallback = RuntimeEnvironmentProxy.IAuthTabCallback(quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i28 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    return unitIAuthTabCallback;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 11007;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1500;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    private static final AppLovinSdkSettings onExtraCallback(Rally rally) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Object[] objArr = {(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[0], 1646601245, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2, -1646601244), 200};
        AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(isMuted.onExtraCallback((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(0.0f), Float.valueOf(0.7f), new CreditHomeDualCtaBannerKt$.ExternalSyntheticLambda0()), Float.valueOf(1.1f), Float.valueOf(1.0f), new CreditHomeDualCtaBannerKt$.ExternalSyntheticLambda1());
        getVersionCode getversioncode = getVersionCode.MEDIUM;
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = isMuted.onWarmupCompleted(appLovinSdkSettingsOnTransact, getversioncode, getversioncode, (Function1) null, 4, (Object) null);
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return appLovinSdkSettingsOnWarmupCompleted;
    }

    private static final AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null);
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallback;
    }

    public static final Rally IAuthTabCallback(int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(404674317, i2, -1, "im.toss.feature.credit.ui.main.home.component.slideRally (CreditHomeDualCtaBanner.kt:202)");
                int i7 = 31 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(404674317, i2, -1, "im.toss.feature.credit.ui.main.home.component.slideRally (CreditHomeDualCtaBanner.kt:202)");
            }
        }
        Boolean bool = Boolean.FALSE;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 85;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Object[] objArr = {(Rally) obj};
                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                    if (i10 != 0) {
                        return (AppLovinSdkSettings) RuntimeEnvironmentProxy.IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 510200046, -510200044);
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, i5, bool, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 1572864, 24576, 16287);
        Unit unit = Unit.INSTANCE;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rallyOnExtraCallback);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeDualCtaBannerKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 17;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    decrementVideoUsage decrementvideousageOnNavigationEvent = RuntimeEnvironmentProxy.onNavigationEvent(rallyOnExtraCallback, (isInVideoUsage) obj);
                    if (i10 == 0) {
                        int i11 = 87 / 0;
                    }
                    return decrementvideousageOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            int i8 = onExtraCallback + 51;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onWarmupCompleted + 59;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i12 = onWarmupCompleted + 101;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return rallyOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01f0 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:9:0x002f, B:11:0x003d, B:12:0x006b, B:15:0x007d, B:17:0x008b, B:18:0x00b9, B:47:0x0177, B:49:0x018e, B:50:0x01c1, B:55:0x01e3, B:57:0x01f0, B:58:0x0223, B:40:0x0114, B:42:0x012b, B:43:0x015f), top: B:87:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0223 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        Object objOnExtraCallback;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 9;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812499), 35 - View.resolveSizeAndState(0, 0, 0), 14239 - (ViewConfiguration.getTapTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.alpha(0)), TextUtils.lastIndexOf("", '0') + 36, 14239 - TextUtils.indexOf("", "", 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i10 = $11 + 81;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i11 = $10 + 89;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, 17657 - Color.blue(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr4)).charValue();
                    int i13 = $11 + 31;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 % 3;
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback != null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.alpha(0)), 70 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getMode(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback).invoke(null, objArr5);
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 65 - (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSizeAndState(0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr52 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback != null) {
                }
                ((Method) objOnExtraCallback).invoke(null, objArr52);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i16 = $11 + 31;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr4, 0, cArr5, 0, i5);
                System.arraycopy(cArr5, 1, cArr4, i5 / i7, i7);
                System.arraycopy(cArr5, i7, cArr4, 1, i5 % i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i17 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i17, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i17);
            }
        }
        if (z) {
            char[] cArr7 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i18 = $11 + 79;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(trackGroupExternalSyntheticLambda0.onNavigationEvent + i5) >> 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr7;
        }
        if (i6 > 0) {
            int i19 = $11 + 105;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final decrementVideoUsage onExtraCallback(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
        onExtraCallback onextracallback = new onExtraCallback(rally);
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(Rally rally, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(rally);
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, creditHomeLargeBannerResponse, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 2018540160, -2018540155);
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(Rally rally) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (AppLovinSdkSettings) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{rally}, iOnWarmupCompleted3, iOnWarmupCompleted, 510200046, -510200044);
    }

    private static final removeObserverLocked onNavigationEvent(addFixedPosition addfixedposition, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (removeObserverLocked) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{addfixedposition, sessionProcessorCaptureCallback}, iOnWarmupCompleted3, iOnWarmupCompleted, -1489337315, 1489337316);
    }

    private static final Unit IAuthTabCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{str, creditHomeLargeBannerResponse, dualCtaContents, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted, 698772846, -698772843);
    }

    private static final Unit onWarmupCompleted(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{str, creditHomeLargeBannerResponse, dualCtaContents, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted, 247045663, -247045663);
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{attachapplovinsdk}, iOnWarmupCompleted3, iOnWarmupCompleted, -1327809692, 1327809696);
    }
}
