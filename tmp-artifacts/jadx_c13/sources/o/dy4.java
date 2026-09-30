package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dy4 extends Record {
    private int addr;

    public dy4() {
    }

    private static int onNavigationEvent(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    private static byte[] onExtraCallbackWithResult(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public dy4(yzp2 yzp2Var, int i, long j, InetAddress inetAddress) {
        super(yzp2Var, 1, i, j);
        if (dy6.IAuthTabCallback(inetAddress) != 1) {
            throw new IllegalArgumentException("invalid IPv4 address");
        }
        this.addr = onNavigationEvent(inetAddress.getAddress());
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.addr = onNavigationEvent(getblob.IAuthTabCallback(4));
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return dy6.onWarmupCompleted(onExtraCallbackWithResult(this.addr));
    }

    public InetAddress onExtraCallback() {
        try {
            yzp2 yzp2Var = this.name;
            if (yzp2Var == null) {
                return InetAddress.getByAddress(onExtraCallbackWithResult(this.addr));
            }
            return InetAddress.getByAddress(yzp2Var.toString(), onExtraCallbackWithResult(this.addr));
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onWarmupCompleted(this.addr & 4294967295L);
    }
}
