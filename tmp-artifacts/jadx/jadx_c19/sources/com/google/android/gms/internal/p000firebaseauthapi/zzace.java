package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzace {
    private static final Logger zza = new Logger("FirebaseAuth", new String[]{"FirebaseAuthFallback:"});
    private final zzyl zzb;
    private final zzadt zzc;

    zzace(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzb = new zzyl(new zzacs(firebaseApp, zzact.zza()));
        this.zzc = new zzadt(applicationContext, scheduledExecutorService);
    }

    public final void zza(String str, @Nullable String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzb(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzc(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, @Nullable String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzd(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzxxVar);
        Preconditions.checkNotEmpty(zzxxVar.zza());
        Preconditions.checkNotEmpty(zzxxVar.zzb());
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzxxVar.zza(), zzxxVar.zzb(), zzxxVar.zzc(), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(MultiFactorAssertion multiFactorAssertion, String str, @Nullable String str2, @Nullable String str3, zzacc zzaccVar) {
        zzaeu zzaeuVarZza;
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotNull(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential phoneAuthCredentialZza = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            zzaeuVarZza = zzaeu.zza(str, (String) Preconditions.checkNotNull(phoneAuthCredentialZza.zzc()), (String) Preconditions.checkNotNull(phoneAuthCredentialZza.getSmsCode()), str2, str3);
        } else if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            zzaeuVarZza = zzaew.zza(str, Preconditions.checkNotEmpty(str2), Preconditions.checkNotEmpty(((TotpSecret) Preconditions.checkNotNull(totpMultiFactorAssertion.zza())).getSessionInfo()), Preconditions.checkNotEmpty(totpMultiFactorAssertion.zzc()), str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza((zzaeq) zzaeuVarZza, str, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, MultiFactorAssertion multiFactorAssertion, @Nullable String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotNull(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential phoneAuthCredentialZza = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            this.zzb.zza((zzaes) zzaet.zza(str, (String) Preconditions.checkNotNull(phoneAuthCredentialZza.zzc()), (String) Preconditions.checkNotNull(phoneAuthCredentialZza.getSmsCode()), str2), new zzacf(zzaccVar, zza));
        } else {
            if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
                TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
                this.zzb.zza((zzaes) zzaev.zza(str, Preconditions.checkNotEmpty(totpMultiFactorAssertion.zzc()), str2, Preconditions.checkNotEmpty(totpMultiFactorAssertion.zzb())), new zzacf(zzaccVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zzb(String str, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzb(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxw zzxwVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzxwVar);
        this.zzb.zza(zzaff.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, @Nullable String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        this.zzb.zze(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzxzVar);
        this.zzb.zza(zzafk.zza(zzxzVar.zzb(), zzxzVar.zza()), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzags zzagsVar, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzagsVar);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzaccVar);
        Preconditions.checkNotNull(zzxyVar);
        PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) Preconditions.checkNotNull(zzxyVar.zza());
        this.zzb.zza(Preconditions.checkNotEmpty(zzxyVar.zzb()), zzadn.zza(phoneAuthCredential), new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzc(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzafyVar);
        this.zzb.zza(zzafyVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(@NonNull zzyb zzybVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzybVar);
        Preconditions.checkNotEmpty(zzybVar.zzb());
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzybVar.zzb(), zzybVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(@NonNull zzya zzyaVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzyaVar);
        Preconditions.checkNotEmpty(zzyaVar.zzc());
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzyaVar.zzc(), zzyaVar.zza(), zzyaVar.zzd(), zzyaVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyd zzydVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzaccVar);
        Preconditions.checkNotNull(zzydVar);
        zzafz zzafzVar = (zzafz) Preconditions.checkNotNull(zzydVar.zza());
        String strZzd = zzafzVar.zzd();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (zzafzVar.zze()) {
                this.zzc.zzc(strZzd);
            } else {
                this.zzc.zzb(zzacfVar, strZzd);
                return;
            }
        }
        long jZzb = zzafzVar.zzb();
        boolean zZzf = zzafzVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzafzVar.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzacfVar, jZzb, zZzf);
        this.zzb.zza(zzafzVar, this.zzc.zza(zzacfVar, strZzd));
    }

    public final void zza(zzyc zzycVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzycVar);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzd(zzycVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zzd(@Nullable String str, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zze(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzags zzagsVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzagsVar);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzagt zzagtVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzagtVar);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzagtVar, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaccVar);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzyfVar);
        Preconditions.checkNotNull(zzyfVar.zza());
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(zzyfVar.zza(), zzyfVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzye zzyeVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzaccVar);
        Preconditions.checkNotNull(zzyeVar);
        this.zzb.zza(zzadn.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzyeVar.zza())), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, long j, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, boolean z3, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str, "idToken should not be empty.");
        Preconditions.checkNotNull(zzaccVar);
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacfVar, str2);
                return;
            }
        }
        zzagf zzagfVarZza = zzagj.zza(str, str2, str3, str4, str5, (String) null);
        if (zza(j, z3)) {
            zzagfVarZza.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacfVar, j, z3);
        this.zzb.zza(zzagfVarZza, this.zzc.zza(zzacfVar, str2));
    }

    public final void zza(zzyh zzyhVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzyhVar);
        Preconditions.checkNotNull(zzaccVar);
        String phoneNumber = zzyhVar.zzb().getPhoneNumber();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(phoneNumber)) {
            if (zzyhVar.zzg()) {
                this.zzc.zzc(phoneNumber);
            } else {
                this.zzc.zzb(zzacfVar, phoneNumber);
                return;
            }
        }
        long jZza = zzyhVar.zza();
        boolean zZzh = zzyhVar.zzh();
        zzagh zzaghVarZza = zzagh.zza(zzyhVar.zzd(), zzyhVar.zzb().getUid(), zzyhVar.zzb().getPhoneNumber(), zzyhVar.zzc(), zzyhVar.zzf(), zzyhVar.zze());
        if (zza(jZza, zZzh)) {
            zzaghVarZza.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(phoneNumber, zzacfVar, jZza, zZzh);
        this.zzb.zza(zzaghVarZza, this.zzc.zza(zzacfVar, phoneNumber));
    }

    public final void zza(zzagl zzaglVar, zzacc zzaccVar) {
        this.zzb.zza((zzagf) zzaglVar, new zzacf((zzacc) Preconditions.checkNotNull(zzaccVar), zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotEmpty(str2, "uid should not be empty.");
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzb(str, str2, str3, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzf(str, new zzacf(zzaccVar, zza));
    }

    public final void zzf(String str, String str2, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zzf(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacc zzaccVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzaccVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyg zzygVar, zzacc zzaccVar) {
        Preconditions.checkNotNull(zzygVar);
        this.zzb.zza(zzafd.zza(zzygVar.zza(), zzygVar.zzb(), zzygVar.zzc()), new zzacf(zzaccVar, zza));
    }

    private static boolean zza(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
