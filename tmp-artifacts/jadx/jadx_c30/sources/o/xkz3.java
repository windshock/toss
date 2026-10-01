package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class xkz3 implements dv12<wie4> {
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public wie4 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new wie4(htfycxVar.newSession());
    }

    @Override // o.dv13
    public void onWarmupCompleted(jc3 jc3Var, wie4 wie4Var, dv15 dv15Var) {
        jc3Var.asBinder(wie4Var.onNavigationEvent());
    }

    @Override // o.dv13
    public Class<wie4> onNavigationEvent() {
        return wie4.class;
    }
}
