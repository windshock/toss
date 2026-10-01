package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class addVerficationCertV3 extends Event<addVerficationCertV3> {
    private final float onNavigationEvent;

    public addVerficationCertV3(int i, int i2, float f) {
        super(i, i2);
        this.onNavigationEvent = f;
    }

    public String getEventName() {
        return "topVideoPlaybackRateChange";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("playbackRate", this.onNavigationEvent);
        return writableMapCreateMap;
    }
}
