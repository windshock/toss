package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.GeckoHubImp1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzi extends Lambda implements Function1 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ GeckoHubImp1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(TaskCompletionSource taskCompletionSource, GeckoHubImp1 geckoHubImp1) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = geckoHubImp1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            RuntimeExecutionException runtimeExecutionExceptionCe_ = this.zzb.ce_();
            if (runtimeExecutionExceptionCe_ == null) {
                this.zza.setResult(this.zzb.IAuthTabCallback());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = runtimeExecutionExceptionCe_ instanceof Exception ? (Exception) runtimeExecutionExceptionCe_ : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(runtimeExecutionExceptionCe_);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return Unit.INSTANCE;
    }
}
