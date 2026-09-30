package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zzags;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new zzal();
    private final String zza;
    private final String zzb;

    public final AuthCredential zza() {
        return new GoogleAuthCredential(this.zza, this.zzb);
    }

    public static zzags zza(@NonNull GoogleAuthCredential googleAuthCredential, @Nullable String str) {
        Preconditions.checkNotNull(googleAuthCredential);
        return new zzags(googleAuthCredential.zza, googleAuthCredential.zzb, googleAuthCredential.getProvider(), null, null, null, str, null, null);
    }

    public String getProvider() {
        return "google.com";
    }

    public String getSignInMethod() {
        return "google.com";
    }

    GoogleAuthCredential(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.zza = str;
        this.zzb = str2;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
