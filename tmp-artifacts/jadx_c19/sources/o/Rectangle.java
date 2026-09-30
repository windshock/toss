package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Rectangle extends KeyParserExternalSyntheticLambda0<TransitionExternalSyntheticLambda6> {
    public Rectangle(TransitionExternalSyntheticLambda6 transitionExternalSyntheticLambda6) {
        super(transitionExternalSyntheticLambda6);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<TransitionExternalSyntheticLambda6> onExtraCallbackWithResult() {
        return TransitionExternalSyntheticLambda6.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return ((TransitionExternalSyntheticLambda6) this.onExtraCallback).onWarmupCompleted();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
        ((TransitionExternalSyntheticLambda6) this.onExtraCallback).stop();
        ((TransitionExternalSyntheticLambda6) this.onExtraCallback).IAuthTabCallbackStub();
    }

    @Override // o.KeyParserExternalSyntheticLambda0, o.Savers_androidKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        ((TransitionExternalSyntheticLambda6) this.onExtraCallback).onExtraCallback().prepareToDraw();
    }
}
