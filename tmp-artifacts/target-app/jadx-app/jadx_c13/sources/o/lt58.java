package o;

import java.io.IOException;
import java.util.ArrayList;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt58 extends Record {
    private byte[] address;
    private int protocol;
    private int[] services;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.address = getblob.IAuthTabCallback(4);
        this.protocol = getblob.asInterface();
        byte[] bArrOnExtraCallback = getblob.onExtraCallback();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArrOnExtraCallback.length; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if ((bArrOnExtraCallback[i] & 255 & (1 << (7 - i2))) != 0) {
                    arrayList.add(Integer.valueOf((i << 3) + i2));
                }
            }
        }
        this.services = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.services[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(dy6.onWarmupCompleted(this.address));
        sb.append(" ");
        sb.append(this.protocol);
        for (int i : this.services) {
            sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.address);
        deactivateVar.onNavigationEvent(this.protocol);
        int[] iArr = this.services;
        byte[] bArr = new byte[(iArr[iArr.length - 1] / 8) + 1];
        for (int i : iArr) {
            int i2 = i / 8;
            bArr[i2] = (byte) (((byte) (1 << (7 - (i % 8)))) | bArr[i2]);
        }
        deactivateVar.onNavigationEvent(bArr);
    }
}
