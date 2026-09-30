package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class exportAppCert extends Event<exportAppCert> {
    private final boolean IAuthTabCallback;
    private final boolean onExtraCallback;
    private final boolean onNavigationEvent;

    public exportAppCert(int i, int i2, boolean z, boolean z2, boolean z3) {
        super(i, i2);
        this.onExtraCallback = z;
        this.IAuthTabCallback = z2;
        this.onNavigationEvent = z3;
    }

    public String getEventName() {
        return "topVideoPlaybackStateChanged";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isPlaying", this.onExtraCallback);
        writableMapCreateMap.putBoolean("isSeeking", this.IAuthTabCallback);
        writableMapCreateMap.putBoolean("isLooping", this.onNavigationEvent);
        return writableMapCreateMap;
    }
}
