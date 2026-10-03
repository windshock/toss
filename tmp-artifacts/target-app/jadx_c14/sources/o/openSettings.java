package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class openSettings {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String description;
    private final deleteTimer icon;

    /* JADX WARN: Multi-variable type inference failed */
    public openSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof openSettings)) {
            int i3 = onWarmupCompleted + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        openSettings opensettings = (openSettings) obj;
        if (!Intrinsics.areEqual(this.description, opensettings.description)) {
            int i5 = onWarmupCompleted + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.icon, opensettings.icon)) {
            return true;
        }
        int i7 = onWarmupCompleted + 69;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.description.hashCode() * 31) + this.icon.hashCode();
        int i4 = onWarmupCompleted + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountOverviewFooter(description=" + this.description + ", icon=" + this.icon + ")";
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public openSettings(@NotNull String str, @NotNull deleteTimer deletetimer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deletetimer, "");
        this.description = str;
        this.icon = deletetimer;
    }

    public /* synthetic */ openSettings(String str, deleteTimer deletetimer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 98 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            deletetimer = new deleteTimer(null, null, null, null, 0, 0, 0, 127, null);
            int i5 = onWarmupCompleted + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(str, deletetimer);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final deleteTimer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        deleteTimer deletetimer = this.icon;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return deletetimer;
    }
}
