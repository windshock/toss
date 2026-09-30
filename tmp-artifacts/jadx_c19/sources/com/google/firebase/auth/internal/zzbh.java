package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p000firebaseauthapi.zzac;
import com.google.android.gms.internal.p000firebaseauthapi.zzxv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.onMeasure;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbh {
    private static final Logger zza = new Logger("JSONParser", new String[0]);

    private static List<Object> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objZza = jSONArray.get(i2);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            arrayList.add(objZza);
        }
        return arrayList;
    }

    public static Map<String, Object> zza(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzac.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            zza.e("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> mapZzb = zzb(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), HexStringUtil.DEFAULT_CHARSET_NAME));
            return mapZzb == null ? new HashMap() : mapZzb;
        } catch (UnsupportedEncodingException e) {
            zza.e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    public static Map<String, Object> zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return zza(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new zzxv(e);
        }
    }

    private static Map<String, Object> zza(JSONObject jSONObject) throws JSONException {
        onMeasure onmeasure = new onMeasure();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objZza = jSONObject.get(next);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            onmeasure.put(next, objZza);
        }
        return onmeasure;
    }
}
