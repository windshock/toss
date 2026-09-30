package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3_PV6kUH1TrLoTV_rfx0bXULlpk {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ setBodyTextViewId $effectType;
        final /* synthetic */ MaxAdPlacer $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(MaxAdPlacer maxAdPlacer, setBodyTextViewId setbodytextviewid, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = maxAdPlacer;
            this.$effectType = setbodytextviewid;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$effectType, access13800Var);
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 23 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(this.$effectType);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ MaxNativeAdViewa $effectDirection;
        final /* synthetic */ MaxAdPlacer $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(MaxAdPlacer maxAdPlacer, MaxNativeAdViewa maxNativeAdViewa, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = maxAdPlacer;
            this.$effectDirection = maxNativeAdViewa;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$effectDirection, access13800Var);
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.IAuthTabCallback(this.$effectDirection);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $hapticEnabled;
        final /* synthetic */ MaxAdPlacer $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(MaxAdPlacer maxAdPlacer, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = maxAdPlacer;
            this.$hapticEnabled = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$hapticEnabled, access13800Var);
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                this.$state.onExtraCallback(this.$hapticEnabled);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 63;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 81 / 0;
                }
                return unit;
            }
            this.$state.onExtraCallback(this.$hapticEnabled);
            Unit unit2 = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final setStarRatingContentViewGroupId onExtraCallbackWithResult(@NotNull setBodyTextViewId setbodytextviewid, @NotNull MaxNativeAdViewa maxNativeAdViewa, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(setbodytextviewid, "");
        Intrinsics.checkNotNullParameter(maxNativeAdViewa, "");
        if ((i2 & 4) != 0) {
            z = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1997532360, i, -1, "im.toss.tds.compose.foundation.anim.rally.effect.wiggle.rememberWiggleState (WiggleState.kt:51)");
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new MaxAdPlacer(setbodytextviewid, maxNativeAdViewa, z);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        MaxAdPlacer maxAdPlacer = (MaxAdPlacer) objOnMinimized;
        int i6 = i & 14;
        if ((i6 ^ 6) > 4) {
            int i7 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setbodytextviewid)) {
                z2 = (i & 6) == 4;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z2) {
            int i9 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 25 / 0;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new onNavigationEvent(maxAdPlacer, setbodytextviewid, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
            } else if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(setbodytextviewid, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i6);
        boolean z4 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxNativeAdViewa)) || (i & 48) == 32;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z4) {
            int i11 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 68 / 0;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new onWarmupCompleted(maxAdPlacer, maxNativeAdViewa, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
            } else if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(maxNativeAdViewa, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        if (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
            z3 = true;
        } else if ((i & 384) == 256) {
            int i13 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z3 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized4 = new onExtraCallbackWithResult(maxAdPlacer, z, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i16 = 30 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        int i17 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 84 / 0;
        }
        return maxAdPlacer;
    }
}
