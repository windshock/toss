package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzcv$zzd extends zzcv$zza {
    static final Unsafe zza;
    static final long zzb;
    static final long zzc;
    static final long zzd;
    static final long zze;
    static final long zzf;

    static {
        Unsafe unsafeZzh;
        try {
            try {
                unsafeZzh = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeZzh = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcy
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return zzcv$zzd.zzh();
                        }
                    });
                } catch (Exception unused2) {
                    unsafeZzh = zzh();
                    Unsafe unsafe = unsafeZzh;
                }
            }
            try {
                zzc = unsafeZzh.objectFieldOffset(zzcv.class.getDeclaredField("waitersField"));
                zzb = unsafeZzh.objectFieldOffset(zzcv.class.getDeclaredField("listenersField"));
                zzd = unsafeZzh.objectFieldOffset(zzcv.class.getDeclaredField("valueField"));
                zze = unsafeZzh.objectFieldOffset(zzcv$zze.class.getDeclaredField("thread"));
                zzf = unsafeZzh.objectFieldOffset(zzcv$zze.class.getDeclaredField("next"));
                zza = unsafeZzh;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2);
        }
    }

    private zzcv$zzd() {
        throw null;
    }

    /* synthetic */ zzcv$zzd(zzcz zzczVar) {
        super(null);
    }

    static /* synthetic */ Unsafe zzh() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcu$zzd zza(zzcv zzcvVar, zzcu$zzd zzcu_zzd) {
        zzcu$zzd zzcu_zzd2;
        do {
            zzcu_zzd2 = zzcvVar.listenersField;
            if (zzcu_zzd == zzcu_zzd2) {
                break;
            }
        } while (!zze(zzcvVar, zzcu_zzd2, zzcu_zzd));
        return zzcu_zzd2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final zzcv$zze zzb(zzcv zzcvVar, zzcv$zze zzcv_zze) {
        zzcv$zze zzcv_zze2;
        do {
            zzcv_zze2 = zzcvVar.waitersField;
            if (zzcv_zze == zzcv_zze2) {
                break;
            }
        } while (!zzg(zzcvVar, zzcv_zze2, zzcv_zze));
        return zzcv_zze2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzc(zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        zza.putObject(zzcv_zze, zzf, zzcv_zze2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final void zzd(zzcv$zze zzcv_zze, Thread thread) {
        zza.putObject(zzcv_zze, zze, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zze(zzcv zzcvVar, zzcu$zzd zzcu_zzd, zzcu$zzd zzcu_zzd2) {
        return zzcx.zza(zza, zzcvVar, zzb, zzcu_zzd, zzcu_zzd2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
        return zzcx.zza(zza, zzcvVar, zzd, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv$zza
    final boolean zzg(zzcv zzcvVar, zzcv$zze zzcv_zze, zzcv$zze zzcv_zze2) {
        return zzcx.zza(zza, zzcvVar, zzc, zzcv_zze, zzcv_zze2);
    }
}
