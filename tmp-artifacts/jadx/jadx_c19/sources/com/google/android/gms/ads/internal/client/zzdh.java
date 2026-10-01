package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdh implements MuteThisAdReason {
    private final String zza;
    private final zzdg zzb;

    public zzdh(zzdg zzdgVar) {
        String strZze;
        this.zzb = zzdgVar;
        try {
            strZze = zzdgVar.zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            strZze = null;
        }
        this.zza = strZze;
    }

    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdg zza() {
        return this.zzb;
    }
}
