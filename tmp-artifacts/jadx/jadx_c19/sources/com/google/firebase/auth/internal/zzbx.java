package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbx {
    Map<String, Task<RecaptchaTasksClient>> zza;
    FirebaseApp zzb;
    zzbs zzc;
    private zzafj zzd;
    private FirebaseAuth zze;

    private final Task<RecaptchaTasksClient> zzb(String str) {
        return this.zza.get(str);
    }

    public final Task<String> zza(@Nullable String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strZzc = zzc(str);
        Task<RecaptchaTasksClient> taskZzb = zzb(strZzc);
        if (bool.booleanValue() || taskZzb == null) {
            taskZzb = zza(strZzc, bool);
        }
        return taskZzb.continueWithTask(new zzbz(this, recaptchaAction));
    }

    public final Task<RecaptchaTasksClient> zza(@Nullable String str, Boolean bool) {
        Task<RecaptchaTasksClient> taskZzb;
        String strZzc = zzc(str);
        return (bool.booleanValue() || (taskZzb = zzb(strZzc)) == null) ? this.zze.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new zzbw(this, strZzc)) : taskZzb;
    }

    private static String zzc(@Nullable String str) {
        return com.google.android.gms.internal.p000firebaseauthapi.zzah.zzc(str) ? "*" : str;
    }

    public zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        this(firebaseApp, firebaseAuth, new zzbv());
    }

    private zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth, zzbs zzbsVar) {
        this.zza = new HashMap();
        this.zzb = firebaseApp;
        this.zze = firebaseAuth;
        this.zzc = zzbsVar;
    }

    public final boolean zza(String str) {
        zzafj zzafjVar = this.zzd;
        return zzafjVar != null && zzafjVar.zzb(str);
    }
}
