package o;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter25<T> extends wasLastName {
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onExtraCallback;

    public NumberConverter25(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        this.onExtraCallback = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onExtraCallback.subscribe(new onExtraCallbackWithResult(jsonReaderDoublePrecision));
    }

    static final class onExtraCallbackWithResult<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        ycxExternalSyntheticLambda1 onNavigationEvent;
        final JsonReaderDoublePrecision onWarmupCompleted;

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
        }

        onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onWarmupCompleted = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onNavigationEvent, ycxexternalsyntheticlambda1)) {
                this.onNavigationEvent = ycxexternalsyntheticlambda1;
                this.onWarmupCompleted.IAuthTabCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onWarmupCompleted.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onNavigationEvent.cancel();
            this.onNavigationEvent = setLogs.CANCELLED;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent == setLogs.CANCELLED;
        }
    }
}
