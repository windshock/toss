package o;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.semantics.Role;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.appendInfo;
import o.getPreRenderJob;
import o.lExternalSyntheticLambda3;
import o.readFully;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class appendInfo {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, String str2, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, str, function0, str2, function02, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(readfully, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, String str2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(str, str2, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, String str2, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -835019292, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 835019294);
        } else {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -835019292, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr2, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 835019294);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallback(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(pairArr, sessionProcessorCaptureCallback);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, function0, function02, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 37 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, String str2, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, function0, str2, function02, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        int i8;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final Function0 function0;
        final String str;
        long jLongValue;
        int i9 = ~i4;
        int i10 = (~(i9 | i6)) | i3;
        int i11 = ~i3;
        int i12 = ~(i11 | i6 | i4);
        int i13 = i6 | (~(i4 | i11)) | (~(i9 | i3));
        int i14 = i6 + i3 + i5 + ((-381402339) * i2) + ((-2062754392) * i);
        int i15 = i14 * i14;
        int i16 = (((-1355236691) * i6) - 921838429) + (i3 * (-1355236103)) + (i10 * (-294)) + (i12 * (-294)) + (i13 * 294) + ((-1355236397) * i5) + ((-1583251481) * i2) + (1682205048 * i) + (i15 * (-427491328));
        int i17 = (1317609343 * i6) + 1063714816 + (1288888451 * i3) + (i10 * 14360446) + (14360446 * i12) + ((-14360446) * i13) + (1303248896 * i5) + (1454768128 * i2) + (808452096 * i) + ((-1790509056) * i15) + (i16 * i16 * 844169216);
        if (i17 != 1) {
            return i17 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final String str2 = (String) objArr[1];
        final Function0 function02 = (Function0) objArr[2];
        String str3 = (String) objArr[3];
        int i18 = 4;
        Function0 function03 = (Function0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        final int iIntValue = ((Number) objArr[6]).intValue();
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1452414022);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i20 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
            } else {
                i18 = 2;
            }
            i7 = i18 | iIntValue;
        } else {
            i7 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i22 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 256 : 128;
        }
        int i24 = iIntValue2 & 8;
        if (i24 != 0) {
            int i25 = onExtraCallbackWithResult;
            int i26 = i25 + 87;
            IAuthTabCallback = i26 % 128;
            i7 = i26 % 2 == 0 ? i7 | 20563 : i7 | 3072;
            int i27 = i25 + 17;
            IAuthTabCallback = i27 % 128;
            int i28 = i27 % 2;
        } else if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                int i29 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i29 % 128;
                int i30 = i29 % 2;
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i7 |= i8;
        }
        int i31 = iIntValue2 & 16;
        if (i31 != 0) {
            i7 |= 24576;
        } else if ((iIntValue & 24576) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 16384 : 8192;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) != 9362, i7 & 1)) {
            int i32 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i32 % 128;
            int i33 = i32 % 2;
            String str4 = i24 != 0 ? null : str3;
            Function0 function04 = i31 != 0 ? null : function03;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1452414022, i7, -1, "im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooter (GreyGradientDualCtaFooter.kt:48)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i34 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i34 % 128;
                int i35 = i34 % 2;
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null);
            Function0 function05 = function04;
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-(IAuthTabCallback(getsupportedhighspeedresolutions) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i36 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i36 % 128;
                int i37 = i36 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-94479827);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-94478867);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = setImageAssetsFolder.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, jIAuthTabCallback, getMaxAdCount.onNavigationEvent(jLongValue, 0.25f), setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, 0.0f, 0L, false, false, 0.0f, 504, null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2) {
                        int i38 = 2 % 2;
                        int i39 = onExtraCallback + 81;
                        onExtraCallbackWithResult = i39 % 128;
                        int i40 = i39 % 2;
                        Unit unitOnWarmupCompleted = appendInfo.onWarmupCompleted(getsupportedhighspeedresolutions, (ExtensionsManager1) obj2);
                        int i41 = onExtraCallbackWithResult + 57;
                        onExtraCallback = i41 % 128;
                        int i42 = i41 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized2);
            Integer numValueOf = Integer.valueOf((i7 & 112) | 6 | (i7 & 896) | (i7 & 7168) | (57344 & i7));
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -835019292, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallbackWithResult, str2, function02, str4, function05, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 835019294);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            function0 = function05;
            str = str4;
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            function0 = function03;
            str = str3;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i38 = 2 % 2;
                    int i39 = onExtraCallback + 41;
                    IAuthTabCallback = i39 % 128;
                    int i40 = i39 % 2;
                    Unit unitIAuthTabCallback = appendInfo.IAuthTabCallback(quirksExternalSyntheticBackport0, str2, function02, str, function0, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i41 = IAuthTabCallback + 89;
                    onExtraCallback = i41 % 128;
                    if (i41 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            });
        }
        return obj;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, String str2, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -784402036, iIAuthTabCallback, objArr, iIAuthTabCallback2, 784402037);
        } else {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -784402036, iIAuthTabCallback3, objArr2, iIAuthTabCallback4, 784402037);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1940232401, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutions, extensionsManager1}, iIAuthTabCallback2, 1940232401);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(getsupportedhighspeedresolutions, (int) extensionsManager1.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
            }
            return unit;
        }
        onExtraCallback(getsupportedhighspeedresolutions, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i3;
        Function0 function0;
        Object obj;
        final String str;
        final Function0 function02;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        long jLongValue;
        long jLongValue2;
        int i4;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        final String str2 = (String) objArr[1];
        Function0 function03 = (Function0) objArr[2];
        String str3 = (String) objArr[3];
        Function0 function04 = (Function0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function03, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(843122103);
        int i6 = iIntValue2 & 1;
        Object obj2 = null;
        if (i6 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i7 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2);
                obj2.hashCode();
                throw null;
            }
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i8 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                i4 = 16;
            } else {
                int i10 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i4 = 32;
            }
            i |= i4;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 256 : 128;
        }
        int i12 = iIntValue2 & 8;
        if (i12 != 0) {
            i |= 3072;
        } else if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                int i13 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i13 % 128;
                i2 = i13 % 2 != 0 ? 1714 : 2048;
            } else {
                i2 = 1024;
            }
            i |= i2;
        }
        int i14 = iIntValue2 & 16;
        if (i14 != 0) {
            i |= 24576;
        } else if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 16384 : 8192;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 9363) != 9362, i & 1)) {
            if (i6 != 0) {
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            String str4 = i12 != 0 ? null : str3;
            Function0 function05 = i14 != 0 ? null : function04;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(843122103, i, -1, "im.toss.feature.credit.ui.main.home.component.TopLineGreyGradientListFooter (GreyGradientDualCtaFooter.kt:82)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent()));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i15 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1508466210);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 59).onRelationshipValidationResult();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1508466210);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1508465250);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                int i16 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(jLongValue, 0.8f)));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1508462466);
                jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1508461506);
                jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i18 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            final Pair[] pairArr = {pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(0.75f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(jLongValue2, 0.8f))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent()))};
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj3) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallback + 95;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnExtraCallback = appendInfo.onExtraCallback((useAndConfigureProgramWithTexture) obj3);
                        int i23 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i23 % 128;
                        if (i23 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback2, false, (Function1) objOnMinimized, 1, (Object) null), 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, true, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 520191, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pairArr);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i20 = 2 % 2;
                        int i21 = IAuthTabCallback + 29;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        removeObserverLocked removeobserverlockedOnExtraCallback = appendInfo.onExtraCallback(pairArr, (SessionProcessorCaptureCallback) obj3);
                        int i23 = IAuthTabCallback + 25;
                        onWarmupCompleted = i23 % 128;
                        if (i23 % 2 != 0) {
                            int i24 = 12 / 0;
                        }
                        return removeobserverlockedOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized2), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i20 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (str4 == null || !(!StringsKt.isBlank(str4)) || function05 == null) {
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2131867502);
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = iIntValue;
                function0 = function03;
                r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.IAuthTabCallback(str2, (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).requestPostMessageChannelWithExtras(), function0, (String) null, GraphicDeviceInfo.Companion.IAuthTabCallback(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), false, (lExternalSyntheticLambda3.onWarmupCompleted) null, false, (lExternalSyntheticLambda3.onWarmupCompleted) null, (lExternalSyntheticLambda3.onExtraCallbackWithResult) null, (Drawable) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 14) | 1769472 | ((i << 3) & 7168), 0, 8082);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2131600716);
                int i22 = i >> 3;
                obj = null;
                onExtraCallback(str2, str4, function03, function05, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i & 896) | (i22 & 14) | ((i >> 6) & 112) | (i22 & 7168));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = iIntValue;
                function0 = function03;
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            onextracallback = onextracallback2;
            function02 = function05;
            str = str4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i3 = iIntValue;
            function0 = function03;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            str = str3;
            function02 = function04;
            onextracallback = onextracallback2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final Function0 function06 = function0;
            final int i23 = i3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onNavigationEvent + 65;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 != 0) {
                        appendInfo.onExtraCallbackWithResult(onextracallback, str2, function06, str, function02, i23, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = appendInfo.onExtraCallbackWithResult(onextracallback, str2, function06, str, function02, i23, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i26 = onExtraCallback + 17;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        return obj;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        readFully.onExtraCallback onextracallback = readFully.Companion;
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        final readFully readfullyOnWarmupCompleted = onextracallback.onWarmupCompleted(pairArr2, jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), createURational.Companion.onExtraCallback());
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                Unit unitIAuthTabCallback;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    unitIAuthTabCallback = appendInfo.IAuthTabCallback(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                    int i4 = 10 / 0;
                } else {
                    unitIAuthTabCallback = appendInfo.IAuthTabCallback(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                }
                int i5 = IAuthTabCallback + 49;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32));
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0.0f, (hasMoreElements) null, (seek) null, 0, 122, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    public static final void onExtraCallback(@NotNull final String str, @NotNull final String str2, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1364399380);
        if ((i & 6) == 0) {
            int i5 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                i3 = 128;
            } else {
                int i7 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i7 % 128;
                i3 = i7 % 2 == 0 ? 30056 : 256;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170) {
            int i8 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1364399380, i2, -1, "im.toss.feature.credit.ui.main.home.component.DualListFooter (GreyGradientDualCtaFooter.kt:135)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda3.onWarmupCompleted(onextracallback, CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda1.Min);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i10 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    int i11 = 53 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            long jRequestPostMessageChannelWithExtras = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).requestPostMessageChannelWithExtras();
            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
            r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.IAuthTabCallback(str2, quirksExternalSyntheticBackport0OnNavigationEvent, jRequestPostMessageChannelWithExtras, function02, (String) null, iAuthTabCallback.IAuthTabCallback(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), false, (lExternalSyntheticLambda3.onWarmupCompleted) null, false, (lExternalSyntheticLambda3.onWarmupCompleted) null, (lExternalSyntheticLambda3.onExtraCallbackWithResult) null, (Drawable) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 >> 3) & 14) | 1769472 | (i2 & 7168), 0, 8080);
            int i12 = i2;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(setMaxAdCount.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 5, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f)), 0.0f, 1, (Object) null), new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0.1f))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.IAuthTabCallback(str, RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).requestPostMessageChannelWithExtras(), function0, (String) null, iAuthTabCallback.IAuthTabCallback(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), false, (lExternalSyntheticLambda3.onWarmupCompleted) null, false, (lExternalSyntheticLambda3.onWarmupCompleted) null, (lExternalSyntheticLambda3.onExtraCallbackWithResult) null, (Drawable) null, cameraCaptureResultEmptyCameraCaptureResult2, (i12 & 14) | 1769472 | ((i12 << 3) & 7168), 0, 8080);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.GreyGradientDualCtaFooterKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 3;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        appendInfo.onExtraCallbackWithResult(str, str2, function0, function02, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = appendInfo.onExtraCallbackWithResult(str, str2, function0, function02, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = onExtraCallback + 33;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getsupportedhighspeedresolutions.onNavigationEvent();
        }
        getsupportedhighspeedresolutions.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    public static final void onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @NotNull Function0<Unit> function0, @Nullable String str2, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -784402036, iIAuthTabCallback, objArr, iIAuthTabCallback2, 784402037);
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Unit) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1940232401, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutions, extensionsManager1}, iIAuthTabCallback2, 1940232401);
    }

    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @NotNull Function0<Unit> function0, @Nullable String str2, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, function0, str2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -835019292, iIAuthTabCallback, objArr, iIAuthTabCallback2, 835019294);
    }
}
