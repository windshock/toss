package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ImageViewUtilsExternalSyntheticLambda2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getMemoryMappingsOrBuilder<setAndDownscaleImageUri> $itemStates;
        final /* synthetic */ ImageViewUtilsExternalSyntheticLambda0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(ImageViewUtilsExternalSyntheticLambda0 imageViewUtilsExternalSyntheticLambda0, getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = imageViewUtilsExternalSyntheticLambda0;
            this.$itemStates = getmemorymappingsorbuilder;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$itemStates, access13800Var);
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallback(this.$itemStates);
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ boolean $showGradientBar;
        final /* synthetic */ ImageViewUtilsExternalSyntheticLambda0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(ImageViewUtilsExternalSyntheticLambda0 imageViewUtilsExternalSyntheticLambda0, boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = imageViewUtilsExternalSyntheticLambda0;
            this.$showGradientBar = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$showGradientBar, access13800Var);
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallbackWithResult(this.$showGradientBar);
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 119;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImageViewUtilsExternalSyntheticLambda1 onWarmupCompleted(@Nullable Object obj, boolean z, @Nullable getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z2;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            obj = null;
        }
        boolean z3 = false;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            getmemorymappingsorbuilder = getOpenFdsCount.onExtraCallbackWithResult();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1718229151, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.rememberTdsAgreementV4GroupState (TdsAgreementV4GroupState.kt:51)");
                int i6 = 75 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1718229151, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.rememberTdsAgreementV4GroupState (TdsAgreementV4GroupState.kt:51)");
            }
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new ImageViewUtilsExternalSyntheticLambda0(z, getmemorymappingsorbuilder, obj);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        ImageViewUtilsExternalSyntheticLambda0 imageViewUtilsExternalSyntheticLambda0 = (ImageViewUtilsExternalSyntheticLambda0) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtilsExternalSyntheticLambda0);
        if (((i & 896) ^ 384) > 256) {
            int i7 = onWarmupCompleted + 121;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getmemorymappingsorbuilder);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getmemorymappingsorbuilder)) {
                z2 = (i & 384) == 256;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onWarmupCompleted(imageViewUtilsExternalSyntheticLambda0, getmemorymappingsorbuilder, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(getmemorymappingsorbuilder, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtilsExternalSyntheticLambda0);
        if (((i & 112) ^ 48) > 32) {
            int i8 = onWarmupCompleted + 39;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 21 / 0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z))) {
                    z3 = true;
                } else if ((i & 48) == 32) {
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
            }
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent3 | z3)) {
            int i10 = onWarmupCompleted + 103;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new onNavigationEvent(imageViewUtilsExternalSyntheticLambda0, z, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onWarmupCompleted + 81;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i13 != 0) {
                throw null;
            }
        }
        return imageViewUtilsExternalSyntheticLambda0;
    }
}
