package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import o.ScreenFlashView1ExternalSyntheticLambda0;
import o.TextContextMenuHelperApi28ExternalSyntheticLambda2;
import o.setContentPadding;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    long IAuthTabCallback;
    private final Executor access000;
    volatile AsyncTaskLoader<D>.onWarmupCompleted onExtraCallback;
    volatile AsyncTaskLoader<D>.onWarmupCompleted onExtraCallbackWithResult;
    Handler onNavigationEvent;
    long onWarmupCompleted;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(@Nullable D d) {
    }

    final class onWarmupCompleted extends TextContextMenuHelperApi28ExternalSyntheticLambda2<Void, Void, D> implements Runnable {
        boolean onExtraCallbackWithResult;
        private final CountDownLatch onTransact = new CountDownLatch(1);

        onWarmupCompleted() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: Thrown type has an unknown type hierarchy: o.ScreenFlashView1ExternalSyntheticLambda0 */
        @Override // o.TextContextMenuHelperApi28ExternalSyntheticLambda2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public D onExtraCallbackWithResult(Void... voidArr) throws ScreenFlashView1ExternalSyntheticLambda0 {
            try {
                return (D) AsyncTaskLoader.this.onLoadInBackground();
            } catch (ScreenFlashView1ExternalSyntheticLambda0 e) {
                if (onWarmupCompleted()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // o.TextContextMenuHelperApi28ExternalSyntheticLambda2
        public void onNavigationEvent(D d) {
            try {
                AsyncTaskLoader.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.onTransact.countDown();
            }
        }

        @Override // o.TextContextMenuHelperApi28ExternalSyntheticLambda2
        public void onExtraCallbackWithResult(D d) {
            try {
                AsyncTaskLoader.this.dispatchOnCancelled(this, d);
            } finally {
                this.onTransact.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onExtraCallbackWithResult = false;
            AsyncTaskLoader.this.executePendingTask();
        }

        public void IAuthTabCallback() throws InterruptedException {
            try {
                this.onTransact.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
        this(context, TextContextMenuHelperApi28ExternalSyntheticLambda2.onNavigationEvent);
    }

    private AsyncTaskLoader(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.IAuthTabCallback = -10000L;
        this.access000 = executor;
    }

    public void setUpdateThrottle(long j) {
        this.onWarmupCompleted = j;
        if (j != 0) {
            this.onNavigationEvent = new Handler();
        }
    }

    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.onExtraCallback = new onWarmupCompleted();
        executePendingTask();
    }

    protected boolean onCancelLoad() {
        if (this.onExtraCallback == null) {
            return false;
        }
        if (!((Loader) this).getInterfaceDescriptor) {
            ((Loader) this).IAuthTabCallbackDefault = true;
        }
        if (this.onExtraCallbackWithResult != null) {
            if (this.onExtraCallback.onExtraCallbackWithResult) {
                this.onExtraCallback.onExtraCallbackWithResult = false;
                this.onNavigationEvent.removeCallbacks(this.onExtraCallback);
            }
            this.onExtraCallback = null;
            return false;
        }
        if (this.onExtraCallback.onExtraCallbackWithResult) {
            this.onExtraCallback.onExtraCallbackWithResult = false;
            this.onNavigationEvent.removeCallbacks(this.onExtraCallback);
            this.onExtraCallback = null;
            return false;
        }
        boolean zIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(false);
        if (zIAuthTabCallback) {
            this.onExtraCallbackWithResult = this.onExtraCallback;
            cancelLoadInBackground();
        }
        this.onExtraCallback = null;
        return zIAuthTabCallback;
    }

    void executePendingTask() {
        if (this.onExtraCallbackWithResult != null || this.onExtraCallback == null) {
            return;
        }
        if (this.onExtraCallback.onExtraCallbackWithResult) {
            this.onExtraCallback.onExtraCallbackWithResult = false;
            this.onNavigationEvent.removeCallbacks(this.onExtraCallback);
        }
        if (this.onWarmupCompleted > 0 && SystemClock.uptimeMillis() < this.IAuthTabCallback + this.onWarmupCompleted) {
            this.onExtraCallback.onExtraCallbackWithResult = true;
            this.onNavigationEvent.postAtTime(this.onExtraCallback, this.IAuthTabCallback + this.onWarmupCompleted);
        } else {
            this.onExtraCallback.onWarmupCompleted(this.access000, null);
        }
    }

    void dispatchOnCancelled(AsyncTaskLoader<D>.onWarmupCompleted onwarmupcompleted, D d) {
        onCanceled(d);
        if (this.onExtraCallbackWithResult == onwarmupcompleted) {
            rollbackContentChanged();
            this.IAuthTabCallback = SystemClock.uptimeMillis();
            this.onExtraCallbackWithResult = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(AsyncTaskLoader<D>.onWarmupCompleted onwarmupcompleted, D d) {
        if (this.onExtraCallback != onwarmupcompleted) {
            dispatchOnCancelled(onwarmupcompleted, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.IAuthTabCallback = SystemClock.uptimeMillis();
        this.onExtraCallback = null;
        deliverResult(d);
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.onExtraCallbackWithResult != null;
    }

    public void waitForLoader() throws InterruptedException {
        AsyncTaskLoader<D>.onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.IAuthTabCallback();
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.onExtraCallback != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.onExtraCallback);
            printWriter.print(" waiting=");
            printWriter.println(this.onExtraCallback.onExtraCallbackWithResult);
        }
        if (this.onExtraCallbackWithResult != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.onExtraCallbackWithResult);
            printWriter.print(" waiting=");
            printWriter.println(this.onExtraCallbackWithResult.onExtraCallbackWithResult);
        }
        if (this.onWarmupCompleted != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            setContentPadding.onWarmupCompleted(this.onWarmupCompleted, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            setContentPadding.onExtraCallback(this.IAuthTabCallback, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
