package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzb {
    private static zzb zza = new zze();

    public static zzb zza() {
        zzb zzbVar;
        synchronized (zzb.class) {
            zzbVar = zza;
        }
        return zzbVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
