package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class tn2 extends isLast {
    private InetAddress address;
    private int family;
    private int scopePrefixLength;
    private int sourcePrefixLength;

    tn2() {
        super(8);
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) throws WireParseException, UnknownHostException {
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        this.family = iOnExtraCallbackWithResult;
        if (iOnExtraCallbackWithResult != 1 && iOnExtraCallbackWithResult != 2) {
            throw new WireParseException("unknown address family");
        }
        int iAsInterface = getblob.asInterface();
        this.sourcePrefixLength = iAsInterface;
        if (iAsInterface > (dy6.onWarmupCompleted(this.family) << 3)) {
            throw new WireParseException("invalid source netmask");
        }
        int iAsInterface2 = getblob.asInterface();
        this.scopePrefixLength = iAsInterface2;
        if (iAsInterface2 > (dy6.onWarmupCompleted(this.family) << 3)) {
            throw new WireParseException("invalid scope netmask");
        }
        byte[] bArrOnExtraCallback = getblob.onExtraCallback();
        if (bArrOnExtraCallback.length != (this.sourcePrefixLength + 7) / 8) {
            throw new WireParseException("invalid address");
        }
        byte[] bArr = new byte[dy6.onWarmupCompleted(this.family)];
        System.arraycopy(bArrOnExtraCallback, 0, bArr, 0, bArrOnExtraCallback.length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.address = byAddress;
            if (!dy6.onNavigationEvent(byAddress, this.sourcePrefixLength).equals(this.address)) {
                throw new WireParseException("invalid padding");
            }
        } catch (UnknownHostException e) {
            throw new WireParseException("invalid address", e);
        }
    }

    @Override // o.isLast
    void onNavigationEvent(deactivate deactivateVar) {
        deactivateVar.IAuthTabCallback(this.family);
        deactivateVar.onNavigationEvent(this.sourcePrefixLength);
        deactivateVar.onNavigationEvent(this.scopePrefixLength);
        deactivateVar.onExtraCallback(this.address.getAddress(), 0, (this.sourcePrefixLength + 7) / 8);
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        return this.address.getHostAddress() + "/" + this.sourcePrefixLength + ", scope netmask " + this.scopePrefixLength;
    }
}
