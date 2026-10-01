package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class avycx implements dv12<getBackupContainerBackgroundView> {
    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getBackupContainerBackgroundView onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        return new getBackupContainerBackgroundView(htfycxVar.ICustomTabsCallback_Parcel());
    }

    @Override // o.dv13
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, getBackupContainerBackgroundView getbackupcontainerbackgroundview, dv15 dv15Var) {
        jc3Var.onWarmupCompleted(getbackupcontainerbackgroundview.onNavigationEvent());
    }

    @Override // o.dv13
    public Class<getBackupContainerBackgroundView> onNavigationEvent() {
        return getBackupContainerBackgroundView.class;
    }
}
