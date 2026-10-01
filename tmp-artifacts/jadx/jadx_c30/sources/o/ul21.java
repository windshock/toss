package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ul21 implements dv12<setWidthOrHeightInParentRatio> {
    private final dv12<getButtonTextForNewStyleBar> onExtraCallbackWithResult;

    public ul21(dv12<getButtonTextForNewStyleBar> dv12Var) {
        this.onExtraCallbackWithResult = dv12Var;
    }

    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public setWidthOrHeightInParentRatio onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        throw new UnsupportedOperationException("Decoding into a BsonDocumentWrapper is not allowed");
    }

    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, setWidthOrHeightInParentRatio setwidthorheightinparentratio, dv15 dv15Var) {
        if (setwidthorheightinparentratio.asInterface()) {
            this.onExtraCallbackWithResult.onWarmupCompleted(jc3Var, setwidthorheightinparentratio, dv15Var);
        } else {
            setwidthorheightinparentratio.onExtraCallback().onWarmupCompleted(jc3Var, setwidthorheightinparentratio.onExtraCallbackWithResult(), dv15Var);
        }
    }

    @Override // o.dv13
    public Class<setWidthOrHeightInParentRatio> onNavigationEvent() {
        return setWidthOrHeightInParentRatio.class;
    }
}
