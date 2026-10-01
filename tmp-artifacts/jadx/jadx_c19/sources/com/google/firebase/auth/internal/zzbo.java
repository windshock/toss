package com.google.firebase.auth.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzbo<T> {
    public abstract Task<T> zza(@Nullable String str);

    private static <T> Task<T> zza(zzbx zzbxVar, RecaptchaAction recaptchaAction, @Nullable String str, Continuation<String, Task<T>> continuation) {
        Task<String> taskZza = zzbxVar.zza(str, Boolean.FALSE, recaptchaAction);
        return taskZza.continueWithTask(continuation).continueWithTask(new zzbt(str, zzbxVar, recaptchaAction, continuation));
    }

    public final Task<T> zza(final FirebaseAuth firebaseAuth, @Nullable final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: com.google.firebase.auth.internal.zzbq
            public final Object then(Task task) {
                zzbo zzboVar = this.zza;
                if (task.isSuccessful()) {
                    return zzboVar.zza((String) task.getResult());
                }
                ((Exception) Preconditions.checkNotNull(task.getException())).getMessage();
                return zzboVar.zza("NO_RECAPTCHA");
            }
        };
        zzbx zzbxVarZzb = firebaseAuth.zzb();
        if (zzbxVarZzb != null && zzbxVarZzb.zza(str2)) {
            return zza(zzbxVarZzb, recaptchaAction, str, continuation);
        }
        return zza(null).continueWithTask(new Continuation() { // from class: com.google.firebase.auth.internal.zzbr
            public final Object then(Task task) {
                return zzbo.zza(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        });
    }

    static /* synthetic */ Task zza(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (zzach.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                String.valueOf(recaptchaAction);
            }
            if (firebaseAuth.zzb() == null) {
                firebaseAuth.zza(new zzbx(firebaseAuth.getApp(), firebaseAuth));
            }
            return zza(firebaseAuth.zzb(), recaptchaAction, str, continuation);
        }
        String.valueOf(recaptchaAction);
        exc.getMessage();
        return Tasks.forException(exc);
    }
}
