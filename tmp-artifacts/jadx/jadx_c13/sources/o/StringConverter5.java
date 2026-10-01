package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StringConverter5<T> extends writeRaw<T> implements parseLongGeneric<T> {
    final T IAuthTabCallback;
    final long onExtraCallbackWithResult;
    final JsonReaderUnknownNumberParsing<T> onNavigationEvent;

    public StringConverter5(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, T t) {
        this.onNavigationEvent = jsonReaderUnknownNumberParsing;
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onNavigationEvent.onExtraCallback((JsonReaderReadObject) new onExtraCallback(deserializeipnullablecollection, this.onExtraCallbackWithResult, this.IAuthTabCallback));
    }

    @Override // o.parseLongGeneric
    public JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult() {
        return RxJavaPlugins.onExtraCallbackWithResult(new UUIDConverter(this.onNavigationEvent, this.onExtraCallbackWithResult, this.IAuthTabCallback, true));
    }

    static final class onExtraCallback<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        final long IAuthTabCallback;
        ycxExternalSyntheticLambda1 IAuthTabCallbackDefault;
        long onExtraCallback;
        final deserializeIpNullableCollection<? super T> onExtraCallbackWithResult;
        boolean onNavigationEvent;
        final T onWarmupCompleted;

        onExtraCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, long j, T t) {
            this.onExtraCallbackWithResult = deserializeipnullablecollection;
            this.IAuthTabCallback = j;
            this.onWarmupCompleted = t;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.IAuthTabCallbackDefault, ycxexternalsyntheticlambda1)) {
                this.IAuthTabCallbackDefault = ycxexternalsyntheticlambda1;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.onNavigationEvent) {
                return;
            }
            long j = this.onExtraCallback;
            if (j == this.IAuthTabCallback) {
                this.onNavigationEvent = true;
                this.IAuthTabCallbackDefault.cancel();
                this.IAuthTabCallbackDefault = setLogs.CANCELLED;
                this.onExtraCallbackWithResult.onNavigationEvent(t);
                return;
            }
            this.onExtraCallback = j + 1;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.onNavigationEvent) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.onNavigationEvent = true;
            this.IAuthTabCallbackDefault = setLogs.CANCELLED;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.IAuthTabCallbackDefault = setLogs.CANCELLED;
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            T t = this.onWarmupCompleted;
            if (t != null) {
                this.onExtraCallbackWithResult.onNavigationEvent(t);
            } else {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(new NoSuchElementException());
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallbackDefault.cancel();
            this.IAuthTabCallbackDefault = setLogs.CANCELLED;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallbackDefault == setLogs.CANCELLED;
        }
    }
}
