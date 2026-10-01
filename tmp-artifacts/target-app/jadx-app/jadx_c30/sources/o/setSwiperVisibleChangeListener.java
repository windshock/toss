package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setSwiperVisibleChangeListener implements dv12<ea4> {
    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ea4 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new ea4(htfycxVar.ICustomTabsServiceStub());
    }

    @Override // o.dv13
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, ea4 ea4Var, dv15 dv15Var) {
        jc3Var.asInterface(ea4Var.onExtraCallback());
    }

    @Override // o.dv13
    public Class<ea4> onNavigationEvent() {
        return ea4.class;
    }
}
