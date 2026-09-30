package com.bytedance.sdk.component.ycx;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ul {
    private jc ycx;

    static ul ycx(jc jcVar) {
        return new ul(jcVar);
    }

    private ul(jc jcVar) {
        this.ycx = jcVar;
    }

    <T> T ycx(String str, Type type) throws JSONException {
        ycx(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) new JSONObject(str);
        }
        return (T) this.ycx.ycx(str, type);
    }

    <T> String ycx(T t) {
        String string;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            string = t.toString();
        } else {
            string = this.ycx.ycx(t);
        }
        ycx(string);
        return string;
    }

    private static void ycx(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        fby.ycx(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
