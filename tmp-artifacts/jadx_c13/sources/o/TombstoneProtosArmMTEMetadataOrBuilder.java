package o;

import o.TombstoneProtosArmMTEMetadataBuilder;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosArmMTEMetadataOrBuilder<T> extends ObjectConverter2<T, T> {
    final deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Throwable>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> onExtraCallback;

    public TombstoneProtosArmMTEMetadataOrBuilder(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super JsonReaderUnknownNumberParsing<Throwable>, ? extends r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<?>> deserializeintnullablecollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = deserializeintnullablecollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        getTagBytes gettagbytes = new getTagBytes(ycxexternalsyntheticlambda0);
        access27300<T> access27300VarOnActivityLayout = access27500.onExtraCallbackWithResult(8).onActivityLayout();
        try {
            r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) floatExponent.onExtraCallbackWithResult(this.onExtraCallback.apply(access27300VarOnActivityLayout), "handler returned a null Publisher");
            TombstoneProtosArmMTEMetadataBuilder.onExtraCallbackWithResult onextracallbackwithresult = new TombstoneProtosArmMTEMetadataBuilder.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(gettagbytes, access27300VarOnActivityLayout, onextracallbackwithresult);
            onextracallbackwithresult.subscriber = onwarmupcompleted;
            ycxexternalsyntheticlambda0.onExtraCallback(onwarmupcompleted);
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(onextracallbackwithresult);
            onextracallbackwithresult.onWarmupCompleted((Object) 0);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            access25900.error(th, ycxexternalsyntheticlambda0);
        }
    }

    static final class onWarmupCompleted<T> extends TombstoneProtosArmMTEMetadataBuilder.onExtraCallback<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, access27300<Throwable> access27300Var, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            super(ycxexternalsyntheticlambda0, access27300Var, ycxexternalsyntheticlambda1);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            onNavigationEvent(th);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.receiver.cancel();
            this.downstream.onExtraCallbackWithResult();
        }
    }
}
