package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.dispatchPostbackRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dispatchPostbackRequest {
    private static final accessisMonitoringp<dispatchPostbackAsync> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.component.atom.text.style.TextLayoutStyleKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return dispatchPostbackRequest.onNavigationEvent();
            }
            dispatchPostbackRequest.onNavigationEvent();
            throw null;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(float f, Integer num, int i, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(f, num, i, interfaceC0083handshake, r8lambda9hstmjrtodhlhwhnekzuov8q0si, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(float f, Integer num, int i, InterfaceC0083handshake interfaceC0083handshake, r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i6 % 128;
        onNavigationEvent(f, num, i, interfaceC0083handshake, r8lambda9hstmjrtodhlhwhnekzuov8q0si, function2, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ dispatchPostbackAsync onNavigationEvent() {
        dispatchPostbackAsync dispatchpostbackasyncIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            dispatchpostbackasyncIAuthTabCallback = IAuthTabCallback();
            int i3 = 16 / 0;
        } else {
            dispatchpostbackasyncIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dispatchpostbackasyncIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(float f, @Nullable Integer num, int i, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        float f2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback;
        int i8;
        r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si2;
        int i9;
        final float f3;
        final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si3;
        final Integer num3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fOnExtraCallback;
        int iOnExtraCallback;
        int iOnExtraCallbackWithResult;
        int iOnWarmupCompleted = i;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1989645306);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            f2 = f;
        } else if ((i2 & 6) == 0) {
            f2 = f;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 4 : 2) | i2;
        } else {
            f2 = f;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                num2 = num;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num2)) {
                    int i13 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                int i15 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                int i17 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 41 / 0;
                    i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnWarmupCompleted) ? 256 : 128;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnWarmupCompleted)) {
                }
                i4 |= i7;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback) ? 2048 : 1024;
                    i4 |= i19;
                } else {
                    interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
                }
                i4 |= i19;
            } else {
                interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    r8lambda9hstmjrtodhlhwhnekzuov8q0si2 = r8lambda9hstmjrtodhlhwhnekzuov8q0si;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambda9hstmjrtodhlhwhnekzuov8q0si2) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 131072 : 65536;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i2 & 1) != 0) {
                        int i20 = onExtraCallbackWithResult + 51;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 98 / 0;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                fOnExtraCallback = i11 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f2;
                                if (i12 != 0) {
                                    num2 = null;
                                }
                                if (i6 != 0) {
                                    int i22 = onExtraCallbackWithResult + 117;
                                    onNavigationEvent = i22 % 128;
                                    int i23 = i22 % 2;
                                    iOnWarmupCompleted = AppLovinVastMediaViewf.Companion.onWarmupCompleted();
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                    interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
                                }
                                if (i8 != 0) {
                                    r8lambda9hstmjrtodhlhwhnekzuov8q0si2 = null;
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i3 & 8) != 0) {
                                    int i24 = onExtraCallbackWithResult + 27;
                                    onNavigationEvent = i24 % 128;
                                    i4 = i24 % 2 == 0 ? i4 & 23128 : i4 & (-7169);
                                }
                                fOnExtraCallback = f2;
                            }
                        } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1989645306, i4, -1, "im.toss.tds.compose.component.atom.text.style.ProvideTextLayoutStyle (TextLayoutStyle.kt:48)");
                        }
                        accessisMonitoringp<dispatchPostbackAsync> accessismonitoringp = IAuthTabCallback;
                        dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(accessismonitoringp);
                        float fOnNavigationEvent = !Float.isNaN(fOnExtraCallback) ? fOnExtraCallback : dispatchpostbackasync.onNavigationEvent();
                        if (num2 != null) {
                            int i25 = onNavigationEvent + 113;
                            onExtraCallbackWithResult = i25 % 128;
                            if (i25 % 2 != 0) {
                                num2.intValue();
                                throw null;
                            }
                            iOnExtraCallback = num2.intValue();
                        } else {
                            iOnExtraCallback = dispatchpostbackasync.onExtraCallback();
                        }
                        int i26 = iOnExtraCallback;
                        if (AppLovinVastMediaViewf.onExtraCallbackWithResult(iOnWarmupCompleted, AppLovinVastMediaViewf.Companion.onWarmupCompleted())) {
                            iOnExtraCallbackWithResult = dispatchpostbackasync.onExtraCallbackWithResult();
                        } else {
                            int i27 = onNavigationEvent + 95;
                            onExtraCallbackWithResult = i27 % 128;
                            int i28 = i27 % 2;
                            iOnExtraCallbackWithResult = iOnWarmupCompleted;
                        }
                        setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback(dispatchpostbackasync.onWarmupCompleted(fOnNavigationEvent, i26, iOnExtraCallbackWithResult, protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback) ? interfaceC0083handshakeIAuthTabCallback : dispatchpostbackasync.IAuthTabCallback(), r8lambda9hstmjrtodhlhwhnekzuov8q0si2 == null ? dispatchpostbackasync.asInterface() : r8lambda9hstmjrtodhlhwhnekzuov8q0si2)), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i4 >> 12) & 112));
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        r8lambda9hstmjrtodhlhwhnekzuov8q0si3 = r8lambda9hstmjrtodhlhwhnekzuov8q0si2;
                        f3 = fOnExtraCallback;
                        num3 = num2;
                        i9 = iOnWarmupCompleted;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    i9 = iOnWarmupCompleted;
                    f3 = f2;
                    r8lambda9hstmjrtodhlhwhnekzuov8q0si3 = r8lambda9hstmjrtodhlhwhnekzuov8q0si2;
                    num3 = num2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final int i29 = i9;
                    final InterfaceC0083handshake interfaceC0083handshake2 = interfaceC0083handshakeIAuthTabCallback;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.text.style.TextLayoutStyleKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj, Object obj2) {
                            int i30 = 2 % 2;
                            int i31 = onExtraCallback + 115;
                            IAuthTabCallback = i31 % 128;
                            int i32 = i31 % 2;
                            float f4 = f3;
                            Integer num4 = num3;
                            if (i32 == 0) {
                                dispatchPostbackRequest.IAuthTabCallback(f4, num4, i29, interfaceC0083handshake2, r8lambda9hstmjrtodhlhwhnekzuov8q0si3, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                throw null;
                            }
                            Unit unitIAuthTabCallback = dispatchPostbackRequest.IAuthTabCallback(f4, num4, i29, interfaceC0083handshake2, r8lambda9hstmjrtodhlhwhnekzuov8q0si3, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i33 = onExtraCallback + 101;
                            IAuthTabCallback = i33 % 128;
                            if (i33 % 2 != 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            int i30 = onExtraCallbackWithResult;
            int i31 = i30 + 73;
            onNavigationEvent = i31 % 128;
            int i32 = i31 % 2;
            i4 |= 24576;
            int i33 = i30 + 101;
            onNavigationEvent = i33 % 128;
            int i34 = i33 % 2;
            r8lambda9hstmjrtodhlhwhnekzuov8q0si2 = r8lambda9hstmjrtodhlhwhnekzuov8q0si;
            if ((196608 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        num2 = num;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        r8lambda9hstmjrtodhlhwhnekzuov8q0si2 = r8lambda9hstmjrtodhlhwhnekzuov8q0si;
        if ((196608 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final dispatchPostbackAsync IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        dispatchPostbackAsync dispatchpostbackasyncOnNavigationEvent = dispatchPostbackAsync.Companion.onNavigationEvent();
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return dispatchpostbackasyncOnNavigationEvent;
        }
        throw null;
    }

    public static final accessisMonitoringp<dispatchPostbackAsync> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        accessisMonitoringp<dispatchPostbackAsync> accessismonitoringp = IAuthTabCallback;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return accessismonitoringp;
    }
}
