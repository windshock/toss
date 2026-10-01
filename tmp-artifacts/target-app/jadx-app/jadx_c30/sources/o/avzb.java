package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class avzb implements dv12<getOutline> {
    private final dv12<getButtonTextForNewStyleBar> onNavigationEvent;

    public avzb(dv12<getButtonTextForNewStyleBar> dv12Var) {
        this.onNavigationEvent = dv12Var;
    }

    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getOutline onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new getOutline(htfycxVar.prefetch(), this.onNavigationEvent.onNavigationEvent(htfycxVar, dv17Var));
    }

    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, getOutline getoutline, dv15 dv15Var) {
        jc3Var.IAuthTabCallbackStub(getoutline.onNavigationEvent());
        this.onNavigationEvent.onWarmupCompleted(jc3Var, getoutline.onExtraCallback(), dv15Var);
    }

    @Override // o.dv13
    public Class<getOutline> onNavigationEvent() {
        return getOutline.class;
    }
}
