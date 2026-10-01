package o;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IPBroadcastReceiver3 extends Record {
    private List<onExtraCallbackWithResult> elements;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onExtraCallbackWithResult(int i, int i2) {
        if (i2 < 0 || i2 >= 256) {
            return false;
        }
        return (i != 1 || i2 <= 32) && (i != 2 || i2 <= 128);
    }

    public static class onExtraCallbackWithResult implements Serializable {
        public final Object address;
        public final int family;
        public final boolean negative;
        public final int prefixLength;

        private onExtraCallbackWithResult(int i, boolean z, Object obj, int i2) {
            this.family = i;
            this.negative = z;
            this.address = obj;
            this.prefixLength = i2;
            if (!IPBroadcastReceiver3.onExtraCallbackWithResult(i, i2)) {
                throw new IllegalArgumentException("invalid prefix length");
            }
        }

        public onExtraCallbackWithResult(boolean z, InetAddress inetAddress, int i) {
            this(dy6.IAuthTabCallback(inetAddress), z, inetAddress, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.negative) {
                sb.append("!");
            }
            sb.append(this.family);
            sb.append(":");
            int i = this.family;
            if (i == 1 || i == 2) {
                sb.append(((InetAddress) this.address).getHostAddress());
            } else {
                sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback((byte[]) this.address));
            }
            sb.append("/");
            sb.append(this.prefixLength);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.family == onextracallbackwithresult.family && this.negative == onextracallbackwithresult.negative && this.prefixLength == onextracallbackwithresult.prefixLength && this.address.equals(onextracallbackwithresult.address);
        }

        public int hashCode() {
            return this.address.hashCode() + this.prefixLength + (this.negative ? 1 : 0);
        }
    }

    private static byte[] IAuthTabCallback(byte[] bArr, int i) throws WireParseException {
        if (bArr.length > i) {
            throw new WireParseException("invalid address length");
        }
        if (bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        onExtraCallbackWithResult onextracallbackwithresult;
        this.elements = new ArrayList(1);
        while (getblob.IAuthTabCallbackDefault() != 0) {
            int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
            int iAsInterface = getblob.asInterface();
            int iAsInterface2 = getblob.asInterface();
            boolean z = (iAsInterface2 & 128) != 0;
            byte[] bArrIAuthTabCallback = getblob.IAuthTabCallback(iAsInterface2 & (-129));
            if (!onExtraCallbackWithResult(iOnExtraCallbackWithResult, iAsInterface)) {
                throw new WireParseException("invalid prefix length");
            }
            if (iOnExtraCallbackWithResult == 1 || iOnExtraCallbackWithResult == 2) {
                onextracallbackwithresult = new onExtraCallbackWithResult(z, InetAddress.getByAddress(IAuthTabCallback(bArrIAuthTabCallback, dy6.onWarmupCompleted(iOnExtraCallbackWithResult))), iAsInterface);
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(iOnExtraCallbackWithResult, z, bArrIAuthTabCallback, iAsInterface);
            }
            this.elements.add(onextracallbackwithresult);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        Iterator<onExtraCallbackWithResult> it = this.elements.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static int onWarmupCompleted(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] != 0) {
                return length + 1;
            }
        }
        return 0;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        byte[] address;
        int iOnWarmupCompleted;
        for (onExtraCallbackWithResult onextracallbackwithresult : this.elements) {
            int i = onextracallbackwithresult.family;
            if (i == 1 || i == 2) {
                address = ((InetAddress) onextracallbackwithresult.address).getAddress();
                iOnWarmupCompleted = onWarmupCompleted(address);
            } else {
                address = (byte[]) onextracallbackwithresult.address;
                iOnWarmupCompleted = address.length;
            }
            int i2 = onextracallbackwithresult.negative ? iOnWarmupCompleted | 128 : iOnWarmupCompleted;
            deactivateVar.IAuthTabCallback(onextracallbackwithresult.family);
            deactivateVar.onNavigationEvent(onextracallbackwithresult.prefixLength);
            deactivateVar.onNavigationEvent(i2);
            deactivateVar.onExtraCallback(address, 0, iOnWarmupCompleted);
        }
    }
}
