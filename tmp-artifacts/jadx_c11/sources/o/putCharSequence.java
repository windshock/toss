package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.oExternalSyntheticLambda0;
import o.putCharSequence;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putCharSequence {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    private static final Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, dispatchPostbackAsync dispatchpostbackasync, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(gethumanreadablename, gethumanreadablename2, dispatchpostbackasync, onwarmupcompleted, onextracallbackwithresult, z, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(gethumanreadablename, gethumanreadablename2, dispatchpostbackasync, onwarmupcompleted, onextracallbackwithresult, z, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, dispatchPostbackAsync dispatchpostbackasync, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(gethumanreadablename, gethumanreadablename2, dispatchpostbackasync, onwarmupcompleted, onextracallbackwithresult, z, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(gethumanreadablename, gethumanreadablename2, dispatchpostbackasync, onwarmupcompleted, onextracallbackwithresult, z, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4, @NotNull RemoveCompoundPaddings removeCompoundPaddings) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(removeCompoundPaddings, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(removeCompoundPaddings.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f, f2, f3, f4));
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            if ((i2 & 1) != 0) {
                f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            if ((i2 & 1) != 0) {
            }
        }
        if ((i2 & 2) != 0) {
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        float f5 = f2;
        if ((i2 & 4) != 0) {
            f3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        float f6 = f3;
        if ((i2 & 8) != 0) {
            f4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i5 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        float f7 = f4;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(821495048, i, -1, "im.toss.tds.compose.component.compound.compoundPadding (TdsCompound.kt:72)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(821495048, i, -1, "im.toss.tds.compose.component.compound.compoundPadding (TdsCompound.kt:72)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, f, f5, f6, f7, (RemoveCompoundPaddings) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(RemoveCompoundPaddingsKt.onExtraCallbackWithResult()));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            f = i4 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        float f3 = f;
        if ((i2 & 2) != 0) {
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        float f4 = f2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1096210232, i, -1, "im.toss.tds.compose.component.compound.compoundPadding (TdsCompound.kt:84)");
            int i5 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, f3, f4, f3, f4, (RemoveCompoundPaddings) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(RemoveCompoundPaddingsKt.onExtraCallbackWithResult()));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable dispatchPostbackAsync dispatchpostbackasync, @Nullable oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, boolean z, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        getHumanReadableName gethumanreadablename3;
        int i3;
        getHumanReadableName gethumanreadablename4;
        dispatchPostbackAsync dispatchpostbackasync2;
        oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted2;
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2;
        boolean z2;
        final dispatchPostbackAsync dispatchpostbackasync3;
        final oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted3;
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1244377472);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                gethumanreadablename3 = gethumanreadablename;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename3)) {
                    int i8 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    i6 = 4;
                }
                i3 = i6 | i;
            } else {
                gethumanreadablename3 = gethumanreadablename;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            gethumanreadablename3 = gethumanreadablename;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                gethumanreadablename4 = gethumanreadablename2;
                int i10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename4) ? 32 : 16;
                i3 |= i10;
            } else {
                gethumanreadablename4 = gethumanreadablename2;
            }
            i3 |= i10;
        } else {
            gethumanreadablename4 = gethumanreadablename2;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                dispatchpostbackasync2 = dispatchpostbackasync;
                int i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(dispatchpostbackasync2) ? 256 : 128;
                i3 |= i11;
            } else {
                dispatchpostbackasync2 = dispatchpostbackasync;
            }
            i3 |= i11;
        } else {
            dispatchpostbackasync2 = dispatchpostbackasync;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                int i12 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                onwarmupcompleted2 = onwarmupcompleted;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted2)) {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                onwarmupcompleted2 = onwarmupcompleted;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                onextracallbackwithresult2 = onextracallbackwithresult;
                int i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 16384 : 8192;
                i3 |= i14;
            } else {
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            i3 |= i14;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        int i15 = i2 & 32;
        if (i15 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) == 599186, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                dispatchpostbackasync3 = dispatchpostbackasync2;
                onwarmupcompleted3 = onwarmupcompleted2;
                onextracallbackwithresult3 = onextracallbackwithresult2;
            } else {
                int i16 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                        i3 &= -15;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        gethumanreadablename4 = gethumanreadablename3;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        dispatchpostbackasync2 = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
                    }
                    if ((i2 & 8) != 0) {
                        int i18 = IAuthTabCallback + 17;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 != 0) {
                            onwarmupcompleted4 = (oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback());
                            i3 &= 2086;
                        } else {
                            onwarmupcompleted4 = (oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback());
                            i3 &= -7169;
                        }
                    } else {
                        onwarmupcompleted4 = onwarmupcompleted2;
                    }
                    if ((i2 & 16) != 0) {
                        onextracallbackwithresult3 = (setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setAdvertiser.onExtraCallback());
                        i3 &= -57345;
                    } else {
                        onextracallbackwithresult3 = onextracallbackwithresult2;
                    }
                    if (i15 != 0) {
                        int i19 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i19 % 128;
                        z2 = i19 % 2 == 0;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1244377472, i3, -1, "im.toss.tds.compose.component.compound.ProvideTdsComponentStyles (TdsCompound.kt:118)");
                        }
                        setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(!z2 ? gethumanreadablename3 : getHumanReadableName.onNavigationEvent(gethumanreadablename3, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent(), (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16646143, (Object) null)), oExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(!z2 ? gethumanreadablename4 : getHumanReadableName.onNavigationEvent(gethumanreadablename4, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent(), (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16646143, (Object) null)), dispatchPostbackRequest.onWarmupCompleted().onExtraCallback(dispatchpostbackasync2), oExternalSyntheticLambda1.onExtraCallback().onExtraCallback(onwarmupcompleted4), setAdvertiser.onExtraCallback().onExtraCallback(onextracallbackwithresult3)}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i3 >> 15) & 112));
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onwarmupcompleted3 = onwarmupcompleted4;
                        dispatchpostbackasync3 = dispatchpostbackasync2;
                    } else {
                        onextracallbackwithresult2 = onextracallbackwithresult3;
                        onwarmupcompleted2 = onwarmupcompleted4;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        int i20 = IAuthTabCallback + 21;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        i3 &= -15;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        int i22 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        int i24 = IAuthTabCallback + 107;
                        onExtraCallbackWithResult = i24 % 128;
                        i3 = i24 % 2 != 0 ? i3 & 5398 : i3 & (-7169);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                int i25 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                onwarmupcompleted4 = onwarmupcompleted2;
                onextracallbackwithresult3 = onextracallbackwithresult2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(!z2 ? gethumanreadablename3 : getHumanReadableName.onNavigationEvent(gethumanreadablename3, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent(), (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16646143, (Object) null)), oExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(!z2 ? gethumanreadablename4 : getHumanReadableName.onNavigationEvent(gethumanreadablename4, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent(), (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16646143, (Object) null)), dispatchPostbackRequest.onWarmupCompleted().onExtraCallback(dispatchpostbackasync2), oExternalSyntheticLambda1.onExtraCallback().onExtraCallback(onwarmupcompleted4), setAdvertiser.onExtraCallback().onExtraCallback(onextracallbackwithresult3)}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i3 >> 15) & 112));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onwarmupcompleted3 = onwarmupcompleted4;
                dispatchpostbackasync3 = dispatchpostbackasync2;
            }
            final boolean z3 = z2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final getHumanReadableName gethumanreadablename5 = gethumanreadablename3;
                final getHumanReadableName gethumanreadablename6 = gethumanreadablename4;
                final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.TdsCompoundKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i27 = 2 % 2;
                        int i28 = onExtraCallbackWithResult + 105;
                        onWarmupCompleted = i28 % 128;
                        int i29 = i28 % 2;
                        Unit unitOnExtraCallback = putCharSequence.onExtraCallback(gethumanreadablename5, gethumanreadablename6, dispatchpostbackasync3, onwarmupcompleted3, onextracallbackwithresult4, z3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i30 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i30 % 128;
                        if (i30 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
            }
            i4 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) == 599186, i3 & 1)) {
        }
        final boolean z32 = z2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
        }
    }
}
