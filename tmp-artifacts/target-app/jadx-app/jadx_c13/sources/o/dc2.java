package o;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import okhttp3.internal.ws.RealWebSocket;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dc2 extends Record {
    private static final NumberFormat onExtraCallbackWithResult;
    private static final NumberFormat onWarmupCompleted;
    private long altitude;
    private long hPrecision;
    private long latitude;
    private long longitude;
    private long size;
    private long vPrecision;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        onExtraCallbackWithResult = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        onWarmupCompleted = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        if (getblob.asInterface() != 0) {
            throw new WireParseException("Invalid LOC version");
        }
        this.size = onExtraCallback(getblob.asInterface());
        this.hPrecision = onExtraCallback(getblob.asInterface());
        this.vPrecision = onExtraCallback(getblob.asInterface());
        this.latitude = getblob.asBinder();
        this.longitude = getblob.asBinder();
        this.altitude = getblob.asBinder();
    }

    private void onExtraCallbackWithResult(StringBuilder sb, NumberFormat numberFormat, long j, long j2) {
        sb.append(j / j2);
        long j3 = j % j2;
        if (j3 != 0) {
            sb.append(".");
            sb.append(numberFormat.format(j3));
        }
    }

    private String onExtraCallbackWithResult(long j, char c, char c2) {
        StringBuilder sb = new StringBuilder();
        long j2 = j - 2147483648L;
        if (j2 < 0) {
            j2 = -j2;
            c = c2;
        }
        sb.append(j2 / 3600000);
        long j3 = j2 % 3600000;
        sb.append(" ");
        sb.append(j3 / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        sb.append(" ");
        onExtraCallbackWithResult(sb, onWarmupCompleted, j3 % RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, 1000L);
        sb.append(" ");
        sb.append(c);
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(onExtraCallbackWithResult(this.latitude, 'N', 'S'));
        sb.append(" ");
        sb.append(onExtraCallbackWithResult(this.longitude, 'E', 'W'));
        sb.append(" ");
        NumberFormat numberFormat = onExtraCallbackWithResult;
        onExtraCallbackWithResult(sb, numberFormat, this.altitude - 10000000, 100L);
        sb.append("m ");
        onExtraCallbackWithResult(sb, numberFormat, this.size, 100L);
        sb.append("m ");
        onExtraCallbackWithResult(sb, numberFormat, this.hPrecision, 100L);
        sb.append("m ");
        onExtraCallbackWithResult(sb, numberFormat, this.vPrecision, 100L);
        sb.append("m");
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onNavigationEvent(0);
        deactivateVar.onNavigationEvent(IAuthTabCallback(this.size));
        deactivateVar.onNavigationEvent(IAuthTabCallback(this.hPrecision));
        deactivateVar.onNavigationEvent(IAuthTabCallback(this.vPrecision));
        deactivateVar.onWarmupCompleted(this.latitude);
        deactivateVar.onWarmupCompleted(this.longitude);
        deactivateVar.onWarmupCompleted(this.altitude);
    }

    private static long onExtraCallback(int i) throws WireParseException {
        long j = i >> 4;
        int i2 = i & 15;
        if (j > 9 || i2 > 9) {
            throw new WireParseException("Invalid LOC Encoding");
        }
        while (i2 > 0) {
            j *= 10;
            i2--;
        }
        return j;
    }

    private int IAuthTabCallback(long j) {
        byte b = 0;
        while (j > 9) {
            b = (byte) (b + 1);
            j /= 10;
        }
        return (int) ((j << 4) + (b & 255));
    }
}
