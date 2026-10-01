package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RotationGestureDetector {
    private float IAuthTabCallback;
    private double IAuthTabCallbackDefault;
    private double IAuthTabCallbackStub;
    private final int[] asBinder = new int[2];
    private long asInterface;
    private final OnRotationGestureListener onExtraCallback;
    private long onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onTransact;
    private float onWarmupCompleted;

    public interface OnRotationGestureListener {
        void IAuthTabCallback(@NotNull RotationGestureDetector rotationGestureDetector);

        boolean onExtraCallbackWithResult(@NotNull RotationGestureDetector rotationGestureDetector);

        boolean onNavigationEvent(@NotNull RotationGestureDetector rotationGestureDetector);
    }

    public RotationGestureDetector(@Nullable OnRotationGestureListener onRotationGestureListener) {
        this.onExtraCallback = onRotationGestureListener;
    }

    public final double onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public final float onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final float onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final long IAuthTabCallback() {
        return this.onExtraCallbackWithResult - this.asInterface;
    }

    private final void IAuthTabCallback(MotionEvent motionEvent) {
        this.asInterface = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.asBinder[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.asBinder[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        float x2 = motionEvent.getX(iFindPointerIndex2);
        float y2 = motionEvent.getY(iFindPointerIndex2);
        this.IAuthTabCallback = (x + x2) * 0.5f;
        this.onWarmupCompleted = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        onExtraCallback(d);
        double d2 = Double.isNaN(this.IAuthTabCallbackDefault) ? 0.0d : this.IAuthTabCallbackDefault - d;
        this.IAuthTabCallbackStub = d2;
        this.IAuthTabCallbackDefault = d;
        if (d2 > 3.141592653589793d) {
            this.IAuthTabCallbackStub = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.IAuthTabCallbackStub = d2 + 3.141592653589793d;
        }
        double d3 = this.IAuthTabCallbackStub;
        if (d3 > 1.5707963267948966d) {
            this.IAuthTabCallbackStub = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.IAuthTabCallbackStub = d3 + 3.141592653589793d;
        }
    }

    private final void asBinder() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
    }

    private final void onExtraCallback(double d) {
        if (this.onTransact) {
            this.IAuthTabCallbackDefault = d;
            this.onTransact = false;
        }
    }

    private final void onNavigationEvent() {
        if (this.onNavigationEvent) {
            this.onTransact = false;
            this.onNavigationEvent = false;
            OnRotationGestureListener onRotationGestureListener = this.onExtraCallback;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.IAuthTabCallback(this);
            }
        }
    }

    public final boolean onNavigationEvent(@NotNull MotionEvent motionEvent) {
        OnRotationGestureListener onRotationGestureListener;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.onNavigationEvent = false;
            this.asBinder[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.asBinder[1] = -1;
        } else if (actionMasked == 1) {
            onNavigationEvent();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.onNavigationEvent || this.onTransact) {
                    this.asBinder[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    IAuthTabCallback(motionEvent);
                }
                if (!this.onNavigationEvent) {
                    this.onNavigationEvent = true;
                    this.asInterface = motionEvent.getEventTime();
                    this.IAuthTabCallbackDefault = Double.NaN;
                    OnRotationGestureListener onRotationGestureListener2 = this.onExtraCallback;
                    if (onRotationGestureListener2 != null) {
                        onRotationGestureListener2.onExtraCallbackWithResult(this);
                    }
                }
            } else if (actionMasked == 6 && this.onNavigationEvent) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.asBinder;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    asBinder();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    asBinder();
                }
            }
        } else if (this.onNavigationEvent) {
            IAuthTabCallback(motionEvent);
            if (!this.onTransact && (onRotationGestureListener = this.onExtraCallback) != null) {
                onRotationGestureListener.onNavigationEvent(this);
            }
        }
        return true;
    }
}
