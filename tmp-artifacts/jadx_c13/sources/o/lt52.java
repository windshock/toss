package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt52 extends Record {
    protected yzp2 nameField;
    protected int u16Field;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.u16Field = getblob.onExtraCallbackWithResult();
        this.nameField = new yzp2(getblob);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.u16Field + " " + this.nameField;
    }

    protected yzp2 onExtraCallbackWithResult() {
        return this.nameField;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.u16Field);
        this.nameField.onNavigationEvent(deactivateVar, (ryzb) null, z);
    }
}
