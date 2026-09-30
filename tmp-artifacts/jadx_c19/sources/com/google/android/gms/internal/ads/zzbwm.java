package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbwm implements MediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbwm(@Nullable Date date, int i2, @Nullable Set set, @Nullable Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.zza = date;
        this.zzb = i2;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i3;
        this.zzg = z2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
