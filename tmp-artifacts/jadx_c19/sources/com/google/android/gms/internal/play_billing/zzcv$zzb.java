package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcv$zzb extends zzcv$zza {
    private static final AtomicReferenceFieldUpdater<zzcv$zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zzcv$zze.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater<zzcv$zze, zzcv$zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zzcv$zze.class, zzcv$zze.class, "next");
    private static final AtomicReferenceFieldUpdater<? super zzcv<?>, zzcv$zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, zzcv$zze.class, "waitersField");
    private static final AtomicReferenceFieldUpdater<? super zzcv<?>, zzcu$zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, zzcu$zzd.class, "listenersField");
    private static final AtomicReferenceFieldUpdater<? super zzcv<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, Object.class, "valueField");

    private zzcv$zzb() {
        throw null;
    }

    /* synthetic */ zzcv$zzb(zzcz zzczVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcu$zzd zza(zzcv zzcvVar, zzcu$zzd zzcu_zzd) {
        return zzd.getAndSet(zzcvVar, zzcu_zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcv$zze zzb(zzcv zzcvVar, zzcv$zze zzcv_zze) {
        return zzc.getAndSet(zzcvVar, zzcv_zze);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzc(zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        zzb.lazySet(zzcv_zze, zzcv_zze2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzd(zzcv$zze zzcv_zze, Thread thread) {
        zza.lazySet(zzcv_zze, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zze(zzcv zzcvVar, zzcu$zzd zzcu_zzd, zzcu$zzd zzcu_zzd2) {
        return zzcw.zza(zzd, zzcvVar, zzcu_zzd, zzcu_zzd2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
        return zzcw.zza(zze, zzcvVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzg(zzcv zzcvVar, zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        return zzcw.zza(zzc, zzcvVar, zzcv_zze, zzcv_zze2);
    }
}
