package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class removeOnScrollListener {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(removeOnScrollListener.class.getSimpleName());
    protected Exception onExtraCallback;
    private final onExtraCallback onExtraCallbackWithResult;
    addOnChildAttachStateChangeListener$onWarmupCompleted onNavigationEvent;
    private final Object asInterface = new Object();
    private int IAuthTabCallback = 0;

    protected abstract void onWarmupCompleted();

    protected abstract void onWarmupCompleted(boolean z);

    removeOnScrollListener(@Nullable onExtraCallback onextracallback) {
        this.onExtraCallbackWithResult = onextracallback;
    }

    public final void onExtraCallbackWithResult(@NonNull addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted) {
        synchronized (this.asInterface) {
            int i = this.IAuthTabCallback;
            if (i != 0) {
                onWarmupCompleted.onNavigationEvent(new Object[]{"start:", "called twice, or while stopping! Ignoring. state:", Integer.valueOf(i)});
                return;
            }
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"start:", "Changed state to STATE_RECORDING"});
            this.IAuthTabCallback = 1;
            this.onNavigationEvent = addonchildattachstatechangelistener_onwarmupcompleted;
            onWarmupCompleted();
        }
    }

    public final void onExtraCallbackWithResult(boolean z) {
        synchronized (this.asInterface) {
            if (this.IAuthTabCallback == 0) {
                onWarmupCompleted.onNavigationEvent(new Object[]{"stop:", "called twice, or called before start! Ignoring. isCameraShutdown:", Boolean.valueOf(z)});
                return;
            }
            onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"stop:", "Changed state to STATE_STOPPING"});
            this.IAuthTabCallback = 2;
            onWarmupCompleted(z);
        }
    }

    public boolean IAuthTabCallbackDefault() {
        boolean z;
        synchronized (this.asInterface) {
            z = this.IAuthTabCallback != 0;
        }
        return z;
    }

    protected final void onNavigationEvent() {
        synchronized (this.asInterface) {
            if (!IAuthTabCallbackDefault()) {
                onWarmupCompleted.onWarmupCompleted(new Object[]{"dispatchResult:", "Called, but not recording! Aborting."});
                return;
            }
            addFocusables addfocusables = onWarmupCompleted;
            addfocusables.onExtraCallbackWithResult(new Object[]{"dispatchResult:", "Changed state to STATE_IDLE."});
            this.IAuthTabCallback = 0;
            addfocusables.onExtraCallbackWithResult(new Object[]{"dispatchResult:", "About to dispatch result:", this.onNavigationEvent, this.onExtraCallback});
            onExtraCallback onextracallback = this.onExtraCallbackWithResult;
            if (onextracallback != null) {
                onextracallback.IAuthTabCallback(this.onNavigationEvent, this.onExtraCallback);
            }
            this.onNavigationEvent = null;
            this.onExtraCallback = null;
        }
    }

    protected void IAuthTabCallback() {
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"dispatchVideoRecordingStart:", "About to dispatch."});
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback != null) {
            onextracallback.writeTypedList();
        }
    }

    protected void onExtraCallback() {
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"dispatchVideoRecordingEnd:", "About to dispatch."});
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback != null) {
            onextracallback.IAuthTabCallbackStubProxy();
        }
    }
}
