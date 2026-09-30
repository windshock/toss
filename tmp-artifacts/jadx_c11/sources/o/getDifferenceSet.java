package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRightPreset$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getDifferenceSet;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getDifferenceSet {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(getDifferenceSet getdifferenceset, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(getdifferenceset, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(getdifferenceset, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(getDifferenceSet getdifferenceset, String str, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        getdifferenceset.onExtraCallback(str, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getDifferenceSet getdifferenceset, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        getdifferenceset.onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDifferenceSet getdifferenceset, String str, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, setCallToAction.IAuthTabCallback iAuthTabCallback, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(getdifferenceset, str, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(getdifferenceset, str, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, iAuthTabCallback, setclickdestinationbackupuri, onnavigationevent, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final String str, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, @Nullable setCallToAction.onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function0<Unit> function03;
        int i8;
        int i9;
        int i10;
        int i11;
        int iOrdinal;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        Function0<Unit> function04;
        setClickDestinationBackupUri setclickdestinationbackupuriIAuthTabCallbackStub;
        setCallToAction.onNavigationEvent onnavigationevent2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z4;
        Function0<Unit> function05;
        setCallToAction.IAuthTabCallback iAuthTabCallback2;
        boolean z5;
        setClickDestinationBackupUri setclickdestinationbackupuri2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        final boolean z6;
        final boolean z7;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        final setCallToAction.IAuthTabCallback iAuthTabCallback3;
        final setClickDestinationBackupUri setclickdestinationbackupuri3;
        final setCallToAction.onNavigationEvent onnavigationevent3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1242492988);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                int i14 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                            int i16 = onWarmupCompleted + 63;
                            onExtraCallbackWithResult = i16 % 128;
                            i6 = i16 % 2 != 0 ? 28140 : 2048;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 16;
                    if (i7 != 0) {
                        if ((i & 24576) == 0) {
                            function03 = function0;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 16384 : 8192;
                        }
                        i8 = i2 & 32;
                        if (i8 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 131072 : 65536;
                        }
                        i9 = i2 & 64;
                        if (i9 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) {
                                int i17 = onWarmupCompleted + 101;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((12582912 & i) == 0) {
                            int i19 = onExtraCallbackWithResult + 11;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            i3 |= ((i2 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri)) ? 8388608 : 4194304;
                        }
                        i11 = i2 & 256;
                        if (i11 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (onnavigationevent == null) {
                                int i21 = onWarmupCompleted + 101;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                iOrdinal = -1;
                            } else {
                                iOrdinal = onnavigationevent.ordinal();
                            }
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 67108864 : 33554432;
                        }
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                            z6 = z;
                            function07 = function02;
                            setclickdestinationbackupuri3 = setclickdestinationbackupuri;
                            z7 = z3;
                            function06 = function03;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            iAuthTabCallback3 = iAuthTabCallback;
                            onnavigationevent3 = onnavigationevent;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                if (i13 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        int i23 = onExtraCallbackWithResult + 57;
                                        onWarmupCompleted = i23 % 128;
                                        int i24 = i23 % 2;
                                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                } else {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                }
                                boolean z8 = i4 != 0 ? true : z;
                                if (i5 != 0) {
                                    z3 = false;
                                }
                                if (i7 != 0) {
                                    function03 = null;
                                }
                                if (i8 != 0) {
                                    int i25 = onExtraCallbackWithResult + 27;
                                    onWarmupCompleted = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        throw null;
                                    }
                                    function04 = null;
                                } else {
                                    function04 = function02;
                                }
                                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = i9 != 0 ? setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult() : iAuthTabCallback;
                                if ((i2 & 128) != 0) {
                                    setclickdestinationbackupuriIAuthTabCallbackStub = setBody.onExtraCallback.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    i3 &= -29360129;
                                } else {
                                    setclickdestinationbackupuriIAuthTabCallbackStub = setclickdestinationbackupuri;
                                }
                                if (i11 != 0) {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                    onnavigationevent2 = setCallToAction.onNavigationEvent.Block;
                                } else {
                                    int i26 = onWarmupCompleted + 19;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    onnavigationevent2 = onnavigationevent;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                }
                                z4 = z8;
                                function05 = function04;
                                iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
                                z5 = z3;
                                setclickdestinationbackupuri2 = setclickdestinationbackupuriIAuthTabCallbackStub;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                z4 = z;
                                function05 = function02;
                                iAuthTabCallback2 = iAuthTabCallback;
                                setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                                onnavigationevent2 = onnavigationevent;
                                z5 = z3;
                            }
                            Function0<Unit> function08 = function03;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i28 = onWarmupCompleted + 47;
                                onExtraCallbackWithResult = i28 % 128;
                                int i29 = i28 % 2;
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1242492988, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRightPreset.Cta (TdsAgreementV4CtaPresets.kt:305)");
                            }
                            int i30 = i3 >> 12;
                            int i31 = i3 << 3;
                            int i32 = i3 << 18;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult().IAuthTabCallbackStub()), iAuthTabCallback2, setclickdestinationbackupuri2, onnavigationevent2, function08, function05, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, Boolean.valueOf(z4), Boolean.valueOf(z5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i30 & 57344) | (i3 & 14) | 48 | (i30 & 896) | (i30 & 7168) | (458752 & i31) | (3670016 & i31) | (29360128 & i32) | (234881024 & i32) | (1879048192 & i32)), 0}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                            z6 = z4;
                            z7 = z5;
                            function06 = function08;
                            function07 = function05;
                            iAuthTabCallback3 = iAuthTabCallback2;
                            setclickdestinationbackupuri3 = setclickdestinationbackupuri2;
                            onnavigationevent3 = onnavigationevent2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRightPreset$$ExternalSyntheticLambda1
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) throws Throwable {
                                    int i33 = 2 % 2;
                                    int i34 = onExtraCallbackWithResult + 85;
                                    onWarmupCompleted = i34 % 128;
                                    int i35 = i34 % 2;
                                    Unit unitOnWarmupCompleted = getDifferenceSet.onWarmupCompleted(this.f$0, str, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, z6, z7, function06, function07, iAuthTabCallback3, setclickdestinationbackupuri3, onnavigationevent3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i36 = onWarmupCompleted + 17;
                                    onExtraCallbackWithResult = i36 % 128;
                                    int i37 = i36 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i33 = onExtraCallbackWithResult + 119;
                    onWarmupCompleted = i33 % 128;
                    i3 = i33 % 2 == 0 ? i3 | 1124 : i3 | 24576;
                    function03 = function0;
                    i8 = i2 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 64;
                    if (i9 != 0) {
                    }
                    if ((12582912 & i) == 0) {
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z3 = z2;
                i7 = i2 & 16;
                if (i7 != 0) {
                }
                function03 = function0;
                i8 = i2 & 32;
                if (i8 != 0) {
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            function03 = function0;
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            i9 = i2 & 64;
            if (i9 != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i11 = i2 & 256;
            if (i11 != 0) {
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        function03 = function0;
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        i9 = i2 & 64;
        if (i9 != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i11 = i2 & 256;
        if (i11 != 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public final void onWarmupCompleted(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-617985561);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-617985561, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRightPreset.Content (TdsAgreementV4CtaPresets.kt:325)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-617985561, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRightPreset.Content (TdsAgreementV4CtaPresets.kt:325)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i7 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i8 = 12 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
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
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeftRightPreset$.ExternalSyntheticLambda0(this, function2, i));
            int i9 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
    }
}
