package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi8 implements dv12<RFEndCardBackUpLayout2> {
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RFEndCardBackUpLayout2 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return htfycxVar.ICustomTabsCallbackStubProxy();
    }

    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, RFEndCardBackUpLayout2 rFEndCardBackUpLayout2, dv15 dv15Var) {
        jc3Var.onExtraCallbackWithResult(rFEndCardBackUpLayout2);
    }

    @Override // o.dv13
    public Class<RFEndCardBackUpLayout2> onNavigationEvent() {
        return RFEndCardBackUpLayout2.class;
    }
}
