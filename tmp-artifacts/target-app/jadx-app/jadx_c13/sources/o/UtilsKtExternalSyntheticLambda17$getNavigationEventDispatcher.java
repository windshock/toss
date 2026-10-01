package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher implements deserializeIntNullableCollection {
    private final /* synthetic */ Function1 onNavigationEvent;

    public UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
    }

    @Override // o.deserializeIntNullableCollection
    public final /* synthetic */ Object apply(Object obj) {
        return this.onNavigationEvent.invoke(obj);
    }
}
