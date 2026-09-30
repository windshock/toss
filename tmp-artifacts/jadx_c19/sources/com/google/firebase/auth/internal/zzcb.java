package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.firebase.FirebaseApp;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcb {
    private volatile int zza;
    private final zzaq zzb;
    private volatile boolean zzc;

    public zzcb(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzaq(firebaseApp));
    }

    private zzcb(Context context, zzaq zzaqVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzaqVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzca(this));
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i2) {
        if (i2 > 0 && this.zza == 0) {
            this.zza = i2;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i2 == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i2;
    }

    public final void zza(zzafm zzafmVar) {
        if (zzafmVar != null) {
            long jZza = zzafmVar.zza();
            if (jZza <= 0) {
                jZza = 3600;
            }
            long jZzb = zzafmVar.zzb();
            zzaq zzaqVar = this.zzb;
            zzaqVar.zza = jZzb + (jZza * 1000);
            zzaqVar.zzb = -1L;
            if (zzb()) {
                this.zzb.zzc();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }
}
