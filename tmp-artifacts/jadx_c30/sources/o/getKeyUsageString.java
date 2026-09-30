package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getKeyUsageString extends Event<getKeyUsageString> {
    public getKeyUsageString(int i, int i2) {
        super(i, i2);
    }

    public String getEventName() {
        return "onInitialized";
    }

    public WritableMap getEventData() {
        return Arguments.createMap();
    }
}
