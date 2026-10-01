package o;

import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby11 extends Record {
    private byte[] cert;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) {
        this.cert = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        if (this.cert != null) {
            if (lt17.IAuthTabCallback()) {
                sb.append("(\n");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.cert, 64, "\t", true));
            } else {
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.cert));
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.cert);
    }
}
