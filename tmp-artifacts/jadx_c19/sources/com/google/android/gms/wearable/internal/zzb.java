package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    private final String zza;
    private final boolean zzb;

    public zzb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        return this.zza.equals(zzbVar.zza) && this.zzb == zzbVar.zzb;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, Boolean.valueOf(this.zzb)});
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
