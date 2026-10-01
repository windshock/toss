package o;

import java.io.IOException;
import java.util.BitSet;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxfby extends Record {
    private BitSet bitmap;
    private yzp2 next;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.next = new yzp2(getblob);
        this.bitmap = new BitSet();
        int iIAuthTabCallbackDefault = getblob.IAuthTabCallbackDefault();
        for (int i = 0; i < iIAuthTabCallbackDefault; i++) {
            int iAsInterface = getblob.asInterface();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & iAsInterface) != 0) {
                    this.bitmap.set((i << 3) + i2);
                }
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.next);
        int length = this.bitmap.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.bitmap.get(s)) {
                sb.append(" ");
                sb.append(lt54.onNavigationEvent(s));
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.next.onNavigationEvent(deactivateVar, (ryzb) null, z);
        int length = this.bitmap.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.bitmap.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                deactivateVar.onNavigationEvent(i);
                i = 0;
            }
        }
    }
}
