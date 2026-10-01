package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class moveToLast extends Record {
    private byte[] cpu;
    private byte[] os;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.cpu = getblob.IAuthTabCallback();
        this.os = getblob.IAuthTabCallback();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onExtraCallback(this.cpu);
        deactivateVar.onExtraCallback(this.os);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return Record.onExtraCallbackWithResult(this.cpu, true) + " " + Record.onExtraCallbackWithResult(this.os, true);
    }
}
