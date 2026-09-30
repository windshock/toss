package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.LifecycleEventObserver;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AccessibilityUtilKtExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1;
import o.AppLovinFullscreenImmersiveActivity;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda4;
import o.CarouselKtExternalSyntheticLambda8;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GroupableFeatureWhenMappings;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LinkGenerator;
import o.MaxAdapterListener;
import o.PreviewOrientationIncorrectQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.UseTorchAsFlashQuirk;
import o.VirtualCameraAdapterVirtualCameraCaptureCallback;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.YuvImageOnePixelShiftQuirk;
import o.ZslDisablerQuirk;
import o.accessgetCameraFactoryp;
import o.addOnAdapterChangeListener;
import o.calculatePageOffsets;
import o.component5;
import o.decrementVideoUsage;
import o.deleteProfile;
import o.getAwbState;
import o.getContentValues;
import o.getExtensionsBeforeInitialized;
import o.getFillAlpha;
import o.getStrokeWidth;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.getWindowAreaStatus;
import o.immediateFailedFuture;
import o.isInVideoUsage;
import o.isZslDisabledByByUserCaseConfig;
import o.measureChildConstrained;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.requestPostMessageChannel;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.seek;
import o.setAdVideoPlaybackListener;
import o.setByteOrder;
import o.setPostviewFormatSelector;
import o.setTrimPathOffset;
import o.showAndRender;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.unregisterOutputSurface;
import o.useAndConfigureProgramWithTexture;
import o.varyMatches;
import o.verifyDrawable;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFullPageV2Activity extends Hilt_NativeAdsFullPageV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static long IAuthTabCallbackStub = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    public static final int asBinder;
    private static int asInterface;

    static {
        IAuthTabCallbackStubProxy();
        Companion = new onExtraCallbackWithResult(null);
        asBinder = 8;
        int i = access000 + 27;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(fullPage, nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 93;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(nativeAdsDto, nativeAdsFullPageV2Activity, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullPageV2Activity, str);
        int i3 = IAuthTabCallbackDefault + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullPageV2Activity, adAsset);
        int i4 = IAuthTabCallbackDefault + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 87;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        int i4 = IAuthTabCallbackDefault + 53;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{useandconfigureprogramwithtexture}, 940714663, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -940714660, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = asInterface + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsDto.Creative.FullPage fullPage = (NativeAdsDto.Creative.FullPage) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[3];
        Context context = (Context) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(nativeAdsDto, fullPage, fFloatValue, nativeAdsFullPageV2Activity, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsDto, fullPage, fFloatValue, nativeAdsFullPageV2Activity, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallbackDefault + 93;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(fullPage, nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asInterface + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.Creative.FullPage fullPage, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 3;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(nativeAdsDto, nativeAdsFullPageV2Activity, fullPage, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullPageV2Activity, fullPage, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity, adAsset}, 1250590050, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1250590046, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = asInterface + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(useandconfigureprogramwithtexture);
        }
        onNavigationEvent(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity}, 1341766342, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1341766342, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 39;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, nativeAdsFullPageV2Activity}, -1870385146, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1870385153, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallbackDefault + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(useandconfigureprogramwithtexture);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ AdsCircularCountdownLayout onNavigationEvent(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnExtraCallback = onExtraCallback(nativeAdsFullPageV2Activity, i, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        return adsCircularCountdownLayoutOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~((~i5) | i7);
        int i9 = i4 | i8 | (~(i2 | i5));
        int i10 = (~(i5 | i4)) | (~(i7 | i5)) | (~(i7 | i4));
        int i11 = i4 + i2 + i + (1351532378 * i3) + (1237199896 * i6);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i2) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i) + ((-1818230784) * i3) + ((-914358272) * i6) + ((-2051670016) * i12);
        int i14 = ((i4 * 406040238) - 634933780) + (i2 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i * 406039561) + (i3 * 1283666474) + (i6 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
                int i15 = 2 % 2;
                int i16 = asInterface + 111;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                Unit unit = Unit.INSTANCE;
                int i18 = IAuthTabCallbackDefault + 37;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
                int i20 = 2 % 2;
                Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[2], "");
                NativeAdsFullPageV2Activity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda3(getsupportedhighspeedresolutionsfor);
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda3);
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda3);
                int i21 = IAuthTabCallbackDefault + 95;
                asInterface = i21 % 128;
                int i22 = i21 % 2;
                return iAuthTabCallback;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, iIntValue, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onExtraCallback(nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, iIntValue, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsDto, nativeAdsFullPageV2Activity);
        int i4 = asInterface + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor}, -1193300215, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1193300220, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            int i3 = 40 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor}, -1193300215, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1193300220, iOnExtraCallbackWithResult2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        }
        int i4 = IAuthTabCallbackDefault + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage}, 685322367, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -685322359, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 21;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return decrementvideousage;
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallbackWithResult;
        final /* synthetic */ LifecycleEventObserver onNavigationEvent;

        public IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onExtraCallbackWithResult = textFieldScrollKtExternalSyntheticLambda0;
            this.onNavigationEvent = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.getLifecycle().onExtraCallbackWithResult(this.onNavigationEvent);
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 39;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45812), 83 - ImageFormat.getBitsPerPixel(0), 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 19 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final class asBinder implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class asInterface implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 47 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent();
                int i4 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onNavigationEvent implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsFullPageV2Activity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = IAuthTabCallback + 81;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onTransact implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.Reward onNavigationEvent;

        public onTransact(NativeAdsDto.Reward reward) {
            this.onNavigationEvent = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onExtraCallbackWithResult(this.onNavigationEvent);
                int i4 = onWarmupCompleted + 45;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                settrimpathoffset.onExtraCallback();
                int i3 = onNavigationEvent + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        String str;
        String strIAuthTabCallbackStub;
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub();
        super.onCreate(bundle);
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        String strIAuthTabCallbackStub2 = null;
        if (nativeAdsDtoAsInterface == null || (listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult()) == null) {
            creativeOnExtraCallbackWithResult = null;
        } else {
            int i4 = IAuthTabCallbackDefault + 47;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
            if (adAsset != null) {
                creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
            }
        }
        NativeAdsDto.Creative.FullPage fullPage = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FullPage ? (NativeAdsDto.Creative.FullPage) creativeOnExtraCallbackWithResult : null;
        str = "";
        if (fullPage != null) {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                } else {
                    int i5 = asInterface + 69;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    strIAuthTabCallbackStub = null;
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onWarmupCompleted());
            }
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-518227937, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda2(nativeAdsDtoAsInterface, this, fullPage))), 1, (Object) null);
            return;
        }
        setResult(0);
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub2 != null) {
                int i7 = IAuthTabCallbackDefault + 103;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                strIAuthTabCallbackStub2 = nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
            }
            if (strIAuthTabCallbackStub2 != null) {
                int i9 = asInterface + 111;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 16 / 0;
                }
                str = strIAuthTabCallbackStub2;
            }
            nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(str, new onNavigationEvent());
        }
        super.finish();
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[1];
        int i = 2 % 2;
        if (onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) objArr[2])) {
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageV2Activity.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, (Function0) null, 4, (Object) null);
            }
            nativeAdsFullPageV2Activity.finish();
            Unit unit = Unit.INSTANCE;
            int i2 = asInterface + 43;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return unit;
        }
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r4
      0x0032: PHI (r4v3 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = onExtraCallback.onNavigationEvent[onextracallbackwithresult.ordinal()];
            if (i != 0) {
                int i4 = IAuthTabCallbackDefault;
                int i5 = i4 + 7;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                if (i == 2) {
                    int i7 = i4 + 85;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    AdsCircularCountdownLayout adsCircularCountdownLayoutIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
                    if (adsCircularCountdownLayoutIAuthTabCallback != null) {
                        adsCircularCountdownLayoutIAuthTabCallback.onWarmupCompleted();
                        return;
                    }
                }
            } else {
                AdsCircularCountdownLayout adsCircularCountdownLayoutIAuthTabCallback2 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
                if (adsCircularCountdownLayoutIAuthTabCallback2 != null) {
                    adsCircularCountdownLayoutIAuthTabCallback2.onNavigationEvent();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = onExtraCallback.onNavigationEvent[onextracallbackwithresult.ordinal()];
            if (i != 1) {
            }
        }
        int i8 = asInterface + 39;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String strIAuthTabCallbackStub;
        ?? r1 = (NativeAdsFullPageV2Activity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r1);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i2 = IAuthTabCallbackDefault + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r1);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            } else {
                int i4 = IAuthTabCallbackDefault + 29;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub == null) {
                int i6 = asInterface + 47;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 13 / 0;
                }
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new asInterface());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r1, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[1];
        int i = 2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        getFillAlpha.onWarmupCompleted(nativeAdsFullPageV2Activity.IAuthTabCallbackDefault(), nativeAdsDto.IAuthTabCallbackStub(), adAsset, new NativeAdsEventLogType.onExtraCallback("2003"), null, null, null, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda12(nativeAdsFullPageV2Activity, adAsset), 56, null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = (NativeAdsFullPageV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsFullPageV2Activity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackDefault + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        nativeAdsFullPageV2Activity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final AdsCircularCountdownLayout onExtraCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AdsCircularCountdownLayout adsCircularCountdownLayout = new AdsCircularCountdownLayout(context, null, 0, 6, null);
        nativeAdsFullPageV2Activity.onWarmupCompleted(adsCircularCountdownLayout);
        onExtraCallback((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor, adsCircularCountdownLayout);
        adsCircularCountdownLayout.setV2Style(true);
        adsCircularCountdownLayout.onWarmupCompleted(i, nativeAdsFullPageV2Activity.getInterfaceDescriptor(), nativeAdsFullPageV2Activity.onWarmupCompleted(), new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda10(nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor2), new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda11(nativeAdsDto, nativeAdsFullPageV2Activity));
        int i3 = IAuthTabCallbackDefault + 51;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return adsCircularCountdownLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r12
      0x0029: PHI (r12v6 im.toss.ads_sdk.model.NativeAdsDto$Reward) = (r12v5 im.toss.ads_sdk.model.NativeAdsDto$Reward), (r12v8 im.toss.ads_sdk.model.NativeAdsDto$Reward) binds: [B:10:0x0027, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[PHI: r1
      0x0045: PHI (r1v6 o.calculatePageOffsets) = (r1v5 o.calculatePageOffsets), (r1v16 o.calculatePageOffsets) binds: [B:17:0x0043, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        NativeAdsDto.Reward rewardOnExtraCallback;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        if (z) {
            int i2 = asInterface + 103;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                rewardOnExtraCallback = nativeAdsDto.onTransact().onExtraCallback();
                int i3 = 55 / 0;
                if (rewardOnExtraCallback != null) {
                    int i4 = asInterface + 51;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageV2Activity.onNavigationEvent();
                        int i5 = 69 / 0;
                        if (calculatepageoffsetsOnNavigationEvent != null) {
                            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
                        }
                        nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageV2Activity);
                        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageV2Activity);
                            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                                int i6 = asInterface + 53;
                                IAuthTabCallbackDefault = i6 % 128;
                                int i7 = i6 % 2;
                            } else {
                                strIAuthTabCallbackStub = null;
                            }
                            if (strIAuthTabCallbackStub == null) {
                                int i8 = asInterface + 109;
                                IAuthTabCallbackDefault = i8 % 128;
                                if (i8 % 2 == 0) {
                                    throw null;
                                }
                                strIAuthTabCallbackStub = "";
                            }
                            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onTransact(rewardOnExtraCallback));
                        }
                    } else {
                        calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageV2Activity.onNavigationEvent();
                        if (calculatepageoffsetsOnNavigationEvent != null) {
                        }
                        nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageV2Activity);
                        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                        }
                    }
                }
            } else {
                rewardOnExtraCallback = nativeAdsDto.onTransact().onExtraCallback();
                if (rewardOnExtraCallback != null) {
                }
            }
        }
        nativeAdsFullPageV2Activity.onTransact();
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r2
      0x0033: PHI (r1v7 im.toss.ads_sdk.model.NativeAdsDto$AdAsset) = (r1v6 im.toss.ads_sdk.model.NativeAdsDto$AdAsset), (r1v11 im.toss.ads_sdk.model.NativeAdsDto$AdAsset) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r2v2 o.calculatePageOffsets) = (r2v1 o.calculatePageOffsets), (r2v3 o.calculatePageOffsets) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) throws NoWhenBranchMatchedException {
        NativeAdsDto.AdAsset adAsset;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
            calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageV2Activity.onNavigationEvent();
            int i3 = 99 / 0;
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
            }
        } else {
            adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
            calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageV2Activity.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
            }
        }
        nativeAdsFullPageV2Activity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[PHI: r0 r3
      0x008a: PHI (r0v24 o.MaxAdapterListener) = (r0v23 o.MaxAdapterListener), (r0v27 o.MaxAdapterListener) binds: [B:27:0x0087, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v25 java.lang.Object) binds: [B:27:0x0087, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[PHI: r0
      0x009b: PHI (r0v26 o.MaxAdapterListener) = (r0v23 o.MaxAdapterListener), (r0v24 o.MaxAdapterListener), (r0v27 o.MaxAdapterListener) binds: [B:27:0x0087, B:30:0x0099, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        MaxAdapterListener maxAdapterListener;
        Object objOnMinimized;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = asInterface + 25;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i7 = IAuthTabCallbackDefault + 57;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-734245794, i3, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:205)");
            }
            if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int i9 = IAuthTabCallbackDefault + 71;
                asInterface = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(352058823);
                    maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    int i10 = 0 / 0;
                    if (!zOnExtraCallback) {
                        int i11 = asInterface + 115;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda8(nativeAdsFullPageV2Activity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        }
                        maxAdapterListener.onExtraCallbackWithResult((Function0) objOnMinimized, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(352058823);
                    maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!zOnExtraCallback2)) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(352419291);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScope, onextracallback, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f)), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 11, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
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
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f));
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent)) {
                    int i13 = asInterface + 1;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                    Object obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullPageV2Activity$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda9(nativeAdsFullPageV2Activity, i, getsupportedhighspeedresolutionsfor2, nativeAdsDto, getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                        obj = externalSyntheticLambda9;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj, quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = asInterface + 57;
            IAuthTabCallbackDefault = i15 % 128;
            int i16 = i15 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i17 = IAuthTabCallbackDefault + 13;
        asInterface = i17 % 128;
        int i18 = i17 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 21;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 3) != 2) {
            int i7 = i4 + 37;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 11;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2066778707, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:200)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2066778707, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:200)");
            }
            getContentValues.onExtraCallback(YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-734245794, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda4(nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199728, 20);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asInterface + 87;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 59 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallbackDefault + 69;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static char[] onExtraCallback = {64961, 64960, 64981, 64982};
        private static char IAuthTabCallback = 51243;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            char c = '0';
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 107;
                    $10 = i6 % 128;
                    if (i6 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - View.resolveSizeAndState(0, 0, 0), View.combineMeasuredStates(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i5 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", c, 0) + 27, 23139 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    }
                    i3 = 2;
                    c = '0';
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - TextUtils.lastIndexOf("", '0', 0, 0), ImageFormat.getBitsPerPixel(0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i7 = $10 + 61;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                                obj = obj2;
                            } else {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 24825), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                                    } else {
                                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                    }
                                } else {
                                    int i12 = $10 + 19;
                                    $11 = i12 % 128;
                                    int i13 = i12 % 2;
                                    try {
                                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                        if (objOnExtraCallback5 == null) {
                                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") + 30, 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                }
                            }
                        } else {
                            defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                int i15 = 0;
                while (i15 < i) {
                    int i16 = $10 + 25;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        cArr4[i15] = (char) (cArr4[i15] ^ 12542);
                        i15 += 22;
                    } else {
                        cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                        i15++;
                    }
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsFullPageV2Activity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a(new char[]{1, 2, 3, 2, 13923, 13923, 2, 1}, (byte) (122 - TextUtils.lastIndexOf("", '0', 0)), 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r2
      0x0026: PHI (r2v4 im.toss.ads_sdk.model.NativeAdsDto) = (r2v3 im.toss.ads_sdk.model.NativeAdsDto), (r2v7 im.toss.ads_sdk.model.NativeAdsDto) binds: [B:10:0x0024, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        NativeAdsDto nativeAdsDtoIAuthTabCallbackStub;
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageV2Activity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i2 = IAuthTabCallbackDefault + 79;
            asInterface = i2 % 128;
            String strIAuthTabCallbackStub = null;
            if (i2 % 2 != 0) {
                nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageV2Activity);
                int i3 = 95 / 0;
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    int i4 = asInterface + 53;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                        strIAuthTabCallbackStub.hashCode();
                        throw null;
                    }
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                }
                if (strIAuthTabCallbackStub == null) {
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new asBinder());
                int i5 = asInterface + 121;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageV2Activity);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                }
                if (strIAuthTabCallbackStub == null) {
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new asBinder());
                int i52 = asInterface + 121;
                IAuthTabCallbackDefault = i52 % 128;
                int i62 = i52 % 2;
            }
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsFullPageV2Activity, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        NativeAdsEventLogType.onExtraCallback onextracallback = null;
        if (i2 % 2 != 0) {
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsFullPageV2Activity.IAuthTabCallbackDefault();
            String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
            if (str != null) {
                onextracallback = new NativeAdsEventLogType.onExtraCallback(str);
                int i3 = IAuthTabCallbackDefault + 123;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, strIAuthTabCallbackStub, adAsset, onextracallback, null, null, null, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda21(nativeAdsFullPageV2Activity, adAsset), 56, null);
            return Unit.INSTANCE;
        }
        nativeAdsFullPageV2Activity.IAuthTabCallbackDefault();
        nativeAdsDto.IAuthTabCallbackStub();
        onextracallback.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 20) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = asInterface + 21;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1781142014, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:259)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i6 = asInterface + 55;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null && extraInfoOnTransact.asBinder()) {
                z = true;
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) ^ true ? f : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(varyMatches.onExtraCallbackWithResult(nativeAdsFullPageV2Activity, Integer.valueOf(getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(context))));
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnNavigationEvent | zOnExtraCallback))) {
                NativeAdsFullPageV2Activity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda1(nativeAdsDto, nativeAdsFullPageV2Activity);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                obj = externalSyntheticLambda1;
                getWindowAreaStatus.IAuthTabCallback(z, fullPage, fIAuthTabCallback, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                getWindowAreaStatus.IAuthTabCallback(z, fullPage, fIAuthTabCallback, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        String str;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        float f2;
        immediateFailedFuture immediatefailedfutureOnWarmupCompleted;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        Object objOnMinimized3;
        boolean zOnNavigationEvent2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 35;
        asInterface = i4 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i4 % 2 == 0 ? (i2 & 3) != 2 : (i2 & 2) != 4, i2 & 1)) {
            int i5 = IAuthTabCallbackDefault + 25;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2034344393, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:140)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                String strOnTransact = fullPage.onTransact();
                str = !StringsKt.isBlank(strOnTransact) ? null : strOnTransact;
                if (str == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1376071525);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent3) {
                        int i7 = IAuthTabCallbackDefault + 55;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized4 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda13(str);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                        }
                        quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized4, 1, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1376184024);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda14();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized5);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                f2 = configuration.screenWidthDp / configuration.screenHeightDp;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = (0.45f <= f2 || f2 > 0.5625f) ? f2 <= 0.5625f ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, 1, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                if (0.45f <= f2 || f2 > 0.5625f) {
                    immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                    int i9 = IAuthTabCallbackDefault + 85;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    immediatefailedfutureOnWarmupCompleted = immediatefailedfutureIAuthTabCallback;
                } else {
                    immediatefailedfutureOnWarmupCompleted = immediateFailedFuture.Companion.onWarmupCompleted();
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda15(nativeAdsDto, nativeAdsFullPageV2Activity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Function0 function0 = (Function0) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                setByteOrder.onExtraCallbackWithResult onextracallbackwithresult3 = setByteOrder.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, onextracallbackwithresult3.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda16();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized2).onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, 0);
                String strIAuthTabCallbackStubProxy = fullPage.IAuthTabCallbackStubProxy();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, onextracallbackwithresult.onExtraCallback());
                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2) {
                    Object obj = objOnMinimized6;
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        NativeAdsFullPageV2Activity$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda17(function0);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                        obj = externalSyntheticLambda17;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted3, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized7 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda18();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized7);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                    AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                    AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strIAuthTabCallbackStubProxy, str, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted4, "AsyncImage", strIAuthTabCallbackStubProxy, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), quirkSettingsLoaderOnExtraCallback, immediatefailedfutureOnWarmupCompleted, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 196608, 0, 1928);
                    GroupableFeatureWhenMappings.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(UseTorchAsFlashQuirk.onExtraCallback(onextracallback, ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6)), 0.0f, 1, (Object) null), ForwardingCameraControl.onExtraCallback(-2066778707, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda19(nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (Function2) null, (Function2) null, 0, onextracallbackwithresult3.IAuthTabCallbackDefault(), 0L, StillCaptureFlashStopRepeatingQuirk.IAuthTabCallback(0, 0, 0, 0), ForwardingCameraControl.onExtraCallback(-1781142014, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda20(nativeAdsDto, fullPage, f, nativeAdsFullPageV2Activity, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 806879280, 188);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult4 = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult4.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent3);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                String strOnTransact2 = fullPage.onTransact();
                if (!StringsKt.isBlank(strOnTransact2)) {
                }
                if (str == null) {
                }
                Configuration configuration2 = (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                f2 = configuration2.screenWidthDp / configuration2.screenHeightDp;
                if (0.45f <= f2) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = (0.45f <= f2 || f2 > 0.5625f) ? f2 <= 0.5625f ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, 0.0f, 1, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                    if (0.45f <= f2) {
                        immediateFailedFuture immediatefailedfutureIAuthTabCallback2 = immediateFailedFuture.Companion.IAuthTabCallback();
                        int i92 = IAuthTabCallbackDefault + 85;
                        asInterface = i92 % 128;
                        int i102 = i92 % 2;
                        immediatefailedfutureOnWarmupCompleted = immediatefailedfutureIAuthTabCallback2;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent | zOnExtraCallback)) {
                            objOnMinimized = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda15(nativeAdsDto, nativeAdsFullPageV2Activity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                            Function0 function02 = (Function0) objOnMinimized;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult32 = setByteOrder.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent22, onextracallbackwithresult32.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            }
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized2).onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, 0);
                            String strIAuthTabCallbackStubProxy2 = fullPage.IAuthTabCallbackStubProxy();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, onextracallbackwithresult4.onExtraCallback());
                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
                            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                            Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent2) {
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        boolean z = false;
        if ((i2 & 3) != 2) {
            int i4 = IAuthTabCallbackDefault + 123;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
        } else {
            int i5 = asInterface + 105;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = asInterface + 9;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 65;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1794952415, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous>.<anonymous> (NativeAdsFullPageV2Activity.kt:139)");
                int i11 = asInterface + 7;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-2034344393, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda0(fullPage, nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, i, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, f, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.Creative.FullPage fullPage, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            Object obj = null;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = asInterface + 95;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-518227937, i, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous> (NativeAdsFullPageV2Activity.kt:97)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-518227937, i, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity.onCreate.<anonymous> (NativeAdsFullPageV2Activity.kt:97)");
            }
            float fOnExtraCallback = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallback();
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(context);
            Object[] objArr = new Object[1];
            a(new char[]{38299, 54835, 38387, 39978, 22236, 40508, 3240, 36829, 46084, 48238, 12007, 44462, 54832, 23060, 18565, 19425, 61494, 30831, 27326, 27037, 4676, 1643, 34047, 14291, 15470, 9289, 42647, 54712, 24176, 49759, 49210, 62038, 30912, 58284, 57902, 36958, 39636, 33244, 15364, 48674, 42174, 44951, 24071, 23567, 50830, 19960, 30761, 31256, 57552, 27586, 39519, 6247, 763, 2518, 46155}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr[0]).intern(), (Context) null, 2, (Object) null);
            Double dIAuthTabCallbackDefault = nativeAdsDto.onTransact().IAuthTabCallbackDefault();
            int iDoubleValue = dIAuthTabCallbackDefault != null ? (int) dIAuthTabCallbackDefault.doubleValue() : 0;
            if (iDoubleValue <= 0) {
                nativeAdsFullPageV2Activity.onExtraCallback(true);
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i4 = IAuthTabCallbackDefault + 69;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(iDoubleValue <= 0), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                if (nativeAdsFullPageV2Activity.onWarmupCompleted() || iDoubleValue <= 0) {
                    z = true;
                } else {
                    int i5 = asInterface + 117;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                }
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageV2Activity);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda5(nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback2) {
                int i7 = asInterface + 91;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda6(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor3);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(1794952415, true, new NativeAdsFullPageV2Activity$.ExternalSyntheticLambda7(fullPage, nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, iDoubleValue, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor2, fOnExtraCallback, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallbackDefault + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 87;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackDefault + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final AdsCircularCountdownLayout IAuthTabCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return adsCircularCountdownLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor, AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(adsCircularCountdownLayout);
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity}, -686973746, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 686973748, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -780955414, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 780955415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, fullPage, Float.valueOf(f), nativeAdsFullPageV2Activity, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 635403766, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -635403760, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (decrementVideoUsage) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage}, 685322367, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -685322359, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, nativeAdsFullPageV2Activity}, -1870385146, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1870385153, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity, adAsset}, 1250590050, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1250590046, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{useandconfigureprogramwithtexture}, 940714663, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -940714660, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity}, 1341766342, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1341766342, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto, nativeAdsFullPageV2Activity, getsupportedhighspeedresolutionsfor}, -1193300215, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1193300220, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackDefault + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullPageV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    static void IAuthTabCallbackStubProxy() {
        IAuthTabCallbackStub = 4559158725430489975L;
    }
}
