package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableActivityMonitorInitOtherFloatOpt {
    private static int asBinder = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final Boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableActivityMonitorInitOtherFloatOpt)) {
            int i2 = asBinder + 61;
            onTransact = i2 % 128;
            return i2 % 2 != 0;
        }
        enableActivityMonitorInitOtherFloatOpt enableactivitymonitorinitotherfloatopt = (enableActivityMonitorInitOtherFloatOpt) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, enableactivitymonitorinitotherfloatopt.IAuthTabCallback)) {
            int i3 = onTransact + 11;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, enableactivitymonitorinitotherfloatopt.onWarmupCompleted)) {
            int i5 = onTransact + 43;
            asBinder = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enableactivitymonitorinitotherfloatopt.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, enableactivitymonitorinitotherfloatopt.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, enableactivitymonitorinitotherfloatopt.onExtraCallback)) {
            int i6 = onTransact + 55;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = asBinder + 47;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onWarmupCompleted.hashCode();
        String str = this.onExtraCallbackWithResult;
        int iHashCode5 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onTransact + 105;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        }
        String str2 = this.onNavigationEvent;
        if (str2 == null) {
            int i4 = asBinder + 61;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Boolean bool = this.onExtraCallback;
        if (bool != null) {
            int i6 = onTransact + 29;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                bool.hashCode();
                throw null;
            }
            iHashCode5 = bool.hashCode();
        }
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScoreReasonBanner(title=" + this.IAuthTabCallback + ", linkUrl=" + this.onWarmupCompleted + ", badgeText=" + this.onExtraCallbackWithResult + ", iconUrl=" + this.onNavigationEvent + ", isCompleted=" + this.onExtraCallback + ")";
        int i2 = asBinder + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableActivityMonitorInitOtherFloatOpt(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = str4;
        this.onExtraCallback = bool;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 59;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }
}
