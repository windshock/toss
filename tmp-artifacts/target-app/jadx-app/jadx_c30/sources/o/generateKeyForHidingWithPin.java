package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class generateKeyForHidingWithPin extends Event<generateKeyForHidingWithPin> {
    private final boolean onExtraCallbackWithResult;

    public generateKeyForHidingWithPin(int i, int i2, boolean z) {
        super(i, i2);
        this.onExtraCallbackWithResult = z;
    }

    public String getEventName() {
        return "topVideoBuffer";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isBuffering", this.onExtraCallbackWithResult);
        return writableMapCreateMap;
    }
}
