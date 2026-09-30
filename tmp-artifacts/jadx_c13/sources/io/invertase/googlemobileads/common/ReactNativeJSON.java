package io.invertase.googlemobileads.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import o.BugsnagExitInfoPluginconfigureEventSynthesizer2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReactNativeJSON {
    private static ReactNativeJSON onWarmupCompleted = new ReactNativeJSON();
    private JSONObject onNavigationEvent;

    private ReactNativeJSON() {
        try {
            this.onNavigationEvent = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static ReactNativeJSON onWarmupCompleted() {
        return onWarmupCompleted;
    }

    public int IAuthTabCallback(String str, int i) {
        JSONObject jSONObject = this.onNavigationEvent;
        return jSONObject == null ? i : jSONObject.optInt(str, i);
    }

    public WritableMap IAuthTabCallback() throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.onNavigationEvent.names();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            try {
                String string = jSONArrayNames.getString(i);
                BugsnagExitInfoPluginconfigureEventSynthesizer2.onNavigationEvent(string, this.onNavigationEvent.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }
}
