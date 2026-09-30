package o;

import java.util.concurrent.TimeUnit;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12300<T> extends setPc<T, T> {
    final boolean IAuthTabCallback;
    final MapConverter onExtraCallback;
    final TimeUnit onExtraCallbackWithResult;
    final long onNavigationEvent;

    public access12300(serializeRaw<T> serializeraw, long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        super(serializeraw);
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = timeUnit;
        this.onExtraCallback = mapConverter;
        this.IAuthTabCallback = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(!this.IAuthTabCallback ? new access26900(writequoted) : writequoted, this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback.onExtraCallbackWithResult(), this.IAuthTabCallback));
    }

    static final class onNavigationEvent<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final long IAuthTabCallback;
        final writeQuoted<? super T> onExtraCallback;
        final TimeUnit onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;
        final MapConverter.onNavigationEvent onTransact;
        final boolean onWarmupCompleted;

        onNavigationEvent(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent, boolean z) {
            this.onExtraCallback = writequoted;
            this.IAuthTabCallback = j;
            this.onExtraCallbackWithResult = timeUnit;
            this.onTransact = onnavigationevent;
            this.onWarmupCompleted = z;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
                this.onNavigationEvent = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.onTransact.onNavigationEvent(new onExtraCallback(t), this.IAuthTabCallback, this.onExtraCallbackWithResult);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onTransact.onNavigationEvent(new onWarmupCompleted(th), this.onWarmupCompleted ? this.IAuthTabCallback : 0L, this.onExtraCallbackWithResult);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onTransact.onNavigationEvent(new IAuthTabCallback(), this.IAuthTabCallback, this.onExtraCallbackWithResult);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onNavigationEvent.dispose();
            this.onTransact.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onTransact.isDisposed();
        }

        final class onExtraCallback implements Runnable {
            private final T onWarmupCompleted;

            onExtraCallback(T t) {
                this.onWarmupCompleted = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                onNavigationEvent.this.onExtraCallback.onExtraCallback(this.onWarmupCompleted);
            }
        }

        final class onWarmupCompleted implements Runnable {
            private final Throwable onNavigationEvent;

            onWarmupCompleted(Throwable th) {
                this.onNavigationEvent = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    onNavigationEvent.this.onExtraCallback.onExtraCallbackWithResult(this.onNavigationEvent);
                } finally {
                    onNavigationEvent.this.onTransact.dispose();
                }
            }
        }

        final class IAuthTabCallback implements Runnable {
            IAuthTabCallback() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    onNavigationEvent.this.onExtraCallback.onExtraCallback();
                } finally {
                    onNavigationEvent.this.onTransact.dispose();
                }
            }
        }
    }
}
