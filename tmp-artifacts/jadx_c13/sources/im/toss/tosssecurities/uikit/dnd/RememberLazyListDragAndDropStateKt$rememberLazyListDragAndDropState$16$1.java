package im.toss.tosssecurities.uikit.dnd;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AFg1qSDK;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.IAnimation;
import o.access13800;
import o.access14100;
import o.findResAndMsg;
import o.formatMsgs;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ long $mergeHoverConfirmMs;
    final /* synthetic */ AFg1qSDK $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1(AFg1qSDK aFg1qSDK, long j, access13800<? super RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1> access13800Var) {
        super(2, access13800Var);
        this.$state = aFg1qSDK;
        this.$mergeHoverConfirmMs = j;
    }

    public static /* synthetic */ Object onExtraCallback(AFg1qSDK aFg1qSDK) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(aFg1qSDK);
        }
        onNavigationEvent(aFg1qSDK);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1 rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1 = new RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1(this.$state, this.$mergeHoverConfirmMs, access13800Var);
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1 rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1 = (RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1) create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = rememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1.invokeSuspend(unit);
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return objInvokeSuspend;
    }

    private static final Object onNavigationEvent(AFg1qSDK aFg1qSDK) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objAsBinder = aFg1qSDK.asBinder();
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objAsBinder;
    }

    /* renamed from: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Object, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ long $mergeHoverConfirmMs;
        final /* synthetic */ AFg1qSDK $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1qSDK aFg1qSDK, long j, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.$state = aFg1qSDK;
            this.$mergeHoverConfirmMs = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$mergeHoverConfirmMs, access13800Var);
            anonymousClass2.L$0 = obj;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallback(obj, access13800Var2);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(obj, access13800Var2);
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(Object obj, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass2) create(obj, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object obj2 = this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 49;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (obj2 == null) {
                    int i4 = onNavigationEvent + 23;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.$state.IAuthTabCallback_Parcel(null);
                        return Unit.INSTANCE;
                    }
                    this.$state.IAuthTabCallback_Parcel(null);
                    int i5 = 62 / 0;
                    return Unit.INSTANCE;
                }
                long j = this.$mergeHoverConfirmMs;
                this.L$0 = obj2;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            this.$state.IAuthTabCallback_Parcel(obj2);
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 91;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final AFg1qSDK aFg1qSDK = this.$state;
            IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    AFg1qSDK aFg1qSDK2 = aFg1qSDK;
                    if (i5 == 0) {
                        return RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1.onExtraCallback(aFg1qSDK2);
                    }
                    RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1.onExtraCallback(aFg1qSDK2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$mergeHoverConfirmMs, null);
            this.label = 1;
            if (ycxycx.onWarmupCompleted(iAnimationOnWarmupCompleted, anonymousClass2, this) == objOnExtraCallback) {
                int i3 = onWarmupCompleted + 111;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i4 = onWarmupCompleted + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }
}
