package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jcsya extends Record {
    private int alg;
    private byte[] cert;
    private int certType;
    private int keyTag;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.certType = getblob.onExtraCallbackWithResult();
        this.keyTag = getblob.onExtraCallbackWithResult();
        this.alg = getblob.asInterface();
        this.cert = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.certType);
        sb.append(" ");
        sb.append(this.keyTag);
        sb.append(" ");
        sb.append(this.alg);
        if (this.cert != null) {
            if (lt17.IAuthTabCallback()) {
                sb.append(" (\n");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.cert, 64, "\t", true));
            } else {
                sb.append(" ");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.cert));
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.certType);
        deactivateVar.IAuthTabCallback(this.keyTag);
        deactivateVar.onNavigationEvent(this.alg);
        deactivateVar.onNavigationEvent(this.cert);
    }
}
