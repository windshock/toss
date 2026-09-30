package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class szycx extends Record {
    private int flags;
    private int hashAlg;
    private int iterations;
    private byte[] salt;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.hashAlg = getblob.asInterface();
        this.flags = getblob.asInterface();
        this.iterations = getblob.onExtraCallbackWithResult();
        int iAsInterface = getblob.asInterface();
        if (iAsInterface > 0) {
            this.salt = getblob.IAuthTabCallback(iAsInterface);
        } else {
            this.salt = null;
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.hashAlg);
        deactivateVar.onNavigationEvent(this.flags);
        deactivateVar.IAuthTabCallback(this.iterations);
        byte[] bArr = this.salt;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr.length);
            deactivateVar.onNavigationEvent(this.salt);
        } else {
            deactivateVar.onNavigationEvent(0);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hashAlg);
        sb.append(' ');
        sb.append(this.flags);
        sb.append(' ');
        sb.append(this.iterations);
        sb.append(' ');
        byte[] bArr = this.salt;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback(bArr));
        }
        return sb.toString();
    }
}
