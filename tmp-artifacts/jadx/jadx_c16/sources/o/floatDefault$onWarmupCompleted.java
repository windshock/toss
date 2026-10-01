package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class floatDefault$onWarmupCompleted implements floatDefault {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof floatDefault$onWarmupCompleted)) {
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((floatDefault$onWarmupCompleted) obj).onExtraCallback)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RouteToMoneySprinkle(scheme=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public floatDefault$onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
