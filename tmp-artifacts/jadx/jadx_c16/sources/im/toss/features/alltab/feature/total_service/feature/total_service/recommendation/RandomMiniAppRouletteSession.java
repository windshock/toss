package im.toss.features.alltab.feature.total_service.feature.total_service.recommendation;

import im.toss.features.alltab.feature.total_service.feature.common.random_miniapp.RandomMiniAppRecommendationState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RandomMiniAppRouletteSession {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final RandomMiniAppRecommendationState onExtraCallback;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RandomMiniAppRouletteSession)) {
            return false;
        }
        RandomMiniAppRouletteSession randomMiniAppRouletteSession = (RandomMiniAppRouletteSession) obj;
        if (this.onWarmupCompleted != randomMiniAppRouletteSession.onWarmupCompleted) {
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, randomMiniAppRouletteSession.onExtraCallback)) {
            int i6 = IAuthTabCallback + 27;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = onNavigationEvent + 49;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 53 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.onWarmupCompleted) * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RandomMiniAppRouletteSession(sessionId=" + this.onWarmupCompleted + ", state=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RandomMiniAppRouletteSession(long j, @NotNull RandomMiniAppRecommendationState randomMiniAppRecommendationState) {
        Intrinsics.checkNotNullParameter(randomMiniAppRecommendationState, "");
        this.onWarmupCompleted = j;
        this.onExtraCallback = randomMiniAppRecommendationState;
    }

    public final RandomMiniAppRecommendationState onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        RandomMiniAppRecommendationState randomMiniAppRecommendationState = this.onExtraCallback;
        int i5 = i2 + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return randomMiniAppRecommendationState;
    }
}
