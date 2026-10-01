package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosArmMTEMetadataBuilder<T> extends ObjectConverter2<T, T> {
    final deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Object>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> IAuthTabCallback;

    public TombstoneProtosArmMTEMetadataBuilder(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Object>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        super(jsonReaderUnknownNumberParsing);
        this.IAuthTabCallback = deserializeintnullablecollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        getTagBytes gettagbytes = new getTagBytes(ycxexternalsyntheticlambda0);
        access27300<T> access27300VarOnActivityLayout = access27500.onExtraCallbackWithResult(8).onActivityLayout();
        try {
            r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallback.apply(access27300VarOnActivityLayout), "handler returned a null Publisher");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(gettagbytes, access27300VarOnActivityLayout, onextracallbackwithresult);
            onextracallbackwithresult.subscriber = iAuthTabCallback;
            ycxexternalsyntheticlambda0.onExtraCallback(iAuthTabCallback);
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(onextracallbackwithresult);
            onextracallbackwithresult.onWarmupCompleted((Object) 0);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            access25900.error(th, ycxexternalsyntheticlambda0);
        }
    }

    static final class onExtraCallbackWithResult<T, U> extends AtomicInteger implements JsonReaderReadObject<Object>, ycxExternalSyntheticLambda1 {
        private static final long serialVersionUID = 2827772011130406689L;
        final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> source;
        onExtraCallback<T, U> subscriber;
        final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        onExtraCallbackWithResult(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
            this.source = r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            setLogs.deferredSetOnce(this.upstream, this.requested, ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != setLogs.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.subscriber.cancel();
            this.subscriber.downstream.onExtraCallbackWithResult();
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            setLogs.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            setLogs.cancel(this.upstream);
        }
    }

    static abstract class onExtraCallback<T, U> extends setNameBytes implements JsonReaderReadObject<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final ycxExternalSyntheticLambda0<? super T> downstream;
        protected final access27300<U> processor;
        private long produced;
        protected final ycxExternalSyntheticLambda1 receiver;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, access27300<U> access27300Var, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            super(false);
            this.downstream = ycxexternalsyntheticlambda0;
            this.processor = access27300Var;
            this.receiver = ycxexternalsyntheticlambda1;
        }

        @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
        public final void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            onWarmupCompleted(ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public final void onWarmupCompleted(T t) {
            this.produced++;
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        }

        protected final void onNavigationEvent(U u) {
            onWarmupCompleted((ycxExternalSyntheticLambda1) access25900.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                onWarmupCompleted(j);
            }
            this.receiver.request(1L);
            this.processor.onWarmupCompleted((access27300<U>) u);
        }

        @Override // o.setNameBytes, o.ycxExternalSyntheticLambda1
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }
    }

    static final class IAuthTabCallback<T> extends onExtraCallback<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, access27300<Object> access27300Var, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            super(ycxexternalsyntheticlambda0, access27300Var, ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            this.receiver.cancel();
            this.downstream.onWarmupCompleted(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            onNavigationEvent(0);
        }
    }
}
