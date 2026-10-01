package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzpe extends RuntimeException {
    public static <T> T zza(zzph<T> zzphVar) {
        try {
            return zzphVar.zza();
        } catch (Exception e) {
            throw new zzpe(e);
        }
    }

    public zzpe(String str) {
        super(str);
    }

    private zzpe(Throwable th) {
        super(th);
    }

    public zzpe(String str, Throwable th) {
        super(str, th);
    }
}
