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
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new zzak();
    private String zza;

    public final AuthCredential zza() {
        return new GithubAuthCredential(this.zza);
    }

    public static zzags zza(@NonNull GithubAuthCredential githubAuthCredential, @Nullable String str) {
        Preconditions.checkNotNull(githubAuthCredential);
        return new zzags(null, githubAuthCredential.zza, githubAuthCredential.getProvider(), null, null, null, str, null, null);
    }

    public String getProvider() {
        return "github.com";
    }

    public String getSignInMethod() {
        return "github.com";
    }

    GithubAuthCredential(@SafeParcelable.Param(id = 1) String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
