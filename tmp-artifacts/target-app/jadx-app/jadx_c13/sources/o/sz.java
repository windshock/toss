package o;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class sz<T> implements syalt<T> {
    public final CloseableUtils IAuthTabCallback;
    public final int onExtraCallbackWithResult;
    public final CoroutineContext onNavigationEvent;

    @Override // o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, setripple, access13800Var);
    }

    protected abstract Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var);

    protected abstract sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils);

    protected String onNavigationEvent() {
        return null;
    }

    public IAnimation<T> onWarmupCompleted() {
        return null;
    }

    public sz(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        this.onNavigationEvent = coroutineContext;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = closeableUtils;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<ok<? super T>, access13800<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sz<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(sz<T> szVar, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = szVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ok<? super T> okVar, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ok<? super T> okVar = (ok) this.L$0;
                sz<T> szVar = this.this$0;
                this.label = 1;
                if (szVar.onExtraCallback(okVar, this) == objOnExtraCallback) {
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

    public final Function2<ok<? super T>, access13800<? super Unit>, Object> onExtraCallbackWithResult() {
        return new onNavigationEvent(this, null);
    }

    public final int onExtraCallback() {
        int i = this.onExtraCallbackWithResult;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // o.syalt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        CoroutineContext coroutineContextPlus = coroutineContext.plus(this.onNavigationEvent);
        if (closeableUtils == CloseableUtils.SUSPEND) {
            int i2 = this.onExtraCallbackWithResult;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = IntCompanionObject.MAX_VALUE;
                            }
                        } else {
                            i = i2;
                        }
                    }
                }
            }
            closeableUtils = this.IAuthTabCallback;
        }
        return (Intrinsics.areEqual(coroutineContextPlus, this.onNavigationEvent) && i == this.onExtraCallbackWithResult && closeableUtils == this.IAuthTabCallback) ? this : onExtraCallbackWithResult(coroutineContextPlus, i, closeableUtils);
    }

    public ReceiveChannel<T> onNavigationEvent(@NotNull findResAndMsg findresandmsg) {
        return jw.onNavigationEvent(findresandmsg, this.onNavigationEvent, onExtraCallback(), this.IAuthTabCallback, setRandomHost.ATOMIC, null, onExtraCallbackWithResult(), 16, null);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setRipple<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sz<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(setRipple<? super T> setripple, sz<T> szVar, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$collector = setripple;
            this.this$0 = szVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$collector, this.this$0, access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                setRipple<T> setripple = this.$collector;
                ReceiveChannel<T> receiveChannelOnNavigationEvent = this.this$0.onNavigationEvent(findresandmsg);
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

    static /* synthetic */ <T> Object onWarmupCompleted(sz<T> szVar, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onWarmupCompleted(setripple, szVar, null), access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strOnNavigationEvent = onNavigationEvent();
        if (strOnNavigationEvent != null) {
            arrayList.add(strOnNavigationEvent);
        }
        if (this.onNavigationEvent != access13600.IAuthTabCallback) {
            arrayList.add("context=" + this.onNavigationEvent);
        }
        if (this.onExtraCallbackWithResult != -3) {
            arrayList.add("capacity=" + this.onExtraCallbackWithResult);
        }
        if (this.IAuthTabCallback != CloseableUtils.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.IAuthTabCallback);
        }
        return getResCount.IAuthTabCallback(this) + '[' + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
