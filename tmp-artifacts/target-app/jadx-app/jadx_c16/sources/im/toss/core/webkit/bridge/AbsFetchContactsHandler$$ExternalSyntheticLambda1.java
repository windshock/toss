package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.GeckoHubImp;
import o.setIconPaddingBottom;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Integer.valueOf(this.f$0), (setIconPaddingBottom.onExtraCallback) obj};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 != 0) {
            return (CharSequence) surfaceDestroyed.onNavigationEvent(-1170410673, 1170410678, iIAuthTabCallback4, objArr, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
        }
        int i4 = 34 / 0;
        return (CharSequence) surfaceDestroyed.onNavigationEvent(-1170410673, 1170410678, iIAuthTabCallback4, objArr, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
    }
}
