package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseauthapi.zzac;
import com.google.android.gms.internal.p000firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzbw implements Continuation<zzafj, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new zzbu((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzafj zzafjVar = (zzafj) task.getResult();
        String strZza = zzafjVar.zza();
        if (com.google.android.gms.internal.p000firebaseauthapi.zzah.zzc(strZza)) {
            return Tasks.forException(new zzbu("No Recaptcha Enterprise siteKey configured for tenant/project " + this.zza));
        }
        List<String> listZza = zzac.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        Log.isLoggable("RecaptchaHandler", 4);
        this.zzb.zzd = zzafjVar;
        zzbx zzbxVar = this.zzb;
        Task<RecaptchaTasksClient> taskZza = zzbxVar.zzc.zza((Application) zzbxVar.zzb.getApplicationContext(), str);
        this.zzb.zza.put(this.zza, taskZza);
        return taskZza;
    }

    zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        this.zzb = zzbxVar;
    }
}
