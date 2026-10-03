package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda0 implements deserializeIntNullableCollection {
    private final /* synthetic */ Function1 onNavigationEvent;

    public UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.onNavigationEvent.invoke(obj);
    }
}
