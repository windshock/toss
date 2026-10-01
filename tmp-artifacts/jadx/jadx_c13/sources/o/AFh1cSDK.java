package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AFh1dSDK;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1cSDK {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, int i2, AFh1dSDK aFh1dSDK, access13800 access13800Var, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 17;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            int i8 = i6 + 69;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                AFh1dSDK.onExtraCallback onextracallback = AFh1dSDK.onExtraCallback.onNavigationEvent;
                throw null;
            }
            aFh1dSDK = AFh1dSDK.onExtraCallback.onNavigationEvent;
        }
        Object objOnNavigationEvent = onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, i, i2, aFh1dSDK, access13800Var);
        int i9 = onWarmupCompleted + 89;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final Object onNavigationEvent(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, int i2, @NotNull AFh1dSDK aFh1dSDK, @NotNull access13800<? super Unit> access13800Var) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (i < 0) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ")").toString());
        }
        Object objIAuthTabCallback = Camera2CameraImplExternalSyntheticLambda5.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (isOverflowMenuShowing) null, new onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, aFh1dSDK, i, i2, null), access13800Var, 1, (Object) null);
        if (objIAuthTabCallback == access14100.onExtraCallback()) {
            int i6 = onWarmupCompleted + 7;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 40 / 0;
            }
            return objIAuthTabCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 109;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<Camera2CameraImplExternalSyntheticLambda2, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ AFh1dSDK $spec;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $this_animateScrollToItemContinuously;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, AFh1dSDK aFh1dSDK, int i, int i2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_animateScrollToItemContinuously = camera2CameraMetadataExternalSyntheticLambda1;
            this.$spec = aFh1dSDK;
            this.$index = i;
            this.$scrollOffset = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$this_animateScrollToItemContinuously, this.$spec, this.$index, this.$scrollOffset, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(camera2CameraImplExternalSyntheticLambda2, access13800Var);
            if (i3 != 0) {
                int i4 = 57 / 0;
            }
            int i5 = onExtraCallback + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(camera2CameraImplExternalSyntheticLambda2, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (o.AFg1ySDK.onNavigationEvent(r5, r12, r3, r11) == r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        
            if (o.AFh1aSDK.onWarmupCompleted(r5, r6, r7, r8, r9, r11) == r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            return r2;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2 = (Camera2CameraImplExternalSyntheticLambda2) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getMaxImages getmaximagesOnExtraCallback = Camera2CameraAvailabilityMonitoravailableCameraFlow1ExternalSyntheticLambda0.onExtraCallback(this.$this_animateScrollToItemContinuously, camera2CameraImplExternalSyntheticLambda2);
                AFh1dSDK aFh1dSDK = this.$spec;
                if (aFh1dSDK instanceof AFh1dSDK.onExtraCallback) {
                    int i3 = this.$index;
                    int i4 = this.$scrollOffset;
                    this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda2);
                    this.L$1 = access15400.onNavigationEvent(getmaximagesOnExtraCallback);
                    this.label = 1;
                } else {
                    if (!(aFh1dSDK instanceof AFh1dSDK.onExtraCallbackWithResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = this.$index;
                    int i6 = this.$scrollOffset;
                    int iIAuthTabCallback = ((AFh1dSDK.onExtraCallbackWithResult) aFh1dSDK).IAuthTabCallback();
                    setOnQueryTextListener setonquerytextlistenerOnWarmupCompleted = ((AFh1dSDK.onExtraCallbackWithResult) this.$spec).onWarmupCompleted();
                    this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda2);
                    this.L$1 = access15400.onNavigationEvent(getmaximagesOnExtraCallback);
                    this.label = 2;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onNavigationEvent + 115;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onNavigationEvent + 99;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
    }
}
