package im.toss.features.faceverify.impl.ui.test;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinBroadcastManager;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraState;
import o.CameraUnavailableException;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERTaggedObject;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageProcessingUtil;
import o.LiveDataObservableExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.ProcessorExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.RescheduleReceiver;
import o.ResolutionCorrector;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WorkerUpdaterExternalSyntheticLambda2;
import o.access13800;
import o.accessgetCameraFactoryp;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.createIsolatedReader;
import o.deprecated_authenticator;
import o.dequeImageProxy;
import o.forceDomainCheck;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getSupportedHighSpeedResolutionsFor;
import o.immediateFailedFuture;
import o.isZslDisabledByByUserCaseConfig;
import o.removeChildrenForExpandedActionView;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.showToggleButton;
import o.toMetersPerSecond;
import o.w3b;
import o.w4;
import o.w5a;
import o.x2ExternalSyntheticLambda14;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

@DERTaggedObject
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FacePayBleTestActivity extends Hilt_FacePayBleTestActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    @Inject
    public RescheduleReceiver tossBleScanner;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~((~i3) | i7);
        int i9 = (~i4) | (~(i7 | i3));
        int i10 = i3 | i4 | i7;
        int i11 = i4 + i2 + i + (1635157569 * i5) + ((-1141649966) * i6);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i4) - 711983104) + (488484398 * i2) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i) + (1462763520 * i5) + (1566572544 * i6) + (1631846400 * i12);
        int i14 = (i4 * 1521345644) + 2088555610 + (i2 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i * 1521345871) + (i5 * (-1382509809)) + (i6 * 37969358) + (i12 * (-671350784));
        switch (i13 + (i14 * i14 * (-1069809664))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 119;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onTransact(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnTransact = onTransact(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 77;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        List list = (List) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        FacePayBleTestActivity facePayBleTestActivity = (FacePayBleTestActivity) objArr[2];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[3];
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list, getsupportedhighspeedresolutionsfor, facePayBleTestActivity, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = IAuthTabCallbackStub + 7;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 31793150, iIAuthTabCallback2, -31793144, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
        int i3 = IAuthTabCallbackStub + 9;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(FacePayBleTestActivity facePayBleTestActivity, WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 17;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        facePayBleTestActivity.onExtraCallbackWithResult(workerUpdaterExternalSyntheticLambda2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(workerUpdaterExternalSyntheticLambda2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(workerUpdaterExternalSyntheticLambda2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        FacePayBleTestActivity facePayBleTestActivity = (FacePayBleTestActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asInterface + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayBleTestActivity facePayBleTestActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onNavigationEvent(facePayBleTestActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(facePayBleTestActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayBleTestActivity facePayBleTestActivity, WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 63;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(facePayBleTestActivity, workerUpdaterExternalSyntheticLambda2, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(facePayBleTestActivity, workerUpdaterExternalSyntheticLambda2, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallbackStub + 89;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, FacePayBleTestActivity facePayBleTestActivity, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(list, facePayBleTestActivity, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(list, facePayBleTestActivity, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = asInterface + 101;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(workerUpdaterExternalSyntheticLambda2, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 31;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        FacePayBleTestActivity facePayBleTestActivity = (FacePayBleTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(facePayBleTestActivity);
        }
        onExtraCallbackWithResult(facePayBleTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(FacePayBleTestActivity facePayBleTestActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        facePayBleTestActivity.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 71;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        FacePayBleTestActivity facePayBleTestActivity = (FacePayBleTestActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallbackStub + 37;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 23;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, FacePayBleTestActivity facePayBleTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 77;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(list, facePayBleTestActivity, getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, str);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public final RescheduleReceiver onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RescheduleReceiver rescheduleReceiver = this.tossBleScanner;
        if (rescheduleReceiver != null) {
            int i4 = i3 + 97;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return rescheduleReceiver;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = asInterface + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-235444930, true, new FacePayBleTestActivity$.ExternalSyntheticLambda11(this))), 1, (Object) null);
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onTransact(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i3 + 67;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = asInterface + 47;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(183638108, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FacePayBleTestActivity.kt:60)");
            }
            facePayBleTestActivity.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = asInterface + 25;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-321694570, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.onCreate.<anonymous>.<anonymous> (FacePayBleTestActivity.kt:59)");
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], ForwardingCameraControl.onExtraCallback(183638108, true, new FacePayBleTestActivity$.ExternalSyntheticLambda5(facePayBleTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asInterface + 99;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStub + 23;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = asInterface + 5;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 5;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-235444930, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.onCreate.<anonymous> (FacePayBleTestActivity.kt:58)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-321694570, true, new FacePayBleTestActivity$.ExternalSyntheticLambda10(facePayBleTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = asInterface + 87;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(FacePayBleTestActivity facePayBleTestActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        facePayBleTestActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = asInterface + 73;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 61;
            IAuthTabCallbackStub = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackStub + 73;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1568919871, i, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.FacePayBleTestScreen.<anonymous> (FacePayBleTestActivity.kt:93)");
            }
            createIsolatedReader createisolatedreader = createIsolatedReader.onWarmupCompleted;
            int i8 = createIsolatedReader.IAuthTabCallback;
            long jIAuthTabCallback_Parcel = createisolatedreader.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i8).IAuthTabCallback_Parcel();
            long jOnExtraCallback = ImageProcessingUtil.onExtraCallback(createisolatedreader.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i8).IAuthTabCallback_Parcel(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayBleTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback)) {
                FacePayBleTestActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new FacePayBleTestActivity$.ExternalSyntheticLambda2(facePayBleTestActivity);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                int i9 = asInterface + 77;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                obj = externalSyntheticLambda2;
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jOnExtraCallback, jIAuthTabCallback_Parcel, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) showToggleButton.onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{showToggleButton.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -93960290, 93960291), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 102);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i11 = IAuthTabCallbackStub + 43;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jOnExtraCallback, jIAuthTabCallback_Parcel, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) showToggleButton.onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{showToggleButton.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -93960290, 93960291), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 102);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent(getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 79;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 129) != 128, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(797964569, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.FacePayBleTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayBleTestActivity.kt:122)");
            }
            String str = (String) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 1698586925, forceDomainCheck.IAuthTabCallback(), -1698586924, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new FacePayBleTestActivity$.ExternalSyntheticLambda0(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i4 = asInterface + 9;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            Function1 function1 = (Function1) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new FacePayBleTestActivity$.ExternalSyntheticLambda1(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            x2ExternalSyntheticLambda14.IAuthTabCallback(str, function1, (Function0) objOnMinimized2, quirksExternalSyntheticBackport0OnExtraCallback, false, (DeviceQuirksExternalSyntheticLambda0) null, deviceQuirksExternalSyntheticLambda0OnExtraCallback, 0L, (getBacktraceNote) null, (getBacktraceNote) null, showToggleButton.onExtraCallback.onWarmupCompleted(), (Function2) null, (getBacktraceNote) null, (CameraUnavailableException) null, (CameraState) null, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 806882736, 6, 63920);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asInterface + 49;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(List list, FacePayBleTestActivity facePayBleTestActivity, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = asInterface + 33;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 29) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i6 = IAuthTabCallbackStub + 95;
                    asInterface = i6 % 128;
                    i3 = i6 % 2 == 0 ? 22 : 32;
                } else {
                    i3 = 16;
                }
                i2 |= i3;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 48) == 0) {
            }
        }
        if ((i2 & 145) != 144) {
            int i7 = IAuthTabCallbackStub + 27;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(239014678, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.FacePayBleTestScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePayBleTestActivity.kt:137)");
            }
            facePayBleTestActivity.onExtraCallbackWithResult((WorkerUpdaterExternalSyntheticLambda2) list.get(i), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 41;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
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

    private static final Unit onExtraCallback(List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, FacePayBleTestActivity facePayBleTestActivity, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(797964569, true, new FacePayBleTestActivity$.ExternalSyntheticLambda3(getsupportedhighspeedresolutionsfor)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, list.size(), (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(239014678, true, new FacePayBleTestActivity$.ExternalSyntheticLambda4(list, facePayBleTestActivity)), 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(List list, FacePayBleTestActivity facePayBleTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0))) {
                i3 = 4;
            } else {
                int i5 = IAuthTabCallbackStub + 105;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = IAuthTabCallbackStub + 123;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1580672120, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.FacePayBleTestScreen.<anonymous> (FacePayBleTestActivity.kt:118)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(facePayBleTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    FacePayBleTestActivity$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new FacePayBleTestActivity$.ExternalSyntheticLambda9(list, getsupportedhighspeedresolutionsfor, facePayBleTestActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                    obj = externalSyntheticLambda9;
                }
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = IAuthTabCallbackStub + 33;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1358522822);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 4 : 2) | i;
            int i6 = IAuthTabCallbackStub + 105;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i8 = asInterface + 85;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackStub + 107;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1358522822, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.FacePayBleTestScreen (FacePayBleTestActivity.kt:68)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new onExtraCallbackWithResult(this, liveDataObservableExternalSyntheticLambda1, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                int i12 = IAuthTabCallbackStub + 43;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 2;
                }
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : liveDataObservableExternalSyntheticLambda1) {
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                int i14 = asInterface + 113;
                IAuthTabCallbackStub = i14 % 128;
                int i15 = i14 % 2;
                WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = (WorkerUpdaterExternalSyntheticLambda2) obj;
                String string = StringsKt.trim((String) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 1698586925, forceDomainCheck.IAuthTabCallback(), -1698586924, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback())).toString();
                if (string.length() == 0 || StringsKt.contains(workerUpdaterExternalSyntheticLambda2.asInterface(), string, true)) {
                    arrayList.add(obj);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(1568919871, true, new FacePayBleTestActivity$.ExternalSyntheticLambda12(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), showToggleButton.onExtraCallback.onExtraCallbackWithResult(), (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(1580672120, true, new FacePayBleTestActivity$.ExternalSyntheticLambda13(arrayList, this, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3462, 12582912, 131058);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePayBleTestActivity$.ExternalSyntheticLambda14(this, i));
        }
    }

    private static final Unit onWarmupCompleted(WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        String str;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 4;
            } else {
                int i5 = asInterface + 19;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asInterface + 103;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1011231281, i2, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.ListItem.<anonymous> (FacePayBleTestActivity.kt:152)");
            }
            String strAsInterface = workerUpdaterExternalSyntheticLambda2.asInterface();
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(14);
            int iOnExtraCallback = workerUpdaterExternalSyntheticLambda2.onExtraCallback();
            if (Intrinsics.areEqual(workerUpdaterExternalSyntheticLambda2.IAuthTabCallback(), "bg")) {
                int i9 = asInterface + 39;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                str = "BACKGROUND";
            } else {
                str = "FOREGROUND";
            }
            w5aVar.onExtraCallbackWithResult(strAsInterface, "RSSI: " + iOnExtraCallback + " dBm | " + str, 0L, jOnExtraCallback, (GraphicDeviceInfo) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 3072, 244);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 101;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 1) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                    int i6 = asInterface + 103;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i8 = IAuthTabCallbackStub + 25;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1489650746, i3, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.ListItem.<anonymous> (FacePayBleTestActivity.kt:159)");
            }
            if (workerUpdaterExternalSyntheticLambda2.onTransact()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1711637355);
                w3bVar.onExtraCallbackWithResult(deprecated_authenticator.onWarmupCompleted("icon-front-front-view-fill"), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, (i3 << 21) & 29360128, 126);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1711545936);
                if (workerUpdaterExternalSyntheticLambda2.onExtraCallbackWithResult().onExtraCallbackWithResult() == ProcessorExternalSyntheticLambda1.ANDROID) {
                    int i9 = IAuthTabCallbackStub + 125;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1330264444);
                    w3bVar.onExtraCallbackWithResult(deprecated_authenticator.onWarmupCompleted("icon-android-fill"), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, (i3 << 21) & 29360128, 126);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1330266360);
                    w3bVar.onExtraCallbackWithResult(deprecated_authenticator.onWarmupCompleted("icon-ios-fill"), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, (i3 << 21) & 29360128, 126);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i11 = IAuthTabCallbackStub + 5;
                    asInterface = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 4 % 4;
                    }
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r0
      0x0032: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r0
      0x0026: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 57;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2095570542);
            if ((i & 124) == 0) {
                i3 = i | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(workerUpdaterExternalSyntheticLambda2) ? 4 : 2);
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2095570542);
            if ((i & 6) == 0) {
            }
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                int i7 = IAuthTabCallbackStub + 7;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallbackStub + 27;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2095570542, i3, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.ListItem (FacePayBleTestActivity.kt:148)");
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2095570542, i3, -1, "im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity.ListItem (FacePayBleTestActivity.kt:148)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{ForwardingCameraControl.onExtraCallback(-1011231281, true, new FacePayBleTestActivity$.ExternalSyntheticLambda6(workerUpdaterExternalSyntheticLambda2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(1489650746, true, new FacePayBleTestActivity$.ExternalSyntheticLambda7(workerUpdaterExternalSyntheticLambda2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, showToggleButton.onExtraCallback.onNavigationEvent(), null, null, Float.valueOf(0.0f), null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 << 3) & 896) | 1575990), 196608, 229296}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePayBleTestActivity$.ExternalSyntheticLambda8(this, workerUpdaterExternalSyntheticLambda2, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 65;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = asInterface + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1269481266, forceDomainCheck.IAuthTabCallback(), 1269481270, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, FacePayBleTestActivity facePayBleTestActivity, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{list, getsupportedhighspeedresolutionsfor, facePayBleTestActivity, audioRestrictionControllerImplExternalSyntheticLambda0}, -209419313, iIAuthTabCallback, 209419318, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 1515855123, iIAuthTabCallback, -1515855121, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(FacePayBleTestActivity facePayBleTestActivity) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{facePayBleTestActivity}, -1141611690, iIAuthTabCallback, 1141611693, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FacePayBleTestActivity facePayBleTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{facePayBleTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1140349117, forceDomainCheck.IAuthTabCallback(), 1140349117, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    private static final String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (String) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 1698586925, iIAuthTabCallback, -1698586924, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, 31793150, iIAuthTabCallback, -31793144, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.faceverify.impl.ui.test.Hilt_FacePayBleTestActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
