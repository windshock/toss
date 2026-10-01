package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9000<T> extends writeRaw<T> {
    final NetConverter<T> onWarmupCompleted;

    public access9000(NetConverter<T> netConverter) {
        this.onWarmupCompleted = netConverter;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(deserializeipnullablecollection);
        deserializeipnullablecollection.IAuthTabCallback(onwarmupcompleted);
        try {
            this.onWarmupCompleted.subscribe(onwarmupcompleted);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            onwarmupcompleted.onExtraCallback(th);
        }
    }

    static final class onWarmupCompleted<T> extends AtomicReference<deserializeUriNullableCollection> implements JsonWriterWriteObject<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -2467358622224974244L;
        final deserializeIpNullableCollection<? super T> downstream;

        onWarmupCompleted(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.downstream = deserializeipnullablecollection;
        }

        @Override // o.JsonWriterWriteObject
        public void onNavigationEvent(T t) {
            deserializeUriNullableCollection andSet;
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return;
            }
            try {
                if (t == null) {
                    this.downstream.onExtraCallbackWithResult(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.downstream.onNavigationEvent(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // o.JsonWriterWriteObject
        public void onExtraCallback(Throwable th) {
            if (IAuthTabCallback(th)) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonWriterWriteObject
        public boolean IAuthTabCallback(Throwable th) {
            deserializeUriNullableCollection andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return false;
            }
            try {
                this.downstream.onExtraCallbackWithResult(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // o.JsonWriterWriteObject
        public void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.set(this, deserializeurinullablecollection);
        }

        @Override // o.JsonWriterWriteObject
        public void onNavigationEvent(deserializeFloatArray deserializefloatarray) {
            onWarmupCompleted(new deserializeLongNullableCollection(deserializefloatarray));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.JsonWriterWriteObject, o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", onWarmupCompleted.class.getSimpleName(), super.toString());
        }
    }
}
