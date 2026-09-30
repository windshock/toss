package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzafj implements zzacq<zzafj> {
    private static final String zza = "zzafj";
    private String zzb;
    private zzaq<zzaft> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacq
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafj zza(String str) throws JSONException, zzaah {
        zzaq<zzaft> zzaqVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzaqVarZza = zzaq.zza(new ArrayList());
                } else {
                    zzap zzapVarZzg = zzaq.zzg();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        zzapVarZzg.zza(jSONObject2 == null ? zzaft.zza(null, null) : zzaft.zza(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zzaqVarZza = zzapVarZzg.zza();
                }
                this.zzc = zzaqVarZza;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzahb.zza(e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb(String str) {
        String strZza;
        Preconditions.checkNotEmpty(str);
        zzaq<zzaft> zzaqVar = this.zzc;
        if (zzaqVar == null || zzaqVar.isEmpty()) {
            strZza = null;
        } else {
            zzaq<zzaft> zzaqVar2 = this.zzc;
            int size = zzaqVar2.size();
            int i2 = 0;
            while (i2 < size) {
                zzaft zzaftVar = zzaqVar2.get(i2);
                i2++;
                zzaft zzaftVar2 = zzaftVar;
                String strZza2 = zzaftVar2.zza();
                String strZzb = zzaftVar2.zzb();
                if (strZza2 != null && strZzb != null && strZzb.equals(str)) {
                    strZza = zzaftVar2.zza();
                    break;
                }
            }
            strZza = null;
        }
        if (strZza == null) {
            return false;
        }
        return strZza.equals("ENFORCE") || strZza.equals("AUDIT");
    }
}
