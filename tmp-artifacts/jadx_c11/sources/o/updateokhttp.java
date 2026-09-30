package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class updateokhttp {
    private static int IAuthTabCallback = 0;
    public static final updateokhttp onExtraCallback = new updateokhttp();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 39;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private updateokhttp() {
    }

    public final Integer onExtraCallbackWithResult(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, @NotNull String str) throws NoWhenBranchMatchedException {
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
            Intrinsics.checkNotNullParameter(str, "");
            CacheCompanion.onNavigationEvent(getspecialfeatureoptinstatus, str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Integer numOnNavigationEvent = CacheCompanion.onNavigationEvent(getspecialfeatureoptinstatus, str);
        if (numOnNavigationEvent != null) {
            return numOnNavigationEvent;
        }
        CipherSuiteCompanion cipherSuiteCompanion = urls.onExtraCallback().get(str);
        if (cipherSuiteCompanion == null) {
            return null;
        }
        if (setDoNotSell.onExtraCallbackWithResult(getspecialfeatureoptinstatus)) {
            int i3 = IAuthTabCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iIAuthTabCallback = cipherSuiteCompanion.onExtraCallbackWithResult();
        } else {
            iIAuthTabCallback = cipherSuiteCompanion.IAuthTabCallback();
        }
        return Integer.valueOf(iIAuthTabCallback);
    }

    public final Integer onWarmupCompleted(@NotNull String str, @NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(getspecialfeatureoptinstatus, str);
        if (numOnExtraCallbackWithResult != null) {
            return numOnExtraCallbackWithResult;
        }
        Integer numOnWarmupCompleted = CacheCompanion.onWarmupCompleted(str);
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return numOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
