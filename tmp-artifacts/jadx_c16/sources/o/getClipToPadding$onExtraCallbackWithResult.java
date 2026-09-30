package o;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public class getClipToPadding$onExtraCallbackWithResult<T> {
    public final String IAuthTabCallback;
    public final Callable<Task<T>> onExtraCallback;
    public final TaskCompletionSource<T> onExtraCallbackWithResult;
    public final boolean onNavigationEvent;
    public final long onWarmupCompleted;

    private getClipToPadding$onExtraCallbackWithResult(@NonNull String str, @NonNull Callable<Task<T>> callable, boolean z, long j) {
        this.onExtraCallbackWithResult = new TaskCompletionSource<>();
        this.IAuthTabCallback = str;
        this.onExtraCallback = callable;
        this.onNavigationEvent = z;
        this.onWarmupCompleted = j;
    }
}
