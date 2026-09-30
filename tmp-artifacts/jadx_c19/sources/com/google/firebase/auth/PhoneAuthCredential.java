package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzap();
    private String zza;
    private String zzb;
    private String zzc;
    private boolean zzd;
    private String zze;

    public final AuthCredential zza() {
        return (PhoneAuthCredential) clone();
    }

    public static PhoneAuthCredential zza(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    public static PhoneAuthCredential zzb(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    public final PhoneAuthCredential zza(boolean z) {
        this.zzd = false;
        return this;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze);
    }

    public final String zzb() {
        return this.zzc;
    }

    public String getProvider() {
        return "phone";
    }

    public final String zzc() {
        return this.zza;
    }

    public String getSignInMethod() {
        return "phone";
    }

    public String getSmsCode() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zze;
    }

    PhoneAuthCredential(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) boolean z, @Nullable @SafeParcelable.Param(id = 6) String str4) {
        Preconditions.checkArgument(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
        this.zze = str4;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, getSmsCode(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zze() {
        return this.zzd;
    }
}
