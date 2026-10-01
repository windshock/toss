package o;

import j$.time.Instant;
import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt22 extends Record {
    protected int alg;
    protected int covered;
    protected Instant expire;
    protected int footprint;
    protected int labels;
    protected long origttl;
    protected byte[] signature;
    protected yzp2 signer;
    protected Instant timeSigned;

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.covered = getblob.onExtraCallbackWithResult();
        this.alg = getblob.asInterface();
        this.labels = getblob.asInterface();
        this.origttl = getblob.asBinder();
        this.expire = Instant.ofEpochSecond(getblob.asBinder());
        this.timeSigned = Instant.ofEpochSecond(getblob.asBinder());
        this.footprint = getblob.onExtraCallbackWithResult();
        this.signer = new yzp2(getblob);
        this.signature = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(lt54.onNavigationEvent(this.covered));
        sb.append(" ");
        sb.append(this.alg);
        sb.append(" ");
        sb.append(this.labels);
        sb.append(" ");
        sb.append(this.origttl);
        sb.append(" ");
        if (lt17.IAuthTabCallback()) {
            sb.append("(\n\t");
        }
        sb.append(moveToPosition.onWarmupCompleted(this.expire));
        sb.append(" ");
        sb.append(moveToPosition.onWarmupCompleted(this.timeSigned));
        sb.append(" ");
        sb.append(this.footprint);
        sb.append(" ");
        sb.append(this.signer);
        if (lt17.IAuthTabCallback()) {
            sb.append("\n");
            sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.signature, 64, "\t", true));
        } else {
            sb.append(" ");
            sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.signature));
        }
        return sb.toString();
    }

    public int access100() {
        return this.covered;
    }

    @Override // org.xbill.DNS.Record
    public int cB_() {
        return this.covered;
    }

    public int onExtraCallbackWithResult() {
        return this.alg;
    }

    public int IAuthTabCallbackDefault() {
        return this.labels;
    }

    public long onTransact() {
        return this.origttl;
    }

    public Instant onExtraCallback() {
        return this.expire;
    }

    public Instant IAuthTabCallbackStubProxy() {
        return this.timeSigned;
    }

    public int onNavigationEvent() {
        return this.footprint;
    }

    public yzp2 asBinder() {
        return this.signer;
    }

    public byte[] IAuthTabCallbackStub() {
        return this.signature;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.covered);
        deactivateVar.onNavigationEvent(this.alg);
        deactivateVar.onNavigationEvent(this.labels);
        deactivateVar.onWarmupCompleted(this.origttl);
        deactivateVar.onWarmupCompleted(this.expire.getEpochSecond());
        deactivateVar.onWarmupCompleted(this.timeSigned.getEpochSecond());
        deactivateVar.IAuthTabCallback(this.footprint);
        this.signer.onNavigationEvent(deactivateVar, (ryzb) null, z);
        deactivateVar.onNavigationEvent(this.signature);
    }
}
