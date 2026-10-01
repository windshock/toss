package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.LongCompanionObject;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class formatMsgs {

    static final class onWarmupCompleted extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return formatMsgs.onExtraCallbackWithResult(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(@NotNull access13800<?> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.label = 1;
            setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(onwarmupcompleted), 1);
            setresourceinternal.onTransact();
            Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(onwarmupcompleted);
            }
            if (objIAuthTabCallbackDefault == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        throw new setWrite();
    }

    public static final Object onWarmupCompleted(long j, @NotNull access13800<? super Unit> access13800Var) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        if (j < LongCompanionObject.MAX_VALUE) {
            onExtraCallback(setresourceinternal.getContext()).onWarmupCompleted(j, setresourceinternal);
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }

    public static final Object IAuthTabCallback(long j, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted = onWarmupCompleted(IAuthTabCallback(j), access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    public static final BufferOutputStream onExtraCallback(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(access13700.onWarmupCompleted);
        BufferOutputStream bufferOutputStream = element instanceof BufferOutputStream ? (BufferOutputStream) element : null;
        return bufferOutputStream == null ? releaseGeckoResLoader.onExtraCallback() : bufferOutputStream;
    }

    public static final long IAuthTabCallback(long j) {
        boolean zOnMinimized = setLogBuffers.onMinimized(j);
        if (zOnMinimized) {
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            return setLogBuffers.asBinder(setLogBuffers.onNavigationEvent(j, setCommandLine.IAuthTabCallback(999999L, setRevision.NANOSECONDS)));
        }
        if (zOnMinimized) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
