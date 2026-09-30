package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaitkxxTyAPHmEU5WnQXvTDjIGs {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $isRoot;
        final /* synthetic */ ImageViewUtils $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(ImageViewUtils imageViewUtils, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = imageViewUtils;
            this.$isRoot = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$isRoot, access13800Var);
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objIAuthTabCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                this.$state.onNavigationEvent(this.$isRoot);
                return Unit.INSTANCE;
            }
            this.$state.onNavigationEvent(this.$isRoot);
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ ImageViewUtils $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(ImageViewUtils imageViewUtils, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = imageViewUtils;
            this.$expanded = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$expanded, access13800Var);
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                this.$state.IAuthTabCallback(this.$expanded);
                unit = Unit.INSTANCE;
                int i7 = 64 / 0;
            } else {
                this.$state.IAuthTabCallback(this.$expanded);
                unit = Unit.INSTANCE;
            }
            int i8 = onWarmupCompleted + 49;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM onWarmupCompleted(@Nullable Object obj, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z3;
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        boolean z4 = true;
        if ((i2 & 2) != 0) {
            int i6 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i6 % 128;
            z = i6 % 2 == 0;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-453978073, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.rememberTdsAgreementV4ExpandableAgreementState (TdsAgreementV4ExpandableAgreementState.kt:47)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new ImageViewUtils(z, z2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        ImageViewUtils imageViewUtils = (ImageViewUtils) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtils);
        if (((i & 112) ^ 48) > 32) {
            int i9 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
                z3 = (i & 48) == 32;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent2 | z3)) {
            int i11 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(imageViewUtils, z, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtils);
        if (((i & 896) ^ 384) > 256) {
            int i12 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z2)) {
                if ((i & 384) != 256) {
                    z4 = false;
                }
            }
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent3 | z4) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new onExtraCallback(imageViewUtils, z2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z2), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i14 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 89 / 0;
        }
        return imageViewUtils;
    }
}
