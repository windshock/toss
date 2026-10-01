package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbt implements Continuation<Object, Task<Object>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;
    private final /* synthetic */ RecaptchaAction zzc;
    private final /* synthetic */ Continuation zzd;

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful() || !zzach.zzb((Exception) Preconditions.checkNotNull(task.getException()))) {
            return task;
        }
        Log.isLoggable("RecaptchaCallWrapper", 4);
        return this.zzb.zza(this.zza, Boolean.TRUE, this.zzc).continueWithTask(this.zzd);
    }

    zzbt(String str, zzbx zzbxVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.zza = str;
        this.zzb = zzbxVar;
        this.zzc = recaptchaAction;
        this.zzd = continuation;
    }
}
