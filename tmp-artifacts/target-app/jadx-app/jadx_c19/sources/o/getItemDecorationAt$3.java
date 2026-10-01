package o;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes19.dex */
final class getItemDecorationAt$3<T> implements Callable<Task<T>> {
    final /* synthetic */ String IAuthTabCallback;
    final /* synthetic */ getItemDecorationAt onExtraCallback;
    final /* synthetic */ Callable onExtraCallbackWithResult;
    final /* synthetic */ boolean onNavigationEvent;
    final /* synthetic */ getItemDecorationCount onTransact;
    final /* synthetic */ getItemDecorationCount onWarmupCompleted;

    getItemDecorationAt$3(getItemDecorationAt getitemdecorationat, getItemDecorationCount getitemdecorationcount, String str, getItemDecorationCount getitemdecorationcount2, Callable callable, boolean z) {
        this.onExtraCallback = getitemdecorationat;
        this.onWarmupCompleted = getitemdecorationcount;
        this.IAuthTabCallback = str;
        this.onTransact = getitemdecorationcount2;
        this.onExtraCallbackWithResult = callable;
        this.onNavigationEvent = z;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Task<T> call() throws Exception {
        if (this.onExtraCallback.onWarmupCompleted() != this.onWarmupCompleted) {
            getClipToPadding.onExtraCallbackWithResult.onWarmupCompleted(new Object[]{this.IAuthTabCallback.toUpperCase(), "- State mismatch, aborting. current:", this.onExtraCallback.onWarmupCompleted(), "from:", this.onWarmupCompleted, "to:", this.onTransact});
            return Tasks.forCanceled();
        }
        return ((Task) this.onExtraCallbackWithResult.call()).continueWithTask(((getClipToPadding) this.onExtraCallback).onWarmupCompleted.IAuthTabCallback(this.IAuthTabCallback).onNavigationEvent(), new Continuation<T, Task<T>>() { // from class: o.getItemDecorationAt$3.5
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public Task<T> then(@NonNull Task<T> task) {
                if (!task.isSuccessful() && !getItemDecorationAt$3.this.onNavigationEvent) {
                    return task;
                }
                getItemDecorationAt$3 getitemdecorationat_3 = getItemDecorationAt$3.this;
                getItemDecorationAt.onExtraCallbackWithResult(getitemdecorationat_3.onExtraCallback, getitemdecorationat_3.onTransact);
                return task;
            }
        });
    }
}
