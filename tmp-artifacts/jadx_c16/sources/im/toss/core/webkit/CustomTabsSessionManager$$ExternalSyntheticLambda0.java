package im.toss.core.webkit;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.ALCCamera;
import o.UtilsKtExternalSyntheticLambda17;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CustomTabsSessionManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Boolean bool = (Boolean) ALCCamera.onExtraCallback(819567453, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -819567451, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{(Pair) obj});
        int i4 = IAuthTabCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
