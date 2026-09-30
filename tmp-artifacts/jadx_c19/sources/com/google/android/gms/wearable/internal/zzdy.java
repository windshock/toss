package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.AppTheme;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        AppTheme appTheme = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i2 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                appTheme = (AppTheme) SafeParcelReader.createParcelable(parcel, header, AppTheme.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdx(i2, appTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzdx[i2];
    }
}
