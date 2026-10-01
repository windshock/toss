package o;

import j$.time.Duration;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import o.dy7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dy7 {
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted(dy7.class);
    private final String IAuthTabCallback;
    private final Queue<CompletableFuture<onExtraCallback>> onExtraCallbackWithResult;
    private volatile int onNavigationEvent;
    private final onExtraCallback onWarmupCompleted;

    static /* synthetic */ int IAuthTabCallback(dy7 dy7Var) {
        int i = dy7Var.onNavigationEvent;
        dy7Var.onNavigationEvent = i + 1;
        return i;
    }

    public final class onExtraCallback {
        final /* synthetic */ dy7 IAuthTabCallback;

        public void onWarmupCompleted(int i, Executor executor) {
            synchronized (this.IAuthTabCallback.onExtraCallbackWithResult) {
                final CompletableFuture completableFuture = (CompletableFuture) this.IAuthTabCallback.onExtraCallbackWithResult.poll();
                if (completableFuture != null) {
                    AppSetIdAndScope1 unused = dy7.onExtraCallback;
                    String unused2 = this.IAuthTabCallback.IAuthTabCallback;
                    int i2 = this.IAuthTabCallback.onNavigationEvent;
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    executor.execute(new Runnable() { // from class: org.xbill.DNS.AsyncSemaphore$Permit$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            completableFuture.complete(this.f$0);
                        }
                    });
                } else {
                    dy7.IAuthTabCallback(this.IAuthTabCallback);
                    AppSetIdAndScope1 unused3 = dy7.onExtraCallback;
                    String unused4 = this.IAuthTabCallback.IAuthTabCallback;
                    int i3 = this.IAuthTabCallback.onNavigationEvent;
                    Integer.valueOf(i);
                    Integer.valueOf(i3);
                }
            }
        }
    }

    CompletionStage<onExtraCallback> onExtraCallbackWithResult(Duration duration, final int i, Executor executor) {
        synchronized (this.onExtraCallbackWithResult) {
            if (this.onNavigationEvent > 0) {
                this.onNavigationEvent--;
                int i2 = this.onNavigationEvent;
                Integer.valueOf(i);
                Integer.valueOf(i2);
                return CompletableFuture.completedFuture(this.onWarmupCompleted);
            }
            final lt55 lt55Var = new lt55();
            lt55Var.onNavigationEvent(duration.toNanos(), TimeUnit.NANOSECONDS).whenCompleteAsync(new BiConsumer() { // from class: org.xbill.DNS.AsyncSemaphore$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    dy7.onExtraCallbackWithResult(this.f$0, i, lt55Var, (dy7.onExtraCallback) obj, (Throwable) obj2);
                }
            }, executor);
            int i3 = this.onNavigationEvent;
            Integer.valueOf(i);
            Integer.valueOf(i3);
            this.onExtraCallbackWithResult.add(lt55Var);
            return lt55Var;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(dy7 dy7Var, int i, lt55 lt55Var, onExtraCallback onextracallback, Throwable th) {
        synchronized (dy7Var.onExtraCallbackWithResult) {
            if (th != null) {
                String str = dy7Var.IAuthTabCallback;
                int i2 = dy7Var.onNavigationEvent;
                Integer.valueOf(i);
                Integer.valueOf(i2);
                dy7Var.onExtraCallbackWithResult.remove(lt55Var);
            } else {
                dy7Var.onExtraCallbackWithResult.remove(lt55Var);
            }
        }
    }
}
