package o;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sz3 extends Record {
    private static final TRANS_VeriSign_SignedData onExtraCallbackWithResult = new TRANS_VeriSign_SignedData("0123456789ABCDEFGHIJKLMNOPQRSTUV=", false, false);
    private int flags;
    private int hashAlg;
    private int iterations;
    private byte[] next;
    private byte[] salt;
    private lt53 types;

    public static class onExtraCallbackWithResult {
        private static final sz1 onExtraCallback;

        static {
            sz1 sz1Var = new sz1("DNSSEC NSEC3 Hash Algorithms", 1);
            onExtraCallback = sz1Var;
            sz1Var.IAuthTabCallback(1, "SHA-1");
        }

        public static String IAuthTabCallback(int i) {
            return onExtraCallback.IAuthTabCallback(i);
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.hashAlg = getblob.asInterface();
        this.flags = getblob.asInterface();
        this.iterations = getblob.onExtraCallbackWithResult();
        int iAsInterface = getblob.asInterface();
        if (iAsInterface > 0) {
            this.salt = getblob.IAuthTabCallback(iAsInterface);
        } else {
            this.salt = null;
        }
        this.next = getblob.IAuthTabCallback(getblob.asInterface());
        this.types = new lt53(getblob);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(this.hashAlg);
        deactivateVar.onNavigationEvent(this.flags);
        deactivateVar.IAuthTabCallback(this.iterations);
        byte[] bArr = this.salt;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr.length);
            deactivateVar.onNavigationEvent(this.salt);
        } else {
            deactivateVar.onNavigationEvent(0);
        }
        deactivateVar.onNavigationEvent(this.next.length);
        deactivateVar.onNavigationEvent(this.next);
        this.types.onExtraCallback(deactivateVar);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hashAlg);
        sb.append(' ');
        sb.append(this.flags);
        sb.append(' ');
        sb.append(this.iterations);
        sb.append(' ');
        byte[] bArr = this.salt;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback(bArr));
        }
        sb.append(' ');
        sb.append(onExtraCallbackWithResult.onWarmupCompleted(this.next));
        if (!this.types.IAuthTabCallback()) {
            sb.append(' ');
            sb.append(this.types.toString());
        }
        return sb.toString();
    }

    public int onExtraCallbackWithResult() {
        return this.hashAlg;
    }

    public int onNavigationEvent() {
        return this.flags;
    }

    public int onExtraCallback() {
        return this.iterations;
    }

    public byte[] onTransact() {
        return this.salt;
    }

    public byte[] asInterface() {
        return this.next;
    }

    public boolean onExtraCallback(int i) {
        return this.types.IAuthTabCallback(i);
    }

    static byte[] onExtraCallbackWithResult(yzp2 yzp2Var, int i, int i2, byte[] bArr) throws NoSuchAlgorithmException {
        if (i == 1) {
            MessageDigest messageDigest = MessageDigest.getInstance("sha-1");
            byte[] bArrDigest = null;
            for (int i3 = 0; i3 <= i2; i3++) {
                messageDigest.reset();
                if (i3 == 0) {
                    messageDigest.update(yzp2Var.onExtraCallback());
                } else {
                    messageDigest.update(bArrDigest);
                }
                if (bArr != null) {
                    messageDigest.update(bArr);
                }
                bArrDigest = messageDigest.digest();
            }
            return bArrDigest;
        }
        throw new NoSuchAlgorithmException("Unknown NSEC3 algorithm identifier: " + i);
    }

    public byte[] IAuthTabCallback(yzp2 yzp2Var) throws NoSuchAlgorithmException {
        return onExtraCallbackWithResult(yzp2Var, this.hashAlg, this.iterations, this.salt);
    }
}
