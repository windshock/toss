package o;

import java.io.IOException;
import java.net.InetAddress;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IPBroadcastReceiver21 extends Record {
    private yzp2 prefix;
    private int prefixBits;
    private InetAddress suffix;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        int iAsInterface = getblob.asInterface();
        this.prefixBits = iAsInterface;
        int i = (135 - iAsInterface) / 8;
        if (iAsInterface < 128) {
            byte[] bArr = new byte[16];
            getblob.onExtraCallback(bArr, 16 - i, i);
            this.suffix = InetAddress.getByAddress(bArr);
        }
        if (this.prefixBits > 0) {
            this.prefix = new yzp2(getblob);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefixBits);
        if (this.suffix != null) {
            sb.append(" ");
            sb.append(this.suffix.getHostAddress());
        }
        if (this.prefix != null) {
            sb.append(" ");
            sb.append(this.prefix);
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.prefixBits);
        InetAddress inetAddress = this.suffix;
        if (inetAddress != null) {
            int i = (135 - this.prefixBits) / 8;
            deactivateVar.onExtraCallback(inetAddress.getAddress(), 16 - i, i);
        }
        yzp2 yzp2Var = this.prefix;
        if (yzp2Var != null) {
            yzp2Var.onNavigationEvent(deactivateVar, (ryzb) null, z);
        }
    }
}
