package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.android.gms.internal.p000firebaseauthapi.zzafp;
import com.google.firebase.auth.zzd;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzafm zzafmVar = null;
        zzab zzabVar = null;
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateStringList = null;
        String strCreateString3 = null;
        Boolean booleanObject = null;
        zzah zzahVar = null;
        zzd zzdVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayListCreateTypedList2 = null;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzafmVar = (zzafm) SafeParcelReader.createParcelable(parcel, header, zzafm.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) SafeParcelReader.createParcelable(parcel, header, zzab.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzab.CREATOR);
                    break;
                case 6:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 9:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    zzdVar = (zzd) SafeParcelReader.createParcelable(parcel, header, zzd.CREATOR);
                    break;
                case 12:
                    zzbjVar = (zzbj) SafeParcelReader.createParcelable(parcel, header, zzbj.CREATOR);
                    break;
                case 13:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, zzafp.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaf(zzafmVar, zzabVar, strCreateString, strCreateString2, arrayListCreateTypedList, arrayListCreateStringList, strCreateString3, booleanObject, zzahVar, z, zzdVar, zzbjVar, arrayListCreateTypedList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i2) {
        return new zzaf[i2];
    }
}
