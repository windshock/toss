package o;

import android.content.res.Configuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class readIntokhttp {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final pin onNavigationEvent(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(configuration, "");
            int i3 = configuration.screenWidthDp;
            pin.FoldableExpanded.getSize();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(configuration, "");
        int i4 = configuration.screenWidthDp;
        pin pinVar = pin.FoldableExpanded;
        if (i4 < pinVar.getSize()) {
            return pin.Narrow;
        }
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return pinVar;
    }

    public static final boolean IAuthTabCallback(@NotNull Configuration configuration) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(configuration, "");
            return CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(configuration.fontScale, onNavigationEvent(configuration));
        }
        Intrinsics.checkNotNullParameter(configuration, "");
        CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(configuration.fontScale, onNavigationEvent(configuration));
        throw null;
    }

    public static final boolean onWarmupCompleted(@NotNull Configuration configuration) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        boolean zOnExtraCallback = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback(configuration.fontScale, onNavigationEvent(configuration));
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean onExtraCallback(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        if ((configuration.uiMode & 48) == 32) {
            return true;
        }
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }
}
