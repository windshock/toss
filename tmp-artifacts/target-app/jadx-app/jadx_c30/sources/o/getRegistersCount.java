package o;

import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRegistersCount {
    public static final int onNavigationEvent(@NotNull Random random, int i) {
        Intrinsics.checkNotNullParameter(random, BuildConfig.FLAVOR);
        return onExtraCallbackWithResult(random, 0, i);
    }

    public static final int onExtraCallbackWithResult(@NotNull Random random, int i, int i2) {
        Intrinsics.checkNotNullParameter(random, BuildConfig.FLAVOR);
        IAuthTabCallback(i, i2);
        return UInt.constructor-impl(random.onExtraCallback(i ^ PKIFailureInfo.systemUnavail, i2 ^ PKIFailureInfo.systemUnavail) ^ PKIFailureInfo.systemUnavail);
    }

    public static final void IAuthTabCallback(int i, int i2) {
        if (forceToEnd.onNavigationEvent(i2, i) <= 0) {
            throw new IllegalArgumentException(RandomKt.onWarmupCompleted(UInt.onNavigationEvent(i), UInt.onNavigationEvent(i2)).toString());
        }
    }
}
