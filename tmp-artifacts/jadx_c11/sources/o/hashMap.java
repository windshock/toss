package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.addObjectIfExists;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hashMap {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ putBooleanIfValid $state;
        final /* synthetic */ addObjectIfExists $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(putBooleanIfValid putbooleanifvalid, addObjectIfExists addobjectifexists, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = putbooleanifvalid;
            this.$type = addobjectifexists;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$type, access13800Var);
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 != 0) {
                this.$state.onExtraCallback(this.$type);
                return Unit.INSTANCE;
            }
            this.$state.onExtraCallback(this.$type);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ putBooleanIfValid $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(putBooleanIfValid putbooleanifvalid, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = putbooleanifvalid;
            this.$checked = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$checked, access13800Var);
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 41;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                this.$state.onNavigationEvent(this.$checked);
                Unit unit = Unit.INSTANCE;
                int i7 = IAuthTabCallback + 47;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
            this.$state.onNavigationEvent(this.$checked);
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $forceChecked;
        final /* synthetic */ putBooleanIfValid $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(putBooleanIfValid putbooleanifvalid, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = putbooleanifvalid;
            this.$forceChecked = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$forceChecked, access13800Var);
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallbackWithResult(this.$forceChecked);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final toStringMap onWarmupCompleted(@Nullable Object obj, boolean z, boolean z2, @Nullable addObjectIfExists addobjectifexists, @Nullable String str, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object obj2;
        boolean z3;
        addObjectIfExists addobjectifexists2;
        String str2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
        float fIAuthTabCallback;
        float f;
        float f2;
        float f3;
        int i3;
        int i4 = 2 % 2;
        Object obj3 = null;
        if ((i2 & 1) != 0) {
            int i5 = IAuthTabCallback + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if ((i2 & 2) != 0) {
            int i7 = IAuthTabCallback + 39;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        if ((i2 & 8) != 0) {
            int i9 = onWarmupCompleted + 67;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            addobjectifexists2 = addObjectIfExists.onExtraCallback.onWarmupCompleted;
        } else {
            addobjectifexists2 = addobjectifexists;
        }
        if ((i2 & 16) != 0) {
            int i11 = IAuthTabCallback + 9;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            int i13 = onWarmupCompleted + 3;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
                f = 2.0f;
                f2 = 1.0f;
                f3 = 1.0f;
                i3 = 90;
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                i3 = 11;
            }
            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, f2, fIAuthTabCallback, f3, i3, (Object) null);
        } else {
            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-833849368, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.checkbox.rememberTdsAgreementV4CheckBoxState (TdsAgreementV4CheckBoxState.kt:107)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i14 = onWarmupCompleted + 27;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj3.hashCode();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                putBooleanIfValid putbooleanifvalid = new putBooleanIfValid(obj2, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, addobjectifexists2, z3, str2, z4);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(putbooleanifvalid);
                objOnMinimized = putbooleanifvalid;
            }
        }
        putBooleanIfValid putbooleanifvalid2 = (putBooleanIfValid) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putbooleanifvalid2);
        boolean z5 = (((i & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(addobjectifexists2)) || (i & 3072) == 2048;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z5) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onNavigationEvent(putbooleanifvalid2, addobjectifexists2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(addobjectifexists2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 9) & 14);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putbooleanifvalid2);
        boolean z6 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z3)) || (i & 48) == 32;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent3 | z6) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new IAuthTabCallback(putbooleanifvalid2, z3, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z3), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putbooleanifvalid2);
        boolean z7 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z4)) || (i & 384) == 256;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent4 | z7) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized4 = new onWarmupCompleted(putbooleanifvalid2, z4, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z4), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return putbooleanifvalid2;
    }
}
