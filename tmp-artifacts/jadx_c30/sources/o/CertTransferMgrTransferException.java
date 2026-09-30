package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CertTransferMgrTransferException extends Event<CertTransferMgrTransferException> {
    private final double IAuthTabCallback;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onWarmupCompleted;

    public CertTransferMgrTransferException(int i, int i2, double d, double d2, double d3, double d4) {
        super(i, i2);
        this.onExtraCallback = d;
        this.onExtraCallbackWithResult = d2;
        this.IAuthTabCallback = d3;
        this.onWarmupCompleted = d4;
    }

    public String getEventName() {
        return "onMapClick";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", this.onExtraCallback);
        writableMapCreateMap.putDouble("y", this.onExtraCallbackWithResult);
        writableMapCreateMap.putDouble("latitude", this.IAuthTabCallback);
        writableMapCreateMap.putDouble("longitude", this.onWarmupCompleted);
        return writableMapCreateMap;
    }
}
