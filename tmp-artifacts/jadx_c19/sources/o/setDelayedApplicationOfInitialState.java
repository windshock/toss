package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class setDelayedApplicationOfInitialState<T> implements setTransitionDuration<T> {
    private Request IAuthTabCallback;
    private final int onExtraCallback;
    private final int onNavigationEvent;

    @Override // o.Layer
    public void onDestroy() {
    }

    @Override // o.setTransitionDuration
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // o.setTransitionDuration
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // o.Layer
    public void onStart() {
    }

    @Override // o.Layer
    public void onStop() {
    }

    @Override // o.setTransitionDuration
    public final void removeCallback(@NonNull setTransitionListener settransitionlistener) {
    }

    public setDelayedApplicationOfInitialState() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public setDelayedApplicationOfInitialState(int i2, int i3) {
        if (!applyConstraintsFromLayoutParams.onExtraCallback(i2, i3)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i2 + " and height: " + i3);
        }
        this.onExtraCallback = i2;
        this.onNavigationEvent = i3;
    }

    @Override // o.setTransitionDuration
    public final void getSize(@NonNull setTransitionListener settransitionlistener) {
        settransitionlistener.onNavigationEvent(this.onExtraCallback, this.onNavigationEvent);
    }

    @Override // o.setTransitionDuration
    public final void setRequest(@Nullable Request request) {
        this.IAuthTabCallback = request;
    }

    @Override // o.setTransitionDuration
    public final Request getRequest() {
        return this.IAuthTabCallback;
    }
}
