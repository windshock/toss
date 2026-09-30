package im.toss.features.faceverify.impl.ui.test;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.horcrux.svg.SvgPackage;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.define.MobileCarrier;
import im.toss.features.faceverify.impl.ui.nudge.FacePassNudgeRegisterActivity;
import im.toss.features.faceverify.impl.ui.pass.FacePassActivity;
import im.toss.features.faceverify.impl.ui.register.pass.FacePassRegisterActivity;
import im.toss.features.faceverify.impl.ui.test.FacePayTestActivity$;
import im.toss.features.faceverify.impl.ui.test.FacePayTestActivity$FaceVerifyTestScreen$2$1$onCaptureResult$1$1$1$;
import im.toss.features.selfie.impl.ui.v2.SelfieCameraV2Activity;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinBroadcastManager;
import o.AppLovinNativeAdImplExternalSyntheticLambda6;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.AppLovinVastMediaViewb;
import o.AppLovinVastMediaViewc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda2;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERTaggedObject;
import o.DebugConsoleExtension2;
import o.DebugConsolePoint;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ICustomTabsServiceDefault;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.ImageProcessingUtil;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PreviewOrientationIncorrectQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RVFilePath;
import o.RVFilePathDecoder;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TorchFlashRequiredFor3aUpdateQuirk;
import o.TorchIsClosedAfterImageCapturingQuirk;
import o.UseTorchAsFlashQuirk;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslDisablerQuirk;
import o.access13600;
import o.access13800;
import o.access14300;
import o.accessgetCameraFactoryp;
import o.addPolicy;
import o.appIsMiniService;
import o.callTimeoutMillis;
import o.certificateChainCleaner;
import o.checkDeviceBrand;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.copyToCroppedImage;
import o.createIsolatedReader;
import o.dequeImageProxy;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getCausesCount;
import o.getHumanReadableName;
import o.getNavigationIcon;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTinyLocalStorage;
import o.getViewTypeCount;
import o.immediateFailedFuture;
import o.isZslDisabledByByUserCaseConfig;
import o.logAndOpenStore;
import o.matches;
import o.maybeUpdateAnimatable;
import o.overrideEventDispatcher;
import o.prefetch;
import o.putTabBarModel;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw;
import o.removeConsoleView;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.seek;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setContentInsetsAbsolute;
import o.setContentInsetsRelative;
import o.setRandomHost;
import o.t7ExternalSyntheticLambda0;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.u5b;
import o.u6a;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.v1;
import o.w2;
import o.w4;
import o.w5a;
import o.wa;
import o.x1;
import o.y1;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda6;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.SessionKnownType;

