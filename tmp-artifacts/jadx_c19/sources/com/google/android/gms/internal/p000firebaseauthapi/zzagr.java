package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.material.button.MaterialButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzagr implements Parcelable.Creator<zzags> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 15:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzags(strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, strCreateString7, strCreateString8, z, z2, strCreateString9, strCreateString10, strCreateString11, strCreateString12, z3, strCreateString13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags[] newArray(int i2) {
        return new zzags[i2];
    }
}
