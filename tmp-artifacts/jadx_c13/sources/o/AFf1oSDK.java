package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1oSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1oSDK {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function2 function2, AFf1oSDK5 aFf1oSDK5, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, quirksExternalSyntheticBackport0, z, function2, aFf1oSDK5, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, quirksExternalSyntheticBackport0, z, function2, aFf1oSDK5, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function2 function2, AFf1oSDK5 aFf1oSDK5, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 3;
        onNavigationEvent = i5 % 128;
        onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, quirksExternalSyntheticBackport0, z, function2, aFf1oSDK5, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return unit;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onNavigationEvent<T> implements Function1<AFf1mSDK<T>, setByteOrder> {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 62 / 0;
            }
        }

        onNavigationEvent() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ setByteOrder invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            AFf1mSDK<T> aFf1mSDK = (AFf1mSDK) obj;
            if (i2 % 2 != 0) {
                setByteOrder.onNavigationEvent(onNavigationEvent(aFf1mSDK));
                throw null;
            }
            setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(onNavigationEvent(aFf1mSDK));
            int i3 = onExtraCallback + 107;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
            }
            return setbyteorderOnNavigationEvent;
        }

        public final long onNavigationEvent(AFf1mSDK<T> aFf1mSDK) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            long jAsInterface = setByteOrder.Companion.asInterface();
            int i4 = onExtraCallback + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return jAsInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void onExtraCallback(@NotNull final CameraPresenceProviderExternalSyntheticLambda6<? extends List<AFf1mSDK<T>>> cameraPresenceProviderExternalSyntheticLambda6, @NotNull final CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda62, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable Function2<? super setOrientationDegrees, ? super AFf1bSDK<AFf1mSDK<T>>, Unit> function2, @Nullable AFf1oSDK5<T> aFf1oSDK5, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int i6;
        Function2<? super setOrientationDegrees, ? super AFf1bSDK<AFf1mSDK<T>>, Unit> function22;
        AFf1oSDK5<T> aFf1oSDK52;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final boolean z3;
        final Function2<? super setOrientationDegrees, ? super AFf1bSDK<AFf1mSDK<T>>, Unit> function23;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final AFf1oSDK5<T> aFf1oSDK53;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i7;
        boolean z4;
        AFf1oSDK5<T> aFf1oSDK5OnWarmupCompleted;
        Function2<? super setOrientationDegrees, ? super AFf1bSDK<AFf1mSDK<T>>, Unit> function24;
        int i8;
        int i9;
        boolean z5 = z;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda62, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(294470358);
        Object obj = null;
        if ((i & 6) == 0) {
            int i11 = IAuthTabCallback + 21;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62)) {
                int i12 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                int i15 = onNavigationEvent + 19;
                IAuthTabCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 11 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 2048 : 1024;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5)) {
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    int i17 = IAuthTabCallback + 15;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    function22 = function2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        aFf1oSDK52 = aFf1oSDK5;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFf1oSDK52)) {
                            int i19 = IAuthTabCallback + 81;
                            onNavigationEvent = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 2 % 4;
                            }
                            i8 = Imgproc.FLOODFILL_MASK_ONLY;
                        }
                        i3 |= i8;
                    } else {
                        aFf1oSDK52 = aFf1oSDK5;
                    }
                    i8 = Imgproc.FLOODFILL_FIXED_RANGE;
                    i3 |= i8;
                } else {
                    aFf1oSDK52 = aFf1oSDK5;
                }
                if ((74899 & i3) != 74898) {
                    int i21 = IAuthTabCallback + 75;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        int i23 = IAuthTabCallback + 53;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            Function2<? super setOrientationDegrees, ? super AFf1bSDK<AFf1mSDK<T>>, Unit> function25 = null;
                            if (i14 != 0) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                int i24 = IAuthTabCallback + 35;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                            }
                            if (i4 != 0) {
                                z5 = false;
                            }
                            if (i6 != 0) {
                                int i26 = IAuthTabCallback + 19;
                                onNavigationEvent = i26 % 128;
                                if (i26 % 2 != 0) {
                                    int i27 = 78 / 0;
                                }
                            } else {
                                function25 = function22;
                            }
                            if ((i2 & 32) != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = onNavigationEvent.IAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                i7 = i3 & (-458753);
                                z4 = z5;
                                aFf1oSDK5OnWarmupCompleted = AFf1oSDK1.onWarmupCompleted((Function1) objOnMinimized, null, null, 0.0f, 0, null, 0.0f, null, 0, false, 0L, null, null, null, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 32766);
                                function24 = function25;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(294470358, i7, -1, "im.toss.tosssecurities.uikit.chart.line.LineChart (LineChart.kt:21)");
                                }
                                int i28 = i7 << 6;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, aFf1oSDK5OnWarmupCompleted, quirksExternalSyntheticBackport05, cameraPresenceProviderExternalSyntheticLambda62, (CameraPresenceProviderExternalSyntheticLambda6<Double>) null, z4, (CameraPresenceProviderExternalSyntheticLambda6) null, (CameraPresenceProviderExternalSyntheticLambda6) null, function24, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i28 & 458752) | (i7 & 14) | ((i7 >> 12) & 112) | (i7 & 896) | (i28 & 7168) | ((i7 << 12) & 234881024), 208);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                z3 = z4;
                                function23 = function24;
                                aFf1oSDK53 = aFf1oSDK5OnWarmupCompleted;
                            } else {
                                function22 = function25;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        z4 = z5;
                        function24 = function22;
                        i7 = i3;
                        aFf1oSDK5OnWarmupCompleted = aFf1oSDK52;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport02;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        int i282 = i7 << 6;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, aFf1oSDK5OnWarmupCompleted, quirksExternalSyntheticBackport052, cameraPresenceProviderExternalSyntheticLambda62, (CameraPresenceProviderExternalSyntheticLambda6<Double>) null, z4, (CameraPresenceProviderExternalSyntheticLambda6) null, (CameraPresenceProviderExternalSyntheticLambda6) null, function24, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i282 & 458752) | (i7 & 14) | ((i7 >> 12) & 112) | (i7 & 896) | (i282 & 7168) | ((i7 << 12) & 234881024), 208);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport052;
                        z3 = z4;
                        function23 = function24;
                        aFf1oSDK53 = aFf1oSDK5OnWarmupCompleted;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    z3 = z5;
                    function23 = function22;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    aFf1oSDK53 = aFf1oSDK52;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.chart.line.LineChartKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallbackWithResult + 33;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitOnExtraCallbackWithResult = AFf1oSDK.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, quirksExternalSyntheticBackport03, z3, function23, aFf1oSDK53, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i32 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                            onWarmupCompleted = i32 % 128;
                            int i33 = i32 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                    return;
                }
                return;
            }
            int i29 = onNavigationEvent + 69;
            IAuthTabCallback = i29 % 128;
            int i30 = i29 % 2;
            i3 |= 24576;
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
