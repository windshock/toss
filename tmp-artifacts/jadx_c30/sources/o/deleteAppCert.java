package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class deleteAppCert extends Event<deleteAppCert> {
    private final double onExtraCallbackWithResult;
    private final double onWarmupCompleted;

    public deleteAppCert(int i, int i2, double d, double d2) {
        super(i, i2);
        this.onExtraCallbackWithResult = d;
        this.onWarmupCompleted = d2;
    }

    public String getEventName() {
        return "topVideoSeek";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("currentTime", this.onExtraCallbackWithResult);
        writableMapCreateMap.putDouble("seekTime", this.onWarmupCompleted);
        return writableMapCreateMap;
    }
}
