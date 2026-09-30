package o;

import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9400<T> extends writeRaw<T> {
    final deserializeIp<T> onNavigationEvent;
    final JsonReaderErrorInfo onWarmupCompleted;

    public access9400(deserializeIp<T> deserializeip, JsonReaderErrorInfo jsonReaderErrorInfo) {
        this.onNavigationEvent = deserializeip;
        this.onWarmupCompleted = jsonReaderErrorInfo;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onWarmupCompleted.onExtraCallbackWithResult(new IAuthTabCallback(deserializeipnullablecollection, this.onNavigationEvent));
    }

    static final class IAuthTabCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
        private static final long serialVersionUID = -8565274649390031272L;
        final deserializeIpNullableCollection<? super T> downstream;
        final deserializeIp<T> source;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeIp<T> deserializeip) {
            this.downstream = deserializeipnullablecollection;
            this.source = deserializeip;
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.source.IAuthTabCallback(new ResumeSingleObserver(this, this.downstream));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }
}
