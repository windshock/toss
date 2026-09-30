package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12700<T, K> extends setPc<T, T> {
    final deserializeFloatCollection<? super K, ? super K> onExtraCallback;
    final deserializeIntNullableCollection<? super T, K> onNavigationEvent;

    public access12700(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, deserializeFloatCollection<? super K, ? super K> deserializefloatcollection) {
        super(serializeraw);
        this.onNavigationEvent = deserializeintnullablecollection;
        this.onExtraCallback = deserializefloatcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted, this.onNavigationEvent, this.onExtraCallback));
    }

    static final class onNavigationEvent<T, K> extends parseNumberGeneric<T, T> {
        K IAuthTabCallbackDefault;
        boolean asBinder;
        final deserializeFloatCollection<? super K, ? super K> asInterface;
        final deserializeIntNullableCollection<? super T, K> onTransact;

        onNavigationEvent(writeQuoted<? super T> writequoted, deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, deserializeFloatCollection<? super K, ? super K> deserializefloatcollection) {
            super(writequoted);
            this.onTransact = deserializeintnullablecollection;
            this.asInterface = deserializefloatcollection;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallback) {
                return;
            }
            if (this.onExtraCallbackWithResult != 0) {
                this.onWarmupCompleted.onExtraCallback(t);
                return;
            }
            try {
                K kApply = this.onTransact.apply(t);
                if (this.asBinder) {
                    boolean zIAuthTabCallback = this.asInterface.IAuthTabCallback(this.IAuthTabCallbackDefault, kApply);
                    this.IAuthTabCallbackDefault = kApply;
                    if (zIAuthTabCallback) {
                        return;
                    }
                } else {
                    this.asBinder = true;
                    this.IAuthTabCallbackDefault = kApply;
                }
                this.onWarmupCompleted.onExtraCallback(t);
            } catch (Throwable th) {
                onWarmupCompleted(th);
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return IAuthTabCallback(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.IAuthTabCallback.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.onTransact.apply(tPoll);
                if (!this.asBinder) {
                    this.asBinder = true;
                    this.IAuthTabCallbackDefault = kApply;
                    return tPoll;
                }
                if (!this.asInterface.IAuthTabCallback(this.IAuthTabCallbackDefault, kApply)) {
                    this.IAuthTabCallbackDefault = kApply;
                    return tPoll;
                }
                this.IAuthTabCallbackDefault = kApply;
            }
        }
    }
}
