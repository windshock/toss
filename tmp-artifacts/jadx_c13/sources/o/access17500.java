package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access17500<T> extends writeRaw<T> implements parseLongGeneric<T> {
    final JsonReaderUnknownNumberParsing<T> IAuthTabCallback;
    final T onNavigationEvent;

    public access17500(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, T t) {
        this.IAuthTabCallback = jsonReaderUnknownNumberParsing;
        this.onNavigationEvent = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.IAuthTabCallback.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(deserializeipnullablecollection, this.onNavigationEvent));
    }

    @Override // o.parseLongGeneric
    public JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult() {
        return RxJavaPlugins.onExtraCallbackWithResult(new access17900(this.IAuthTabCallback, this.onNavigationEvent, true));
    }

    static final class IAuthTabCallback<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        ycxExternalSyntheticLambda1 onExtraCallback;
        T onExtraCallbackWithResult;
        final T onNavigationEvent;
        final deserializeIpNullableCollection<? super T> onWarmupCompleted;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, T t) {
            this.onWarmupCompleted = deserializeipnullablecollection;
            this.onNavigationEvent = t;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onExtraCallback, ycxexternalsyntheticlambda1)) {
                this.onExtraCallback = ycxexternalsyntheticlambda1;
                this.onWarmupCompleted.IAuthTabCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            if (this.onExtraCallbackWithResult != null) {
                this.IAuthTabCallback = true;
                this.onExtraCallback.cancel();
                this.onExtraCallback = setLogs.CANCELLED;
                this.onWarmupCompleted.onExtraCallbackWithResult(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.onExtraCallbackWithResult = t;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.IAuthTabCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback = setLogs.CANCELLED;
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback = setLogs.CANCELLED;
            T t = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = null;
            if (t == null) {
                t = this.onNavigationEvent;
            }
            if (t != null) {
                this.onWarmupCompleted.onNavigationEvent(t);
            } else {
                this.onWarmupCompleted.onExtraCallbackWithResult(new NoSuchElementException());
            }
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
