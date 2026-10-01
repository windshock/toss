package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ycx71 implements dv12<ea41> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ea41 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return htfycxVar.requestPostMessageChannel();
    }

    @Override // o.dv13
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, ea41 ea41Var, dv15 dv15Var) {
        jc3Var.onNavigationEvent(ea41Var);
    }

    @Override // o.dv13
    public Class<ea41> onNavigationEvent() {
        return ea41.class;
    }
}
