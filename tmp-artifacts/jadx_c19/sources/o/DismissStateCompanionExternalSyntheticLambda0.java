package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DismissStateCompanionExternalSyntheticLambda0 extends Surface {
    private static boolean IAuthTabCallback;
    private static int onWarmupCompleted;
    private final onExtraCallbackWithResult onExtraCallback;
    private boolean onExtraCallbackWithResult;
    public final boolean onNavigationEvent;

    public static boolean onExtraCallback(Context context) {
        boolean z;
        synchronized (DismissStateCompanionExternalSyntheticLambda0.class) {
            if (!IAuthTabCallback) {
                onWarmupCompleted = onNavigationEvent(context);
                IAuthTabCallback = true;
            }
            z = onWarmupCompleted != 0;
        }
        return z;
    }

    public static DismissStateCompanionExternalSyntheticLambda0 onWarmupCompleted(Context context, boolean z) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!z || onExtraCallback(context));
        return new onExtraCallbackWithResult().onNavigationEvent(z ? onWarmupCompleted : 0);
    }

    private DismissStateCompanionExternalSyntheticLambda0(onExtraCallbackWithResult onextracallbackwithresult, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.onExtraCallback = onextracallbackwithresult;
        this.onNavigationEvent = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.onExtraCallback) {
            if (!this.onExtraCallbackWithResult) {
                this.onExtraCallback.onWarmupCompleted();
                this.onExtraCallbackWithResult = true;
            }
        }
    }

    private static int onNavigationEvent(Context context) {
        try {
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.IAuthTabCallback(context)) {
                return TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onTransact() ? 1 : 2;
            }
            return 0;
        } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    static class onExtraCallbackWithResult extends HandlerThread implements Handler.Callback {
        private DismissStateCompanionExternalSyntheticLambda0 IAuthTabCallback;
        private RuntimeException onExtraCallback;
        private Error onExtraCallbackWithResult;
        private TextFieldDecoratorModifierNodeExternalSyntheticLambda13 onNavigationEvent;
        private Handler onWarmupCompleted;

        public onExtraCallbackWithResult() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public DismissStateCompanionExternalSyntheticLambda0 onNavigationEvent(int i2) {
            boolean z;
            start();
            this.onWarmupCompleted = new Handler(getLooper(), this);
            this.onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda13(this.onWarmupCompleted);
            synchronized (this) {
                z = false;
                this.onWarmupCompleted.obtainMessage(1, i2, 0).sendToTarget();
                while (this.IAuthTabCallback == null && this.onExtraCallback == null && this.onExtraCallbackWithResult == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.onExtraCallback;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.onExtraCallbackWithResult;
            if (error != null) {
                throw error;
            }
            return (DismissStateCompanionExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        }

        public void onWarmupCompleted() {
            this.onWarmupCompleted.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        IAuthTabCallback();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    IAuthTabCallback(message.arg1);
                } catch (Error e) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.onExtraCallbackWithResult = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.onExtraCallback = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e3) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.onExtraCallback = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
                synchronized (this) {
                    notify();
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void IAuthTabCallback(int i2) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
            this.onNavigationEvent.onNavigationEvent(i2);
            this.IAuthTabCallback = new DismissStateCompanionExternalSyntheticLambda0(this, this.onNavigationEvent.onWarmupCompleted(), i2 != 0);
        }

        private void IAuthTabCallback() {
            this.onNavigationEvent.onNavigationEvent();
        }
    }
}
