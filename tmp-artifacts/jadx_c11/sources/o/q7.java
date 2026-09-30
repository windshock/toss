package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q7 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Map<String, String> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 111;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (obj instanceof q7) {
            return Intrinsics.areEqual(this.onNavigationEvent, ((q7) obj).onNavigationEvent);
        }
        int i6 = i2 + 99;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 15;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.onNavigationEvent;
        if (i3 == 0) {
            return map.hashCode();
        }
        map.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringSummaryKey(dimensions=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public q7(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onNavigationEvent = map;
    }

    public final Map<String, String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.onNavigationEvent;
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
