package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzaez implements zzacr {
    private String zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }

    public zzaez(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }
}
