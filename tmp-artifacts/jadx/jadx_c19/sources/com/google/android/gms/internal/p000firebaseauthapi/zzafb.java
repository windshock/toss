package com.google.android.gms.internal.p000firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzafb {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafu zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private zzd zzl;
    private List<zzafq> zzm;
    private zzaq<zzafp> zzn;

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzaq<zzafp> zzd() {
        return this.zzn;
    }

    public final zzd zze() {
        return this.zzl;
    }

    public final zzafb zza(zzd zzdVar) {
        this.zzl = zzdVar;
        return this;
    }

    public final zzafb zza(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    public final zzafb zzb(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    public final zzafb zza(boolean z) {
        this.zzk = z;
        return this;
    }

    public final zzafb zzc(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzg = str;
        return this;
    }

    public final zzafb zzd(@Nullable String str) {
        this.zze = str;
        return this;
    }

    public final zzafb zza(List<zzafr> list) {
        Preconditions.checkNotNull(list);
        zzafu zzafuVar = new zzafu();
        this.zzf = zzafuVar;
        zzafuVar.zza().addAll(list);
        return this;
    }

    public final zzafu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafq> zzk() {
        return this.zzm;
    }

    public final List<zzafr> zzl() {
        return this.zzf.zza();
    }

    public zzafb() {
        this.zzf = new zzafu();
        this.zzn = zzaq.zzh();
    }

    public zzafb(String str, String str2, boolean z, String str3, String str4, zzafu zzafuVar, String str5, String str6, long j, long j2, boolean z2, zzd zzdVar, List<zzafq> list, zzaq<zzafp> zzaqVar) {
        zzafu zzafuVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzafuVar == null) {
            zzafuVar2 = new zzafu();
        } else {
            List<zzafr> listZza = zzafuVar.zza();
            zzafu zzafuVar3 = new zzafu();
            if (listZza != null) {
                zzafuVar3.zza().addAll(listZza);
            }
            zzafuVar2 = zzafuVar3;
        }
        this.zzf = zzafuVar2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzaqVar;
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }
}
