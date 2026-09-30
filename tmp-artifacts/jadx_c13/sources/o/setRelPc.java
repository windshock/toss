package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRelPc<T, R> extends getByteBuffer<R> {
    final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> onExtraCallback;
    final deserializeIp<T> onWarmupCompleted;

    public setRelPc(deserializeIp<T> deserializeip, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
        this.onWarmupCompleted = deserializeip;
        this.onExtraCallback = deserializeintnullablecollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super R> writequoted) {
        onNavigationEvent onnavigationevent = new onNavigationEvent(writequoted, this.onExtraCallback);
        writequoted.IAuthTabCallback(onnavigationevent);
        this.onWarmupCompleted.IAuthTabCallback(onnavigationevent);
    }

    static final class onNavigationEvent<T, R> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<R>, deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -8948264376121066672L;
        final writeQuoted<? super R> downstream;
        final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> mapper;

        onNavigationEvent(writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
            this.downstream = writequoted;
            this.mapper = deserializeintnullablecollection;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(R r) {
            this.downstream.onExtraCallback(r);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this, deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                ((serializeRaw) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.downstream.onExtraCallbackWithResult(th);
            }
        }
    }
}
