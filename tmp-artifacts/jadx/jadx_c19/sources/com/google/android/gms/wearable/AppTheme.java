package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new zzc();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public AppTheme() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.zzb == appTheme.zzb && this.zza == appTheme.zza && this.zzc == appTheme.zzc && this.zzd == appTheme.zzd;
    }

    public final int hashCode() {
        return (((((this.zzb * 31) + this.zza) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.zzb + ", colorTheme =" + this.zza + ", screenAlignment =" + this.zzc + ", screenItemsSize =" + this.zzd + "}";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        int i3 = this.zza;
        if (i3 == 0) {
            i3 = 1;
        }
        SafeParcelWriter.writeInt(parcel, 1, i3);
        int i4 = this.zzb;
        if (i4 == 0) {
            i4 = 1;
        }
        SafeParcelWriter.writeInt(parcel, 2, i4);
        int i5 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, i5 != 0 ? i5 : 1);
        int i6 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, i6 != 0 ? i6 : 3);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AppTheme(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
    }
}
