package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzagv implements zzacr {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzahb.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public zzagv(String str, String str2, @Nullable String str3, @Nullable String str4) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = str4;
    }
}
