package o;

import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt51 extends Record {
    private byte[] data;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) {
        this.data = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return Record.onExtraCallbackWithResult(this.data);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.data);
    }
}
