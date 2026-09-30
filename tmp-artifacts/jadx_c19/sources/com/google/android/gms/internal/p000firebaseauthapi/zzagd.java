package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzagd implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            zzahb.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzahb.zza(jSONObject);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }

    public zzagd(@Nullable String str) {
        this.zzd = str;
    }

    public zzagd(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = null;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }
}
