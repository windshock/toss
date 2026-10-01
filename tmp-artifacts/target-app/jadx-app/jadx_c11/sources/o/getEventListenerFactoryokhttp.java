package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.R;
import java.util.Map;
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
import o.getEventListenerFactoryokhttp;
import o.hasProvider;
import o.initSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getEventListenerFactoryokhttp {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, getHumanReadableName gethumanreadablename, long j, Map map, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, hasProvider hasprovider, long j2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, boolean z, String str, Role role, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(quirksExternalSyntheticBackport0, function0, gethumanreadablename, j, map, graphicDeviceInfo, function1, hasprovider, j2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, z, str, role, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, function0, gethumanreadablename, j, map, graphicDeviceInfo, function1, hasprovider, j2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, z, str, role, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, Function1 function1, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, Function0 function0, String str, boolean z, Map map, Role role, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, graphicDeviceInfo, j2, function1, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, function0, str, z, map, role, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, Function1 function1, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, Function0 function0, String str, boolean z, Map map, Role role, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, graphicDeviceInfo, j2, function1, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, function0, str, z, map, role, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, graphicDeviceInfo, j2, function1, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, function0, str, z, map, role, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(surfaceProcessorNodeOut);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(surfaceProcessorNodeOut);
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, getHumanReadableName gethumanreadablename, long j, Map map, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, hasProvider hasprovider, long j2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, boolean z, String str, Role role, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i3 = 16;
            } else {
                int i5 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i5 % 128;
                i3 = i5 % 2 != 0 ? 104 : 32;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1588691196, i2, -1, "im.toss.tds.view.compat.component.state.TdsSelector.<anonymous> (SelectorState.kt:148)");
            }
            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
            iAuthTabCallback.onExtraCallbackWithResult(hasprovider);
            AppLovinCmpErrorCode.onExtraCallback(821297770, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -821297768, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, Integer.valueOf(R.drawable.icon_arrow_down_mono), Long.valueOf(j2), null, 0L, 12, null});
            hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0);
            if (function0 != null) {
                int i6 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(measureChildConstrained.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, z, str, role, function0));
                    int i7 = 1 / 0;
                } else {
                    quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(measureChildConstrained.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, z, str, role, function0));
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback, gethumanreadablename, j, 0L, 0L, null, null, null, 0.0f, map, null, null, 0L, 0, false, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 64496);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable Function0<Unit> function0, @Nullable String str, boolean z, @Nullable Map<String, select> map, @Nullable Role role, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getHumanReadableName gethumanreadablename2;
        final long j3;
        GraphicDeviceInfo graphicDeviceInfo2;
        final long j4;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final getSubtitle getsubtitle2;
        final Function0<Unit> function02;
        final String str2;
        final boolean z2;
        final Map<String, select> map2;
        final Role role2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnTransact;
        Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        Map<String, select> mapOnNavigationEvent;
        Role roleIAuthTabCallback;
        Function1<? super SurfaceProcessorNodeOut, Unit> function14;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        Map<String, select> map3;
        Role role3;
        long j5;
        boolean z3;
        String str3;
        getSubtitle getsubtitle3;
        Function0<Unit> function03;
        getHumanReadableName gethumanreadablename4;
        long j6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        final GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult;
        int i19;
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(753235321);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i21 = i3 & 2;
        if (i21 != 0) {
            int i22 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16 : 32;
            }
            if ((i & 384) != 0) {
                int i24 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i24 % 128;
                if (i24 % 2 == 0 ? (i3 & 4) == 0 : i21 == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) {
                        i19 = 256;
                    }
                    i4 |= i19;
                }
                i19 = 128;
                i4 |= i19;
            }
            i5 = i3 & 8;
            int i25 = 2048;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 65536 : 131072;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((12582912 & i) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) {
                                int i26 = onWarmupCompleted + 101;
                                onExtraCallbackWithResult = i26 % 128;
                                int i27 = i26 % 2;
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((805306368 & i) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                                    int i28 = onExtraCallbackWithResult + 37;
                                    onWarmupCompleted = i28 % 128;
                                    if (i28 % 2 != 0) {
                                        int i29 = 64 / 0;
                                    }
                                    i13 = 536870912;
                                } else {
                                    i13 = 268435456;
                                }
                                i4 |= i13;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i15 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i15 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2);
                            } else {
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                            } else if ((i2 & 48) == 0) {
                                int i30 = onExtraCallbackWithResult + 65;
                                onWarmupCompleted = i30 % 128;
                                if (i30 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                                    throw null;
                                }
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
                            }
                            i17 = i15;
                            i18 = i3 & 4096;
                            if (i18 != 0) {
                                if ((i2 & 384) == 0) {
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(map) ? 256 : 128;
                                }
                                if ((i2 & 3072) == 0) {
                                    if ((i3 & 8192) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(role)) {
                                        int i31 = onWarmupCompleted + 107;
                                        onExtraCallbackWithResult = i31 % 128;
                                        int i32 = i31 % 2;
                                    } else {
                                        i25 = 1024;
                                    }
                                    i17 |= i25;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i21 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                        if ((i3 & 4) != 0) {
                                            gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                            i4 &= -897;
                                        } else {
                                            gethumanreadablename3 = gethumanreadablename;
                                        }
                                        long jOnTransact2 = i5 != 0 ? setByteOrder.Companion.onTransact() : j;
                                        GraphicDeviceInfo graphicDeviceInfo3 = i6 != 0 ? null : graphicDeviceInfo;
                                        if (i7 != 0) {
                                            int i33 = onExtraCallbackWithResult + 87;
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                            onWarmupCompleted = i33 % 128;
                                            int i34 = i33 % 2;
                                            jOnTransact = setByteOrder.Companion.onTransact();
                                        } else {
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                            jOnTransact = j2;
                                        }
                                        if (i8 != 0) {
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.state.SelectorStateKt$$ExternalSyntheticLambda0
                                                    private static int onExtraCallback = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke(Object obj) {
                                                        int i35 = 2 % 2;
                                                        int i36 = onExtraCallback + 13;
                                                        onNavigationEvent = i36 % 128;
                                                        int i37 = i36 % 2;
                                                        Unit unitOnWarmupCompleted = getEventListenerFactoryokhttp.onWarmupCompleted((SurfaceProcessorNodeOut) obj);
                                                        int i38 = onNavigationEvent + 97;
                                                        onExtraCallback = i38 % 128;
                                                        if (i38 % 2 == 0) {
                                                            int i39 = 1 / 0;
                                                        }
                                                        return unitOnWarmupCompleted;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                            }
                                            function13 = (Function1) objOnMinimized;
                                        } else {
                                            function13 = function1;
                                        }
                                        if (i9 != 0) {
                                            int i35 = onExtraCallbackWithResult + 119;
                                            onWarmupCompleted = i35 % 128;
                                            int i36 = i35 % 2;
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized2 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                            }
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2;
                                        } else {
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        }
                                        getSubtitle getsubtitle4 = i10 != 0 ? null : getsubtitle;
                                        Function0<Unit> function04 = i12 != 0 ? null : function0;
                                        String str4 = i14 == 0 ? str : null;
                                        boolean z4 = i16 != 0 ? false : z;
                                        if (i18 != 0) {
                                            int i37 = onExtraCallbackWithResult + 107;
                                            onWarmupCompleted = i37 % 128;
                                            int i38 = i37 % 2;
                                            mapOnNavigationEvent = access8100.onNavigationEvent();
                                        } else {
                                            mapOnNavigationEvent = map;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onWarmupCompleted());
                                            i17 &= -7169;
                                        } else {
                                            roleIAuthTabCallback = role;
                                        }
                                        function14 = function13;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        map3 = mapOnNavigationEvent;
                                        role3 = roleIAuthTabCallback;
                                        graphicDeviceInfo2 = graphicDeviceInfo3;
                                        j5 = jOnTransact;
                                        z3 = z4;
                                        str3 = str4;
                                        getsubtitle3 = getsubtitle4;
                                        function03 = function04;
                                        gethumanreadablename4 = gethumanreadablename3;
                                        j6 = jOnTransact2;
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    } else {
                                        int i39 = onExtraCallbackWithResult + 57;
                                        onWarmupCompleted = i39 % 128;
                                        if (i39 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i3 & 3) != 0) {
                                                i4 &= -897;
                                            }
                                            if ((i3 & 8192) != 0) {
                                                i17 &= -7169;
                                            }
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                            gethumanreadablename4 = gethumanreadablename;
                                            j6 = j;
                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                            j5 = j2;
                                            function14 = function1;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            getsubtitle3 = getsubtitle;
                                            function03 = function0;
                                            str3 = str;
                                            z3 = z;
                                            map3 = map;
                                            role3 = role;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i3 & 4) != 0) {
                                            }
                                            if ((i3 & 8192) != 0) {
                                            }
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                            gethumanreadablename4 = gethumanreadablename;
                                            j6 = j;
                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                            j5 = j2;
                                            function14 = function1;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            getsubtitle3 = getsubtitle;
                                            function03 = function0;
                                            str3 = str;
                                            z3 = z;
                                            map3 = map;
                                            role3 = role;
                                        }
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(753235321, i4, i17, "im.toss.tds.view.compat.component.state.TdsSelector (SelectorState.kt:139)");
                                    }
                                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                                    long jIAuthTabCallbackStub = gethumanreadablename4.IAuthTabCallbackStub();
                                    if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jIAuthTabCallbackStub) == 0) {
                                        jIAuthTabCallbackStub = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)).IAuthTabCallback();
                                    }
                                    float fE_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.e_(jIAuthTabCallbackStub);
                                    if (graphicDeviceInfo2 == null) {
                                        int i40 = (int) fE_;
                                        graphicDeviceInfoOnExtraCallbackWithResult = (Integer.MIN_VALUE > i40 || i40 >= 22) ? (22 > i40 || i40 >= 28) ? isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult() : isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub() : isRepeatingEnabled.onExtraCallback.asBinder();
                                    } else {
                                        graphicDeviceInfoOnExtraCallbackWithResult = graphicDeviceInfo2;
                                    }
                                    onJavaCrashFilter onjavacrashfilter = new onJavaCrashFilter("selector");
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                    final Function0<Unit> function05 = function03;
                                    final getHumanReadableName gethumanreadablename5 = gethumanreadablename4;
                                    final long j7 = j6;
                                    final Map<String, select> map4 = map3;
                                    final Function1<? super SurfaceProcessorNodeOut, Unit> function15 = function14;
                                    final long j8 = j5;
                                    final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                    final getSubtitle getsubtitle5 = getsubtitle3;
                                    final boolean z5 = z3;
                                    final String str5 = str3;
                                    final Role role4 = role3;
                                    setTaggedAddrCtrl settaggedaddrctrl = new setTaggedAddrCtrl() { // from class: im.toss.tds.view.compat.component.state.SelectorStateKt$$ExternalSyntheticLambda1
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                                            int i41 = 2 % 2;
                                            int i42 = onExtraCallback + 21;
                                            onExtraCallbackWithResult = i42 % 128;
                                            int i43 = i42 % 2;
                                            Unit unitIAuthTabCallback = getEventListenerFactoryokhttp.IAuthTabCallback(quirksExternalSyntheticBackport06, function05, gethumanreadablename5, j7, map4, graphicDeviceInfoOnExtraCallbackWithResult, function15, hasprovider, j8, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, getsubtitle5, z5, str5, role4, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                            int i44 = onExtraCallback + 41;
                                            onExtraCallbackWithResult = i44 % 128;
                                            int i45 = i44 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    setThreadList.IAuthTabCallback(onjavacrashfilter, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-1588691196, true, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 30);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                    gethumanreadablename2 = gethumanreadablename4;
                                    j3 = j6;
                                    j4 = j5;
                                    function12 = function14;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                    getsubtitle2 = getsubtitle3;
                                    function02 = function03;
                                    str2 = str3;
                                    z2 = z3;
                                    map2 = map3;
                                    role2 = role3;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                    gethumanreadablename2 = gethumanreadablename;
                                    j3 = j;
                                    graphicDeviceInfo2 = graphicDeviceInfo;
                                    j4 = j2;
                                    function12 = function1;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    getsubtitle2 = getsubtitle;
                                    function02 = function0;
                                    str2 = str;
                                    z2 = z;
                                    map2 = map;
                                    role2 = role;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    final GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfo2;
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.state.SelectorStateKt$$ExternalSyntheticLambda2
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i41 = 2 % 2;
                                            int i42 = IAuthTabCallback + 75;
                                            onExtraCallback = i42 % 128;
                                            int i43 = i42 % 2;
                                            Unit unitIAuthTabCallback = getEventListenerFactoryokhttp.IAuthTabCallback(hasprovider, quirksExternalSyntheticBackport02, gethumanreadablename2, j3, graphicDeviceInfo4, j4, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, function02, str2, z2, map2, role2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i44 = onExtraCallback + 35;
                                            IAuthTabCallback = i44 % 128;
                                            if (i44 % 2 == 0) {
                                                return unitIAuthTabCallback;
                                            }
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i17 |= 384;
                            if ((i2 & 3072) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        i17 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    i17 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                i17 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            i17 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        int i252 = 2048;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        i17 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i4) == 306783378 && (i17 & 1171) == 1170) ? false : true, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
