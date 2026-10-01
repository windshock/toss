package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zze();
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private volatile String zzg;
    private final boolean zzh;
    private final String zzi;
    private final String zzj;
    private final int zzk;
    private final List zzl;
    private final boolean zzm;
    private final boolean zzn;
    private final zzf zzo;

    ConnectionConfiguration(@Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) boolean z2, @Nullable @SafeParcelable.Param(id = 8) String str3, @SafeParcelable.Param(id = 9) boolean z3, @Nullable @SafeParcelable.Param(id = 10) String str4, @Nullable @SafeParcelable.Param(id = 11) String str5, @SafeParcelable.Param(id = 12) int i4, @Nullable @SafeParcelable.Param(id = 13) List list, @SafeParcelable.Param(id = 14) boolean z4, @SafeParcelable.Param(id = 15) boolean z5, @Nullable @SafeParcelable.Param(id = MaterialButton.ICON_GRAVITY_TOP) zzf zzfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = z2;
        this.zzg = str3;
        this.zzh = z3;
        this.zzi = str4;
        this.zzj = str5;
        this.zzk = i4;
        this.zzl = list;
        this.zzm = z4;
        this.zzn = z5;
        this.zzo = zzfVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return Objects.equal(this.zza, connectionConfiguration.zza) && Objects.equal(this.zzb, connectionConfiguration.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(connectionConfiguration.zzc)) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(connectionConfiguration.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(connectionConfiguration.zze)) && Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(connectionConfiguration.zzh)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(connectionConfiguration.zzm)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(connectionConfiguration.zzn));
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.zza + ", Address=" + this.zzb + ", Type=" + this.zzc + ", Role=" + this.zzd + ", Enabled=" + this.zze + ", IsConnected=" + this.zzf + ", PeerNodeId=" + this.zzg + ", BtlePriority=" + this.zzh + ", NodeId=" + this.zzi + ", PackageName=" + this.zzj + ", ConnectionRetryStrategy=" + this.zzk + ", allowedConfigPackages=" + this.zzl + ", Migrating=" + this.zzm + ", DataItemSyncEnabled=" + this.zzn + ", ConnectionRestrictions=" + this.zzo + "]";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeStringList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzo, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
