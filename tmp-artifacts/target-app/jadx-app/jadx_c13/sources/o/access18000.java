package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access18000<T> extends ObjectConverter2<T, T> {
    final deserializeLongCollection<? super T> onWarmupCompleted;

    public access18000(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeLongCollection<? super T> deserializelongcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = deserializelongcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallback(ycxexternalsyntheticlambda0, this.onWarmupCompleted));
    }

    static final class onExtraCallback<T> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
        ycxExternalSyntheticLambda1 IAuthTabCallback;
        final ycxExternalSyntheticLambda0<? super T> onExtraCallback;
        boolean onNavigationEvent;
        final deserializeLongCollection<? super T> onWarmupCompleted;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onExtraCallback = ycxexternalsyntheticlambda0;
            this.onWarmupCompleted = deserializelongcollection;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.IAuthTabCallback, ycxexternalsyntheticlambda1)) {
                this.IAuthTabCallback = ycxexternalsyntheticlambda1;
                this.onExtraCallback.onExtraCallback(this);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.onNavigationEvent) {
                return;
            }
            this.onExtraCallback.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
            try {
                if (this.onWarmupCompleted.test(t)) {
                    this.onNavigationEvent = true;
                    this.IAuthTabCallback.cancel();
                    this.onExtraCallback.onExtraCallbackWithResult();
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.IAuthTabCallback.cancel();
                onWarmupCompleted(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (!this.onNavigationEvent) {
                this.onNavigationEvent = true;
                this.onExtraCallback.onWarmupCompleted(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            this.onExtraCallback.onExtraCallbackWithResult();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            this.IAuthTabCallback.request(j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            this.IAuthTabCallback.cancel();
        }
    }
}
