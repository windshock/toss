package o;

import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import kotlin.jvm.internal.Intrinsics;
import o.levelConversion;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkMagicOptions {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final levelConversion.onNavigationEvent onWarmupCompleted(@NotNull CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHighInterestComparisonResponse, "");
        levelConversion.onNavigationEvent onnavigationevent = new levelConversion.onNavigationEvent(creditHighInterestComparisonResponse);
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
