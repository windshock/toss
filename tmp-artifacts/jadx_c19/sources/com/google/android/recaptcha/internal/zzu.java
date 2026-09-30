package com.google.android.recaptcha.internal;

import kotlin.text.StringsKt;
import o.getCodeNameBytes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, (Object) null) + " us| maxExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzc), 10, (char) 0, 2, (Object) null) + " us| totalTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb), 10, (char) 0, 2, (Object) null) + " us| #Usages: " + StringsKt.padEnd$default(String.valueOf(this.zza), 5, (char) 0, 2, (Object) null);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzu zzuVar) {
        return getCodeNameBytes.IAuthTabCallback(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i2) {
        this.zza = i2;
    }
}
