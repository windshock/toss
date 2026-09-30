package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24600<T, U> extends setPc<T, U> {
    final deserializeIntNullableCollection<? super T, ? extends U> onExtraCallbackWithResult;

    public access24600(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, ? extends U> deserializeintnullablecollection) {
        super(serializeraw);
        this.onExtraCallbackWithResult = deserializeintnullablecollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted, this.onExtraCallbackWithResult));
    }

    static final class onNavigationEvent<T, U> extends parseNumberGeneric<T, U> {
        final deserializeIntNullableCollection<? super T, ? extends U> asBinder;

        onNavigationEvent(writeQuoted<? super U> writequoted, deserializeIntNullableCollection<? super T, ? extends U> deserializeintnullablecollection) {
            super(writequoted);
            this.asBinder = deserializeintnullablecollection;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallback) {
                return;
            }
            if (this.onExtraCallbackWithResult != 0) {
                this.onWarmupCompleted.onExtraCallback(null);
                return;
            }
            try {
                this.onWarmupCompleted.onExtraCallback(floatExponent.onExtraCallbackWithResult(this.asBinder.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                onWarmupCompleted(th);
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return IAuthTabCallback(i);
        }

        @Override // o.parsePositiveDecimal
        public U poll() throws Exception {
            T tPoll = this.IAuthTabCallback.poll();
            if (tPoll != null) {
                return (U) floatExponent.onExtraCallbackWithResult(this.asBinder.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
