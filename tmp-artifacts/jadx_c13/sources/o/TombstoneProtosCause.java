package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosCause<T> extends setPc<T, T> {
    final TimeUnit IAuthTabCallback;
    final long onExtraCallbackWithResult;
    final MapConverter onNavigationEvent;

    public TombstoneProtosCause(serializeRaw<T> serializeraw, long j, TimeUnit timeUnit, MapConverter mapConverter) {
        super(serializeraw);
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = timeUnit;
        this.onNavigationEvent = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new IAuthTabCallback(new access26900(writequoted), this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onNavigationEvent.onExtraCallbackWithResult()));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        volatile long IAuthTabCallback;
        final TimeUnit IAuthTabCallbackDefault;
        final MapConverter.onNavigationEvent IAuthTabCallbackStub;
        deserializeUriNullableCollection asInterface;
        boolean onExtraCallback;
        final writeQuoted<? super T> onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;
        final long onWarmupCompleted;

        IAuthTabCallback(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            this.onExtraCallbackWithResult = writequoted;
            this.onWarmupCompleted = j;
            this.IAuthTabCallbackDefault = timeUnit;
            this.IAuthTabCallbackStub = onnavigationevent;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.asInterface, deserializeurinullablecollection)) {
                this.asInterface = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallback) {
                return;
            }
            long j = this.IAuthTabCallback + 1;
            this.IAuthTabCallback = j;
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(t, j, this);
            this.onNavigationEvent = onwarmupcompleted;
            onwarmupcompleted.onExtraCallbackWithResult(this.IAuthTabCallbackStub.onNavigationEvent(onwarmupcompleted, this.onWarmupCompleted, this.IAuthTabCallbackDefault));
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            this.onExtraCallback = true;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) deserializeurinullablecollection;
            if (onwarmupcompleted != null) {
                onwarmupcompleted.run();
            }
            this.onExtraCallbackWithResult.onExtraCallback();
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.asInterface.dispose();
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallbackStub.isDisposed();
        }

        void onWarmupCompleted(long j, T t, onWarmupCompleted<T> onwarmupcompleted) {
            if (j == this.IAuthTabCallback) {
                this.onExtraCallbackWithResult.onExtraCallback(t);
                onwarmupcompleted.dispose();
            }
        }
    }

    static final class onWarmupCompleted<T> extends AtomicReference<deserializeUriNullableCollection> implements Runnable, deserializeUriNullableCollection {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final IAuthTabCallback<T> parent;
        final T value;

        onWarmupCompleted(T t, long j, IAuthTabCallback<T> iAuthTabCallback) {
            this.value = t;
            this.idx = j;
            this.parent = iAuthTabCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.onWarmupCompleted(this.idx, this.value, this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == deserializeNumber.DISPOSED;
        }

        public void onExtraCallbackWithResult(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }
    }
}
