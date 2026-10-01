package im.toss.features.home.core.ui.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.RVManifestLazyProxyManifest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeNavigationBarItemGroup$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeNavigationBarItemGroup.onExtraCallback((RVManifestLazyProxyManifest) obj, (Function0) obj2);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = IAuthTabCallback + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
