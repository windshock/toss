package im.toss.rn.toss.core.observability;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteHostResolverKt$findReactNativeRouteHost$$inlined$filterIsInstance$1 implements Function1<Object, Boolean> {
    public static final ReactNativeRouteHostResolverKt$findReactNativeRouteHost$$inlined$filterIsInstance$1 IAuthTabCallback = new ReactNativeRouteHostResolverKt$findReactNativeRouteHost$$inlined$filterIsInstance$1();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 25;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(obj);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return boolOnExtraCallback;
    }

    public final Boolean onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.reifiedOperationMarker(3, "T");
        Boolean boolValueOf = Boolean.valueOf(Objects.nonNull(obj));
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return boolValueOf;
    }
}
