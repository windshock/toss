package o;

import android.graphics.ImageFormat;
import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class hasFixedSize<T> {
    protected static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(hasFixedSize.class.getSimpleName());
    private final Class<T> IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private LinkedBlockingQueue<getOnFlingListener> asBinder;
    private getChildPosition onNavigationEvent;
    private int onExtraCallback = -1;
    private removeOnChildAttachStateChangeListener onTransact = null;
    private int onWarmupCompleted = -1;

    protected abstract void IAuthTabCallback(@NonNull T t, boolean z);

    protected hasFixedSize(int i2, @NonNull Class<T> cls) {
        this.IAuthTabCallbackStub = i2;
        this.IAuthTabCallback = cls;
        this.asBinder = new LinkedBlockingQueue<>(i2);
    }

    public final int onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    public final int IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final Class<T> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallbackWithResult(int i2, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull getChildPosition getchildposition) {
        onExtraCallback();
        this.onTransact = removeonchildattachstatechangelistener;
        this.onWarmupCompleted = i2;
        this.onExtraCallback = (int) Math.ceil(((removeonchildattachstatechangelistener.onExtraCallbackWithResult() * removeonchildattachstatechangelistener.onExtraCallback()) * ImageFormat.getBitsPerPixel(i2)) / 8.0d);
        for (int i3 = 0; i3 < onNavigationEvent(); i3++) {
            this.asBinder.offer(new getOnFlingListener(this));
        }
        this.onNavigationEvent = getchildposition;
    }

    protected boolean onExtraCallback() {
        return this.onTransact != null;
    }

    public getOnFlingListener onExtraCallbackWithResult(@NonNull T t, long j) {
        if (!onExtraCallback()) {
            throw new IllegalStateException("Can't call getFrame() after releasing or before setUp.");
        }
        getOnFlingListener getonflinglistenerPoll = this.asBinder.poll();
        if (getonflinglistenerPoll != null) {
            onExtraCallbackWithResult.onExtraCallback(new Object[]{"getFrame for time:", Long.valueOf(j), "RECYCLING."});
            getChildPosition getchildposition = this.onNavigationEvent;
            com.otaliastudios.cameraview.engine.offset.Reference reference = com.otaliastudios.cameraview.engine.offset.Reference.SENSOR;
            com.otaliastudios.cameraview.engine.offset.Reference reference2 = com.otaliastudios.cameraview.engine.offset.Reference.OUTPUT;
            getChildViewHolder getchildviewholder = getChildViewHolder.RELATIVE_TO_SENSOR;
            getonflinglistenerPoll.onExtraCallbackWithResult(t, j, getchildposition.onWarmupCompleted(reference, reference2, getchildviewholder), this.onNavigationEvent.onWarmupCompleted(reference, com.otaliastudios.cameraview.engine.offset.Reference.VIEW, getchildviewholder), this.onTransact, this.onWarmupCompleted);
            return getonflinglistenerPoll;
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"getFrame for time:", Long.valueOf(j), "NOT AVAILABLE."});
        IAuthTabCallback(t, false);
        return null;
    }

    void onWarmupCompleted(@NonNull getOnFlingListener getonflinglistener, @NonNull T t) {
        if (onExtraCallback()) {
            IAuthTabCallback(t, this.asBinder.offer(getonflinglistener));
        }
    }

    public void onWarmupCompleted() {
        if (!onExtraCallback()) {
            onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"release called twice. Ignoring."});
            return;
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"release: Clearing the frame and buffer queue."});
        this.asBinder.clear();
        this.onExtraCallback = -1;
        this.onTransact = null;
        this.onWarmupCompleted = -1;
        this.onNavigationEvent = null;
    }
}
