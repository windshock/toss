package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbb {
    private final zzne zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzbb(@NotNull zzne zzneVar, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        this.zza = zzneVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbb)) {
            return false;
        }
        zzbb zzbbVar = (zzbb) obj;
        return zzbbVar.zza == this.zza && Intrinsics.areEqual(zzbbVar.zzb, this.zzb) && Intrinsics.areEqual(zzbbVar.zzc, this.zzc) && Intrinsics.areEqual(zzbbVar.zzd, this.zzd) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzne zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
