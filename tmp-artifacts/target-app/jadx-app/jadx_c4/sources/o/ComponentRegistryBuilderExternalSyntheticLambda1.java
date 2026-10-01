package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.components.compose.extensions.BottomInfoKt$;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ComponentRegistryBuilderExternalSyntheticLambda1;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.RemoteWorkContinuation;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ComponentRegistryBuilderExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit onExtraCallback(ConstraintTrackingWorkerExternalSyntheticLambda0 constraintTrackingWorkerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(constraintTrackingWorkerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 45;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 81;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(list, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 99;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(ConstraintTrackingWorkerExternalSyntheticLambda0 constraintTrackingWorkerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(constraintTrackingWorkerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 11;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 8 / 0;
        }
        return unit;
    }

    @Deprecated
    public static final void onNavigationEvent(@NotNull ConstraintTrackingWorkerExternalSyntheticLambda0 constraintTrackingWorkerExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(constraintTrackingWorkerExternalSyntheticLambda0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-22382625);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(constraintTrackingWorkerExternalSyntheticLambda0)) {
                int i6 = onExtraCallback + 21;
                onExtraCallbackWithResult = i6 % 128;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            int i8 = onExtraCallback + 83;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                i3 |= 48;
            }
        } else if ((i & 48) == 0) {
            int i9 = onExtraCallback + 111;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i11 = onExtraCallbackWithResult + 109;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (i7 != 0) {
                int i13 = onExtraCallbackWithResult + 113;
                onExtraCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    throw null;
                }
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-22382625, i3, -1, "im.toss.components.compose.extensions.BottomInfo (BottomInfo.kt:15)");
            }
            onExtraCallbackWithResult(constraintTrackingWorkerExternalSyntheticLambda0.IAuthTabCallback(), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 112, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BottomInfoKt$.ExternalSyntheticLambda2(constraintTrackingWorkerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, i, i2));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onWarmupCompleted(List list, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 1;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2022401058, i, -1, "im.toss.components.compose.extensions.BottomInfo.<anonymous> (BottomInfo.kt:29)");
            }
            Iterator it = list.iterator();
            while (!(!it.hasNext())) {
                int i5 = onExtraCallback + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                RemoteWorkContinuation remoteWorkContinuation = (RemoteWorkContinuation) it.next();
                if (remoteWorkContinuation instanceof RemoteWorkContinuation.onExtraCallback) {
                    int i7 = onExtraCallbackWithResult + 85;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(464604398);
                        ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(((RemoteWorkContinuation.onExtraCallback) remoteWorkContinuation).onExtraCallbackWithResult(), 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(464604398);
                        ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallback(((RemoteWorkContinuation.onExtraCallback) remoteWorkContinuation).onExtraCallbackWithResult(), 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else if (remoteWorkContinuation instanceof RemoteWorkContinuation.onExtraCallbackWithResult) {
                    int i8 = onExtraCallback + 93;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1517912975);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        int i10 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
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
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-874019550);
                    RemoteWorkContinuation.onExtraCallbackWithResult onextracallbackwithresult2 = (RemoteWorkContinuation.onExtraCallbackWithResult) remoteWorkContinuation;
                    Iterator<T> it2 = onextracallbackwithresult2.onNavigationEvent().iterator();
                    while (!(!it2.hasNext())) {
                        RemoteWorkContinuation.onNavigationEvent onnavigationevent = (RemoteWorkContinuation.onNavigationEvent) it2.next();
                        ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(onnavigationevent.onExtraCallback(), onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.IAuthTabCallback(), onnavigationevent.onNavigationEvent(), false, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 48);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (remoteWorkContinuation instanceof RemoteWorkContinuation.onNavigationEvent) {
                    int i12 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1518468898);
                    RemoteWorkContinuation.onNavigationEvent onnavigationevent2 = (RemoteWorkContinuation.onNavigationEvent) remoteWorkContinuation;
                    ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(onnavigationevent2.onExtraCallback(), onnavigationevent2.onWarmupCompleted(), 0, onnavigationevent2.onNavigationEvent(), false, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 52);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (remoteWorkContinuation instanceof RemoteWorkContinuation.onWarmupCompleted) {
                    int i14 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1518703785);
                    RemoteWorkContinuation.onWarmupCompleted onwarmupcompleted = (RemoteWorkContinuation.onWarmupCompleted) remoteWorkContinuation;
                    ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.IAuthTabCallback(), 0, 0.0f, false, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 44);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    if (!(remoteWorkContinuation instanceof RemoteWorkContinuation.IAuthTabCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(464604107);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1518947445);
                    RemoteWorkContinuation.IAuthTabCallback iAuthTabCallback = (RemoteWorkContinuation.IAuthTabCallback) remoteWorkContinuation;
                    ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 130822939, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{iAuthTabCallback.IAuthTabCallback(), Boolean.valueOf(iAuthTabCallback.onExtraCallbackWithResult()), 0, Float.valueOf(iAuthTabCallback.onWarmupCompleted()), false, cameraCaptureResultEmptyCameraCaptureResult, 0, 20}, -130822936, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i16 = onExtraCallback + 53;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i18 = onExtraCallback + 17;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    @Deprecated
    public static final void onExtraCallbackWithResult(@NotNull final List<? extends RemoteWorkContinuation> list, @Nullable final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(21333988);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i7 = onExtraCallback + 23;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            int i10 = onExtraCallback + 95;
            onExtraCallbackWithResult = i10 % 128;
            i3 = i10 % 2 == 0 ? i3 | 69 : i3 | 48;
        } else if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                i4 = 32;
            } else {
                int i11 = onExtraCallback + 99;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i4 = 16;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 19) == 18), i3 & 1)) {
            if (i9 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 51;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(21333988, i3, -1, "im.toss.components.compose.extensions.BottomInfo (BottomInfo.kt:27)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(21333988, i3, -1, "im.toss.components.compose.extensions.BottomInfo (BottomInfo.kt:27)");
            }
            ImageLoaderBuilderExternalSyntheticLambda0.IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -497485879, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, ForwardingCameraControl.onExtraCallback(2022401058, true, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.BottomInfoKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    Unit unitOnNavigationEvent;
                    int i14 = 2 % 2;
                    int i15 = onWarmupCompleted + 43;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        unitOnNavigationEvent = ComponentRegistryBuilderExternalSyntheticLambda1.onNavigationEvent(list, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i16 = 88 / 0;
                    } else {
                        unitOnNavigationEvent = ComponentRegistryBuilderExternalSyntheticLambda1.onNavigationEvent(list, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i17 = onWarmupCompleted + 1;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 3) & 14) | 48), 0}, 497485886, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.BottomInfoKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = onWarmupCompleted + 45;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 != 0) {
                        ComponentRegistryBuilderExternalSyntheticLambda1.onNavigationEvent(list, quirksExternalSyntheticBackport0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = ComponentRegistryBuilderExternalSyntheticLambda1.onNavigationEvent(list, quirksExternalSyntheticBackport0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i16 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }
}
