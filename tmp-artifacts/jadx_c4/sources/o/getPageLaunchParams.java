package o;

import kotlinx.serialization.json.JsonObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPageLaunchParams implements StartClientBundle1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final JsonObject onWarmupCompleted = new PangleEncryptManager().onExtraCallbackWithResult();

    @Override // o.StartClientBundle1
    public JsonObject onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.onWarmupCompleted;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
