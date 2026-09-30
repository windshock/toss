package o;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isAdapterPositionUnknown {
    private float IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private float access000;
    private GestureDetector access100;
    private long asBinder;
    private float asInterface;
    private int extraCallback;
    private float extraCallbackWithResult;
    private final Handler getInterfaceDescriptor;
    private long onActivityLayout;
    private boolean onActivityResized;
    private int onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private float onNavigationEvent;
    private boolean onPostMessage;
    private float onTransact;
    private float onWarmupCompleted;
    private final onNavigationEvent readTypedObject;
    private float writeTypedObject;

    public interface onNavigationEvent {
        void onExtraCallback(isAdapterPositionUnknown isadapterpositionunknown);

        boolean onNavigationEvent(isAdapterPositionUnknown isadapterpositionunknown);

        boolean onWarmupCompleted(isAdapterPositionUnknown isadapterpositionunknown);
    }

    public isAdapterPositionUnknown(Context context, onNavigationEvent onnavigationevent) {
        this(context, onnavigationevent, null);
    }

    public isAdapterPositionUnknown(Context context, onNavigationEvent onnavigationevent, Handler handler) {
        this.onExtraCallback = 0;
        this.onExtraCallbackWithResult = context;
        this.readTypedObject = onnavigationevent;
        this.onMessageChannelReady = ViewConfiguration.get(context).getScaledTouchSlop() << 1;
        this.extraCallback = 0;
        this.getInterfaceDescriptor = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            IAuthTabCallback(true);
        }
        if (i > 22) {
            onExtraCallback(true);
        }
    }

    public boolean IAuthTabCallback(MotionEvent motionEvent) {
        float f;
        float f2;
        this.asBinder = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.onActivityResized) {
            this.access100.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z = (motionEvent.getButtonState() & 32) != 0;
        boolean z2 = this.onExtraCallback == 2 && !z;
        boolean z3 = actionMasked == 1 || actionMasked == 3 || z2;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.IAuthTabCallback_Parcel) {
                this.readTypedObject.onExtraCallback(this);
                this.IAuthTabCallback_Parcel = false;
                this.access000 = 0.0f;
                this.onExtraCallback = 0;
            } else if (onTransact() && z3) {
                this.IAuthTabCallback_Parcel = false;
                this.access000 = 0.0f;
                this.onExtraCallback = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.IAuthTabCallback_Parcel && this.onPostMessage && !onTransact() && !z3 && z) {
            this.IAuthTabCallback = motionEvent.getX();
            this.onNavigationEvent = motionEvent.getY();
            this.onExtraCallback = 2;
            this.access000 = 0.0f;
        }
        boolean z4 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2;
        boolean z5 = actionMasked == 6;
        int actionIndex = z5 ? motionEvent.getActionIndex() : -1;
        int i = z5 ? pointerCount - 1 : pointerCount;
        if (onTransact()) {
            f2 = this.IAuthTabCallback;
            f = this.onNavigationEvent;
            if (motionEvent.getY() < f) {
                this.IAuthTabCallbackDefault = true;
            } else {
                this.IAuthTabCallbackDefault = false;
            }
        } else {
            float x = 0.0f;
            float y = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    x += motionEvent.getX(i2);
                    y += motionEvent.getY(i2);
                }
            }
            float f3 = i;
            float f4 = x / f3;
            f = y / f3;
            f2 = f4;
        }
        float fAbs2 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                fAbs += Math.abs(motionEvent.getX(i3) - f2);
                fAbs2 += Math.abs(motionEvent.getY(i3) - f);
            }
        }
        float f5 = i;
        float f6 = (fAbs / f5) * 2.0f;
        float f7 = (fAbs2 / f5) * 2.0f;
        float fHypot = onTransact() ? f7 : (float) Math.hypot(f6, f7);
        boolean z6 = this.IAuthTabCallback_Parcel;
        this.onTransact = f2;
        this.IAuthTabCallbackStubProxy = f;
        if (!onTransact() && this.IAuthTabCallback_Parcel && (fHypot < this.extraCallback || z4)) {
            this.readTypedObject.onExtraCallback(this);
            this.IAuthTabCallback_Parcel = false;
            this.access000 = fHypot;
        }
        if (z4) {
            this.IAuthTabCallbackStub = f6;
            this.writeTypedObject = f6;
            this.asInterface = f7;
            this.extraCallbackWithResult = f7;
            this.onWarmupCompleted = fHypot;
            this.ICustomTabsCallback = fHypot;
            this.access000 = fHypot;
        }
        int i4 = onTransact() ? this.onMessageChannelReady : this.extraCallback;
        if (!this.IAuthTabCallback_Parcel && fHypot >= i4 && (z6 || Math.abs(fHypot - this.access000) > this.onMessageChannelReady)) {
            this.IAuthTabCallbackStub = f6;
            this.writeTypedObject = f6;
            this.asInterface = f7;
            this.extraCallbackWithResult = f7;
            this.onWarmupCompleted = fHypot;
            this.ICustomTabsCallback = fHypot;
            this.onActivityLayout = this.asBinder;
            this.IAuthTabCallback_Parcel = this.readTypedObject.onNavigationEvent(this);
        }
        if (actionMasked == 2) {
            this.IAuthTabCallbackStub = f6;
            this.asInterface = f7;
            this.onWarmupCompleted = fHypot;
            if (!this.IAuthTabCallback_Parcel || this.readTypedObject.onWarmupCompleted(this)) {
                this.writeTypedObject = this.IAuthTabCallbackStub;
                this.extraCallbackWithResult = this.asInterface;
                this.ICustomTabsCallback = this.onWarmupCompleted;
                this.onActivityLayout = this.asBinder;
            }
        }
        return true;
    }

    private boolean onTransact() {
        return this.onExtraCallback != 0;
    }

    public void IAuthTabCallback(boolean z) {
        this.onActivityResized = z;
        if (z && this.access100 == null) {
            this.access100 = new GestureDetector(this.onExtraCallbackWithResult, new GestureDetector.SimpleOnGestureListener() { // from class: o.isAdapterPositionUnknown.4
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    isAdapterPositionUnknown.this.IAuthTabCallback = motionEvent.getX();
                    isAdapterPositionUnknown.this.onNavigationEvent = motionEvent.getY();
                    isAdapterPositionUnknown.this.onExtraCallback = 1;
                    return true;
                }
            }, this.getInterfaceDescriptor);
        }
    }

    public void onExtraCallback(boolean z) {
        this.onPostMessage = z;
    }

    public float IAuthTabCallback() {
        return this.onTransact;
    }

    public float onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStubProxy;
    }

    public float onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public float onNavigationEvent() {
        if (onTransact()) {
            boolean z = this.IAuthTabCallbackDefault;
            boolean z2 = (z && this.onWarmupCompleted < this.ICustomTabsCallback) || (!z && this.onWarmupCompleted > this.ICustomTabsCallback);
            float fAbs = Math.abs(1.0f - (this.onWarmupCompleted / this.ICustomTabsCallback)) * 0.5f;
            if (this.ICustomTabsCallback <= this.onMessageChannelReady) {
                return 1.0f;
            }
            return z2 ? fAbs + 1.0f : 1.0f - fAbs;
        }
        float f = this.ICustomTabsCallback;
        if (f > 0.0f) {
            return this.onWarmupCompleted / f;
        }
        return 1.0f;
    }

    public long onWarmupCompleted() {
        return this.asBinder - this.onActivityLayout;
    }

    public double asBinder() {
        return onWarmupCompleted() / 1000.0d;
    }
}
