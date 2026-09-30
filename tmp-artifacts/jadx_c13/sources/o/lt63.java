package o;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt63 extends Record {
    private byte[] digest;
    private int hashAlgorithm;
    private int scheme;
    private long serial;

    public static final class onWarmupCompleted {
        private static final sz1 onExtraCallback;
        private static final Map<Integer, Integer> onWarmupCompleted;

        static {
            sz1 sz1Var = new sz1("ZONEMD Hash Algorithms", 2);
            onExtraCallback = sz1Var;
            HashMap map = new HashMap(2);
            onWarmupCompleted = map;
            sz1Var.onNavigationEvent(255);
            sz1Var.onWarmupCompleted(true);
            sz1Var.IAuthTabCallback(0, "RESERVED");
            sz1Var.IAuthTabCallback(1, "SHA384");
            map.put(1, 48);
            sz1Var.IAuthTabCallback(2, "SHA512");
            map.put(2, 64);
        }

        public static String onWarmupCompleted(int i) {
            return onExtraCallback.IAuthTabCallback(i);
        }

        public static int onExtraCallbackWithResult(int i) {
            Integer num = onWarmupCompleted.get(Integer.valueOf(i));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onWarmupCompleted(this.serial);
        deactivateVar.onNavigationEvent(this.scheme);
        deactivateVar.onNavigationEvent(this.hashAlgorithm);
        deactivateVar.onNavigationEvent(this.digest);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.serial = getblob.asBinder();
        this.scheme = getblob.asInterface();
        this.hashAlgorithm = getblob.asInterface();
        byte[] bArrOnExtraCallback = getblob.onExtraCallback();
        this.digest = bArrOnExtraCallback;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.hashAlgorithm, bArrOnExtraCallback);
        if (strOnExtraCallbackWithResult != null) {
            throw new WireParseException(strOnExtraCallbackWithResult);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        String str = this.serial + " " + this.scheme + " " + this.hashAlgorithm + " ";
        if (lt17.IAuthTabCallback()) {
            return str + "(" + TRANS_V2_SendReceiverInfo.onExtraCallbackWithResult(this.digest, 48, "\t", true);
        }
        return str + TRANS_V2_SendReceiverInfo.onExtraCallback(this.digest);
    }

    private String onExtraCallbackWithResult(int i, byte[] bArr) {
        int iOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult(i);
        if (iOnExtraCallbackWithResult != -1 && iOnExtraCallbackWithResult != bArr.length) {
            return "Digest size for " + onWarmupCompleted.onWarmupCompleted(i) + " be exactly " + onWarmupCompleted.onExtraCallbackWithResult(i) + " bytes, got " + bArr.length;
        }
        if (bArr.length >= 12) {
            return null;
        }
        return "Digest size must be at least 12 bytes, got " + bArr.length;
    }
}
