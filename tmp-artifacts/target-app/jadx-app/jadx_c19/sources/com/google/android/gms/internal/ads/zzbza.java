package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbza extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbza(zzbmo zzbmoVar) {
        try {
            this.zzb = zzbmoVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbmoVar.zzb()) {
                zzbmv zzbmvVarZzg = obj instanceof IBinder ? zzbmu.zzg((IBinder) obj) : null;
                if (zzbmvVarZzg != null) {
                    this.zza.add(new zzbzc(zzbmvVarZzg));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
