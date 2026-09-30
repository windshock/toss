package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final clearTrackedAxonEvents onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM)) {
            int i5 = i2 + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM r8lambda005rfy1st6u6pju5oz0sbz8lwm = (r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r8lambda005rfy1st6u6pju5oz0sbz8lwm.IAuthTabCallback) || this.onWarmupCompleted != r8lambda005rfy1st6u6pju5oz0sbz8lwm.onWarmupCompleted) {
            return false;
        }
        if (this.onExtraCallbackWithResult == r8lambda005rfy1st6u6pju5oz0sbz8lwm.onExtraCallbackWithResult) {
            return true;
        }
        int i7 = onExtraCallback + 67;
        onNavigationEvent = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.IAuthTabCallback.hashCode() >>> 102) + this.onWarmupCompleted.hashCode()) / 118) >>> Integer.hashCode(this.onExtraCallbackWithResult) : (((this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SimStateInfo(number=" + this.IAuthTabCallback + ", state=" + this.onWarmupCompleted + ", id=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return str;
    }

    public r8lambda005RFY1ST6U6pJu5OZ0sBz8LWM(@NotNull String str, @NotNull clearTrackedAxonEvents cleartrackedaxonevents, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cleartrackedaxonevents, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = cleartrackedaxonevents;
        this.onExtraCallbackWithResult = i;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final clearTrackedAxonEvents IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        clearTrackedAxonEvents cleartrackedaxonevents = this.onWarmupCompleted;
        int i5 = i2 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return cleartrackedaxonevents;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
