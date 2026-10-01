package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.LifecycleEventObserver;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity$;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UseTorchAsFlashQuirk;
import o.VirtualCameraAdapterVirtualCameraCaptureCallback;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
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
import o.toPreviewOnlyRange;
import o.unregisterOutputSurface;
import o.useAndConfigureProgramWithTexture;
import o.varyMatches;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFullPageActivity extends Hilt_NativeAdsFullPageActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asBinder;
    private static long asInterface;

    static {
        IAuthTabCallback_Parcel();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackDefault = 8;
        int i = access000 + 101;
        access100 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsDto.Creative.FullPage fullPage = (NativeAdsDto.Creative.FullPage) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[3];
        Context context = (Context) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsDto, fullPage, fFloatValue, nativeAdsFullPageActivity, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStub + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, useandconfigureprogramwithtexture);
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsDto.Creative.FullPage fullPage = (NativeAdsDto.Creative.FullPage) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        float fFloatValue = ((Number) objArr[7]).floatValue();
        Context context = (Context) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, iIntValue, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fFloatValue, context, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, iIntValue, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fFloatValue, context, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = asBinder + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullPageActivity, str);
        int i4 = IAuthTabCallbackStub + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, i, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 91;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 373807111, -373807104, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i4 = asBinder + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsFullPageActivity, adAsset);
        int i4 = asBinder + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return decrementvideousageIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~(i4 | i7);
        int i11 = i3 | i10 | (~(i8 | i2));
        int i12 = i3 + i2 + i5 + (1997535707 * i) + (1930545336 * i6);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i3) + 1468203008 + ((-417352845) * i2) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i5) + ((-1408630784) * i) + ((-2070937600) * i6) + (392888320 * i13);
        int i15 = (i3 * (-2054695253)) + 138751921 + (i2 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i5 * (-2054694363)) + (i * 1502648999) + (i6 * 931574424) + (i13 * (-2139684864));
        switch (i14 + (i15 * i15 * (-174260224))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
                int i16 = 2 % 2;
                int i17 = asBinder + 11;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                int i19 = asBinder + 119;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                return unitOnExtraCallbackWithResult;
            case 7:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(nativeAdsDto, nativeAdsFullPageActivity);
        }
        onExtraCallback(nativeAdsDto, nativeAdsFullPageActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 115;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1642203873, -1642203869, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i6 = asBinder + 95;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullPageActivity);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = IAuthTabCallbackStub + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.Creative.FullPage fullPage, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 13;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(nativeAdsDto, nativeAdsFullPageActivity, fullPage, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(nativeAdsDto, nativeAdsFullPageActivity, fullPage, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ AdsCircularCountdownLayout onWarmupCompleted(NativeAdsFullPageActivity nativeAdsFullPageActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnExtraCallback = onExtraCallback(nativeAdsFullPageActivity, i, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        return adsCircularCountdownLayoutOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullPageActivity);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = IAuthTabCallbackStub + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallbackStub + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsFullPageActivity, adAsset);
        int i4 = IAuthTabCallbackStub + 89;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallback;
        final /* synthetic */ LifecycleEventObserver onNavigationEvent;

        public onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onExtraCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onNavigationEvent = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.getLifecycle().onExtraCallbackWithResult(this.onNavigationEvent);
            int i4 = IAuthTabCallback + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 23 - TextUtils.lastIndexOf("", '0', 0, 0), 19628 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (asInterface ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 'k' - AndroidCharacter.getMirror('0'), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    public static final class IAuthTabCallback implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsFullPageActivity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    int i3 = 16 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                }
                int i4 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class asInterface implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
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

    public static final class onExtraCallbackWithResult implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onTransact implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto.Reward IAuthTabCallback;

        public onTransact(NativeAdsDto.Reward reward) {
            this.IAuthTabCallback = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.IAuthTabCallback);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                settrimpathoffset.onExtraCallbackWithResult(this.IAuthTabCallback);
                int i3 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        String strIAuthTabCallbackStub;
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        IAuthTabCallbackStub();
        super.onCreate(bundle);
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        String strIAuthTabCallbackStub2 = null;
        if (nativeAdsDtoAsInterface == null || (listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult()) == null) {
            creativeOnExtraCallbackWithResult = null;
        } else {
            int i2 = IAuthTabCallbackStub + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
            if (adAsset != null) {
                creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
                int i4 = IAuthTabCallbackStub + 107;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        NativeAdsDto.Creative.FullPage fullPage = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FullPage ? (NativeAdsDto.Creative.FullPage) creativeOnExtraCallbackWithResult : null;
        if (fullPage == null) {
            setResult(0);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    int i6 = IAuthTabCallbackStub + 23;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    strIAuthTabCallbackStub2 = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub2 != null ? strIAuthTabCallbackStub2 : "", new IAuthTabCallback());
            }
            super.finish();
            return;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub2 != null) {
                int i8 = asBinder + 79;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
                    throw null;
                }
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
            } else {
                strIAuthTabCallbackStub = null;
            }
            nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onExtraCallbackWithResult());
        }
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-988912769, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda11(nativeAdsDtoAsInterface, this, fullPage))), 1, (Object) null);
        int i9 = asBinder + 41;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            return Unit.INSTANCE;
        }
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageActivity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, (Function0) null, 4, (Object) null);
            int i4 = asBinder + 27;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsFullPageActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 49;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i2 = onWarmupCompleted.onNavigationEvent[onextracallbackwithresult.ordinal()];
        if (i2 == 1) {
            AdsCircularCountdownLayout adsCircularCountdownLayoutOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
            if (adsCircularCountdownLayoutOnWarmupCompleted != null) {
                adsCircularCountdownLayoutOnWarmupCompleted.onNavigationEvent();
                int i3 = asBinder + 85;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        int i5 = asBinder + 63;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            if (i2 != 4) {
                return;
            }
        } else if (i2 != 2) {
            return;
        }
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnWarmupCompleted2 = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
        if (adsCircularCountdownLayoutOnWarmupCompleted2 != null) {
            int i6 = IAuthTabCallbackStub + 19;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            adsCircularCountdownLayoutOnWarmupCompleted2.onWarmupCompleted();
        }
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a = {59, -24, -77, -23};
        private static final int $$b = 185;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallback = 1;
        private static long IAuthTabCallback = 7798559133331975163L;
        private static int onExtraCallbackWithResult = -1776194565;
        private static char onWarmupCompleted = 47560;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, short s2) {
            int i;
            int i2;
            int i3 = 110 - s2;
            byte[] bArr = $$a;
            int i4 = (s * 2) + 1;
            int i5 = 4 - (b * 4);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                int i7 = i5;
                int i8 = (-i5) + i6;
                int i9 = i7 + 1;
                i = i2;
                i3 = i8;
                i5 = i9;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                int i10 = i3;
                i7 = i5;
                i5 = bArr[i5];
                i6 = i10;
                int i82 = (-i5) + i6;
                int i92 = i7 + 1;
                i = i2;
                i3 = i82;
                i5 = i92;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $10 + 55;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 43, ImageFormat.getBitsPerPixel(0) + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 49123), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, ((Process.getThreadPriority(0) + 20) >> 6) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0, 0)), 50 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 30, 12578 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsFullPageActivity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a((char) TextUtils.indexOf("", ""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{45771, 33003, 28770, 30758, 894, 32817, 59091, 35172}, new char[]{0, 0, 0, 0}, new char[]{59078, 43686, 41461, 42030}, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    private static final Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackStub = i2 % 128;
        String strIAuthTabCallbackStub = null;
        if (i2 % 2 == 0) {
            NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageActivity);
            throw null;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i3 = asBinder + 121;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageActivity);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i5 = asBinder + 93;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new asInterface());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsFullPageActivity, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) throws Throwable {
        int i = 2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        getFillAlpha.onWarmupCompleted(nativeAdsFullPageActivity.IAuthTabCallbackDefault(), nativeAdsDto.IAuthTabCallbackStub(), adAsset, new NativeAdsEventLogType.onExtraCallback("201"), null, null, null, new NativeAdsFullPageActivity$.ExternalSyntheticLambda15(nativeAdsFullPageActivity, adAsset), 56, null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFullPageActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final AdsCircularCountdownLayout onExtraCallback(NativeAdsFullPageActivity nativeAdsFullPageActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AdsCircularCountdownLayout adsCircularCountdownLayout = new AdsCircularCountdownLayout(context, null, 0, 6, null);
        nativeAdsFullPageActivity.onWarmupCompleted(adsCircularCountdownLayout);
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor, adsCircularCountdownLayout);
        adsCircularCountdownLayout.onWarmupCompleted(i, nativeAdsFullPageActivity.getInterfaceDescriptor(), nativeAdsFullPageActivity.onWarmupCompleted(), new NativeAdsFullPageActivity$.ExternalSyntheticLambda12(nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor2), new NativeAdsFullPageActivity$.ExternalSyntheticLambda13(nativeAdsDto, nativeAdsFullPageActivity));
        int i3 = asBinder + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return adsCircularCountdownLayout;
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        NativeAdsDto.Reward rewardOnExtraCallback;
        int i = 2 % 2;
        if (!(!z) && (extraInfoOnTransact = nativeAdsDto.onTransact()) != null && (rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback()) != null) {
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageActivity.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
            }
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageActivity);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                int i2 = asBinder + 109;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageActivity);
                String strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                if (strIAuthTabCallbackStub == null) {
                    int i4 = asBinder + 33;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    strIAuthTabCallbackStub = "";
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onTransact(rewardOnExtraCallback));
            }
        }
        nativeAdsFullPageActivity.onTransact();
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullPageActivity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            int i4 = IAuthTabCallbackStub + 59;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
        }
        nativeAdsFullPageActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 3;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = IAuthTabCallbackStub + 3;
            asBinder = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(939739168, i3, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:178)");
            }
            if (onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1172787909);
                MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageActivity);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullPageActivity$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda0(nativeAdsFullPageActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                        obj = externalSyntheticLambda0;
                    }
                    maxAdapterListener.onExtraCallbackWithResult((Function0) obj, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1173145928);
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
                    int i6 = IAuthTabCallbackStub + 109;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i8 = IAuthTabCallbackStub + 49;
                    asBinder = i8 % 128;
                    if (i8 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
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
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageActivity);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullPageActivity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda1(nativeAdsFullPageActivity, i, getsupportedhighspeedresolutionsfor2, nativeAdsDto, getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                        obj3 = externalSyntheticLambda1;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj3, quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        NativeAdsFullPageActivity nativeAdsFullPageActivity = (NativeAdsFullPageActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        if ((iIntValue2 & 3) != 2) {
            z = true;
        } else {
            int i2 = IAuthTabCallbackStub + 121;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1))) {
            int i4 = IAuthTabCallbackStub + 99;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1933350479, iIntValue2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:173)");
                }
                getContentValues.onExtraCallback(YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(939739168, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda7(nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, iIntValue, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199728, 20);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getContentValues.onExtraCallback(YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(939739168, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda7(nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, iIntValue, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199728, 20);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 19;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackStub = i2 % 128;
        String strIAuthTabCallbackStub = null;
        if (i2 % 2 == 0) {
            NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageActivity);
            throw null;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullPageActivity);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            int i3 = IAuthTabCallbackStub + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullPageActivity);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i5 = IAuthTabCallbackStub + 55;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    throw null;
                }
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new IAuthTabCallbackStub());
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) nativeAdsFullPageActivity, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, String str) throws Throwable {
        NativeAdsEventLogType.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsFullPageActivity.IAuthTabCallbackDefault();
        String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
        if (str != null) {
            onextracallback = new NativeAdsEventLogType.onExtraCallback(str);
            int i4 = asBinder + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            onextracallback = null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, strIAuthTabCallbackStub, adAsset, onextracallback, null, null, null, new NativeAdsFullPageActivity$.ExternalSyntheticLambda17(nativeAdsFullPageActivity, adAsset), 56, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageActivity nativeAdsFullPageActivity, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = asBinder + 105;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                i3 = 2;
            } else {
                int i7 = asBinder + 39;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = IAuthTabCallbackStub + 13;
            asBinder = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-606308612, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:231)");
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
                int i10 = IAuthTabCallbackStub + 71;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
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
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null && extraInfoOnTransact.asBinder()) {
                z = true;
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(varyMatches.onExtraCallbackWithResult(nativeAdsFullPageActivity, Integer.valueOf(getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(context)))) : f;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                int i11 = asBinder + 7;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    NativeAdsFullPageActivity$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda14(nativeAdsDto, nativeAdsFullPageActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                    obj2 = externalSyntheticLambda14;
                }
                WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(z, fullPage, fIAuthTabCallback, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = IAuthTabCallbackStub + 45;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackStub + 113;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(36218983, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:135)");
                    int i5 = 95 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(36218983, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:135)");
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = IAuthTabCallbackStub + 67;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            String strOnTransact = fullPage.onTransact();
            if (StringsKt.isBlank(strOnTransact)) {
                strOnTransact = null;
            }
            if (strOnTransact != null) {
                int i7 = asBinder + 51;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1659186199);
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnTransact);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1659186199);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnTransact);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new NativeAdsFullPageActivity$.ExternalSyntheticLambda2(strOnTransact);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1659073700);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda3();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            String strIAuthTabCallbackStubProxy = fullPage.IAuthTabCallbackStubProxy();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageActivity);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent2 | zOnExtraCallback)) {
                int i8 = IAuthTabCallbackStub + 111;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    onwarmupcompleted.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized4;
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    NativeAdsFullPageActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda4(nativeAdsDto, nativeAdsFullPageActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj2 = externalSyntheticLambda4;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted);
                immediateFailedFuture immediatefailedfutureOnWarmupCompleted = immediateFailedFuture.Companion.onWarmupCompleted();
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strIAuthTabCallbackStubProxy, strOnTransact, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, "AsyncImage", strIAuthTabCallbackStubProxy, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), quirkSettingsLoaderOnExtraCallback, immediatefailedfutureOnWarmupCompleted, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 1769472, 0, 1928);
                GroupableFeatureWhenMappings.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(UseTorchAsFlashQuirk.onExtraCallback(onextracallback, ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6)), 0.0f, 1, (Object) null), ForwardingCameraControl.onExtraCallback(-1933350479, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda5(nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (Function2) null, (Function2) null, 0, setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, StillCaptureFlashStopRepeatingQuirk.IAuthTabCallback(0, 0, 0, 0), ForwardingCameraControl.onExtraCallback(-606308612, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda6(nativeAdsDto, fullPage, f, nativeAdsFullPageActivity, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 806879280, 188);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = asBinder + 109;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = IAuthTabCallbackStub + 75;
            asBinder = i4 % 128;
            z = i4 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i5 = asBinder + 111;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStub + 41;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(844097215, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:134)");
                    int i8 = 12 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(844097215, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous>.<anonymous> (NativeAdsFullPageActivity.kt:134)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(36218983, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda18(fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, i, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, f, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallbackStub + 3;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.Creative.FullPage fullPage, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int iDoubleValue;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 25;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-988912769, i, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity.onCreate.<anonymous> (NativeAdsFullPageActivity.kt:92)");
            }
            float fOnExtraCallback = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallback();
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(context);
            Object[] objArr = new Object[1];
            a(new char[]{51786, 12693, 15824, 14619, 9565, 8407, 11423, 10328, 5193, 5005, 8157, 6967, 1903, 678, 3750, 2619, 30333, 32162, 31207, 25973, 24951, 27824, 26831, 21710, 20489, 23622, 23426, 18368, 17241, 20293, 19094, 46808, 45677, 48693, 42428, 41380, 44327, 43374, 38079, 37113, 40055, 39009, 34801, 33678, 36809, 35595, 63303, 62145, 65218, 64031, 58963}, Color.red(0) + 64451, objArr);
            LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr[0]).intern(), (Context) null, 2, (Object) null);
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null) {
                int i5 = asBinder + 105;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                Double dIAuthTabCallbackDefault = extraInfoOnTransact.IAuthTabCallbackDefault();
                if (dIAuthTabCallbackDefault != null) {
                    int i7 = IAuthTabCallbackStub + 123;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    iDoubleValue = (int) dIAuthTabCallbackDefault.doubleValue();
                } else {
                    iDoubleValue = 0;
                }
                if (iDoubleValue <= 0) {
                    nativeAdsFullPageActivity.onExtraCallback(true);
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(iDoubleValue <= 0), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    int i9 = IAuthTabCallbackStub + 11;
                    asBinder = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 31 / 0;
                        if (!nativeAdsFullPageActivity.onWarmupCompleted()) {
                            boolean z2 = iDoubleValue <= 0;
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z2), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                    } else if (!(!nativeAdsFullPageActivity.onWarmupCompleted())) {
                    }
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    int i11 = asBinder + 47;
                    IAuthTabCallbackStub = i11 % 128;
                    objOnMinimized3 = i11 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullPageActivity);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda8(nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda9(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor3);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    int i12 = asBinder + 15;
                    IAuthTabCallbackStub = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 / 5;
                    }
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(844097215, true, new NativeAdsFullPageActivity$.ExternalSyntheticLambda10(fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, iDoubleValue, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor2, fOnExtraCallback, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        NativeAdsFullPageActivity$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new NativeAdsFullPageActivity$.ExternalSyntheticLambda16(getsupportedhighspeedresolutionsfor);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda16);
        onExtraCallback onextracallback = new onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda16);
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 35;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 17 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = IAuthTabCallbackStub + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
    }

    private static final AdsCircularCountdownLayout onWarmupCompleted(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return adsCircularCountdownLayout;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor, AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(adsCircularCountdownLayout);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallbackStub + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -825422228, 825422234, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{useandconfigureprogramwithtexture}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 707638726, -707638726, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{nativeAdsFullPageActivity}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1418030783, 1418030785, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{nativeAdsDto, nativeAdsFullPageActivity}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, Float.valueOf(f), context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -153657979, 153657984, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, String str) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2142454425, 2142454426, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{nativeAdsDto, nativeAdsFullPageActivity, str}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageActivity nativeAdsFullPageActivity, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {nativeAdsDto, fullPage, Float.valueOf(f), nativeAdsFullPageActivity, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1331144694, -1331144691, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1642203873, -1642203869, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 373807111, -373807104, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = asBinder + 111;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullPageActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asBinder + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback_Parcel() {
        asInterface = 8283760971501333L;
    }
}
