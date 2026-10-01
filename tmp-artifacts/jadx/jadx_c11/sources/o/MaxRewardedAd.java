package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAd extends deprecated_connectionSpecs {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final boolean onWarmupCompleted;

    public MaxRewardedAd(@Nullable Float f, @Nullable Float f2, boolean z) {
        super(f, f2);
        this.onWarmupCompleted = z;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }
}
