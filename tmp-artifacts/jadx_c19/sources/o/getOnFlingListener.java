package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getOnFlingListener {
    private static final addFocusables onNavigationEvent = addFocusables.onExtraCallback(getOnFlingListener.class.getSimpleName());
    private final Class<?> IAuthTabCallback;
    private final hasFixedSize asInterface;
    private Object onWarmupCompleted = null;
    private long onTransact = -1;
    private long onExtraCallback = -1;
    private int asBinder = 0;
    private int IAuthTabCallbackStub = 0;
    private removeOnChildAttachStateChangeListener IAuthTabCallbackDefault = null;
    private int onExtraCallbackWithResult = -1;

    getOnFlingListener(@NonNull hasFixedSize hasfixedsize) {
        this.asInterface = hasfixedsize;
        this.IAuthTabCallback = hasfixedsize.onExtraCallbackWithResult();
    }

    void onExtraCallbackWithResult(@NonNull Object obj, long j, int i2, int i3, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, int i4) {
        this.onWarmupCompleted = obj;
        this.onTransact = j;
        this.onExtraCallback = j;
        this.asBinder = i2;
        this.IAuthTabCallbackStub = i3;
        this.IAuthTabCallbackDefault = removeonchildattachstatechangelistener;
        this.onExtraCallbackWithResult = i4;
    }

    private boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted != null;
    }

    private void onExtraCallback() {
        if (onExtraCallbackWithResult()) {
            return;
        }
        onNavigationEvent.onNavigationEvent(new Object[]{"Frame is dead! time:", Long.valueOf(this.onTransact), "lastTime:", Long.valueOf(this.onExtraCallback)});
        throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously, for the duration of the process() method.");
    }

    public boolean equals(Object obj) {
        return (obj instanceof getOnFlingListener) && ((getOnFlingListener) obj).onTransact == this.onTransact;
    }

    public void onNavigationEvent() {
        if (onExtraCallbackWithResult()) {
            onNavigationEvent.onExtraCallback(new Object[]{"Frame with time", Long.valueOf(this.onTransact), "is being released."});
            Object obj = this.onWarmupCompleted;
            this.onWarmupCompleted = null;
            this.asBinder = 0;
            this.IAuthTabCallbackStub = 0;
            this.onTransact = -1L;
            this.IAuthTabCallbackDefault = null;
            this.onExtraCallbackWithResult = -1;
            this.asInterface.onWarmupCompleted(this, obj);
        }
    }

    public long onWarmupCompleted() {
        onExtraCallback();
        return this.onTransact;
    }
}
