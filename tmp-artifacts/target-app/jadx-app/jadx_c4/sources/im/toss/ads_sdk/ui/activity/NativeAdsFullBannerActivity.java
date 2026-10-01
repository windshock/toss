package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.features.tosscert.ui.R;
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
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ByteOrderedDataOutputStream;
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
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
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
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UseTorchAsFlashQuirk;
import o.VirtualCameraAdapterVirtualCameraCaptureCallback;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.YuvImageOnePixelShiftQuirk;
import o.ZslDisablerQuirk;
import o.accessgetCameraFactoryp;
import o.addOnAdapterChangeListener;
import o.calculatePageOffsets;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.decrementVideoUsage;
import o.deleteProfile;
import o.getAwbState;
import o.getContentValues;
import o.getFillAlpha;
import o.getStrokeWidth;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;
import o.isZslDisabledByByUserCaseConfig;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.readIntokhttp;
import o.requestPostMessageChannel;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setByteOrder;
import o.setMaxAdCount;
import o.setPostviewFormatSelector;
import o.setTrimPathOffset;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.varyMatches;
import o.verifyDrawable;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFullBannerActivity extends Hilt_NativeAdsFullBannerActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static boolean IAuthTabCallbackDefault = false;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static boolean access000;
    private static int access100;
    public static final int asBinder;
    private static int asInterface;
    private static int getInterfaceDescriptor;

    static {
        access100();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = IAuthTabCallback_Parcel + 125;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }

    public static /* synthetic */ AdsCircularCountdownLayout IAuthTabCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnWarmupCompleted = onWarmupCompleted(nativeAdsFullBannerActivity, i, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
        int i5 = access100 + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return adsCircularCountdownLayoutOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsFullBannerActivity nativeAdsFullBannerActivity = (NativeAdsFullBannerActivity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-570843354, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsFullBannerActivity, adAsset}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 570843361);
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullBannerActivity);
        int i4 = IAuthTabCallbackStubProxy + 23;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackStubProxy + 81;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullBannerActivity nativeAdsFullBannerActivity = (NativeAdsFullBannerActivity) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsDto, nativeAdsFullBannerActivity, str, zBooleanValue);
        int i4 = IAuthTabCallbackStubProxy + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStubProxy + 83;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onWarmupCompleted(-2070137491, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 2070137495);
        int i4 = access100 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousage;
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        nativeAdsFullBannerActivity.onWarmupCompleted(nativeAdsDto, z, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 63 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(nativeAdsDto, nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsDto, nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
        int i3 = access100 + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStubProxy + 69;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9 | (~(i8 | i4));
        int i11 = ~i4;
        int i12 = (~(i11 | i8 | i)) | (~(i7 | i11 | i6));
        int i13 = i + i6 + i5 + ((-195996979) * i2) + ((-904719387) * i3);
        int i14 = i13 * i13;
        int i15 = (i * 1886715248) + 940376064 + (1886715248 * i6) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i5) + ((-1389494272) * i2) + (1623064576 * i3) + (1510801408 * i14);
        int i16 = (i * 1590984816) + 1398186415 + (i6 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i5 * 1590985553) + (i2 * (-1025631779)) + (i3 * 1121679989) + (i14 * 622657536);
        switch (i15 + (i16 * i16 * (-1928134656))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[2], "");
                NativeAdsFullBannerActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda5(getsupportedhighspeedresolutionsfor);
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda5);
                IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda5);
                int i18 = IAuthTabCallbackStubProxy + 87;
                access100 = i18 % 128;
                int i19 = i18 % 2;
                return iAuthTabCallbackDefault;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onWarmupCompleted(1516015979, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{fullBanner, nativeAdsDto, Float.valueOf(f), nativeAdsFullBannerActivity, context, Integer.valueOf(i), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1516015973);
        int i6 = access100 + 5;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-1038565051, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsDto, nativeAdsFullBannerActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 1038565051);
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto.Creative.FullBanner fullBanner, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 121;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(88414104, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsDto, nativeAdsFullBannerActivity, fullBanner, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -88414099);
        int i5 = access100 + 117;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(nativeAdsDto, nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, z);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsDto, nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, z);
        int i3 = access100 + 51;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(nativeAdsFullBannerActivity, nativeAdsDto, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(nativeAdsFullBannerActivity, nativeAdsDto, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, z2, nativeAdsDto, nativeAdsFullBannerActivity);
        int i4 = access100 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LifecycleEventObserver onExtraCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onWarmupCompleted;

        public IAuthTabCallbackDefault(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onWarmupCompleted = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.getLifecycle().onExtraCallbackWithResult(this.onExtraCallback);
            int i4 = onNavigationEvent + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullBannerActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        String str;
        String strIAuthTabCallbackStub;
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        IAuthTabCallbackStub();
        super.onCreate(bundle);
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        String strIAuthTabCallbackStub2 = null;
        if (nativeAdsDtoAsInterface != null) {
            int i2 = IAuthTabCallbackStubProxy + 117;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult == null || (adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult)) == null) {
                creativeOnExtraCallbackWithResult = null;
            } else {
                int i4 = IAuthTabCallbackStubProxy + 79;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    adAsset.onExtraCallbackWithResult();
                    throw null;
                }
                creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
            }
        }
        NativeAdsDto.Creative.FullBanner fullBanner = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FullBanner ? (NativeAdsDto.Creative.FullBanner) creativeOnExtraCallbackWithResult : null;
        str = "";
        if (fullBanner == null) {
            setResult(0);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                int i5 = IAuthTabCallbackStubProxy + 53;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                if (nativeAdsDtoIAuthTabCallbackStub != null) {
                    int i7 = access100 + 31;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    if (i7 % 2 == 0) {
                        nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                        strIAuthTabCallbackStub2.hashCode();
                        throw null;
                    }
                    strIAuthTabCallbackStub2 = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub2 != null ? strIAuthTabCallbackStub2 : "", new onWarmupCompleted());
            }
            super.finish();
            return;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub2 != null) {
                int i8 = IAuthTabCallbackStubProxy + 17;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
                    int i9 = 32 / 0;
                } else {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub();
                }
            } else {
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub != null) {
                int i10 = IAuthTabCallbackStubProxy + 63;
                access100 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                str = strIAuthTabCallbackStub;
            }
            nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(str, new onExtraCallback());
        }
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1661912607, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda6(nativeAdsDtoAsInterface, this, fullBanner))), 1, (Object) null);
    }

    public static final class asBinder implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent();
                int i4 = IAuthTabCallback + 33;
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

    public static final class onExtraCallback implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setTrimPathOffset) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        public final void onNavigationEvent(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                    int i3 = 55 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallback();
                }
                int i4 = onNavigationEvent + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.Reward onNavigationEvent;

        public onExtraCallbackWithResult(NativeAdsDto.Reward reward) {
            this.onNavigationEvent = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return unit2;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onExtraCallbackWithResult(this.onNavigationEvent);
                int i4 = onExtraCallbackWithResult + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsFullBannerActivity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = IAuthTabCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i2 = onNavigationEvent.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        if (i2 == 1) {
            AdsCircularCountdownLayout adsCircularCountdownLayoutOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
            if (adsCircularCountdownLayoutOnNavigationEvent != null) {
                adsCircularCountdownLayoutOnNavigationEvent.onNavigationEvent();
                return;
            }
            return;
        }
        int i3 = IAuthTabCallbackStubProxy + 121;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            if (i2 != 4) {
                return;
            }
        } else if (i2 != 2) {
            return;
        }
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnNavigationEvent2 = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout>) getsupportedhighspeedresolutionsfor);
        if (adsCircularCountdownLayoutOnNavigationEvent2 != null) {
            int i4 = IAuthTabCallbackStubProxy + 57;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                adsCircularCountdownLayoutOnNavigationEvent2.onWarmupCompleted();
            } else {
                adsCircularCountdownLayoutOnNavigationEvent2.onWarmupCompleted();
                int i5 = 21 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFullBannerActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 55;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AdsCircularCountdownLayout onWarmupCompleted(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AdsCircularCountdownLayout adsCircularCountdownLayout = new AdsCircularCountdownLayout(context, null, 0, 6, null);
        nativeAdsFullBannerActivity.onWarmupCompleted(adsCircularCountdownLayout);
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, adsCircularCountdownLayout);
        adsCircularCountdownLayout.onWarmupCompleted(i, nativeAdsFullBannerActivity.getInterfaceDescriptor(), nativeAdsFullBannerActivity.onWarmupCompleted(), new NativeAdsFullBannerActivity$.ExternalSyntheticLambda15(nativeAdsDto, nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor2), new NativeAdsFullBannerActivity$.ExternalSyntheticLambda16(nativeAdsDto, nativeAdsFullBannerActivity));
        int i3 = IAuthTabCallbackStubProxy + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return adsCircularCountdownLayout;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallbackStub;
        float f = 0.0f;
        if (cArr4 != null) {
            int i3 = $10 + 33;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 77 - Drawable.resolveOpacity(0, 0), 20952 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 75 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (access000) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.blue(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!IAuthTabCallbackDefault) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i5 = $10 + 37;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r2
      0x0034: PHI (r2v5 o.calculatePageOffsets) = (r2v4 o.calculatePageOffsets), (r2v12 o.calculatePageOffsets) binds: [B:12:0x0032, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        NativeAdsDto.Reward rewardOnExtraCallback;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (z && (rewardOnExtraCallback = nativeAdsDto.onTransact().onExtraCallback()) != null) {
            int i4 = access100 + 53;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent();
                int i5 = 42 / 0;
                if (calculatepageoffsetsOnNavigationEvent != null) {
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
                }
                nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullBannerActivity);
                if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                    NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullBannerActivity);
                    String strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                    if (strIAuthTabCallbackStub == null) {
                        strIAuthTabCallbackStub = "";
                    }
                    nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onExtraCallbackWithResult(rewardOnExtraCallback));
                }
            } else {
                calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent != null) {
                }
                nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullBannerActivity);
                if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                }
            }
        }
        nativeAdsFullBannerActivity.onTransact();
        onWarmupCompleted(530326980, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor, true}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -530326978);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullBannerActivity nativeAdsFullBannerActivity = (NativeAdsFullBannerActivity) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            int i4 = access100 + 3;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
        }
        nativeAdsFullBannerActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope)) {
                int i6 = IAuthTabCallbackStubProxy + 21;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i8 = access100 + 9;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = access100 + 13;
                IAuthTabCallbackStubProxy = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-774999488, i3, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:150)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-774999488, i3, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:150)");
            }
            if (onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1734505637);
                MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerActivity);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda2(nativeAdsFullBannerActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                        obj2 = externalSyntheticLambda2;
                    }
                    maxAdapterListener.onExtraCallbackWithResult((Function0) obj2, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1734863935);
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
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerActivity);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerActivity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda3(nativeAdsFullBannerActivity, i, getsupportedhighspeedresolutionsfor2, nativeAdsDto, getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                        obj3 = externalSyntheticLambda3;
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
            int i11 = access100 + 21;
            IAuthTabCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = access100 + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = access100 + 37;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = IAuthTabCallbackStubProxy + 111;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1617861807, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:145)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1617861807, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:145)");
            }
            getContentValues.onExtraCallback(YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-774999488, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda1(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199728, 20);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ?? r0 = (NativeAdsFullBannerActivity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r0);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r0);
            String strIAuthTabCallbackStub = null;
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i4 = access100 + 85;
                IAuthTabCallbackStubProxy = i4 % 128;
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
            int i5 = access100 + 115;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r0, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback {
        private static short[] onWarmupCompleted;
        private static final byte[] $$a = {117, -24, -14, 98};
        private static final int $$b = 141;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private static int onExtraCallback = 1978988540;
        private static int IAuthTabCallback = -1538795420;
        private static int onExtraCallbackWithResult = -1399027451;
        private static byte[] onNavigationEvent = {-91, 91, -88, -91, 87, -87, 91, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, int i2) {
            int i3;
            int i4 = i * 3;
            byte[] bArr = $$a;
            int i5 = (s * 4) + 115;
            int i6 = 3 - (i2 * 4);
            byte[] bArr2 = new byte[1 - i4];
            int i7 = 0 - i4;
            if (bArr == null) {
                i5 = i7;
                int i8 = i6;
                int i9 = 0;
                i5 += -i6;
                i6 = i8;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                int i10 = i6 + 1;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i11 = i3 + 1;
                i8 = i10;
                i6 = bArr[i10];
                i9 = i11;
                i5 += -i6;
                i6 = i8;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                int i102 = i6 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                int i1022 = i6 + 1;
                if (i3 == i7) {
                }
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                char c = '0';
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 43376), ExpandableListView.getPackedPositionChild(0L) + 43, ImageFormat.getBitsPerPixel(0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $11 + 25;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = onNavigationEvent;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $10 + 103;
                            $11 = i11 % 128;
                            int i12 = i11 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 12843);
                                int i13 = 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int iLastIndexOf = TextUtils.lastIndexOf("", c) + 2168;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, i13, iLastIndexOf, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i6 = 2;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                        i5 = 2;
                    } else {
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                        int i14 = $11 + 9;
                        $10 = i14 % 128;
                        i5 = 2;
                        if (i14 % 2 != 0) {
                            int i15 = 4 % 4;
                        }
                    }
                } else {
                    i5 = 2;
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - i5) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), KeyEvent.normalizeMetaState(0) + 86, Color.blue(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i16 = $11 + 117;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsFullBannerActivity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 95), (ViewConfiguration.getLongPressTimeout() >> 16) + 776785932, (-148590747) - Gravity.getAbsoluteGravity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 100, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onTransact + 19;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 57 / 0;
            }
            return intent;
        }
    }

    private static final Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, String str, boolean z) throws Throwable {
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        NativeAdsEventLogType.onExtraCallback onextracallback;
        int i = 2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        if (z) {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsFullBannerActivity.IAuthTabCallbackDefault();
            String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
            if (str != null) {
                onextracallback = new NativeAdsEventLogType.onExtraCallback(str);
                int i2 = access100 + 35;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = IAuthTabCallbackStubProxy + 9;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                onextracallback = null;
            }
            getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, strIAuthTabCallbackStub, adAsset, onextracallback, null, null, null, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda4(nativeAdsFullBannerActivity, adAsset), 56, null);
        } else if (str != null && (calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent()) != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, new NativeAdsEventLogType.onExtraCallback(str), (Function1) null, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
            if (onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
                calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent != null) {
                    int i4 = access100 + 65;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
                }
                nativeAdsFullBannerActivity.finish();
                int i6 = IAuthTabCallbackStubProxy + 29;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            } else if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
            }
        } else if (!onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        NativeAdsDto.Creative.FullBanner fullBanner;
        boolean z;
        NativeAdsDto.Creative.FullBanner fullBanner2 = (NativeAdsDto.Creative.FullBanner) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        ?? r6 = (NativeAdsFullBannerActivity) objArr[3];
        Context context = (Context) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[7];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i2 = access100 + 7;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = access100 + 31;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971114780, iIntValue2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:203)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971114780, iIntValue2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:203)");
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
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                fullBanner = fullBanner2;
            } else {
                int i5 = access100 + 43;
                fullBanner = fullBanner2;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            boolean zAsBinder = nativeAdsDto.onTransact().asBinder();
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fFloatValue, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f))) {
                fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(varyMatches.onExtraCallbackWithResult((Context) r6, Integer.valueOf(getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(context))));
            }
            deleteProfile deleteprofileAsBinder = r6.asBinder();
            boolean zOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            if (iIntValue > 0) {
                int i7 = IAuthTabCallbackStubProxy + 85;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback((Object) r6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    NativeAdsFullBannerActivity$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda11(nativeAdsDto, (NativeAdsFullBannerActivity) r6);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                    obj = externalSyntheticLambda11;
                }
                Function2 function2 = (Function2) obj;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback((Object) r6);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent2 | zOnExtraCallback3)) {
                    int i9 = IAuthTabCallbackStubProxy + 67;
                    access100 = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerActivity$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda12(nativeAdsDto, (NativeAdsFullBannerActivity) r6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                        obj3 = externalSyntheticLambda12;
                    }
                    Boolean boolValueOf = Boolean.valueOf(zAsBinder);
                    Float fValueOf = Float.valueOf(fFloatValue);
                    Boolean boolValueOf2 = Boolean.valueOf(zOnExtraCallback);
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onNavigationEvent(44250978, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{fullBanner, boolValueOf, fValueOf, deleteprofileAsBinder, boolValueOf2, boolValueOf3, function2, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -44250977, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1311528711, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:124)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            Resources resources = nativeAdsFullBannerActivity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                int i4 = IAuthTabCallbackStubProxy + 125;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(434552738);
                quirksExternalSyntheticBackport0OnExtraCallback = (QuirksExternalSyntheticBackport0) setMaxAdCount.onNavigationEvent(-53108025, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{onextracallback, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L)), setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(4279836456L))}), Float.valueOf(90.0f), 0, cameraCaptureResultEmptyCameraCaptureResult, 438, 4}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 53108030);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i6 = access100 + 59;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(434831955);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(onextracallback, setByteOrder.Companion.asBinder(), (toMetersPerSecond) null, 2, (Object) null);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnNavigationEvent.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = IAuthTabCallbackStubProxy + 119;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    int i9 = 58 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
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
            GroupableFeatureWhenMappings.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(UseTorchAsFlashQuirk.onExtraCallback(onextracallback, ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6)), 0.0f, 1, (Object) null), ForwardingCameraControl.onExtraCallback(-1617861807, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda13(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (Function2) null, (Function2) null, 0, setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, StillCaptureFlashStopRepeatingQuirk.IAuthTabCallback(0, 0, 0, 0), ForwardingCameraControl.onExtraCallback(1971114780, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda14(fullBanner, nativeAdsDto, f, nativeAdsFullBannerActivity, context, i, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 806879280, 188);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i4 % 2 != 0 ? (i2 & 3) != 2 : (i2 & 4) != 4, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = access100 + 81;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2124633761, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous>.<anonymous> (NativeAdsFullBannerActivity.kt:123)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1311528711, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda0(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        boolean z;
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullBannerActivity nativeAdsFullBannerActivity = (NativeAdsFullBannerActivity) objArr[1];
        NativeAdsDto.Creative.FullBanner fullBanner = (NativeAdsDto.Creative.FullBanner) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = access100 + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            z = i2 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i3 = access100 + 113;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1661912607, iIntValue, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.onCreate.<anonymous> (NativeAdsFullBannerActivity.kt:88)");
            }
            float fOnExtraCallback = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallback();
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(context);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-114, -115, -125, -118, -117, -115, -117, -116, -111, -112, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr2[0]).intern(), (Context) null, 2, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(nativeAdsFullBannerActivity.onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Double dIAuthTabCallbackDefault = nativeAdsDto.onTransact().IAuthTabCallbackDefault();
            int iDoubleValue = dIAuthTabCallbackDefault != null ? (int) dIAuthTabCallbackDefault.doubleValue() : 0;
            if (iDoubleValue <= 0) {
                onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
                onWarmupCompleted(530326980, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2, true}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -530326978);
                nativeAdsFullBannerActivity.onExtraCallback(true);
            }
            nativeAdsFullBannerActivity.onWarmupCompleted(nativeAdsDto, onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2), cameraCaptureResultEmptyCameraCaptureResult, 0);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i4 = access100 + 111;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i6 = IAuthTabCallbackStubProxy + 91;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    onwarmupcompleted.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda7(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor3);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(-2124633761, true, new NativeAdsFullBannerActivity$.ExternalSyntheticLambda8(nativeAdsFullBannerActivity, getsupportedhighspeedresolutionsfor, iDoubleValue, nativeAdsDto, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor2, fullBanner, fOnExtraCallback, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackStubProxy + 79;
            access100 = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r8 != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r8 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (!z) {
            int i2 = IAuthTabCallbackStubProxy + 57;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
            }
        }
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerActivity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, (Function0) null, 4, (Object) null);
            int i4 = access100 + 61;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsFullBannerActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(NativeAdsDto nativeAdsDto, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = access100 + 113;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1784574937);
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(nativeAdsDto)) {
                i5 = 2;
            } else {
                int i9 = IAuthTabCallbackStubProxy + 83;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IAuthTabCallbackStubProxy + 91;
            access100 = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i13 = access100 + 97;
                IAuthTabCallbackStubProxy = i13 % 128;
                int i14 = i13 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                int i15 = access100 + 101;
                IAuthTabCallbackStubProxy = i15 % 128;
                i3 = i15 % 2 == 0 ? 15283 : 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
            int i16 = IAuthTabCallbackStubProxy + 39;
            access100 = i16 % 128;
            int i17 = i16 % 2;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 2048 : 1024;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i18 = IAuthTabCallbackStubProxy + 75;
            access100 = i18 % 128;
            int i19 = i18 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i20 = IAuthTabCallbackStubProxy + 47;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1784574937, i2, -1, "im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity.NativeBackHandler (NativeAdsFullBannerActivity.kt:258)");
            }
            boolean z4 = (i2 & 112) == 32;
            boolean z5 = !((i2 & 896) != 256);
            if ((i2 & 14) == 4) {
                int i22 = access100 + 13;
                IAuthTabCallbackStubProxy = i22 % 128;
                int i23 = i22 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z4 | z5 | z3 | zOnExtraCallback)) {
                int i24 = access100 + 69;
                IAuthTabCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new NativeAdsFullBannerActivity$.ExternalSyntheticLambda9(z, z2, nativeAdsDto, this);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                requestPostMessageChannel.onExtraCallbackWithResult(true, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullBannerActivity$.ExternalSyntheticLambda10(this, nativeAdsDto, z, z2, i));
        }
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = access100 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final AdsCircularCountdownLayout onNavigationEvent(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 33;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return adsCircularCountdownLayout;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor, AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(adsCircularCountdownLayout);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = access100 + 125;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, String str, boolean z) {
        return (Unit) onWarmupCompleted(-637388252, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsDto, nativeAdsFullBannerActivity, str, Boolean.valueOf(z)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 637388255);
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto.AdAsset adAsset) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1545723837, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsFullBannerActivity, adAsset}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 1545723838);
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto.Creative.FullBanner fullBanner, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(88414104, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsDto, nativeAdsFullBannerActivity, fullBanner, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -88414099);
    }

    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerActivity nativeAdsFullBannerActivity) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1038565051, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsDto, nativeAdsFullBannerActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 1038565051);
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerActivity nativeAdsFullBannerActivity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(1516015979, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{fullBanner, nativeAdsDto, Float.valueOf(f), nativeAdsFullBannerActivity, context, Integer.valueOf(i), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1516015973);
    }

    private static final Unit onExtraCallback(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, NativeAdsDto.AdAsset adAsset) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-570843354, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{nativeAdsFullBannerActivity, adAsset}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 570843361);
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        onWarmupCompleted(530326980, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -530326978);
    }

    private static final decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (decrementVideoUsage) onWarmupCompleted(-2070137491, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 2070137495);
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullBannerActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullBannerActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullBannerActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsFullBannerActivity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void access100() {
        IAuthTabCallbackStub = new char[]{32486, 32274, 32286, 32275, 32468, 32479, 32493, 32485, 32483, 32472, 32287, 32281, 32280, 32487, 32466, 32278, 32473};
        asInterface = -1184334194;
        IAuthTabCallbackDefault = true;
        access000 = true;
    }
}
