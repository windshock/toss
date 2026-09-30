package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzed;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbwk extends zzdz {
    private final Object zza = new Object();
    private volatile zzed zzb;

    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzj() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl(@Nullable zzed zzedVar) throws RemoteException {
        synchronized (this.zza) {
            this.zzb = zzedVar;
        }
    }

    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final zzed zzo() throws RemoteException {
        zzed zzedVar;
        synchronized (this.zza) {
            zzedVar = this.zzb;
        }
        return zzedVar;
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
