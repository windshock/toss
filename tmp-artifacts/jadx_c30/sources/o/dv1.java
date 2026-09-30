package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv1 implements dv12<jc4> {
    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public jc4 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        htfycxVar.ICustomTabsServiceDefault();
        return new jc4();
    }

    @Override // o.dv13
    public void onWarmupCompleted(jc3 jc3Var, jc4 jc4Var, dv15 dv15Var) {
        jc3Var.onActivityResized();
    }

    @Override // o.dv13
    public Class<jc4> onNavigationEvent() {
        return jc4.class;
    }
}
