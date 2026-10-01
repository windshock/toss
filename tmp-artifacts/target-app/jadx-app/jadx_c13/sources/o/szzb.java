package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class szzb extends Record {
    private yzp2 next;
    private lt53 types;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.next = new yzp2(getblob);
        this.types = new lt53(getblob);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.next.onNavigationEvent(deactivateVar, (ryzb) null, false);
        this.types.onExtraCallback(deactivateVar);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.next);
        if (!this.types.IAuthTabCallback()) {
            sb.append(' ');
            sb.append(this.types.toString());
        }
        return sb.toString();
    }

    public yzp2 onExtraCallback() {
        return this.next;
    }

    public boolean onExtraCallbackWithResult(int i) {
        return this.types.IAuthTabCallback(i);
    }
}
