package o;

import java.io.IOException;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class afterTextChanged extends isLast {
    private byte[] clientCookie;
    private byte[] serverCookie;

    afterTextChanged() {
        super(10);
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) throws IOException {
        int iIAuthTabCallbackDefault = getblob.IAuthTabCallbackDefault();
        if (iIAuthTabCallbackDefault < 8) {
            throw new WireParseException("invalid length of client cookie");
        }
        this.clientCookie = getblob.IAuthTabCallback(8);
        if (iIAuthTabCallbackDefault > 8) {
            if (iIAuthTabCallbackDefault < 16 || iIAuthTabCallbackDefault > 40) {
                throw new WireParseException("invalid length of server cookie");
            }
            this.serverCookie = getblob.onExtraCallback();
        }
    }

    @Override // o.isLast
    void onNavigationEvent(deactivate deactivateVar) {
        deactivateVar.onNavigationEvent(this.clientCookie);
        byte[] bArr = this.serverCookie;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr);
        }
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        if (this.serverCookie != null) {
            return TRANS_V2_SendReceiverInfo.onExtraCallback(this.clientCookie) + " " + TRANS_V2_SendReceiverInfo.onExtraCallback(this.serverCookie);
        }
        return TRANS_V2_SendReceiverInfo.onExtraCallback(this.clientCookie);
    }
}
