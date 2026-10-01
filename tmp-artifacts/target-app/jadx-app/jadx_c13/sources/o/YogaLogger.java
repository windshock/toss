package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import kotlinx.coroutines.reactive.ReactiveSubscriber;
import o.access13700;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class YogaLogger<T> extends sz<T> {
    private final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ YogaLogger<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(YogaLogger<T> yogaLogger, access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = yogaLogger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onExtraCallbackWithResult((CoroutineContext) null, (setRipple) null, this);
        }
    }

    public /* synthetic */ YogaLogger(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, (i2 & 2) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    public YogaLogger(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    @Override // o.sz
    public sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new YogaLogger(this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }

    private final long IAuthTabCallback() {
        if (this.IAuthTabCallback != CloseableUtils.SUSPEND) {
            return LongCompanionObject.MAX_VALUE;
        }
        int i = this.onExtraCallbackWithResult;
        if (i == -2) {
            return nLockFileSegment.a_.onExtraCallbackWithResult();
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // o.sz, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        CoroutineContext context = access13800Var.getContext();
        CoroutineContext coroutineContext = this.onNavigationEvent;
        access13700.onWarmupCompleted onwarmupcompleted = access13700.onWarmupCompleted;
        access13700 access13700Var = (access13700) coroutineContext.get(onwarmupcompleted);
        if (access13700Var == null || Intrinsics.areEqual(access13700Var, context.get(onwarmupcompleted))) {
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(context.plus(this.onNavigationEvent), setripple, access13800Var);
            return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        Object objOnNavigationEvent = onNavigationEvent(setripple, access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setRipple<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ YogaLogger<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(setRipple<? super T> setripple, YogaLogger<T> yogaLogger, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$collector = setripple;
            this.this$0 = yogaLogger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$collector, this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                setRipple<T> setripple = this.$collector;
                YogaLogger<T> yogaLogger = this.this$0;
                ReceiveChannel<T> receiveChannelOnNavigationEvent = yogaLogger.onNavigationEvent(findRes.IAuthTabCallback(findresandmsg, yogaLogger.onNavigationEvent));
                this.label = 1;
                if (ycxycx.onExtraCallback(setripple, receiveChannelOnNavigationEvent, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onNavigationEvent(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onNavigationEvent(setripple, this, null), access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:13:0x003c, B:30:0x00b1, B:32:0x00bc, B:21:0x007c, B:27:0x0099, B:18:0x0058), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #0 {all -> 0x00c5, blocks: (B:13:0x003c, B:30:0x00b1, B:32:0x00bc, B:21:0x007c, B:27:0x0099, B:18:0x0058), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o.setRipple] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ae -> B:14:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(CoroutineContext coroutineContext, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        ReactiveSubscriber reactiveSubscriber;
        YogaLogger<T> yogaLogger;
        long j;
        setRipple<? super T> setripple2;
        YogaLogger<T> yogaLogger2;
        ?? r11;
        long j2;
        ReactiveSubscriber reactiveSubscriber2;
        Object objOnWarmupCompleted;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(this, access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        ?? r4 = onextracallback.label;
        try {
            if (r4 == 0) {
                ResultKt.onNavigationEvent(obj);
                ReactiveSubscriber reactiveSubscriber3 = new ReactiveSubscriber(this.onExtraCallbackWithResult, this.IAuthTabCallback, IAuthTabCallback());
                ReactiveFlowKt.onExtraCallbackWithResult(this.onWarmupCompleted, coroutineContext).subscribe(reactiveSubscriber3);
                reactiveSubscriber = reactiveSubscriber3;
                yogaLogger = this;
                j = 0;
                setripple2 = setripple;
                onextracallback.L$0 = yogaLogger;
                onextracallback.L$1 = setripple2;
                onextracallback.L$2 = reactiveSubscriber;
                onextracallback.J$0 = j;
                onextracallback.label = 1;
                objOnWarmupCompleted = reactiveSubscriber.onWarmupCompleted((access13800) onextracallback);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (r4 != 1) {
                if (r4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = onextracallback.J$0;
                ReactiveSubscriber reactiveSubscriber4 = (ReactiveSubscriber) onextracallback.L$2;
                setRipple<? super T> setripple3 = (setRipple) onextracallback.L$1;
                yogaLogger2 = (YogaLogger) onextracallback.L$0;
                ResultKt.onNavigationEvent(obj);
                r4 = reactiveSubscriber4;
                setRipple<? super T> setripple4 = setripple3;
                setripple2 = setripple4;
                long j3 = j2 + 1;
                if (j3 != yogaLogger2.IAuthTabCallback()) {
                    r4.onExtraCallback();
                    j = 0;
                } else {
                    j = j3;
                }
                yogaLogger = yogaLogger2;
                reactiveSubscriber = r4;
                onextracallback.L$0 = yogaLogger;
                onextracallback.L$1 = setripple2;
                onextracallback.L$2 = reactiveSubscriber;
                onextracallback.J$0 = j;
                onextracallback.label = 1;
                objOnWarmupCompleted = reactiveSubscriber.onWarmupCompleted((access13800) onextracallback);
                if (objOnWarmupCompleted != objOnExtraCallback) {
                    r11 = setripple2;
                    obj = objOnWarmupCompleted;
                    yogaLogger2 = yogaLogger;
                    j2 = j;
                    reactiveSubscriber2 = reactiveSubscriber;
                    if (obj == null) {
                        getFullPackage.IAuthTabCallback(onextracallback.getContext());
                        onextracallback.L$0 = yogaLogger2;
                        onextracallback.L$1 = r11;
                        onextracallback.L$2 = reactiveSubscriber2;
                        onextracallback.J$0 = j2;
                        onextracallback.label = 2;
                        Object objEmit = r11.emit(obj, onextracallback);
                        r4 = reactiveSubscriber2;
                        setripple4 = r11;
                        if (objEmit == objOnExtraCallback) {
                        }
                        setripple2 = setripple4;
                        long j32 = j2 + 1;
                        if (j32 != yogaLogger2.IAuthTabCallback()) {
                        }
                        yogaLogger = yogaLogger2;
                        reactiveSubscriber = r4;
                        onextracallback.L$0 = yogaLogger;
                        onextracallback.L$1 = setripple2;
                        onextracallback.L$2 = reactiveSubscriber;
                        onextracallback.J$0 = j;
                        onextracallback.label = 1;
                        objOnWarmupCompleted = reactiveSubscriber.onWarmupCompleted((access13800) onextracallback);
                        if (objOnWarmupCompleted != objOnExtraCallback) {
                        }
                    } else {
                        reactiveSubscriber2.onNavigationEvent();
                        return Unit.INSTANCE;
                    }
                }
                return objOnExtraCallback;
            }
            j2 = onextracallback.J$0;
            ReactiveSubscriber reactiveSubscriber5 = (ReactiveSubscriber) onextracallback.L$2;
            setRipple setripple5 = (setRipple) onextracallback.L$1;
            yogaLogger2 = (YogaLogger) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj);
            reactiveSubscriber2 = reactiveSubscriber5;
            r11 = setripple5;
            if (obj == null) {
            }
        } catch (Throwable th) {
            r4.onNavigationEvent();
            throw th;
        }
    }

    @Override // o.sz
    public Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(okVar.getCoroutineContext(), new getAlignItems(okVar.onActivityLayout()), access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }
}
