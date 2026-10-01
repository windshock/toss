package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oby1 extends Record {
    private yzp2 errorAddress;
    private yzp2 responsibleAddress;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.responsibleAddress = new yzp2(getblob);
        this.errorAddress = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.responsibleAddress + " " + this.errorAddress;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.responsibleAddress.onNavigationEvent(deactivateVar, (ryzb) null, z);
        this.errorAddress.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }
}
