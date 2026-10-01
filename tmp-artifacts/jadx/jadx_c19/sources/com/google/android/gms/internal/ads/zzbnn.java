package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbnn {
    private final zzbnm zza;

    public zzbnn(zzbnm zzbnmVar) {
        Context context;
        this.zza = zzbnmVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbnmVar.zzm());
        } catch (RemoteException | NullPointerException e) {
            zzo.zzg("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
        }
    }

    public final zzbnm zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }
}
