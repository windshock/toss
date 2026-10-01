package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24200<T> extends setPc<T, T> {
    public access24200(serializeRaw<T> serializeraw) {
        super(serializeraw);
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new IAuthTabCallback(writequoted));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final writeQuoted<? super T> IAuthTabCallback;
        deserializeUriNullableCollection onWarmupCompleted;

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
        }

        IAuthTabCallback(writeQuoted<? super T> writequoted) {
            this.IAuthTabCallback = writequoted;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onWarmupCompleted = deserializeurinullablecollection;
            this.IAuthTabCallback.IAuthTabCallback(this);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.IAuthTabCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.IAuthTabCallback.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.isDisposed();
        }
    }
}
