package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1pSDK {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final <T> AFh1oSDK<T> IAuthTabCallback(@NotNull Function0<? extends ReadOnlyProperty<Object, ? extends T>> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        AFh1oSDK<T> aFh1oSDK = new AFh1oSDK<>(function0);
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return aFh1oSDK;
    }
}
