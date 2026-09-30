package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbon extends UnifiedNativeAd {
    private final zzbom zza;
    private final zzbmw zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    public zzbon(zzbom zzbomVar) {
        zzbmv zzbmtVar;
        this.zza = zzbomVar;
        zzbmw zzbmwVar = null;
        try {
            List listZzf = zzbomVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmtVar = iInterfaceQueryLocalInterface instanceof zzbmv ? (zzbmv) iInterfaceQueryLocalInterface : new zzbmt(iBinder);
                    } else {
                        zzbmtVar = null;
                    }
                    if (zzbmtVar != null) {
                        this.zzb.add(new zzbmw(zzbmtVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    zzdg zzdgVarZza = obj2 instanceof IBinder ? zzdf.zza((IBinder) obj2) : null;
                    if (zzdgVarZza != null) {
                        this.zze.add(new zzdh(zzdgVarZza));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        try {
            zzbmv zzbmvVarZzh = this.zza.zzh();
            if (zzbmvVarZzh != null) {
                zzbmwVar = new zzbmw(zzbmvVarZzh);
            }
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
        }
        this.zzc = zzbmwVar;
        try {
            if (this.zza.zzq() != null) {
                new zzbmp(this.zza.zzq());
            }
        } catch (RemoteException e4) {
            zzo.zzg("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zza() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzc() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzg() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zzj() {
        try {
            zzbom zzbomVar = this.zza;
            if (zzbomVar.zzn() != null) {
                this.zzd.zza(zzbomVar.zzn());
            }
        } catch (RemoteException e) {
            zzo.zzg("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzk() {
        try {
            IObjectWrapper iObjectWrapperZzv = this.zza.zzv();
            if (iObjectWrapperZzv != null) {
                return ObjectWrapper.unwrap(iObjectWrapperZzv);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzg("", e);
            return null;
        }
    }
}
