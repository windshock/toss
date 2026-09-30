package o;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import o.getClipToPadding;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class getClipToPadding$1 implements Runnable {
    final /* synthetic */ isNestedScrollingEnabled onExtraCallbackWithResult;
    final /* synthetic */ getClipToPadding.onExtraCallbackWithResult onNavigationEvent;
    final /* synthetic */ getClipToPadding onWarmupCompleted;

    getClipToPadding$1(getClipToPadding getcliptopadding, getClipToPadding.onExtraCallbackWithResult onextracallbackwithresult, isNestedScrollingEnabled isnestedscrollingenabled) {
        this.onWarmupCompleted = getcliptopadding;
        this.onNavigationEvent = onextracallbackwithresult;
        this.onExtraCallbackWithResult = isnestedscrollingenabled;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            getClipToPadding.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{this.onNavigationEvent.IAuthTabCallback.toUpperCase(), "- Executing."});
            getClipToPadding.onNavigationEvent((Task) this.onNavigationEvent.onExtraCallback.call(), this.onExtraCallbackWithResult, new OnCompleteListener<T>() { // from class: o.getClipToPadding$1.5
                public void onComplete(@NonNull Task<T> task) {
                    Exception exception = task.getException();
                    if (exception != null) {
                        getClipToPadding.onExtraCallbackWithResult.onWarmupCompleted(new Object[]{getClipToPadding$1.this.onNavigationEvent.IAuthTabCallback.toUpperCase(), "- Finished with ERROR.", exception});
                        getClipToPadding$1 getcliptopadding_1 = getClipToPadding$1.this;
                        getClipToPadding.onExtraCallbackWithResult onextracallbackwithresult = getcliptopadding_1.onNavigationEvent;
                        if (onextracallbackwithresult.onNavigationEvent) {
                            getcliptopadding_1.onWarmupCompleted.onWarmupCompleted.onNavigationEvent(onextracallbackwithresult.IAuthTabCallback, exception);
                        }
                        getClipToPadding$1.this.onNavigationEvent.onExtraCallbackWithResult.trySetException(exception);
                    } else if (task.isCanceled()) {
                        getClipToPadding.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{getClipToPadding$1.this.onNavigationEvent.IAuthTabCallback.toUpperCase(), "- Finished because ABORTED."});
                        getClipToPadding$1.this.onNavigationEvent.onExtraCallbackWithResult.trySetException(new CancellationException());
                    } else {
                        getClipToPadding.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{getClipToPadding$1.this.onNavigationEvent.IAuthTabCallback.toUpperCase(), "- Finished."});
                        getClipToPadding$1.this.onNavigationEvent.onExtraCallbackWithResult.trySetResult(task.getResult());
                    }
                    synchronized (getClipToPadding$1.this.onWarmupCompleted.IAuthTabCallback) {
                        getClipToPadding$1 getcliptopadding_12 = getClipToPadding$1.this;
                        getClipToPadding.IAuthTabCallback(getcliptopadding_12.onWarmupCompleted, getcliptopadding_12.onNavigationEvent);
                    }
                }
            });
        } catch (Exception e) {
            getClipToPadding.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{this.onNavigationEvent.IAuthTabCallback.toUpperCase(), "- Finished with ERROR.", e});
            getClipToPadding.onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            if (onextracallbackwithresult.onNavigationEvent) {
                this.onWarmupCompleted.onWarmupCompleted.onNavigationEvent(onextracallbackwithresult.IAuthTabCallback, e);
            }
            this.onNavigationEvent.onExtraCallbackWithResult.trySetException(e);
            synchronized (this.onWarmupCompleted.IAuthTabCallback) {
                getClipToPadding.IAuthTabCallback(this.onWarmupCompleted, this.onNavigationEvent);
            }
        }
    }
}
