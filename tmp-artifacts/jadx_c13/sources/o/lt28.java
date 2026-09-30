package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt28 extends Record {
    private int alg;
    private int digestType;
    private byte[] fingerprint;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.alg = getblob.asInterface();
        this.digestType = getblob.asInterface();
        this.fingerprint = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.alg + " " + this.digestType + " " + TRANS_V2_SendReceiverInfo.onExtraCallback(this.fingerprint);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.alg);
        deactivateVar.onNavigationEvent(this.digestType);
        deactivateVar.onNavigationEvent(this.fingerprint);
    }
}
