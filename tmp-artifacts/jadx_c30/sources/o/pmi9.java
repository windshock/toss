package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi9 implements dv12<ea2> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ea2 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new ea2(htfycxVar.isEngagementSignalsApiAvailable());
    }

    @Override // o.dv13
    public void onWarmupCompleted(jc3 jc3Var, ea2 ea2Var, dv15 dv15Var) {
        jc3Var.onExtraCallback(ea2Var.onWarmupCompleted());
    }

    @Override // o.dv13
    public Class<ea2> onNavigationEvent() {
        return ea2.class;
    }
}
