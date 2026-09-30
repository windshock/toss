package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactRootView {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("hidden")
    private boolean hidden;

    @SerializedName("sourceIds")
    private List<String> sourceIds;

    @SerializedName("timelineTime")
    private String timelineTime;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 121;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof ReactRootView)) {
            return false;
        }
        ReactRootView reactRootView = (ReactRootView) obj;
        if (!Intrinsics.areEqual(this.sourceIds, reactRootView.sourceIds)) {
            int i6 = IAuthTabCallback + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.timelineTime, reactRootView.timelineTime)) {
            return false;
        }
        if (this.hidden == reactRootView.hidden) {
            return true;
        }
        int i8 = onNavigationEvent + 83;
        IAuthTabCallback = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.sourceIds.hashCode() * 31) + this.timelineTime.hashCode()) * 31) + Boolean.hashCode(this.hidden);
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimelineTransactionHiddenReqItem(sourceIds=" + this.sourceIds + ", timelineTime=" + this.timelineTime + ", hidden=" + this.hidden + ")";
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
