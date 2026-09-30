package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UUIDConverter<T> extends ObjectConverter2<T, T> {
    final boolean IAuthTabCallback;
    final long onExtraCallback;
    final T onWarmupCompleted;

    public UUIDConverter(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, long j, T t, boolean z) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = j;
        this.onWarmupCompleted = t;
        this.IAuthTabCallback = z;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new IAuthTabCallback(ycxexternalsyntheticlambda0, this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallback));
    }

    static final class IAuthTabCallback<T> extends addLogs<T> implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        ycxExternalSyntheticLambda1 upstream;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, long j, T t, boolean z) {
            super(ycxexternalsyntheticlambda0);
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
                this.upstream = ycxexternalsyntheticlambda1;
                this.downstream.onExtraCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.done) {
                return;
            }
            long j = this.count;
            if (j == this.index) {
                this.done = true;
                this.upstream.cancel();
                IAuthTabCallback(t);
                return;
            }
            this.count = j + 1;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.done = true;
                this.downstream.onWarmupCompleted(th);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.defaultValue;
            if (t == null) {
                if (this.errorOnFewer) {
                    this.downstream.onWarmupCompleted((Throwable) new NoSuchElementException());
                    return;
                } else {
                    this.downstream.onExtraCallbackWithResult();
                    return;
                }
            }
            IAuthTabCallback(t);
        }

        @Override // o.addLogs, o.ycxExternalSyntheticLambda1
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
