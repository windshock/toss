package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzfo;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfk {
    private static final zzoe<zzfl, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfn
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzwh.zza((zzfl) zzbuVar);
        }
    }, zzfl.class, zzbh.class);
    private static final zznn<zzfo> zzb = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfm
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzfk.zza((zzfo) zzciVar, null);
        }
    };
    private static final zzbt<zzbh> zzc = zznd.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbh.class, zzux.zzb.SYMMETRIC, zztf.zze());

    static zzfl zza(zzfo zzfoVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzfl.zza(zzfoVar.zzb(), zzxt.zza(32), num);
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zzfq.zza();
        zzns.zza().zza(zza);
        zznk.zza().zza(zzb, zzfo.class);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzfo.zza(zzfo.zza.zza));
        map.put("CHACHA20_POLY1305_RAW", zzfo.zza(zzfo.zza.zzc));
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zzcu.zza((zzbt) zzc, true);
    }
}
