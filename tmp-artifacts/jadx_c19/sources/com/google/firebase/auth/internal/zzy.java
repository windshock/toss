package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzd;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzy implements Parcelable.Creator<zzz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzaf zzafVar = null;
        zzx zzxVar = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header, zzaf.CREATOR);
            } else if (fieldId == 2) {
                zzxVar = (zzx) SafeParcelReader.createParcelable(parcel, header, zzx.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzdVar = (zzd) SafeParcelReader.createParcelable(parcel, header, zzd.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzz(zzafVar, zzxVar, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i2) {
        return new zzz[i2];
    }
}
