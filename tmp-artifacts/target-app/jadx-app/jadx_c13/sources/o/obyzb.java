package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class obyzb extends lt52 {
    @Override // o.lt52, org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.u16Field);
        this.nameField.onNavigationEvent(deactivateVar, ryzbVar, z);
    }

    @Override // org.xbill.DNS.Record
    public yzp2 cA_() {
        return onExtraCallbackWithResult();
    }
}
