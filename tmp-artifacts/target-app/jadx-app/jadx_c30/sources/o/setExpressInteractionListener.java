package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setExpressInteractionListener implements dv12<wiezb1> {
    @Override // o.dv13
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, wiezb1 wiezb1Var, dv15 dv15Var) {
        jc3Var.ICustomTabsCallback();
    }

    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public wiezb1 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        htfycxVar.newAuthTabSession();
        return new wiezb1();
    }

    @Override // o.dv13
    public Class<wiezb1> onNavigationEvent() {
        return wiezb1.class;
    }
}
