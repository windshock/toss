package o;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onNestedScrollAccepted {
    private static SharedPreferences onNavigationEvent;
    private static final Set<String> onExtraCallbackWithResult = new CopyOnWriteArraySet();
    private static final Map<String, Long> onExtraCallback = new ConcurrentHashMap();

    private static void onWarmupCompleted() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            onNavigationEvent = sharedPreferences3;
            Set<String> set = onExtraCallbackWithResult;
            set.addAll(sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet()));
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(";", 2);
                onExtraCallback.put(strArrSplit[0], Long.valueOf(Long.parseLong(strArrSplit[1])));
            }
            onExtraCallbackWithResult();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
        }
    }

    public static void onNavigationEvent(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return;
        }
        try {
            onWarmupCompleted();
            IAuthTabCallback(new HashMap(onExtraCallbackWithResult(onNavigationEvent(map), map2)));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
        }
    }

    static void IAuthTabCallback(Map<String, String> map) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    requestDisallowInterceptTouchEvent.onWarmupCompleted(key, value, false);
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
        }
    }

    static Map<String, JSONObject> onNavigationEvent(Map<String, JSONObject> map) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                try {
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (onExtraCallback.containsKey(string)) {
                            map.remove(entry.getKey());
                        } else {
                            onExtraCallbackWithResult.add(string + ';' + jCurrentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            onNavigationEvent.edit().putStringSet("PURCHASE_DETAILS_SET", onExtraCallbackWithResult).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
            return null;
        }
    }

    private static void onExtraCallbackWithResult() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = onNavigationEvent.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                onNavigationEvent.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                return;
            }
            if (jCurrentTimeMillis - j > 604800) {
                for (Map.Entry entry : new HashMap(onExtraCallback).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (jCurrentTimeMillis - l.longValue() > 86400) {
                        onExtraCallbackWithResult.remove(str + ";" + l);
                        onExtraCallback.remove(str);
                    }
                }
                onNavigationEvent.edit().putStringSet("PURCHASE_DETAILS_SET", onExtraCallbackWithResult).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
        }
    }

    public static boolean onNavigationEvent() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return false;
        }
        try {
            onWarmupCompleted();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = onNavigationEvent.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && jCurrentTimeMillis - j < 86400) {
                return false;
            }
            onNavigationEvent.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
            return false;
        }
    }

    static Map<String, String> onExtraCallbackWithResult(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScrollAccepted.class)) {
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap map3 = new HashMap();
            for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
                JSONObject jSONObject = map2.get(entry.getKey());
                JSONObject value = entry.getValue();
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (jCurrentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            map3.put(value.toString(), jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return map3;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScrollAccepted.class);
            return null;
        }
    }
}
