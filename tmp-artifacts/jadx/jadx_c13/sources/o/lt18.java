package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt18 extends Record {
    private yzp2 map822;
    private yzp2 mapX400;
    private int preference;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.preference = getblob.onExtraCallbackWithResult();
        this.map822 = new yzp2(getblob);
        this.mapX400 = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.preference + " " + this.map822 + " " + this.mapX400;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.preference);
        this.map822.onNavigationEvent(deactivateVar, (ryzb) null, z);
        this.mapX400.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }
}
