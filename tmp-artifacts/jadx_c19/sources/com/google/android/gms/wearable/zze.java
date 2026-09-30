package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        ArrayList arrayListCreateStringList = null;
        zzf zzfVar = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
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
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 14:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    zzfVar = (zzf) SafeParcelReader.createParcelable(parcel, header, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionConfiguration(strCreateString, strCreateString2, i2, i3, z2, z3, strCreateString3, z4, strCreateString4, strCreateString5, i4, arrayListCreateStringList, z5, z, zzfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionConfiguration[i2];
    }
}
