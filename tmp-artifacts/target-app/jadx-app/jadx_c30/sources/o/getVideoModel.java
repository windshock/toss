package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getVideoModel implements dv12<p_> {
    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, p_ p_Var, dv15 dv15Var) {
        jc3Var.onExtraCallbackWithResult(p_Var);
    }

    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public p_ onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return htfycxVar.validateRelationship();
    }

    @Override // o.dv13
    public Class<p_> onNavigationEvent() {
        return p_.class;
    }
}
