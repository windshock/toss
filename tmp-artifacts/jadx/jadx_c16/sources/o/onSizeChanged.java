package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class onSizeChanged {
    protected Exception onExtraCallbackWithResult;
    addRecyclerListener.IAuthTabCallback onNavigationEvent;
    onExtraCallbackWithResult onWarmupCompleted;

    public abstract void onExtraCallbackWithResult();

    public onSizeChanged(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        this.onNavigationEvent = iAuthTabCallback;
        this.onWarmupCompleted = onextracallbackwithresult;
    }

    protected void onWarmupCompleted(boolean z) {
        onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.IAuthTabCallback(z);
        }
    }

    protected void onWarmupCompleted() {
        onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.IAuthTabCallback(this.onNavigationEvent, this.onExtraCallbackWithResult);
            this.onWarmupCompleted = null;
            this.onNavigationEvent = null;
        }
    }
}
