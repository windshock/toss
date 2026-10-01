package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class trimMetadataStringsTobugsnag_android_core_release {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trimMetadataStringsTobugsnag_android_core_release)) {
            int i4 = i3 + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((trimMetadataStringsTobugsnag_android_core_release) obj).onExtraCallback)) {
            return true;
        }
        int i6 = IAuthTabCallback + 55;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.onExtraCallback.hashCode();
            int i3 = 8 / 0;
        } else {
            iHashCode = this.onExtraCallback.hashCode();
        }
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MatchOutcome(captures=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public trimMetadataStringsTobugsnag_android_core_release(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = map;
    }

    public final Map<String, String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
