package o;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class isLast implements Serializable {
    private final int code;

    abstract void onNavigationEvent(deactivate deactivateVar);

    abstract String onWarmupCompleted();

    abstract void onWarmupCompleted(getBlob getblob) throws IOException;

    public static class onExtraCallbackWithResult {
        private static final sz1 IAuthTabCallback;

        static {
            sz1 sz1Var = new sz1("EDNS Option Codes", 1);
            IAuthTabCallback = sz1Var;
            sz1Var.onNavigationEvent(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            sz1Var.onWarmupCompleted("CODE");
            sz1Var.onWarmupCompleted(true);
            sz1Var.IAuthTabCallback(1, "LLQ");
            sz1Var.IAuthTabCallback(2, "UL");
            sz1Var.IAuthTabCallback(3, "NSID");
            sz1Var.IAuthTabCallback(5, "DAU");
            sz1Var.IAuthTabCallback(6, "DHU");
            sz1Var.IAuthTabCallback(7, "N3U");
            sz1Var.IAuthTabCallback(8, "edns-client-subnet");
            sz1Var.IAuthTabCallback(9, "EDNS_EXPIRE");
            sz1Var.IAuthTabCallback(10, "COOKIE");
            sz1Var.IAuthTabCallback(11, "edns-tcp-keepalive");
            sz1Var.IAuthTabCallback(12, "Padding");
            sz1Var.IAuthTabCallback(13, "CHAIN");
            sz1Var.IAuthTabCallback(14, "edns-key-tag");
            sz1Var.IAuthTabCallback(15, "Extended_DNS_Error");
            sz1Var.IAuthTabCallback(16, "EDNS-Client-Tag");
            sz1Var.IAuthTabCallback(17, "EDNS-Server-Tag");
            sz1Var.IAuthTabCallback(18, "Report-Channel");
            sz1Var.IAuthTabCallback(19, "ZONEVERSION");
        }

        public static String onWarmupCompleted(int i) {
            return IAuthTabCallback.IAuthTabCallback(i);
        }
    }

    public isLast(int i) {
        this.code = Record.onNavigationEvent("code", i);
    }

    public String toString() {
        return "{" + onExtraCallbackWithResult.onWarmupCompleted(this.code) + ": " + onWarmupCompleted() + "}";
    }

    public int onExtraCallbackWithResult() {
        return this.code;
    }

    byte[] IAuthTabCallback() {
        deactivate deactivateVar = new deactivate();
        onNavigationEvent(deactivateVar);
        return deactivateVar.IAuthTabCallback();
    }

    static isLast onNavigationEvent(getBlob getblob) throws IOException {
        isLast ycxycx1Var;
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = getblob.onExtraCallbackWithResult();
        if (getblob.IAuthTabCallbackDefault() < iOnExtraCallbackWithResult2) {
            throw new WireParseException("truncated option");
        }
        int iIAuthTabCallback_Parcel = getblob.IAuthTabCallback_Parcel();
        getblob.onNavigationEvent(iOnExtraCallbackWithResult2);
        if (iOnExtraCallbackWithResult == 3) {
            ycxycx1Var = new ycxycx1();
        } else if (iOnExtraCallbackWithResult == 15) {
            ycxycx1Var = new isBeforeFirst();
        } else if (iOnExtraCallbackWithResult == 5 || iOnExtraCallbackWithResult == 6 || iOnExtraCallbackWithResult == 7) {
            ycxycx1Var = new getColumnCount(iOnExtraCallbackWithResult, new int[0]);
        } else if (iOnExtraCallbackWithResult == 8) {
            ycxycx1Var = new tn2();
        } else if (iOnExtraCallbackWithResult == 10) {
            ycxycx1Var = new afterTextChanged();
        } else if (iOnExtraCallbackWithResult == 11) {
            ycxycx1Var = new lt49();
        } else {
            ycxycx1Var = new registerContentObserver(iOnExtraCallbackWithResult);
        }
        ycxycx1Var.onWarmupCompleted(getblob);
        getblob.onWarmupCompleted(iIAuthTabCallback_Parcel);
        return ycxycx1Var;
    }

    void onExtraCallback(deactivate deactivateVar) {
        deactivateVar.IAuthTabCallback(this.code);
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        deactivateVar.IAuthTabCallback(0);
        onNavigationEvent(deactivateVar);
        deactivateVar.onExtraCallbackWithResult((deactivateVar.onNavigationEvent() - iOnNavigationEvent) - 2, iOnNavigationEvent);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof isLast)) {
            return false;
        }
        isLast islast = (isLast) obj;
        if (this.code != islast.code) {
            return false;
        }
        return Arrays.equals(IAuthTabCallback(), islast.IAuthTabCallback());
    }

    public int hashCode() {
        int i = 0;
        for (byte b : IAuthTabCallback()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }
}
