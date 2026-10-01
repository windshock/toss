package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onChildViewRemoved extends Record {
    private byte[] flags;
    private int order;
    private int preference;
    private byte[] regexp;
    private yzp2 replacement;
    private byte[] service;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.order = getblob.onExtraCallbackWithResult();
        this.preference = getblob.onExtraCallbackWithResult();
        this.flags = getblob.IAuthTabCallback();
        this.service = getblob.IAuthTabCallback();
        this.regexp = getblob.IAuthTabCallback();
        this.replacement = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.order + " " + this.preference + " " + Record.onExtraCallbackWithResult(this.flags, true) + " " + Record.onExtraCallbackWithResult(this.service, true) + " " + Record.onExtraCallbackWithResult(this.regexp, true) + " " + this.replacement;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.order);
        deactivateVar.IAuthTabCallback(this.preference);
        deactivateVar.onExtraCallback(this.flags);
        deactivateVar.onExtraCallback(this.service);
        deactivateVar.onExtraCallback(this.regexp);
        this.replacement.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }

    @Override // org.xbill.DNS.Record
    public yzp2 cA_() {
        return this.replacement;
    }
}
