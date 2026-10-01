package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv10 implements dv12<jc2> {
    private final dv18 onExtraCallbackWithResult;

    public dv10() {
        this(dv2.onWarmupCompleted(new dv11()));
    }

    public dv10(dv18 dv18Var) {
        this.onExtraCallbackWithResult = dv18Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public jc2 onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return (jc2) this.onExtraCallbackWithResult.onNavigationEvent(dv11.onExtraCallback(htfycxVar.onActivityLayout())).onNavigationEvent(htfycxVar, dv17Var);
    }

    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, jc2 jc2Var, dv15 dv15Var) {
        dv15Var.onNavigationEvent(this.onExtraCallbackWithResult.onNavigationEvent(jc2Var.getClass()), jc3Var, jc2Var);
    }

    @Override // o.dv13
    public Class<jc2> onNavigationEvent() {
        return jc2.class;
    }
}
