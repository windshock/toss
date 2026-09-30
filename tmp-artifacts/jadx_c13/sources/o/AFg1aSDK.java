package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1aSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.r_;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1aSDK {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List list = (List) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        r_ r_Var = (r_) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue4 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(list, iIntValue, quirksExternalSyntheticBackport0, r_Var, function1, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(list, iIntValue, quirksExternalSyntheticBackport0, r_Var, function1, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i3 = IAuthTabCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getbacktracenote, Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 565418825, -565418825, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ String onExtraCallback(List list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(list, i);
        }
        onWarmupCompleted(list, i);
        throw null;
    }

    private static final Unit onExtraCallback(List list, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r_ r_Var, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 25;
        onWarmupCompleted = i6 % 128;
        onExtraCallbackWithResult(list, i, quirksExternalSyntheticBackport0, r_Var, function1, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 53;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(r_ r_Var, int i, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 71;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            onWarmupCompleted(r_Var, i, function1, quirksExternalSyntheticBackport0, j, j2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onWarmupCompleted(r_Var, i, function1, quirksExternalSyntheticBackport0, j, j2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r_ r_Var, int i, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 79;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            onExtraCallback(r_Var, i, function1, quirksExternalSyntheticBackport0, j, j2, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(r_Var, i, function1, quirksExternalSyntheticBackport0, j, j2, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onWarmupCompleted + 105;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i5;
        int i9 = ~i8;
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i10;
        int i13 = (~(i6 | i5)) | (~(i7 | (~i5)));
        int i14 = i5 + i4 + i2 + ((-1311665080) * i) + (1761575915 * i3);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i5) + 412680192 + (1917570655 * i4) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i2) + (175112192 * i) + ((-649461760) * i3) + (1783169024 * i15);
        int i17 = ((i5 * 1226044109) - 1701849991) + (i4 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i2 * 1226043599) + (i * (-858626504)) + (i3 * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        boolean z = false;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ((Boolean) objArr[2]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i19 = 4;
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i20 = 2 % 2;
        if ((iIntValue2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) {
                int i21 = IAuthTabCallback + 111;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
            } else {
                i19 = 2;
            }
            iIntValue2 |= i19;
            int i23 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i23 % 128;
            int i24 = i23 % 2;
        }
        if ((iIntValue2 & Imgproc.COLOR_RGB2YUV_YV12) != 130) {
            z = true;
        } else {
            int i25 = IAuthTabCallback + 13;
            onWarmupCompleted = i25 % 128;
            int i26 = i25 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1904750518, iIntValue2, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecTextToggle.<anonymous> (TossSecCustomTdsToggle.kt:219)");
            }
            getbacktracenote.invoke(Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2 & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, r_ r_Var, int i, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(list, r_Var, i, z, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(list, r_Var, i, z, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(function1, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, i);
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final String onWarmupCompleted(List list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) list.get(i);
        if (i4 != 0) {
            return str;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(List list, r_ r_Var, int i, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        long jOnUnminimized;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 25;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i8 = IAuthTabCallback + 49;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
                int i10 = onWarmupCompleted + 73;
                IAuthTabCallback = i10 % 128;
                i4 = i10 % 2 != 0 ? 27 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i11 = onWarmupCompleted + 29;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1582946059, i3, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggle.<anonymous> (TossSecCustomTdsToggle.kt:175)");
            }
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(list, i);
            if (str == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            }
            getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(r_Var.getTypography(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (createCameraCaptureCallback) null, (toChildrenConfigsMap) null, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, (isUseCaseActive) null, (getPreviewFromChildren) null, 1048575, (Object) null);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f), 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i12 = IAuthTabCallback + 9;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i14 = 2 % 2;
                        int i15 = onExtraCallback + 103;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        Unit unitIAuthTabCallback = AFg1aSDK.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                        int i17 = onExtraCallback + 63;
                        onExtraCallbackWithResult = i17 % 128;
                        if (i17 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized), r_Var.getTogglePaddings());
            int iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1360758483);
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1360757608);
                jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
            } else {
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1360755816);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1360754856);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallback2, gethumanreadablenameOnExtraCallback, Long.valueOf(jOnUnminimized), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[PHI: r0
      0x004f: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r0
      0x0043: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final List<String> list, final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final r_ r_Var, @NotNull final Function1<? super Integer, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 107;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(r_Var, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1515253036);
            if ((i2 & 12) == 0) {
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(r_Var, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1515253036);
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 48) == 0) {
            i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(r_Var.ordinal()) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                int i8 = onWarmupCompleted + 71;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1515253036, i4, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggle (TossSecCustomTdsToggle.kt:166)");
                }
                float fM157getContainerRadiusD9Ej5fM = r_Var.m157getContainerRadiusD9Ej5fM();
                float fM158getToggleRadiusD9Ej5fM = r_Var.m158getToggleRadiusD9Ej5fM();
                boolean z = (i4 & 14) == 4;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 55;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            List list2 = list;
                            Integer num = (Integer) obj2;
                            if (i11 != 0) {
                                return AFg1aSDK.onExtraCallback(list2, num.intValue());
                            }
                            AFg1aSDK.onExtraCallback(list2, num.intValue());
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                int i9 = i4 >> 3;
                AFf1ySDK.onExtraCallback(i, fM157getContainerRadiusD9Ej5fM, fM158getToggleRadiusD9Ej5fM, function1, quirksExternalSyntheticBackport03, 0L, 0L, (Function1) objOnMinimized, ForwardingCameraControl.onExtraCallback(1582946059, true, new setTaggedAddrCtrl() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // o.setTaggedAddrCtrl
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 113;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 == 0) {
                            AFg1aSDK.onWarmupCompleted(list, r_Var, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = AFg1aSDK.onWarmupCompleted(list, r_Var, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i12 = onExtraCallbackWithResult + 119;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 37 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i9 & 14) | 100663296 | (i9 & 7168) | ((i4 << 6) & 57344), 96);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onWarmupCompleted + 85;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = IAuthTabCallback + 23;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 != 0) {
                            List list2 = list;
                            int i14 = i;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            r_ r_Var2 = r_Var;
                            Function1 function12 = function1;
                            int i15 = i2;
                            int i16 = i3;
                            int iIntValue = ((Integer) obj3).intValue();
                            Object[] objArr = {list2, Integer.valueOf(i14), quirksExternalSyntheticBackport05, r_Var2, function12, Integer.valueOf(i15), Integer.valueOf(i16), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        List list3 = list;
                        int i17 = i;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                        r_ r_Var3 = r_Var;
                        Function1 function13 = function1;
                        int i18 = i2;
                        int i19 = i3;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        Object[] objArr2 = {list3, Integer.valueOf(i17), quirksExternalSyntheticBackport06, r_Var3, function13, Integer.valueOf(i18), Integer.valueOf(i19), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                        Unit unit = (Unit) AFg1aSDK.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1699647998, -1699647996, iOnExtraCallbackWithResult2);
                        int i20 = IAuthTabCallback + 99;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        int i12 = onWarmupCompleted + 59;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        i4 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) == 9362, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final r_ r_Var, final int i, @NotNull final Function1<? super Integer, Unit> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, final long j2, @NotNull final getBacktraceNote<? super Integer, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(r_Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-573602025);
        if ((i2 & 6) != 0) {
            i4 = i2;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(r_Var.ordinal())) {
            int i9 = onWarmupCompleted + 119;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2 != 0 ? 2 : 4;
            i4 = i10 | i2;
        }
        if ((i2 & 48) == 0) {
            int i11 = onWarmupCompleted + 47;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 53 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
            }
            i4 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i13 = IAuthTabCallback + 113;
                onWarmupCompleted = i13 % 128;
                i6 = i13 % 2 == 0 ? 17681 : 256;
            } else {
                int i14 = IAuthTabCallback + 51;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 3 % 5;
                }
                i6 = 128;
            }
            i4 |= i6;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                int i17 = IAuthTabCallback + 107;
                onWarmupCompleted = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 60 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                        int i19 = onWarmupCompleted + 45;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i5 = TTHistoryActivity2.SIZE;
                    }
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                }
                i4 |= i5;
            }
            if ((196608 & i2) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
            }
            if ((i2 & 1572864) == 0) {
                int i21 = IAuthTabCallback + 1;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
            }
            if ((599187 & i4) == 599186) {
                int i23 = IAuthTabCallback + 107;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i16 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573602025, i4, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecTextToggle (TossSecCustomTdsToggle.kt:207)");
                }
                float fM157getContainerRadiusD9Ej5fM = r_Var.m157getContainerRadiusD9Ej5fM();
                float fM158getToggleRadiusD9Ej5fM = r_Var.m158getToggleRadiusD9Ej5fM();
                boolean z2 = (i4 & 896) == 256;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i25 = 2 % 2;
                            int i26 = onWarmupCompleted + 107;
                            onExtraCallback = i26 % 128;
                            Object obj2 = null;
                            if (i26 % 2 == 0) {
                                AFg1aSDK.onWarmupCompleted(function1, ((Integer) obj).intValue());
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = AFg1aSDK.onWarmupCompleted(function1, ((Integer) obj).intValue());
                            int i27 = onWarmupCompleted + 85;
                            onExtraCallback = i27 % 128;
                            if (i27 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                int i25 = i4 << 3;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AFf1ySDK.onExtraCallback(i, fM157getContainerRadiusD9Ej5fM, fM158getToggleRadiusD9Ej5fM, (Function1) objOnMinimized, quirksExternalSyntheticBackport04, j, j2, null, ForwardingCameraControl.onExtraCallback(1904750518, true, new setTaggedAddrCtrl() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // o.setTaggedAddrCtrl
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i26 = 2 % 2;
                        int i27 = IAuthTabCallback + 9;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        getBacktraceNote getbacktracenote2 = getbacktracenote;
                        int iIntValue = ((Integer) obj).intValue();
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        int iIntValue2 = ((Integer) obj4).intValue();
                        Object[] objArr = {getbacktracenote2, Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue2)};
                        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                        Unit unit = (Unit) AFg1aSDK.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1702857844, 1702857845, iOnExtraCallbackWithResult);
                        int i29 = onNavigationEvent + 97;
                        IAuthTabCallback = i29 % 128;
                        int i30 = i29 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((i4 >> 3) & 14) | 100663296 | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 128);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomTdsToggleKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallback + 41;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnExtraCallbackWithResult = AFg1aSDK.onExtraCallbackWithResult(r_Var, i, function1, quirksExternalSyntheticBackport03, j, j2, getbacktracenote, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i29 = onExtraCallback + 61;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 == 0) {
                            int i30 = 71 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((599187 & i4) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r_ r_Var, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {list, Integer.valueOf(i), quirksExternalSyntheticBackport0, r_Var, function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1699647998, -1699647996, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, int i, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getbacktracenote, Integer.valueOf(i), Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1702857844, 1702857845, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, int i, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getbacktracenote, Integer.valueOf(i), Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 565418825, -565418825, iOnExtraCallbackWithResult);
    }
}
