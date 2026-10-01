package o;

import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sz2 extends Record {
    private byte[] address;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) {
        this.address = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.address);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return "0x" + TRANS_V2_SendReceiverInfo.onExtraCallback(this.address);
    }
}
