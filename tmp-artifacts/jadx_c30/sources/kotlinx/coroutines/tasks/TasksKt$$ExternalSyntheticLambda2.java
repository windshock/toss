package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.functions.Function1;
import o.GeckoHubImp1;
import o.jni_YGNodeStyleGetMaxWidthJNI;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TasksKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ CancellationTokenSource f$0;
    public final /* synthetic */ GeckoHubImp1 f$1;
    public final /* synthetic */ TaskCompletionSource f$2;

    public /* synthetic */ TasksKt$$ExternalSyntheticLambda2(CancellationTokenSource cancellationTokenSource, GeckoHubImp1 geckoHubImp1, TaskCompletionSource taskCompletionSource) {
        this.f$0 = cancellationTokenSource;
        this.f$1 = geckoHubImp1;
        this.f$2 = taskCompletionSource;
    }

    public final Object invoke(Object obj) {
        return jni_YGNodeStyleGetMaxWidthJNI.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (Throwable) obj);
    }
}
