package o;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hasMemoryError<T> extends getByteBuffer<T> {
    final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> onExtraCallbackWithResult;

    public hasMemoryError(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<? extends T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        this.onExtraCallbackWithResult = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onExtraCallbackWithResult.subscribe(new onExtraCallback(writequoted));
    }

    static final class onExtraCallback<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
        final writeQuoted<? super T> onExtraCallback;
        ycxExternalSyntheticLambda1 onWarmupCompleted;

        onExtraCallback(writeQuoted<? super T> writequoted) {
            this.onExtraCallback = writequoted;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.onExtraCallback.onExtraCallback();
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.onExtraCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.onExtraCallback.onExtraCallback(t);
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (setLogs.validate(this.onWarmupCompleted, ycxexternalsyntheticlambda1)) {
                this.onWarmupCompleted = ycxexternalsyntheticlambda1;
                this.onExtraCallback.IAuthTabCallback(this);
                ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted.cancel();
            this.onWarmupCompleted = setLogs.CANCELLED;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted == setLogs.CANCELLED;
        }
    }
}
