package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final String zza;
    public final String zzb;
    public final zzjs zzc;
    public final String zzd;
    public final String zze;
    public final Float zzf;
    public final zzu zzg;

    public zzq(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzjs zzjsVar, @SafeParcelable.Param(id = 4) String str3, @Nullable @SafeParcelable.Param(id = 5) String str4, @Nullable @SafeParcelable.Param(id = 6) Float f, @Nullable @SafeParcelable.Param(id = 7) zzu zzuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzjsVar;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = f;
        this.zzg = zzuVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzq.class != obj.getClass()) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return zzp.zza(this.zza, zzqVar.zza) && zzp.zza(this.zzb, zzqVar.zzb) && zzp.zza(this.zzc, zzqVar.zzc) && zzp.zza(this.zzd, zzqVar.zzd) && zzp.zza(this.zze, zzqVar.zze) && zzp.zza(this.zzf, zzqVar.zzf) && zzp.zza(this.zzg, zzqVar.zzg);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg});
    }

    public final String toString() {
        return "AppParcelable{title='" + this.zzb + "', developerName='" + this.zzd + "', formattedPrice='" + this.zze + "', starRating=" + this.zzf + ", wearDetails=" + String.valueOf(this.zzg) + ", deepLinkUri='" + this.zza + "', icon=" + String.valueOf(this.zzc) + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i2, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeFloatObject(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
