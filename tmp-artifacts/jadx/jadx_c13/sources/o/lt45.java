package o;

import java.io.IOException;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt45 extends Record {
    private byte[] certificateAssociationData;
    private int certificateUsage;
    private int matchingType;
    private int selector;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.certificateUsage = getblob.asInterface();
        this.selector = getblob.asInterface();
        this.matchingType = getblob.asInterface();
        byte[] bArrOnExtraCallback = getblob.onExtraCallback();
        this.certificateAssociationData = bArrOnExtraCallback;
        if (bArrOnExtraCallback.length == 0) {
            throw new WireParseException("end of input");
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return this.certificateUsage + " " + this.selector + " " + this.matchingType + " " + TRANS_V2_SendReceiverInfo.onExtraCallback(this.certificateAssociationData);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.certificateUsage);
        deactivateVar.onNavigationEvent(this.selector);
        deactivateVar.onNavigationEvent(this.matchingType);
        deactivateVar.onNavigationEvent(this.certificateAssociationData);
    }
}
