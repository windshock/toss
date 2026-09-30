package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isPointInChildBounds {
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final List<offsetChildToAnchor> IAuthTabCallbackStub;
    private final onExtraCallback asBinder;
    private final List<getStatusBarBackground> asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final IAuthTabCallback onWarmupCompleted;

    public enum IAuthTabCallback {
        MANUAL,
        INFERENCE
    }

    public enum onExtraCallback {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public isPointInChildBounds(String str, IAuthTabCallback iAuthTabCallback, onExtraCallback onextracallback, String str2, List<offsetChildToAnchor> list, List<getStatusBarBackground> list2, String str3, String str4, String str5) {
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = iAuthTabCallback;
        this.asBinder = onextracallback;
        this.onNavigationEvent = str2;
        this.IAuthTabCallbackStub = list;
        this.asInterface = list2;
        this.onExtraCallback = str3;
        this.IAuthTabCallbackDefault = str4;
        this.onExtraCallbackWithResult = str5;
    }

    public static List<isPointInChildBounds> onNavigationEvent(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(onWarmupCompleted(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }

    public static isPointInChildBounds onWarmupCompleted(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        IAuthTabCallback iAuthTabCallbackValueOf = IAuthTabCallback.valueOf(string2.toUpperCase(locale));
        onExtraCallback onextracallbackValueOf = onExtraCallback.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new offsetChildToAnchor(jSONArray.getJSONObject(i2)));
        }
        String strOptString = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                arrayList2.add(new getStatusBarBackground(jSONArrayOptJSONArray.getJSONObject(i3)));
            }
        }
        return new isPointInChildBounds(string, iAuthTabCallbackValueOf, onextracallbackValueOf, string3, arrayList, arrayList2, jSONObject.optString("component_id"), strOptString, jSONObject.optString("activity_name"));
    }

    public List<offsetChildToAnchor> onExtraCallbackWithResult() {
        return Collections.unmodifiableList(this.IAuthTabCallbackStub);
    }

    public List<getStatusBarBackground> onWarmupCompleted() {
        return Collections.unmodifiableList(this.asInterface);
    }

    public String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }
}
