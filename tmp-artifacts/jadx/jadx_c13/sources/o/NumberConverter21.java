package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter21 extends wasLastName {
    final fillInStackTrace IAuthTabCallback;

    public NumberConverter21(fillInStackTrace fillinstacktrace) {
        this.IAuthTabCallback = fillinstacktrace;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        onExtraCallback onextracallback = new onExtraCallback(jsonReaderDoublePrecision);
        jsonReaderDoublePrecision.IAuthTabCallback(onextracallback);
        try {
            this.IAuthTabCallback.subscribe(onextracallback);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            onextracallback.onWarmupCompleted(th);
        }
    }

    static final class onExtraCallback extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderEmptyEOFException, deserializeUriNullableCollection {
        private static final long serialVersionUID = -2467358622224974244L;
        final JsonReaderDoublePrecision downstream;

        onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.downstream = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderEmptyEOFException
        public void onWarmupCompleted() {
            deserializeUriNullableCollection andSet;
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return;
            }
            try {
                this.downstream.onExtraCallback();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // o.JsonReaderEmptyEOFException
        public void onWarmupCompleted(Throwable th) {
            if (onExtraCallbackWithResult(th)) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderEmptyEOFException
        public boolean onExtraCallbackWithResult(Throwable th) {
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

        public void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.set(this, deserializeurinullablecollection);
        }

        @Override // o.JsonReaderEmptyEOFException
        public void IAuthTabCallback(deserializeFloatArray deserializefloatarray) {
            onWarmupCompleted(new deserializeLongNullableCollection(deserializefloatarray));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.JsonReaderEmptyEOFException, o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", onExtraCallback.class.getSimpleName(), super.toString());
        }
    }
}
