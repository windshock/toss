package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$onUserLeaveHint implements deserializeIntNullableCollection {
    private final /* synthetic */ Function1 IAuthTabCallback;

    public UtilsKtExternalSyntheticLambda17$onUserLeaveHint(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.IAuthTabCallback.invoke(obj);
    }
}
