package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzhp implements Parcelable.Creator {
    public static int onExtraCallback;
    public static int onWarmupCompleted;

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzdo zzdoVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i2 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzdoVar = (zzdo) SafeParcelReader.createParcelable(parcel, header, zzdo.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzho(i2, zzdoVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzho[i2];
    }

    public static int onNavigationEvent() {
        int i2 = onExtraCallback;
        int i3 = i2 % 9036408;
        onExtraCallback = i2 + 1;
        if (i3 != 0) {
            return onWarmupCompleted;
        }
        int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        onWarmupCompleted = i4;
        return i4;
    }
}
