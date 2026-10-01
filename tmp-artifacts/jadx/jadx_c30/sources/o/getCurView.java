package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurView implements dv12<ycxdj1> {
    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, ycxdj1 ycxdj1Var, dv15 dv15Var) {
        jc3Var.onWarmupCompleted(ycxdj1Var.onNavigationEvent());
    }

    @Override // o.dv16
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ycxdj1 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new ycxdj1(htfycxVar.receiveFile());
    }

    @Override // o.dv13
    public Class<ycxdj1> onNavigationEvent() {
        return ycxdj1.class;
    }
}
