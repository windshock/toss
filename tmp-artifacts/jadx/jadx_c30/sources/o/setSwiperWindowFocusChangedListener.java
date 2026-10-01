package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setSwiperWindowFocusChangedListener implements dv12<htf4> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public htf4 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new htf4(htfycxVar.updateVisuals());
    }

    @Override // o.dv13
    public void onWarmupCompleted(jc3 jc3Var, htf4 htf4Var, dv15 dv15Var) {
        jc3Var.IAuthTabCallbackDefault(htf4Var.onExtraCallbackWithResult());
    }

    @Override // o.dv13
    public Class<htf4> onNavigationEvent() {
        return htf4.class;
    }
}
