package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.pin;
import o.y4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y4 {
    private static final accessisMonitoringp<pin> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda5
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            pin pinVar = (pin) y4.IAuthTabCallback(iIAuthTabCallback, -967587353, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 967587354, new Object[0]);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return pinVar;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = i6 | i7;
        int i9 = (~(i2 | i)) | i6;
        int i10 = ~i2;
        int i11 = (~(i | i2 | i6)) | (~(i7 | i10)) | (~((~i6) | i10));
        int i12 = i2 + i6 + i5 + (1609234610 * i4) + (1307081305 * i3);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i2) - 1772093440) + (1576585830 * i6) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i5) + ((-2101346304) * i4) + (23068672 * i3) + ((-2103967744) * i13);
        int i15 = (i2 * 273352028) + 245730370 + (i6 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i5 * 273352337) + (i4 * (-770635566)) + (i3 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        pin pinVarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            pinVarOnNavigationEvent = onNavigationEvent();
            int i3 = 93 / 0;
        } else {
            pinVarOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return pinVarOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, float f, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(j, f, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(addAppOpenAdapter addappopenadapter, long j, float f, getHumanReadableName gethumanreadablename, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(addappopenadapter, j, f, gethumanreadablename, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(addFixedPosition addfixedposition, MaxRecyclerAdaptera maxRecyclerAdaptera, y2 y2Var, y6 y6Var, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unit;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {addfixedposition, maxRecyclerAdaptera, y2Var, y6Var, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(iIAuthTabCallback, -1017246343, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1017246345, objArr);
            int i6 = 56 / 0;
        } else {
            Object[] objArr2 = {addfixedposition, maxRecyclerAdaptera, y2Var, y6Var, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(iIAuthTabCallback3, -1017246343, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback4, 1017246345, objArr2);
        }
        int i7 = onWarmupCompleted + 111;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(iIAuthTabCallback, 1163525948, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -1163525948, objArr);
            int i6 = 69 / 0;
        } else {
            int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(iIAuthTabCallback3, 1163525948, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback4, -1163525948, objArr);
        }
        int i7 = onExtraCallback + 13;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(addFixedPosition addfixedposition, MaxRecyclerAdaptera maxRecyclerAdaptera, y2 y2Var, long j, float f, addAppOpenAdapter addappopenadapter, userError usererror, y6 y6Var, pin pinVar, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(addfixedposition, maxRecyclerAdaptera, y2Var, j, f, addappopenadapter, usererror, y6Var, pinVar, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        addFixedPosition addfixedposition = (addFixedPosition) objArr[0];
        MaxRecyclerAdaptera maxRecyclerAdaptera = (MaxRecyclerAdaptera) objArr[1];
        y2 y2Var = (y2) objArr[2];
        y6 y6Var = (y6) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(addfixedposition, maxRecyclerAdaptera, y2Var, y6Var, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(addAppOpenAdapter addappopenadapter, long j, float f, getHumanReadableName gethumanreadablename, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        onNavigationEvent(addappopenadapter, j, f, gethumanreadablename, function2, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallback + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 49;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1634367620, i, -1, "im.toss.tds.compose.component.theme.TdsTheme.<anonymous>.<anonymous>.<anonymous> (TdsTheme.kt:140)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 109;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(long j, float f, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-121889718, i, -1, "im.toss.tds.compose.component.theme.TdsTheme.<anonymous>.<anonymous> (TdsTheme.kt:133)");
            }
            y1hExternalSyntheticLambda0.onExtraCallback(j, f, (setTargetFrameRate) null, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1634367620, true, new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnWarmupCompleted;
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        unitOnWarmupCompleted = y4.onWarmupCompleted(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i7 = 91 / 0;
                    } else {
                        unitOnWarmupCompleted = y4.onWarmupCompleted(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i8 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 0 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3120, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(addFixedPosition addfixedposition, MaxRecyclerAdaptera maxRecyclerAdaptera, y2 y2Var, final long j, final float f, addAppOpenAdapter addappopenadapter, userError usererror, y6 y6Var, pin pinVar, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 93;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = onWarmupCompleted + 117;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1625499766, i, -1, "im.toss.tds.compose.component.theme.TdsTheme.<anonymous> (TdsTheme.kt:112)");
            }
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{onAdRemoved.onWarmupCompleted().onExtraCallback(addfixedposition), MaxRecyclerAdapterAdPositionBehavior.onNavigationEvent().onExtraCallback(maxRecyclerAdaptera), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallbackWithResult().onExtraCallback(y2Var), r8lambdavDvOQKCAI27NlfrosV0HnBBjDc.onExtraCallbackWithResult().onExtraCallback(setByteOrder.onNavigationEvent(j)), r8lambdavDvOQKCAI27NlfrosV0HnBBjDc.onNavigationEvent().onExtraCallback(Float.valueOf(f)), addRewardedAdapter.onNavigationEvent().onExtraCallback(addappopenadapter), addAdapter.onWarmupCompleted().onExtraCallback(usererror), getPopupTheme.onExtraCallback().onExtraCallback(getSharedInstance.onExtraCallback(false, false, 0L, null, null, null, null, null, 255, null)), y3ExternalSyntheticLambda1.onWarmupCompleted().onExtraCallback(y6Var), IAuthTabCallback.onExtraCallback(pinVar)}, ForwardingCameraControl.onExtraCallback(-121889718, true, new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 57;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        y4.IAuthTabCallback(j, f, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = y4.IAuthTabCallback(j, f, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = IAuthTabCallback + 3;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 123;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable addFixedPosition addfixedposition, @Nullable MaxRecyclerAdaptera maxRecyclerAdaptera, @Nullable y2 y2Var, @Nullable y6 y6Var, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        addFixedPosition addfixedpositionIAuthTabCallback;
        int i3;
        y2 y2VarIAuthTabCallback;
        y6 y6Var2;
        final MaxRecyclerAdaptera maxRecyclerAdaptera2;
        final addFixedPosition addfixedposition2;
        final y2 y2Var2;
        final y6 y6Var3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        MaxRecyclerAdaptera maxRecyclerAdaptera3;
        addFixedPosition addfixedposition3;
        y2 y2Var3;
        y6 y6Var4;
        int i4;
        int i5;
        int i6;
        MaxRecyclerAdaptera maxRecyclerAdapteraOnWarmupCompleted = maxRecyclerAdaptera;
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 3;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1796449629);
        if ((i & 6) == 0) {
            int i10 = onExtraCallback + 81;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                addfixedpositionIAuthTabCallback = addfixedposition;
            } else {
                addfixedpositionIAuthTabCallback = addfixedposition;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(addfixedpositionIAuthTabCallback)) {
                    i6 = 4;
                }
                i3 = i6 | i;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            addfixedpositionIAuthTabCallback = addfixedposition;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                int i11 = onExtraCallback + 101;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 4 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(maxRecyclerAdapteraOnWarmupCompleted) ? 32 : 16;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(maxRecyclerAdapteraOnWarmupCompleted)) {
                }
                i3 |= i5;
            }
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                y2VarIAuthTabCallback = y2Var;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(y2VarIAuthTabCallback)) {
                    int i13 = onExtraCallback + 119;
                    onWarmupCompleted = i13 % 128;
                    i4 = i13 % 2 != 0 ? 11626 : 256;
                }
                i3 |= i4;
            } else {
                y2VarIAuthTabCallback = y2Var;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            y2VarIAuthTabCallback = y2Var;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                y6Var2 = y6Var;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(y6Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                int i15 = onWarmupCompleted + 121;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                maxRecyclerAdaptera2 = maxRecyclerAdapteraOnWarmupCompleted;
                addfixedposition2 = addfixedpositionIAuthTabCallback;
                y2Var2 = y2VarIAuthTabCallback;
                y6Var3 = y6Var2;
            } else {
                int i17 = onWarmupCompleted + 65;
                onExtraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        int i18 = onWarmupCompleted + 87;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = 48 / 0;
                            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 1) != 0) {
                                    int i20 = onWarmupCompleted + 111;
                                    onExtraCallback = i20 % 128;
                                    i3 = i20 % 2 == 0 ? i3 & 56 : i3 & (-15);
                                }
                                if ((i2 & 2) != 0) {
                                    int i21 = onWarmupCompleted + 51;
                                    onExtraCallback = i21 % 128;
                                    int i22 = i21 % 2;
                                    i3 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                            }
                            maxRecyclerAdaptera3 = maxRecyclerAdapteraOnWarmupCompleted;
                            addfixedposition3 = addfixedpositionIAuthTabCallback;
                            y2Var3 = y2VarIAuthTabCallback;
                            y6Var4 = y6Var2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1796449629, i3, -1, "im.toss.tds.compose.component.theme.TdsTheme (TdsTheme.kt:93)");
                            }
                            onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            final addAppOpenAdapter addappopenadapterOnNavigationEvent = addRewardedAdapter.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            final userError usererror = new userError(null, null, 3, null);
                            final pin pinVarOnNavigationEvent = readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult()));
                            final long jAudioAttributesImplBaseParcelizer = y2Var3.AudioAttributesImplBaseParcelizer();
                            final float f = 1.0f;
                            final addFixedPosition addfixedposition4 = addfixedposition3;
                            final MaxRecyclerAdaptera maxRecyclerAdaptera4 = maxRecyclerAdaptera3;
                            final y2 y2Var4 = y2Var3;
                            final y6 y6Var5 = y6Var4;
                            onNavigationEvent(addappopenadapterOnNavigationEvent, jAudioAttributesImplBaseParcelizer, 1.0f, y6Var4.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(-1625499766, true, new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda2
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i23 = 2 % 2;
                                    int i24 = onNavigationEvent + 125;
                                    onWarmupCompleted = i24 % 128;
                                    int i25 = i24 % 2;
                                    Unit unitOnExtraCallbackWithResult = y4.onExtraCallbackWithResult(addfixedposition4, maxRecyclerAdaptera4, y2Var4, jAudioAttributesImplBaseParcelizer, f, addappopenadapterOnNavigationEvent, usererror, y6Var5, pinVarOnNavigationEvent, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i26 = onWarmupCompleted + 67;
                                    onNavigationEvent = i26 % 128;
                                    int i27 = i26 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            addfixedposition2 = addfixedposition3;
                            maxRecyclerAdaptera2 = maxRecyclerAdaptera3;
                            y2Var2 = y2Var3;
                            y6Var3 = y6Var4;
                        } else {
                            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            }
                            maxRecyclerAdaptera3 = maxRecyclerAdapteraOnWarmupCompleted;
                            addfixedposition3 = addfixedpositionIAuthTabCallback;
                            y2Var3 = y2VarIAuthTabCallback;
                            y6Var4 = y6Var2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            final addAppOpenAdapter addappopenadapterOnNavigationEvent2 = addRewardedAdapter.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            final userError usererror2 = new userError(null, null, 3, null);
                            final pin pinVarOnNavigationEvent2 = readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult()));
                            final long jAudioAttributesImplBaseParcelizer2 = y2Var3.AudioAttributesImplBaseParcelizer();
                            final float f2 = 1.0f;
                            final addFixedPosition addfixedposition42 = addfixedposition3;
                            final MaxRecyclerAdaptera maxRecyclerAdaptera42 = maxRecyclerAdaptera3;
                            final y2 y2Var42 = y2Var3;
                            final y6 y6Var52 = y6Var4;
                            onNavigationEvent(addappopenadapterOnNavigationEvent2, jAudioAttributesImplBaseParcelizer2, 1.0f, y6Var4.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(-1625499766, true, new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda2
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i23 = 2 % 2;
                                    int i24 = onNavigationEvent + 125;
                                    onWarmupCompleted = i24 % 128;
                                    int i25 = i24 % 2;
                                    Unit unitOnExtraCallbackWithResult = y4.onExtraCallbackWithResult(addfixedposition42, maxRecyclerAdaptera42, y2Var42, jAudioAttributesImplBaseParcelizer2, f2, addappopenadapterOnNavigationEvent2, usererror2, y6Var52, pinVarOnNavigationEvent2, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i26 = onWarmupCompleted + 67;
                                    onNavigationEvent = i26 % 128;
                                    int i27 = i26 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            addfixedposition2 = addfixedposition3;
                            maxRecyclerAdaptera2 = maxRecyclerAdaptera3;
                            y2Var2 = y2Var3;
                            y6Var3 = y6Var4;
                        }
                    }
                }
                if ((i2 & 1) != 0) {
                    addfixedpositionIAuthTabCallback = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? onAdRemoved.IAuthTabCallback() : onAdRemoved.onExtraCallbackWithResult();
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    maxRecyclerAdapteraOnWarmupCompleted = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? MaxRecyclerAdapterAdPositionBehavior.onWarmupCompleted() : MaxRecyclerAdapterAdPositionBehavior.onExtraCallback();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    y2VarIAuthTabCallback = r8lambdaKbiQLvvJp0FUVYuoRWERrPDqVDY.IAuthTabCallback(addfixedpositionIAuthTabCallback);
                    i3 &= -897;
                }
                if (i14 != 0) {
                    maxRecyclerAdaptera3 = maxRecyclerAdapteraOnWarmupCompleted;
                    addfixedposition3 = addfixedpositionIAuthTabCallback;
                    y2Var3 = y2VarIAuthTabCallback;
                    y6Var4 = new y6(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
                } else {
                    maxRecyclerAdaptera3 = maxRecyclerAdapteraOnWarmupCompleted;
                    addfixedposition3 = addfixedpositionIAuthTabCallback;
                    y2Var3 = y2VarIAuthTabCallback;
                    y6Var4 = y6Var2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                final addAppOpenAdapter addappopenadapterOnNavigationEvent22 = addRewardedAdapter.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                final userError usererror22 = new userError(null, null, 3, null);
                final pin pinVarOnNavigationEvent22 = readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult()));
                final long jAudioAttributesImplBaseParcelizer22 = y2Var3.AudioAttributesImplBaseParcelizer();
                final float f22 = 1.0f;
                final addFixedPosition addfixedposition422 = addfixedposition3;
                final MaxRecyclerAdaptera maxRecyclerAdaptera422 = maxRecyclerAdaptera3;
                final y2 y2Var422 = y2Var3;
                final y6 y6Var522 = y6Var4;
                onNavigationEvent(addappopenadapterOnNavigationEvent22, jAudioAttributesImplBaseParcelizer22, 1.0f, y6Var4.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(-1625499766, true, new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i23 = 2 % 2;
                        int i24 = onNavigationEvent + 125;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnExtraCallbackWithResult = y4.onExtraCallbackWithResult(addfixedposition422, maxRecyclerAdaptera422, y2Var422, jAudioAttributesImplBaseParcelizer22, f22, addappopenadapterOnNavigationEvent22, usererror22, y6Var522, pinVarOnNavigationEvent22, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i26 = onWarmupCompleted + 67;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                addfixedposition2 = addfixedposition3;
                maxRecyclerAdaptera2 = maxRecyclerAdaptera3;
                y2Var2 = y2Var3;
                y6Var3 = y6Var4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i23 = 2 % 2;
                        int i24 = onExtraCallback + 19;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnExtraCallback = y4.onExtraCallback(addfixedposition2, maxRecyclerAdaptera2, y2Var2, y6Var3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i26 = onExtraCallbackWithResult + 103;
                        onExtraCallback = i26 % 128;
                        if (i26 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                });
                int i23 = onExtraCallback + 83;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            return;
        }
        i3 |= 3072;
        y6Var2 = y6Var;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1407564106);
        boolean zAreEqual = true;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1))) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 73;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1407564106, i, -1, "im.toss.tds.compose.component.theme.InspectionModeContextWorkaround (TdsTheme.kt:152)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1407564106, i, -1, "im.toss.tds.compose.component.theme.InspectionModeContextWorkaround (TdsTheme.kt:152)");
            }
            if (!(!((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(createBitmapFromJpegImage.onExtraCallbackWithResult())).booleanValue())) {
                int i4 = onExtraCallback + 49;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(976639902);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-245589773);
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                zAreEqual = Intrinsics.areEqual(activityIAuthTabCallback != null ? activityIAuthTabCallback.getClass().getSimpleName() : null, "PreviewActivity");
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i6 = onWarmupCompleted;
            int i7 = i6 + 47;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (zAreEqual) {
                int i9 = i6 + 49;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(976741686);
                    contentType.onExtraCallback.onWarmupCompleted();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(976741686);
                if (contentType.onExtraCallback.onWarmupCompleted() == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(976787628);
                    r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw r8lambdaxwd13t63ebu9obttqav7fjqdjmw = r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw.onNavigationEvent;
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    Locale locale = Locale.KOREA;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    r8lambdaxwd13t63ebu9obttqav7fjqdjmw.onExtraCallbackWithResult(new AppLovinPostbackListener(context, locale, deprecated_maxAgeSeconds.Companion.onExtraCallbackWithResult(), AppLovinBidTokenCollectionListener.onWarmupCompleted(accessinit.Companion), clampToInt.Companion.onExtraCallback(), isUserConsentSet.Companion.IAuthTabCallback(), isDoNotSellSet.Companion.onExtraCallbackWithResult(), null, null, null, 896, null));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(977291192);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(977297144);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i10 = onWarmupCompleted + 43;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 105;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = y4.onExtraCallbackWithResult(i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onNavigationEvent + 41;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[PHI: r0
      0x004c: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r0
      0x002c: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final addAppOpenAdapter addappopenadapter, final long j, final float f, final getHumanReadableName gethumanreadablename, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 125;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(738479417);
            if ((i & 62) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(addappopenadapter))) {
                    int i8 = onWarmupCompleted + 97;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    int i10 = onWarmupCompleted + 105;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(738479417);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i12 = onExtraCallback + 103;
                onWarmupCompleted = i12 % 128;
                i5 = i12 % 2 != 0 ? 10754 : 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2))) {
                int i13 = onWarmupCompleted + 63;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            int i15 = onExtraCallback + 55;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 75 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(738479417, i3, -1, "im.toss.tds.compose.component.theme.MaterialAdapter (TdsTheme.kt:185)");
                }
                long jOnNavigationEvent = addappopenadapter.onNavigationEvent();
                float fOnWarmupCompleted = setByteOrder.onWarmupCompleted(addappopenadapter.onNavigationEvent());
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{RippleKt.onExtraCallback().onExtraCallback(new RippleConfiguration(jOnNavigationEvent, new RippleAlpha(fOnWarmupCompleted, fOnWarmupCompleted, fOnWarmupCompleted, fOnWarmupCompleted), (DefaultConstructorMarker) null)), convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(j)), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(f)), PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(gethumanreadablename)}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i3 >> 9) & 112));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onWarmupCompleted + 79;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                long jOnNavigationEvent2 = addappopenadapter.onNavigationEvent();
                float fOnWarmupCompleted2 = setByteOrder.onWarmupCompleted(addappopenadapter.onNavigationEvent());
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{RippleKt.onExtraCallback().onExtraCallback(new RippleConfiguration(jOnNavigationEvent2, new RippleAlpha(fOnWarmupCompleted2, fOnWarmupCompleted2, fOnWarmupCompleted2, fOnWarmupCompleted2), (DefaultConstructorMarker) null)), convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(j)), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(f)), PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(gethumanreadablename)}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i3 >> 9) & 112));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.TdsThemeKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i20 % 128;
                    if (i20 % 2 == 0) {
                        return y4.onExtraCallback(addappopenadapter, j, f, gethumanreadablename, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    y4.onExtraCallback(addappopenadapter, j, f, gethumanreadablename, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
        }
    }

    static {
        int i = onNavigationEvent + 101;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final pin onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        pin pinVar = pin.Normal;
        if (i3 != 0) {
            return pinVar;
        }
        throw null;
    }

    public static /* synthetic */ pin IAuthTabCallback() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (pin) IAuthTabCallback(iIAuthTabCallback, -967587353, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 967587354, new Object[0]);
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 1163525948, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -1163525948, objArr);
    }

    private static final Unit onExtraCallbackWithResult(addFixedPosition addfixedposition, MaxRecyclerAdaptera maxRecyclerAdaptera, y2 y2Var, y6 y6Var, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {addfixedposition, maxRecyclerAdaptera, y2Var, y6Var, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -1017246343, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1017246345, objArr);
    }
}
