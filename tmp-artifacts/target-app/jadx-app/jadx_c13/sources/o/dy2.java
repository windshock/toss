package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dy2 extends Record {
    private byte[] address;

    public dy2() {
    }

    public dy2(yzp2 yzp2Var, int i, long j, InetAddress inetAddress) {
        super(yzp2Var, 28, i, j);
        if (dy6.IAuthTabCallback(inetAddress) != 1 && dy6.IAuthTabCallback(inetAddress) != 2) {
            throw new IllegalArgumentException("invalid IPv4/IPv6 address");
        }
        this.address = inetAddress.getAddress();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.address = getblob.IAuthTabCallback(16);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() throws UnknownHostException {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.address);
            if (byAddress.getAddress().length == 4) {
                return "::ffff:" + byAddress.getHostAddress();
            }
            return byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public InetAddress onNavigationEvent() {
        try {
            yzp2 yzp2Var = this.name;
            if (yzp2Var == null) {
                return InetAddress.getByAddress(this.address);
            }
            return InetAddress.getByAddress(yzp2Var.toString(), this.address);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.address);
    }
}
