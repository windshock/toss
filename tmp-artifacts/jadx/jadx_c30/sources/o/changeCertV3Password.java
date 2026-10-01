package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class changeCertV3Password extends Event<changeCertV3Password> {
    private final float IAuthTabCallback;

    public changeCertV3Password(int i, int i2, float f) {
        super(i, i2);
        this.IAuthTabCallback = f;
    }

    public String getEventName() {
        return "topVideoVolumeChange";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("volume", this.IAuthTabCallback);
        return writableMapCreateMap;
    }
}
