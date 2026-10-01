package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class utilHexStringToBin extends Event<utilHexStringToBin> {
    private final int IAuthTabCallback;
    private final int onWarmupCompleted;

    public utilHexStringToBin(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.onWarmupCompleted = i3;
        this.IAuthTabCallback = i4;
    }

    public String getEventName() {
        return "onGraniteLoad";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("width", this.onWarmupCompleted);
        writableMapCreateMap.putInt("height", this.IAuthTabCallback);
        return writableMapCreateMap;
    }
}
