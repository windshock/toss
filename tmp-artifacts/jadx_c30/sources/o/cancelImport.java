package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class cancelImport extends Event<cancelImport> {
    private final boolean onExtraCallback;

    public cancelImport(int i, int i2, boolean z) {
        super(i, i2);
        this.onExtraCallback = z;
    }

    public String getEventName() {
        return "onAnimationFinish";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isCancelled", this.onExtraCallback);
        return writableMapCreateMap;
    }
}
