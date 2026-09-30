package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p000firebaseauthapi.zzagq;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzat implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzagq zzagqVar = null;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                j = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzagqVar = (zzagq) SafeParcelReader.createParcelable(parcel, header, zzagq.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new TotpMultiFactorInfo(strCreateString, strCreateString2, j, zzagqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i2) {
        return new TotpMultiFactorInfo[i2];
    }
}
