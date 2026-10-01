package im.toss.tosssecurities.uikit.dnd;

import im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFg1qSDK;
import o.Camera2CameraImplExternalSyntheticLambda14;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.IAnimation;
import o.access13800;
import o.access14100;
import o.addSessionCaptureCallback;
import o.findResAndMsg;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ float $autoScrollMaxSpeed;
    final /* synthetic */ float $autoScrollThresholdBottom;
    final /* synthetic */ float $autoScrollThresholdTop;
    final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $lazyListState;
    final /* synthetic */ AFg1qSDK $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1(AFg1qSDK aFg1qSDK, float f, float f2, float f3, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1> access13800Var) {
        super(2, access13800Var);
        this.$state = aFg1qSDK;
        this.$autoScrollThresholdTop = f;
        this.$autoScrollThresholdBottom = f2;
        this.$autoScrollMaxSpeed = f3;
        this.$lazyListState = camera2CameraMetadataExternalSyntheticLambda1;
    }

    public static /* synthetic */ boolean onWarmupCompleted(AFg1qSDK aFg1qSDK) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(aFg1qSDK);
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1 rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1 = new RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1(this.$state, this.$autoScrollThresholdTop, this.$autoScrollThresholdBottom, this.$autoScrollMaxSpeed, this.$lazyListState, access13800Var);
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1 rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1 = (RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1) create(findresandmsg, access13800Var);
        if (i3 != 0) {
            return rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1.invokeSuspend(Unit.INSTANCE);
        }
        int i4 = 87 / 0;
        return rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1.invokeSuspend(Unit.INSTANCE);
    }

    private static final boolean onExtraCallbackWithResult(AFg1qSDK aFg1qSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = aFg1qSDK.IAuthTabCallbackStub();
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    /* renamed from: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ float $autoScrollMaxSpeed;
        final /* synthetic */ float $autoScrollThresholdBottom;
        final /* synthetic */ float $autoScrollThresholdTop;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $lazyListState;
        final /* synthetic */ AFg1qSDK $state;
        float F$0;
        float F$1;
        float F$2;
        float F$3;
        float F$4;
        float F$5;
        float F$6;
        int I$0;
        long J$0;
        long J$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1qSDK aFg1qSDK, float f, float f2, float f3, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.$state = aFg1qSDK;
            this.$autoScrollThresholdTop = f;
            this.$autoScrollThresholdBottom = f2;
            this.$autoScrollMaxSpeed = f3;
            this.$lazyListState = camera2CameraMetadataExternalSyntheticLambda1;
        }

        private static final long IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public static /* synthetic */ long onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback(j);
                throw null;
            }
            long jIAuthTabCallback = IAuthTabCallback(j);
            int i3 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return jIAuthTabCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$autoScrollThresholdTop, this.$autoScrollThresholdBottom, this.$autoScrollMaxSpeed, this.$lazyListState, access13800Var);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, access13800<? super Unit> access13800Var) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = bool.booleanValue();
            if (i3 != 0) {
                objOnNavigationEvent = onNavigationEvent(zBooleanValue, access13800Var);
                int i4 = 27 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(zBooleanValue, access13800Var);
            }
            int i5 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(boolean z, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass2) create(Boolean.valueOf(z), access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
        
            r8 = r10;
         */
        /* JADX WARN: Path cross not found for [B:25:0x00c0, B:31:0x00e0], limit reached: 43 */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010b -> B:39:0x010c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            Object objIAuthTabCallback;
            float fCoerceIn;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.Z$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            long j2 = 0;
            int i5 = 1;
            if (i4 != 0) {
                int i6 = onExtraCallbackWithResult + 37;
                int i7 = i6 % 128;
                onNavigationEvent = i7;
                int i8 = i6 % 2;
                if (i4 == 1) {
                    j = this.J$0;
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = obj;
                    long jLongValue = ((Number) objIAuthTabCallback).longValue();
                    if (j == j2) {
                    }
                    j2 = 0;
                    i5 = 1;
                    if (!this.$state.IAuthTabCallbackStub()) {
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = i7 + 7;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    j = this.J$0;
                    ResultKt.onNavigationEvent(obj);
                    this.$state.access000();
                    j2 = 0;
                    i5 = 1;
                    if (!this.$state.IAuthTabCallbackStub()) {
                        Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1$2$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i11 = 2 % 2;
                                int i12 = onExtraCallback + 79;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                Long lValueOf = Long.valueOf(RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1.AnonymousClass2.onExtraCallback(((Long) obj2).longValue()));
                                int i14 = IAuthTabCallback + 87;
                                onExtraCallback = i14 % 128;
                                int i15 = i14 % 2;
                                return lValueOf;
                            }
                        };
                        this.Z$0 = z;
                        this.J$0 = j;
                        this.label = i5;
                        objIAuthTabCallback = addSessionCaptureCallback.IAuthTabCallback(function1, this);
                        if (objIAuthTabCallback != objOnExtraCallback) {
                            long jLongValue2 = ((Number) objIAuthTabCallback).longValue();
                            if (j == j2) {
                                float f = (jLongValue2 - j) / 1.0E9f;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) this.$state.onExtraCallback()) + (Float.intBitsToFloat((int) this.$state.onExtraCallbackWithResult()) / 2.0f);
                                float fIntBitsToFloat2 = fIntBitsToFloat - Float.intBitsToFloat((int) (this.$state.onTransact() & 4294967295L));
                                int iAsInterface = this.$state.asInterface();
                                float f2 = iAsInterface;
                                float f3 = this.$autoScrollThresholdTop * f2;
                                float f4 = this.$autoScrollThresholdBottom * f2;
                                if (iAsInterface > 0) {
                                    if (fIntBitsToFloat2 < f3) {
                                        fCoerceIn = -RangesKt___RangesKt.coerceIn((f3 - fIntBitsToFloat2) / f3, 0.0f, 1.0f);
                                    } else if (fIntBitsToFloat2 > f4) {
                                        fCoerceIn = RangesKt___RangesKt.coerceIn((fIntBitsToFloat2 - f4) / RangesKt___RangesKt.coerceAtLeast(f2 - f4, 1.0f), 0.0f, 1.0f);
                                    }
                                    if (fCoerceIn != 0.0f) {
                                        j = jLongValue2;
                                    } else {
                                        float f5 = this.$autoScrollMaxSpeed * fCoerceIn * f;
                                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$lazyListState;
                                        this.Z$0 = z;
                                        this.J$0 = jLongValue2;
                                        this.J$1 = jLongValue2;
                                        this.F$0 = f;
                                        this.F$1 = fIntBitsToFloat;
                                        this.F$2 = fIntBitsToFloat2;
                                        this.I$0 = iAsInterface;
                                        this.F$3 = f3;
                                        this.F$4 = f4;
                                        this.F$5 = fCoerceIn;
                                        this.F$6 = f5;
                                        this.label = 2;
                                        if (Camera2CameraImplExternalSyntheticLambda14.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, f5, this) != objOnExtraCallback) {
                                            j = jLongValue2;
                                            this.$state.access000();
                                        }
                                    }
                                }
                                fCoerceIn = 0.0f;
                                if (fCoerceIn != 0.0f) {
                                }
                            }
                            j2 = 0;
                            i5 = 1;
                            if (!this.$state.IAuthTabCallbackStub()) {
                                return Unit.INSTANCE;
                            }
                        }
                        return objOnExtraCallback;
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                if (!z) {
                    int i11 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return Unit.INSTANCE;
                }
                j = 0;
                if (!this.$state.IAuthTabCallbackStub()) {
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onNavigationEvent + 35;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i4 + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            final AFg1qSDK aFg1qSDK = this.$state;
            IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        Boolean.valueOf(RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1.onWarmupCompleted(aFg1qSDK));
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1.onWarmupCompleted(aFg1qSDK));
                    int i8 = onExtraCallback + 57;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return boolValueOf;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$autoScrollThresholdTop, this.$autoScrollThresholdBottom, this.$autoScrollMaxSpeed, this.$lazyListState, null);
            this.label = 1;
            if (ycxycx.onWarmupCompleted(iAnimationOnWarmupCompleted, anonymousClass2, this) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        return Unit.INSTANCE;
    }
}
