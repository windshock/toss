package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class lt40 extends lt41 {
    protected lt40() {
    }

    protected lt40(yzp2 yzp2Var, int i, int i2, long j, yzp2 yzp2Var2, String str) {
        super(yzp2Var, i, i2, j, yzp2Var2, str);
    }

    @Override // o.lt41, org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.singleName.onNavigationEvent(deactivateVar, ryzbVar, z);
    }
}
