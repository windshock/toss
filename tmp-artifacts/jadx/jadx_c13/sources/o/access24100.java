package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24100<T> extends setPc<T, T> {
    public access24100(serializeRaw<T> serializeraw) {
        super(serializeraw);
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted));
    }

    static final class onNavigationEvent<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final writeQuoted<? super T> onExtraCallback;
        deserializeUriNullableCollection onNavigationEvent;

        onNavigationEvent(writeQuoted<? super T> writequoted) {
            this.onExtraCallback = writequoted;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onNavigationEvent.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent.isDisposed();
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
            this.onExtraCallback.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onExtraCallback.onExtraCallback();
        }
    }
}
