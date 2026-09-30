package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class extractNPKIPWFromFinger extends Event<extractNPKIPWFromFinger> {
    private final boolean onWarmupCompleted;

    public extractNPKIPWFromFinger(int i, int i2, boolean z) {
        super(i, i2);
        this.onWarmupCompleted = z;
    }

    public String getEventName() {
        return "topVideoAudioFocusChanged";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("hasAudioFocus", this.onWarmupCompleted);
        return writableMapCreateMap;
    }
}
