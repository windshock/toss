package o;

import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt46 extends Record {
    private yzp2 alg;
    private int error;
    private Duration fudge;
    private int originalID;
    private byte[] other;
    private byte[] signature;
    private Instant timeSigned;

    public lt46() {
    }

    public lt46(yzp2 yzp2Var, int i, long j, yzp2 yzp2Var2, Instant instant, Duration duration, byte[] bArr, int i2, int i3, byte[] bArr2) {
        super(yzp2Var, 250, i, j);
        this.alg = Record.IAuthTabCallback("alg", yzp2Var2);
        this.timeSigned = instant;
        Record.onNavigationEvent("fudge", (int) duration.getSeconds());
        this.fudge = duration;
        this.signature = bArr;
        this.originalID = Record.onNavigationEvent("originalID", i2);
        this.error = Record.onNavigationEvent("error", i3);
        this.other = bArr2;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.alg = new yzp2(getblob);
        this.timeSigned = Instant.ofEpochSecond((getblob.onExtraCallbackWithResult() << 32) + getblob.asBinder());
        this.fudge = Duration.ofSeconds(getblob.onExtraCallbackWithResult());
        this.signature = getblob.IAuthTabCallback(getblob.onExtraCallbackWithResult());
        this.originalID = getblob.onExtraCallbackWithResult();
        this.error = getblob.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult > 0) {
            this.other = getblob.IAuthTabCallback(iOnExtraCallbackWithResult);
        } else {
            this.other = null;
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.alg);
        sb.append(" ");
        if (lt17.IAuthTabCallback()) {
            sb.append("(\n\t");
        }
        sb.append(this.timeSigned.getEpochSecond());
        sb.append(" ");
        sb.append((int) this.fudge.getSeconds());
        sb.append(" ");
        sb.append(this.signature.length);
        if (lt17.IAuthTabCallback()) {
            sb.append("\n");
            sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.signature, 64, "\t", false));
        } else {
            sb.append(" ");
            sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.signature));
        }
        sb.append(" ");
        sb.append(Rcode.onNavigationEvent(this.error));
        sb.append(" ");
        byte[] bArr = this.other;
        if (bArr == null) {
            sb.append(0);
        } else {
            sb.append(bArr.length);
            if (lt17.IAuthTabCallback()) {
                sb.append("\n\n\n\t");
            } else {
                sb.append(" ");
            }
            if (this.error == 18) {
                byte[] bArr2 = this.other;
                if (bArr2.length != 6) {
                    sb.append("<invalid BADTIME other data>");
                } else {
                    long j = bArr2[0] & 255;
                    long j2 = bArr2[1] & 255;
                    long j3 = bArr2[2] & 255;
                    long j4 = (bArr2[3] & 255) << 16;
                    long j5 = (bArr2[4] & 255) << 8;
                    long j6 = bArr2[5] & 255;
                    sb.append("<server time: ");
                    sb.append(Instant.ofEpochSecond((j << 40) + (j2 << 32) + (j3 << 24) + j4 + j5 + j6));
                    sb.append(">");
                }
            } else {
                sb.append("<");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.other));
                sb.append(">");
            }
        }
        if (lt17.IAuthTabCallback()) {
            sb.append(" )");
        }
        return sb.toString();
    }

    public yzp2 onExtraCallbackWithResult() {
        return this.alg;
    }

    public Instant IAuthTabCallbackDefault() {
        return this.timeSigned;
    }

    public Duration onNavigationEvent() {
        return this.fudge;
    }

    public byte[] onTransact() {
        return this.signature;
    }

    public int onExtraCallback() {
        return this.error;
    }

    public byte[] asBinder() {
        return this.other;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.alg.onNavigationEvent(deactivateVar, (ryzb) null, z);
        long epochSecond = this.timeSigned.getEpochSecond();
        deactivateVar.IAuthTabCallback((int) (epochSecond >> 32));
        deactivateVar.onWarmupCompleted(epochSecond & 4294967295L);
        deactivateVar.IAuthTabCallback((int) this.fudge.getSeconds());
        deactivateVar.IAuthTabCallback(this.signature.length);
        deactivateVar.onNavigationEvent(this.signature);
        deactivateVar.IAuthTabCallback(this.originalID);
        deactivateVar.IAuthTabCallback(this.error);
        byte[] bArr = this.other;
        if (bArr != null) {
            deactivateVar.IAuthTabCallback(bArr.length);
            deactivateVar.onNavigationEvent(this.other);
        } else {
            deactivateVar.IAuthTabCallback(0);
        }
    }
}
