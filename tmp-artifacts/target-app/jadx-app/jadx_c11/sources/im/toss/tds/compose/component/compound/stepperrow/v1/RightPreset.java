package im.toss.tds.compose.component.compound.stepperrow.v1;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.getBacktraceNote;
import o.putBooleanArray;
import o.putCharArray;
import o.setAdvertiser;
import o.setBody;
import o.setCallToAction;
import o.setClickDestinationBackupUri;
import o.x2ExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightSlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightPreset {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final RightPreset onWarmupCompleted = new RightPreset();

    static {
        int i = IAuthTabCallback + 103;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RightPreset rightPreset, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rightPreset, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 51 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(RightPreset rightPreset, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, boolean z, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        rightPreset.IAuthTabCallback(function0, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, z2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 5;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(RightPreset rightPreset, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        rightPreset.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, boolean z, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unitIAuthTabCallback;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            unitIAuthTabCallback = IAuthTabCallback(rightPreset, function0, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, z2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            int i6 = 23 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(rightPreset, function0, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, z, z2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        int i7 = onExtraCallbackWithResult + 89;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RightPreset() {
    }

    public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1942512779);
        int i3 = i & 1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i3 != 0, i3)) {
            int i4 = onExtraCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1942512779, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.RightPreset.Arrow (RightPreset.kt:31)");
            }
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallback(), null, null, x2ExternalSyntheticLambda9.onNavigationEvent.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 53;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 17 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.RightPreset$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 87;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        RightPreset.IAuthTabCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitIAuthTabCallback = RightPreset.IAuthTabCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onWarmupCompleted + 21;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallbackWithResult + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1436727181, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.RightPreset.Button.<anonymous> (RightPreset.kt:67)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, @Nullable setCallToAction.onNavigationEvent onnavigationevent, boolean z, boolean z2, @NotNull final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i4;
        int i5;
        setCallToAction.IAuthTabCallback iAuthTabCallback2;
        setClickDestinationBackupUri setclickdestinationbackupuri2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z4;
        final setCallToAction.IAuthTabCallback iAuthTabCallback3;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        final setClickDestinationBackupUri setclickdestinationbackupuri3;
        final setCallToAction.onNavigationEvent onnavigationevent2;
        final boolean z5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent;
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallbackWithResult;
        boolean z6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z7;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25;
        setCallToAction.IAuthTabCallback iAuthTabCallback4;
        setCallToAction.onNavigationEvent onnavigationevent3;
        boolean z8;
        setClickDestinationBackupUri setclickdestinationbackupuri4;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(71174967);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i11 = onExtraCallback + 81;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda22)) {
                    i4 = 128;
                } else {
                    int i13 = onExtraCallback + 103;
                    onExtraCallbackWithResult = i13 % 128;
                    i4 = i13 % 2 == 0 ? 3404 : 256;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    iAuthTabCallback2 = iAuthTabCallback;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                        int i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                    }
                    i3 |= i14;
                } else {
                    setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent == null ? -1 : onnavigationevent.ordinal()) ? 131072 : 65536;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
                }
                if ((i3 & 38347923) != 38347922) {
                    int i15 = onExtraCallbackWithResult + 99;
                    onExtraCallback = i15 % 128;
                    z3 = i15 % 2 == 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        int i16 = onExtraCallbackWithResult + 63;
                        onExtraCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 34 / 0;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                if (i10 != 0) {
                                    int i18 = onExtraCallbackWithResult + 101;
                                    onExtraCallback = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                        int i19 = 85 / 0;
                                    } else {
                                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                    }
                                } else {
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                }
                                if (i12 != 0) {
                                    int i20 = onExtraCallbackWithResult + 43;
                                    onExtraCallback = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                } else {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                }
                                if (i5 != 0) {
                                    int i21 = onExtraCallback + 105;
                                    onExtraCallbackWithResult = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                                        throw null;
                                    }
                                    iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                                } else {
                                    iAuthTabCallbackOnNavigationEvent = iAuthTabCallback2;
                                }
                                if ((i2 & 16) != 0) {
                                    setclickdestinationbackupuriOnExtraCallbackWithResult = setBody.onExtraCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    i3 &= -57345;
                                } else {
                                    setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri2;
                                }
                                setCallToAction.onNavigationEvent onnavigationevent4 = i6 != 0 ? setCallToAction.onNavigationEvent.Inline : onnavigationevent;
                                if (i7 != 0) {
                                    int i22 = onExtraCallbackWithResult + 123;
                                    onExtraCallback = i22 % 128;
                                    int i23 = i22 % 2;
                                    z6 = true;
                                } else {
                                    z6 = z;
                                }
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                z7 = z6;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                iAuthTabCallback4 = iAuthTabCallbackOnNavigationEvent;
                                onnavigationevent3 = onnavigationevent4;
                                z8 = i8 == 0 ? z2 : false;
                                setclickdestinationbackupuri4 = setclickdestinationbackupuriOnExtraCallbackWithResult;
                            } else {
                                int i24 = onExtraCallback + 43;
                                onExtraCallbackWithResult = i24 % 128;
                                int i25 = i24 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                onnavigationevent3 = onnavigationevent;
                                z7 = z;
                                z8 = z2;
                                iAuthTabCallback4 = iAuthTabCallback2;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                setclickdestinationbackupuri4 = setclickdestinationbackupuri2;
                            }
                        } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(71174967, i3, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.RightPreset.Button (RightPreset.kt:90)");
                        }
                        int i26 = i3 >> 6;
                        int i27 = i3 << 3;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        setAdvertiser.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, iAuthTabCallback4, setclickdestinationbackupuri4, onnavigationevent3, null, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, z7, z8, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i26 & 7168) | ((i3 >> 3) & 14) | (i26 & 112) | (i26 & 896) | ((i3 << 15) & 458752) | ((i3 << 12) & 3670016) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), 16);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda25;
                        iAuthTabCallback3 = iAuthTabCallback4;
                        setclickdestinationbackupuri3 = setclickdestinationbackupuri4;
                        onnavigationevent2 = onnavigationevent3;
                        z5 = z7;
                        z4 = z8;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    z4 = z2;
                    iAuthTabCallback3 = iAuthTabCallback2;
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                    setclickdestinationbackupuri3 = setclickdestinationbackupuri2;
                    onnavigationevent2 = onnavigationevent;
                    z5 = z;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.RightPreset$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i28 = 2 % 2;
                            int i29 = IAuthTabCallback + 91;
                            onExtraCallbackWithResult = i29 % 128;
                            int i30 = i29 % 2;
                            Unit unitOnWarmupCompleted = RightPreset.onWarmupCompleted(this.f$0, function0, quirksExternalSyntheticBackport02, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, iAuthTabCallback3, setclickdestinationbackupuri3, onnavigationevent2, z5, z4, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i31 = IAuthTabCallback + 75;
                            onExtraCallbackWithResult = i31 % 128;
                            int i32 = i31 % 2;
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            int i28 = onExtraCallback + 115;
            onExtraCallbackWithResult = i28 % 128;
            int i29 = i28 % 2;
            iAuthTabCallback2 = iAuthTabCallback;
            if ((i & 24576) == 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i3 & 38347923) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        iAuthTabCallback2 = iAuthTabCallback;
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
