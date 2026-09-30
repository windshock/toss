package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.R;
import com.bumptech.glide.request.Request;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.markHierarchyDirty;
import o.setTransitionListener;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {
    private static int onExtraCallbackWithResult = R.id.glide_custom_view_target_tag;
    private static boolean onWarmupCompleted;
    public final T IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean onExtraCallback;
    private View.OnAttachStateChangeListener onNavigationEvent;
    private final IAuthTabCallback onTransact;

    public ViewTarget(@NonNull T t) {
        this.IAuthTabCallback = (T) markHierarchyDirty.onExtraCallbackWithResult(t);
        this.onTransact = new IAuthTabCallback(t);
    }

    @Deprecated
    public ViewTarget(@NonNull T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }

    public final ViewTarget<T, Z> clearOnDetach() {
        if (this.onNavigationEvent != null) {
            return this;
        }
        this.onNavigationEvent = new View.OnAttachStateChangeListener() { // from class: com.bumptech.glide.request.target.ViewTarget.5
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ViewTarget.this.resumeMyRequest();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ViewTarget.this.pauseMyRequest();
            }
        };
        maybeAddAttachStateListener();
        return this;
    }

    void resumeMyRequest() {
        Request request = getRequest();
        if (request == null || !request.onExtraCallback()) {
            return;
        }
        request.onNavigationEvent();
    }

    void pauseMyRequest() {
        Request request = getRequest();
        if (request != null) {
            this.IAuthTabCallbackDefault = true;
            request.onExtraCallbackWithResult();
            this.IAuthTabCallbackDefault = false;
        }
    }

    public final ViewTarget<T, Z> waitForLayout() {
        this.onTransact.onExtraCallbackWithResult = true;
        return this;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.onNavigationEvent;
        if (onAttachStateChangeListener == null || this.onExtraCallback) {
            return;
        }
        this.IAuthTabCallback.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.onExtraCallback = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.onNavigationEvent;
        if (onAttachStateChangeListener == null || !this.onExtraCallback) {
            return;
        }
        this.IAuthTabCallback.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.onExtraCallback = false;
    }

    public T getView() {
        return this.IAuthTabCallback;
    }

    @Override // o.setTransitionDuration
    public void getSize(@NonNull setTransitionListener settransitionlistener) {
        this.onTransact.onExtraCallback(settransitionlistener);
    }

    @Override // o.setTransitionDuration
    public void removeCallback(@NonNull setTransitionListener settransitionlistener) {
        this.onTransact.onExtraCallbackWithResult(settransitionlistener);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        this.onTransact.onWarmupCompleted();
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void setRequest(@Nullable Request request) {
        setTag(request);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public Request getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        return "Target for: " + this.IAuthTabCallback;
    }

    private void setTag(@Nullable Object obj) {
        onWarmupCompleted = true;
        this.IAuthTabCallback.setTag(onExtraCallbackWithResult, obj);
    }

    private Object getTag() {
        return this.IAuthTabCallback.getTag(onExtraCallbackWithResult);
    }

    @Deprecated
    public static void setTagId(int i2) {
        if (onWarmupCompleted) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        onExtraCallbackWithResult = i2;
    }

    static final class IAuthTabCallback {
        static Integer onWarmupCompleted;
        private final List<setTransitionListener> IAuthTabCallback = new ArrayList();
        private onNavigationEvent onExtraCallback;
        boolean onExtraCallbackWithResult;
        private final View onNavigationEvent;

        private boolean onNavigationEvent(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        IAuthTabCallback(@NonNull View view) {
            this.onNavigationEvent = view;
        }

        private static int onWarmupCompleted(@NonNull Context context) {
            if (onWarmupCompleted == null) {
                Display defaultDisplay = ((WindowManager) markHierarchyDirty.onExtraCallbackWithResult((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                onWarmupCompleted = Integer.valueOf(Math.max(point.x, point.y));
            }
            return onWarmupCompleted.intValue();
        }

        private void onWarmupCompleted(int i2, int i3) {
            Iterator it = new ArrayList(this.IAuthTabCallback).iterator();
            while (it.hasNext()) {
                ((setTransitionListener) it.next()).onNavigationEvent(i2, i3);
            }
        }

        void IAuthTabCallback() {
            if (this.IAuthTabCallback.isEmpty()) {
                return;
            }
            int iOnNavigationEvent = onNavigationEvent();
            int iOnExtraCallback = onExtraCallback();
            if (IAuthTabCallback(iOnNavigationEvent, iOnExtraCallback)) {
                onWarmupCompleted(iOnNavigationEvent, iOnExtraCallback);
                onWarmupCompleted();
            }
        }

        void onExtraCallback(@NonNull setTransitionListener settransitionlistener) {
            int iOnNavigationEvent = onNavigationEvent();
            int iOnExtraCallback = onExtraCallback();
            if (IAuthTabCallback(iOnNavigationEvent, iOnExtraCallback)) {
                settransitionlistener.onNavigationEvent(iOnNavigationEvent, iOnExtraCallback);
                return;
            }
            if (!this.IAuthTabCallback.contains(settransitionlistener)) {
                this.IAuthTabCallback.add(settransitionlistener);
            }
            if (this.onExtraCallback == null) {
                ViewTreeObserver viewTreeObserver = this.onNavigationEvent.getViewTreeObserver();
                onNavigationEvent onnavigationevent = new onNavigationEvent(this);
                this.onExtraCallback = onnavigationevent;
                viewTreeObserver.addOnPreDrawListener(onnavigationevent);
            }
        }

        void onExtraCallbackWithResult(@NonNull setTransitionListener settransitionlistener) {
            this.IAuthTabCallback.remove(settransitionlistener);
        }

        void onWarmupCompleted() {
            ViewTreeObserver viewTreeObserver = this.onNavigationEvent.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.onExtraCallback);
            }
            this.onExtraCallback = null;
            this.IAuthTabCallback.clear();
        }

        private boolean IAuthTabCallback(int i2, int i3) {
            return onNavigationEvent(i2) && onNavigationEvent(i3);
        }

        private int onExtraCallback() {
            int paddingTop = this.onNavigationEvent.getPaddingTop();
            int paddingBottom = this.onNavigationEvent.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.onNavigationEvent.getLayoutParams();
            return IAuthTabCallback(this.onNavigationEvent.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        private int onNavigationEvent() {
            int paddingLeft = this.onNavigationEvent.getPaddingLeft();
            int paddingRight = this.onNavigationEvent.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.onNavigationEvent.getLayoutParams();
            return IAuthTabCallback(this.onNavigationEvent.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int IAuthTabCallback(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.onExtraCallbackWithResult && this.onNavigationEvent.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.onNavigationEvent.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            return onWarmupCompleted(this.onNavigationEvent.getContext());
        }

        static final class onNavigationEvent implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<IAuthTabCallback> onWarmupCompleted;

            onNavigationEvent(@NonNull IAuthTabCallback iAuthTabCallback) {
                this.onWarmupCompleted = new WeakReference<>(iAuthTabCallback);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    toString();
                }
                IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted.get();
                if (iAuthTabCallback == null) {
                    return true;
                }
                iAuthTabCallback.IAuthTabCallback();
                return true;
            }
        }
    }
}
