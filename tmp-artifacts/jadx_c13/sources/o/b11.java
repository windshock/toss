package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.b11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class b11 {
    private static volatile Choreographer choreographer;
    public static final StatisticModel onWarmupCompleted;

    public static /* synthetic */ StatisticModel onNavigationEvent(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return onWarmupCompleted(handler, str);
    }

    public static final StatisticModel onWarmupCompleted(@NotNull Handler handler, @Nullable String str) {
        return new b9(handler, str);
    }

    public static final Handler onExtraCallback(@NotNull Looper looper, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                Intrinsics.checkNotNull(objInvoke, "");
                return (Handler) objInvoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    static {
        Object objM31constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(new b9(onExtraCallback(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        onWarmupCompleted = (StatisticModel) (Result.onExtraCallback(objM31constructorimpl) ? null : objM31constructorimpl);
    }

    public static final Object onExtraCallbackWithResult(@NotNull access13800<? super Long> access13800Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return onWarmupCompleted(access13800Var);
        }
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        onExtraCallback(choreographer2, setresourceinternal);
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    static final class IAuthTabCallback implements Runnable {
        final /* synthetic */ maybeRemoveAttachStateListener<Long> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(maybeRemoveAttachStateListener<? super Long> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b11.onWarmupCompleted((maybeRemoveAttachStateListener<? super Long>) this.onWarmupCompleted);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(maybeRemoveAttachStateListener<? super Long> mayberemoveattachstatelistener) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        onExtraCallback(choreographer2, mayberemoveattachstatelistener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Choreographer choreographer2, final maybeRemoveAttachStateListener<? super Long> mayberemoveattachstatelistener) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                b11.IAuthTabCallback(mayberemoveattachstatelistener, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(maybeRemoveAttachStateListener mayberemoveattachstatelistener, long j) {
        mayberemoveattachstatelistener.onNavigationEvent(putChannelInfo.onExtraCallback(), Long.valueOf(j));
    }

    private static final Object onWarmupCompleted(access13800<? super Long> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onWarmupCompleted((maybeRemoveAttachStateListener<? super Long>) setresourceinternal);
        } else {
            putChannelInfo.onExtraCallback().onWarmupCompleted(setresourceinternal.getContext(), new IAuthTabCallback(setresourceinternal));
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }
}
