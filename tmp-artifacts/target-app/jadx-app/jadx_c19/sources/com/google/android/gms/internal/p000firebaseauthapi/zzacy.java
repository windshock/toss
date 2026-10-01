package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzau;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzacy implements zzacc {
    final /* synthetic */ zzacw zza;

    zzacy(zzacw zzacwVar) {
        this.zza = zzacwVar;
    }

    private final void zza(zzadd zzaddVar) {
        this.zza.zzi.execute(new zzade(this, zzaddVar));
    }

    private final void zza(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        zzacw.zza(this.zza, status);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzp = authCredential;
        zzacwVar.zzq = str;
        zzacwVar.zzr = str2;
        zzau zzauVar = zzacwVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(String str) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 8, "Unexpected response type " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzo = str;
        zzacwVar.zzz = true;
        this.zza.zzx = true;
        zza((zzadd) new zzadc(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zzb(String str) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 8, "Unexpected response type " + i2);
        this.zza.zzo = str;
        zza((zzadd) new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzaem zzaemVar) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 3, "Unexpected response type " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzl = zzaemVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza() throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 5, "Unexpected response type " + i2);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzyj zzyjVar) {
        zza(zzyjVar.zza(), zzyjVar.zzb(), zzyjVar.zzc(), zzyjVar.zzd());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzyi zzyiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzs = zzyiVar;
        zzacwVar.zza(zzao.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 2, "Unexpected response type " + i2);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacw zzacwVar = this.zza;
        if (zzacwVar.zza == 8) {
            zzacwVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadb(this, status));
        } else {
            zzacw.zza(zzacwVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzafi zzafiVar) throws RemoteException {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzu = zzafiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzafj zzafjVar) throws RemoteException {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzt = zzafjVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar, zzafb zzafbVar) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 2, "Unexpected response type: " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacwVar.zzk = zzafbVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(@Nullable zzafv zzafvVar) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 4, "Unexpected response type " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzm = zzafvVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzaga zzagaVar) throws RemoteException {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzw = zzagaVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zzb() throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 6, "Unexpected response type " + i2);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zzc(String str) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 7, "Unexpected response type " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzn = str;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zzc() throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 9, "Unexpected response type " + i2);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzagi zzagiVar) throws RemoteException {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzv = zzagiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 1, "Unexpected response type: " + i2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacc
    public final void zza(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i2 = this.zza.zza;
        Preconditions.checkState(i2 == 8, "Unexpected response type " + i2);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza((zzadd) new zzacz(this, phoneAuthCredential));
    }
}
