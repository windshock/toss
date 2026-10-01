package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearPriority implements deserializeDecimalCollection {
    private final /* synthetic */ Function0 onWarmupCompleted;

    clearPriority(Function0 function0) {
        this.onWarmupCompleted = function0;
    }

    @Override // o.deserializeDecimalCollection
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.onWarmupCompleted.invoke(), "");
    }
}
