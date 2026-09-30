package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final Logger zzb = new Logger(zzaeo.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws Throwable {
        ActionCodeUrl link = ActionCodeUrl.parseLink(this.zzd);
        String code = link != null ? link.getCode() : null;
        String strZza = link != null ? link.zza() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (code != null) {
            jSONObject.put("oobCode", code);
        }
        if (strZza != null) {
            jSONObject.put("tenantId", strZza);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzahb.zza(jSONObject, "captchaResp", str2);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public zzaeo(EmailAuthCredential emailAuthCredential, @Nullable String str, @Nullable String str2) {
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.zzc());
        this.zzd = Preconditions.checkNotEmpty(emailAuthCredential.zze());
        this.zze = str;
        this.zzf = str2;
    }
}
