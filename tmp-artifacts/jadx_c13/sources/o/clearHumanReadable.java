package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearHumanReadable<T> extends setPc<T, T> {
    final boolean IAuthTabCallback;
    final T onExtraCallbackWithResult;
    final long onNavigationEvent;

    public clearHumanReadable(serializeRaw<T> serializeraw, long j, T t, boolean z) {
        super(serializeraw);
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = t;
        this.IAuthTabCallback = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, this.onNavigationEvent, this.onExtraCallbackWithResult, this.IAuthTabCallback));
    }

    static final class onWarmupCompleted<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        deserializeUriNullableCollection IAuthTabCallbackStub;
        final writeQuoted<? super T> onExtraCallback;
        long onExtraCallbackWithResult;
        final T onNavigationEvent;
        final long onTransact;
        final boolean onWarmupCompleted;

        onWarmupCompleted(writeQuoted<? super T> writequoted, long j, T t, boolean z) {
            this.onExtraCallback = writequoted;
            this.onTransact = j;
            this.onNavigationEvent = t;
            this.onWarmupCompleted = z;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallbackStub, deserializeurinullablecollection)) {
                this.IAuthTabCallbackStub = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallbackStub.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            long j = this.onExtraCallbackWithResult;
            if (j == this.onTransact) {
                this.IAuthTabCallback = true;
                this.IAuthTabCallbackStub.dispose();
                this.onExtraCallback.onExtraCallback(t);
                this.onExtraCallback.onExtraCallback();
                return;
            }
            this.onExtraCallbackWithResult = j + 1;
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.IAuthTabCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.IAuthTabCallback = true;
                this.onExtraCallback.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            T t = this.onNavigationEvent;
            if (t == null && this.onWarmupCompleted) {
                this.onExtraCallback.onExtraCallbackWithResult(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.onExtraCallback.onExtraCallback(t);
            }
            this.onExtraCallback.onExtraCallback();
        }
    }
}
