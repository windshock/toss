package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbsr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsr> CREATOR = new zzbss();
    public final String zza;
    public final Bundle zzb;

    public zzbsr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
