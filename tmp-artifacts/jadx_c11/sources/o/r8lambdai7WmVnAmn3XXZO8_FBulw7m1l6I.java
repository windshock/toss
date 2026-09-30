package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.component8;
import o.getStreamSharingChildren;
import o.r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = ~i3;
        int i12 = i9 | (~(i11 | i4));
        int i13 = (~(i5 | i7 | i3)) | (~(i8 | i11 | i7));
        int i14 = i4 + i3 + i + ((-619979367) * i6) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-96142684)) - 56799437) + (i3 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + ((-96141863) * i) + ((-1380774991) * i6) + ((-1175232947) * i2) + (i15 * (-118947840));
        if ((i4 * 561304900) + 382271488 + (561304900 * i3) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i) + (1615200256 * i6) + ((-1821507584) * i2) + (428933120 * i15) + (i16 * i16 * (-1369505792)) == 1) {
            return onExtraCallback(objArr);
        }
        r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8 = (r8lambda49PUoj84d073zThfYmsWH2BreR8) objArr[0];
        component4 component4Var = (component4) objArr[1];
        component7 component7Var = (component7) objArr[2];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[3];
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null);
        r8lambda49puoj84d073zthfymswh2brer8.IAuthTabCallback(jIAuthTabCallback);
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(jIAuthTabCallback, RangesKt.coerceIn((int) (r8lambda49puoj84d073zthfymswh2brer8.onExtraCallback() >> 32), VirtualCameraCaptureResult.onTransact(jIAuthTabCallback), VirtualCameraCaptureResult.asInterface(jIAuthTabCallback)), 0, RangesKt.coerceIn((int) r8lambda49puoj84d073zthfymswh2brer8.onExtraCallback(), VirtualCameraCaptureResult.asBinder(jIAuthTabCallback), VirtualCameraCaptureResult.IAuthTabCallbackDefault(jIAuthTabCallback)), 0, 10, (Object) null));
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tds.compose.component.anim.CanvasKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i18 = 2 % 2;
                int i19 = onNavigationEvent + 57;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) obj;
                if (i20 == 0) {
                    return r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onExtraCallbackWithResult(getstreamsharingchildren, onextracallbackwithresult);
                }
                r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onExtraCallbackWithResult(getstreamsharingchildren, onextracallbackwithresult);
                throw null;
            }
        }, 4, (Object) null);
        int i18 = onWarmupCompleted + 31;
        onNavigationEvent = i18 % 128;
        int i19 = i18 % 2;
        return component8VarIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirkSettingsLoader quirkSettingsLoader, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(r8lambda49puoj84d073zthfymswh2brer8, quirksExternalSyntheticBackport0, quirkSettingsLoader, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 113;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(setorientationdegrees);
        }
        onExtraCallbackWithResult(setorientationdegrees);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Function1 function12, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, function12, setorientationdegrees);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirkSettingsLoader quirkSettingsLoader, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(r8lambda49puoj84d073zthfymswh2brer8, quirksExternalSyntheticBackport0, quirkSettingsLoader, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(r8lambda49puoj84d073zthfymswh2brer8, quirksExternalSyntheticBackport0, quirkSettingsLoader, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 35;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Rect onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getstreamsharingchildren, onextracallbackwithresult);
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ component8 onExtraCallbackWithResult(r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        component8 component8Var = (component8) IAuthTabCallback(iOnWarmupCompleted2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1842743130, 1842743130, iOnWarmupCompleted, new Object[]{r8lambda49puoj84d073zthfymswh2brer8, component4Var, component7Var, virtualCameraCaptureResult}, iOnWarmupCompleted3);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return component8Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable Function1<? super setOrientationDegrees, Rect> function1, @NotNull final Function1<? super setOrientationDegrees, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        QuirkSettingsLoader quirkSettingsLoader2;
        int i5;
        int i6;
        final Function1<? super setOrientationDegrees, Rect> function13;
        int i7;
        final QuirkSettingsLoader quirkSettingsLoader3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirkSettingsLoader quirkSettingsLoaderAccess100;
        int i8;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda49puoj84d073zthfymswh2brer8, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1404915897);
        if ((i & 6) == 0) {
            int i11 = onNavigationEvent + 91;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambda49puoj84d073zthfymswh2brer8);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambda49puoj84d073zthfymswh2brer8)) {
                int i12 = onNavigationEvent + 117;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    quirkSettingsLoader2 = quirkSettingsLoader;
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader2)) {
                        i5 = 128;
                    } else {
                        int i15 = onWarmupCompleted + 79;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        function13 = function1;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                            int i17 = onNavigationEvent + 115;
                            onWarmupCompleted = i17 % 128;
                            int i18 = i17 % 2;
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                            i8 = 8192;
                        } else {
                            int i19 = onNavigationEvent + 55;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            i8 = 16384;
                        }
                        i3 |= i8;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirkSettingsLoader3 = quirkSettingsLoader2;
                    } else {
                        if (i14 != 0) {
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if (i4 != 0) {
                            int i21 = onNavigationEvent + 11;
                            onWarmupCompleted = i21 % 128;
                            if (i21 % 2 != 0) {
                                quirkSettingsLoaderAccess100 = QuirkSettingsLoader.Companion.access100();
                                int i22 = 29 / 0;
                            } else {
                                quirkSettingsLoaderAccess100 = QuirkSettingsLoader.Companion.access100();
                            }
                        } else {
                            quirkSettingsLoaderAccess100 = quirkSettingsLoader2;
                        }
                        if (i6 != 0) {
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.CanvasKt$$ExternalSyntheticLambda1
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj) {
                                        int i23 = 2 % 2;
                                        int i24 = onNavigationEvent + 123;
                                        onExtraCallback = i24 % 128;
                                        int i25 = i24 % 2;
                                        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                                        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                                        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                                        Rect rect = (Rect) r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.IAuthTabCallback(iOnWarmupCompleted2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 921924185, -921924184, iOnWarmupCompleted, new Object[]{(setOrientationDegrees) obj}, iOnWarmupCompleted3);
                                        int i26 = onNavigationEvent + 27;
                                        onExtraCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        return rect;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            function13 = (Function1) objOnMinimized;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1404915897, i3, -1, "im.toss.tds.compose.component.anim.AnimateTextCanvas (Canvas.kt:27)");
                        }
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderAccess100, false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean z = (i3 & 14) == 4;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!z) {
                            int i23 = onNavigationEvent + 5;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.CanvasKt$$ExternalSyntheticLambda2
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i25 = 2 % 2;
                                        int i26 = onNavigationEvent + 29;
                                        onExtraCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        component8 component8VarOnExtraCallbackWithResult = r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onExtraCallbackWithResult(r8lambda49puoj84d073zthfymswh2brer8, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                                        int i28 = onExtraCallback + 87;
                                        onNavigationEvent = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            return component8VarOnExtraCallbackWithResult;
                                        }
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ListFuture2.onWarmupCompleted(onextracallback, (getBacktraceNote) objOnMinimized2);
                            boolean z2 = (i3 & 7168) == 2048;
                            boolean z3 = (i3 & 57344) == 16384;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z2 | z3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.anim.CanvasKt$$ExternalSyntheticLambda3
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj) {
                                        int i25 = 2 % 2;
                                        int i26 = onExtraCallbackWithResult + 51;
                                        IAuthTabCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        Unit unitOnExtraCallback = r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onExtraCallback(function13, function12, (setOrientationDegrees) obj);
                                        int i28 = IAuthTabCallback + 65;
                                        onExtraCallbackWithResult = i28 % 128;
                                        int i29 = i28 % 2;
                                        return unitOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            int i25 = onWarmupCompleted + 33;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            quirkSettingsLoader3 = quirkSettingsLoaderAccess100;
                        }
                    }
                    final Function1<? super setOrientationDegrees, Rect> function14 = function13;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.CanvasKt$$ExternalSyntheticLambda4
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2) {
                                int i27 = 2 % 2;
                                int i28 = onNavigationEvent + 89;
                                onExtraCallback = i28 % 128;
                                int i29 = i28 % 2;
                                Unit unitOnExtraCallback = r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onExtraCallback(r8lambda49puoj84d073zthfymswh2brer8, quirksExternalSyntheticBackport03, quirkSettingsLoader3, function14, function12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i30 = onExtraCallback + 77;
                                onNavigationEvent = i30 % 128;
                                if (i30 % 2 == 0) {
                                    return unitOnExtraCallback;
                                }
                                throw null;
                            }
                        });
                        int i27 = onNavigationEvent + 91;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        return;
                    }
                    return;
                }
                int i29 = onWarmupCompleted + 71;
                onNavigationEvent = i29 % 128;
                i3 = i29 % 2 == 0 ? i3 | 9431 : i3 | 3072;
                function13 = function1;
                if ((i & 24576) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                }
                final Function1 function142 = function13;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            quirkSettingsLoader2 = quirkSettingsLoader;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function13 = function1;
            if ((i & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
            }
            final Function1 function1422 = function13;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        quirkSettingsLoader2 = quirkSettingsLoader;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function13 = function1;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        final Function1 function14222 = function13;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onNavigationEvent(Function1 function1, Function1 function12, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Rect rect = (Rect) function1.invoke(setorientationdegrees);
        if (rect == null) {
            function12.invoke(setorientationdegrees);
        } else {
            float fIAuthTabCallbackStubProxy = rect.IAuthTabCallbackStubProxy();
            float fExtraCallback = rect.extraCallback();
            float fIAuthTabCallback_Parcel = rect.IAuthTabCallback_Parcel();
            float fIAuthTabCallbackDefault = rect.IAuthTabCallbackDefault();
            int iOnExtraCallbackWithResult = readUnsignedShort.Companion.onExtraCallbackWithResult();
            setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
            long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
            setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
            try {
                setflashstateOnExtraCallback.onTransact().onExtraCallbackWithResult(fIAuthTabCallbackStubProxy, fExtraCallback, fIAuthTabCallback_Parcel, fIAuthTabCallbackDefault, iOnExtraCallbackWithResult);
                function12.invoke(setorientationdegrees);
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
                int i4 = onNavigationEvent + 73;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Rect onWarmupCompleted(setOrientationDegrees setorientationdegrees) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Rect) IAuthTabCallback(iOnWarmupCompleted2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 921924185, -921924184, iOnWarmupCompleted, new Object[]{setorientationdegrees}, iOnWarmupCompleted3);
    }

    private static final component8 onExtraCallback(r8lambda49PUoj84d073zThfYmsWH2BreR8 r8lambda49puoj84d073zthfymswh2brer8, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (component8) IAuthTabCallback(iOnWarmupCompleted2, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1842743130, 1842743130, iOnWarmupCompleted, new Object[]{r8lambda49puoj84d073zthfymswh2brer8, component4Var, component7Var, virtualCameraCaptureResult}, iOnWarmupCompleted3);
    }
}
