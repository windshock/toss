package o;

import kotlin.jvm.internal.Intrinsics;
import o.getTileModeY;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1nSDK {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ setRubIn IAuthTabCallback(IAnimation iAnimation, findResAndMsg findresandmsg, Object obj, getTileModeY gettilemodey, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 95;
            IAuthTabCallback = i6 % 128;
            gettilemodey = i6 % 2 == 0 ? getTileModeY.onWarmupCompleted.onExtraCallback(getTileModeY.Companion, 500L, 1L, 3, null) : getTileModeY.onWarmupCompleted.onExtraCallback(getTileModeY.Companion, 500L, 0L, 2, null);
            int i7 = IAuthTabCallback + 21;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return onExtraCallback(iAnimation, findresandmsg, obj, gettilemodey);
    }

    public static final <T> setRubIn<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, T t, @NotNull getTileModeY gettilemodey) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAnimation, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(gettilemodey, "");
        setRubIn<T> setrubinIAuthTabCallback = ycxycx.IAuthTabCallback(iAnimation, findresandmsg, gettilemodey, t);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return setrubinIAuthTabCallback;
    }
}
