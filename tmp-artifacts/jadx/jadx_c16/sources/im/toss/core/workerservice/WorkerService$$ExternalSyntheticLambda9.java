package im.toss.core.workerservice;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.onCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WorkerService$$ExternalSyntheticLambda9 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        if (i3 == 0) {
            return onCallback.IAuthTabCallbackDefault(function1, obj);
        }
        onCallback.IAuthTabCallbackDefault(function1, obj);
        throw null;
    }
}
