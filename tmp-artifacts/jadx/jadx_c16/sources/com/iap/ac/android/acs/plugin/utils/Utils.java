package com.iap.ac.android.acs.plugin.utils;

import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class Utils {
    private static final String TAG = "IAPConnectPlugin";

    private Utils() {
    }

    public static Map<String, String> json2StringMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            ACLog.e(TAG, "Utils#json2StringMap, json is null");
            return new HashMap();
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        ACLog.d(TAG, "Utils#json2StringMap, result: " + map);
        return map;
    }

    public static List<String> jsonArray2StringList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            ACLog.e(TAG, "Utils#jsonArray2StringList, json array is empty");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        ACLog.d(TAG, "Utils#jsonArray2StringList, result:" + arrayList);
        return arrayList;
    }

    public static JSONArray stringList2JsonArray(List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e(TAG, "Utils#stringList2JsonArray, string list is empty");
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        ACLog.d(TAG, "Utils#stringList2JsonArray, result: " + jSONArray);
        return jSONArray;
    }

    public static JSONObject stringMap2Json(Map<String, String> map) throws JSONException {
        if (map == null || map.isEmpty()) {
            ACLog.e(TAG, "Utils#stringMap2Json, string map is empty");
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        ACLog.d(TAG, "Utils#stringMap2Json, result: " + jSONObject);
        return jSONObject;
    }
}
