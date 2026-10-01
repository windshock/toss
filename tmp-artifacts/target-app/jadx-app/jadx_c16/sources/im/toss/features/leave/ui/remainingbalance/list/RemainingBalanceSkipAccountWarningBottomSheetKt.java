package im.toss.features.leave.ui.remainingbalance.list;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.horcrux.svg.SvgPackage;
import im.toss.features.leave.R;
import im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceSkipAccountWarningBottomSheetKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.ForwardingCameraControl;
import o.QuirksExternalSyntheticBackport0;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.getBacktraceNote;
import o.needWaitSetupWhenGet;
import o.setCallToAction;
import o.setContentInsetsRelative;
import o.u4;
import o.u6a;
import o.v1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceSkipAccountWarningBottomSheetKt {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(v1 v1Var, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {v1Var, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
        if (i5 == 0) {
            return (Unit) onWarmupCompleted(objArr, 1561460212, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1561460211);
        }
        int i6 = 30 / 0;
        return (Unit) onWarmupCompleted(objArr, 1561460212, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1561460211);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        onNavigationEvent(v1Var, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function1, str);
        }
        IAuthTabCallback(function1, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i6 | i3);
        int i12 = (~(i3 | i6)) | (~(i7 | i9)) | i8;
        int i13 = i6 + i + i2 + ((-1422066268) * i5) + ((-2108786386) * i4);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i6) + 967573504 + (322476998 * i) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i5) + (1722810368 * i4) + (518782976 * i14);
        int i16 = (i6 * 793895740) + 1353643607 + (i * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i2 * 793896001) + (i5 * 692483748) + (i4 * (-1016611666)) + (i14 * 166461440);
        if (i15 + (i16 * i16 * 1997799424) == 1) {
            return onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        String str = (String) objArr[1];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback + 121;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i20 = IAuthTabCallback + 113;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(str, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, str}, 374380181, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -374380181);
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i8 = IAuthTabCallback + 73;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
        } else {
            int i9 = IAuthTabCallback + 105;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 % 3;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2018256344, i2, -1, "im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceSkipAccountWarningBottomSheet.<anonymous> (RemainingBalanceSkipAccountWarningBottomSheet.kt:31)");
            }
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i11 = onWarmupCompleted + 53;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda4(function1, str);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj = externalSyntheticLambda4;
                }
                u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i7 = IAuthTabCallback + 67;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 4;
            } else {
                int i8 = IAuthTabCallback + 23;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i10 = onWarmupCompleted + 93;
            IAuthTabCallback = i10 % 128;
            z = i10 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 79;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1831173641, i2, -1, "im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceSkipAccountWarningBottomSheet.<anonymous> (RemainingBalanceSkipAccountWarningBottomSheet.kt:41)");
            }
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i13 = onWarmupCompleted + 91;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 25 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda0(function1, str);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                        obj = externalSyntheticLambda0;
                    }
                    u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i15 = onWarmupCompleted + 89;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull v1 v1Var, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super String, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(v1Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1423340903);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var)) {
                i4 = 4;
            } else {
                int i6 = onWarmupCompleted + 87;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true) ? 32 : 16;
            int i8 = onWarmupCompleted + 5;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 384) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                i3 = 128;
            } else {
                int i10 = IAuthTabCallback + 11;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                i3 = 256;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((i12 & 147) != 146) {
            int i13 = onWarmupCompleted + 123;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = IAuthTabCallback + 21;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1423340903, i12, -1, "im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceSkipAccountWarningBottomSheet (RemainingBalanceSkipAccountWarningBottomSheet.kt:20)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1423340903, i12, -1, "im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceSkipAccountWarningBottomSheet (RemainingBalanceSkipAccountWarningBottomSheet.kt:20)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_confirm, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_close, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            needWaitSetupWhenGet needwaitsetupwhenget = needWaitSetupWhenGet.IAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            u6a.IAuthTabCallback(v1Var, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, needwaitsetupwhenget.onExtraCallbackWithResult(), ForwardingCameraControl.onExtraCallback(2018256344, true, new RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda1(strOnExtraCallback, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-1831173641, true, new RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda2(strOnExtraCallback2, function12), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, needwaitsetupwhenget.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult2, (i12 & 14) | 14352384, 3072, 7966);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new RemainingBalanceSkipAccountWarningBottomSheetKt$.ExternalSyntheticLambda3(v1Var, function1, function12, i));
        }
    }

    private static final Unit onExtraCallback(Function1 function1, String str) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(new Object[]{function1, str}, 374380181, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -374380181);
    }

    private static final Unit onWarmupCompleted(v1 v1Var, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {v1Var, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(objArr, 1561460212, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1561460211);
    }
}
