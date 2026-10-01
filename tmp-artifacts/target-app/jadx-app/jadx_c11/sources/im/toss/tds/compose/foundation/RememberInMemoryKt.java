package im.toss.tds.compose.foundation;

import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.CharsKt;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.access6900;
import o.decrementVideoUsage;
import o.getAwbState;
import o.isInVideoUsage;
import o.isZslDisabledByByUserCaseConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RememberInMemoryKt {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ decrementVideoUsage onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, RememberInMemoryHolder rememberInMemoryHolder, String str, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, function1, rememberInMemoryHolder, str, isinvideousage);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return decrementvideousageIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(obj);
        int i3 = onNavigationEvent + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(obj);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(obj);
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b A[PHI: r5
      0x014b: PHI (r5v8 kotlin.jvm.functions.Function1<? super T, kotlin.Unit>) = 
      (r5v6 kotlin.jvm.functions.Function1<? super T, kotlin.Unit>)
      (r5v9 kotlin.jvm.functions.Function1<? super T, kotlin.Unit>)
     binds: [B:62:0x0149, B:58:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T IAuthTabCallback(@NotNull Object[] objArr, @Nullable String str, @Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super T, Unit> function12, @NotNull Function0<? extends T> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Function1<? super T, Unit> function13;
        Function1<? super T, Unit> function14;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        final Function1<? super T, Unit> function15;
        boolean z;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final String string = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.foundation.RememberInMemoryKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 43;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallbackWithResult = RememberInMemoryKt.onExtraCallbackWithResult(obj);
                        int i7 = onWarmupCompleted + 33;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 34 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function13 = (Function1) objOnMinimized;
        } else {
            function13 = function1;
        }
        if ((i2 & 8) != 0) {
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.foundation.RememberInMemoryKt$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 13;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            return RememberInMemoryKt.onWarmupCompleted(obj);
                        }
                        RememberInMemoryKt.onWarmupCompleted(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            function14 = (Function1) objOnMinimized2;
        } else {
            function14 = function12;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-389511157, i, -1, "im.toss.tds.compose.foundation.rememberInMemory (RememberInMemory.kt:24)");
        }
        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        int i4 = onWarmupCompleted + 99;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
            int i7 = i5 + 33;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                throw null;
            }
            defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
        Function1<? super T, Unit> function16 = function14;
        Function1<? super T, Unit> function17 = function13;
        final RememberInMemoryHolder rememberInMemoryHolder = (RememberInMemoryHolder) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(RememberInMemoryHolder.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        int iOnWarmupCompleted = getAwbState.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (string == null || string.length() == 0) {
            string = Integer.toString(iOnWarmupCompleted, CharsKt.IAuthTabCallback(36));
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        boolean zOnNavigationEvent3 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zOnNavigationEvent3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        }
        Object objOnWarmupCompleted = (T) cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent3) {
            int i8 = onNavigationEvent + 57;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (objOnWarmupCompleted == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                access6900<Object> access6900Var = rememberInMemoryHolder.IAuthTabCallback().get(string);
                if (access6900Var == null) {
                    access6900Var = new access6900<>();
                    rememberInMemoryHolder.IAuthTabCallback().put(string, access6900Var);
                }
                objOnWarmupCompleted = access6900Var.onWarmupCompleted();
                if (objOnWarmupCompleted == null) {
                    int i10 = onNavigationEvent + 55;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    objOnWarmupCompleted = null;
                }
                if (objOnWarmupCompleted != null) {
                    function16.invoke(objOnWarmupCompleted);
                } else {
                    objOnWarmupCompleted = function0.invoke();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnWarmupCompleted);
            }
        }
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(objOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
        if (((i & 896) ^ 384) > 256) {
            function15 = function17;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function15)) {
                z = true;
            }
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rememberInMemoryHolder);
            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(string);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent4 | z | zOnNavigationEvent | zOnNavigationEvent2) {
                int i12 = onWarmupCompleted + 125;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 32 / 0;
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.foundation.RememberInMemoryKt$$ExternalSyntheticLambda2
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i14 = 2 % 2;
                                int i15 = onNavigationEvent + 79;
                                onWarmupCompleted = i15 % 128;
                                int i16 = i15 % 2;
                                decrementVideoUsage decrementvideousageOnExtraCallback = RememberInMemoryKt.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function15, rememberInMemoryHolder, string, (isInVideoUsage) obj2);
                                int i17 = onNavigationEvent + 43;
                                onWarmupCompleted = i17 % 128;
                                if (i17 % 2 == 0) {
                                    int i18 = 34 / 0;
                                }
                                return decrementvideousageOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                } else if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(string, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return (T) objOnWarmupCompleted;
        }
        function15 = function17;
        if ((i & 384) != 256) {
            z = false;
        }
        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rememberInMemoryHolder);
        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(string);
        Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent4 | z | zOnNavigationEvent | zOnNavigationEvent2) {
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(string, (Function1) objOnMinimized32, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return (T) objOnWarmupCompleted;
    }

    private static final decrementVideoUsage IAuthTabCallback(final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final Function1 function1, final RememberInMemoryHolder rememberInMemoryHolder, final String str, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        decrementVideoUsage decrementvideousage = new decrementVideoUsage() { // from class: im.toss.tds.compose.foundation.RememberInMemoryKt$rememberInMemory$lambda$3$0$$inlined$onDispose$1
            private static int asBinder = 1;
            private static int onExtraCallbackWithResult;

            public void dispose() {
                int i2 = 2 % 2;
                Object objOnExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
                function1.invoke(objOnExtraCallbackWithResult);
                access6900<Object> access6900Var = rememberInMemoryHolder.IAuthTabCallback().get(str);
                if (access6900Var != null) {
                    int i3 = onExtraCallbackWithResult + 47;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    access6900Var.addFirst(objOnExtraCallbackWithResult);
                }
                int i5 = onExtraCallbackWithResult + 105;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        };
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return decrementvideousage;
    }
}
