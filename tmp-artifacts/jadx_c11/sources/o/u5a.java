package o;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw;
import o.toPreviewOnlyRange;
import o.u5a;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5a {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final u5a onWarmupCompleted = new u5a();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(784754805, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = u5a.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            if (i3 != 0) {
                int i4 = 4 / 0;
            }
            int i5 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(467949641, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda4
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                unit = (Unit) u5a.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(num.intValue())}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1676327066, 1676327066);
                int i3 = 14 / 0;
            } else {
                unit = (Unit) u5a.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(num.intValue())}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1676327066, 1676327066);
            }
            int i4 = onWarmupCompleted + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });
    private static setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-659976772, false, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda5
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            int iIntValue = ((Integer) obj2).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
            int iIntValue2 = ((Integer) obj4).intValue();
            if (i3 != 0) {
                return u5a.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            }
            u5a.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
    });
    private static getBacktraceNote<r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(910419866, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda6
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw = (r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                u5a.onNavigationEvent(r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnNavigationEvent = u5a.onNavigationEvent(r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-2002321687, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda7
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            Unit unit = (Unit) u5a.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 860097300, -860097299);
            int i4 = onWarmupCompleted + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i6 | i);
        int i12 = (~(i | i6)) | (~(i7 | i9)) | i8;
        int i13 = i5 + i6 + i3 + (62936680 * i4) + ((-2032430997) * i2);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i5) + 797966336 + (1756943451 * i6) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i3) + ((-264241152) * i4) + ((-222822400) * i2) + (2040594432 * i14);
        int i16 = ((i5 * 1175661207) - 43826732) + (i6 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i3 * 1175660433) + (i4 * 1188219112) + (i2 * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(i, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(findresandmsg, v1Var);
        int i4 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        int i6 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 6 / 0;
        }
        int i6 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0);
        int i3 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i3 + 91;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 17;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i4 = i2 + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = asBinder + 91;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackDefault + 3;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(784754805, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$784754805.<anonymous> (BasicTdsBottomSheetV2.kt:94)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(784754805, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$784754805.<anonymous> (BasicTdsBottomSheetV2.kt:94)");
            }
            u7.IAuthTabCallback.onWarmupCompleted(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackStub + 25;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackDefault + 53;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 95;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackDefault + 113;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(467949641, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$467949641.<anonymous> (BasicTdsBottomSheetV2.kt:154)");
            }
            u7.IAuthTabCallback.onWarmupCompleted(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackStub + 81;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i11 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ v1 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = v1Var;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, access13800Var);
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 123;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$state;
                this.label = 1;
                if (v1.IAuthTabCallback(v1Var, null, this, 1, null) == objOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 23;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i5 = IAuthTabCallbackDefault + 29;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2073419399, i2, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$-659976772.<anonymous>.<anonymous> (BasicTdsBottomSheetV2.kt:461)");
            }
            w5aVar.onExtraCallbackWithResult("Item " + (i + 1), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStub + 7;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & 145) != 144) {
            int i5 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 63;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-659976772, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$-659976772.<anonymous> (BasicTdsBottomSheetV2.kt:461)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-2073419399, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i;
                    w5a w5aVar = (w5a) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i11 != 0) {
                        return u5a.onExtraCallback(i12, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    }
                    u5a.onExtraCallback(i12, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = IAuthTabCallbackDefault + 7;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, 55, (Function1) null, (Function1) null, IAuthTabCallback, 10, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, 20, (Function1) null, (Function1) null, IAuthTabCallback, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = IAuthTabCallbackStub + 13;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(910419866, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$910419866.<anonymous> (BasicTdsBottomSheetV2.kt:459)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 97;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnWarmupCompleted = u5a.onWarmupCompleted((AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
                        int i10 = onExtraCallbackWithResult + 83;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i7 = IAuthTabCallbackStub + 51;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 805306368, 511);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackDefault + 41;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackDefault + 83;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2002321687, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt.lambda$-2002321687.<anonymous> (BasicTdsBottomSheetV2.kt:438)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = IAuthTabCallbackStub + 39;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            final v1 v1VarOnExtraCallback = y1.onExtraCallback(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1023);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IAuthTabCallbackStub(), (toMetersPerSecond) null, 2, (Object) null), onextracallbackwithresult.onExtraCallback());
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i6 = IAuthTabCallbackDefault + 23;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1VarOnExtraCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            Unit unitOnExtraCallback;
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 91;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                unitOnExtraCallback = u5a.onExtraCallback(findresandmsg, v1VarOnExtraCallback);
                                int i10 = 13 / 0;
                            } else {
                                unitOnExtraCallback = u5a.onExtraCallback(findresandmsg, v1VarOnExtraCallback);
                            }
                            int i11 = onNavigationEvent + 97;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Show", null, null, null, null, null, (Function0) obj2, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                if (v1VarOnExtraCallback.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(190632401);
                    u6a.IAuthTabCallback(v1VarOnExtraCallback, null, 0L, 0L, null, null, null, null, null, null, 0L, null, null, onTransact, cameraCaptureResultEmptyCameraCaptureResult, 0, 3072, 8190);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(190936077);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1676327066, 1676327066);
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 860097300, -860097299);
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Function2) onExtraCallback(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1156965595, 1156965597);
    }
}
