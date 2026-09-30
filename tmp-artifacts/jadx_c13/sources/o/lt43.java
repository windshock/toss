package o;

import j$.time.Instant;
import java.io.IOException;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt43 extends Record {
    private yzp2 alg;
    private int error;
    private byte[] key;
    private int mode;
    private byte[] other;
    private Instant timeExpire;
    private Instant timeInception;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.alg = new yzp2(getblob);
        this.timeInception = Instant.ofEpochSecond(getblob.asBinder());
        this.timeExpire = Instant.ofEpochSecond(getblob.asBinder());
        this.mode = getblob.onExtraCallbackWithResult();
        this.error = getblob.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult > 0) {
            this.key = getblob.IAuthTabCallback(iOnExtraCallbackWithResult);
        } else {
            this.key = null;
        }
        int iOnExtraCallbackWithResult2 = getblob.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult2 > 0) {
            this.other = getblob.IAuthTabCallback(iOnExtraCallbackWithResult2);
        } else {
            this.other = null;
        }
    }

    protected String onNavigationEvent() {
        int i = this.mode;
        if (i == 1) {
            return "SERVERASSIGNED";
        }
        if (i == 2) {
            return "DIFFIEHELLMAN";
        }
        if (i == 3) {
            return "GSSAPI";
        }
        if (i == 4) {
            return "RESOLVERASSIGNED";
        }
        if (i == 5) {
            return "DELETE";
        }
        return Integer.toString(i);
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.alg);
        sb.append(" ");
        if (lt17.IAuthTabCallback()) {
            sb.append("(\n\t");
        }
        sb.append(moveToPosition.onWarmupCompleted(this.timeInception));
        sb.append(" ");
        sb.append(moveToPosition.onWarmupCompleted(this.timeExpire));
        sb.append(" ");
        sb.append(onNavigationEvent());
        sb.append(" ");
        sb.append(Rcode.onNavigationEvent(this.error));
        if (lt17.IAuthTabCallback()) {
            sb.append("\n");
            byte[] bArr = this.key;
            if (bArr != null) {
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(bArr, 64, "\t", false));
                sb.append("\n");
            }
            byte[] bArr2 = this.other;
            if (bArr2 != null) {
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(bArr2, 64, "\t", false));
            }
            sb.append(" )");
        } else {
            sb.append(" ");
            byte[] bArr3 = this.key;
            if (bArr3 != null) {
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(bArr3));
                sb.append(" ");
            }
            byte[] bArr4 = this.other;
            if (bArr4 != null) {
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(bArr4));
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.alg.onNavigationEvent(deactivateVar, (ryzb) null, z);
        deactivateVar.onWarmupCompleted(this.timeInception.getEpochSecond());
        deactivateVar.onWarmupCompleted(this.timeExpire.getEpochSecond());
        deactivateVar.IAuthTabCallback(this.mode);
        deactivateVar.IAuthTabCallback(this.error);
        byte[] bArr = this.key;
        if (bArr != null) {
            deactivateVar.IAuthTabCallback(bArr.length);
            deactivateVar.onNavigationEvent(this.key);
        } else {
            deactivateVar.IAuthTabCallback(0);
        }
        byte[] bArr2 = this.other;
        if (bArr2 != null) {
            deactivateVar.IAuthTabCallback(bArr2.length);
            deactivateVar.onNavigationEvent(this.other);
        } else {
            deactivateVar.IAuthTabCallback(0);
        }
    }
}
