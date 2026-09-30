package o;

import java.io.IOException;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class moveToPrevious extends Record {
    private byte[] altitude;
    private byte[] latitude;
    private byte[] longitude;

    private void onWarmupCompleted(double d, double d2) throws IllegalArgumentException {
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("illegal longitude " + d);
        }
        if (d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("illegal latitude " + d2);
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.longitude = getblob.IAuthTabCallback();
        this.latitude = getblob.IAuthTabCallback();
        this.altitude = getblob.IAuthTabCallback();
        try {
            onWarmupCompleted(onWarmupCompleted(), onNavigationEvent());
        } catch (IllegalArgumentException e) {
            throw new WireParseException(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        return Record.onExtraCallbackWithResult(this.longitude, true) + " " + Record.onExtraCallbackWithResult(this.latitude, true) + " " + Record.onExtraCallbackWithResult(this.altitude, true);
    }

    public String onExtraCallbackWithResult() {
        return Record.onExtraCallbackWithResult(this.longitude, false);
    }

    public double onWarmupCompleted() {
        return Double.parseDouble(onExtraCallbackWithResult());
    }

    public String onExtraCallback() {
        return Record.onExtraCallbackWithResult(this.latitude, false);
    }

    public double onNavigationEvent() {
        return Double.parseDouble(onExtraCallback());
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.onExtraCallback(this.longitude);
        deactivateVar.onExtraCallback(this.latitude);
        deactivateVar.onExtraCallback(this.altitude);
    }
}
