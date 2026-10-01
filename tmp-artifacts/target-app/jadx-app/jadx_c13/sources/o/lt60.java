package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt60 extends Record {
    private byte[] address;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.address = getblob.IAuthTabCallback();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onExtraCallback(this.address);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return Record.onExtraCallbackWithResult(this.address, true);
    }
}
