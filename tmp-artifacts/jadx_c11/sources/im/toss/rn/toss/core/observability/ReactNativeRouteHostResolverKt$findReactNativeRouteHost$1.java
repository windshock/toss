package im.toss.rn.toss.core.observability;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1 implements Function1<Fragment, Fragment> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1 onWarmupCompleted = new ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1();

    static {
        int i = onExtraCallback + 79;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        Fragment fragment = (Fragment) obj;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(fragment);
        }
        onWarmupCompleted(fragment);
        throw null;
    }

    public final Fragment onWarmupCompleted(Fragment fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return fragment.getParentFragment();
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        int i3 = 64 / 0;
        return fragment.getParentFragment();
    }
}
