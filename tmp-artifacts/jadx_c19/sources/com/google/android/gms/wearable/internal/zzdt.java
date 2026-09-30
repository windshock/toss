package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = new zzdu();
    private final byte[] zza;

    public zzdt(@SafeParcelable.Param(id = 1) byte[] bArr) {
        this.zza = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
