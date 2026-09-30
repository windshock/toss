package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class generateKeyForRecovery extends Event<generateKeyForRecovery> {
    private final boolean IAuthTabCallback;

    public generateKeyForRecovery(int i, int i2, boolean z) {
        super(i, i2);
        this.IAuthTabCallback = z;
    }

    public String getEventName() {
        return "topVideoControlsVisibilityChange";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isVisible", this.IAuthTabCallback);
        return writableMapCreateMap;
    }
}
