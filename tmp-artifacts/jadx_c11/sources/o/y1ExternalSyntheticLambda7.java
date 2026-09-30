package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.Role;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.hasProvider;
import o.initSDK;
import o.y1ExternalSyntheticLambda7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda7 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function0 function0, hasProvider hasprovider, long j3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(gethumanreadablename, j, j2, graphicDeviceInfo, quirksExternalSyntheticBackport0, f, function0, hasprovider, j3, getsupportedhighspeedresolutionsfor, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(f, getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(hasprovider, quirksExternalSyntheticBackport0, function0, gethumanreadablename, j, j2, j3, graphicDeviceInfo, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 65;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport0, function0, gethumanreadablename, j, j2, j3, graphicDeviceInfo, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 91;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            surfaceProcessorNodeOut.IAuthTabCallbackDefault();
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        int iIAuthTabCallbackDefault = surfaceProcessorNodeOut.IAuthTabCallbackDefault();
        if (iIAuthTabCallbackDefault != 0) {
            if (iIAuthTabCallbackDefault != 1) {
                Rect rectOnNavigationEvent = ld.onNavigationEvent(surfaceProcessorNodeOut, surfaceProcessorNodeOut.IAuthTabCallbackDefault() - 1);
                if (rectOnNavigationEvent.IAuthTabCallback_Parcel() - rectOnNavigationEvent.IAuthTabCallbackStubProxy() >= ((int) (surfaceProcessorNodeOut.asBinder() >> 32))) {
                    f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    int i3 = onExtraCallbackWithResult + 89;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 % 5;
                    }
                }
            }
        }
        onExtraCallback(getsupportedhighspeedresolutionsfor, f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, Function0 function0, hasProvider hasprovider, long j3, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 48) == 0) {
            int i4 = onExtraCallbackWithResult + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1944094310, i2, -1, "im.toss.tds.compose.component.compound.top.v2.TdsSelector.<anonymous> (TdsSelector.kt:51)");
            }
            getHumanReadableName gethumanreadablenameOnWarmupCompleted = AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted()), (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), gethumanreadablename, j, j2, 0L, ConnectionPool.onWarmupCompleted.onWarmupCompleted(), null, 0.0f, null, null, 0L, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 4000);
            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
            iAuthTabCallback.onExtraCallbackWithResult(hasprovider);
            AppLovinCmpErrorCode.onExtraCallback(821297770, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -821297768, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, Integer.valueOf(R.drawable.icon_arrow_down_mono), Long.valueOf(j3), null, Long.valueOf(gethumanreadablenameOnWarmupCompleted.IAuthTabCallbackStub()), 4, null});
            hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i8 = onExtraCallbackWithResult + 119;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized, getSharedInstance.onExtraCallback(false, false, 0L, configureReward.IAuthTabCallback(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, 0.0f, onNavigationEvent(getsupportedhighspeedresolutionsfor), 0.0f, 10, (Object) null), null, null, null, 231, null), (setTitleMarginStart) null, false, (String) null, Role.IAuthTabCallback(Role.Companion.onWarmupCompleted()), function0, 28, (Object) null);
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zIAuthTabCallback) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.top.v2.TdsSelectorKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj2) {
                            Unit unitOnExtraCallbackWithResult;
                            int i10 = 2 % 2;
                            int i11 = IAuthTabCallback + 53;
                            onExtraCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda7.onExtraCallbackWithResult(f, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj2);
                                int i12 = 60 / 0;
                            } else {
                                unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda7.onExtraCallbackWithResult(f, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj2);
                            }
                            int i13 = onExtraCallback + 117;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function1);
                    obj = function1;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted(hasproviderOnExtraCallbackWithResult, gethumanreadablenameOnWarmupCompleted, quirksExternalSyntheticBackport0OnWarmupCompleted, null, null, null, false, (Function1) obj, null, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 888);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onExtraCallbackWithResult + 81;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        Function0<Unit> function02;
        getHumanReadableName gethumanreadablename2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final float f2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function0<Unit> function03;
        final getHumanReadableName gethumanreadablename3;
        final long j4;
        final long j5;
        final long j6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getHumanReadableName gethumanreadablename4;
        long jOnTransact;
        long jOnNavigationEvent;
        long jIAuthTabCallback;
        GraphicDeviceInfo graphicDeviceInfo3;
        GraphicDeviceInfo graphicDeviceInfo4;
        float f3;
        Object objOnMinimized;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1176360603);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            int i15 = onExtraCallback + 9;
            onExtraCallbackWithResult = i15 % 128;
            i3 = i15 % 2 == 0 ? i3 | 116 : i3 | 48;
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
                    function02 = function0;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gethumanreadablename2 = gethumanreadablename;
                        int i16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename2) ? 2048 : 1024;
                        i3 |= i16;
                    } else {
                        gethumanreadablename2 = gethumanreadablename;
                    }
                    i3 |= i16;
                } else {
                    gethumanreadablename2 = gethumanreadablename;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        int i17 = onExtraCallback + 115;
                        onExtraCallbackWithResult = i17 % 128;
                        if (i17 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 16384 : 8192) | i3;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i8 = i6 | 196608;
                    } else {
                        i8 = i6;
                        if ((196608 & i) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i8 |= ((i2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                        i10 = i9;
                        if ((i & 12582912) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 8388608 : 4194304;
                        }
                        i11 = i2 & 256;
                        if (i11 != 0) {
                            i8 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 67108864 : 33554432;
                        }
                        i12 = i8;
                        if ((i12 & 38347923) != 38347922) {
                            int i18 = onExtraCallbackWithResult + 43;
                            onExtraCallback = i18 % 128;
                            int i19 = i18 % 2;
                            z = true;
                        } else {
                            int i20 = onExtraCallbackWithResult + 101;
                            onExtraCallback = i20 % 128;
                            int i21 = i20 % 2;
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) != 0) {
                                int i22 = onExtraCallbackWithResult + 87;
                                onExtraCallback = i22 % 128;
                                int i23 = i22 % 2;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    if (i14 != 0) {
                                        int i24 = onExtraCallback + 67;
                                        onExtraCallbackWithResult = i24 % 128;
                                        if (i24 % 2 == 0) {
                                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                            throw null;
                                        }
                                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                    } else {
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                    }
                                    if (i4 != 0) {
                                        function02 = null;
                                    }
                                    if ((i2 & 8) != 0) {
                                        gethumanreadablename4 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                        i12 &= -7169;
                                    } else {
                                        gethumanreadablename4 = gethumanreadablename2;
                                    }
                                    if (i5 != 0) {
                                        int i25 = onExtraCallbackWithResult + 109;
                                        onExtraCallback = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            setByteOrder.Companion.onTransact();
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        jOnTransact = setByteOrder.Companion.onTransact();
                                    } else {
                                        jOnTransact = j;
                                    }
                                    jOnNavigationEvent = i7 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                    if ((i2 & 64) != 0) {
                                        jIAuthTabCallback = y1ExternalSyntheticLambda5.onNavigationEvent.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i12 &= -3670017;
                                    } else {
                                        jIAuthTabCallback = j3;
                                    }
                                    graphicDeviceInfo3 = i10 != 0 ? null : graphicDeviceInfo;
                                    if (i11 != 0) {
                                        graphicDeviceInfo4 = graphicDeviceInfo3;
                                        f3 = onNavigationEvent;
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    final long j7 = jOnTransact;
                                    final long j8 = jOnNavigationEvent;
                                    final long j9 = jIAuthTabCallback;
                                    final getHumanReadableName gethumanreadablename5 = gethumanreadablename4;
                                    final Function0<Unit> function04 = function02;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1176360603, i12, -1, "im.toss.tds.compose.component.compound.top.v2.TdsSelector (TdsSelector.kt:48)");
                                    }
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f3), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                    final GraphicDeviceInfo graphicDeviceInfo5 = graphicDeviceInfo4;
                                    final float f4 = f3;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    setThreadList.IAuthTabCallback(new onJavaCrashFilter("selector"), (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(1944094310, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.top.v2.TdsSelectorKt$$ExternalSyntheticLambda1
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) throws NoWhenBranchMatchedException {
                                            int i26 = 2 % 2;
                                            int i27 = onWarmupCompleted + 73;
                                            onExtraCallbackWithResult = i27 % 128;
                                            int i28 = i27 % 2;
                                            Unit unitOnExtraCallback = y1ExternalSyntheticLambda7.onExtraCallback(gethumanreadablename5, j7, j8, graphicDeviceInfo5, quirksExternalSyntheticBackport05, f4, function04, hasprovider, j9, getsupportedhighspeedresolutionsfor, (initSDK) obj3, (QuirksExternalSyntheticBackport0) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                            int i29 = onExtraCallbackWithResult + 123;
                                            onWarmupCompleted = i29 % 128;
                                            if (i29 % 2 != 0) {
                                                return unitOnExtraCallback;
                                            }
                                            Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 30);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                    function03 = function04;
                                    gethumanreadablename3 = gethumanreadablename5;
                                    j4 = j7;
                                    j5 = j8;
                                    j6 = j9;
                                    graphicDeviceInfo2 = graphicDeviceInfo4;
                                    f2 = f3;
                                } else {
                                    int i26 = onExtraCallbackWithResult + 21;
                                    onExtraCallback = i26 % 128;
                                    int i27 = i26 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 8) != 0) {
                                        i12 &= -7169;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    jIAuthTabCallback = j3;
                                    graphicDeviceInfo3 = graphicDeviceInfo;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                    gethumanreadablename4 = gethumanreadablename2;
                                    jOnTransact = j;
                                    jOnNavigationEvent = j2;
                                }
                                f3 = f;
                                graphicDeviceInfo4 = graphicDeviceInfo3;
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport04;
                                final long j72 = jOnTransact;
                                final long j82 = jOnNavigationEvent;
                                final long j92 = jIAuthTabCallback;
                                final getHumanReadableName gethumanreadablename52 = gethumanreadablename4;
                                final Function0 function042 = function02;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                final GraphicDeviceInfo graphicDeviceInfo52 = graphicDeviceInfo4;
                                final float f42 = f3;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                setThreadList.IAuthTabCallback(new onJavaCrashFilter("selector"), (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(1944094310, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.top.v2.TdsSelectorKt$$ExternalSyntheticLambda1
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) throws NoWhenBranchMatchedException {
                                        int i262 = 2 % 2;
                                        int i272 = onWarmupCompleted + 73;
                                        onExtraCallbackWithResult = i272 % 128;
                                        int i28 = i272 % 2;
                                        Unit unitOnExtraCallback = y1ExternalSyntheticLambda7.onExtraCallback(gethumanreadablename52, j72, j82, graphicDeviceInfo52, quirksExternalSyntheticBackport052, f42, function042, hasprovider, j92, getsupportedhighspeedresolutionsfor2, (initSDK) obj3, (QuirksExternalSyntheticBackport0) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                        int i29 = onExtraCallbackWithResult + 123;
                                        onWarmupCompleted = i29 % 128;
                                        if (i29 % 2 != 0) {
                                            return unitOnExtraCallback;
                                        }
                                        Object obj7 = null;
                                        obj7.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 30);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport052;
                                function03 = function042;
                                gethumanreadablename3 = gethumanreadablename52;
                                j4 = j72;
                                j5 = j82;
                                j6 = j92;
                                graphicDeviceInfo2 = graphicDeviceInfo4;
                                f2 = f3;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            graphicDeviceInfo2 = graphicDeviceInfo;
                            f2 = f;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            function03 = function02;
                            gethumanreadablename3 = gethumanreadablename2;
                            j4 = j;
                            j5 = j2;
                            j6 = j3;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.v2.TdsSelectorKt$$ExternalSyntheticLambda2
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj3, Object obj4) {
                                    int i28 = 2 % 2;
                                    int i29 = onWarmupCompleted + 1;
                                    onExtraCallbackWithResult = i29 % 128;
                                    int i30 = i29 % 2;
                                    Unit unitOnNavigationEvent = y1ExternalSyntheticLambda7.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport03, function03, gethumanreadablename3, j4, j5, j6, graphicDeviceInfo2, f2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i31 = onWarmupCompleted + 25;
                                    onExtraCallbackWithResult = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        int i32 = 11 / 0;
                                    }
                                    return unitOnNavigationEvent;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i28 = onExtraCallback + 45;
                    onExtraCallbackWithResult = i28 % 128;
                    i10 = i9;
                    if (i28 % 2 == 0) {
                        throw null;
                    }
                    i8 |= 12582912;
                    i11 = i2 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i8;
                    if ((i12 & 38347923) != 38347922) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i6 = i3;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                }
                i12 = i8;
                if ((i12 & 38347923) != 38347922) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            function02 = function0;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i3;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i11 = i2 & 256;
            if (i11 != 0) {
            }
            i12 = i8;
            if ((i12 & 38347923) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i3;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i11 = i2 & 256;
        if (i11 != 0) {
        }
        i12 = i8;
        if ((i12 & 38347923) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = onExtraCallbackWithResult + 3;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = onWarmupCompleted + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
