package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StringConverter4<T> extends ObjectConverter2<T, T> {
    private final deserializeDecimalCollection IAuthTabCallback;
    private final deserializeFloat<? super ycxExternalSyntheticLambda1> onNavigationEvent;
    private final deserializeIntCollection onWarmupCompleted;

    public StringConverter4(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat, deserializeIntCollection deserializeintcollection, deserializeDecimalCollection deserializedecimalcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onNavigationEvent = deserializefloat;
        this.onWarmupCompleted = deserializeintcollection;
        this.IAuthTabCallback = deserializedecimalcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallback));
    }

    static final class onWarmupCompleted<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        final deserializeDecimalCollection IAuthTabCallback;
        final deserializeFloat<? super ycxExternalSyntheticLambda1> onExtraCallback;
        ycxExternalSyntheticLambda1 onExtraCallbackWithResult;
        final deserializeIntCollection onNavigationEvent;
        final ycxExternalSyntheticLambda0<? super T> onWarmupCompleted;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat, deserializeIntCollection deserializeintcollection, deserializeDecimalCollection deserializedecimalcollection) {
            this.onWarmupCompleted = ycxexternalsyntheticlambda0;
            this.onExtraCallback = deserializefloat;
            this.IAuthTabCallback = deserializedecimalcollection;
            this.onNavigationEvent = deserializeintcollection;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            try {
                this.onExtraCallback.accept(ycxexternalsyntheticlambda1);
                if (setLogs.validate(this.onExtraCallbackWithResult, ycxexternalsyntheticlambda1)) {
                    this.onExtraCallbackWithResult = ycxexternalsyntheticlambda1;
                    this.onWarmupCompleted.onExtraCallback(this);
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                ycxexternalsyntheticlambda1.cancel();
                this.onExtraCallbackWithResult = setLogs.CANCELLED;
                access25900.error(th, this.onWarmupCompleted);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.onWarmupCompleted.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.onExtraCallbackWithResult != setLogs.CANCELLED) {
                this.onWarmupCompleted.onWarmupCompleted(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.onExtraCallbackWithResult != setLogs.CANCELLED) {
                this.onWarmupCompleted.onExtraCallbackWithResult();
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.onExtraCallbackWithResult.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.onExtraCallbackWithResult;
            setLogs setlogs = setLogs.CANCELLED;
            if (ycxexternalsyntheticlambda1 != setlogs) {
                this.onExtraCallbackWithResult = setlogs;
                try {
                    this.IAuthTabCallback.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
                ycxexternalsyntheticlambda1.cancel();
            }
        }
    }
}
