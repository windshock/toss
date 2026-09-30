package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi4 implements dv12<initOneSlotMultipleAdsLayoutLandscape> {
    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape, dv15 dv15Var) {
        jc3Var.onExtraCallback(initoneslotmultipleadslayoutlandscape);
    }

    @Override // o.dv16
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public initOneSlotMultipleAdsLayoutLandscape onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return htfycxVar.ICustomTabsCallbackDefault();
    }

    @Override // o.dv13
    public Class<initOneSlotMultipleAdsLayoutLandscape> onNavigationEvent() {
        return initOneSlotMultipleAdsLayoutLandscape.class;
    }
}
