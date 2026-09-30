package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.kyc.intro.container.KycIntroContainerKt$;
import im.toss.features.kyc.intro.navigation.KycIntroNav;
import im.toss.features.kyc.intro.screen.RetryFullPageScreenKt;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setIgnorePermissionCheck {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = i7 | i6;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i6));
        int i11 = (~(i | i6)) | (~(i7 | i));
        int i12 = i9 | i8;
        int i13 = i6 + i5 + i4 + (988256597 * i2) + ((-695401848) * i3);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i6) - 1270611968) + ((-1462879173) * i5) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i2) + (1063256064 * i3) + (1273561088 * i14);
        int i16 = (i6 * (-1367684995)) + 376186498 + (i5 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i4 * (-1367684709)) + (i2 * 1512018807) + (i3 * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(SessionTrackerb sessionTrackerb, setParentLayoutDirection setparentlayoutdirection, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sessionTrackerb, setparentlayoutdirection, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setWebviewConfigs setwebviewconfigs, SessionTrackerb sessionTrackerb, setParentLayoutDirection setparentlayoutdirection, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setwebviewconfigs, sessionTrackerb, setparentlayoutdirection, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getEnableJsT2 getenablejst2, setParentLayoutDirection setparentlayoutdirection, setWebviewConfigs setwebviewconfigs, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getenablejst2, setparentlayoutdirection, setwebviewconfigs, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setWebviewConfigs setwebviewconfigs, Map map, getEnableJsT2 getenablejst2, setParentLayoutDirection setparentlayoutdirection, SessionTrackerb sessionTrackerb, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(setwebviewconfigs, map, getenablejst2, setparentlayoutdirection, sessionTrackerb, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        }
        onExtraCallbackWithResult(setwebviewconfigs, map, getenablejst2, setparentlayoutdirection, sessionTrackerb, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setWebviewConfigs setwebviewconfigs, Map map, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setwebviewconfigs, map, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[0];
        getEnableJsT2 getenablejst2 = (getEnableJsT2) objArr[1];
        Map map = (Map) objArr[2];
        setWebviewConfigs setwebviewconfigs = (setWebviewConfigs) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(sessionTrackerb, getenablejst2, map, setwebviewconfigs, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        onWarmupCompleted(sessionTrackerb, getenablejst2, map, setwebviewconfigs, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setWebviewConfigs setwebviewconfigs = (setWebviewConfigs) objArr[0];
        Map map = (Map) objArr[1];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setwebviewconfigs, map, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(SessionTrackerb sessionTrackerb, getEnableJsT2 getenablejst2, Map map, setWebviewConfigs setwebviewconfigs, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {sessionTrackerb, getenablejst2, map, setwebviewconfigs, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1062268388, -1062268387);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 23;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(setWebviewConfigs setwebviewconfigs, Map map, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-916412772, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycIntroContainer.kt:43)");
            int i3 = onWarmupCompleted + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        getExtendInfo.onNavigationEvent(setwebviewconfigs, 1225285L, setValidSubResMimeList.onExtraCallback(setwebviewconfigs, map), cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(setWebviewConfigs setwebviewconfigs, Map map, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1546178303, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycIntroContainer.kt:50)");
        }
        PluginModel.onExtraCallback(setwebviewconfigs, 1225285L, setValidSubResMimeList.onExtraCallback(setwebviewconfigs, map), cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 25;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getEnableJsT2 getenablejst2, setParentLayoutDirection setparentlayoutdirection, setWebviewConfigs setwebviewconfigs, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2136432339, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycIntroContainer.kt:57)");
        }
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        RetryFullPageScreenKt.onExtraCallback(iOnExtraCallback2, iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback3, -1973146091, new Object[]{getenablejst2, setparentlayoutdirection, setwebviewconfigs, cameraCaptureResultEmptyCameraCaptureResult, 0}, 1973146101);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 93;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = 61 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(setWebviewConfigs setwebviewconfigs, SessionTrackerb sessionTrackerb, setParentLayoutDirection setparentlayoutdirection, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2135491978, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycIntroContainer.kt:64)");
            int i5 = onExtraCallback + 57;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            }
        }
        setRequireVersion.onExtraCallbackWithResult((KycIntroNav.NavigateAffiliate) TextKtExternalSyntheticLambda9.onWarmupCompleted(twoLineExternalSyntheticLambda0, Reflection.getOrCreateKotlinClass(KycIntroNav.NavigateAffiliate.class)), setwebviewconfigs, sessionTrackerb, setparentlayoutdirection, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallback + 59;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(SessionTrackerb sessionTrackerb, setParentLayoutDirection setparentlayoutdirection, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1158419447, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KycIntroContainer.kt:72)");
        }
        getRequireVersion.onExtraCallbackWithResult(sessionTrackerb, setparentlayoutdirection, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onWarmupCompleted + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(setWebviewConfigs setwebviewconfigs, Map map, getEnableJsT2 getenablejst2, setParentLayoutDirection setparentlayoutdirection, SessionTrackerb sessionTrackerb, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-916412772, true, new KycIntroContainerKt$.ExternalSyntheticLambda0(setwebviewconfigs, map));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(KycIntroNav.IntroFullPage.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2 = ForwardingCameraControl.onExtraCallbackWithResult(1546178303, true, new KycIntroContainerKt$.ExternalSyntheticLambda1(setwebviewconfigs, map));
        RippleContainer.onExtraCallbackWithResult(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(KycIntroNav.IntroBottomSheet.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), new PreviewProcessor(false, false, false, 7, (DefaultConstructorMarker) null), encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3 = ForwardingCameraControl.onExtraCallbackWithResult(2136432339, true, new KycIntroContainerKt$.ExternalSyntheticLambda2(getenablejst2, setparentlayoutdirection, setwebviewconfigs));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(KycIntroNav.RetryFullPage.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult4 = ForwardingCameraControl.onExtraCallbackWithResult(-2135491978, true, new KycIntroContainerKt$.ExternalSyntheticLambda3(setwebviewconfigs, sessionTrackerb, setparentlayoutdirection));
        RippleContainer.onExtraCallbackWithResult(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(KycIntroNav.NavigateAffiliate.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), new PreviewProcessor(false, false, false, 7, (DefaultConstructorMarker) null), encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult4);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult5 = ForwardingCameraControl.onExtraCallbackWithResult(1158419447, true, new KycIntroContainerKt$.ExternalSyntheticLambda4(sessionTrackerb, setparentlayoutdirection));
        RippleContainer.onExtraCallbackWithResult(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(KycIntroNav.CoreCxInquire.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), new PreviewProcessor(false, false, false, 7, (DefaultConstructorMarker) null), encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult5);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[PHI: r6
      0x007a: PHI (r6v21 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v22 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0060, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062 A[PHI: r6
      0x0062: PHI (r6v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v22 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0060, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[0];
        getEnableJsT2 getenablejst2 = (getEnableJsT2) objArr[1];
        Map map = (Map) objArr[2];
        setWebviewConfigs setwebviewconfigs = (setWebviewConfigs) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionTrackerb, "");
            Intrinsics.checkNotNullParameter(getenablejst2, "");
            Intrinsics.checkNotNullParameter(setwebviewconfigs, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-140150251);
            if ((iIntValue & 21) != 0) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb)) {
                int i4 = onExtraCallback + 25;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2 == 0 ? 2 : 4;
                i = i5 | iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            }
        } else {
            Intrinsics.checkNotNullParameter(sessionTrackerb, "");
            Intrinsics.checkNotNullParameter(getenablejst2, "");
            Intrinsics.checkNotNullParameter(setwebviewconfigs, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-140150251);
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 48) == 0) {
            int i6 = onWarmupCompleted + 55;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i |= !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getenablejst2) ? 16 : 32;
        }
        int i8 = iIntValue2 & 4;
        if (i8 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(map) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            int i9 = onExtraCallback + 53;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setwebviewconfigs);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setwebviewconfigs) ? 2048 : 1024;
        }
        if ((i & 1171) != 1170) {
            int i10 = onExtraCallback + 13;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Map map2 = i8 != 0 ? null : map;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-140150251, i, -1, "im.toss.features.kyc.intro.container.KycIntroContainer (KycIntroContainer.kt:34)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i12 = onWarmupCompleted + 125;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            setParentLayoutDirection setparentlayoutdirectionOnWarmupCompleted = RippleAnimationfadeOut21.onWarmupCompleted(new PullRefreshIndicatorKtExternalSyntheticLambda3[0], cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            KycIntroNav kycIntroNavOnNavigationEvent = onNavigationEvent(setwebviewconfigs);
            setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirectionOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setwebviewconfigs);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(map2);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getenablejst2);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5)) {
                int i14 = onWarmupCompleted + 125;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    KycIntroContainerKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new KycIntroContainerKt$.ExternalSyntheticLambda5(setwebviewconfigs, map2, getenablejst2, setparentlayoutdirectionOnWarmupCompleted, sessionTrackerb);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                    objOnMinimized = externalSyntheticLambda5;
                }
                map = map2;
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                RippleHostViewExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirectionOnWarmupCompleted, kycIntroNavOnNavigationEvent, quirksExternalSyntheticBackport0OnNavigationEvent2, (QuirkSettingsLoader) null, (KClass) null, (Map) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 384, 0, 2040);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i16 = onWarmupCompleted + 75;
            onExtraCallback = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 4 % 2;
            }
        }
        Map map3 = map;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new KycIntroContainerKt$.ExternalSyntheticLambda6(sessionTrackerb, getenablejst2, map3, setwebviewconfigs, iIntValue, iIntValue2));
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r4 != 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r4 = o.setIgnorePermissionCheck.onExtraCallback + 121;
        o.setIgnorePermissionCheck.onWarmupCompleted = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return im.toss.features.kyc.intro.navigation.KycIntroNav.IntroFullPage.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        throw new java.lang.IllegalArgumentException("KycIntroType.NONE is not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return im.toss.features.kyc.intro.navigation.KycIntroNav.IntroBottomSheet.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r4 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final KycIntroNav onNavigationEvent(setWebviewConfigs setwebviewconfigs) {
        int i;
        int i2 = 2 % 2;
        if (setwebviewconfigs.onWarmupCompleted() == setUcJsT2.NONE) {
            throw new IllegalArgumentException("KycIntroType.NONE is not supported");
        }
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (setwebviewconfigs.IAuthTabCallbackStub()) {
            int i5 = onExtraCallback + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                i = onNavigationEvent.onNavigationEvent[setwebviewconfigs.onWarmupCompleted().ordinal()];
            } else {
                i = onNavigationEvent.onNavigationEvent[setwebviewconfigs.onWarmupCompleted().ordinal()];
            }
        } else {
            return KycIntroNav.RetryFullPage.INSTANCE;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(setWebviewConfigs setwebviewconfigs, Map map, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {setwebviewconfigs, map, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -956510949, 956510951);
    }

    public static /* synthetic */ Unit onNavigationEvent(SessionTrackerb sessionTrackerb, getEnableJsT2 getenablejst2, Map map, setWebviewConfigs setwebviewconfigs, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {sessionTrackerb, getenablejst2, map, setwebviewconfigs, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 650949837, -650949837);
    }

    public static final void onNavigationEvent(@NotNull SessionTrackerb sessionTrackerb, @NotNull getEnableJsT2 getenablejst2, @Nullable Map<String, Object> map, @NotNull setWebviewConfigs setwebviewconfigs, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {sessionTrackerb, getenablejst2, map, setwebviewconfigs, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1062268388, -1062268387);
    }
}
