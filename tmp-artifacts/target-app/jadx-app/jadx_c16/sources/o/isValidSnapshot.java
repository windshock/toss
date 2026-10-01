package o;

import android.content.Context;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zziea;
import com.tmoney.a;
import im.toss.features.leave.R;
import im.toss.features.leave.ui.pendingtask.PendingTasksScreenKt$;
import im.toss.features.leave.ui.pendingtask.PendingTasksUiModel$PendingTaskUiModel;
import im.toss.features.leave.ui.pendingtask.PendingTasksViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getViewTypeCount;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isValidSnapshot {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pendingTasksUiModel$PendingTaskUiModel, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(SessionTrackerb sessionTrackerb, Function0 function0, Function0 function02, PendingTasksViewModel pendingTasksViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(sessionTrackerb, function0, function02, pendingTasksViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(sessionTrackerb, function0, function02, pendingTasksViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PendingTasksViewModel pendingTasksViewModel = (PendingTasksViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(pendingTasksViewModel, str);
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PendingTasksViewModel pendingTasksViewModel, PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pendingTasksViewModel, pendingTasksUiModel$PendingTaskUiModel);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(SessionTrackerb sessionTrackerb, Function0 function0, Function0 function02, PendingTasksViewModel pendingTasksViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 47;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            IAuthTabCallback(sessionTrackerb, function0, function02, pendingTasksViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(sessionTrackerb, function0, function02, pendingTasksViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onWarmupCompleted + 61;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(v1 v1Var, PendingTasksViewModel pendingTasksViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {v1Var, pendingTasksViewModel, cameraPresenceProviderExternalSyntheticLambda6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        if (i4 == 0) {
            return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1899304451, 1899304452, a.3.onWarmupCompleted(), objArr);
        }
        int i5 = 92 / 0;
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1899304451, 1899304452, a.3.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, PendingTasksViewModel pendingTasksViewModel, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, pendingTasksViewModel, isinvideousage);
        }
        onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, pendingTasksViewModel, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        boolean z;
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i3));
        int i12 = i8 | i5;
        int i13 = ~(i12 | i4);
        int i14 = (~(i3 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i5 + i4 + i2 + (1650861130 * i6) + ((-924421097) * i);
        int i16 = i15 * i15;
        int i17 = ((i5 * (-959335331)) - 587927435) + (i4 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + ((-959334869) * i2) + (22983790 * i6) + (637852125 * i) + (i16 * (-1124859904));
        int i18 = (i5 * (-405912681)) + 1474035712 + ((-405912681) * i4) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i2) + (986710016 * i6) + ((-948436992) * i) + ((-1864630272) * i16) + (i17 * i17 * (-1807482880));
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? i18 != 4 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        v1 v1Var = (v1) objArr[0];
        PendingTasksViewModel pendingTasksViewModel = (PendingTasksViewModel) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i19 = 2 % 2;
        int i20 = onWarmupCompleted + 79;
        onExtraCallback = i20 % 128;
        if (i20 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            z = (iIntValue & 71) != 21;
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-249748223, iIntValue, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous> (PendingTasksScreen.kt:150)");
            }
            if (v1Var.IAuthTabCallback_Parcel()) {
                int i21 = onWarmupCompleted + 85;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1365892905);
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_pending_task_customer_service_connect_bottomsheet_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pendingTasksViewModel);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        PendingTasksScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new PendingTasksScreenKt$.ExternalSyntheticLambda1(pendingTasksViewModel);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                        obj = externalSyntheticLambda1;
                    }
                    Function1 function1 = (Function1) obj;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pendingTasksViewModel);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback2) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            PendingTasksScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new PendingTasksScreenKt$.ExternalSyntheticLambda2(pendingTasksViewModel);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                            obj2 = externalSyntheticLambda2;
                        }
                        loadSnapshotFile.onNavigationEvent(v1Var, strOnExtraCallback, function1, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i23 = onExtraCallback + 65;
                        onWarmupCompleted = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1365565855);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            y1ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallback = y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback();
            y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            isSnapshotEnabled issnapshotenabled = isSnapshotEnabled.onExtraCallbackWithResult;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(issnapshotenabled.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, onnavigationeventOnExtraCallback, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, issnapshotenabled.onNavigationEvent(), onextracallbackwithresultOnNavigationEvent, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, fIAuthTabCallback, fIAuthTabCallback2, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1769862, 432, 10138);
            putNavigationBarParams putnavigationbarparamsIAuthTabCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends putNavigationBarParams>) cameraPresenceProviderExternalSyntheticLambda6);
            if (putnavigationbarparamsIAuthTabCallback instanceof putNavigationBarParams$onWarmupCompleted) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1108983625);
                List<PendingTasksUiModel$PendingTaskUiModel> listOnExtraCallbackWithResult = ((putNavigationBarParams$onWarmupCompleted) putnavigationbarparamsIAuthTabCallback).onExtraCallbackWithResult();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
                for (PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel : listOnExtraCallbackWithResult) {
                    getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                    w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1559900588, true, new PendingTasksScreenKt$.ExternalSyntheticLambda3(pendingTasksUiModel$PendingTaskUiModel), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1530921888, true, new PendingTasksScreenKt$.ExternalSyntheticLambda4(pendingTasksUiModel$PendingTaskUiModel), cameraCaptureResultEmptyCameraCaptureResult, 54), onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-462559204, true, new PendingTasksScreenKt$.ExternalSyntheticLambda5(pendingTasksUiModel$PendingTaskUiModel, pendingTasksViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 1772934, 384, 126866);
                    arrayList.add(Unit.INSTANCE);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1107081899);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function0};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted, -1953833832, 1953833835, iOnWarmupCompleted3, objArr);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PendingTasksViewModel pendingTasksViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pendingTasksViewModel, str);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, PendingTasksViewModel pendingTasksViewModel, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {pendingTasksUiModel$PendingTaskUiModel, pendingTasksViewModel, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        if (i4 != 0) {
            return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 927007356, -927007352, a.3.onWarmupCompleted(), objArr);
        }
        int i5 = 38 / 0;
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 927007356, -927007352, a.3.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pendingTasksUiModel$PendingTaskUiModel, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(PendingTasksViewModel pendingTasksViewModel, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(pendingTasksViewModel, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(PendingTasksViewModel pendingTasksViewModel, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onNavigationEvent.onNavigationEvent[onextracallbackwithresult.ordinal()] == 1) {
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        }
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ LifecycleEventObserver onExtraCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onWarmupCompleted;

        public IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onWarmupCompleted = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.getLifecycle().onExtraCallbackWithResult(this.onExtraCallback);
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallback + 35;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1229636692, i, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous> (PendingTasksScreen.kt:143)");
                int i6 = onWarmupCompleted + 19;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i8 = onExtraCallback + 67;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    PendingTasksScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new PendingTasksScreenKt$.ExternalSyntheticLambda0(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    int i9 = onExtraCallback + 87;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    obj2 = externalSyntheticLambda0;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj2, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(PendingTasksViewModel pendingTasksViewModel, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        pendingTasksViewModel.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(PendingTasksViewModel pendingTasksViewModel, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            pendingTasksViewModel.onTransact();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        pendingTasksViewModel.onTransact();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i5 = onWarmupCompleted + 99;
                onExtraCallback = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1530921888, i2, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendingTasksScreen.kt:189)");
                    int i7 = 59 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1530921888, i2, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendingTasksScreen.kt:189)");
                }
            }
            String strIAuthTabCallback = pendingTasksUiModel$PendingTaskUiModel.IAuthTabCallback();
            w3bVar.onExtraCallbackWithResult(strIAuthTabCallback != null ? strIAuthTabCallback : "", (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 110);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onWarmupCompleted + 99;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallback + 125;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jOnUnminimized;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = onWarmupCompleted + 15;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
            int i7 = onExtraCallback + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = onExtraCallback + 109;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = onExtraCallback + 11;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 99 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1559900588, i2, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendingTasksScreen.kt:195)");
                }
                String strOnNavigationEvent = pendingTasksUiModel$PendingTaskUiModel.onNavigationEvent();
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                getHumanReadableName gethumanreadablename = new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null);
                String strOnExtraCallback = pendingTasksUiModel$PendingTaskUiModel.onExtraCallback();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(120897139);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                } else {
                    int i13 = onExtraCallback + 87;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(120896179);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                w5aVar.IAuthTabCallback(strOnNavigationEvent, strOnExtraCallback, gethumanreadablename, new getHumanReadableName(jOnUnminimized, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String strOnNavigationEvent2 = pendingTasksUiModel$PendingTaskUiModel.onNavigationEvent();
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                getHumanReadableName gethumanreadablename2 = new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null);
                String strOnExtraCallback2 = pendingTasksUiModel$PendingTaskUiModel.onExtraCallback();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                w5aVar.IAuthTabCallback(strOnNavigationEvent2, strOnExtraCallback2, gethumanreadablename2, new getHumanReadableName(jOnUnminimized, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(PendingTasksViewModel pendingTasksViewModel, PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            pendingTasksViewModel.onWarmupCompleted(pendingTasksUiModel$PendingTaskUiModel);
            int i3 = 71 / 0;
            return Unit.INSTANCE;
        }
        pendingTasksViewModel.onWarmupCompleted(pendingTasksUiModel$PendingTaskUiModel);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel = (PendingTasksUiModel$PendingTaskUiModel) objArr[0];
        PendingTasksViewModel pendingTasksViewModel = (PendingTasksViewModel) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            int i5 = onExtraCallback + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i7 = onExtraCallback + 99;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i = 2;
                }
                iIntValue |= i;
            } else {
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                }
                iIntValue |= i;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-462559204, iIntValue, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendingTasksScreen.kt:209)");
            }
            String strOnNavigationEvent = pendingTasksUiModel$PendingTaskUiModel.onWarmupCompleted().onNavigationEvent();
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pendingTasksViewModel);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(pendingTasksUiModel$PendingTaskUiModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i9 = onWarmupCompleted + 51;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    PendingTasksScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new PendingTasksScreenKt$.ExternalSyntheticLambda11(pendingTasksViewModel, pendingTasksUiModel$PendingTaskUiModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                    obj2 = externalSyntheticLambda11;
                }
                rightPreset.IAuthTabCallback(strOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, (Function0) null, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 28032, (iIntValue << 3) & 112, 994);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull SessionTrackerb sessionTrackerb, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable PendingTasksViewModel pendingTasksViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        PendingTasksViewModel pendingTasksViewModel2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        ?? r17;
        PendingTasksViewModel pendingTasksViewModel3;
        Unit unit;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2117133016);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onExtraCallback + 121;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 74 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i9 = onExtraCallback + 43;
                onWarmupCompleted = i9 % 128;
                i4 = i9 % 2 == 0 ? 11295 : 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            int i10 = onExtraCallback + 47;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if ((i2 & 8) == 0) {
                pendingTasksViewModel2 = pendingTasksViewModel;
                int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pendingTasksViewModel2) ? 2048 : 1024;
                i3 |= i12;
            } else {
                pendingTasksViewModel2 = pendingTasksViewModel;
            }
            i3 |= i12;
        } else {
            pendingTasksViewModel2 = pendingTasksViewModel;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i13 = onExtraCallback + 107;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 8) != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1890788296);
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                            int i15 = onExtraCallback + 7;
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2;
                            defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                        }
                        ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(PendingTasksViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        pendingTasksViewModel2 = (PendingTasksViewModel) viewModelIAuthTabCallback;
                        i3 &= -7169;
                        int i17 = onWarmupCompleted + 1;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    int i19 = i3;
                    PendingTasksViewModel pendingTasksViewModel4 = pendingTasksViewModel2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2117133016, i19, -1, "im.toss.features.leave.ui.pendingtask.PendingTasksScreen (PendingTasksScreen.kt:42)");
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(pendingTasksViewModel4.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                    v1 v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pendingTasksViewModel4);
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback | zOnExtraCallback2) {
                        int i20 = onExtraCallback + 13;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new PendingTasksScreenKt$.ExternalSyntheticLambda6(textFieldScrollKtExternalSyntheticLambda0, pendingTasksViewModel4);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        Unit unit2 = Unit.INSTANCE;
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pendingTasksViewModel4);
                        boolean z = (i19 & 112) == 32;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb);
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (((z | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent | zOnExtraCallback5) || zOnExtraCallback6) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            r17 = 0;
                            pendingTasksViewModel3 = pendingTasksViewModel4;
                            unit = unit2;
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(pendingTasksViewModel4, function0, findresandmsg, sessionTrackerb, context, v1VarOnExtraCallback, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onextracallbackwithresult);
                            objOnMinimized3 = onextracallbackwithresult;
                        } else {
                            pendingTasksViewModel3 = pendingTasksViewModel4;
                            unit = unit2;
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                            r17 = 0;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        pendingTasksViewModel2 = pendingTasksViewModel3;
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pendingTasksViewModel2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        Object obj = null;
                        if (zOnExtraCallback7 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = new onExtraCallback(pendingTasksViewModel2, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(1229636692, true, new PendingTasksScreenKt$.ExternalSyntheticLambda7(function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), Boolean.valueOf((boolean) r17), null, null, null, Integer.valueOf((int) r17), Boolean.valueOf((boolean) r17), 0L, 0L, ForwardingCameraControl.onExtraCallback(-249748223, true, new PendingTasksScreenKt$.ExternalSyntheticLambda8(v1VarOnExtraCallback, pendingTasksViewModel2, cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i22 = onExtraCallback + 115;
                            onWarmupCompleted = i22 % 128;
                            if (i22 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                obj.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                int i192 = i3;
                PendingTasksViewModel pendingTasksViewModel42 = pendingTasksViewModel2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                findResAndMsg findresandmsg2 = (findResAndMsg) objOnMinimized;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(pendingTasksViewModel42.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                v1 v1VarOnExtraCallback2 = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pendingTasksViewModel42);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda02);
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback | zOnExtraCallback2) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        PendingTasksViewModel pendingTasksViewModel5 = pendingTasksViewModel2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PendingTasksScreenKt$.ExternalSyntheticLambda9(sessionTrackerb, function0, function02, pendingTasksViewModel5, i, i2));
        }
    }

    private static final decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, PendingTasksViewModel pendingTasksViewModel, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        PendingTasksScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new PendingTasksScreenKt$.ExternalSyntheticLambda10(pendingTasksViewModel);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda10);
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda10);
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final putNavigationBarParams IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends putNavigationBarParams> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        putNavigationBarParams putnavigationbarparams = (putNavigationBarParams) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = onWarmupCompleted + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return putnavigationbarparams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PendingTasksViewModel pendingTasksViewModel, String str) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -481177112, 481177114, iOnWarmupCompleted3, new Object[]{pendingTasksViewModel, str});
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -264032141, 264032141, a.3.onWarmupCompleted(), objArr);
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -1953833832, 1953833835, iOnWarmupCompleted3, new Object[]{function0});
    }

    private static final Unit onNavigationEvent(v1 v1Var, PendingTasksViewModel pendingTasksViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {v1Var, pendingTasksViewModel, cameraPresenceProviderExternalSyntheticLambda6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1899304451, 1899304452, a.3.onWarmupCompleted(), objArr);
    }

    private static final Unit onExtraCallback(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, PendingTasksViewModel pendingTasksViewModel, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {pendingTasksUiModel$PendingTaskUiModel, pendingTasksViewModel, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 927007356, -927007352, a.3.onWarmupCompleted(), objArr);
    }
}
