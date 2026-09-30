package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12600<T> extends setPc<T, T> {
    final deserializeDecimalCollection IAuthTabCallback;

    public access12600(serializeRaw<T> serializeraw, deserializeDecimalCollection deserializedecimalcollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializedecimalcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallbackWithResult(writequoted, this.IAuthTabCallback));
    }

    static final class onExtraCallbackWithResult<T> extends read2<T> implements writeQuoted<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final writeQuoted<? super T> downstream;
        final deserializeDecimalCollection onFinally;
        parseDoubleGeneric<T> qd;
        boolean syncFused;
        deserializeUriNullableCollection upstream;

        onExtraCallbackWithResult(writeQuoted<? super T> writequoted, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = writequoted;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                    this.qd = (parseDoubleGeneric) deserializeurinullablecollection;
                }
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.downstream.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
            onWarmupCompleted();
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.downstream.onExtraCallback();
            onWarmupCompleted();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            onWarmupCompleted();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            parseDoubleGeneric<T> parsedoublegeneric = this.qd;
            if (parsedoublegeneric == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = parsedoublegeneric.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.qd.clear();
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.qd.poll();
            if (tPoll == null && this.syncFused) {
                onWarmupCompleted();
            }
            return tPoll;
        }

        void onWarmupCompleted() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            }
        }
    }
}
