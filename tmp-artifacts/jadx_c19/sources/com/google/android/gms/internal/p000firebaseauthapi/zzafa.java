package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzafa implements zzacr {
    private String zza = zzaey.REFRESH_TOKEN.toString();
    private String zzb;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }

    public zzafa(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }
}
