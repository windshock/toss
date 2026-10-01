package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt29 extends Record {
    private int port;
    private int priority;
    private yzp2 target;
    private int weight;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.priority = getblob.onExtraCallbackWithResult();
        this.weight = getblob.onExtraCallbackWithResult();
        this.port = getblob.onExtraCallbackWithResult();
        this.target = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.priority + " " + this.weight + " " + this.port + " " + this.target;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.priority);
        deactivateVar.IAuthTabCallback(this.weight);
        deactivateVar.IAuthTabCallback(this.port);
        this.target.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }

    @Override // org.xbill.DNS.Record
    public yzp2 cA_() {
        return this.target;
    }
}
