package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi7 implements dv12<RFEndCardBackUpLayout1> {
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RFEndCardBackUpLayout1 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return RFEndCardBackUpLayout1.IAuthTabCallback(htfycxVar.onRelationshipValidationResult());
    }

    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, RFEndCardBackUpLayout1 rFEndCardBackUpLayout1, dv15 dv15Var) {
        jc3Var.onExtraCallback(rFEndCardBackUpLayout1.onWarmupCompleted());
    }

    @Override // o.dv13
    public Class<RFEndCardBackUpLayout1> onNavigationEvent() {
        return RFEndCardBackUpLayout1.class;
    }
}
