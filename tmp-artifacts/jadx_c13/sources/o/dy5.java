package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dy5 extends Record {
    private int flags;
    private byte[] tag;
    private byte[] value;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.flags = getblob.asInterface();
        this.tag = getblob.IAuthTabCallback();
        this.value = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.flags + " " + Record.onExtraCallbackWithResult(this.tag, false) + " " + Record.onExtraCallbackWithResult(this.value, true);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.flags);
        deactivateVar.onExtraCallback(this.tag);
        deactivateVar.onNavigationEvent(this.value);
    }
}
