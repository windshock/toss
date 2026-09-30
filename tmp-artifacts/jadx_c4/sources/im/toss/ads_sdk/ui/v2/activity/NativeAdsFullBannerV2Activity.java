package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.usshome.UssHomeItemAdapter$;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
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
import o.UseTorchAsFlashQuirk;
import o.VirtualCameraAdapterVirtualCameraCaptureCallback;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.YuvImageOnePixelShiftQuirk;
import o.ZslDisablerQuirk;
import o.accessgetCameraFactoryp;
import o.addOnAdapterChangeListener;
import o.addRearDisplayStatusListener;
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
public final class NativeAdsFullBannerV2Activity extends Hilt_NativeAdsFullBannerV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallbackDefault = null;
    public static final int IAuthTabCallbackStub;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static int getInterfaceDescriptor = 1;

    static {
        IAuthTabCallback_Parcel();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = IAuthTabCallback_Parcel + 39;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 115;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        nativeAdsFullBannerV2Activity.IAuthTabCallback(nativeAdsDto, z, z2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = access100 + 5;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 105;
        access000 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = access100 + 17;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 43;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = access000 + 101;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[1];
        NativeAdsDto.Creative.FullBanner fullBanner = (NativeAdsDto.Creative.FullBanner) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullBannerV2Activity, fullBanner, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = access100 + 75;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{nativeAdsFullBannerV2Activity}, iOnExtraCallbackWithResult2, 1893797338, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -1893797333);
        }
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, z2, nativeAdsDto, nativeAdsFullBannerV2Activity);
        int i4 = access000 + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(nativeAdsDto, nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsDto, nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
        int i3 = access000 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto nativeAdsDto, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsFullBannerV2Activity, nativeAdsDto, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 101;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, Float.valueOf(f), context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 2147044197, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -2147044193);
        int i6 = access100 + 91;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 39;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access100 + 69;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = access000 + 35;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage);
        }
        IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AdsCircularCountdownLayout onNavigationEvent(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        int i3 = access100 + 45;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsFullBannerV2Activity, i, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        int i6 = access100 + 29;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return adsCircularCountdownLayoutOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsDto, nativeAdsFullBannerV2Activity);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = access100 + 89;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{nativeAdsFullBannerV2Activity, adAsset}, iOnExtraCallbackWithResult5, 2034201803, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, -2034201803);
        int i3 = access100 + 11;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9 | (~(i8 | i4));
        int i11 = ~i4;
        int i12 = (~(i11 | i8 | i3)) | (~(i7 | i11 | i6));
        int i13 = i3 + i6 + i2 + ((-195996979) * i5) + ((-904719387) * i);
        int i14 = i13 * i13;
        int i15 = (i3 * 1886715248) + 940376064 + (1886715248 * i6) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i2) + ((-1389494272) * i5) + (1623064576 * i) + (1510801408 * i14);
        int i16 = (i3 * 1590984816) + 1398186415 + (i6 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i2 * 1590985553) + (i5 * (-1025631779)) + (i * 1121679989) + (i14 * 622657536);
        switch (i15 + (i16 * i16 * (-1928134656))) {
            case 1:
                NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
                NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[1];
                String str = (String) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                int i17 = 2 % 2;
                int i18 = access100 + 49;
                access000 = i18 % 128;
                int i19 = i18 % 2;
                Object[] objArr2 = {nativeAdsDto, nativeAdsFullBannerV2Activity, str, Boolean.valueOf(zBooleanValue)};
                int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                Unit unit = (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 408233782, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -408233779);
                int i20 = access000 + 117;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(fullBanner, nativeAdsDto, f, nativeAdsFullBannerV2Activity, context, i, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 57;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsDto, nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, z);
        int i4 = access100 + 115;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallback;
        final /* synthetic */ LifecycleEventObserver onWarmupCompleted;

        public asInterface(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.IAuthTabCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onWarmupCompleted = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.getLifecycle().onExtraCallbackWithResult(this.onWarmupCompleted);
            int i4 = onNavigationEvent + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[PHI: r9
      0x0050: PHI (r9v10 im.toss.ads_sdk.NativeAdsManager) = (r9v9 im.toss.ads_sdk.NativeAdsManager), (r9v11 im.toss.ads_sdk.NativeAdsManager) binds: [B:22:0x004e, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String str;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        IAuthTabCallbackStub();
        super.onCreate(bundle);
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = (nativeAdsDtoAsInterface == null || (listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult()) == null || (adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult)) == null) ? null : adAsset.onExtraCallbackWithResult();
        NativeAdsDto.Creative.FullBanner fullBanner = creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FullBanner ? (NativeAdsDto.Creative.FullBanner) creativeOnExtraCallbackWithResult : null;
        str = "";
        if (fullBanner != null) {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault2 = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault2 != null) {
                int i2 = access100 + 97;
                access000 = i2 % 128;
                if (i2 % 2 == 0) {
                    NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                    throw null;
                }
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                String strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub != null ? nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub() : null;
                nativeAdsManagerIAuthTabCallbackDefault2.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onExtraCallback());
            }
            requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-712467803, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda12(nativeAdsDtoAsInterface, this, fullBanner))), 1, (Object) null);
            return;
        }
        int i3 = access100 + 95;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            setResult(1);
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                NativeAdsDto nativeAdsDtoIAuthTabCallbackStub2 = NativeAdsBaseActivity.IAuthTabCallbackStub(this);
                String strIAuthTabCallbackStub2 = nativeAdsDtoIAuthTabCallbackStub2 != null ? nativeAdsDtoIAuthTabCallbackStub2.IAuthTabCallbackStub() : null;
                if (strIAuthTabCallbackStub2 != null) {
                    int i4 = access100 + 3;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    str = strIAuthTabCallbackStub2;
                }
                nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(str, new onExtraCallbackWithResult());
            }
        } else {
            setResult(0);
            nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(this);
            if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            }
        }
        super.finish();
    }

    public static final class onExtraCallback implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onExtraCallback();
                int i4 = IAuthTabCallback + 125;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.EXECUTION_FAIL;
                int code = addonadapterchangelistener.getCode();
                String string = NativeAdsFullBannerV2Activity.this.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                int i2 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 13 / 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onTransact implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                settrimpathoffset.onNavigationEvent();
                int i3 = onNavigationEvent + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ NativeAdsDto.Reward onNavigationEvent;

        public onWarmupCompleted(NativeAdsDto.Reward reward) {
            this.onNavigationEvent = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onNavigationEvent);
                    int i3 = 52 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.onNavigationEvent);
                }
                int i4 = IAuthTabCallback + 15;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r3 = onExtraCallback((o.getSupportedHighSpeedResolutionsFor<im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout>) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r3.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r3 = onExtraCallback((o.getSupportedHighSpeedResolutionsFor<im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout>) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r4 = im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.access100 + 63;
        im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.access000 = r4 % 128;
        r4 = r4 % 2;
        r3.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r4 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r4 != 2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 3;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            i = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsFullBannerV2Activity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    private static final AdsCircularCountdownLayout onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AdsCircularCountdownLayout adsCircularCountdownLayout = new AdsCircularCountdownLayout(context, null, 0, 6, null);
        nativeAdsFullBannerV2Activity.onWarmupCompleted(adsCircularCountdownLayout);
        onExtraCallback(getsupportedhighspeedresolutionsfor, adsCircularCountdownLayout);
        adsCircularCountdownLayout.setV2Style(true);
        adsCircularCountdownLayout.onWarmupCompleted(i, nativeAdsFullBannerV2Activity.getInterfaceDescriptor(), nativeAdsFullBannerV2Activity.onWarmupCompleted(), new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda9(nativeAdsDto, nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor2), new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda10(nativeAdsDto, nativeAdsFullBannerV2Activity));
        int i3 = access000 + 27;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return adsCircularCountdownLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackDefault;
        if (cArr2 != null) {
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 77, 20952 - TextUtils.getCapsMode("", 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), Drawable.resolveOpacity(0, 0) + 75, 16036 - Process.getGidForName(""), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (IAuthTabCallbackStubProxy) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $10 + 117;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 63;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Process.getGidForName("") + 64, 12214 - TextUtils.getCapsMode("", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[PHI: r1
      0x002d: PHI (r1v5 o.calculatePageOffsets) = (r1v4 o.calculatePageOffsets), (r1v13 o.calculatePageOffsets) binds: [B:14:0x002b, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        NativeAdsDto.Reward rewardOnExtraCallback;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        if (z && (extraInfoOnTransact = nativeAdsDto.onTransact()) != null && (rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback()) != null) {
            int i2 = access100 + 97;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent();
                int i3 = 38 / 0;
                if (calculatepageoffsetsOnNavigationEvent != null) {
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
                }
                nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullBannerV2Activity);
                if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                    int i4 = access100 + 113;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(nativeAdsFullBannerV2Activity);
                    if (nativeAdsDtoIAuthTabCallbackStub != null) {
                        int i6 = access000 + 105;
                        access100 = i6 % 128;
                        if (i6 % 2 != 0) {
                            strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                            int i7 = 50 / 0;
                        } else {
                            strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                        }
                    } else {
                        strIAuthTabCallbackStub = null;
                    }
                    if (strIAuthTabCallbackStub == null) {
                        strIAuthTabCallbackStub = "";
                    }
                    nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onWarmupCompleted(rewardOnExtraCallback));
                }
            } else {
                calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent();
                if (calculatepageoffsetsOnNavigationEvent != null) {
                }
                nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(nativeAdsFullBannerV2Activity);
                if (nativeAdsManagerIAuthTabCallbackDefault != null) {
                }
            }
        }
        nativeAdsFullBannerV2Activity.onTransact();
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) throws NoWhenBranchMatchedException {
        String strIAuthTabCallbackStub;
        Function0 function0;
        int i;
        int i2 = 2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            int i3 = access000 + 111;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                function0 = null;
                i = 2;
            } else {
                strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                function0 = null;
                i = 4;
            }
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, strIAuthTabCallbackStub, adAsset, function0, i, null);
        }
        nativeAdsFullBannerV2Activity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 9;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
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
            int i5 = access100 + 3;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access100 + 3;
                access000 = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-803850396, i3, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:141)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-803850396, i3, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:141)");
            }
            if (onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1230564609);
                MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerV2Activity);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda7(nativeAdsFullBannerV2Activity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                        obj2 = externalSyntheticLambda7;
                    }
                    maxAdapterListener.onExtraCallbackWithResult((Function0) obj2, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1230925418);
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
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerV2Activity);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda8(nativeAdsFullBannerV2Activity, i, getsupportedhighspeedresolutionsfor2, nativeAdsDto, getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                        obj3 = externalSyntheticLambda8;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj3, quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access100 + 47;
                access000 = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 18 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = access000 + 23;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1162223923, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:136)");
            }
            getContentValues.onExtraCallback(YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-803850396, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda2(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199728, 20);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = access100 + 49;
                access000 = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = access100 + 1;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strIAuthTabCallbackStub;
        ?? r0 = (NativeAdsFullBannerV2Activity) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = NativeAdsBaseActivity.IAuthTabCallbackDefault(r0);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = NativeAdsBaseActivity.IAuthTabCallbackStub(r0);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i2 = access000 + 101;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            } else {
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub == null) {
                int i4 = access100 + 21;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onTransact());
            int i6 = access100 + 69;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        getStrokeWidth.onExtraCallback.onNavigationEvent((Context) r0, adAsset.onExtraCallbackWithResult().onWarmupCompleted());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent;
        NativeAdsEventLogType.onExtraCallback onextracallback;
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        if (!(!zBooleanValue)) {
            int i2 = access000 + 47;
            access100 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = nativeAdsFullBannerV2Activity.IAuthTabCallbackDefault();
                String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                if (str != null) {
                    NativeAdsEventLogType.onExtraCallback onextracallback2 = new NativeAdsEventLogType.onExtraCallback(str);
                    int i3 = access100 + 73;
                    access000 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 / 4;
                    }
                    onextracallback = onextracallback2;
                } else {
                    int i5 = access100 + 99;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    onextracallback = null;
                }
                getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackDefault, strIAuthTabCallbackStub, adAsset, onextracallback, null, null, null, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda16(nativeAdsFullBannerV2Activity, adAsset), 56, null);
            } else {
                nativeAdsFullBannerV2Activity.IAuthTabCallbackDefault();
                nativeAdsDto.IAuthTabCallbackStub();
                obj.hashCode();
                throw null;
            }
        } else if (str != null && (calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent()) != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, new NativeAdsEventLogType.onExtraCallback(str), (Function1) null, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) || onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                int i4 = access000 + 101;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, null, 4, null);
            }
            nativeAdsFullBannerV2Activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsDto.Creative.FullBanner fullBanner, NativeAdsDto nativeAdsDto, float f, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, Context context, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i2 & 6) == 0) {
            int i5 = access100 + 19;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 41;
                access100 = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(50226952, i3, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:195)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(50226952, i3, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:195)");
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
            } else {
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
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) ^ true ? f : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(varyMatches.onExtraCallbackWithResult(nativeAdsFullBannerV2Activity, Integer.valueOf(getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(context))));
            deleteProfile deleteprofileAsBinder = nativeAdsFullBannerV2Activity.asBinder();
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            if (i > 0) {
                int i8 = access100 + 43;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerV2Activity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                int i10 = access000 + 33;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda3(nativeAdsDto, nativeAdsFullBannerV2Activity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                    obj2 = externalSyntheticLambda3;
                }
                Function2 function2 = (Function2) obj2;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeAdsDto);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsFullBannerV2Activity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent2 | zOnExtraCallback2)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda4(nativeAdsDto, nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                        obj3 = externalSyntheticLambda4;
                    }
                    addRearDisplayStatusListener.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -771064974, new Object[]{fullBanner, Boolean.valueOf(zAsBinder), Float.valueOf(fIAuthTabCallback), deleteprofileAsBinder, Boolean.valueOf(zOnExtraCallbackWithResult), Boolean.valueOf(z), function2, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0}, 771064975);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i12 = access000 + 11;
                        access100 = i12 % 128;
                        if (i12 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity = (NativeAdsFullBannerV2Activity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        NativeAdsDto.Creative.FullBanner fullBanner = (NativeAdsDto.Creative.FullBanner) objArr[6];
        float fFloatValue = ((Number) objArr[7]).floatValue();
        Context context = (Context) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 101;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0 ? (iIntValue2 & 3) == 2 : (iIntValue2 & 2) == 4) {
            int i4 = i3 + 31;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            int i6 = access100 + 105;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1830401213, iIntValue2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:124)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            Resources resources = nativeAdsFullBannerV2Activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, readIntokhttp.onExtraCallback(configuration) ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4279836456L) : setByteOrder.Companion.asBinder(), (toMetersPerSecond) null, 2, (Object) null);
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
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            GroupableFeatureWhenMappings.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(UseTorchAsFlashQuirk.onExtraCallback(onextracallback, ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6)), 0.0f, 1, (Object) null), ForwardingCameraControl.onExtraCallback(1162223923, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda0(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, iIntValue, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (Function2) null, (Function2) null, 0, setByteOrder.Companion.IAuthTabCallbackDefault(), 0L, StillCaptureFlashStopRepeatingQuirk.IAuthTabCallback(0, 0, 0, 0), ForwardingCameraControl.onExtraCallback(50226952, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda1(fullBanner, nativeAdsDto, fFloatValue, nativeAdsFullBannerV2Activity, context, iIntValue, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 806879280, 188);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access000 + 43;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = access100 + 75;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = access100 + 75;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = access000 + 119;
                    access100 = i8 % 128;
                    if (i8 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(431001445, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:123)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(431001445, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous>.<anonymous> (NativeAdsFullBannerV2Activity.kt:123)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1830401213, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda13(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1830401213, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda13(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, i, nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, f, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.Creative.FullBanner fullBanner, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access100 + 57;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = access000 + 91;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-712467803, i, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous> (NativeAdsFullBannerV2Activity.kt:88)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-712467803, i, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.onCreate.<anonymous> (NativeAdsFullBannerV2Activity.kt:88)");
            }
            float fOnExtraCallback = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallback();
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8IAuthTabCallback = CarouselKtExternalSyntheticLambda4.IAuthTabCallback(context);
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-114, -115, -125, -118, -117, -115, -117, -116, -111, -112, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - View.MeasureSpec.getMode(0), objArr);
            LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8IAuthTabCallback, ((String) objArr[0]).intern(), (Context) null, 2, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i6 = access000 + 91;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(nativeAdsFullBannerV2Activity.onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Double dIAuthTabCallbackDefault = nativeAdsDto.onTransact().IAuthTabCallbackDefault();
            int iDoubleValue = dIAuthTabCallbackDefault != null ? (int) dIAuthTabCallbackDefault.doubleValue() : 0;
            if (iDoubleValue <= 0) {
                onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, true);
                nativeAdsFullBannerV2Activity.onExtraCallback(true);
                int i8 = access100 + 105;
                access000 = i8 % 128;
                int i9 = i8 % 2;
            }
            nativeAdsFullBannerV2Activity.IAuthTabCallback(nativeAdsDto, onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2), cameraCaptureResultEmptyCameraCaptureResult, 0);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda5(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor3);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                int i10 = access100 + 17;
                access000 = i10 % 128;
                int i11 = i10 % 2;
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(431001445, true, new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda6(nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, iDoubleValue, nativeAdsDto, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor2, fullBanner, fOnExtraCallback, context), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = access100 + 43;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i14 = access000 + 103;
        access100 = i14 % 128;
        int i15 = i14 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(boolean z, boolean z2, NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 49;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
            if (!z) {
                if (!z2) {
                    Unit unit = Unit.INSTANCE;
                    int i4 = access000 + 13;
                    access100 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }
        } else if (!z) {
        }
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult());
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = nativeAdsFullBannerV2Activity.onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnNavigationEvent, nativeAdsDto.IAuthTabCallbackStub(), adAsset, (Function0) null, 4, (Object) null);
        }
        nativeAdsFullBannerV2Activity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(NativeAdsDto nativeAdsDto, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1651800989);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(nativeAdsDto)) {
                int i8 = access100 + 67;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i10 = access000 + 75;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
            int i12 = access000 + 39;
            access100 = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((i & 384) == 0) {
            int i14 = access000 + 117;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                int i16 = access100 + 33;
                access000 = i16 % 128;
                int i17 = i16 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i18 = access000 + 41;
            access100 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 13 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            int i20 = access100 + 115;
            access000 = i20 % 128;
            int i21 = i20 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1651800989, i2, -1, "im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity.NativeBackHandler (NativeAdsFullBannerV2Activity.kt:250)");
            }
            if ((i2 & 112) == 32) {
                int i22 = access100 + 121;
                access000 = i22 % 128;
                int i23 = i22 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = !((i2 & 896) != 256);
            boolean z5 = (i2 & 14) != 4;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z3 | z4 | (!z5) | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda14(z, z2, nativeAdsDto, this);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            requestPostMessageChannel.onExtraCallbackWithResult(true, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = access000 + 89;
                access100 = i24 % 128;
                int i25 = i24 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda15(this, nativeAdsDto, z, z2, i));
        }
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static char[] IAuthTabCallback = {64981, 64980, 64982, 64961};
        private static char onWarmupCompleted = 51243;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            Object obj2 = null;
            int i6 = 7;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + i6;
                    $10 = i8 % 128;
                    if (i8 % i4 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 25, (KeyEvent.getMaxKeyCode() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.getDefaultSize(0, 0) + 26, 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i4 = 2;
                    j = 0;
                    i6 = 7;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 26 - Color.argb(0, 0, 0, 0), 23139 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i9 = $10 + 9;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback / b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback * b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        int i10 = $11 + 81;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        obj = obj2;
                        i3 = 2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 73, Color.green(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i12 = $10 + 15;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                f = 0.0f;
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, 19488 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                f = 0.0f;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            obj = null;
                            f = 0.0f;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i15 = $10 + 93;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            } else {
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                                int i21 = $10 + 123;
                                $11 = i21 % 128;
                                i3 = 2;
                                int i22 = i21 % 2;
                            }
                        }
                        i3 = 2;
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                    obj2 = obj;
                }
            }
            for (int i23 = 0; i23 < i; i23++) {
                cArr4[i23] = (char) (cArr4[i23] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @Nullable String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsFullBannerV2Activity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_extra", nativeAdsDto);
            intent.putExtra("native_ads_ui_mode", deleteprofile.ordinal());
            Object[] objArr = new Object[1];
            a(new char[]{2, 3, 2, 0, 13804, 13804, 3, 2}, (byte) (4 - TextUtils.getCapsMode("", 0, 0)), 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new NativeAdsFullBannerV2Activity$.ExternalSyntheticLambda11(getsupportedhighspeedresolutionsfor);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda11);
        asInterface asinterface = new asInterface(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda11);
        int i2 = access100 + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return asinterface;
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = access000 + 3;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = access000 + 29;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = access000 + 117;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final AdsCircularCountdownLayout onExtraCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return adsCircularCountdownLayout;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<AdsCircularCountdownLayout> getsupportedhighspeedresolutionsfor, AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(adsCircularCountdownLayout);
        int i4 = access100 + 93;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.Creative.FullBanner fullBanner, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {nativeAdsDto, nativeAdsFullBannerV2Activity, fullBanner, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 456664496, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -456664494);
    }

    public static /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult}, iOnExtraCallbackWithResult2, -1321231162, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1321231168);
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, String str, boolean z) {
        Object[] objArr = {nativeAdsDto, nativeAdsFullBannerV2Activity, str, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -303847121, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 303847122);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.AdAsset adAsset) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{nativeAdsFullBannerV2Activity, adAsset}, iOnExtraCallbackWithResult2, 637213313, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -637213306);
    }

    private static final Unit onWarmupCompleted(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, NativeAdsDto.Creative.FullBanner fullBanner, float f, Context context, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {nativeAdsFullBannerV2Activity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i), nativeAdsDto, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, fullBanner, Float.valueOf(f), context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 2147044197, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -2147044193);
    }

    private static final Unit onWarmupCompleted(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{nativeAdsFullBannerV2Activity}, iOnExtraCallbackWithResult2, 1893797338, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -1893797333);
    }

    private static final Unit onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, String str, boolean z) {
        Object[] objArr = {nativeAdsDto, nativeAdsFullBannerV2Activity, str, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 408233782, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -408233779);
    }

    private static final Unit onWarmupCompleted(NativeAdsFullBannerV2Activity nativeAdsFullBannerV2Activity, NativeAdsDto.AdAsset adAsset) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{nativeAdsFullBannerV2Activity, adAsset}, iOnExtraCallbackWithResult2, 2034201803, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -2034201803);
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 81;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 97;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.v2.activity.Hilt_NativeAdsFullBannerV2Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity, im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 89;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback_Parcel() {
        IAuthTabCallbackDefault = new char[]{32600, 32596, 32592, 32597, 32526, 32529, 32551, 32607, 32549, 32530, 32593, 32595, 32594, 32601, 32532, 32584, 32531};
        asBinder = -1184333888;
        asInterface = true;
        IAuthTabCallbackStubProxy = true;
    }
}
