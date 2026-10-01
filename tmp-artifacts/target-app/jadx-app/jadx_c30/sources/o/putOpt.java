package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class putOpt implements dv12<wiezb> {
    @Override // o.dv16
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public wiezb onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        htfycxVar.setEngagementSignalsCallback();
        return wiezb.onNavigationEvent;
    }

    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, wiezb wiezbVar, dv15 dv15Var) {
        jc3Var.writeTypedObject();
    }

    @Override // o.dv13
    public Class<wiezb> onNavigationEvent() {
        return wiezb.class;
    }
}
