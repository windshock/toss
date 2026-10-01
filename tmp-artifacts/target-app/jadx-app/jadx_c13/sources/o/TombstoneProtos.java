package o;

import io.reactivex.plugins.RxJavaPlugins;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtos<T> extends wasLastName implements parseLongGeneric<T> {
    final JsonReaderUnknownNumberParsing<T> onNavigationEvent;

    public TombstoneProtos(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing) {
        this.onNavigationEvent = jsonReaderUnknownNumberParsing;
    }

    @Override // o.wasLastName
    public void IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        this.onNavigationEvent.onExtraCallback((JsonReaderReadObject) new onNavigationEvent(jsonReaderDoublePrecision));
    }

    @Override // o.parseLongGeneric
    public JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult() {
        return RxJavaPlugins.onExtraCallbackWithResult(new XmlConverter2(this.onNavigationEvent));
    }

    static final class onNavigationEvent<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        ycxExternalSyntheticLambda1 onExtraCallback;
        final JsonReaderDoublePrecision onExtraCallbackWithResult;

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
        }

        onNavigationEvent(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
            this.onExtraCallbackWithResult = jsonReaderDoublePrecision;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onExtraCallback, ycxexternalsyntheticlambda1)) {
                this.onExtraCallback = ycxexternalsyntheticlambda1;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onExtraCallback = setLogs.CANCELLED;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onExtraCallback = setLogs.CANCELLED;
            this.onExtraCallbackWithResult.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallback.cancel();
            this.onExtraCallback = setLogs.CANCELLED;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback == setLogs.CANCELLED;
        }
    }
}
