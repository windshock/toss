package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeSoundManagerSpec implements supportedLocalesOf {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final boolean hidden;
    private final List<String> sourceIds;
    private final String timelineTime;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof NativeSoundManagerSpec)) {
            return false;
        }
        NativeSoundManagerSpec nativeSoundManagerSpec = (NativeSoundManagerSpec) obj;
        if (!Intrinsics.areEqual(this.sourceIds, nativeSoundManagerSpec.sourceIds)) {
            return false;
        }
        if (Intrinsics.areEqual(this.timelineTime, nativeSoundManagerSpec.timelineTime)) {
            return this.hidden == nativeSoundManagerSpec.hidden;
        }
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.sourceIds.hashCode();
        return i3 == 0 ? (((iHashCode >> 44) % this.timelineTime.hashCode()) >> 15) * Boolean.hashCode(this.hidden) : (((iHashCode * 31) + this.timelineTime.hashCode()) * 31) + Boolean.hashCode(this.hidden);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HiddenSet(sourceIds=" + this.sourceIds + ", timelineTime=" + this.timelineTime + ", hidden=" + this.hidden + ")";
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NativeSoundManagerSpec(@NotNull List<String> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceIds = list;
        this.timelineTime = str;
        this.hidden = z;
    }
}
