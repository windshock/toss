package o;

import java.util.List;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdabIBb941MT6gH3Q_2N6D4u7bL1ic {
    private static int IAuthTabCallback = 0;
    public static final int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @Inject
    public r8lambdabIBb941MT6gH3Q_2N6D4u7bL1ic() {
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(r8lambdabIBb941MT6gH3Q_2N6D4u7bL1ic r8lambdabibb941mt6gh3q_2n6d4u7bl1ic, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 35;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return r8lambdabibb941mt6gh3q_2n6d4u7bl1ic.onNavigationEvent(str, z, access13800Var);
    }

    public final Object onNavigationEvent(@NotNull String str, boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = playerPaused.IAuthTabCallback(playerPaused.Companion.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()), str, z, (List) null, false, access13800Var, 12, (Object) null);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return objIAuthTabCallback;
    }
}
