package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzau;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzacw<ResultT, CallbackT> implements zzadh<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected FirebaseApp zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected zzau zzf;
    protected zzacx<ResultT> zzg;
    protected Executor zzi;
    protected zzafm zzj;
    protected zzafb zzk;
    protected zzaem zzl;
    protected zzafv zzm;
    protected String zzn;
    protected String zzo;
    protected AuthCredential zzp;
    protected String zzq;
    protected String zzr;
    protected zzyi zzs;
    protected zzafj zzt;
    protected zzafi zzu;
    protected zzagi zzv;
    protected zzaga zzw;
    boolean zzx;
    private boolean zzz;
    protected final zzacy zzb = new zzacy(this);
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzh = new ArrayList();
    private boolean zzy = true;

    public final zzacw<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final zzacw<ResultT, CallbackT> zza(zzau zzauVar) {
        this.zzf = (zzau) Preconditions.checkNotNull(zzauVar, "external failure callback cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(FirebaseApp firebaseApp) {
        this.zzc = (FirebaseApp) Preconditions.checkNotNull(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        this.zzd = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zzads.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacksZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    static /* synthetic */ void zza(zzacw zzacwVar) {
        zzacwVar.zzb();
        Preconditions.checkState(zzacwVar.zzz, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzacw zzacwVar, Status status) {
        zzau zzauVar = zzacwVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
    }

    public zzacw(int i2) {
        this.zza = i2;
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }
}
