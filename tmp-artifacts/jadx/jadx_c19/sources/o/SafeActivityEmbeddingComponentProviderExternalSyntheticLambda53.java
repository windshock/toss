package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53;
import o.getPrivacyDestinationUri;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u3;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import o.y1b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 61502;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 1626;
    private static char onNavigationEvent = 666;
    private static char onWarmupCompleted = 16958;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.values().length];
            try {
                iArr[SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED.ordinal()] = 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE.ordinal()] = 3;
                int i5 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i7 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        boolean z;
        int i8;
        int i9 = ~i4;
        int i10 = ~((~i7) | i9);
        int i11 = ~(i9 | i2);
        int i12 = i10 | i11;
        int i13 = i11 | i7;
        int i14 = ~(i9 | i7);
        int i15 = i4 + i7 + i6 + (1577873432 * i5) + (977123338 * i3);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1177406726)) + 1326046462 + (i7 * (-1177405720)) + (i12 * 503) + (i13 * (-503)) + (i14 * 503) + ((-1177406223) * i6) + (1546282648 * i5) + ((-1884272278) * i3) + (i16 * 70909952);
        switch ((((-1026819430) * i4) - 865599488) + ((-647756440) * i7) + (i12 * 189531495) + ((-189531495) * i13) + (189531495 * i14) + ((-837287936) * i6) + ((-767557632) * i5) + (1290797056 * i3) + ((-539361280) * i16) + (i17 * i17 * 451280896)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onTransact(objArr);
            default:
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3) objArr[0];
                AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                        int i19 = IAuthTabCallbackDefault + 33;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    iIntValue |= i8;
                }
                if ((iIntValue & 19) != 18) {
                    int i21 = onExtraCallback + 61;
                    IAuthTabCallbackDefault = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 5 % 5;
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-123881894, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:97)");
                    }
                    int i23 = IAuthTabCallback.IAuthTabCallback[safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal()];
                    if (i23 != 1) {
                        int i24 = onExtraCallback + 5;
                        IAuthTabCallbackDefault = i24 % 128;
                        int i25 = i24 % 2;
                        if (i23 != 2 && i23 != 3) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1208585705);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1188134585);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{58246, 59831, 24777, 40375, 39153, 51019, 4408, 7792, 7045, 31959, 8608, 13825, 23403, 15417, 24256, 6560, 18628, 42635, 25236, 23058, 58882, 10491, 47115, 47269, 49908, 24960, 61971, 37589, 12373, 3242, 2424, 31928, 34820, 6914, 3215, 14635, 27589, 55407, 64019, 4346, 17643, 21958}, 42 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
                        appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 18) & 3670016) | 6, 62);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1188473477);
                        Object[] objArr3 = new Object[1];
                        a(new char[]{58246, 59831, 24777, 40375, 39153, 51019, 4408, 7792, 7045, 31959, 8608, 13825, 23403, 15417, 24256, 6560, 18628, 42635, 25236, 23058, 58882, 10491, 28141, 1514, 9209, 26267, 39354, 18383, 64994, 21997, 10837, 52580, 45731, 44858, 25451, 27202, 31201, 55235, 35502, 38364, 28763, 33899, 25105, 30916, 41485, 60172, 9209, 26267, 6021, 2862, 16658, 48977, 25836, 19471}, (-16777163) - Color.rgb(0, 0, 0), objArr3);
                        appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr3[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 6, 126);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                Unit unit = Unit.INSTANCE;
                int i26 = IAuthTabCallbackDefault + 117;
                onExtraCallback = i26 % 128;
                int i27 = i26 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface();
        int i5 = IAuthTabCallbackDefault + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        if (i6 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1205883299, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1205883298);
        }
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 57;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        y1a y1aVar = (y1a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = onExtraCallback + 35;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(new Object[0], iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 682105282, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -682105279);
        int i5 = onExtraCallback + 87;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1))};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 577431712, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -577431710);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 123;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, String str, String str2, String str3, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 121;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, str, str2, str3, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -850584653);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 73;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        onExtraCallback = i3 % 128;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i3 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i5 = IAuthTabCallbackDefault + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallbackWithResult(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 9;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onNavigationEvent(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 81;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i5 = IAuthTabCallbackDefault + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, String str, String str2, String str3, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 119;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, str, str2, str3, function0, function02, function03, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackDefault + 109;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 22 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 92 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(new Object[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1384872870, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1384872870);
            int i6 = 76 / 0;
        } else {
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(new Object[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnNavigationEvent3, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1384872870, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, -1384872870);
        }
        int i7 = IAuthTabCallbackDefault + 17;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02);
        int i5 = IAuthTabCallbackDefault + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 19;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, Function0 function0, Function0 function02, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(str, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(str, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unit2;
    }

    private static final Unit onNavigationEvent() {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i4 = 19 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = IAuthTabCallbackDefault + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit asInterface() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i2 & 6) == 0) {
            int i6 = IAuthTabCallbackDefault + 35;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i8 = onExtraCallback + 75;
                IAuthTabCallbackDefault = i8 % 128;
                i4 = i8 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i9 = onExtraCallback + 121;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1270244836, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:65)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_result_cta_confirm, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = IAuthTabCallback + 17;
                            onExtraCallbackWithResult = i11 % 128;
                            Object obj3 = null;
                            if (i11 % 2 == 0) {
                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallback(function0);
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallback(function0);
                            int i12 = IAuthTabCallback + 49;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj2 = function02;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 12582912, i3 & 14, 886);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, Function0 function0, Function0 function02) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 == SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED) {
            function0.invoke();
            int i5 = IAuthTabCallbackDefault + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 == SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE) {
            int i7 = onExtraCallback + 53;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                function02.invoke();
                int i8 = 39 / 0;
            } else {
                function02.invoke();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallbackDefault + 85;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, final Function0 function0, final Function0 function02, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i6 = onExtraCallback + 83;
                int i7 = i6 % 128;
                IAuthTabCallbackDefault = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 63;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i11 = onExtraCallback + 29;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1900440086, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:72)");
            }
            Object obj2 = null;
            if (str.length() == 0) {
                int i13 = onExtraCallback + 123;
                IAuthTabCallbackDefault = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(248966424);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    obj2.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(248966424);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(248373487);
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2)) {
                    int i14 = IAuthTabCallbackDefault + 107;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 10 / 0;
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function03 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda4
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i16 = 2 % 2;
                                    int i17 = onWarmupCompleted + 47;
                                    onNavigationEvent = i17 % 128;
                                    int i18 = i17 % 2;
                                    Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02};
                                    int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                                    int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                                    Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 202079767, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -202079761);
                                    int i19 = onWarmupCompleted + 103;
                                    onNavigationEvent = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        return unit;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                            obj = function03;
                        }
                        u3Var.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnExtraCallback, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 3072, 54);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        u3Var.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnExtraCallback, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 3072, 54);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 119;
                IAuthTabCallbackDefault = i16 % 128;
                if (i16 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onExtraCallback + 35;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 7;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(899380900, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:93)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(899380900, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:93)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, ForwardingCameraControl.onExtraCallback(-123881894, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 41;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onNavigationEvent + 107;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallback + 39;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        int i12 = 12435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), i11, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i13 = $11 + 67;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 2 / 2;
                    }
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16014), 14 - View.getDefaultSize(0, 0), 19901 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static final Unit onNavigationEvent(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i2 & 6) == 0) {
            int i6 = IAuthTabCallbackDefault + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i7 = IAuthTabCallbackDefault + 71;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        boolean z = false;
        if ((i3 & 19) != 18) {
            int i9 = onExtraCallback + 59;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1194147055, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:112)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, str, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 25;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onExtraCallback + 85;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        Object obj = null;
        if ((i2 & 6) == 0) {
            int i5 = IAuthTabCallbackDefault + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                obj.hashCode();
                throw null;
            }
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1615658830, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailResultContent.kt:120)");
            }
            if (str.length() == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1606617040);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1606346038);
                Object[] objArr = {y1externalsyntheticlambda3, str, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 6};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 79;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i3;
        int i4;
        String str;
        int i5;
        String str2;
        String str3;
        String str4;
        int i6;
        int i7;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final String strIAuthTabCallback;
        int i8;
        final String strOnExtraCallback;
        final String strIAuthTabCallback2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[0];
        final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3) objArr[1];
        String str5 = (String) objArr[2];
        String str6 = (String) objArr[3];
        String str7 = (String) objArr[4];
        final Function0 function0 = (Function0) objArr[5];
        final Function0 function02 = (Function0) objArr[6];
        final Function0 function03 = (Function0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(200554897);
        int i10 = iIntValue2 & 1;
        if (i10 != 0) {
            int i11 = onExtraCallback + 47;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            i2 = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 4 : 2) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal()) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 128 : 256;
        }
        if ((iIntValue & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str7) ? 16384 : 8192;
        }
        int i13 = iIntValue2 & 32;
        int i14 = 196608;
        if (i13 != 0) {
            i2 |= i14;
        } else if ((iIntValue & 196608) == 0) {
            i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
            i2 |= i14;
        }
        int i15 = iIntValue2 & 64;
        if (i15 == 0) {
            if ((iIntValue & 1572864) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                    int i16 = IAuthTabCallbackDefault + 57;
                    onextracallback = onextracallback3;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i3 = 1048576;
                } else {
                    onextracallback = onextracallback3;
                    i3 = 524288;
                }
                i2 |= i3;
            }
            i4 = iIntValue2 & 128;
            if (i4 == 0) {
                int i18 = IAuthTabCallbackDefault + 121;
                str = "";
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                i2 |= 12582912;
            } else {
                str = "";
                if ((iIntValue & 12582912) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                        int i20 = onExtraCallback + 21;
                        IAuthTabCallbackDefault = i20 % 128;
                        if (i20 % 2 == 0) {
                            throw null;
                        }
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i2 |= i5;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) == 4793490, i2 & 1)) {
                str2 = str5;
                str3 = str6;
                str4 = str7;
                i6 = iIntValue;
                i7 = iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                int i21 = IAuthTabCallbackDefault + 99;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                onextracallback2 = onextracallback;
            } else {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
                if (i13 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object obj2 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i23 = 2 % 2;
                                int i24 = IAuthTabCallback + 117;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallback();
                                int i26 = onNavigationEvent + 33;
                                IAuthTabCallback = i26 % 128;
                                if (i26 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj2);
                        obj = obj2;
                    }
                    function0 = (Function0) obj;
                }
                if (i15 != 0) {
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object obj4 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda7
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i23 = 2 % 2;
                                int i24 = onNavigationEvent + 67;
                                onExtraCallback = i24 % 128;
                                Object obj5 = null;
                                if (i24 % 2 == 0) {
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult();
                                    obj5.hashCode();
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult();
                                int i25 = onExtraCallback + 75;
                                onNavigationEvent = i25 % 128;
                                if (i25 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                obj5.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                        obj3 = obj4;
                    }
                    function02 = (Function0) obj3;
                }
                if (i4 != 0) {
                    int i23 = IAuthTabCallbackDefault + 125;
                    onExtraCallback = i23 % 128;
                    if (i23 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj5 = objOnMinimized3;
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object obj6 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i24 = 2 % 2;
                                int i25 = onNavigationEvent + 93;
                                onExtraCallback = i25 % 128;
                                if (i25 % 2 != 0) {
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback();
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback();
                                int i26 = onNavigationEvent + 63;
                                onExtraCallback = i26 % 128;
                                int i27 = i26 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj6);
                        obj5 = obj6;
                    }
                    function03 = (Function0) obj5;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onExtraCallback + 87;
                    IAuthTabCallbackDefault = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(200554897, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContent (InAppPurchaseHistoryDetailResultContent.kt:36)");
                }
                boolean z = (i2 & 29360128) == 8388608;
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda9
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke() {
                            int i26 = 2 % 2;
                            int i27 = onExtraCallbackWithResult + 45;
                            IAuthTabCallback = i27 % 128;
                            int i28 = i27 % 2;
                            Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult(function03);
                            int i29 = onExtraCallbackWithResult + 75;
                            IAuthTabCallback = i29 % 128;
                            int i30 = i29 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                int[] iArr = IAuthTabCallback.IAuthTabCallback;
                int i26 = iArr[safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal()];
                if (i26 == 1) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540258064);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_purchase_history_detail_result_requested_title, new Object[]{str6}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else if (i26 == 2) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540253348);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_purchase_history_detail_result_rejected_title, new Object[]{str5, str6}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (i26 != 3) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540259772);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540247812);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_purchase_history_detail_result_rejected_by_playstore_title, new Object[]{str6}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                int i27 = iArr[safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal()];
                if (i27 != 1) {
                    int i28 = onExtraCallback + 125;
                    i7 = iIntValue2;
                    IAuthTabCallbackDefault = i28 % 128;
                    int i29 = i28 % 2;
                    if (i27 == 2) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540236931);
                        i8 = 0;
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_purchase_history_detail_result_rejected_description, new Object[]{str7, str6}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        if (i27 != 3) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540243243);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(432693645);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        strOnExtraCallback = str;
                        i8 = 0;
                    }
                } else {
                    i7 = iIntValue2;
                    i8 = 0;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540241431);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_result_requested_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                int i30 = iArr[safeActivityEmbeddingComponentProviderExternalSyntheticLambda3.ordinal()];
                if (i30 == 1) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(432796813);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    strIAuthTabCallback2 = str;
                } else if (i30 == 2) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540226307);
                    strIAuthTabCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_purchase_history_detail_result_rejected_top_accessory_label, new Object[]{str5}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (i30 != 3) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540229847);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-540220739);
                    strIAuthTabCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_result_rejected_by_playstore_top_accessory_label, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                i6 = iIntValue;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback4, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = onextracallback4;
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                str4 = str7;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    str3 = str6;
                    int i31 = onExtraCallback + 41;
                    str2 = str5;
                    IAuthTabCallbackDefault = i31 % 128;
                    int i32 = i31 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    str2 = str5;
                    str3 = str6;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(1270244836, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda10
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i33 = 2 % 2;
                        int i34 = onNavigationEvent + 13;
                        onWarmupCompleted = i34 % 128;
                        if (i34 % 2 != 0) {
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(function03, (u4) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(function03, (u4) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        int i35 = onWarmupCompleted + 55;
                        onNavigationEvent = i35 % 128;
                        int i36 = i35 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-1900440086, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i33 = 2 % 2;
                        int i34 = onNavigationEvent + 1;
                        onExtraCallbackWithResult = i34 % 128;
                        if (i34 % 2 == 0) {
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onWarmupCompleted(strIAuthTabCallback2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02, (u3) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onWarmupCompleted(strIAuthTabCallback2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02, (u3) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        int i35 = onExtraCallbackWithResult + 101;
                        onNavigationEvent = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = 93 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573248, 0, 4027);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback6 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback6, 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i33 = IAuthTabCallbackDefault + 115;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1194147055, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i35 = 2 % 2;
                        int i36 = onWarmupCompleted + 123;
                        IAuthTabCallback = i36 % 128;
                        int i37 = i36 % 2;
                        Object[] objArr2 = {strIAuthTabCallback, (y1a) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, Integer.valueOf(((Integer) obj9).intValue())};
                        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(objArr2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1633370479, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1633370483);
                        int i38 = IAuthTabCallback + 49;
                        onWarmupCompleted = i38 % 128;
                        int i39 = i38 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback6, (QuirkSettingsLoader) null, false, 3, (Object) null), y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-1615658830, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i35 = 2 % 2;
                        int i36 = onExtraCallback + 117;
                        onNavigationEvent = i36 % 128;
                        int i37 = i36 % 2;
                        String str8 = strOnExtraCallback;
                        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj7;
                        if (i37 == 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult(str8, y1externalsyntheticlambda3, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult(str8, y1externalsyntheticlambda3, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, ForwardingCameraControl.onExtraCallback(899380900, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i35 = 2 % 2;
                        int i36 = IAuthTabCallback + 63;
                        onNavigationEvent = i36 % 128;
                        int i37 = i36 % 2;
                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, (y1b) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        int i38 = onNavigationEvent + 41;
                        IAuthTabCallback = i38 % 128;
                        if (i38 % 2 == 0) {
                            int i39 = 84 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 807076278, 432, 9624);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                onextracallback2 = onextracallback5;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final String str8 = str2;
            final String str9 = str3;
            final String str10 = str4;
            final int i35 = i6;
            final int i36 = i7;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda15
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj7, Object obj8) throws Throwable {
                    int i37 = 2 % 2;
                    int i38 = onExtraCallbackWithResult + 7;
                    onNavigationEvent = i38 % 128;
                    int i39 = i38 % 2;
                    Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onExtraCallbackWithResult(onextracallback2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, str8, str9, str10, function0, function02, function03, i35, i36, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                    int i40 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i40 % 128;
                    if (i40 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            });
            return null;
        }
        i2 |= 1572864;
        onextracallback = onextracallback3;
        i4 = iIntValue2 & 128;
        if (i4 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) == 4793490, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1117315343);
        if (i2 != 0) {
            int i4 = IAuthTabCallbackDefault + 35;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 115;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1117315343, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentRequestedPreview (InAppPurchaseHistoryDetailResultContent.kt:136)");
            }
            IAuthTabCallback(new Object[]{verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REQUESTED, "토스", "프리미엄 이용권", "실수로 구매했어요", null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28080, 224}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -850584653);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 13;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.IAuthTabCallback(i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = IAuthTabCallback + 111;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 22 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1776496845);
        Object obj2 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1776496845, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentRejectedPreview (InAppPurchaseHistoryDetailResultContent.kt:150)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1776496845, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentRejectedPreview (InAppPurchaseHistoryDetailResultContent.kt:150)");
            }
            obj = null;
            IAuthTabCallback(new Object[]{verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED, "토스", "프리미엄 이용권", "실수로 구매했어요", null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28080, 224}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -850584653);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentKt$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3, Object obj4) throws Throwable {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 123;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda53.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i9 = onNavigationEvent + 73;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            });
        }
        return obj;
    }

    public static final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(31115173);
        if (i2 != 0) {
            int i4 = onExtraCallback + 3;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallback + 53;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(31115173, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailResultContentRejectedByPlayStorePreview (InAppPurchaseHistoryDetailResultContent.kt:164)");
            }
            IAuthTabCallback(new Object[]{verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.REJECTED_BY_PLAY_STORE, "토스", "프리미엄 이용권", "실수로 구매했어요", null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28080, 224}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -850584653);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryDetailResultContentKt$.ExternalSyntheticLambda0(i2));
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1633370479, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1633370483);
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, Function0 function0, Function0 function02) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(new Object[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, function0, function02}, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 202079767, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -202079761);
    }

    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws Throwable {
        Object[] objArr = {quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, str, str2, str3, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 850584658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -850584653);
    }

    private static final Unit onWarmupCompleted() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(new Object[0], iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 682105282, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -682105279);
    }

    private static final Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda3, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1384872870, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1384872870);
    }

    public static final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 577431712, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -577431710);
    }

    private static final Unit asInterface(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(objArr, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1205883299, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1205883298);
    }
}
