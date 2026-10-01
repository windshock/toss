package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setIsShow implements dv12<wie6> {
    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, wie6 wie6Var, dv15 dv15Var) {
        jc3Var.extraCallbackWithResult();
    }

    @Override // o.dv16
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public wie6 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        htfycxVar.newSessionWithExtras();
        return new wie6();
    }

    @Override // o.dv13
    public Class<wie6> onNavigationEvent() {
        return wie6.class;
    }
}
