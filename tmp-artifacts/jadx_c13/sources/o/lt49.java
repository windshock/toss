package o;

import j$.time.Duration;
import java.io.IOException;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt49 extends isLast {
    private static final Duration onNavigationEvent = Duration.ofMillis(6553600);
    private Integer timeout;

    public lt49() {
        super(11);
        this.timeout = null;
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) throws IOException {
        int iIAuthTabCallbackDefault = getblob.IAuthTabCallbackDefault();
        if (iIAuthTabCallbackDefault == 0) {
            this.timeout = null;
            return;
        }
        if (iIAuthTabCallbackDefault == 2) {
            this.timeout = Integer.valueOf(getblob.onExtraCallbackWithResult());
            return;
        }
        throw new WireParseException("invalid length (" + iIAuthTabCallbackDefault + ") of the data in the edns_tcp_keepalive option");
    }

    @Override // o.isLast
    void onNavigationEvent(deactivate deactivateVar) {
        Integer num = this.timeout;
        if (num != null) {
            deactivateVar.IAuthTabCallback(num.intValue());
        }
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        Integer num = this.timeout;
        return num != null ? String.valueOf(num) : "-";
    }
}
