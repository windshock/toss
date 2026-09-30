package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.wearable.zzad;
import com.google.android.gms.internal.wearable.zzae;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzf(@Nullable @SafeParcelable.Param(id = 1) List list, @Nullable @SafeParcelable.Param(id = 2) List list2, @Nullable @SafeParcelable.Param(id = 3) List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
    }

    public final String toString() {
        zzad zzadVarZza = zzae.zza(this);
        zzadVarZza.zzb("allowedDataItemFilters", this.zza);
        zzadVarZza.zzb("allowedCapabilities", this.zzb);
        zzadVarZza.zzb("allowedPackages", this.zzc);
        return zzadVarZza.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
