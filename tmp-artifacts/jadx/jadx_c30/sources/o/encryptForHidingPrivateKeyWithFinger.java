package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class encryptForHidingPrivateKeyWithFinger extends Event<encryptForHidingPrivateKeyWithFinger> {
    private final double IAuthTabCallback;
    private final double onNavigationEvent;

    public encryptForHidingPrivateKeyWithFinger(int i, int i2, double d, double d2) {
        super(i, i2);
        this.IAuthTabCallback = d;
        this.onNavigationEvent = d2;
    }

    public String getEventName() {
        return "topVideoAspectRatio";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", this.IAuthTabCallback);
        writableMapCreateMap.putDouble("height", this.onNavigationEvent);
        return writableMapCreateMap;
    }
}
