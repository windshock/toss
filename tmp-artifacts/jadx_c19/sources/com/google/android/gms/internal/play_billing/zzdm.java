package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzdm implements Runnable {
    zzdp zza;

    zzdm(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdk zzdkVarZzr;
        zzdp zzdpVar = this.zza;
        if (zzdpVar == null || (zzdkVarZzr = zzdp.zzr(zzdpVar)) == null) {
            return;
        }
        this.zza = null;
        if (zzdkVarZzr.isDone()) {
            zzdpVar.zzj(zzdkVarZzr);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzt = zzdp.zzt(zzdpVar);
            zzdp.zzu(zzdpVar, (ScheduledFuture) null);
            String str = "Timed out";
            if (scheduledFutureZzt != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzt.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzdpVar.zzi(new zzdn(str, null));
                    throw th;
                }
            }
            zzdpVar.zzi(new zzdn(str + ": " + zzdkVarZzr.toString(), null));
        } finally {
            zzdkVarZzr.cancel(true);
        }
    }
}
