package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosHeapObject<T> extends setPc<T, T> {
    final deserializeLongCollection<? super T> IAuthTabCallback;

    public TombstoneProtosHeapObject(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted, this.IAuthTabCallback));
    }

    static final class onNavigationEvent<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection IAuthTabCallback;
        final deserializeLongCollection<? super T> onExtraCallback;
        boolean onExtraCallbackWithResult;
        final writeQuoted<? super T> onNavigationEvent;

        onNavigationEvent(writeQuoted<? super T> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onNavigationEvent = writequoted;
            this.onExtraCallback = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback, deserializeurinullablecollection)) {
                this.IAuthTabCallback = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallbackWithResult) {
                this.onNavigationEvent.onExtraCallback(t);
                return;
            }
            try {
                if (this.onExtraCallback.test(t)) {
                    return;
                }
                this.onExtraCallbackWithResult = true;
                this.onNavigationEvent.onExtraCallback(t);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.IAuthTabCallback.dispose();
                this.onNavigationEvent.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onNavigationEvent.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onNavigationEvent.onExtraCallback();
        }
    }
}
