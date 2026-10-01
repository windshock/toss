package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzagx implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    public static zzagx zza(String str, String str2, boolean z) {
        zzagx zzagxVar = new zzagx();
        zzagxVar.zzb = Preconditions.checkNotEmpty(str);
        zzagxVar.zzc = Preconditions.checkNotEmpty(str2);
        zzagxVar.zzf = z;
        return zzagxVar;
    }

    public static zzagx zzb(String str, String str2, boolean z) {
        zzagx zzagxVar = new zzagx();
        zzagxVar.zza = Preconditions.checkNotEmpty(str);
        zzagxVar.zzd = Preconditions.checkNotEmpty(str2);
        zzagxVar.zzf = z;
        return zzagxVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    private zzagx() {
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
