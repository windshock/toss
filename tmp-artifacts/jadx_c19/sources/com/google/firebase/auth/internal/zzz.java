package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzd;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();
    private zzaf zza;
    private zzx zzb;
    private zzd zzc;

    public final int describeContents() {
        return 0;
    }

    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzb;
    }

    public final AuthCredential getCredential() {
        return this.zzc;
    }

    public final FirebaseUser getUser() {
        return this.zza;
    }

    public zzz(zzaf zzafVar) {
        zzaf zzafVar2 = (zzaf) Preconditions.checkNotNull(zzafVar);
        this.zza = zzafVar2;
        List<zzab> listZzi = zzafVar2.zzi();
        this.zzb = null;
        for (int i2 = 0; i2 < listZzi.size(); i2++) {
            if (!TextUtils.isEmpty(listZzi.get(i2).zza())) {
                this.zzb = new zzx(listZzi.get(i2).getProviderId(), listZzi.get(i2).zza(), zzafVar.zzj());
            }
        }
        if (this.zzb == null) {
            this.zzb = new zzx(zzafVar.zzj());
        }
        this.zzc = zzafVar.zzg();
    }

    zzz(@NonNull @SafeParcelable.Param(id = 1) zzaf zzafVar, @Nullable @SafeParcelable.Param(id = 2) zzx zzxVar, @Nullable @SafeParcelable.Param(id = 3) zzd zzdVar) {
        this.zza = zzafVar;
        this.zzb = zzxVar;
        this.zzc = zzdVar;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUser(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getAdditionalUserInfo(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
