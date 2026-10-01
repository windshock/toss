package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CertTransferMgr extends Event<CertTransferMgr> {
    private final int onExtraCallback;
    private final int onNavigationEvent;

    public CertTransferMgr(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.onNavigationEvent = i3;
        this.onExtraCallback = i4;
    }

    public String getEventName() {
        return "onGraniteProgress";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("loaded", this.onNavigationEvent);
        writableMapCreateMap.putInt("total", this.onExtraCallback);
        return writableMapCreateMap;
    }
}
