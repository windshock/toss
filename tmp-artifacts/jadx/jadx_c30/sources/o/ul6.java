package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ul6 implements dv12<wie5> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public wie5 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new wie5(htfycxVar.postMessage());
    }

    @Override // o.dv13
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, wie5 wie5Var, dv15 dv15Var) {
        jc3Var.IAuthTabCallback(wie5Var.onNavigationEvent());
    }

    @Override // o.dv13
    public Class<wie5> onNavigationEvent() {
        return wie5.class;
    }
}
