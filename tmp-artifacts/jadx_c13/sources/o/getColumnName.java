package o;

import java.io.IOException;
import o.HookTool;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getColumnName extends Record {
    private int alg;
    private byte[] digest;
    private int digestid;
    private int footprint;

    public getColumnName() {
    }

    protected getColumnName(yzp2 yzp2Var, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(yzp2Var, i, i2, j);
        int iOnExtraCallback = HookTool.IAuthTabCallback.onExtraCallback(i5);
        if (iOnExtraCallback >= 0 && iOnExtraCallback != bArr.length) {
            throw new IllegalArgumentException("Expected " + iOnExtraCallback + " bytes for " + HookTool.IAuthTabCallback.onNavigationEvent(i5) + ", got " + bArr.length);
        }
        this.footprint = Record.onNavigationEvent("footprint", i3);
        this.alg = Record.onExtraCallback("alg", i4);
        this.digestid = Record.onExtraCallback("digestid", i5);
        this.digest = bArr;
    }

    public getColumnName(yzp2 yzp2Var, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        this(yzp2Var, 43, i, j, i2, i3, i4, bArr);
    }

    public getColumnName(yzp2 yzp2Var, int i, long j, int i2, copyStringToBuffer copystringtobuffer) {
        this(yzp2Var, i, j, copystringtobuffer.onExtraCallbackWithResult(), copystringtobuffer.onExtraCallback(), i2, HookTool.IAuthTabCallback(copystringtobuffer, i2));
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.footprint = getblob.onExtraCallbackWithResult();
        this.alg = getblob.asInterface();
        this.digestid = getblob.asInterface();
        this.digest = getblob.onExtraCallback();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.footprint);
        sb.append(" ");
        sb.append(this.alg);
        sb.append(" ");
        sb.append(this.digestid);
        if (this.digest != null) {
            sb.append(" ");
            sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback(this.digest));
        }
        return sb.toString();
    }

    public int onExtraCallbackWithResult() {
        return this.alg;
    }

    public int onExtraCallback() {
        return this.digestid;
    }

    public byte[] onNavigationEvent() {
        return this.digest;
    }

    public int onWarmupCompleted() {
        return this.footprint;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.footprint);
        deactivateVar.onNavigationEvent(this.alg);
        deactivateVar.onNavigationEvent(this.digestid);
        byte[] bArr = this.digest;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr);
        }
    }
}
