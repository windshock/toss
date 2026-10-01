package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.containsJSONObjectContainingInt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class toStringObjectMap {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $depth;
        final /* synthetic */ valueExists $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(valueExists valueexists, int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = valueexists;
            this.$depth = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$depth, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 65 / 0;
            } else {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                this.$state.onNavigationEvent(this.$depth);
                return Unit.INSTANCE;
            }
            this.$state.onNavigationEvent(this.$depth);
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ float $maxFontScale;
        final /* synthetic */ valueExists $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(valueExists valueexists, float f, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = valueexists;
            this.$maxFontScale = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$maxFontScale, access13800Var);
            int i2 = IAuthTabCallback + 119;
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
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(this.$maxFontScale);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $animDelay;
        final /* synthetic */ valueExists $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(valueExists valueexists, int i, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = valueexists;
            this.$animDelay = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$animDelay, access13800Var);
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallbackWithResult(this.$animDelay);
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 105;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 35 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tryToStringMap onExtraCallbackWithResult(@Nullable Object obj, @Nullable containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, int i3, boolean z, float f, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5) {
        containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult2;
        int i6;
        boolean z2;
        int i7 = 2 % 2;
        Object obj2 = (i5 & 1) != 0 ? null : obj;
        if ((i5 & 2) != 0) {
            int i8 = onNavigationEvent + 45;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            onextracallbackwithresult2 = containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.onExtraCallback;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        int i10 = (i5 & 4) != 0 ? 0 : i;
        int i11 = (i5 & 8) != 0 ? 0 : i2;
        if ((i5 & 16) != 0) {
            int i12 = onNavigationEvent + 53;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            i6 = 0;
        } else {
            i6 = i3;
        }
        boolean z3 = (i5 & 32) != 0 ? false : z;
        float f2 = (i5 & 64) != 0 ? 2.0f : f;
        String str2 = (i5 & 128) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-201278423, i4, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.rememberTdsAgreementV4RowState (TdsAgreementV4RowState.kt:84)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new valueExists(f2, i10, i11, i6, onextracallbackwithresult2, z3, str2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        valueExists valueexists = (valueExists) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(valueexists);
        if (((i4 & 896) ^ 384) > 256) {
            int i14 = onNavigationEvent + 3;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i10)) {
                z2 = (i4 & 384) == 256;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onExtraCallbackWithResult(valueexists, i10, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            int i16 = onNavigationEvent + 115;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 6) & 14);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(valueexists);
        boolean z4 = (((3670016 & i4) ^ 1572864) > 1048576 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) || (i4 & 1572864) == 1048576;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent3 | z4) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new onNavigationEvent(valueexists, f2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f2), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 18) & 14);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(valueexists);
        boolean z5 = (((57344 & i4) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i6)) || (i4 & 24576) == 16384;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent4 | z5)) {
            int i18 = onNavigationEvent + 77;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new IAuthTabCallback(valueexists, i6, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i6), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 12) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i20 = onNavigationEvent + 11;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
        }
        return valueexists;
    }
}
