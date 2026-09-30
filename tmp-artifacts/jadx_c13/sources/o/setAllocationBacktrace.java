package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAllocationBacktrace<T> extends getByteBuffer<T> {
    final deserializeIp<? extends T> IAuthTabCallback;

    public setAllocationBacktrace(deserializeIp<? extends T> deserializeip) {
        this.IAuthTabCallback = deserializeip;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.IAuthTabCallback.IAuthTabCallback(onNavigationEvent((writeQuoted) writequoted));
    }

    public static <T> deserializeIpNullableCollection<T> onNavigationEvent(writeQuoted<? super T> writequoted) {
        return new IAuthTabCallback(writequoted);
    }

    static final class IAuthTabCallback<T> extends write2<T> implements deserializeIpNullableCollection<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        deserializeUriNullableCollection upstream;

        IAuthTabCallback(writeQuoted<? super T> writequoted) {
            super(writequoted);
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            onExtraCallback(t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            onNavigationEvent(th);
        }

        @Override // o.write2, o.deserializeUriNullableCollection
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
