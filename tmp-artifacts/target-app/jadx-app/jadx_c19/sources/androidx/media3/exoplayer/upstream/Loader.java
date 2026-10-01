package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.RecordingInputConnection_androidKt;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda10;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda18;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Loader {
    public static final IAuthTabCallback IAuthTabCallback;
    public static final IAuthTabCallback onExtraCallbackWithResult;
    private IOException IAuthTabCallbackDefault;
    private final ReleasableExecutor onTransact;
    private onExtraCallback<? extends onNavigationEvent> onWarmupCompleted;
    public static final IAuthTabCallback onExtraCallback = onExtraCallback(false, -9223372036854775807L);
    public static final IAuthTabCallback onNavigationEvent = onExtraCallback(true, -9223372036854775807L);

    public interface onExtraCallbackWithResult<T extends onNavigationEvent> {
        IAuthTabCallback onExtraCallbackWithResult(T t, long j, long j2, IOException iOException, int i2);

        void onExtraCallbackWithResult(T t, long j, long j2);

        void onNavigationEvent(T t, long j, long j2, boolean z);

        default void onWarmupCompleted(T t, long j, long j2, int i2) {
        }
    }

    public interface onNavigationEvent {
        void IAuthTabCallback();

        void IAuthTabCallbackDefault() throws IOException;
    }

    public interface onWarmupCompleted {
        void IAuthTabCallbackStubProxy();
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        IAuthTabCallback = new IAuthTabCallback(2, j);
        onExtraCallbackWithResult = new IAuthTabCallback(3, j);
    }

    public static final class IAuthTabCallback {
        private final long onExtraCallback;
        private final int onExtraCallbackWithResult;

        private IAuthTabCallback(int i2, long j) {
            this.onExtraCallbackWithResult = i2;
            this.onExtraCallback = j;
        }

        public boolean onExtraCallbackWithResult() {
            int i2 = this.onExtraCallbackWithResult;
            return i2 == 0 || i2 == 1;
        }
    }

    public Loader(String str) {
        this(ReleasableExecutor.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult("ExoPlayer:Loader:" + str), new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.upstream.Loader$$ExternalSyntheticLambda0
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public Loader(ReleasableExecutor releasableExecutor) {
        this.onTransact = releasableExecutor;
    }

    public static IAuthTabCallback onExtraCallback(boolean z, long j) {
        return new IAuthTabCallback(z ? 1 : 0, j);
    }

    public boolean onExtraCallback() {
        return this.IAuthTabCallbackDefault != null;
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallbackDefault = null;
    }

    public <T extends onNavigationEvent> long onWarmupCompleted(T t, onExtraCallbackWithResult<T> onextracallbackwithresult, int i2) {
        Looper looper = (Looper) RecordingInputConnection_androidKt.onWarmupCompleted(Looper.myLooper());
        this.IAuthTabCallbackDefault = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new onExtraCallback(looper, t, onextracallbackwithresult, i2, jElapsedRealtime).onWarmupCompleted(0L);
        return jElapsedRealtime;
    }

    public boolean onWarmupCompleted() {
        return this.onWarmupCompleted != null;
    }

    public void onNavigationEvent() {
        ((onExtraCallback) RecordingInputConnection_androidKt.onWarmupCompleted(this.onWarmupCompleted)).onExtraCallback(false);
    }

    public void onTransact() {
        onWarmupCompleted((onWarmupCompleted) null);
    }

    public void onWarmupCompleted(@Nullable onWarmupCompleted onwarmupcompleted) {
        onExtraCallback<? extends onNavigationEvent> onextracallback = this.onWarmupCompleted;
        if (onextracallback != null) {
            onextracallback.onExtraCallback(true);
        }
        if (onwarmupcompleted != null) {
            this.onTransact.execute(new asInterface(onwarmupcompleted));
        }
        this.onTransact.onExtraCallback();
    }

    public void IAuthTabCallback() throws IOException {
        IAuthTabCallback(Integer.MIN_VALUE);
    }

    public void IAuthTabCallback(int i2) throws IOException {
        IOException iOException = this.IAuthTabCallbackDefault;
        if (iOException != null) {
            throw iOException;
        }
        onExtraCallback<? extends onNavigationEvent> onextracallback = this.onWarmupCompleted;
        if (onextracallback != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = onextracallback.IAuthTabCallback;
            }
            onextracallback.onWarmupCompleted(i2);
        }
    }

    final class onExtraCallback<T extends onNavigationEvent> extends Handler implements Runnable {
        public final int IAuthTabCallback;
        private Thread IAuthTabCallbackDefault;
        private volatile boolean IAuthTabCallbackStub;
        private final long asBinder;
        private int asInterface;
        private boolean onExtraCallbackWithResult;
        private IOException onNavigationEvent;
        private final T onTransact;
        private onExtraCallbackWithResult<T> onWarmupCompleted;

        public onExtraCallback(Looper looper, T t, onExtraCallbackWithResult<T> onextracallbackwithresult, int i2, long j) {
            super(looper);
            this.onTransact = t;
            this.onWarmupCompleted = onextracallbackwithresult;
            this.IAuthTabCallback = i2;
            this.asBinder = j;
        }

        public void onWarmupCompleted(int i2) throws IOException {
            IOException iOException = this.onNavigationEvent;
            if (iOException != null && this.asInterface > i2) {
                throw iOException;
            }
        }

        public void onWarmupCompleted(long j) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(Loader.this.onWarmupCompleted == null);
            Loader.this.onWarmupCompleted = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                onExtraCallback();
            }
        }

        public void onExtraCallback(boolean z) {
            this.IAuthTabCallbackStub = z;
            this.onNavigationEvent = null;
            if (hasMessages(1)) {
                this.onExtraCallbackWithResult = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.onExtraCallbackWithResult = true;
                    this.onTransact.IAuthTabCallback();
                    Thread thread = this.IAuthTabCallbackDefault;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                onExtraCallbackWithResult();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).onNavigationEvent(this.onTransact, jElapsedRealtime, jElapsedRealtime - this.asBinder, true);
                this.onWarmupCompleted = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.onExtraCallbackWithResult;
                    this.IAuthTabCallbackDefault = Thread.currentThread();
                }
                if (!z) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("load:" + this.onTransact.getClass().getSimpleName());
                    try {
                        this.onTransact.IAuthTabCallbackDefault();
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                    } catch (Throwable th) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.IAuthTabCallbackDefault = null;
                    Thread.interrupted();
                }
                if (this.IAuthTabCallbackStub) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.IAuthTabCallbackStub) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.IAuthTabCallbackStub) {
                    return;
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.IAuthTabCallbackStub) {
                    return;
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.IAuthTabCallbackStub) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long jIAuthTabCallback;
            if (this.IAuthTabCallbackStub) {
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                onExtraCallback();
                return;
            }
            if (i2 == 4) {
                throw ((Error) message.obj);
            }
            onExtraCallbackWithResult();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.asBinder;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted);
            if (this.onExtraCallbackWithResult) {
                onextracallbackwithresult.onNavigationEvent(this.onTransact, jElapsedRealtime, j, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 2) {
                try {
                    onextracallbackwithresult.onExtraCallbackWithResult(this.onTransact, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.IAuthTabCallbackDefault = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i3 == 3) {
                IOException iOException = (IOException) message.obj;
                this.onNavigationEvent = iOException;
                int i4 = this.asInterface + 1;
                this.asInterface = i4;
                IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(this.onTransact, jElapsedRealtime, j, iOException, i4);
                if (iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult != 3) {
                    if (iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult != 2) {
                        if (iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult == 1) {
                            this.asInterface = 1;
                        }
                        if (iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback != -9223372036854775807L) {
                            jIAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback;
                        } else {
                            jIAuthTabCallback = IAuthTabCallback();
                        }
                        onWarmupCompleted(jIAuthTabCallback);
                        return;
                    }
                    return;
                }
                Loader.this.IAuthTabCallbackDefault = this.onNavigationEvent;
            }
        }

        private void onExtraCallback() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).onWarmupCompleted(this.onTransact, jElapsedRealtime, jElapsedRealtime - this.asBinder, this.asInterface);
            this.onNavigationEvent = null;
            Loader.this.onTransact.execute((Runnable) RecordingInputConnection_androidKt.onExtraCallbackWithResult(Loader.this.onWarmupCompleted));
        }

        private void onExtraCallbackWithResult() {
            Loader.this.onWarmupCompleted = null;
        }

        private long IAuthTabCallback() {
            return Math.min((this.asInterface - 1) * 1000, 5000);
        }
    }

    static final class asInterface implements Runnable {
        private final onWarmupCompleted onExtraCallback;

        public asInterface(onWarmupCompleted onwarmupcompleted) {
            this.onExtraCallback = onwarmupcompleted;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onExtraCallback.IAuthTabCallbackStubProxy();
        }
    }
}
