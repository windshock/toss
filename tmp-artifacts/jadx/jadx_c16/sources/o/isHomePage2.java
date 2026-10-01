package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.leave.R;
import im.toss.features.leave.ui.last.LeaveLastScreenKt$;
import im.toss.features.leave.ui.last.LeaveLastViewModel;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.hitPageLevelWhiteList;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isHomePage2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted = {64976, 64980, 64978, 64960, 64924, 64988, 64961, 64990, 64902, 64926, 64982, 64963, 64985, 64898, 64896, 65013, 64986, 64987, 64925, 64905, 64967, 64966, 64989, 64906, 64983};
    private static char onExtraCallback = 51244;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i5 | i6);
        int i13 = i5 + i6 + i4 + ((-2027816600) * i3) + ((-1234684791) * i2);
        int i14 = i13 * i13;
        int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i6) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i4) + (811597824 * i3) + (1100742656 * i2) + (1751056384 * i14);
        int i16 = ((i5 * 572746074) - 905264446) + (i6 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i4 * 572745585) + (i3 * 982511336) + (i2 * (-774025351)) + (i14 * 1257177088);
        if (i15 + (i16 * i16 * 1874919424) == 1) {
            return onWarmupCompleted(objArr);
        }
        getSegmentCollection getsegmentcollection = (getSegmentCollection) objArr[0];
        LeaveLastViewModel leaveLastViewModel = (LeaveLastViewModel) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i17 = 2 % 2;
        int i18 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i18 % 128;
        onExtraCallbackWithResult(getsegmentcollection, leaveLastViewModel, function0, function02, function1, cameraCaptureResultEmptyCameraCaptureResult, i18 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSegmentCollection getsegmentcollection, LeaveLastViewModel leaveLastViewModel, Function0 function0, Function0 function02, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {getsegmentcollection, leaveLastViewModel, function0, function02, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -1809640700, objArr, 1809640700);
        int i7 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ hitPageLevelWhiteList onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        hitPageLevelWhiteList hitpagelevelwhitelistOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return hitpagelevelwhitelistOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(function0);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i3 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(hitPageLevelWhiteList hitpagelevelwhitelist, LeaveLastViewModel leaveLastViewModel, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(hitpagelevelwhitelist, leaveLastViewModel, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        hitPageLevelWhiteList hitpagelevelwhitelist = (hitPageLevelWhiteList) objArr[0];
        LeaveLastViewModel leaveLastViewModel = (LeaveLastViewModel) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(hitpagelevelwhitelist, leaveLastViewModel, function0);
        }
        onExtraCallbackWithResult(hitpagelevelwhitelist, leaveLastViewModel, function0);
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1<hitPageLevelWhiteList, Unit> $onUiState;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<hitPageLevelWhiteList> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function1<? super hitPageLevelWhiteList, Unit> function1, CameraPresenceProviderExternalSyntheticLambda6<? extends hitPageLevelWhiteList> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$onUiState = function1;
            this.$uiState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$onUiState, this.$uiState$delegate, access13800Var);
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$onUiState.invoke(isHomePage2.onExtraCallbackWithResult(this.$uiState$delegate));
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onExtraCallback(Object obj) {
            super(0, obj, LeaveLastViewModel.class, "finalLogout", "finalLogout()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ((LeaveLastViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            ((LeaveLastViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(hitPageLevelWhiteList hitpagelevelwhitelist, LeaveLastViewModel leaveLastViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        hitPageLevelWhiteList.onNavigationEvent onnavigationevent = (hitPageLevelWhiteList.onNavigationEvent) hitpagelevelwhitelist;
        if (i2 % 2 != 0) {
            onnavigationevent.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        if (onnavigationevent.onNavigationEvent()) {
            int i3 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {leaveLastViewModel};
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            if (i4 == 0) {
                int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                LeaveLastViewModel.IAuthTabCallback(objArr, iOnExtraCallbackWithResult, 794671975, -794671974, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            LeaveLastViewModel.IAuthTabCallback(objArr, iOnExtraCallbackWithResult, 794671975, -794671974, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3);
            int i5 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(hitPageLevelWhiteList hitpagelevelwhitelist, LeaveLastViewModel leaveLastViewModel, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onNavigationEvent + 61;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 79;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i10 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(211915442, i2, -1, "im.toss.features.leave.ui.last.LeaveLastScreen.<anonymous> (LeaveLastScreen.kt:65)");
                int i11 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            }
            if (((hitPageLevelWhiteList.onNavigationEvent) hitpagelevelwhitelist).onNavigationEvent()) {
                int i13 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1787279485);
                    i3 = R.string.leave_error_button;
                    int i14 = 54 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1787279485);
                    i3 = R.string.leave_error_button;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1787281049);
                i3 = R.string.leave_confirm2;
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(hitpagelevelwhitelist);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveLastViewModel);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback | zOnNavigationEvent2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LeaveLastScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new LeaveLastScreenKt$.ExternalSyntheticLambda4(hitpagelevelwhitelist, leaveLastViewModel, function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj = externalSyntheticLambda4;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i16 = 48 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i6 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2 == 0 ? 2 : 4;
                i2 = i | i7;
                int i8 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i10 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i10 % 128;
            z = i10 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1846603439, i2, -1, "im.toss.features.leave.ui.last.LeaveLastScreen.<anonymous> (LeaveLastScreen.kt:76)");
                int i11 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent) {
                LeaveLastScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new LeaveLastScreenKt$.ExternalSyntheticLambda3(function0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                obj = externalSyntheticLambda3;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                int i15 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull getSegmentCollection getsegmentcollection, @Nullable LeaveLastViewModel leaveLastViewModel, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super hitPageLevelWhiteList, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        LeaveLastViewModel leaveLastViewModel2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        LeaveLastViewModel leaveLastViewModel3;
        int i4;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        access13800 access13800Var;
        boolean z;
        boolean zOnNavigationEvent;
        Object objOnMinimized2;
        hitPageLevelWhiteList.onNavigationEvent onnavigationeventOnExtraCallback;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        boolean z2;
        LeaveLastViewModel leaveLastViewModel4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(getsegmentcollection, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2070750707);
        if ((i & 6) == 0) {
            int i7 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getsegmentcollection) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i9 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if ((i2 & 2) == 0) {
                leaveLastViewModel2 = leaveLastViewModel;
                int i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveLastViewModel2) ? 32 : 16;
                i3 |= i11;
            } else {
                leaveLastViewModel2 = leaveLastViewModel;
            }
            i3 |= i11;
        } else {
            leaveLastViewModel2 = leaveLastViewModel;
        }
        if ((i & 384) == 0) {
            int i12 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 53 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
        }
        int i14 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 9363) != 9362, i14 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 2) != 0) {
                    int i15 = onNavigationEvent + 83;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1890788296);
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                        int i17 = onExtraCallbackWithResult + 101;
                        onNavigationEvent = i17 % 128;
                        if (i17 % 2 != 0) {
                            textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                            throw null;
                        }
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(LeaveLastViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                    leaveLastViewModel3 = (LeaveLastViewModel) viewModelIAuthTabCallback;
                    i4 = i14 & (-113);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    leaveLastViewModel3 = leaveLastViewModel2;
                    i4 = i14;
                }
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = onExtraCallbackWithResult + 107;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2070750707, i4, -1, "im.toss.features.leave.ui.last.LeaveLastScreen (LeaveLastScreen.kt:24)");
                }
                int i20 = i4;
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(leaveLastViewModel3.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 7);
                Unit unit = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallback(leaveLastViewModel3);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                if (!zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    access13800Var = null;
                    objOnMinimized = new onExtraCallbackWithResult(leaveLastViewModel3, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized);
                } else {
                    access13800Var = null;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult4, 6);
                hitPageLevelWhiteList hitpagelevelwhitelistOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                z = (i20 & 57344) != 16384;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                if (!(z | zOnNavigationEvent) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new IAuthTabCallback(function1, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, access13800Var);
                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(hitpagelevelwhitelistOnExtraCallback, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                onnavigationeventOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                if (!(onnavigationeventOnExtraCallback instanceof hitPageLevelWhiteList.onExtraCallbackWithResult)) {
                    int i21 = onNavigationEvent + 75;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1119859710);
                    deleteFileIfExpired.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult4, 0);
                    cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                    leaveLastViewModel4 = leaveLastViewModel3;
                    z2 = true;
                } else if (onnavigationeventOnExtraCallback instanceof hitPageLevelWhiteList.onWarmupCompleted) {
                    cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1119953485);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallback(leaveLastViewModel3);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                    if (!(!zOnExtraCallback2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new onExtraCallback(leaveLastViewModel3);
                        cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized3);
                    }
                    getSnapshotFilePathWithVersion.IAuthTabCallback(getsegmentcollection, (access5300) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult4, i20 & 14);
                    cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                    z2 = true;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                    leaveLastViewModel4 = leaveLastViewModel3;
                } else {
                    if (!(onnavigationeventOnExtraCallback instanceof hitPageLevelWhiteList.onNavigationEvent)) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1421597431);
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    int i23 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1120206321);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, access13800Var);
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_title, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                    Object[] objArr = new Object[1];
                    a(new char[]{15, 22, 21, '\n', 4, 18, 13764, 13764, 0, 23, 0, 22, 15, 1, 15, 23, '\b', 0, '\b', 23, 17, 6, '\t', 19, 4, 14, '\f', 5, 7, '\n', 18, 1, 1, 24, '\n', 18, '\r', 18, 24, '\b', 5, 11, 21, 22, 7, 21, 16, '\r', 21, 2}, (byte) (15 - TextUtils.getOffsetAfter("", 0)), 50 - Color.argb(0, 0, 0, 0), objArr);
                    verifyClientState verifyclientstateOnExtraCallback = deprecated_authenticator.onExtraCallback(((String) objArr[0]).intern());
                    String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_description, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                    if (onnavigationeventOnExtraCallback.onNavigationEvent()) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1121085822);
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1846603439, true, new LeaveLastScreenKt$.ExternalSyntheticLambda0(function0), cameraCaptureResultEmptyCameraCaptureResult4, 54);
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1121569514);
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                    }
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(211915442, true, new LeaveLastScreenKt$.ExternalSyntheticLambda1(onnavigationeventOnExtraCallback, leaveLastViewModel3, function02), cameraCaptureResultEmptyCameraCaptureResult4, 54);
                    z2 = true;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                    leaveLastViewModel4 = leaveLastViewModel3;
                    y1h.onNavigationEvent(verifyclientstateOnExtraCallback, strOnExtraCallback, strOnExtraCallback2, quirksExternalSyntheticBackport0OnNavigationEvent, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, encoderProfilesProxyVideoProfileProxy, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult2, 27648, 448);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder() == z2) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                leaveLastViewModel2 = leaveLastViewModel4;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 2) != 0) {
                    int i25 = onExtraCallbackWithResult + 105;
                    onNavigationEvent = i25 % 128;
                    i4 = i25 % 2 != 0 ? i14 & 50 : i14 & (-113);
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    leaveLastViewModel3 = leaveLastViewModel2;
                }
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                int i202 = i4;
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(leaveLastViewModel3.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 7);
                Unit unit2 = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallback(leaveLastViewModel3);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                if (zOnExtraCallback) {
                    access13800Var = null;
                    objOnMinimized = new onExtraCallbackWithResult(leaveLastViewModel3, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult4, 6);
                    hitPageLevelWhiteList hitpagelevelwhitelistOnExtraCallback2 = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    if ((i202 & 57344) != 16384) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                    if (!(z | zOnNavigationEvent)) {
                        objOnMinimized2 = new IAuthTabCallback(function1, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, access13800Var);
                        cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized2);
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(hitpagelevelwhitelistOnExtraCallback2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                        onnavigationeventOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        if (!(onnavigationeventOnExtraCallback instanceof hitPageLevelWhiteList.onExtraCallbackWithResult)) {
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder() == z2) {
                        }
                        leaveLastViewModel2 = leaveLastViewModel4;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeaveLastScreenKt$.ExternalSyntheticLambda2(getsegmentcollection, leaveLastViewModel2, function0, function02, function1, i, i2));
        }
    }

    private static final hitPageLevelWhiteList onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends hitPageLevelWhiteList> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hitPageLevelWhiteList hitpagelevelwhitelist = (hitPageLevelWhiteList) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return hitpagelevelwhitelist;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (Process.myTid() >> 22) + 26, TextUtils.getCapsMode("", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getTapTimeout() >> 16) + 26, View.resolveSizeAndState(0, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $10 + 91;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 99;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.alpha(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73, TextUtils.indexOf("", "", 0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), AndroidCharacter.getMirror('0') - 18, (Process.myPid() >> 22) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i12 = $11 + 55;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onNavigationEvent(hitPageLevelWhiteList hitpagelevelwhitelist, LeaveLastViewModel leaveLastViewModel, Function0 function0) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 543096699, new Object[]{hitpagelevelwhitelist, leaveLastViewModel, function0}, -543096698);
    }

    private static final Unit onWarmupCompleted(getSegmentCollection getsegmentcollection, LeaveLastViewModel leaveLastViewModel, Function0 function0, Function0 function02, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {getsegmentcollection, leaveLastViewModel, function0, function02, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -1809640700, objArr, 1809640700);
    }
}
