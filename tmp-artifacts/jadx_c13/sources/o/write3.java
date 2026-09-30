package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class write3 extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection, deserializeFloat<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final deserializeDecimalCollection onComplete;
    final deserializeFloat<? super Throwable> onError;

    public write3(deserializeDecimalCollection deserializedecimalcollection) {
        this.onError = this;
        this.onComplete = deserializedecimalcollection;
    }

    public write3(deserializeFloat<? super Throwable> deserializefloat, deserializeDecimalCollection deserializedecimalcollection) {
        this.onError = deserializefloat;
        this.onComplete = deserializedecimalcollection;
    }

    @Override // o.deserializeFloat
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        RxJavaPlugins.onExtraCallbackWithResult(new approximateDouble(th));
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallback() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
        lazySet(deserializeNumber.DISPOSED);
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallbackWithResult(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            RxJavaPlugins.onExtraCallbackWithResult(th2);
        }
        lazySet(deserializeNumber.DISPOSED);
    }

    @Override // o.JsonReaderDoublePrecision
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this, deserializeurinullablecollection);
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeNumber.dispose(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return get() == deserializeNumber.DISPOSED;
    }
}
