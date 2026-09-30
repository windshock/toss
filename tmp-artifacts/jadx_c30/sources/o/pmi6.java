package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi6 implements dv12<getCnOrEnBtnText> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getCnOrEnBtnText onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new getCnOrEnBtnText(htfycxVar.onUnminimized());
    }

    @Override // o.dv13
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, getCnOrEnBtnText getcnorenbtntext, dv15 dv15Var) {
        jc3Var.onExtraCallbackWithResult(getcnorenbtntext.onWarmupCompleted());
    }

    @Override // o.dv13
    public Class<getCnOrEnBtnText> onNavigationEvent() {
        return getCnOrEnBtnText.class;
    }
}
