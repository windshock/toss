package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DeviceUtils3 extends Record {
    private byte[] address;
    private byte[] subAddress;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.address = getblob.IAuthTabCallback();
        if (getblob.IAuthTabCallbackDefault() > 0) {
            this.subAddress = getblob.IAuthTabCallback();
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onExtraCallback(this.address);
        byte[] bArr = this.subAddress;
        if (bArr != null) {
            deactivateVar.onExtraCallback(bArr);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.onExtraCallbackWithResult(this.address, true));
        if (this.subAddress != null) {
            sb.append(" ");
            sb.append(Record.onExtraCallbackWithResult(this.subAddress, true));
        }
        return sb.toString();
    }
}
