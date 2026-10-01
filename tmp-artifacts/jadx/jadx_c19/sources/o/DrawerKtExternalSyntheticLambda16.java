package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda16 {
    private long IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private float access000;
    private Surface access100;
    private long asBinder;
    private long asInterface;
    private boolean getInterfaceDescriptor;
    private final onNavigationEvent onExtraCallback;
    private float onExtraCallbackWithResult;
    private final DismissStateCompanionExternalSyntheticLambda1 onNavigationEvent = new DismissStateCompanionExternalSyntheticLambda1();
    private long onTransact;
    private int onWarmupCompleted;
    private long readTypedObject;
    private final IAuthTabCallback writeTypedObject;

    public DrawerKtExternalSyntheticLambda16(@Nullable Context context) {
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        this.onExtraCallback = onnavigationeventOnExtraCallbackWithResult;
        this.writeTypedObject = onnavigationeventOnExtraCallbackWithResult != null ? IAuthTabCallback.onExtraCallback() : null;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
        this.readTypedObject = -9223372036854775807L;
        this.onExtraCallbackWithResult = -1.0f;
        this.IAuthTabCallbackStub = 1.0f;
        this.onWarmupCompleted = 0;
    }

    public void IAuthTabCallback(int i2) {
        if (this.onWarmupCompleted == i2) {
            return;
        }
        this.onWarmupCompleted = i2;
        onExtraCallback(true);
    }

    public void onNavigationEvent() {
        this.getInterfaceDescriptor = true;
        IAuthTabCallback();
        if (this.onExtraCallback != null) {
            ((IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedObject)).onNavigationEvent();
            this.onExtraCallback.onWarmupCompleted();
        }
        onExtraCallback(false);
    }

    public void onNavigationEvent(@Nullable Surface surface) {
        if (this.access100 == surface) {
            return;
        }
        onWarmupCompleted();
        this.access100 = surface;
        onExtraCallback(true);
    }

    public void onExtraCallback() {
        IAuthTabCallback();
    }

    public void onExtraCallback(float f) {
        this.IAuthTabCallbackStub = f;
        IAuthTabCallback();
        onExtraCallback(false);
    }

    public void onNavigationEvent(float f) {
        this.onExtraCallbackWithResult = f;
        this.onNavigationEvent.asBinder();
        asBinder();
    }

    public void IAuthTabCallback(long j) {
        long j2 = this.asInterface;
        if (j2 != -1) {
            this.IAuthTabCallbackDefault = j2;
            this.onTransact = this.asBinder;
        }
        this.IAuthTabCallback++;
        this.onNavigationEvent.onNavigationEvent(j * 1000);
        asBinder();
    }

    public void onExtraCallbackWithResult() {
        this.getInterfaceDescriptor = false;
        onNavigationEvent onnavigationevent = this.onExtraCallback;
        if (onnavigationevent != null) {
            onnavigationevent.onNavigationEvent();
            ((IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedObject)).IAuthTabCallback();
        }
        onWarmupCompleted();
    }

    public long onNavigationEvent(long j) {
        long j2;
        if (this.IAuthTabCallbackDefault == -1 || !this.onNavigationEvent.onExtraCallback()) {
            j2 = j;
        } else {
            long jOnNavigationEvent = this.onTransact + ((long) ((this.onNavigationEvent.onNavigationEvent() * (this.IAuthTabCallback - this.IAuthTabCallbackDefault)) / this.IAuthTabCallbackStub));
            if (onNavigationEvent(j, jOnNavigationEvent)) {
                j2 = jOnNavigationEvent;
            } else {
                IAuthTabCallback();
                j2 = j;
            }
        }
        this.asInterface = this.IAuthTabCallback;
        this.asBinder = j2;
        IAuthTabCallback iAuthTabCallback = this.writeTypedObject;
        if (iAuthTabCallback != null && this.IAuthTabCallbackStubProxy != -9223372036854775807L) {
            long j3 = iAuthTabCallback.onExtraCallback;
            if (j3 != -9223372036854775807L) {
                return onExtraCallback(j2, j3, this.IAuthTabCallbackStubProxy) - this.readTypedObject;
            }
        }
        return j2;
    }

    private void IAuthTabCallback() {
        this.IAuthTabCallback = 0L;
        this.IAuthTabCallbackDefault = -1L;
        this.asInterface = -1L;
    }

    private static boolean onNavigationEvent(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void asBinder() {
        if (Build.VERSION.SDK_INT < 30 || this.access100 == null) {
            return;
        }
        float fOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallback() ? this.onNavigationEvent.onExtraCallbackWithResult() : this.onExtraCallbackWithResult;
        float f = this.access000;
        if (fOnExtraCallbackWithResult != f) {
            if (fOnExtraCallbackWithResult != -1.0f && f != -1.0f) {
                if (Math.abs(fOnExtraCallbackWithResult - this.access000) < ((!this.onNavigationEvent.onExtraCallback() || this.onNavigationEvent.onWarmupCompleted() < 5000000000L) ? 1.0f : 0.02f)) {
                    return;
                }
            } else if (fOnExtraCallbackWithResult == -1.0f && this.onNavigationEvent.IAuthTabCallback() < 30) {
                return;
            }
            this.access000 = fOnExtraCallbackWithResult;
            onExtraCallback(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.access100) == null || this.onWarmupCompleted == Integer.MIN_VALUE) {
            return;
        }
        if (this.getInterfaceDescriptor) {
            float f2 = this.access000;
            f = f2 != -1.0f ? f2 * this.IAuthTabCallbackStub : 0.0f;
        }
        if (z || this.IAuthTabCallback_Parcel != f) {
            this.IAuthTabCallback_Parcel = f;
            onExtraCallback.onExtraCallback(surface, f);
        }
    }

    private void onWarmupCompleted() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.access100) == null || this.onWarmupCompleted == Integer.MIN_VALUE || this.IAuthTabCallback_Parcel == 0.0f) {
            return;
        }
        this.IAuthTabCallback_Parcel = 0.0f;
        onExtraCallback.onExtraCallback(surface, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.IAuthTabCallbackStubProxy = refreshRate;
            this.readTypedObject = (refreshRate * 80) / 100;
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.IAuthTabCallbackStubProxy = -9223372036854775807L;
            this.readTypedObject = -9223372036854775807L;
        }
    }

    private static long onExtraCallback(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private onNavigationEvent onExtraCallbackWithResult(@Nullable Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new onNavigationEvent(displayManager);
    }

    static final class onExtraCallback {
        public static void onExtraCallback(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    final class onNavigationEvent implements DisplayManager.DisplayListener {
        private final DisplayManager IAuthTabCallback;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        public onNavigationEvent(DisplayManager displayManager) {
            this.IAuthTabCallback = displayManager;
        }

        public void onWarmupCompleted() {
            this.IAuthTabCallback.registerDisplayListener(this, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult());
            DrawerKtExternalSyntheticLambda16.this.onExtraCallback(onExtraCallbackWithResult());
        }

        public void onNavigationEvent() {
            this.IAuthTabCallback.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                DrawerKtExternalSyntheticLambda16.this.onExtraCallback(onExtraCallbackWithResult());
            }
        }

        private Display onExtraCallbackWithResult() {
            return this.IAuthTabCallback.getDisplay(0);
        }
    }

    static final class IAuthTabCallback implements Choreographer.FrameCallback, Handler.Callback {
        private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private Choreographer IAuthTabCallback;
        public volatile long onExtraCallback = -9223372036854775807L;
        private final HandlerThread onNavigationEvent;
        private int onTransact;
        private final Handler onWarmupCompleted;

        public static IAuthTabCallback onExtraCallback() {
            return onExtraCallbackWithResult;
        }

        private IAuthTabCallback() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.onNavigationEvent = handlerThread;
            handlerThread.start();
            Handler handlerOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(handlerThread.getLooper(), this);
            this.onWarmupCompleted = handlerOnWarmupCompleted;
            handlerOnWarmupCompleted.sendEmptyMessage(1);
        }

        public void onNavigationEvent() {
            this.onWarmupCompleted.sendEmptyMessage(2);
        }

        public void IAuthTabCallback() {
            this.onWarmupCompleted.sendEmptyMessage(3);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.onExtraCallback = j;
            ((Choreographer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                onWarmupCompleted();
                return true;
            }
            if (i2 == 2) {
                onExtraCallbackWithResult();
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            asBinder();
            return true;
        }

        private void onWarmupCompleted() {
            try {
                this.IAuthTabCallback = Choreographer.getInstance();
            } catch (RuntimeException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        private void onExtraCallbackWithResult() {
            Choreographer choreographer = this.IAuthTabCallback;
            if (choreographer != null) {
                int i2 = this.onTransact + 1;
                this.onTransact = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void asBinder() {
            Choreographer choreographer = this.IAuthTabCallback;
            if (choreographer != null) {
                int i2 = this.onTransact - 1;
                this.onTransact = i2;
                if (i2 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.onExtraCallback = -9223372036854775807L;
                }
            }
        }
    }
}
