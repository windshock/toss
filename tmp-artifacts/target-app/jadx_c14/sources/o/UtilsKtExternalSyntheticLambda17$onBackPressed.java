package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$onBackPressed implements deserializeIntNullableCollection {
    public static int IAuthTabCallback;
    public static int onWarmupCompleted;
    private final /* synthetic */ Function1 onExtraCallbackWithResult;

    public UtilsKtExternalSyntheticLambda17$onBackPressed(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallbackWithResult = function1;
    }

    public static int onExtraCallbackWithResult() {
        int i = onWarmupCompleted;
        int i2 = i % 6679809;
        onWarmupCompleted = i + 1;
        if (i2 != 0) {
            return IAuthTabCallback;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        IAuthTabCallback = iFreeMemory;
        return iFreeMemory;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.onExtraCallbackWithResult.invoke(obj);
    }
}
