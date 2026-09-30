package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getHumanReadableName;
import o.maybeFireRemainingCompletionTrackers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeFireRemainingCompletionTrackers {
    private static final accessisMonitoringp<getHumanReadableName> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.component.atom.post.v2.OrderedListScopeKt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            getHumanReadableName gethumanreadablenameOnExtraCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                gethumanreadablenameOnExtraCallback = maybeFireRemainingCompletionTrackers.onExtraCallback();
                int i3 = 73 / 0;
            } else {
                gethumanreadablenameOnExtraCallback = maybeFireRemainingCompletionTrackers.onExtraCallback();
            }
            int i4 = onWarmupCompleted + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return gethumanreadablenameOnExtraCallback;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(long j, GraphicDeviceInfo graphicDeviceInfo, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(j, graphicDeviceInfo, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ getHumanReadableName onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablenameOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return gethumanreadablenameOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, GraphicDeviceInfo graphicDeviceInfo, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(j, graphicDeviceInfo, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        long jOnTransact;
        int i3;
        int i4;
        GraphicDeviceInfo graphicDeviceInfo2;
        boolean z;
        final GraphicDeviceInfo graphicDeviceInfo3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        GraphicDeviceInfo graphicDeviceInfo4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-573536404);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            jOnTransact = j;
        } else if ((i & 6) == 0) {
            int i9 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            jOnTransact = j;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact)) {
                int i11 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            jOnTransact = j;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                graphicDeviceInfo2 = graphicDeviceInfo;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 32 : 16;
            }
            z = true;
            if ((i & 384) == 0) {
                int i14 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ^ true) ? 256 : 128;
            }
            if ((i3 & 147) == 146) {
                int i16 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                graphicDeviceInfo3 = graphicDeviceInfo2;
            } else {
                int i18 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                if (i8 != 0) {
                    jOnTransact = setByteOrder.Companion.onTransact();
                }
                Object obj = null;
                if (i13 != 0) {
                    int i20 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    graphicDeviceInfo4 = null;
                } else {
                    graphicDeviceInfo4 = graphicDeviceInfo2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i21 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573536404, i3, -1, "im.toss.tds.compose.component.atom.post.v2.ProvideNumberTextStyle (OrderedListScope.kt:62)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573536404, i3, -1, "im.toss.tds.compose.component.atom.post.v2.ProvideNumberTextStyle (OrderedListScope.kt:62)");
                }
                accessisMonitoringp<getHumanReadableName> accessismonitoringp = IAuthTabCallback;
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback(getHumanReadableName.onWarmupCompleted((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(accessismonitoringp), jOnTransact, 0L, graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (getChildPreviewOutConfig) null, 0, 0, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 16777210, (Object) null)), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 3) & 112) | accessgetCameraFactoryp.onNavigationEvent);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i22 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                graphicDeviceInfo3 = graphicDeviceInfo4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final long j2 = jOnTransact;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.OrderedListScopeKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i23 = 2 % 2;
                        int i24 = onNavigationEvent + 11;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnNavigationEvent = maybeFireRemainingCompletionTrackers.onNavigationEvent(j2, graphicDeviceInfo3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i26 = IAuthTabCallback + 57;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        graphicDeviceInfo2 = graphicDeviceInfo;
        z = true;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static {
        int i = onExtraCallback + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 58 / 0;
        }
    }

    public static final accessisMonitoringp<getHumanReadableName> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        accessisMonitoringp<getHumanReadableName> accessismonitoringp = IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return accessismonitoringp;
    }

    private static final getHumanReadableName onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablenameOnWarmupCompleted = getHumanReadableName.Companion.onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablenameOnWarmupCompleted;
    }
}
