package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners implements deserializeIntNullableCollection {
    private final /* synthetic */ Function1 IAuthTabCallback;

    public UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
    }

    @Override // o.deserializeIntNullableCollection
    public final /* synthetic */ Object apply(Object obj) {
        return this.IAuthTabCallback.invoke(obj);
    }
}
