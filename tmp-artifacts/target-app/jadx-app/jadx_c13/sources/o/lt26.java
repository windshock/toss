package o;

import java.io.IOException;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt26 extends Record {
    private yzp2 admin;
    private long expire;
    private yzp2 host;
    private long minimum;
    private long refresh;
    private long retry;
    private long serial;

    public lt26() {
    }

    public lt26(yzp2 yzp2Var, int i, long j, yzp2 yzp2Var2, yzp2 yzp2Var3, long j2, long j3, long j4, long j5, long j6) {
        super(yzp2Var, 6, i, j);
        this.host = Record.IAuthTabCallback("host", yzp2Var2);
        this.admin = Record.IAuthTabCallback("admin", yzp2Var3);
        this.serial = Record.IAuthTabCallback("serial", j2);
        this.refresh = Record.IAuthTabCallback("refresh", j3);
        this.retry = Record.IAuthTabCallback("retry", j4);
        this.expire = Record.IAuthTabCallback("expire", j5);
        this.minimum = Record.IAuthTabCallback("minimum", j6);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.host = new yzp2(getblob);
        this.admin = new yzp2(getblob);
        this.serial = getblob.asBinder();
        this.refresh = getblob.asBinder();
        this.retry = getblob.asBinder();
        this.expire = getblob.asBinder();
        this.minimum = getblob.asBinder();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.host);
        sb.append(" ");
        sb.append(this.admin);
        if (lt17.IAuthTabCallback()) {
            sb.append(" (\n\t\t\t\t\t");
            sb.append(this.serial);
            sb.append("\t; serial\n\t\t\t\t\t");
            sb.append(this.refresh);
            sb.append("\t; refresh\n\t\t\t\t\t");
            sb.append(this.retry);
            sb.append("\t; retry\n\t\t\t\t\t");
            sb.append(this.expire);
            sb.append("\t; expire\n\t\t\t\t\t");
            sb.append(this.minimum);
            sb.append(" )\t; minimum");
        } else {
            sb.append(" ");
            sb.append(this.serial);
            sb.append(" ");
            sb.append(this.refresh);
            sb.append(" ");
            sb.append(this.retry);
            sb.append(" ");
            sb.append(this.expire);
            sb.append(" ");
            sb.append(this.minimum);
        }
        return sb.toString();
    }

    public long onExtraCallback() {
        return this.serial;
    }

    public long onExtraCallbackWithResult() {
        return this.minimum;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        this.host.onNavigationEvent(deactivateVar, ryzbVar, z);
        this.admin.onNavigationEvent(deactivateVar, ryzbVar, z);
        deactivateVar.onWarmupCompleted(this.serial);
        deactivateVar.onWarmupCompleted(this.refresh);
        deactivateVar.onWarmupCompleted(this.retry);
        deactivateVar.onWarmupCompleted(this.expire);
        deactivateVar.onWarmupCompleted(this.minimum);
    }
}
