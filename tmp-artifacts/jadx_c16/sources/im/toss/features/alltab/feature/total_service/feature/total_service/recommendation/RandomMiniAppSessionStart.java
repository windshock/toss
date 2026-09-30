package im.toss.features.alltab.feature.total_service.feature.total_service.recommendation;

import im.toss.features.alltab.feature.total_service.feature.common.random_miniapp.RandomMiniAppRecommendationState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RandomMiniAppSessionStart {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final RandomMiniAppRecommendationState IAuthTabCallback;
    private final long onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof RandomMiniAppSessionStart)) {
            return false;
        }
        RandomMiniAppSessionStart randomMiniAppSessionStart = (RandomMiniAppSessionStart) obj;
        if (this.onNavigationEvent != randomMiniAppSessionStart.onNavigationEvent) {
            int i7 = onExtraCallbackWithResult + 57;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, randomMiniAppSessionStart.IAuthTabCallback)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 71;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.onNavigationEvent) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RandomMiniAppSessionStart(sessionId=" + this.onNavigationEvent + ", state=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RandomMiniAppSessionStart(long j, @NotNull RandomMiniAppRecommendationState randomMiniAppRecommendationState) {
        Intrinsics.checkNotNullParameter(randomMiniAppRecommendationState, "");
        this.onNavigationEvent = j;
        this.IAuthTabCallback = randomMiniAppRecommendationState;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return j;
    }

    public final RandomMiniAppRecommendationState onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }
}
