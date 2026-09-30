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
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzas();
    private final String zza;

    public final AuthCredential zza() {
        return new PlayGamesAuthCredential(this.zza);
    }

    public static zzags zza(@NonNull PlayGamesAuthCredential playGamesAuthCredential, @Nullable String str) {
        Preconditions.checkNotNull(playGamesAuthCredential);
        return new zzags(null, null, playGamesAuthCredential.getProvider(), null, null, playGamesAuthCredential.zza, str, null, null);
    }

    public String getProvider() {
        return "playgames.google.com";
    }

    public String getSignInMethod() {
        return "playgames.google.com";
    }

    PlayGamesAuthCredential(@NonNull @SafeParcelable.Param(id = 1) String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
