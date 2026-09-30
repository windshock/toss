package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzau;
import com.google.firebase.auth.internal.zzav;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzcc;
import com.google.firebase.auth.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzaag extends zzadf {
    public final Task<Void> zza(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzadh) new zzaaj(str, str2).zza(firebaseApp));
    }

    public final Task<ActionCodeResult> zzb(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzadh) new zzaai(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3) {
        return zza((zzadh) new zzaal(str, str2, str3).zza(firebaseApp));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, String str3, @Nullable String str4, zzl zzlVar) {
        return zza((zzadh) new zzaak(str, str2, str3, str4).zza(firebaseApp).zza((zzacw) zzlVar));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, zzav zzavVar) {
        return zza((zzadh) new zzaan().zza(firebaseUser).zza((zzacw) zzavVar).zza((zzau) zzavVar));
    }

    public final Task<SignInMethodQueryResult> zzc(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzadh) new zzaam(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, @Nullable String str, zzl zzlVar) {
        zzads.zza();
        zzaap zzaapVar = new zzaap(phoneMultiFactorAssertion, firebaseUser.zze(), str, (String) null);
        zzaapVar.zza(firebaseApp).zza((zzacw) zzlVar);
        return zza((zzadh) zzaapVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, TotpMultiFactorAssertion totpMultiFactorAssertion, FirebaseUser firebaseUser, @Nullable String str, @Nullable String str2, zzl zzlVar) {
        zzaap zzaapVar = new zzaap(totpMultiFactorAssertion, firebaseUser.zze(), str, str2);
        zzaapVar.zza(firebaseApp).zza((zzacw) zzlVar);
        return zza((zzadh) zzaapVar);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, @Nullable FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzl zzlVar) {
        zzads.zza();
        zzaao zzaaoVar = new zzaao(phoneMultiFactorAssertion, str, (String) null);
        zzaaoVar.zza(firebaseApp).zza((zzacw) zzlVar);
        if (firebaseUser != null) {
            zzaaoVar.zza(firebaseUser);
        }
        return zza((zzadh) zzaaoVar);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, @Nullable FirebaseUser firebaseUser, TotpMultiFactorAssertion totpMultiFactorAssertion, String str, @Nullable String str2, zzl zzlVar) {
        zzaao zzaaoVar = new zzaao(totpMultiFactorAssertion, str, str2);
        zzaaoVar.zza(firebaseApp).zza((zzacw) zzlVar);
        if (firebaseUser != null) {
            zzaaoVar.zza(firebaseUser);
        }
        return zza((zzadh) zzaaoVar);
    }

    public final Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzaar) new zzaar(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<GetTokenResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<zzafi> zza() {
        return zza((zzadh) new zzaaq());
    }

    public final Task<zzafj> zza(@Nullable String str, String str2) {
        return zza(new zzaat(str, str2));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcc zzccVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzccVar);
        List listZzf = firebaseUser.zzf();
        if (listZzf != null && listZzf.contains(authCredential.getProvider())) {
            return Tasks.forException(zzach.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzf()) {
                return zza((zzaas) new zzaas(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
            }
            return zza((zzaax) new zzaax(emailAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzads.zza();
            return zza((zzaau) new zzaau((PhoneAuthCredential) authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
        }
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzccVar);
        return zza((zzaav) new zzaav(authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcc zzccVar) {
        return zza((zzadh) new zzaaw(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcc zzccVar) {
        return zza((zzaaz) new zzaaz(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, zzcc zzccVar) {
        return zza((zzadh) new zzaay(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, zzcc zzccVar) {
        return zza((zzabb) new zzabb(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, zzcc zzccVar) {
        return zza((zzadh) new zzaba(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, zzcc zzccVar) {
        return zza((zzabd) new zzabd(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzcc zzccVar) {
        zzads.zza();
        return zza((zzadh) new zzabc(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzcc zzccVar) {
        zzads.zza();
        return zza((zzabf) new zzabf(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzcc zzccVar) {
        return zza((zzadh) new zzabe().zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, @Nullable String str4) {
        return zza((zzadh) new zzabh(str, str2, str3, str4));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, @Nullable ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzadh) new zzabg(str, actionCodeSettings).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.zza(1);
        return zza((zzadh) new zzabj(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(firebaseApp));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.zza(6);
        return zza((zzadh) new zzabj(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(firebaseApp));
    }

    public final Task<Void> zza(@Nullable String str) {
        return zza((zzadh) new zzabi(str));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, zzl zzlVar, @Nullable String str) {
        return zza((zzadh) new zzabl(str).zza(firebaseApp).zza((zzacw) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, @Nullable String str, zzl zzlVar) {
        return zza((zzabk) new zzabk(authCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, @Nullable String str2, zzl zzlVar) {
        return zza((zzadh) new zzabn(str, str2).zza(firebaseApp).zza((zzacw) zzlVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3, @Nullable String str4, zzl zzlVar) {
        return zza((zzabm) new zzabm(str, str2, str3, str4).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, @Nullable String str, zzl zzlVar) {
        return zza((zzabp) new zzabp(emailAuthCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzl zzlVar) {
        zzads.zza();
        return zza((zzabo) new zzabo(phoneAuthCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<Void> zza(zzam zzamVar, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzabr zzabrVar = new zzabr(zzamVar, str, str2, j, z, z2, str3, str4, z3);
        zzabrVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
        return zza((zzadh) zzabrVar);
    }

    public final Task<zzagi> zza(zzam zzamVar, @Nullable String str) {
        return zza((zzadh) new zzabq(zzamVar, str));
    }

    public final Task<Void> zza(zzam zzamVar, PhoneMultiFactorInfo phoneMultiFactorInfo, @Nullable String str, long j, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzabt zzabtVar = new zzabt(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzamVar.zzc()), str, j, z, z2, str2, str3, z3);
        zzabtVar.zza(onVerificationStateChangedCallbacks, activity, executor, phoneMultiFactorInfo.getUid());
        return zza((zzadh) zzabtVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, @Nullable String str2, zzcc zzccVar) {
        return zza((zzadh) new zzabs(firebaseUser.zze(), str, str2).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzccVar);
        List listZzf = firebaseUser.zzf();
        if ((listZzf != null && !listZzf.contains(str)) || firebaseUser.isAnonymous()) {
            return Tasks.forException(zzach.zza(new Status(17016, str)));
        }
        str.getClass();
        if (str.equals("password")) {
            return zza((zzadh) new zzabv().zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
        }
        return zza((zzadh) new zzabu(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzadh) new zzabx(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzadh) new zzabw(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzcc zzccVar) {
        zzads.zza();
        return zza((zzadh) new zzabz(phoneAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzcc zzccVar) {
        return zza((zzadh) new zzaby(userProfileChangeRequest).zza(firebaseApp).zza(firebaseUser).zza((zzacw) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zza(7);
        return zza((zzadh) new zzacb(str, str2, actionCodeSettings));
    }

    public final Task<String> zzd(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzadh) new zzaca(str, str2).zza(firebaseApp));
    }

    static zzaf zza(FirebaseApp firebaseApp, zzafb zzafbVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(zzafbVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzab(zzafbVar, "firebase"));
        List<zzafr> listZzl = zzafbVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i2 = 0; i2 < listZzl.size(); i2++) {
                arrayList.add(new zzab(listZzl.get(i2)));
            }
        }
        zzaf zzafVar = new zzaf(firebaseApp, arrayList);
        zzafVar.zza(new zzah(zzafbVar.zzb(), zzafbVar.zza()));
        zzafVar.zza(zzafbVar.zzn());
        zzafVar.zza(zzafbVar.zze());
        zzafVar.zzb(zzbk.zza(zzafbVar.zzk()));
        zzafVar.zzc(zzafbVar.zzd());
        return zzafVar;
    }

    public zzaag(FirebaseApp firebaseApp, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzace(firebaseApp, scheduledExecutorService);
        this.zzb = executor;
    }

    public final void zza(FirebaseApp firebaseApp, zzafz zzafzVar, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor) {
        zza((zzadh) new zzacd(zzafzVar).zza(firebaseApp).zza(onVerificationStateChangedCallbacks, activity, executor, zzafzVar.zzd()));
    }
}
