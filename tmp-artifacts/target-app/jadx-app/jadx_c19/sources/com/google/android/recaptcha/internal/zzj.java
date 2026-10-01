package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.GeckoHubImp1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzj {
    public static final Task zza(@NotNull GeckoHubImp1 geckoHubImp1) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        geckoHubImp1.onExtraCallback(new zzi(taskCompletionSource, geckoHubImp1));
        return taskCompletionSource.getTask();
    }
}
