package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class hideCert extends Event<hideCert> {
    public hideCert(int i, int i2) {
        super(i, i2);
    }

    public String getEventName() {
        return "topVideoFullscreenPlayerWillDismiss";
    }

    public WritableMap getEventData() {
        return Arguments.createMap();
    }
}
