package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class UtilsKtExternalSyntheticLambda17$onExtraCallback implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final /* synthetic */ Function1 onExtraCallback;

    public UtilsKtExternalSyntheticLambda17$onExtraCallback(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            objInvoke = this.onExtraCallback.invoke(obj);
            int i3 = 99 / 0;
        } else {
            objInvoke = this.onExtraCallback.invoke(obj);
        }
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
