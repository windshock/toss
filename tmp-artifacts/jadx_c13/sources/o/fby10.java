package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.isLast;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby10 extends Record {
    private List<isLast> options;

    public fby10() {
    }

    public fby10(int i, int i2, int i3, int i4, List<isLast> list) {
        this(i, i2, i3, i4);
        if (list != null) {
            this.options = new ArrayList(list);
        }
    }

    public fby10(int i, int i2, int i3, int i4) {
        super(yzp2.IAuthTabCallback, 41, i, 0L);
        Record.onNavigationEvent("payloadSize", i);
        Record.onExtraCallback("xrcode", i2);
        Record.onExtraCallback("version", i3);
        Record.onNavigationEvent("flags", i4);
        this.ttl = (i2 << 24) + (i3 << 16) + i4;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        if (getblob.IAuthTabCallbackDefault() > 0) {
            this.options = new ArrayList();
        }
        while (getblob.IAuthTabCallbackDefault() > 0) {
            this.options.add(isLast.onNavigationEvent(getblob));
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        List<isLast> list = this.options;
        if (list != null) {
            sb.append(list);
            sb.append(" ");
        }
        sb.append(" ; payload ");
        sb.append(IAuthTabCallbackStub());
        sb.append(", xrcode ");
        sb.append(onExtraCallbackWithResult());
        sb.append(", version ");
        sb.append(onTransact());
        sb.append(", flags ");
        sb.append(onNavigationEvent());
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public String toString() {
        return yzp2.IAuthTabCallback + "\t\t\t\t" + lt54.onNavigationEvent(this.type) + "\t" + IAuthTabCallback();
    }

    void onExtraCallbackWithResult(StringBuilder sb) {
        sb.append(";; OPT PSEUDOSECTION: \n; EDNS: version: ");
        sb.append(onTransact());
        sb.append("; flags: ");
        for (int i = 0; i < 16; i++) {
            if ((onNavigationEvent() & (1 << (15 - i))) != 0) {
                sb.append(isAfterLast.IAuthTabCallback(i));
                sb.append(" ");
            }
        }
        sb.append("; udp: ");
        sb.append(IAuthTabCallbackStub());
        List<isLast> list = this.options;
        if (list != null) {
            for (isLast islast : list) {
                sb.append("\n; ");
                sb.append(isLast.onExtraCallbackWithResult.onWarmupCompleted(islast.onExtraCallbackWithResult()));
                sb.append(": ");
                sb.append(islast.onWarmupCompleted());
            }
        }
    }

    public int IAuthTabCallbackStub() {
        return this.dclass;
    }

    public int onExtraCallbackWithResult() {
        return (int) (this.ttl >>> 24);
    }

    public int onTransact() {
        return (int) ((this.ttl >>> 16) & 255);
    }

    public int onNavigationEvent() {
        return (int) (this.ttl & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        List<isLast> list = this.options;
        if (list != null) {
            Iterator<isLast> it = list.iterator();
            while (it.hasNext()) {
                it.next().onExtraCallback(deactivateVar);
            }
        }
    }

    public List<isLast> onExtraCallback() {
        List<isLast> list = this.options;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public List<isLast> onNavigationEvent(int i) {
        if (this.options == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (isLast islast : this.options) {
            if (islast.onExtraCallbackWithResult() == i) {
                arrayList.add(islast);
            }
        }
        return arrayList;
    }

    @Override // org.xbill.DNS.Record
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ttl == ((fby10) obj).ttl;
    }

    @Override // org.xbill.DNS.Record
    public int hashCode() {
        int i = 0;
        for (byte b : ICustomTabsCallback()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }
}
