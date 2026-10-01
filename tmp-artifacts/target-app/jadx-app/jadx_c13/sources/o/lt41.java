package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class lt41 extends Record {
    protected yzp2 singleName;

    protected lt41() {
    }

    protected lt41(yzp2 yzp2Var, int i, int i2, long j, yzp2 yzp2Var2, String str) {
        super(yzp2Var, i, i2, j);
        this.singleName = Record.IAuthTabCallback(str, yzp2Var2);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.singleName = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.singleName.toString();
    }

    protected yzp2 onExtraCallback() {
        return this.singleName;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.singleName.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }
}
