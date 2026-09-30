package com.google.android.gms.internal.play_billing;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcv$zzc extends zzcv$zza {
    private zzcv$zzc() {
        throw null;
    }

    /* synthetic */ zzcv$zzc(zzcz zzczVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcu$zzd zza(zzcv zzcvVar, zzcu$zzd zzcu_zzd) {
        zzcu$zzd zzcu_zzd2;
        synchronized (zzcvVar) {
            zzcu_zzd2 = zzcvVar.listenersField;
            if (zzcu_zzd2 != zzcu_zzd) {
                zzcvVar.listenersField = zzcu_zzd;
            }
        }
        return zzcu_zzd2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcv$zze zzb(zzcv zzcvVar, zzcv$zze zzcv_zze) {
        zzcv$zze zzcv_zze2;
        synchronized (zzcvVar) {
            zzcv_zze2 = zzcvVar.waitersField;
            if (zzcv_zze2 != zzcv_zze) {
                zzcvVar.waitersField = zzcv_zze;
            }
        }
        return zzcv_zze2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzc(zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        zzcv_zze.next = zzcv_zze2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzd(zzcv$zze zzcv_zze, Thread thread) {
        zzcv_zze.thread = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zze(zzcv zzcvVar, zzcu$zzd zzcu_zzd, zzcu$zzd zzcu_zzd2) {
        synchronized (zzcvVar) {
            if (zzcvVar.listenersField != zzcu_zzd) {
                return false;
            }
            zzcvVar.listenersField = zzcu_zzd2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
        synchronized (zzcvVar) {
            if (zzcvVar.valueField != obj) {
                return false;
            }
            zzcvVar.valueField = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzg(zzcv zzcvVar, zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        synchronized (zzcvVar) {
            if (zzcvVar.waitersField != zzcv_zze) {
                return false;
            }
            zzcvVar.waitersField = zzcv_zze2;
            return true;
        }
    }
}
