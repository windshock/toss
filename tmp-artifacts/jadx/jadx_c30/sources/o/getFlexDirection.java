package o;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getFlexDirection<T> implements ListenableFuture<T> {
    private boolean IAuthTabCallback;
    private final SettableFuture<Object> onExtraCallback;
    private final getPackageType onNavigationEvent;

    public final boolean IAuthTabCallback(T t) {
        return this.onExtraCallback.set(t);
    }

    public final boolean onNavigationEvent(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return this.onExtraCallback.set(new getFlexItemCount((CancellationException) th));
        }
        boolean exception = this.onExtraCallback.setException(th);
        if (exception) {
            this.IAuthTabCallback = true;
        }
        return exception;
    }

    public boolean isCancelled() {
        if (this.onExtraCallback.isCancelled()) {
            return true;
        }
        if (isDone() && !this.IAuthTabCallback) {
            try {
                if (Uninterruptibles.getUninterruptibly(this.onExtraCallback) instanceof getFlexItemCount) {
                    return true;
                }
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.IAuthTabCallback = true;
            }
        }
        return false;
    }

    public T get() {
        return onWarmupCompleted(this.onExtraCallback.get());
    }

    public T get(long j, @NotNull TimeUnit timeUnit) {
        return onWarmupCompleted(this.onExtraCallback.get(j, timeUnit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final T onWarmupCompleted(Object obj) throws Throwable {
        if (obj instanceof getFlexItemCount) {
            throw new CancellationException().initCause(((getFlexItemCount) obj).onExtraCallbackWithResult);
        }
        return obj;
    }

    public void addListener(@NotNull Runnable runnable, @NotNull Executor executor) {
        this.onExtraCallback.addListener(runnable, executor);
    }

    public boolean isDone() {
        return this.onExtraCallback.isDone();
    }

    public boolean cancel(boolean z) {
        if (!this.onExtraCallback.cancel(z)) {
            return false;
        }
        getPackageType.onWarmupCompleted.onWarmupCompleted(this.onNavigationEvent, (CancellationException) null, 1, (Object) null);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object uninterruptibly = Uninterruptibles.getUninterruptibly(this.onExtraCallback);
                if (uninterruptibly instanceof getFlexItemCount) {
                    sb.append("CANCELLED, cause=[" + ((getFlexItemCount) uninterruptibly).onExtraCallbackWithResult + ']');
                } else {
                    sb.append("SUCCESS, result=[" + uninterruptibly + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.onExtraCallback + ']');
        }
        sb.append(']');
        return sb.toString();
    }
}
