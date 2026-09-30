package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeNullable<T> extends ObjectConverter2<T, T> {
    final deserializeDecimalCollection onWarmupCompleted;

    public deserializeNullable(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeDecimalCollection deserializedecimalcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = deserializedecimalcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback((deserializeShortCollection) ycxexternalsyntheticlambda0, this.onWarmupCompleted));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.onWarmupCompleted));
        }
    }

    static final class onWarmupCompleted<T> extends addAllLogs<T> implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        final deserializeDecimalCollection onFinally;
        parsePositiveInt<T> qs;
        boolean syncFused;
        ycxExternalSyntheticLambda1 upstream;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    this.qs = (parsePositiveInt) ycxexternalsyntheticlambda1;
                }
                this.downstream.onExtraCallback(this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.downstream.onWarmupCompleted(th);
            onNavigationEvent();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.downstream.onExtraCallbackWithResult();
            onNavigationEvent();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
            onNavigationEvent();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            parsePositiveInt<T> parsepositiveint = this.qs;
            if (parsepositiveint == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = parsepositiveint.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.qs.clear();
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.qs.poll();
            if (tPoll == null && this.syncFused) {
                onNavigationEvent();
            }
            return tPoll;
        }

        void onNavigationEvent() {
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

    static final class IAuthTabCallback<T> extends addAllLogs<T> implements deserializeShortCollection<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final deserializeShortCollection<? super T> downstream;
        final deserializeDecimalCollection onFinally;
        parsePositiveInt<T> qs;
        boolean syncFused;
        ycxExternalSyntheticLambda1 upstream;

        IAuthTabCallback(deserializeShortCollection<? super T> deserializeshortcollection, deserializeDecimalCollection deserializedecimalcollection) {
            this.downstream = deserializeshortcollection;
            this.onFinally = deserializedecimalcollection;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                if (ycxexternalsyntheticlambda1 instanceof parsePositiveInt) {
                    this.qs = (parsePositiveInt) ycxexternalsyntheticlambda1;
                }
                this.downstream.onExtraCallback((ycxExternalSyntheticLambda1) this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.downstream.onWarmupCompleted((deserializeShortCollection<? super T>) t);
        }

        @Override // o.deserializeShortCollection
        public boolean onExtraCallback(T t) {
            return this.downstream.onExtraCallback((deserializeShortCollection<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.downstream.onWarmupCompleted(th);
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.downstream.onExtraCallbackWithResult();
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.upstream.cancel();
            onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            parsePositiveInt<T> parsepositiveint = this.qs;
            if (parsepositiveint == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = parsepositiveint.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.qs.clear();
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll = this.qs.poll();
            if (tPoll == null && this.syncFused) {
                onExtraCallback();
            }
            return tPoll;
        }

        void onExtraCallback() {
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
