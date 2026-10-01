package o;

import java.io.IOException;
import java.net.InetAddress;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DeviceUtils1 extends Record {
    private int algorithmType;
    private Object gateway;
    private int gatewayType;
    private byte[] key;
    private int precedence;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.precedence = getblob.asInterface();
        this.gatewayType = getblob.asInterface();
        this.algorithmType = getblob.asInterface();
        int i = this.gatewayType;
        if (i == 0) {
            this.gateway = null;
        } else if (i == 1) {
            this.gateway = InetAddress.getByAddress(getblob.IAuthTabCallback(4));
        } else if (i == 2) {
            this.gateway = InetAddress.getByAddress(getblob.IAuthTabCallback(16));
        } else if (i == 3) {
            this.gateway = new yzp2(getblob);
        } else {
            throw new WireParseException("invalid gateway type");
        }
        if (getblob.IAuthTabCallbackDefault() > 0) {
            this.key = getblob.onExtraCallback();
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.precedence);
        sb.append(" ");
        sb.append(this.gatewayType);
        sb.append(" ");
        sb.append(this.algorithmType);
        sb.append(" ");
        int i = this.gatewayType;
        if (i == 0) {
            sb.append(".");
        } else if (i == 1 || i == 2) {
            sb.append(((InetAddress) this.gateway).getHostAddress());
        } else if (i == 3) {
            sb.append(this.gateway);
        }
        if (this.key != null) {
            sb.append(" ");
            sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.key));
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.precedence);
        deactivateVar.onNavigationEvent(this.gatewayType);
        deactivateVar.onNavigationEvent(this.algorithmType);
        int i = this.gatewayType;
        if (i == 1 || i == 2) {
            deactivateVar.onNavigationEvent(((InetAddress) this.gateway).getAddress());
        } else if (i == 3) {
            ((yzp2) this.gateway).onNavigationEvent(deactivateVar, (ryzb) null, z);
        }
        byte[] bArr = this.key;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr);
        }
    }
}
