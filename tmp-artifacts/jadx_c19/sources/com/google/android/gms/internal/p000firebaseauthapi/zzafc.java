package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzafc implements zzacq<zzafc> {
    private static final String zza = "zzafc";
    private zzafe zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafc zza(String str) throws JSONException, zzaah {
        zzafe zzafeVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzafeVar = new zzafe(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        arrayList.add(jSONObject2 == null ? new zzafb() : new zzafb(Strings.emptyToNull(jSONObject2.optString("localId", null)), Strings.emptyToNull(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", false), Strings.emptyToNull(jSONObject2.optString("displayName", null)), Strings.emptyToNull(jSONObject2.optString("photoUrl", null)), zzafu.zza(jSONObject2.optJSONArray("providerUserInfo")), Strings.emptyToNull(jSONObject2.optString("rawPassword", null)), Strings.emptyToNull(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafq.zza(jSONObject2.optJSONArray("mfaInfo")), zzafp.zza(jSONObject2.optJSONArray("passkeyInfo"))));
                    }
                    zzafeVar = new zzafe(arrayList);
                }
            } else {
                zzafeVar = new zzafe();
            }
            this.zzb = zzafeVar;
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahb.zza(e, zza, str);
        }
    }

    public final List<zzafb> zza() {
        return this.zzb.zza();
    }
}
