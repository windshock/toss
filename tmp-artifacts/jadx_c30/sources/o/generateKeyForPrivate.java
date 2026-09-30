package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class generateKeyForPrivate extends Event<generateKeyForPrivate> {
    private final int IAuthTabCallback;
    private final double onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public generateKeyForPrivate(int i, int i2, double d, int i3, int i4) {
        super(i, i2);
        this.onExtraCallbackWithResult = d;
        this.IAuthTabCallback = i3;
        this.onWarmupCompleted = i4;
    }

    public String getEventName() {
        return "topVideoBandwidthUpdate";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("bitrate", this.onExtraCallbackWithResult);
        writableMapCreateMap.putInt("width", this.IAuthTabCallback);
        writableMapCreateMap.putInt("height", this.onWarmupCompleted);
        return writableMapCreateMap;
    }
}
