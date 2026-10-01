package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearTimestamp implements deserializeFloat {
    private final /* synthetic */ Function1 onWarmupCompleted;

    clearTimestamp(Function1 function1) {
        this.onWarmupCompleted = function1;
    }

    @Override // o.deserializeFloat
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.onWarmupCompleted.invoke(obj), "");
    }
}
