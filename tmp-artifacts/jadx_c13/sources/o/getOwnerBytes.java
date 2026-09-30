package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getOwnerBytes<T> extends setPc<T, T> {
    final long IAuthTabCallback;

    public getOwnerBytes(serializeRaw<T> serializeraw, long j) {
        super(serializeraw);
        this.IAuthTabCallback = j;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallbackWithResult(writequoted, this.IAuthTabCallback));
    }

    static final class onExtraCallbackWithResult<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        long onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;
        final writeQuoted<? super T> onWarmupCompleted;

        onExtraCallbackWithResult(writeQuoted<? super T> writequoted, long j) {
            this.onWarmupCompleted = writequoted;
            this.onExtraCallbackWithResult = j;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
                this.onNavigationEvent = deserializeurinullablecollection;
                this.onWarmupCompleted.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            long j = this.onExtraCallbackWithResult;
            if (j != 0) {
                this.onExtraCallbackWithResult = j - 1;
            } else {
                this.onWarmupCompleted.onExtraCallback(t);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onWarmupCompleted.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onNavigationEvent.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent.isDisposed();
        }
    }
}
