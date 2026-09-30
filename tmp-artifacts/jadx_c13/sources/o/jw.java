package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.jw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw {

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return jw.onWarmupCompleted(null, null, this);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(ok okVar, Function0 function0, access13800 access13800Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: kotlinx.coroutines.channels.ProduceKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return jw.onNavigationEvent();
                }
            };
        }
        return onWarmupCompleted(okVar, function0, access13800Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull ok<?> okVar, @NotNull Function0<Unit> function0, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (onnavigationevent.getContext().get(getPackageType.onNavigationEvent) != okVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                onnavigationevent.L$0 = okVar;
                onnavigationevent.L$1 = function0;
                onnavigationevent.label = 1;
                setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(onnavigationevent), 1);
                setresourceinternal.onTransact();
                okVar.onExtraCallbackWithResult(new IAuthTabCallback(setresourceinternal));
                Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(onnavigationevent);
                }
                if (objIAuthTabCallbackDefault == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) onnavigationevent.L$1;
                ResultKt.onNavigationEvent(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    static final class IAuthTabCallback implements Function1<Throwable, Unit> {
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
            this.onExtraCallback = mayberemoveattachstatelistener;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            onNavigationEvent(th);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Throwable th) {
            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onExtraCallback;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
        }
    }

    public static /* synthetic */ ReceiveChannel onWarmupCompleted(findResAndMsg findresandmsg, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return onExtraCallback(findresandmsg, coroutineContext, i, function2);
    }

    public static final <E> ReceiveChannel<E> onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, int i, @NotNull Function2<? super ok<? super E>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return onExtraCallback(findresandmsg, coroutineContext, i, CloseableUtils.SUSPEND, setRandomHost.DEFAULT, null, function2);
    }

    public static /* synthetic */ ReceiveChannel onNavigationEvent(findResAndMsg findresandmsg, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, setRandomHost setrandomhost, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            closeableUtils = CloseableUtils.SUSPEND;
        }
        CloseableUtils closeableUtils2 = closeableUtils;
        if ((i2 & 8) != 0) {
            setrandomhost = setRandomHost.DEFAULT;
        }
        setRandomHost setrandomhost2 = setrandomhost;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return onExtraCallback(findresandmsg, coroutineContext2, i3, closeableUtils2, setrandomhost2, function1, function2);
    }

    public static final <E> ReceiveChannel<E> onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils, @NotNull setRandomHost setrandomhost, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super ok<? super E>, ? super access13800<? super Unit>, ? extends Object> function2) {
        htf htfVar = new htf(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), zb.onExtraCallbackWithResult(i, closeableUtils, null, 4, null));
        if (function1 != null) {
            htfVar.onExtraCallback(function1);
        }
        htfVar.onExtraCallback(setrandomhost, (setRandomHost) htfVar, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
        return htfVar;
    }
}
