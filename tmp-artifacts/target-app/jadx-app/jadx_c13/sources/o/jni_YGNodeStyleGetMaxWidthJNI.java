package o;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getPackageType;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetMaxWidthJNI {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CancellationTokenSource cancellationTokenSource, GeckoHubImp1 geckoHubImp1, TaskCompletionSource taskCompletionSource, Throwable th) {
        if (th instanceof CancellationException) {
            cancellationTokenSource.cancel();
            return Unit.INSTANCE;
        }
        RuntimeExecutionException runtimeExecutionExceptionCe_ = geckoHubImp1.ce_();
        if (runtimeExecutionExceptionCe_ == null) {
            taskCompletionSource.setResult(geckoHubImp1.IAuthTabCallback());
        } else {
            Exception runtimeExecutionException = runtimeExecutionExceptionCe_ instanceof Exception ? (Exception) runtimeExecutionExceptionCe_ : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(runtimeExecutionExceptionCe_);
            }
            taskCompletionSource.setException(runtimeExecutionException);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(pauseMyRequest pausemyrequest, Task task) {
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(pausemyrequest, null, 1, null);
                return;
            } else {
                pausemyrequest.IAuthTabCallback((pauseMyRequest) task.getResult());
                return;
            }
        }
        pausemyrequest.onExtraCallback(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CancellationTokenSource cancellationTokenSource, Throwable th) {
        cancellationTokenSource.cancel();
        return Unit.INSTANCE;
    }

    public static final <T> Object onNavigationEvent(@NotNull Task<T> task, @NotNull access13800<? super T> access13800Var) {
        return onWarmupCompleted(task, null, access13800Var);
    }

    public static final <T> Object onNavigationEvent(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource, @NotNull access13800<? super T> access13800Var) {
        return onWarmupCompleted(task, cancellationTokenSource, access13800Var);
    }

    private static final <T> Object onWarmupCompleted(Task<T> task, CancellationTokenSource cancellationTokenSource, access13800<? super T> access13800Var) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new CancellationException("Task " + task + " was cancelled normally.");
                }
                return task.getResult();
            }
            throw exception;
        }
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        task.addOnCompleteListener(jni_YGNodeStyleGetHeightJNI.onNavigationEvent, new onWarmupCompleted(setresourceinternal));
        if (cancellationTokenSource != null) {
            setresourceinternal.IAuthTabCallback((Function1<? super Throwable, Unit>) new onNavigationEvent(cancellationTokenSource));
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    static final class onWarmupCompleted<TResult> implements OnCompleteListener {
        final /* synthetic */ maybeRemoveAttachStateListener<T> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener) {
            this.IAuthTabCallback = mayberemoveattachstatelistener;
        }

        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    maybeRemoveAttachStateListener.onWarmupCompleted.IAuthTabCallback(this.IAuthTabCallback, null, 1, null);
                    return;
                }
                access13800 access13800Var = this.IAuthTabCallback;
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(task.getResult()));
                return;
            }
            access13800 access13800Var2 = this.IAuthTabCallback;
            Result.Companion companion2 = Result.Companion;
            access13800Var2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    static final class onNavigationEvent implements Function1<Throwable, Unit> {
        final /* synthetic */ CancellationTokenSource onExtraCallbackWithResult;

        onNavigationEvent(CancellationTokenSource cancellationTokenSource) {
            this.onExtraCallbackWithResult = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            onExtraCallback(th);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(Throwable th) {
            this.onExtraCallbackWithResult.cancel();
        }
    }
}
