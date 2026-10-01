package o;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1vSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Set<String> onNavigationEvent;
    private final Map<String, String> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1vSDK)) {
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AFe1vSDK aFe1vSDK = (AFe1vSDK) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, aFe1vSDK.onWarmupCompleted)) {
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, aFe1vSDK.onNavigationEvent)) {
            return true;
        }
        int i6 = onExtraCallback + 79;
        int i7 = i6 % 128;
        IAuthTabCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 97;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return i3 != 0 ? (iHashCode + 29) >> this.onNavigationEvent.hashCode() : (iHashCode * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesTubaRemoteVariables(values=" + this.onWarmupCompleted + ", confirmedKeys=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AFe1vSDK(@NotNull Map<String, String> map, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = map;
        this.onNavigationEvent = set;
    }

    public final Map<String, String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return map;
    }

    public final Set<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = this.onNavigationEvent;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }
}
