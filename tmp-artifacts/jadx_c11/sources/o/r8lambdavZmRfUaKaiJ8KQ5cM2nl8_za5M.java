package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final int onExtraCallback;
    private final List<getStreamSharingChildren> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M)) {
            int i3 = onNavigationEvent + 43;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m = (r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M) obj;
        if (this.onWarmupCompleted != r8lambdavzmrfuakaij8kq5cm2nl8_za5m.onWarmupCompleted) {
            return false;
        }
        if (this.onExtraCallback != r8lambdavzmrfuakaij8kq5cm2nl8_za5m.onExtraCallback) {
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdavzmrfuakaij8kq5cm2nl8_za5m.onExtraCallbackWithResult)) {
            return false;
        }
        int i6 = onNavigationEvent + 29;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SlotMeasureResults(totalWidth=" + this.onWarmupCompleted + ", maxHeight=" + this.onExtraCallback + ", placeables=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return str;
    }

    public r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M(int i, int i2, @NotNull List<? extends getStreamSharingChildren> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = i;
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = list;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 93;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i3 + 51;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final List<getStreamSharingChildren> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
