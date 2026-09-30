package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzba implements OnFailureListener {
    private final /* synthetic */ TaskCompletionSource zza;
    private final /* synthetic */ Context zzb;

    zzba(zzax zzaxVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.zza = taskCompletionSource;
        this.zzb = context;
    }

    public final void onFailure(Exception exc) {
        this.zza.setException(exc);
        zzax.zza(this.zzb);
    }
}
