package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearDetails<T> extends setPc<T, T> {
    final deserializeFloat<? super T> IAuthTabCallback;

    public clearDetails(serializeRaw<T> serializeraw, deserializeFloat<? super T> deserializefloat) {
        super(serializeraw);
        this.IAuthTabCallback = deserializefloat;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, this.IAuthTabCallback));
    }

    static final class onExtraCallback<T> extends parseNumberGeneric<T, T> {
        final deserializeFloat<? super T> onTransact;

        onExtraCallback(writeQuoted<? super T> writequoted, deserializeFloat<? super T> deserializefloat) {
            super(writequoted);
            this.onTransact = deserializefloat;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.onWarmupCompleted.onExtraCallback(t);
            if (this.onExtraCallbackWithResult == 0) {
                try {
                    this.onTransact.accept(t);
                } catch (Throwable th) {
                    onWarmupCompleted(th);
                }
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return IAuthTabCallback(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.IAuthTabCallback.poll();
            if (tPoll != null) {
                this.onTransact.accept(tPoll);
            }
            return tPoll;
        }
    }
}