@DERTaggedObject
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FacePayTestActivity extends Hilt_FacePayTestActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static long asBinder = 383406988725330078L;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(FacePayTestActivityViewModel.class), new onTransact(this), new IAuthTabCallbackDefault(this), new IAuthTabCallbackStub(null, this));

    @Inject
    public RVFilePathDecoder faceScreen;

    @Inject
    public appIsMiniService initializeFaceRegisterUseCase;

    @Inject
    public SessionTrackerb tossRouter;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(facePayTestActivity);
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    private static final Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
        if (i5 != 0) {
            Object[] objArr = {facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1211985922, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1211985931, iOnNavigationEvent);
        } else {
            Object[] objArr2 = {facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)};
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            onNavigationEvent(objArr2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1211985922, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1211985931, iOnNavigationEvent2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 55;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(facePayTestActivity, context);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(facePayTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(facePayTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = IAuthTabCallbackStub + 19;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(facePayTestActivity, findresandmsg, v1Var);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = onTransact + 5;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 113;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackDefault(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(brickModuleImplExternalSyntheticLambda2);
        }
        onWarmupCompleted(brickModuleImplExternalSyntheticLambda2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            extraCallback(facePayTestActivity);
            throw null;
        }
        Unit unitExtraCallback = extraCallback(facePayTestActivity);
        int i3 = IAuthTabCallbackStub + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        ICustomTabsServiceDefault iCustomTabsServiceDefault = (ICustomTabsServiceDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(facePayTestActivity, iCustomTabsServiceDefault);
        int i4 = IAuthTabCallbackStub + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 39811554, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -39811534, iOnNavigationEvent);
        }
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(facePayTestActivity);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        Context context = (Context) objArr[1];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[2];
        v1 v1Var = (v1) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(facePayTestActivity, context, findresandmsg, v1Var, cameraPresenceProviderExternalSyntheticLambda6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(facePayTestActivity);
        int i4 = IAuthTabCallbackStub + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        asBinder(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit asBinder(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            writeTypedObject(facePayTestActivity);
            throw null;
        }
        Unit unitWriteTypedObject = writeTypedObject(facePayTestActivity);
        int i3 = IAuthTabCallbackStub + 57;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unitWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult(facePayTestActivity);
        }
        extraCallbackWithResult(facePayTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        Context context = (Context) objArr[1];
        v1 v1Var = (v1) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(findresandmsg, context, v1Var, cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = IAuthTabCallbackStub + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 799014043, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -799014031, iOnNavigationEvent);
        }
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject(facePayTestActivity);
        }
        readTypedObject(facePayTestActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayTestActivity facePayTestActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(facePayTestActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 32 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayTestActivity facePayTestActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(facePayTestActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackStub + 115;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {iEngagementSignalsCallbackDefault};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(objArr, iOnNavigationEvent3, iOnNavigationEvent2, 193697810, iOnNavigationEvent4, -193697804, iOnNavigationEvent);
        int i4 = IAuthTabCallbackStub + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, v1Var);
        int i4 = IAuthTabCallbackStub + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(facePayTestActivity);
        int i4 = IAuthTabCallbackStub + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 9;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackDefault(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 81;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 57;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(new Object[]{facePayTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 866391013, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -866390996, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i4 = IAuthTabCallbackStub + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 25;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ICustomTabsServiceDefault iCustomTabsServiceDefault, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            return (Unit) onNavigationEvent(new Object[]{iCustomTabsServiceDefault, context}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1397851809, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1397851824, iOnNavigationEvent);
        }
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, z);
        int i4 = onTransact + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTinyLocalStorage.access100 access100Var, String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(access100Var, str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = onTransact + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        Object obj;
        int i8;
        FacePassNudgeRegisterActivity.onNavigationEvent onnavigationevent;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        Integer num;
        Integer num2;
        int i9;
        RVFilePath rVFilePath;
        boolean z3;
        long j;
        int i10;
        int i11 = ~i5;
        int i12 = (~(i11 | i6)) | i3;
        int i13 = ~i3;
        int i14 = ~(i11 | i13);
        int i15 = ~i6;
        int i16 = i14 | (~(i13 | i15));
        int i17 = (~(i6 | i13)) | (~(i11 | i15));
        int i18 = i5 + i3 + i2 + (417615942 * i) + (566850886 * i4);
        int i19 = i18 * i18;
        int i20 = (i5 * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i12 * 108) + (i16 * 108) + (i17 * 108) + ((-1357469401) * i2) + (1137340586 * i) + (304092074 * i4) + (i19 * 1282146304);
        switch (((-370608051) * i5) + 147849216 + ((-2147356519) * i3) + (i12 * 1776748468) + (i16 * 1776748468) + (1776748468 * i17) + (1406140416 * i2) + ((-354418688) * i) + ((-85983232) * i4) + ((-608960512) * i19) + (i20 * i20 * 1158414336)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i21 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1978341476);
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(facePayTestActivity)) {
                        int i22 = onTransact + 15;
                        IAuthTabCallbackStub = i22 % 128;
                        int i23 = i22 % 2;
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    i7 = i8 | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 3) != 2, i7 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1978341476, i7, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen (FacePayTestActivity.kt:128)");
                    }
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallback(facePayTestActivity.ICustomTabsServiceStub().IAuthTabCallback(), (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    obj = null;
                    v1 v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    getCameraCaptureCallback.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(-1043854751, true, new FacePayTestActivity$.ExternalSyntheticLambda42(facePayTestActivity), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(1399094362, true, new FacePayTestActivity$.ExternalSyntheticLambda43(facePayTestActivity, context, findresandmsg, v1VarOnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 12582912, 131066);
                    if (v1VarOnExtraCallback.IAuthTabCallback_Parcel()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1207976174);
                        u6a.IAuthTabCallback(v1VarOnExtraCallback, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 518248469, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeConsoleView.onNavigationEvent}, -518248435, matches.onExtraCallback()), ForwardingCameraControl.onExtraCallback(-2045039592, true, new FacePayTestActivity$.ExternalSyntheticLambda44(findresandmsg, v1VarOnExtraCallback, context, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-1795761191, true, new FacePayTestActivity$.ExternalSyntheticLambda45(findresandmsg, v1VarOnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(-1513762623, true, new FacePayTestActivity$.ExternalSyntheticLambda46(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14352384, 3072, 7966);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1206204090);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i24 = onTransact + 111;
                        IAuthTabCallbackStub = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i26 = onTransact + 35;
                        IAuthTabCallbackStub = i26 % 128;
                        int i27 = i26 % 2;
                    }
                } else {
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePayTestActivity$.ExternalSyntheticLambda47(facePayTestActivity, iIntValue));
                }
                return obj;
            case 10:
                return asInterface(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                ICustomTabsServiceDefault iCustomTabsServiceDefault = (ICustomTabsServiceDefault) objArr[0];
                Context context2 = (Context) objArr[1];
                int i28 = 2 % 2;
                int i29 = onTransact + 59;
                IAuthTabCallbackStub = i29 % 128;
                if (i29 % 2 != 0) {
                    onnavigationevent = FacePassNudgeRegisterActivity.Companion;
                    str = "FACE_PASS";
                    z = true;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    z2 = true;
                    num = null;
                    num2 = null;
                    i9 = 124;
                    rVFilePath = null;
                    z3 = true;
                    j = 0L;
                    i10 = 2899;
                } else {
                    onnavigationevent = FacePassNudgeRegisterActivity.Companion;
                    str = "FACE_PASS";
                    z = true;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    z2 = false;
                    num = null;
                    num2 = null;
                    i9 = 7;
                    rVFilePath = null;
                    z3 = false;
                    j = 1L;
                    i10 = 3512;
                }
                iCustomTabsServiceDefault.onNavigationEvent(FacePassNudgeRegisterActivity.onNavigationEvent.IAuthTabCallback(onnavigationevent, context2, str, z, str2, str3, str4, z2, num, num2, i9, rVFilePath, z3, j, i10, (Object) null));
                return Unit.INSTANCE;
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return writeTypedObject(objArr);
            case 19:
                return extraCallbackWithResult(objArr);
            case 20:
                return readTypedObject(objArr);
            case 21:
                FacePayTestActivity facePayTestActivity2 = (FacePayTestActivity) objArr[0];
                Context context3 = (Context) objArr[1];
                int i30 = 2 % 2;
                int i31 = onTransact + 107;
                IAuthTabCallbackStub = i31 % 128;
                int i32 = i31 % 2;
                Unit unitAsInterface = asInterface(facePayTestActivity2, context3);
                int i33 = IAuthTabCallbackStub + 65;
                onTransact = i33 % 128;
                int i34 = i33 % 2;
                return unitAsInterface;
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(facePayTestActivity);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallbackStub + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onNavigationEvent(FacePayTestActivity facePayTestActivity, findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(facePayTestActivity, findresandmsg, v1Var);
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            asBinder(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsBinder = asBinder(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda2, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda2, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 19;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackDefault(cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(ICustomTabsServiceDefault iCustomTabsServiceDefault, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(iCustomTabsServiceDefault, context);
        }
        IAuthTabCallback(iCustomTabsServiceDefault, context);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var, Context context, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, v1Var, context, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 123;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onTransact(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1317820082, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1317820068, iOnNavigationEvent);
        int i4 = onTransact + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -187205679, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 187205679, iOnNavigationEvent);
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(facePayTestActivity, context);
        int i4 = onTransact + 111;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, ICustomTabsServiceDefault iCustomTabsServiceDefault) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            unit = (Unit) onNavigationEvent(new Object[]{facePayTestActivity, iCustomTabsServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -997851202, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 997851210, iOnNavigationEvent);
            int i3 = 71 / 0;
        } else {
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            unit = (Unit) onNavigationEvent(new Object[]{facePayTestActivity, iCustomTabsServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -997851202, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 997851210, iOnNavigationEvent2);
        }
        int i4 = onTransact + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 21;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStub(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, 1005020312, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1005020294, iOnNavigationEvent);
        }
        int i5 = 43 / 0;
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, 1005020312, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1005020294, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 87;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1057608619, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1057608609, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        }
        int i4 = 4 / 0;
        return (Unit) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1057608619, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1057608609, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(copyToCroppedImage copytocroppedimage, copyToCroppedImage copytocroppedimage2, getTinyLocalStorage.access100 access100Var, String str, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(copytocroppedimage, copytocroppedimage2, access100Var, str, brickModuleImplExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 3;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {findresandmsg, v1Var, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, 2092589261, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2092589257, iOnNavigationEvent);
        }
        int i5 = 50 / 0;
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, 2092589261, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2092589257, iOnNavigationEvent);
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return -1L;
    }

    public static final class IAuthTabCallbackDefault implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 22 / 0;
            } else {
                onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onTransact(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onWarmupCompleted.getViewModelStore();
            int i4 = IAuthTabCallback + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
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
            int i3 = $11 + 115;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 24 - View.MeasureSpec.getSize(0), 19628 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (asBinder & 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 59, Drawable.resolveOpacity(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 24, TextUtils.indexOf((CharSequence) "", '0') + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (asBinder ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, 6383 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 6383 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 3;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;

        public IAuthTabCallbackStub(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.onNavigationEvent;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras();
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return defaultViewModelCreationExtras;
        }
    }

    public static final /* synthetic */ BrickModuleImplExternalSyntheticLambda2 onNavigationEvent(FacePayTestActivity facePayTestActivity, Context context, getTinyLocalStorage.access100 access100Var, copyToCroppedImage copytocroppedimage, copyToCroppedImage copytocroppedimage2, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2OnWarmupCompleted = facePayTestActivity.onWarmupCompleted(context, access100Var, copytocroppedimage, copytocroppedimage2, str);
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return brickModuleImplExternalSyntheticLambda2OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final FacePayTestActivityViewModel ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        FacePayTestActivityViewModel facePayTestActivityViewModel = (FacePayTestActivityViewModel) this.IAuthTabCallbackDefault.getValue();
        int i4 = onTransact + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return facePayTestActivityViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        appIsMiniService appisminiservice = facePayTestActivity.initializeFaceRegisterUseCase;
        if (appisminiservice != null) {
            return appisminiservice;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onTransact + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 17;
        im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onTransact = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionTrackerb setEngagementSignalsCallback() {
        SessionTrackerb sessionTrackerb;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 7;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            sessionTrackerb = this.tossRouter;
            int i4 = 73 / 0;
        } else {
            sessionTrackerb = this.tossRouter;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i = 2 % 2;
        RVFilePathDecoder rVFilePathDecoder = ((FacePayTestActivity) objArr[0]).faceScreen;
        if (rVFilePathDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = IAuthTabCallbackStub + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return rVFilePathDecoder;
        }
        throw null;
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1490467910, true, new FacePayTestActivity$.ExternalSyntheticLambda41(this))), 1, (Object) null);
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 15;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1541038620, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:120)");
                int i5 = IAuthTabCallbackStub + 97;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
            onNavigationEvent(new Object[]{facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, 0}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1211985922, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1211985931, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 113;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = i3 + 17;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i10 = onTransact + 39;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-439415394, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onCreate.<anonymous>.<anonymous> (FacePayTestActivity.kt:119)");
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], ForwardingCameraControl.onExtraCallback(-1541038620, true, new FacePayTestActivity$.ExternalSyntheticLambda33(facePayTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onTransact + 61;
                IAuthTabCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 3) {
            z = false;
        } else {
            int i5 = i3 + 101;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1490467910, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onCreate.<anonymous> (FacePayTestActivity.kt:118)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-439415394, true, new FacePayTestActivity$.ExternalSyntheticLambda37(facePayTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStub + 73;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 55 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int[] onExtraCallbackWithResult = {-1054628920, -402476388, 661973395, -2133568159, -1109955497, -1518730824, 1704809651, 1382266511, -1424303584, -780221566, -1000624507, -657136941, 344286647, -1167829199, -78104193, -385015802, 1009078880, -255866265};
        private static int onNavigationEvent;
        final /* synthetic */ IEngagementSignalsCallbackDefault $result;
        int label;
        final /* synthetic */ FacePayTestActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault, FacePayTestActivity facePayTestActivity, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$result = iEngagementSignalsCallbackDefault;
            this.this$0 = facePayTestActivity;
        }

        public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(dialogInterface);
            }
            onNavigationEvent(dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(str, commonModule_setLeftEdgeTouchEnabled);
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            int i5 = onExtraCallback + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$result, this.this$0, access13800Var);
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallbackWithResult;
            int i4 = -1469660336;
            int i5 = 16;
            if (iArr2 != null) {
                int i6 = $10 + 107;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 49;
                    $10 = i9 % 128;
                    if (i9 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> i5), View.MeasureSpec.getMode(0) + 72, 8848 - View.resolveSize(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 72 - View.resolveSizeAndState(0, 0, 0), 8848 - Color.blue(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i8++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    i5 = 16;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallbackWithResult;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 72 - (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                    i4 = -1469660336;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i11 = 0;
                for (int i12 = 16; i11 < i12; i12 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22252), TextUtils.lastIndexOf("", '0') + 40, ExpandableListView.getPackedPositionType(0L) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i11++;
                    int i13 = $10 + 69;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4033), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i18 = $11 + 55;
                $10 = i18 % 128;
                int i19 = i18 % 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        
            if (r4 == null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r4 = r4.getStringExtra("transactionId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            if (r4 == null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            r1.append("transactionId = " + r4);
            r1.append('\n');
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            r4 = r13.onExtraCallbackWithResult();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            if (r4 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            r4 = r4.getStringExtra("subTransactionId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            if (r4 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            r1.append("subTransactionId = " + r4);
            r1.append('\n');
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            r4 = r13.onExtraCallbackWithResult();
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        
            if (r4 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
        
            r4 = r4.getStringExtra(com.lguplus.usimlib.TsmResponse.errorCode);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        
            if (r4 != null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
        
            r4 = r13.onExtraCallbackWithResult();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (r4 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
        
            r6 = im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onExtraCallback + 79;
            im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onNavigationEvent = r6 % 128;
            r6 = r6 % 2;
            r4 = r4.getStringExtra("RESULT_ERROR");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
        
            if (r4 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            r1.append("errorCode = " + r4);
            r1.append('\n');
            r4 = im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onExtraCallback + 23;
            im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onNavigationEvent = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
        
            r13 = r13.onExtraCallbackWithResult();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
        
            if (r13 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
        
            r7 = new java.lang.Object[1];
            a(new int[]{1804514914, -844327841, 2141480849, 1749673800}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5, r7);
            r13 = r13.getStringExtra(((java.lang.String) r7[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
        
            if (r13 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
        
            r1.append("reason = " + r13);
            r1.append('\n');
            r13 = im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onExtraCallback + 123;
            im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onNavigationEvent = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
        
            if ((r13 % 2) == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0129, code lost:
        
            r13 = 2 / 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
        
            r11 = kotlin.text.StringsKt.trim(r1.toString()).toString();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
        
            if (r12.$result.onNavigationEvent() != (-1)) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
        
            r13 = o.isDebugStateOn.onExtraCallback.onExtraCallbackWithResult();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
        
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
        
            if (r13 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x014a, code lost:
        
            r1 = android.graphics.BitmapFactory.decodeByteArray(r13.onExtraCallback(), 0, r13.onExtraCallback().length);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0159, code lost:
        
            if (r13 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
        
            r2 = r13.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x015f, code lost:
        
            if (r2 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
        
            r2 = r2.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0165, code lost:
        
            if (r2 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
        
            r3 = im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onExtraCallback + 27;
            im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onWarmupCompleted.onNavigationEvent = r3 % 128;
            r3 = r3 % 2;
            r5 = r2.onNavigationEvent();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0174, code lost:
        
            if (r13 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0176, code lost:
        
            if (r1 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0178, code lost:
        
            if (r5 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x017a, code lost:
        
            r0 = android.graphics.Bitmap.createBitmap(r1, r5.left, r5.top, r5.width(), r5.height());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
            r7 = r12.this$0;
            o.ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallbackWithResult(im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.onNavigationEvent(r7, r7, r13.IAuthTabCallback().onWarmupCompleted().onNavigationEvent(), o.readResolve.onExtraCallback(r0), o.readResolve.onExtraCallback(r1), r11));
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01af, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01b0, code lost:
        
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r12.this$0, new im.toss.features.faceverify.impl.ui.test.FacePayTestActivity$FaceVerifyTestScreen$2$1$onCaptureResult$1$1$1$.ExternalSyntheticLambda0(r11));
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01bc, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r13);
            r13 = r12.$result;
            r1 = new java.lang.StringBuilder();
            r1.append("resultCode = " + r13.onNavigationEvent());
            r1.append('\n');
            r4 = r13.onExtraCallbackWithResult();
         */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context, im.toss.features.faceverify.impl.ui.test.FacePayTestActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
        }

        private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            dialogInterface.dismiss();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            return unit;
        }

        private static final Unit onWarmupCompleted(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
            int i = 2 % 2;
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback("촬영 결과");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
            Object[] objArr = new Object[1];
            a(new int[]{-103115777, -526177449}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, objArr);
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, ((String) objArr[0]).intern(), (TdsButtonV1View.asInterface) null, false, new FacePayTestActivity$FaceVerifyTestScreen$2$1$onCaptureResult$1$1$1$.ExternalSyntheticLambda1(), 6, (Object) null)};
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 59;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 27;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1043854751, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous> (FacePayTestActivity.kt:141)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = UseTorchAsFlashQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, StillCaptureFlashStopRepeatingQuirk.onExtraCallback(ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), TorchIsClosedAfterImageCapturingQuirk.Companion.IAuthTabCallbackStubProxy()));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onTransact + 11;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                int i9 = onTransact + 19;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
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
            createIsolatedReader createisolatedreader = createIsolatedReader.onWarmupCompleted;
            int i10 = createIsolatedReader.IAuthTabCallback;
            long jIAuthTabCallback_Parcel = createisolatedreader.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i10).IAuthTabCallback_Parcel();
            long jOnExtraCallback = ImageProcessingUtil.onExtraCallback(createisolatedreader.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i10).IAuthTabCallback_Parcel(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i11 = IAuthTabCallbackStub + 103;
                onTransact = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 90 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        FacePayTestActivity$.ExternalSyntheticLambda32 externalSyntheticLambda32 = new FacePayTestActivity$.ExternalSyntheticLambda32(facePayTestActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda32);
                        int i13 = onTransact + 99;
                        IAuthTabCallbackStub = i13 % 128;
                        int i14 = i13 % 2;
                        obj = externalSyntheticLambda32;
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jOnExtraCallback, jIAuthTabCallback_Parcel, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, removeConsoleView.onNavigationEvent.readTypedObject(), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 102);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jOnExtraCallback, jIAuthTabCallback_Parcel, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, removeConsoleView.onNavigationEvent.readTypedObject(), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 102);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Intent intentOnExtraCallbackWithResult;
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1 && (intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult()) != null) {
            int i2 = IAuthTabCallbackStub + 7;
            onTransact = i2 % 128;
            Integer intOrNull = null;
            if (i2 % 2 == 0) {
                Long.valueOf(intentOnExtraCallbackWithResult.getLongExtra("EXTRA_SESSION_ID", -1L)).longValue();
                throw null;
            }
            Long lValueOf = Long.valueOf(intentOnExtraCallbackWithResult.getLongExtra("EXTRA_SESSION_ID", -1L));
            if (lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            String stringExtra = intentOnExtraCallbackWithResult.getStringExtra("EXTRA_BANK_CODE");
            if (stringExtra != null) {
                int i3 = onTransact + 107;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    intOrNull = StringsKt.toIntOrNull(stringExtra);
                    int i4 = 54 / 0;
                } else {
                    intOrNull = StringsKt.toIntOrNull(stringExtra);
                }
            }
            intentOnExtraCallbackWithResult.getStringExtra("EXTRA_ACCOUNT_NO");
            Objects.toString(lValueOf);
            Objects.toString(intOrNull);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(facePayTestActivity), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(iEngagementSignalsCallbackDefault, facePayTestActivity, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        ICustomTabsServiceDefault iCustomTabsServiceDefault = (ICustomTabsServiceDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            facePayTestActivity.onExtraCallbackWithResult((IEngagementSignalsCallback_Parcel<Intent>) iCustomTabsServiceDefault);
            int i3 = 19 / 0;
            return Unit.INSTANCE;
        }
        facePayTestActivity.onExtraCallbackWithResult((IEngagementSignalsCallback_Parcel<Intent>) iCustomTabsServiceDefault);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(FacePayTestActivity facePayTestActivity, ICustomTabsServiceDefault iCustomTabsServiceDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String strName = SessionKnownType.FACE_PAY.name();
        Object[] objArr = new Object[1];
        a(new char[]{42490, 1196, 59170, 17942, 8373, 33647}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41299, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{42447, 11699, 46396, 15549, 33818, 4030, 38698, 7821}, 34939 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        iCustomTabsServiceDefault.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, facePayTestActivity, strName, strIntern, (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, "face_pay_test", ((String) objArr2[0]).intern(), (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -49160, 127, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.startActivity(FacePassActivity.Companion.IAuthTabCallback(context, RVFilePath.TRANSFER, "transfer"));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 13;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(FacePayTestActivity facePayTestActivity, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        facePayTestActivity.startActivity(i2 % 2 != 0 ? FacePassRegisterActivity.onExtraCallback.onWarmupCompleted(FacePassRegisterActivity.Companion, context, "", "transfer", RVFilePath.TRANSFER, (Integer) null, (Integer) null, 104, 98, (Object) null) : FacePassRegisterActivity.onExtraCallback.onWarmupCompleted(FacePassRegisterActivity.Companion, context, "", "transfer", RVFilePath.TRANSFER, (Integer) null, (Integer) null, 7, 48, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(FacePayTestActivity facePayTestActivity, Context context) {
        RVFilePathDecoder rVFilePathDecoder;
        RVFilePath rVFilePath;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            rVFilePathDecoder = (RVFilePathDecoder) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731477022, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731477006, iOnNavigationEvent);
            rVFilePath = RVFilePath.TRANSFER;
            str = "face_pay_test";
            str2 = "transfer";
            num = null;
            num2 = null;
            num3 = null;
            i = 57;
        } else {
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            rVFilePathDecoder = (RVFilePathDecoder) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731477022, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731477006, iOnNavigationEvent2);
            rVFilePath = RVFilePath.TRANSFER;
            str = "face_pay_test";
            str2 = "transfer";
            num = null;
            num2 = null;
            num3 = null;
            i = 112;
        }
        facePayTestActivity.startActivity(RVFilePathDecoder.onExtraCallbackWithResult(rVFilePathDecoder, context, str, str2, rVFilePath, num, num2, num3, i, (Object) null));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(ICustomTabsServiceDefault iCustomTabsServiceDefault, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        iCustomTabsServiceDefault.onNavigationEvent(i2 % 2 == 0 ? FacePassNudgeRegisterActivity.onNavigationEvent.IAuthTabCallback(FacePassNudgeRegisterActivity.Companion, context, "FACE_PASS", true, (String) null, (String) null, (String) null, true, (Integer) null, (Integer) null, 45, (RVFilePath) null, true, 0L, 19536, (Object) null) : FacePassNudgeRegisterActivity.onNavigationEvent.IAuthTabCallback(FacePassNudgeRegisterActivity.Companion, context, "FACE_PASS", false, (String) null, (String) null, (String) null, true, (Integer) null, (Integer) null, 7, (RVFilePath) null, false, 1L, 3512, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 87;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1001093349, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:362)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str != null ? str : "", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onTransact + 79;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = IAuthTabCallbackStub + 11;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IAuthTabCallbackStub + 9;
            onTransact = i8 % 128;
            String str = null;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1871405456, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:356)");
            }
            if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted() == null) {
                str = "눌러서 확인하기";
            } else {
                Result resultOnWarmupCompleted = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted();
                if (resultOnWarmupCompleted != null) {
                    Object objOnNavigationEvent = resultOnWarmupCompleted.onNavigationEvent();
                    if (!Result.onExtraCallback(objOnNavigationEvent)) {
                        int i9 = onTransact + 85;
                        IAuthTabCallbackStub = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 17 / 0;
                        }
                        str = objOnNavigationEvent;
                    }
                    str = str;
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, removeConsoleView.onNavigationEvent.newSessionWithExtras(), ForwardingCameraControl.onExtraCallback(-1001093349, true, new FacePayTestActivity$.ExternalSyntheticLambda34(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().onExtraCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onTransact + 13;
            IAuthTabCallbackStub = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 59;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-824765092, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:375)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-824765092, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:375)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 107;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        String str;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((iIntValue & 97) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackStub + 95;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1695077199, iIntValue, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:370)");
            }
            Boolean boolOnNavigationEvent = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent();
            if (boolOnNavigationEvent == null) {
                int i5 = onTransact + 9;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                str = "눌러서 확인하기";
            } else if (Intrinsics.areEqual(boolOnNavigationEvent, Boolean.TRUE)) {
                str = "활성화됨";
            } else {
                if (!Intrinsics.areEqual(boolOnNavigationEvent, Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = onTransact + 21;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                str = "비활성화";
            }
            w5a.onExtraCallback(new Object[]{w5aVar, removeConsoleView.onNavigationEvent.prefetchWithMultipleUrls(), ForwardingCameraControl.onExtraCallback(-824765092, true, new FacePayTestActivity$.ExternalSyntheticLambda40(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().onWarmupCompleted();
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit readTypedObject(FacePayTestActivity facePayTestActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().onExtraCallbackWithResult();
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 5 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = onTransact + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit asBinder(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallbackStub + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 75;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1330071267, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:394)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 39;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    int i9 = 8 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        String strIntern;
        Throwable th;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onTransact + 63;
                IAuthTabCallbackStub = i4 % 128;
                i2 = i4 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1755024488, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:389)");
            }
            if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback() == null) {
                int i5 = onTransact + 7;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{6053, 43354, 4747, 38100, 36525, 52143, 4683, 5696}, 47903 >> Color.alpha(1), objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{6053, 43354, 4747, 38100, 36525, 52143, 4683, 5696}, Color.alpha(0) + 47903, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
            } else {
                Result resultIAuthTabCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback();
                if (resultIAuthTabCallback == null || !Result.onNavigationEvent(resultIAuthTabCallback.onNavigationEvent())) {
                    Result resultIAuthTabCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback();
                    if (resultIAuthTabCallback2 != null && (th = Result.exceptionOrNull-impl(resultIAuthTabCallback2.onNavigationEvent())) != null) {
                        message = th.getMessage();
                    }
                    strIntern = "실패: " + message;
                    int i6 = onTransact + 63;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    Result resultIAuthTabCallback3 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback();
                    if (resultIAuthTabCallback3 != null) {
                        Object objOnNavigationEvent = resultIAuthTabCallback3.onNavigationEvent();
                        message = Result.onExtraCallback(objOnNavigationEvent) ? null : objOnNavigationEvent;
                    }
                    strIntern = "성공: " + message;
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, removeConsoleView.onNavigationEvent.extraCallbackWithResult(), ForwardingCameraControl.onExtraCallback(-1330071267, true, new FacePayTestActivity$.ExternalSyntheticLambda50(strIntern), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().onExtraCallback(facePayTestActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit extraCallbackWithResult(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(facePayTestActivity.setEngagementSignalsCallback(), facePayTestActivity, DebugConsoleExtension2.IAuthTabCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 65;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 35) != 81) {
                int i4 = onTransact + 19;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-977414753, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:420)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 69;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onTransact + 37;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 7;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107681002, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:415)");
            }
            if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback() == null) {
                str = "눌러서 발급하기";
            } else {
                Result resultOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
                if (resultOnExtraCallback != null) {
                    int i8 = onTransact + 93;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 == 0 ? !Result.onNavigationEvent(resultOnExtraCallback.onNavigationEvent()) : !(!Result.onNavigationEvent(resultOnExtraCallback.onNavigationEvent()))) {
                        str = "발급 실패";
                    } else {
                        Result resultOnExtraCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
                        if (resultOnExtraCallback2 != null) {
                            Object objOnNavigationEvent = resultOnExtraCallback2.onNavigationEvent();
                            if (!(!Result.onExtraCallback(objOnNavigationEvent))) {
                                int i9 = IAuthTabCallbackStub + 117;
                                onTransact = i9 % 128;
                                int i10 = i9 % 2;
                                objOnNavigationEvent = null;
                            }
                            str = (String) objOnNavigationEvent;
                            if (str == null) {
                                str = "-";
                            }
                        }
                    }
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 680839631, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeConsoleView.onNavigationEvent}, -680839614, matches.onExtraCallback()), ForwardingCameraControl.onExtraCallback(-977414753, true, new FacePayTestActivity$.ExternalSyntheticLambda31(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallbackStub + 45;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallback(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, im.toss.features.faceverify.impl.ui.test.FacePayTestActivity] */
    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        ?? r2 = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb engagementSignalsCallback = r2.setEngagementSignalsCallback();
        Object[] objArr2 = new Object[1];
        a(new char[]{42458, 42279, 42031, 42813, 42551, 41274, 40996, 41735, 41474, 44352, 44104, 44879, 44555, 43383, 43120, 43897, 43572, 46435, 46202, 46972, 46685, 45331, 45142, 45889, 45653, 48450, 48312, 49076, 48880, 47541, 47270, 48032, 47788, 34193, 33931, 34775, 34449, 33163, 32920, 33760}, 251 - Color.red(0), objArr2);
        SessionTrackerb.IAuthTabCallback(engagementSignalsCallback, (Activity) r2, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        BaseActivity baseActivity = (FacePayTestActivity) objArr[0];
        int i = 2 % 2;
        baseActivity.startActivity(new Intent((Context) baseActivity, (Class<?>) FacePayBleTestActivity.class));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 13;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onMinimized(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{42458, 64221, 7161, 47340, 55684, 32415, 40874, 15530, 23886, 62019, 4976, 45096, 53578, 30299, 38707, 13363, 21707, 62949, 2792, 43973, 51358, 27053, 36529, 12109, 19540, 60780, 639, 41731, 49153, 24877, 34360, 9928, 18342, 58603, 1422, 23176, 64443, 6325, 47436, 56923, 32626, 39999, 15698, 21062, 62327, 4197}, 24337 - Color.alpha(0), objArr);
        String string = Uri.parse(((String) objArr[0]).intern()).buildUpon().build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SessionTrackerb.IAuthTabCallback(facePayTestActivity.setEngagementSignalsCallback(), facePayTestActivity, string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onMessageChannelReady(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{42458, 40927, 53757, 3046, 19852, 34709, 63934, 13144, 30046, 44913, 57700, 56130, 7522, 22385, 35031, 49873, 1259, 32391, 45196, 60143, 11446, 26183, 22629, 37503, 54276, 3614, 16427, 34249, 65481, 12775, 27644, 44426, 59366, 55721, 4938, 21826, 36723, 49535, 15128, 32041, 46882, 59533, 8846, 25768, 24284, 37063}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14866, objArr);
        String string = Uri.parse(((String) objArr[0]).intern()).buildUpon().build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SessionTrackerb.IAuthTabCallback(facePayTestActivity.setEngagementSignalsCallback(), facePayTestActivity, string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onPostMessage(FacePayTestActivity facePayTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{42458, 65195, 4885, 47082, 51292, 27849, 33190, 55820, 32510, 37701, 14300, 18686, 60754, 445, 23167, 65221, 5035, 46099, 51428, 27939, 33222, 55995, 32541, 37771, 13412, 18634, 60851, 1557, 23193, 65387, 5076, 46270, 51558, 28061, 34402, 56014, 32675, 36899, 13440, 18813, 60866, 1785, 23422, 65494, 4142, 46208}, TextUtils.lastIndexOf("", '0', 0) + 23400, objArr);
        String string = Uri.parse(((String) objArr[0]).intern()).buildUpon().build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SessionTrackerb.IAuthTabCallback(facePayTestActivity.setEngagementSignalsCallback(), facePayTestActivity, string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        boolean z2 = true;
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onTransact + 111;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(256883046, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:505)");
            }
            if (ContextCompat.checkSelfPermission(facePayTestActivity, "android.permission.CAMERA") == 0) {
                int i5 = onTransact + 5;
                int i6 = i5 % 128;
                IAuthTabCallbackStub = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 31;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            } else {
                z2 = false;
            }
            boolean interfaceDescriptor = putTabBarModel.getInterfaceDescriptor(facePayTestActivity);
            if (z2 && interfaceDescriptor) {
                int i10 = IAuthTabCallbackStub + 115;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                str2 = "필요한 권한 모두 허용됨";
            } else if (z2 || interfaceDescriptor) {
                String str3 = "거부됨";
                if (z2) {
                    int i12 = onTransact + 31;
                    IAuthTabCallbackStub = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 8 / 0;
                    }
                    str = "허용됨";
                } else {
                    str = "거부됨";
                }
                if (interfaceDescriptor) {
                    int i14 = onTransact + 11;
                    IAuthTabCallbackStub = i14 % 128;
                    if (i14 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    str3 = "허용됨";
                }
                str2 = "카메라 : " + str + " / BLE : " + str3;
            } else {
                str2 = "허용된 권한 없음";
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onTransact + 89;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i;
        boolean z = false;
        FacePayTestActivity facePayTestActivity = (FacePayTestActivity) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onTransact + 53;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
                i = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = IAuthTabCallbackStub + 47;
            int i6 = i5 % 128;
            onTransact = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = onTransact + 123;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i12 = onTransact + 91;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-952988495, iIntValue, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:502)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, removeConsoleView.onNavigationEvent.IAuthTabCallback_Parcel(), ForwardingCameraControl.onExtraCallback(256883046, true, new FacePayTestActivity$.ExternalSyntheticLambda38(facePayTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallbackDefault(FacePayTestActivity facePayTestActivity) {
        int i = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + facePayTestActivity.getApplicationContext().getPackageName()));
        facePayTestActivity.startActivity(intent);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
            addPolicy.ITrustedWebActivityCallbackStub().onNavigationEvent("face_verify_test_log_enabled", z);
            return Unit.INSTANCE;
        }
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        addPolicy.ITrustedWebActivityCallbackStub().onNavigationEvent("face_verify_test_log_enabled", z);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackStub + 11;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(342625751, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:545)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(342625751, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:545)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new FacePayTestActivity$.ExternalSyntheticLambda39(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaViewc.onExtraCallbackWithResult(zOnExtraCallbackWithResult, (Function1) objOnMinimized, (QuirksExternalSyntheticBackport0) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = IAuthTabCallbackStub + 77;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 123;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ v1 $showConfigBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$showConfigBottomSheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$showConfigBottomSheetState, access13800Var);
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$showConfigBottomSheetState;
                this.label = 1;
                if (v1.IAuthTabCallback(v1Var, (u5b) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        facePayTestActivity.ICustomTabsServiceStub().IAuthTabCallbackStub();
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ v1 $showConfigBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(v1 v1Var, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$showConfigBottomSheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$showConfigBottomSheetState, access13800Var);
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 17;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$showConfigBottomSheetState;
                this.label = 1;
                if (v1.IAuthTabCallback(v1Var, (u5b) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(FacePayTestActivity facePayTestActivity, findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        FacePayTestActivityViewModel.onExtraCallback(SvgPackage.21.onExtraCallbackWithResult(), 1642571105, new Object[]{facePayTestActivity.ICustomTabsServiceStub()}, SvgPackage.21.onExtraCallbackWithResult(), -1642571104, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, Context context, findResAndMsg findresandmsg, v1 v1Var, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object obj;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        Object obj2;
        boolean zOnExtraCallback3;
        boolean zOnExtraCallback4;
        Object obj3;
        boolean zOnExtraCallback5;
        boolean zOnExtraCallback6;
        Object obj4;
        boolean zOnExtraCallback7;
        Object obj5;
        boolean zOnExtraCallback8;
        Object obj6;
        boolean zOnExtraCallback9;
        Object obj7;
        boolean zOnExtraCallback10;
        Object obj8;
        boolean zOnExtraCallback11;
        Object obj9;
        boolean zOnExtraCallback12;
        Object obj10;
        Object objOnMinimized;
        boolean zOnExtraCallback13;
        boolean zOnExtraCallback14;
        boolean zOnNavigationEvent;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
            int i4 = IAuthTabCallbackStub + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2 == 0 ? 2 : 4;
            i2 = i | i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1399094362, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous> (FacePayTestActivity.kt:152)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = IAuthTabCallbackStub + 103;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            removeConsoleView removeconsoleview = removeConsoleView.onNavigationEvent;
            Object obj11 = null;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(removeconsoleview.extraCommand(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 384, 12286);
            AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresult2 = AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion;
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
            IPostMessageService_Parcel.asInterface asinterface = new IPostMessageService_Parcel.asInterface();
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new FacePayTestActivity$.ExternalSyntheticLambda1();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            }
            ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted = prefetch.onWarmupCompleted(asinterface, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 48);
            boolean zOnExtraCallback15 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(facePayTestActivity);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback15 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new FacePayTestActivity$.ExternalSyntheticLambda12(facePayTestActivity);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
            }
            Function1 function1 = (Function1) objOnMinimized3;
            ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted2 = prefetch.onWarmupCompleted(new IPostMessageService_Parcel.asInterface(), function1, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted3 = prefetch.onWarmupCompleted(new IPostMessageService_Parcel.asInterface(), function1, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            getBacktraceNote getbacktracenoteIEngagementSignalsCallback = removeconsoleview.IEngagementSignalsCallback();
            wa.IAuthTabCallback.onNavigationEvent onnavigationevent = wa.IAuthTabCallback.Companion;
            w2.IAuthTabCallback(getbacktracenoteIEngagementSignalsCallback, (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, onnavigationevent.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
            getBacktraceNote getbacktracenote = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 2047187016, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -2047187006, matches.onExtraCallback());
            getBacktraceNote getbacktracenoteAsBinder = removeconsoleview.asBinder();
            boolean zOnExtraCallback16 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
            boolean zOnExtraCallback17 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted2);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback16 | zOnExtraCallback17)) {
                int i8 = IAuthTabCallbackStub + 21;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
                    onwarmupcompleted.onExtraCallback();
                    obj11.hashCode();
                    throw null;
                }
                if (objOnMinimized4 != onwarmupcompleted.onExtraCallback()) {
                    obj = objOnMinimized4;
                    w4.onExtraCallbackWithResult(getbacktracenote, (QuirksExternalSyntheticBackport0) null, getbacktracenoteAsBinder, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                    getBacktraceNote getbacktracenoteReceiveFile = removeconsoleview.receiveFile();
                    getBacktraceNote getbacktracenoteIAuthTabCallbackStub = removeconsoleview.IAuthTabCallbackStub();
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback | zOnExtraCallback2) {
                        Object obj12 = objOnMinimized5;
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            FacePayTestActivity$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new FacePayTestActivity$.ExternalSyntheticLambda23(facePayTestActivity, iCustomTabsServiceDefaultOnWarmupCompleted);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda23);
                            obj12 = externalSyntheticLambda23;
                        }
                        w4.onExtraCallbackWithResult(getbacktracenoteReceiveFile, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIAuthTabCallbackStub, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj12, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                        AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                        w2.IAuthTabCallback(removeconsoleview.writeTypedList(), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, onnavigationevent.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
                        getBacktraceNote getbacktracenote2 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 1094688945, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -1094688912, matches.onExtraCallback());
                        getBacktraceNote getbacktracenoteOnWarmupCompleted = removeconsoleview.onWarmupCompleted();
                        boolean zOnExtraCallback18 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                        boolean zOnExtraCallback19 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback18 | zOnExtraCallback19)) {
                            Object obj13 = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                FacePayTestActivity$.ExternalSyntheticLambda24 externalSyntheticLambda24 = new FacePayTestActivity$.ExternalSyntheticLambda24(facePayTestActivity, context);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda24);
                                obj13 = externalSyntheticLambda24;
                            }
                            w4.onExtraCallbackWithResult(getbacktracenote2, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnWarmupCompleted, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj13, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                            getBacktraceNote getbacktracenoteICustomTabsServiceStub = removeconsoleview.ICustomTabsServiceStub();
                            getBacktraceNote getbacktracenoteOnExtraCallback = removeconsoleview.onExtraCallback();
                            boolean zOnExtraCallback20 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                            boolean zOnExtraCallback21 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnExtraCallback20 | zOnExtraCallback21)) {
                                Object obj14 = objOnMinimized7;
                                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                    FacePayTestActivity$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new FacePayTestActivity$.ExternalSyntheticLambda25(facePayTestActivity, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda25);
                                    obj14 = externalSyntheticLambda25;
                                }
                                w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsServiceStub, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnExtraCallback, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj14, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                getBacktraceNote getbacktracenoteUpdateVisuals = removeconsoleview.updateVisuals();
                                getBacktraceNote getbacktracenote3 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), -1320242490, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, 1320242521, matches.onExtraCallback());
                                boolean zOnExtraCallback22 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                boolean zOnExtraCallback23 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (zOnExtraCallback22 || zOnExtraCallback23) {
                                    FacePayTestActivity$.ExternalSyntheticLambda26 externalSyntheticLambda26 = new FacePayTestActivity$.ExternalSyntheticLambda26(facePayTestActivity, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda26);
                                    obj2 = externalSyntheticLambda26;
                                    w4.onExtraCallbackWithResult(getbacktracenoteUpdateVisuals, (QuirksExternalSyntheticBackport0) null, getbacktracenote3, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenote4 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 1932339329, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -1932339318, matches.onExtraCallback());
                                    getBacktraceNote getbacktracenoteMayLaunchUrl = removeconsoleview.mayLaunchUrl();
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted3);
                                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback3 | zOnExtraCallback4) {
                                        int i9 = IAuthTabCallbackStub + 83;
                                        onTransact = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            onwarmupcompleted.onExtraCallback();
                                            throw null;
                                        }
                                        if (objOnMinimized9 != onwarmupcompleted.onExtraCallback()) {
                                            obj3 = objOnMinimized9;
                                            w4.onExtraCallbackWithResult(getbacktracenote4, (QuirksExternalSyntheticBackport0) null, getbacktracenoteMayLaunchUrl, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            getBacktraceNote getbacktracenoteICustomTabsCallbackStub = removeconsoleview.ICustomTabsCallbackStub();
                                            getBacktraceNote getbacktracenoteICustomTabsCallback_Parcel = removeconsoleview.ICustomTabsCallback_Parcel();
                                            zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted3);
                                            zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!(zOnExtraCallback5 | zOnExtraCallback6)) {
                                                int i10 = onTransact + 11;
                                                IAuthTabCallbackStub = i10 % 128;
                                                if (i10 % 2 != 0) {
                                                    onwarmupcompleted.onExtraCallback();
                                                    throw null;
                                                }
                                                if (objOnMinimized10 != onwarmupcompleted.onExtraCallback()) {
                                                    obj4 = objOnMinimized10;
                                                    w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackStub, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallback_Parcel, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1871405456, true, new FacePayTestActivity$.ExternalSyntheticLambda29(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                    getBacktraceNote getbacktracenoteIsEngagementSignalsApiAvailable = removeconsoleview.isEngagementSignalsApiAvailable();
                                                    zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (zOnExtraCallback7) {
                                                        int i11 = onTransact + 115;
                                                        IAuthTabCallbackStub = i11 % 128;
                                                        int i12 = i11 % 2;
                                                        obj5 = objOnMinimized11;
                                                        if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                                        }
                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIsEngagementSignalsApiAvailable, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1695077199, true, new FacePayTestActivity$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                        getBacktraceNote getbacktracenoteICustomTabsCallbackStubProxy = removeconsoleview.ICustomTabsCallbackStubProxy();
                                                        zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!zOnExtraCallback8) {
                                                            int i13 = IAuthTabCallbackStub + 121;
                                                            onTransact = i13 % 128;
                                                            int i14 = i13 % 2;
                                                            obj6 = objOnMinimized12;
                                                            if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                                            }
                                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                            getBacktraceNote getbacktracenoteAccess000 = removeconsoleview.access000();
                                                            getBacktraceNote getbacktracenoteOnPostMessage = removeconsoleview.onPostMessage();
                                                            zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                            if (zOnExtraCallback9) {
                                                                int i15 = IAuthTabCallbackStub + 105;
                                                                onTransact = i15 % 128;
                                                                int i16 = i15 % 2;
                                                                obj7 = objOnMinimized13;
                                                                if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                                                }
                                                                w4.onExtraCallbackWithResult(getbacktracenoteAccess000, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                getBacktraceNote getbacktracenoteNewAuthTabSession = removeconsoleview.newAuthTabSession();
                                                                zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                if (!zOnExtraCallback10) {
                                                                    int i17 = onTransact + 111;
                                                                    IAuthTabCallbackStub = i17 % 128;
                                                                    if (i17 % 2 != 0) {
                                                                        int i18 = 98 / 0;
                                                                        obj8 = objOnMinimized14;
                                                                        if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                                                        }
                                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                        getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy = removeconsoleview.ICustomTabsServiceStubProxy();
                                                                        getBacktraceNote getbacktracenoteNewSession = removeconsoleview.newSession();
                                                                        zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                        if (!zOnExtraCallback11) {
                                                                            Object obj15 = objOnMinimized15;
                                                                            if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                                                                                FacePayTestActivity$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new FacePayTestActivity$.ExternalSyntheticLambda8(facePayTestActivity);
                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                                                                                obj15 = externalSyntheticLambda8;
                                                                            }
                                                                            w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsServiceStubProxy, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewSession, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj15, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback4 = ForwardingCameraControl.onExtraCallback(2107681002, true, new FacePayTestActivity$.ExternalSyntheticLambda9(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                            getBacktraceNote getbacktracenote5 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 1788347202, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -1788347186, matches.onExtraCallback());
                                                                            boolean zOnExtraCallback24 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                            if (!(!zOnExtraCallback24)) {
                                                                                FacePayTestActivity$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new FacePayTestActivity$.ExternalSyntheticLambda10(facePayTestActivity);
                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                                                                                obj9 = externalSyntheticLambda10;
                                                                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (QuirksExternalSyntheticBackport0) null, getbacktracenote5, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj9, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                getBacktraceNote getbacktracenoteOnUnminimized = removeconsoleview.onUnminimized();
                                                                                getBacktraceNote getbacktracenote6 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), -1941493616, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, 1941493629, matches.onExtraCallback());
                                                                                zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                if (zOnExtraCallback12) {
                                                                                    Object obj16 = objOnMinimized17;
                                                                                    if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                                                                                        FacePayTestActivity$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new FacePayTestActivity$.ExternalSyntheticLambda11(facePayTestActivity);
                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                                                                        obj16 = externalSyntheticLambda11;
                                                                                    }
                                                                                    w4.onExtraCallbackWithResult(getbacktracenoteOnUnminimized, (QuirksExternalSyntheticBackport0) null, getbacktracenote6, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj16, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                    w2.IAuthTabCallback(removeconsoleview.ICustomTabsCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, onnavigationevent.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
                                                                                    getBacktraceNote getbacktracenote7 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 1660583027, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -1660583000, matches.onExtraCallback());
                                                                                    getBacktraceNote getbacktracenote8 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 892415385, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -892415356, matches.onExtraCallback());
                                                                                    boolean zOnExtraCallback25 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                    Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                    if (!zOnExtraCallback25) {
                                                                                        Object obj17 = objOnMinimized18;
                                                                                        if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                                                                                            FacePayTestActivity$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new FacePayTestActivity$.ExternalSyntheticLambda13(facePayTestActivity);
                                                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                                                                                            obj17 = externalSyntheticLambda13;
                                                                                        }
                                                                                        w4.onExtraCallbackWithResult(getbacktracenote7, (QuirksExternalSyntheticBackport0) null, getbacktracenote8, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj17, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                        w4.onExtraCallbackWithResult(removeconsoleview.access100(), (QuirksExternalSyntheticBackport0) null, removeconsoleview.validateRelationship(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 131066);
                                                                                        AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                        w2.IAuthTabCallback(removeconsoleview.onMessageChannelReady(), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, onnavigationevent.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
                                                                                        getBacktraceNote interfaceDescriptor = removeconsoleview.getInterfaceDescriptor();
                                                                                        getBacktraceNote getbacktracenote9 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 556805517, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -556805494, matches.onExtraCallback());
                                                                                        boolean zOnExtraCallback26 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                        Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                        if (!zOnExtraCallback26) {
                                                                                            Object obj18 = objOnMinimized19;
                                                                                            if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                                                                                FacePayTestActivity$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new FacePayTestActivity$.ExternalSyntheticLambda14(facePayTestActivity);
                                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                                                                                                obj18 = externalSyntheticLambda14;
                                                                                            }
                                                                                            w4.onExtraCallbackWithResult(interfaceDescriptor, (QuirksExternalSyntheticBackport0) null, getbacktracenote9, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj18, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                            getBacktraceNote getbacktracenoteAsInterface = removeconsoleview.asInterface();
                                                                                            getBacktraceNote getbacktracenoteOnRelationshipValidationResult = removeconsoleview.onRelationshipValidationResult();
                                                                                            boolean zOnExtraCallback27 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                            Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                            if (!zOnExtraCallback27) {
                                                                                                Object obj19 = objOnMinimized20;
                                                                                                if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                                                                                                    FacePayTestActivity$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new FacePayTestActivity$.ExternalSyntheticLambda15(facePayTestActivity);
                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                                                                                                    obj19 = externalSyntheticLambda15;
                                                                                                }
                                                                                                w4.onExtraCallbackWithResult(getbacktracenoteAsInterface, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnRelationshipValidationResult, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj19, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                getBacktraceNote getbacktracenoteOnExtraCallbackWithResult = removeconsoleview.onExtraCallbackWithResult();
                                                                                                getBacktraceNote getbacktracenoteOnActivityResized = removeconsoleview.onActivityResized();
                                                                                                boolean zOnExtraCallback28 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                                Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                if (!zOnExtraCallback28) {
                                                                                                    Object obj20 = objOnMinimized21;
                                                                                                    if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                                                                                        FacePayTestActivity$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new FacePayTestActivity$.ExternalSyntheticLambda16(facePayTestActivity);
                                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                                                                                                        obj20 = externalSyntheticLambda16;
                                                                                                    }
                                                                                                    w4.onExtraCallbackWithResult(getbacktracenoteOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnActivityResized, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj20, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                                    w2.IAuthTabCallback(removeconsoleview.ICustomTabsCallback(), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, onnavigationevent.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 3078, 0, 4086);
                                                                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback5 = ForwardingCameraControl.onExtraCallback(-952988495, true, new FacePayTestActivity$.ExternalSyntheticLambda17(facePayTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                                                    getBacktraceNote getbacktracenoteIAuthTabCallbackStubProxy = removeconsoleview.IAuthTabCallbackStubProxy();
                                                                                                    boolean zOnExtraCallback29 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                    if (!zOnExtraCallback29) {
                                                                                                        int i19 = IAuthTabCallbackStub + 17;
                                                                                                        onTransact = i19 % 128;
                                                                                                        int i20 = i19 % 2;
                                                                                                        obj10 = objOnMinimized22;
                                                                                                        if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                                                                                        }
                                                                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback5, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIAuthTabCallbackStubProxy, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj10, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                        if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
                                                                                                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(addPolicy.ITrustedWebActivityCallbackStub().onExtraCallback("face_verify_test_log_enabled", false)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                                                                                                        }
                                                                                                        w4.onExtraCallbackWithResult(removeconsoleview.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, removeconsoleview.ICustomTabsService(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(342625751, true, new FacePayTestActivity$.ExternalSyntheticLambda19((getSupportedHighSpeedResolutionsFor) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
                                                                                                        getBacktraceNote getbacktracenoteIAuthTabCallback = removeconsoleview.IAuthTabCallback();
                                                                                                        getBacktraceNote getbacktracenoteOnActivityLayout = removeconsoleview.onActivityLayout();
                                                                                                        zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                                        zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                                                                                                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                                                                                                        Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                        if (zOnExtraCallback13 | zOnExtraCallback14 | zOnNavigationEvent) {
                                                                                                            Object obj21 = objOnMinimized23;
                                                                                                            if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                FacePayTestActivity$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new FacePayTestActivity$.ExternalSyntheticLambda20(facePayTestActivity, findresandmsg, v1Var);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                                                                                                                obj21 = externalSyntheticLambda20;
                                                                                                            }
                                                                                                            w4.onExtraCallbackWithResult(getbacktracenoteIAuthTabCallback, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnActivityLayout, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj21, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                            getBacktraceNote getbacktracenoteOnNavigationEvent = removeconsoleview.onNavigationEvent();
                                                                                                            getBacktraceNote getbacktracenoteExtraCallback = removeconsoleview.extraCallback();
                                                                                                            boolean zOnExtraCallback30 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                                            boolean zOnExtraCallback31 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                                                                                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                                                                                                            Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                            if (!(zOnExtraCallback30 | zOnExtraCallback31 | zOnNavigationEvent2)) {
                                                                                                                Object obj22 = objOnMinimized24;
                                                                                                                if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                    FacePayTestActivity$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new FacePayTestActivity$.ExternalSyntheticLambda21(facePayTestActivity, findresandmsg, v1Var);
                                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                                                                                                                    obj22 = externalSyntheticLambda21;
                                                                                                                }
                                                                                                                w4.onExtraCallbackWithResult(getbacktracenoteOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, getbacktracenoteExtraCallback, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj22, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(TorchFlashRequiredFor3aUpdateQuirk.onNavigationEvent(onextracallback, ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6)), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                                                                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    FacePayTestActivity$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new FacePayTestActivity$.ExternalSyntheticLambda18(facePayTestActivity);
                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                                                                                                    obj10 = externalSyntheticLambda18;
                                                                                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback5, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIAuthTabCallbackStubProxy, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj10, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                    if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
                                                                                                    }
                                                                                                    w4.onExtraCallbackWithResult(removeconsoleview.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, removeconsoleview.ICustomTabsService(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(342625751, true, new FacePayTestActivity$.ExternalSyntheticLambda19((getSupportedHighSpeedResolutionsFor) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
                                                                                                    getBacktraceNote getbacktracenoteIAuthTabCallback2 = removeconsoleview.IAuthTabCallback();
                                                                                                    getBacktraceNote getbacktracenoteOnActivityLayout2 = removeconsoleview.onActivityLayout();
                                                                                                    zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                                    zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                                                                                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                                                                                                    Object objOnMinimized232 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                    if (zOnExtraCallback13 | zOnExtraCallback14 | zOnNavigationEvent) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                obj9 = objOnMinimized16;
                                                                                if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                                                                                }
                                                                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (QuirksExternalSyntheticBackport0) null, getbacktracenote5, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj9, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                                getBacktraceNote getbacktracenoteOnUnminimized2 = removeconsoleview.onUnminimized();
                                                                                getBacktraceNote getbacktracenote62 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), -1941493616, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, 1941493629, matches.onExtraCallback());
                                                                                zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                                Object objOnMinimized172 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                if (zOnExtraCallback12) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj8 = objOnMinimized14;
                                                                        if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                                                        }
                                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                        getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy2 = removeconsoleview.ICustomTabsServiceStubProxy();
                                                                        getBacktraceNote getbacktracenoteNewSession2 = removeconsoleview.newSession();
                                                                        zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                        Object objOnMinimized152 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                        if (!zOnExtraCallback11) {
                                                                        }
                                                                    }
                                                                }
                                                                FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                                                                obj8 = externalSyntheticLambda7;
                                                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                                getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy22 = removeconsoleview.ICustomTabsServiceStubProxy();
                                                                getBacktraceNote getbacktracenoteNewSession22 = removeconsoleview.newSession();
                                                                zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                                Object objOnMinimized1522 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                if (!zOnExtraCallback11) {
                                                                }
                                                            }
                                                            FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                                                            obj7 = externalSyntheticLambda5;
                                                            w4.onExtraCallbackWithResult(getbacktracenoteAccess000, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback32 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                            getBacktraceNote getbacktracenoteNewAuthTabSession2 = removeconsoleview.newAuthTabSession();
                                                            zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                            Object objOnMinimized142 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                            if (!zOnExtraCallback10) {
                                                            }
                                                            FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda72 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda72);
                                                            obj8 = externalSyntheticLambda72;
                                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback32, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                            getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                                            getBacktraceNote getbacktracenoteNewSession222 = removeconsoleview.newSession();
                                                            zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                            Object objOnMinimized15222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                            if (!zOnExtraCallback11) {
                                                            }
                                                        }
                                                        FacePayTestActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new FacePayTestActivity$.ExternalSyntheticLambda4(facePayTestActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                                                        obj6 = externalSyntheticLambda4;
                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                        getBacktraceNote getbacktracenoteAccess0002 = removeconsoleview.access000();
                                                        getBacktraceNote getbacktracenoteOnPostMessage2 = removeconsoleview.onPostMessage();
                                                        zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                        Object objOnMinimized132 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (zOnExtraCallback9) {
                                                        }
                                                        FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda52 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda52);
                                                        obj7 = externalSyntheticLambda52;
                                                        w4.onExtraCallbackWithResult(getbacktracenoteAccess0002, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback322 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                        getBacktraceNote getbacktracenoteNewAuthTabSession22 = removeconsoleview.newAuthTabSession();
                                                        zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                        Object objOnMinimized1422 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!zOnExtraCallback10) {
                                                        }
                                                        FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda722 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda722);
                                                        obj8 = externalSyntheticLambda722;
                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback322, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession22, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                        getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy2222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                                        getBacktraceNote getbacktracenoteNewSession2222 = removeconsoleview.newSession();
                                                        zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                        Object objOnMinimized152222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!zOnExtraCallback11) {
                                                        }
                                                    }
                                                    FacePayTestActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new FacePayTestActivity$.ExternalSyntheticLambda2(facePayTestActivity);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                                                    obj5 = externalSyntheticLambda2;
                                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIsEngagementSignalsApiAvailable, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback22 = ForwardingCameraControl.onExtraCallback(-1695077199, true, new FacePayTestActivity$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                    getBacktraceNote getbacktracenoteICustomTabsCallbackStubProxy2 = removeconsoleview.ICustomTabsCallbackStubProxy();
                                                    zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                    Object objOnMinimized122 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnExtraCallback8) {
                                                    }
                                                    FacePayTestActivity$.ExternalSyntheticLambda4 externalSyntheticLambda42 = new FacePayTestActivity$.ExternalSyntheticLambda4(facePayTestActivity);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda42);
                                                    obj6 = externalSyntheticLambda42;
                                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback22, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                    getBacktraceNote getbacktracenoteAccess00022 = removeconsoleview.access000();
                                                    getBacktraceNote getbacktracenoteOnPostMessage22 = removeconsoleview.onPostMessage();
                                                    zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                    Object objOnMinimized1322 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (zOnExtraCallback9) {
                                                    }
                                                    FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda522 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda522);
                                                    obj7 = externalSyntheticLambda522;
                                                    w4.onExtraCallbackWithResult(getbacktracenoteAccess00022, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage22, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3222 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                    getBacktraceNote getbacktracenoteNewAuthTabSession222 = removeconsoleview.newAuthTabSession();
                                                    zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                    Object objOnMinimized14222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnExtraCallback10) {
                                                    }
                                                    FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda7222 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7222);
                                                    obj8 = externalSyntheticLambda7222;
                                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                                    getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy22222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                                    getBacktraceNote getbacktracenoteNewSession22222 = removeconsoleview.newSession();
                                                    zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                                    Object objOnMinimized1522222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnExtraCallback11) {
                                                    }
                                                }
                                            }
                                            FacePayTestActivity$.ExternalSyntheticLambda28 externalSyntheticLambda28 = new FacePayTestActivity$.ExternalSyntheticLambda28(iCustomTabsServiceDefaultOnWarmupCompleted3, context);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda28);
                                            obj4 = externalSyntheticLambda28;
                                            w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackStub, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallback_Parcel, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback6 = ForwardingCameraControl.onExtraCallback(-1871405456, true, new FacePayTestActivity$.ExternalSyntheticLambda29(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                            getBacktraceNote getbacktracenoteIsEngagementSignalsApiAvailable2 = removeconsoleview.isEngagementSignalsApiAvailable();
                                            zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                            Object objOnMinimized112 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (zOnExtraCallback7) {
                                            }
                                            FacePayTestActivity$.ExternalSyntheticLambda2 externalSyntheticLambda22 = new FacePayTestActivity$.ExternalSyntheticLambda2(facePayTestActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda22);
                                            obj5 = externalSyntheticLambda22;
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback6, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIsEngagementSignalsApiAvailable2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback222 = ForwardingCameraControl.onExtraCallback(-1695077199, true, new FacePayTestActivity$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                            getBacktraceNote getbacktracenoteICustomTabsCallbackStubProxy22 = removeconsoleview.ICustomTabsCallbackStubProxy();
                                            zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                            Object objOnMinimized1222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnExtraCallback8) {
                                            }
                                            FacePayTestActivity$.ExternalSyntheticLambda4 externalSyntheticLambda422 = new FacePayTestActivity$.ExternalSyntheticLambda4(facePayTestActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda422);
                                            obj6 = externalSyntheticLambda422;
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy22, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            getBacktraceNote getbacktracenoteAccess000222 = removeconsoleview.access000();
                                            getBacktraceNote getbacktracenoteOnPostMessage222 = removeconsoleview.onPostMessage();
                                            zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                            Object objOnMinimized13222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (zOnExtraCallback9) {
                                            }
                                            FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5222 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5222);
                                            obj7 = externalSyntheticLambda5222;
                                            w4.onExtraCallbackWithResult(getbacktracenoteAccess000222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback32222 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                            getBacktraceNote getbacktracenoteNewAuthTabSession2222 = removeconsoleview.newAuthTabSession();
                                            zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                            Object objOnMinimized142222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnExtraCallback10) {
                                            }
                                            FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda72222 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda72222);
                                            obj8 = externalSyntheticLambda72222;
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback32222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession2222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                            getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy222222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                            getBacktraceNote getbacktracenoteNewSession222222 = removeconsoleview.newSession();
                                            zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                            Object objOnMinimized15222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnExtraCallback11) {
                                            }
                                        }
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda27 externalSyntheticLambda27 = new FacePayTestActivity$.ExternalSyntheticLambda27(iCustomTabsServiceDefaultOnWarmupCompleted3, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda27);
                                    obj3 = externalSyntheticLambda27;
                                    w4.onExtraCallbackWithResult(getbacktracenote4, (QuirksExternalSyntheticBackport0) null, getbacktracenoteMayLaunchUrl, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteICustomTabsCallbackStub2 = removeconsoleview.ICustomTabsCallbackStub();
                                    getBacktraceNote getbacktracenoteICustomTabsCallback_Parcel2 = removeconsoleview.ICustomTabsCallback_Parcel();
                                    zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted3);
                                    zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                    Object objOnMinimized102 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!(zOnExtraCallback5 | zOnExtraCallback6)) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda28 externalSyntheticLambda282 = new FacePayTestActivity$.ExternalSyntheticLambda28(iCustomTabsServiceDefaultOnWarmupCompleted3, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda282);
                                    obj4 = externalSyntheticLambda282;
                                    w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackStub2, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallback_Parcel2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback62 = ForwardingCameraControl.onExtraCallback(-1871405456, true, new FacePayTestActivity$.ExternalSyntheticLambda29(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteIsEngagementSignalsApiAvailable22 = removeconsoleview.isEngagementSignalsApiAvailable();
                                    zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized1122 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback7) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda2 externalSyntheticLambda222 = new FacePayTestActivity$.ExternalSyntheticLambda2(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda222);
                                    obj5 = externalSyntheticLambda222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback62, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIsEngagementSignalsApiAvailable22, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2222 = ForwardingCameraControl.onExtraCallback(-1695077199, true, new FacePayTestActivity$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteICustomTabsCallbackStubProxy222 = removeconsoleview.ICustomTabsCallbackStubProxy();
                                    zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized12222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback8) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4222 = new FacePayTestActivity$.ExternalSyntheticLambda4(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4222);
                                    obj6 = externalSyntheticLambda4222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback2222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteAccess0002222 = removeconsoleview.access000();
                                    getBacktraceNote getbacktracenoteOnPostMessage2222 = removeconsoleview.onPostMessage();
                                    zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized132222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback9) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda52222 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda52222);
                                    obj7 = externalSyntheticLambda52222;
                                    w4.onExtraCallbackWithResult(getbacktracenoteAccess0002222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage2222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback322222 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteNewAuthTabSession22222 = removeconsoleview.newAuthTabSession();
                                    zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized1422222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback10) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda722222 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda722222);
                                    obj8 = externalSyntheticLambda722222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback322222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession22222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy2222222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                    getBacktraceNote getbacktracenoteNewSession2222222 = removeconsoleview.newSession();
                                    zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized152222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback11) {
                                    }
                                } else {
                                    obj2 = objOnMinimized8;
                                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    w4.onExtraCallbackWithResult(getbacktracenoteUpdateVisuals, (QuirksExternalSyntheticBackport0) null, getbacktracenote3, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenote42 = (getBacktraceNote) removeConsoleView.onNavigationEvent(matches.onExtraCallback(), 1932339329, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{removeconsoleview}, -1932339318, matches.onExtraCallback());
                                    getBacktraceNote getbacktracenoteMayLaunchUrl2 = removeconsoleview.mayLaunchUrl();
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted3);
                                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                    Object objOnMinimized92 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback3 | zOnExtraCallback4) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda27 externalSyntheticLambda272 = new FacePayTestActivity$.ExternalSyntheticLambda27(iCustomTabsServiceDefaultOnWarmupCompleted3, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda272);
                                    obj3 = externalSyntheticLambda272;
                                    w4.onExtraCallbackWithResult(getbacktracenote42, (QuirksExternalSyntheticBackport0) null, getbacktracenoteMayLaunchUrl2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteICustomTabsCallbackStub22 = removeconsoleview.ICustomTabsCallbackStub();
                                    getBacktraceNote getbacktracenoteICustomTabsCallback_Parcel22 = removeconsoleview.ICustomTabsCallback_Parcel();
                                    zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted3);
                                    zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                                    Object objOnMinimized1022 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!(zOnExtraCallback5 | zOnExtraCallback6)) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda28 externalSyntheticLambda2822 = new FacePayTestActivity$.ExternalSyntheticLambda28(iCustomTabsServiceDefaultOnWarmupCompleted3, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2822);
                                    obj4 = externalSyntheticLambda2822;
                                    w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackStub22, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallback_Parcel22, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback622 = ForwardingCameraControl.onExtraCallback(-1871405456, true, new FacePayTestActivity$.ExternalSyntheticLambda29(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteIsEngagementSignalsApiAvailable222 = removeconsoleview.isEngagementSignalsApiAvailable();
                                    zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized11222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback7) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2222 = new FacePayTestActivity$.ExternalSyntheticLambda2(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2222);
                                    obj5 = externalSyntheticLambda2222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback622, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIsEngagementSignalsApiAvailable222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback22222 = ForwardingCameraControl.onExtraCallback(-1695077199, true, new FacePayTestActivity$.ExternalSyntheticLambda3(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteICustomTabsCallbackStubProxy2222 = removeconsoleview.ICustomTabsCallbackStubProxy();
                                    zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized122222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback8) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda4 externalSyntheticLambda42222 = new FacePayTestActivity$.ExternalSyntheticLambda4(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda42222);
                                    obj6 = externalSyntheticLambda42222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback22222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteICustomTabsCallbackStubProxy2222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteAccess00022222 = removeconsoleview.access000();
                                    getBacktraceNote getbacktracenoteOnPostMessage22222 = removeconsoleview.onPostMessage();
                                    zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized1322222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback9) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda5 externalSyntheticLambda522222 = new FacePayTestActivity$.ExternalSyntheticLambda5(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda522222);
                                    obj7 = externalSyntheticLambda522222;
                                    w4.onExtraCallbackWithResult(getbacktracenoteAccess00022222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnPostMessage22222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3222222 = ForwardingCameraControl.onExtraCallback(1755024488, true, new FacePayTestActivity$.ExternalSyntheticLambda6(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    getBacktraceNote getbacktracenoteNewAuthTabSession222222 = removeconsoleview.newAuthTabSession();
                                    zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized14222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback10) {
                                    }
                                    FacePayTestActivity$.ExternalSyntheticLambda7 externalSyntheticLambda7222222 = new FacePayTestActivity$.ExternalSyntheticLambda7(facePayTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7222222);
                                    obj8 = externalSyntheticLambda7222222;
                                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3222222, (QuirksExternalSyntheticBackport0) null, getbacktracenoteNewAuthTabSession222222, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
                                    getBacktraceNote getbacktracenoteICustomTabsServiceStubProxy22222222 = removeconsoleview.ICustomTabsServiceStubProxy();
                                    getBacktraceNote getbacktracenoteNewSession22222222 = removeconsoleview.newSession();
                                    zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
                                    Object objOnMinimized1522222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback11) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            FacePayTestActivity$.ExternalSyntheticLambda22 externalSyntheticLambda223 = new FacePayTestActivity$.ExternalSyntheticLambda22(facePayTestActivity, iCustomTabsServiceDefaultOnWarmupCompleted2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda223);
            obj = externalSyntheticLambda223;
            w4.onExtraCallbackWithResult(getbacktracenote, (QuirksExternalSyntheticBackport0) null, getbacktracenoteAsBinder, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114682);
            getBacktraceNote getbacktracenoteReceiveFile2 = removeconsoleview.receiveFile();
            getBacktraceNote getbacktracenoteIAuthTabCallbackStub2 = removeconsoleview.IAuthTabCallbackStub();
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayTestActivity);
            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted);
            Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback | zOnExtraCallback2) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        int i;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw = (r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 81;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
            if ((iIntValue & 50) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdauhpxsw2exovtbrzj8u1te7trnw)) {
                    int i4 = IAuthTabCallbackStub + 49;
                    onTransact = i4 % 128;
                    i = i4 % 2 == 0 ? 5 : 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1513762623, iIntValue, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous> (FacePayTestActivity.kt:600)");
            }
            r8lambdauhpxsw2exovtbrzj8u1te7trnw.onExtraCallback(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 18) & 3670016, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 115;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ v1 $showConfigBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(v1 v1Var, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$showConfigBottomSheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$showConfigBottomSheetState, access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            int i5 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$showConfigBottomSheetState;
                this.label = 1;
                if (v1.onExtraCallback(v1Var, (x1) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, Context context, v1 v1Var, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(v1Var, null), 3, (Object) null);
        callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(callTimeoutMillis.Companion, context, onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallbackWithResult(), new certificateChainCleaner((String) null, (String) null, (String) null, 4, (DefaultConstructorMarker) null), (List) null, (String) null, (String) null, (Function1) null, (Function1) null, 248, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(findResAndMsg findresandmsg, v1 v1Var, Context context, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStub + 5;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2045039592, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous> (FacePayTestActivity.kt:603)");
            }
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2 | zOnNavigationEvent2))) {
                FacePayTestActivity$.ExternalSyntheticLambda36 externalSyntheticLambda36 = new FacePayTestActivity$.ExternalSyntheticLambda36(findresandmsg, context, v1Var, cameraPresenceProviderExternalSyntheticLambda6);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda36);
                obj = externalSyntheticLambda36;
                u4Var.onNavigationEvent("공유하기", (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376966, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent("공유하기", (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376966, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 109;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ v1 $showConfigBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(v1 v1Var, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$showConfigBottomSheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$showConfigBottomSheetState, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$showConfigBottomSheetState;
                this.label = 1;
                if (v1.onExtraCallback(v1Var, (x1) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 25;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i7 != 0) {
                    int i8 = 40 / 0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        boolean z = false;
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        v1 v1Var = (v1) objArr[1];
        u4 u4Var = (u4) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i3 = IAuthTabCallbackStub + 53;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = IAuthTabCallbackStub + 81;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 4;
            }
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1795761191, iIntValue, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.FaceVerifyTestScreen.<anonymous> (FacePayTestActivity.kt:626)");
            }
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    FacePayTestActivity$.ExternalSyntheticLambda30 externalSyntheticLambda30 = new FacePayTestActivity$.ExternalSyntheticLambda30(findresandmsg, v1Var);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda30);
                    int i7 = IAuthTabCallbackStub + 13;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    obj = externalSyntheticLambda30;
                }
                u4Var.onNavigationEvent("닫기", (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376966, iIntValue & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallbackStub + 55;
                    onTransact = i9 % 128;
                    if (i9 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final BrickModuleImplExternalSyntheticLambda2 onWarmupCompleted(Context context, getTinyLocalStorage.access100 access100Var, copyToCroppedImage copytocroppedimage, copyToCroppedImage copytocroppedimage2, String str) {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2OnExtraCallbackWithResult = logAndOpenStore.onExtraCallbackWithResult(context, ForwardingCameraControl.onExtraCallbackWithResult(468073811, true, new FacePayTestActivity$.ExternalSyntheticLambda0(copytocroppedimage, copytocroppedimage2, access100Var, str)));
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return brickModuleImplExternalSyntheticLambda2OnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getTinyLocalStorage.access100 access100Var, String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        getTinyLocalStorage.onWarmupCompleted onwarmupcompleted;
        Double dValueOf;
        Float f;
        Float f2;
        getCausesCount getcausescountOnExtraCallbackWithResult;
        getCausesCount getcausescountIAuthTabCallbackDefault;
        getCausesCount getcausescountIAuthTabCallback;
        getCausesCount getcausescountIAuthTabCallbackStub;
        getCausesCount getcausescountAsInterface;
        getCausesCount getcausescountOnExtraCallback;
        getCausesCount getcausescountOnTransact;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1225894110, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.showCollectedImageBottomSheetDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:661)");
            }
            Float f3 = null;
            if (access100Var == null || (getcausescountOnTransact = access100Var.onTransact()) == null) {
                onwarmupcompleted = null;
            } else {
                int i4 = IAuthTabCallbackStub + 39;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                onwarmupcompleted = (getTinyLocalStorage.onWarmupCompleted) getcausescountOnTransact.onExtraCallback();
            }
            if (access100Var != null) {
                int i5 = onTransact + 63;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                getCausesCount getcausescountOnNavigationEvent = access100Var.onNavigationEvent();
                Pair pair = getcausescountOnNavigationEvent != null ? (Pair) getcausescountOnNavigationEvent.onExtraCallback() : null;
                StringBuilder sb = new StringBuilder();
                if (true ^ StringsKt.isBlank(str)) {
                    int i7 = IAuthTabCallbackStub + 57;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    sb.append(str);
                    sb.append('\n');
                    sb.append('\n');
                }
                if (access100Var != null) {
                    int i9 = onTransact + 5;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        access100Var.onWarmupCompleted();
                        f3.hashCode();
                        throw null;
                    }
                    getCausesCount getcausescountOnWarmupCompleted = access100Var.onWarmupCompleted();
                    Double d = getcausescountOnWarmupCompleted != null ? (Double) getcausescountOnWarmupCompleted.onExtraCallback() : null;
                    sb.append("Blur: " + d);
                    sb.append('\n');
                    sb.append("Brightness: " + ((access100Var == null || (getcausescountOnExtraCallback = access100Var.onExtraCallback()) == null) ? null : (Double) getcausescountOnExtraCallback.onExtraCallback()));
                    sb.append('\n');
                    Double dValueOf2 = onwarmupcompleted != null ? Double.valueOf(onwarmupcompleted.IAuthTabCallback()) : null;
                    Double dValueOf3 = onwarmupcompleted != null ? Double.valueOf(onwarmupcompleted.onNavigationEvent()) : null;
                    if (onwarmupcompleted != null) {
                        int i10 = onTransact + 93;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        dValueOf = Double.valueOf(onwarmupcompleted.onExtraCallbackWithResult());
                    } else {
                        dValueOf = null;
                    }
                    sb.append("Pose: pitch=" + dValueOf2 + ", roll=" + dValueOf3 + ", yaw=" + dValueOf);
                    sb.append('\n');
                    sb.append("Closed Eye: " + (pair != null ? (Float) pair.getFirst() : null));
                    sb.append('\n');
                    if (access100Var == null || (getcausescountAsInterface = access100Var.asInterface()) == null) {
                        f = null;
                    } else {
                        int i12 = onTransact + 11;
                        IAuthTabCallbackStub = i12 % 128;
                        if (i12 % 2 != 0) {
                            throw null;
                        }
                        f = (Float) getcausescountAsInterface.onExtraCallback();
                    }
                    sb.append("Occlusion: " + f);
                    sb.append('\n');
                    sb.append("Quality Score: " + ((access100Var == null || (getcausescountIAuthTabCallbackStub = access100Var.IAuthTabCallbackStub()) == null) ? null : (Float) getcausescountIAuthTabCallbackStub.onExtraCallback()));
                    sb.append('\n');
                    sb.append("Mask: " + ((access100Var == null || (getcausescountIAuthTabCallback = access100Var.IAuthTabCallback()) == null) ? null : (Float) getcausescountIAuthTabCallback.onExtraCallback()));
                    sb.append('\n');
                    if (access100Var == null || (getcausescountIAuthTabCallbackDefault = access100Var.IAuthTabCallbackDefault()) == null) {
                        f2 = null;
                    } else {
                        int i13 = IAuthTabCallbackStub + 39;
                        onTransact = i13 % 128;
                        int i14 = i13 % 2;
                        f2 = (Float) getcausescountIAuthTabCallbackDefault.onExtraCallback();
                    }
                    sb.append("Sunglasses: " + f2);
                    sb.append('\n');
                    if (access100Var != null && (getcausescountOnExtraCallbackWithResult = access100Var.onExtraCallbackWithResult()) != null) {
                        f3 = (Float) getcausescountOnExtraCallbackWithResult.onExtraCallback();
                    }
                    sb.append("Neutral Expression: " + f3);
                    sb.append('\n');
                    y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, sb.toString(), null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 15) & 458752), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        brickModuleImplExternalSyntheticLambda2.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean zOnExtraCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = onTransact + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i7 = onTransact + 55;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = onTransact + 23;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 18 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-272671824, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.showCollectedImageBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (FacePayTestActivity.kt:701)");
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(brickModuleImplExternalSyntheticLambda2);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                    int i11 = IAuthTabCallbackStub + 37;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        FacePayTestActivity$.ExternalSyntheticLambda35 externalSyntheticLambda35 = new FacePayTestActivity$.ExternalSyntheticLambda35(brickModuleImplExternalSyntheticLambda2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda35);
                        obj = externalSyntheticLambda35;
                    }
                    Object[] objArr = new Object[1];
                    a(new char[]{29692, 63872}, 39761 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
                    u4Var.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1014);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(brickModuleImplExternalSyntheticLambda2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(copyToCroppedImage copytocroppedimage, copyToCroppedImage copytocroppedimage2, getTinyLocalStorage.access100 access100Var, String str, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 125;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(brickModuleImplExternalSyntheticLambda2, "");
            if ((i & 83) == 0) {
                if ((i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(brickModuleImplExternalSyntheticLambda2) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(brickModuleImplExternalSyntheticLambda2)) {
                    int i6 = IAuthTabCallbackStub + 103;
                    onTransact = i6 % 128;
                    i2 = i6 % 2 == 0 ? 3 : 4;
                } else {
                    int i7 = IAuthTabCallbackStub + 59;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(brickModuleImplExternalSyntheticLambda2, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 15;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(468073811, i3, -1, "im.toss.features.faceverify.impl.ui.test.FacePayTestActivity.showCollectedImageBottomSheetDialog.<anonymous> (FacePayTestActivity.kt:650)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(onextracallback, 1.0f, false), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i11 = IAuthTabCallbackStub + 15;
                onTransact = i11 % 128;
                if (i11 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(removeConsoleView.onNavigationEvent.requestPostMessageChannel(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-1225894110, true, new FacePayTestActivity$.ExternalSyntheticLambda48(access100Var, str), cameraCaptureResultEmptyCameraCaptureResult, 54), (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 384, 12254);
            getNavigationIcon.onExtraCallback(copytocroppedimage, (String) null, setAdVideoPlaybackListener.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), "Image"), (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, 0, cameraCaptureResultEmptyCameraCaptureResult, 48, 248);
            getNavigationIcon.onExtraCallback(copytocroppedimage2, (String) null, setAdVideoPlaybackListener.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), "Image"), (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, 0, cameraCaptureResultEmptyCameraCaptureResult, 48, 248);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-272671824, true, new FacePayTestActivity$.ExternalSyntheticLambda49(brickModuleImplExternalSyntheticLambda2), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4091);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(iEngagementSignalsCallback_Parcel, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ IEngagementSignalsCallback_Parcel<Intent> $selfieIntentResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$selfieIntentResult = iEngagementSignalsCallback_Parcel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = FacePayTestActivity.this.new asBinder(this.$selfieIntentResult, access13800Var);
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 != 0) {
                int i6 = onNavigationEvent + 61;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                appIsMiniService appisminiservice = (appIsMiniService) FacePayTestActivity.onNavigationEvent(new Object[]{FacePayTestActivity.this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1449252973, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1449252975, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                this.label = 1;
                Object objIAuthTabCallback = appisminiservice.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    int i8 = onNavigationEvent + 99;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
                objOnNavigationEvent = objIAuthTabCallback;
            }
            IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.$selfieIntentResult;
            BaseActivity baseActivity = FacePayTestActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                i = 0;
                iEngagementSignalsCallback_Parcel.onNavigationEvent(SelfieCameraV2Activity.onExtraCallback.onWarmupCompleted(SelfieCameraV2Activity.Companion, baseActivity, (String) null, (String) null, "test", (String) null, false, false, true, 118, (Object) null));
                baseActivity.overridePendingTransition(0, 0);
                int i10 = IAuthTabCallback + 125;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            } else {
                i = 0;
            }
            BaseActivity baseActivity2 = FacePayTestActivity.this;
            if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                int i12 = onNavigationEvent + 91;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                baseActivity2.setResult(i);
                baseActivity2.finish();
                int i14 = onNavigationEvent + 81;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackStub + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
    }

    private static final DebugConsolePoint onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<DebugConsolePoint> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DebugConsolePoint debugConsolePoint = (DebugConsolePoint) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = onTransact + 15;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return debugConsolePoint;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1269575471, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1269575472, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayTestActivity facePayTestActivity, ICustomTabsServiceDefault iCustomTabsServiceDefault) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity, iCustomTabsServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -300121271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 300121278, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, Context context, findResAndMsg findresandmsg, v1 v1Var, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {facePayTestActivity, context, findresandmsg, v1Var, cameraPresenceProviderExternalSyntheticLambda6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1659818045, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1659818056, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(findResAndMsg findresandmsg, Context context, v1 v1Var, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{findresandmsg, context, v1Var, cameraPresenceProviderExternalSyntheticLambda6}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 447958831, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -447958812, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayTestActivity facePayTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {facePayTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 189906922, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -189906917, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayTestActivity facePayTestActivity, Context context) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity, context}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1980093790, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1980093811, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(FacePayTestActivity facePayTestActivity) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1434675134, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1434675147, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 590142004, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -590142001, iOnNavigationEvent);
    }

    private final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1211985922, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1211985931, iOnNavigationEvent);
    }

    private static final Unit access000(FacePayTestActivity facePayTestActivity) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1317820082, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1317820068, iOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{iEngagementSignalsCallbackDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 193697810, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -193697804, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1057608619, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1057608609, iOnNavigationEvent);
    }

    private static final Unit ICustomTabsCallback(FacePayTestActivity facePayTestActivity) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -187205679, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 187205679, iOnNavigationEvent);
    }

    private static final Unit onActivityLayout(FacePayTestActivity facePayTestActivity) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 799014043, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -799014031, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(FacePayTestActivity facePayTestActivity, ICustomTabsServiceDefault iCustomTabsServiceDefault) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity, iCustomTabsServiceDefault}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -997851202, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 997851210, iOnNavigationEvent);
    }

    private static final Unit onActivityResized(FacePayTestActivity facePayTestActivity) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{facePayTestActivity}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 39811554, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -39811534, iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(FacePayTestActivity facePayTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {facePayTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 866391013, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -866390996, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(ICustomTabsServiceDefault iCustomTabsServiceDefault, Context context) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(new Object[]{iCustomTabsServiceDefault, context}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1397851809, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1397851824, iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {findresandmsg, v1Var, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 2092589261, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -2092589257, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) onNavigationEvent(objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1005020312, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1005020294, iOnNavigationEvent);
    }

    public final RVFilePathDecoder onNavigationEvent() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (RVFilePathDecoder) onNavigationEvent(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 731477022, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -731477006, iOnNavigationEvent);
    }

    public final appIsMiniService IAuthTabCallback() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (appIsMiniService) onNavigationEvent(new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1449252973, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1449252975, iOnNavigationEvent);
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayTestActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStub + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
