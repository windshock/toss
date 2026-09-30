package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class xkz4 implements dv12<setWidthAndHeightRatio> {
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public setWidthAndHeightRatio onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new setWidthAndHeightRatio(htfycxVar.mayLaunchUrl());
    }

    @Override // o.dv13
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, setWidthAndHeightRatio setwidthandheightratio, dv15 dv15Var) {
        jc3Var.onNavigationEvent(setwidthandheightratio.onExtraCallbackWithResult());
    }

    @Override // o.dv13
    public Class<setWidthAndHeightRatio> onNavigationEvent() {
        return setWidthAndHeightRatio.class;
    }
}
