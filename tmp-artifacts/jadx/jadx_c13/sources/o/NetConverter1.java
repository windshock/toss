package o;

import android.os.Handler;
import android.os.Message;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class NetConverter1 extends MapConverter {
    private final boolean onExtraCallbackWithResult;
    private final Handler onNavigationEvent;

    NetConverter1(Handler handler, boolean z) {
        this.onNavigationEvent = handler;
        this.onExtraCallbackWithResult = z;
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.onNavigationEvent, RxJavaPlugins.onNavigationEvent(runnable));
        Message messageObtain = Message.obtain(this.onNavigationEvent, onwarmupcompleted);
        if (this.onExtraCallbackWithResult) {
            messageObtain.setAsynchronous(true);
        }
        this.onNavigationEvent.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return onwarmupcompleted;
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onExtraCallbackWithResult(this.onNavigationEvent, this.onExtraCallbackWithResult);
    }

    static final class onExtraCallbackWithResult extends MapConverter.onNavigationEvent {
        private volatile boolean IAuthTabCallback;
        private final boolean onExtraCallback;
        private final Handler onNavigationEvent;

        onExtraCallbackWithResult(Handler handler, boolean z) {
            this.onNavigationEvent = handler;
            this.onExtraCallback = z;
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.IAuthTabCallback) {
                return bigDecimalOrDouble.onExtraCallback();
            }
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.onNavigationEvent, RxJavaPlugins.onNavigationEvent(runnable));
            Message messageObtain = Message.obtain(this.onNavigationEvent, onwarmupcompleted);
            messageObtain.obj = this;
            if (this.onExtraCallback) {
                messageObtain.setAsynchronous(true);
            }
            this.onNavigationEvent.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.IAuthTabCallback) {
                return onwarmupcompleted;
            }
            this.onNavigationEvent.removeCallbacks(onwarmupcompleted);
            return bigDecimalOrDouble.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallback = true;
            this.onNavigationEvent.removeCallbacksAndMessages(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback;
        }
    }

    static final class onWarmupCompleted implements Runnable, deserializeUriNullableCollection {
        private final Handler IAuthTabCallback;
        private volatile boolean onNavigationEvent;
        private final Runnable onWarmupCompleted;

        onWarmupCompleted(Handler handler, Runnable runnable) {
            this.IAuthTabCallback = handler;
            this.onWarmupCompleted = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.onWarmupCompleted.run();
            } catch (Throwable th) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallback.removeCallbacks(this);
            this.onNavigationEvent = true;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent;
        }
    }
}
