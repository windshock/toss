package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2a {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2a)) {
            return false;
        }
        r2a r2aVar = (r2a) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r2aVar.IAuthTabCallback)) {
            return false;
        }
        if (this.onWarmupCompleted == r2aVar.onWarmupCompleted) {
            return true;
        }
        int i3 = onNavigationEvent + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 == 0 ? (iHashCode - 20) * Boolean.hashCode(this.onWarmupCompleted) : (iHashCode * 31) + Boolean.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewBadgeIcon(iconUrl=" + this.IAuthTabCallback + ", isRectangle=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r2a(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r2a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        this(str, z);
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            str = this.IAuthTabCallback;
            int i4 = 84 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i3 + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return z;
    }
}
