package o;

import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosCauseOrBuilder<T> extends getByteBuffer<T> {
    final Iterable<? extends T> onExtraCallback;

    public TombstoneProtosCauseOrBuilder(Iterable<? extends T> iterable) {
        this.onExtraCallback = iterable;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        try {
            Iterator<? extends T> it = this.onExtraCallback.iterator();
            try {
                if (!it.hasNext()) {
                    deserializeShort.complete(writequoted);
                    return;
                }
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(writequoted, it);
                writequoted.IAuthTabCallback(iAuthTabCallback);
                if (iAuthTabCallback.onWarmupCompleted) {
                    return;
                }
                iAuthTabCallback.onExtraCallback();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                deserializeShort.error(th, writequoted);
            }
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            deserializeShort.error(th2, writequoted);
        }
    }

    static final class IAuthTabCallback<T> extends readLongNumber<T> {
        boolean IAuthTabCallback;
        final writeQuoted<? super T> onExtraCallback;
        volatile boolean onExtraCallbackWithResult;
        boolean onNavigationEvent;
        final Iterator<? extends T> onTransact;
        boolean onWarmupCompleted;

        IAuthTabCallback(writeQuoted<? super T> writequoted, Iterator<? extends T> it) {
            this.onExtraCallback = writequoted;
            this.onTransact = it;
        }

        void onExtraCallback() {
            while (!isDisposed()) {
                try {
                    this.onExtraCallback.onExtraCallback(floatExponent.onExtraCallbackWithResult((Object) this.onTransact.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.onTransact.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.onExtraCallback.onExtraCallback();
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        this.onExtraCallback.onExtraCallbackWithResult(th);
                        return;
                    }
                } catch (Throwable th2) {
                    NumberConverter.onWarmupCompleted(th2);
                    this.onExtraCallback.onExtraCallbackWithResult(th2);
                    return;
                }
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.onWarmupCompleted = true;
            return 1;
        }

        @Override // o.parsePositiveDecimal
        public T poll() {
            if (this.IAuthTabCallback) {
                return null;
            }
            if (this.onNavigationEvent) {
                if (!this.onTransact.hasNext()) {
                    this.IAuthTabCallback = true;
                    return null;
                }
            } else {
                this.onNavigationEvent = true;
            }
            return (T) floatExponent.onExtraCallbackWithResult((Object) this.onTransact.next(), "The iterator returned a null value");
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.IAuthTabCallback;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.IAuthTabCallback = true;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallbackWithResult = true;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallbackWithResult;
        }
    }
}
