package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setDoNotSell {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final boolean onExtraCallbackWithResult(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        if (getspecialfeatureoptinstatus != getSpecialFeatureOptInStatus.Dark) {
            return false;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return true;
    }
}
