package o;

import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBaseURL {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final int onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final TdsToastV1.onNavigationEvent onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setBaseURL)) {
            return false;
        }
        setBaseURL setbaseurl = (setBaseURL) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, setbaseurl.onWarmupCompleted)) {
            int i4 = IAuthTabCallback + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, setbaseurl.onExtraCallbackWithResult)) {
            return this.onExtraCallback == setbaseurl.onExtraCallback;
        }
        int i6 = IAuthTabCallback + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
      0x0028: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v5 java.lang.Integer) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Integer num;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.onWarmupCompleted.hashCode();
            num = this.onExtraCallbackWithResult;
            int i3 = 92 / 0;
            if (num != null) {
                iHashCode2 = num.hashCode();
                int i4 = onNavigationEvent + 69;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 4;
                }
            }
        } else {
            iHashCode = this.onWarmupCompleted.hashCode();
            num = this.onExtraCallbackWithResult;
            if (num != null) {
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + Integer.hashCode(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DelayedTdsToastV1Event(builder=" + this.onWarmupCompleted + ", durationMillis=" + this.onExtraCallbackWithResult + ", toastMode=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public setBaseURL(@NotNull TdsToastV1.onNavigationEvent onnavigationevent, @Nullable Integer num, int i) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onWarmupCompleted = onnavigationevent;
        this.onExtraCallbackWithResult = num;
        this.onExtraCallback = i;
    }

    public final TdsToastV1.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        TdsToastV1.onNavigationEvent onnavigationevent = this.onWarmupCompleted;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int i5 = i3 + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i3 + 93;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
