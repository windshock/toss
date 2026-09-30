package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class beforeTextChanged extends Record {
    private int alg;
    private byte[] digest;
    private int digestid;
    private int footprint;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.footprint = getblob.onExtraCallbackWithResult();
        this.alg = getblob.asInterface();
        this.digestid = getblob.asInterface();
        this.digest = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.footprint);
        sb.append(" ");
        sb.append(this.alg);
        sb.append(" ");
        sb.append(this.digestid);
        if (this.digest != null) {
            sb.append(" ");
            sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback(this.digest));
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.footprint);
        deactivateVar.onNavigationEvent(this.alg);
        deactivateVar.onNavigationEvent(this.digestid);
        byte[] bArr = this.digest;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr);
        }
    }
}
