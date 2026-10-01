package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.features.home.core.ui.widget.compose.HomeNavigationDefaults$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLogger;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class switchUserLoginRpc {
    public static final int IAuthTabCallback = 0;
    private static int asBinder = 1;
    public static final switchUserLoginRpc onExtraCallback = new switchUserLoginRpc();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 27;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(switchUserLoginRpc switchuserloginrpc, List list, Function2 function2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setTaggedAddrCtrl settaggedaddrctrl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        switchuserloginrpc.onWarmupCompleted(list, function2, function1, function12, quirksExternalSyntheticBackport0, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 89;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTaggedAddrCtrl settaggedaddrctrl, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(settaggedaddrctrl, highSpeedResolverExternalSyntheticLambda2, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(switchUserLoginRpc switchuserloginrpc, List list, Function2 function2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setTaggedAddrCtrl settaggedaddrctrl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(switchuserloginrpc, list, function2, function1, function12, quirksExternalSyntheticBackport0, settaggedaddrctrl, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 61;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(tinyAppId tinyappid, Function1 function1, AppLogger appLogger) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tinyappid, function1, appLogger);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tinyappid, function1, appLogger);
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, AppLogger.onNavigationEvent.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, onwarmupcompleted);
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private switchUserLoginRpc() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(tinyAppId tinyappid, Function1 function1, AppLogger appLogger) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLogger, "");
            int i3 = 68 / 0;
            if (Intrinsics.areEqual(appLogger.IAuthTabCallbackStubProxy(), "MENU")) {
                AppLogger.onNavigationEvent interfaceDescriptor = appLogger.getInterfaceDescriptor();
                if (interfaceDescriptor != null) {
                    int i4 = onWarmupCompleted + 121;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        tinyappid.IAuthTabCallback(interfaceDescriptor);
                        throw null;
                    }
                    tinyappid.IAuthTabCallback(interfaceDescriptor);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(appLogger, "");
            if (Intrinsics.areEqual(appLogger.IAuthTabCallbackStubProxy(), "MENU")) {
            }
        }
        function1.invoke(appLogger);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(setTaggedAddrCtrl settaggedaddrctrl, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i2 = (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2) ^ true) ? 4 : 2) | i;
            int i7 = onNavigationEvent + 59;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) {
                int i9 = onNavigationEvent + 33;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-989320082, i2, -1, "im.toss.features.home.core.ui.widget.compose.HomeNavigationDefaults.Default.<anonymous> (HomeNavigationDefaults.kt:42)");
            }
            if (settaggedaddrctrl == null) {
                int i11 = onNavigationEvent + 105;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-768932542);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1548824929);
                settaggedaddrctrl.invoke(highSpeedResolverExternalSyntheticLambda2, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2 & 126));
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1, AppLogger.onNavigationEvent.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        function1.invoke(onwarmupcompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull List<AppLogger> list, @NotNull Function2<? super RVManifestLazyProxyManifest, ? super Function0<Boolean>, Unit> function2, @NotNull Function1<? super AppLogger, Unit> function1, @NotNull Function1<? super AppLogger.onNavigationEvent.onWarmupCompleted, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super String, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int i6;
        boolean z;
        setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super String, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i7;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-580412597);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i10 = onWarmupCompleted + 7;
                onNavigationEvent = i10 % 128;
                i8 = i10 % 2 == 0 ? 95 : 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            int i11 = onNavigationEvent + 51;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i12 = onNavigationEvent + 117;
                onWarmupCompleted = i12 % 128;
                i7 = i12 % 2 != 0 ? 14377 : 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 8192 : 16384;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 196608) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl)) {
                        int i14 = onWarmupCompleted + 45;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((74899 & i6) != 74898) {
                    int i16 = onWarmupCompleted + 115;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
                    if (i13 != 0) {
                        int i18 = onNavigationEvent + 21;
                        onWarmupCompleted = i18 % 128;
                        if (i18 % 2 != 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super String, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl3 = i4 != 0 ? null : settaggedaddrctrl;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-580412597, i6, -1, "im.toss.features.home.core.ui.widget.compose.HomeNavigationDefaults.Default (HomeNavigationDefaults.kt:26)");
                    }
                    tinyAppId tinyappidOnExtraCallbackWithResult = RVRpcException.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tinyappidOnExtraCallbackWithResult);
                    boolean z2 = (i6 & 896) == 256;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnNavigationEvent | z2)) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            HomeNavigationDefaults$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new HomeNavigationDefaults$.ExternalSyntheticLambda0(tinyappidOnExtraCallbackWithResult, function1);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                            obj = externalSyntheticLambda0;
                        }
                        setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super String, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl4 = settaggedaddrctrl3;
                        rpcV2.IAuthTabCallback(list, (Function1) obj, quirksExternalSyntheticBackport04, function2, ForwardingCameraControl.onExtraCallback(-989320082, true, new HomeNavigationDefaults$.ExternalSyntheticLambda1(settaggedaddrctrl3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 & 14) | 24576 | ((i6 >> 6) & 896) | ((i6 << 6) & 7168), 0);
                        boolean z3 = (i6 & 7168) == 2048;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new HomeNavigationDefaults$.ExternalSyntheticLambda2(function12);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        RVRpcException.IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1796738566, new Object[]{(Function1) objOnMinimized2, tinyappidOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, RNSScreenManagerDelegate.onNavigationEvent(), 1796738567);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i19 = onNavigationEvent + 119;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        settaggedaddrctrl2 = settaggedaddrctrl4;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    settaggedaddrctrl2 = settaggedaddrctrl;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new HomeNavigationDefaults$.ExternalSyntheticLambda3(this, list, function2, function1, function12, quirksExternalSyntheticBackport03, settaggedaddrctrl2, i, i2));
                    return;
                }
                return;
            }
            i3 |= 196608;
            i6 = i3;
            if ((74899 & i6) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        i6 = i3;
        if ((74899 & i6) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
