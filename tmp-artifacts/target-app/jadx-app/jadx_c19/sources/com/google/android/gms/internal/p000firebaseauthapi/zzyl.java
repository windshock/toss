package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zzd;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzyl {
    private final zzadk zza;

    static /* synthetic */ void zza(zzyl zzylVar, zzagu zzaguVar, zzacf zzacfVar, zzadj zzadjVar) {
        if (zzaguVar.zzo()) {
            zzacfVar.zza(new zzyj(zzaguVar.zzm() ? new Status(17012) : zzao.zza(zzaguVar.zzd()), zzaguVar.zzb(), zzaguVar.zzc(), zzaguVar.zzj()));
            return;
        }
        zzylVar.zza(new zzafm(zzaguVar.zzi(), zzaguVar.zze(), Long.valueOf(zzaguVar.zza()), "Bearer"), zzaguVar.zzh(), zzaguVar.zzg(), Boolean.valueOf(zzaguVar.zzn()), zzaguVar.zzb(), zzacfVar, zzadjVar);
    }

    static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzagd zzagdVar, zzadj zzadjVar) {
        Preconditions.checkNotNull(zzacfVar);
        Preconditions.checkNotNull(zzagdVar);
        Preconditions.checkNotNull(zzadjVar);
        zzylVar.zza.zza(zzagdVar, new zzza(zzylVar, zzacfVar, zzadjVar));
    }

    static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzagb zzagbVar, zzadj zzadjVar) {
        Preconditions.checkNotNull(zzacfVar);
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(zzagbVar);
        Preconditions.checkNotNull(zzadjVar);
        zzylVar.zza.zza(new zzaez(zzafmVar.zzc()), (zzadm<zzafc>) new zzyr(zzylVar, zzadjVar, zzacfVar, zzafmVar, zzagbVar));
    }

    static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzafb zzafbVar, zzagb zzagbVar, zzadj zzadjVar) {
        Preconditions.checkNotNull(zzacfVar);
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(zzafbVar);
        Preconditions.checkNotNull(zzagbVar);
        Preconditions.checkNotNull(zzadjVar);
        zzylVar.zza.zza(zzagbVar, (zzadm<zzage>) new zzyq(zzylVar, zzagbVar, zzafbVar, zzacfVar, zzafmVar, zzadjVar));
    }

    public zzyl(zzadk zzadkVar) {
        this.zza = (zzadk) Preconditions.checkNotNull(zzadkVar);
    }

    public final void zza(String str, @Nullable String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zzagb zzagbVar = new zzagb();
        zzagbVar.zze(str);
        zzagbVar.zzh(str2);
        this.zza.zza(zzagbVar, (zzadm<zzage>) new zzaaf(this, zzacfVar));
    }

    public final void zzb(String str, String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzaad(this, str2, zzacfVar));
    }

    public final void zzc(String str, String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzaac(this, str2, zzacfVar));
    }

    public final void zzd(String str, @Nullable String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzafw(str, (String) null, str2), (zzadm<zzafv>) new zzyu(this, zzacfVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzafw(str, str2, str3), (zzadm<zzafv>) new zzyw(this, zzacfVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzagd(str, str2, null, str3, str4, null), (zzadm<zzagg>) new zzyn(this, zzacfVar));
    }

    public final void zza(String str, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzzu(this, zzacfVar));
    }

    private final void zza(String str, zzadm<zzafm> zzadmVar) {
        Preconditions.checkNotNull(zzadmVar);
        Preconditions.checkNotEmpty(str);
        zzafm zzafmVarZzb = zzafm.zzb(str);
        if (zzafmVarZzb.zzg()) {
            zzadmVar.zza((zzadm<zzafm>) zzafmVarZzb);
        } else {
            this.zza.zza(new zzafa(zzafmVarZzb.zzd()), new zzaae(this, zzadmVar));
        }
    }

    public final void zza(zzaeq zzaeqVar, String str, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzaeqVar);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzzm(this, zzaeqVar, zzacfVar));
    }

    public final void zza(zzaes zzaesVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzaesVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzaesVar, (zzadm<zzaer>) new zzzo(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaeo zzaeoVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzaeoVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzaeoVar, new zzyo(this, zzacfVar));
    }

    public final void zzb(String str, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzafa(str), new zzyk(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafm zzafmVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zzd zzdVar, zzacf zzacfVar, zzadj zzadjVar) {
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(zzadjVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzaez(zzafmVar.zzc()), new zzyt(this, zzadjVar, str2, str, bool, zzdVar, zzacfVar, zzafmVar));
    }

    private final void zzb(zzafd zzafdVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzafdVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzafdVar, (zzadm<zzafg>) new zzzz(this, zzacfVar));
    }

    public final void zza(zzaff zzaffVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzaffVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzaffVar, (zzadm<zzafi>) new zzzt(this, zzacfVar));
    }

    public final void zze(String str, @Nullable String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzaej(str, str2), (zzadm<zzaem>) new zzys(this, zzacfVar));
    }

    public final void zza(zzafk zzafkVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzafkVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzafkVar, new zzzq(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzacfVar);
        zza(str3, new zzzb(this, str, str2, str4, str5, zzacfVar));
    }

    public final void zza(String str, zzags zzagsVar, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzagsVar);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, new zzzf(this, zzagsVar, zzacfVar));
    }

    public final void zza(String str, zzagx zzagxVar, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzagxVar);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, new zzzd(this, zzagxVar, zzacfVar));
    }

    public final void zzc(String str, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzzs(this, zzacfVar));
    }

    public final void zza(zzafy zzafyVar, zzacf zzacfVar) {
        this.zza.zza(zzafyVar, (zzadm<zzaga>) new zzaab(this, zzacfVar));
    }

    public final void zza(String str, @Nullable ActionCodeSettings actionCodeSettings, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zzafd zzafdVar = new zzafd(4);
        zzafdVar.zzd(str);
        if (actionCodeSettings != null) {
            zzafdVar.zza(actionCodeSettings);
        }
        zzb(zzafdVar, zzacfVar);
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zzafd zzafdVar = new zzafd(actionCodeSettings.zza());
        zzafdVar.zzb(str);
        zzafdVar.zza(actionCodeSettings);
        zzafdVar.zzc(str2);
        zzafdVar.zza(str3);
        this.zza.zza(zzafdVar, (zzadm<zzafg>) new zzyv(this, zzacfVar));
    }

    public final void zza(zzafz zzafzVar, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(zzafzVar.zzd());
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzafzVar, (zzadm<zzagc>) new zzyz(this, zzacfVar));
    }

    public final void zzd(@Nullable String str, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(str, (zzadm<Void>) new zzzw(this, zzacfVar));
    }

    public final void zze(@Nullable String str, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzagd(str), (zzadm<zzagg>) new zzzy(this, zzacfVar));
    }

    public final void zza(zzags zzagsVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzagsVar);
        Preconditions.checkNotNull(zzacfVar);
        zzagsVar.zzb(true);
        this.zza.zza(zzagsVar, new zzzk(this, zzacfVar));
    }

    public final void zza(zzagt zzagtVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzagtVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzagtVar, (zzadm<zzagw>) new zzyx(this, zzacfVar));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(new zzagv(str, str2, str3, str4), new zzym(this, zzacfVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, @Nullable String str, zzacf zzacfVar) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzacfVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.zzb(), new zzyp(this, emailAuthCredential, str, zzacfVar));
        } else {
            zza(new zzaeo(emailAuthCredential, null, str), zzacfVar);
        }
    }

    public final void zza(zzagx zzagxVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzagxVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzagxVar, new zzyy(this, zzacfVar));
    }

    public final void zza(zzagf zzagfVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzagfVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzagfVar, (zzadm<zzagi>) new zzzn(this, zzagfVar, zzacfVar));
    }

    public final void zza(zzagh zzaghVar, zzacf zzacfVar) {
        Preconditions.checkNotNull(zzaghVar);
        Preconditions.checkNotNull(zzacfVar);
        this.zza.zza(zzaghVar, (zzadm<zzagk>) new zzzr(this, zzacfVar));
    }

    public final void zzb(String str, String str2, @Nullable String str3, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzzi(this, str2, str3, zzacfVar));
    }

    public final void zzf(String str, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzzh(this, zzacfVar));
    }

    public final void zzf(String str, String str2, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzacfVar);
        zza(str2, (zzadm<zzafm>) new zzzg(this, str, zzacfVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacf zzacfVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzacfVar);
        zza(str, (zzadm<zzafm>) new zzaaa(this, userProfileChangeRequest, zzacfVar));
    }

    public final void zza(zzafd zzafdVar, zzacf zzacfVar) {
        zzb(zzafdVar, zzacfVar);
    }
}
