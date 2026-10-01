package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.google.android.gms.internal.p000firebaseauthapi.zzbp;
import com.google.android.gms.internal.p000firebaseauthapi.zzkj;
import com.google.android.gms.internal.p000firebaseauthapi.zzkq;
import com.google.android.gms.internal.p000firebaseauthapi.zzlx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzq {
    private static zzq zza;
    private final String zzb;
    private final zzlx zzc;

    public static zzq zza(Context context, String str) {
        zzq zzqVar = zza;
        if (zzqVar == null || !com.google.android.gms.internal.p000firebaseauthapi.zzw.zza(zzqVar.zzb, str)) {
            zza = new zzq(context, str, true);
        }
        return zza;
    }

    public final String zza(String str) {
        String str2;
        zzlx zzlxVar = this.zzc;
        if (zzlxVar == null) {
            return null;
        }
        try {
            synchronized (zzlxVar) {
                str2 = new String(((zzbp) this.zzc.zza().zza(zzbp.class)).zza(Base64.decode(str, 8), null), HexStringUtil.DEFAULT_CHARSET_NAME);
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            e.getMessage();
            return null;
        }
    }

    public final String zza() {
        if (this.zzc == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p000firebaseauthapi.zzce zzceVarZza = com.google.android.gms.internal.p000firebaseauthapi.zzbj.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            e.getMessage();
            return null;
        }
    }

    private zzq(Context context, String str, boolean z) {
        zzlx zzlxVarZza;
        this.zzb = str;
        try {
            zzkj.zza();
            zzlx.zza zzaVarZza = new zzlx.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzlxVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e) {
            e.getMessage();
            zzlxVarZza = null;
        }
        this.zzc = zzlxVarZza;
    }
}
