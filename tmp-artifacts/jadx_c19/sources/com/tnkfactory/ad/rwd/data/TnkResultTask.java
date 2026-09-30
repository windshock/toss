package com.tnkfactory.ad.rwd.data;

import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.rwd.data.ResultState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkResultTask<T> {
    private Function1<? super TnkError, Unit> onError;
    private Function1<? super T, Unit> onSuccess;
    private final Function0<ResultState<T>> wrapper;

    /* JADX WARN: Multi-variable type inference failed */
    public TnkResultTask(@NotNull Function0<? extends ResultState<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.wrapper = function0;
        this.onSuccess = new Function1() { // from class: com.tnkfactory.ad.rwd.data.TnkResultTask$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TnkResultTask.onSuccess$lambda$0(obj);
            }
        };
        this.onError = new Function1() { // from class: com.tnkfactory.ad.rwd.data.TnkResultTask$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return TnkResultTask.onError$lambda$1((TnkError) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$2(TnkResultTask tnkResultTask) {
        try {
            ResultState resultState = (ResultState) tnkResultTask.wrapper.invoke();
            if (resultState instanceof ResultState.Success) {
                tnkResultTask.onSuccess.invoke(((ResultState.Success) resultState).getValue());
            } else if (resultState instanceof ResultState.Error) {
                tnkResultTask.onError.invoke(((ResultState.Error) resultState).getE());
            }
        } catch (Throwable th) {
            Logger.e("executeAsync failed : " + th);
            try {
                Function1<? super TnkError, Unit> function1 = tnkResultTask.onError;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                function1.invoke(new TnkError(99, message, th));
            } catch (Throwable th2) {
                Logger.e("executeAsync onError failed : " + th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$1(TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSuccess$lambda$0(Object obj) {
        return Unit.INSTANCE;
    }

    public final void execute() {
        ResultState resultState = (ResultState) this.wrapper.invoke();
        if (resultState instanceof ResultState.Success) {
            this.onSuccess.invoke(((ResultState.Success) resultState).getValue());
        } else if (resultState instanceof ResultState.Error) {
            this.onError.invoke(((ResultState.Error) resultState).getE());
        }
    }

    public final void executeAsync() {
        TnkSession.INSTANCE.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.rwd.data.TnkResultTask$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TnkResultTask.executeAsync$lambda$2(this.f$0);
            }
        });
    }

    public final Function0<ResultState<T>> getWrapper() {
        return this.wrapper;
    }

    public final TnkResultTask<T> setOnError(@NotNull Function1<? super TnkError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onError = function1;
        return this;
    }

    public final TnkResultTask<T> setOnSuccess(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onSuccess = function1;
        return this;
    }
}
