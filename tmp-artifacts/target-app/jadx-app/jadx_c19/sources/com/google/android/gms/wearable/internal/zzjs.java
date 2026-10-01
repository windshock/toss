package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = new zzfu();
    public final String zza;
    public final int zzb;
    public final int zzc;

    public zzjs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzjs.class != obj.getClass()) {
            return false;
        }
        zzjs zzjsVar = (zzjs) obj;
        if (this.zzb != zzjsVar.zzb || this.zzc != zzjsVar.zzc) {
            return false;
        }
        String str = this.zza;
        String str2 = zzjsVar.zza;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        int i2 = this.zzb;
        int i3 = this.zzc;
        return String.format(locale, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(i2), Integer.valueOf(i3), this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
