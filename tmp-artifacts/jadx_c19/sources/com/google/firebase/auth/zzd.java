package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zzags;
import com.google.android.gms.internal.p000firebaseauthapi.zzah;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzd extends OAuthCredential {
    public static final Parcelable.Creator<zzd> CREATOR = new zzf();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzags zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public final AuthCredential zza() {
        return new zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public static zzd zza(zzags zzagsVar) {
        Preconditions.checkNotNull(zzagsVar, "Must specify a non-null webSignInCredential");
        return new zzd(null, null, null, zzagsVar, null, null, null);
    }

    public static zzd zza(String str, String str2, String str3) {
        return zza(str, str2, str3, null, null);
    }

    public static zzd zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzd(str, str2, str3, null, str4, str5, null);
    }

    static zzd zza(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzd(str, str2, str3, null, null, null, str4);
    }

    public static zzags zza(zzd zzdVar, @Nullable String str) {
        Preconditions.checkNotNull(zzdVar);
        zzags zzagsVar = zzdVar.zzd;
        return zzagsVar != null ? zzagsVar : new zzags(zzdVar.getIdToken(), zzdVar.getAccessToken(), zzdVar.getProvider(), null, zzdVar.getSecret(), null, str, zzdVar.zze, zzdVar.zzg);
    }

    public String getAccessToken() {
        return this.zzc;
    }

    public String getIdToken() {
        return this.zzb;
    }

    public String getProvider() {
        return this.zza;
    }

    public String getSecret() {
        return this.zzf;
    }

    public String getSignInMethod() {
        return this.zza;
    }

    zzd(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) String str3, @Nullable @SafeParcelable.Param(id = 4) zzags zzagsVar, @Nullable @SafeParcelable.Param(id = 5) String str4, @Nullable @SafeParcelable.Param(id = 6) String str5, @Nullable @SafeParcelable.Param(id = 7) String str6) {
        this.zza = zzah.zzb(str);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagsVar;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getProvider(), false);
        SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 3, getAccessToken(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, getSecret(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
