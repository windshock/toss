package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt57 extends Record {
    private int priority;
    private byte[] target = new byte[0];
    private int weight;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.priority = getblob.onExtraCallbackWithResult();
        this.weight = getblob.onExtraCallbackWithResult();
        this.target = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.priority + " " + this.weight + " " + Record.onExtraCallbackWithResult(this.target, true);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.priority);
        deactivateVar.IAuthTabCallback(this.weight);
        deactivateVar.onNavigationEvent(this.target);
    }
}
