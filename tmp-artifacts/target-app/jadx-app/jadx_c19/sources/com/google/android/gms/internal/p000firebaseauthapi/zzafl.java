package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzafl implements Parcelable.Creator<zzafm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Long longObject = null;
        String strCreateString3 = null;
        Long longObject2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 4) {
                longObject = SafeParcelReader.readLongObject(parcel, header);
            } else if (fieldId == 5) {
                strCreateString3 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                longObject2 = SafeParcelReader.readLongObject(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzafm(strCreateString, strCreateString2, longObject, strCreateString3, longObject2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm[] newArray(int i2) {
        return new zzafm[i2];
    }
}
