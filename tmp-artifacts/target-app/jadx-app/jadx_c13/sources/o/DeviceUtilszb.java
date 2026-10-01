package o;

import java.io.IOException;
import java.security.PublicKey;
import o.HookTool;
import okhttp3.internal.http2.Settings;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class DeviceUtilszb extends Record {
    protected int alg;
    protected int flags;
    protected int footprint;
    protected byte[] key;
    protected int proto;
    protected PublicKey publicKey;

    protected DeviceUtilszb() {
        this.footprint = -1;
        this.publicKey = null;
    }

    protected DeviceUtilszb(yzp2 yzp2Var, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(yzp2Var, i, i2, j);
        this.footprint = -1;
        this.publicKey = null;
        this.flags = Record.onNavigationEvent("flags", i3);
        this.proto = Record.onExtraCallback("proto", i4);
        this.alg = Record.onExtraCallback("alg", i5);
        this.key = bArr;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.flags = getblob.onExtraCallbackWithResult();
        this.proto = getblob.asInterface();
        this.alg = getblob.asInterface();
        if (getblob.IAuthTabCallbackDefault() > 0) {
            this.key = getblob.onExtraCallback();
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.flags);
        sb.append(" ");
        sb.append(this.proto);
        sb.append(" ");
        sb.append(this.alg);
        if (this.key != null) {
            if (lt17.IAuthTabCallback()) {
                sb.append(" (\n");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.key, 64, "\t", true));
                sb.append(" ; key_tag = ");
                sb.append(onExtraCallbackWithResult());
            } else {
                sb.append(" ");
                sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.key));
            }
        }
        return sb.toString();
    }

    public int onNavigationEvent() {
        return this.flags;
    }

    public int IAuthTabCallbackStub() {
        return this.proto;
    }

    public int onExtraCallback() {
        return this.alg;
    }

    public byte[] onWarmupCompleted() {
        return this.key;
    }

    public int onExtraCallbackWithResult() {
        int i;
        int i2;
        int i3 = this.footprint;
        if (i3 >= 0) {
            return i3;
        }
        deactivate deactivateVar = new deactivate();
        int i4 = 0;
        onExtraCallbackWithResult(deactivateVar, (ryzb) null, false);
        byte[] bArrIAuthTabCallback = deactivateVar.IAuthTabCallback();
        if (this.alg == 1) {
            byte b = bArrIAuthTabCallback[bArrIAuthTabCallback.length - 3];
            i2 = bArrIAuthTabCallback[bArrIAuthTabCallback.length - 2] & 255;
            i = (b & 255) << 8;
        } else {
            i = 0;
            while (i4 < bArrIAuthTabCallback.length - 1) {
                i += ((bArrIAuthTabCallback[i4] & 255) << 8) + (bArrIAuthTabCallback[i4 + 1] & 255);
                i4 += 2;
            }
            if (i4 < bArrIAuthTabCallback.length) {
                i += (bArrIAuthTabCallback[i4] & 255) << 8;
            }
            i2 = (i >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        int i5 = (i + i2) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.footprint = i5;
        return i5;
    }

    public PublicKey IAuthTabCallbackDefault() throws HookTool.onWarmupCompleted {
        PublicKey publicKey = this.publicKey;
        if (publicKey != null) {
            return publicKey;
        }
        PublicKey publicKeyOnExtraCallbackWithResult = HookTool.onExtraCallbackWithResult(this);
        this.publicKey = publicKeyOnExtraCallbackWithResult;
        return publicKeyOnExtraCallbackWithResult;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.flags);
        deactivateVar.onNavigationEvent(this.proto);
        deactivateVar.onNavigationEvent(this.alg);
        byte[] bArr = this.key;
        if (bArr != null) {
            deactivateVar.onNavigationEvent(bArr);
        }
    }
}
