package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final boolean zza;
    public final List zzb;

    public zzu(@SafeParcelable.Param(id = 1) boolean z, @Nullable @SafeParcelable.Param(id = 2) List list) {
        this.zza = z;
        this.zzb = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzu.class != obj.getClass()) {
            return false;
        }
        zzu zzuVar = (zzu) obj;
        if (this.zza != zzuVar.zza) {
            return false;
        }
        List list = this.zzb;
        List list2 = zzuVar.zzb;
        return list == list2 || (list != null && list.equals(list2));
    }

    public final int hashCode() {
        boolean z = this.zza;
        return Arrays.hashCode(new Object[]{Boolean.valueOf(z), this.zzb});
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.zza + ", watchfaceCategories=" + String.valueOf(this.zzb) + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
