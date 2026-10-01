package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class zzjn implements OnCompleteListener {
    public final /* synthetic */ zzfn zza;

    public final void onComplete(Task task) {
        zzfn zzfnVar = this.zza;
        if (task.isSuccessful()) {
            zzjq.zzw(zzfnVar, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableListenerStub", "Failed to resolve future, sending null response", task.getException());
            zzjq.zzv(zzfnVar);
        }
    }
}
