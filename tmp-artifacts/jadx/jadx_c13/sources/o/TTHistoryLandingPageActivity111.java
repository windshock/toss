package o;

import kotlin.jvm.internal.Intrinsics;
import okio.RealBufferedSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity111 {
    public static final long onExtraCallback(@NotNull RealBufferedSource realBufferedSource, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i, int i2, long j, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        long j3 = i2;
        TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseLandingPageActivity.access100(), i, j3);
        if (realBufferedSource.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        long jMax = j;
        while (true) {
            long jOnExtraCallback = TTHistoryActivity711.onExtraCallback(realBufferedSource.IAuthTabCallback, tTBaseLandingPageActivity, jMax, j2, i, i2);
            if (jOnExtraCallback != -1) {
                return jOnExtraCallback;
            }
            long jICustomTabsCallbackDefault = (realBufferedSource.IAuthTabCallback.ICustomTabsCallbackDefault() - j3) + 1;
            if (jICustomTabsCallbackDefault >= j2 || !IAuthTabCallback(realBufferedSource.IAuthTabCallback, tTBaseLandingPageActivity, i, i2, jMax, j2) || realBufferedSource.onNavigationEvent.read(realBufferedSource.IAuthTabCallback, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, jICustomTabsCallbackDefault);
        }
    }

    private static final boolean IAuthTabCallback(TTBaseActivity tTBaseActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity, int i, int i2, long j, long j2) {
        if (tTBaseActivity.ICustomTabsCallbackDefault() < j2) {
            return true;
        }
        int iMax = (int) Math.max(1L, (tTBaseActivity.ICustomTabsCallbackDefault() - j2) + 1);
        int iMin = ((int) Math.min(i2, (tTBaseActivity.ICustomTabsCallbackDefault() - j) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        while (!tTBaseActivity.onWarmupCompleted(tTBaseActivity.ICustomTabsCallbackDefault() - iMin, tTBaseLandingPageActivity, i, iMin)) {
            if (iMin == iMax) {
                return false;
            }
            iMin--;
        }
        return true;
    }
}
