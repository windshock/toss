package org.xbill.DNS;

import java.io.IOException;
import o.deactivate;
import o.getBlob;
import o.ryzb;
import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RPRecord extends Record {
    private yzp2 mailbox;
    private yzp2 textDomain;

    RPRecord() {
    }

    @Override // org.xbill.DNS.Record
    protected void onExtraCallback(getBlob getblob) throws IOException {
        this.mailbox = new yzp2(getblob);
        this.textDomain = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    protected String IAuthTabCallback() {
        return this.mailbox + " " + this.textDomain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.mailbox.onNavigationEvent(deactivateVar, (ryzb) null, z);
        this.textDomain.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }
}
