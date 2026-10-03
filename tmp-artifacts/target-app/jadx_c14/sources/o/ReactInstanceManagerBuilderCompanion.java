package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerBuilderCompanion {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("ci")
    private final String ci;

    @SerializedName("id")
    private final String userId;

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactInstanceManagerBuilderCompanion() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof ReactInstanceManagerBuilderCompanion)) {
            return false;
        }
        ReactInstanceManagerBuilderCompanion reactInstanceManagerBuilderCompanion = (ReactInstanceManagerBuilderCompanion) obj;
        if (!Intrinsics.areEqual(this.ci, reactInstanceManagerBuilderCompanion.ci)) {
            int i3 = onExtraCallback + 31;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.userId, reactInstanceManagerBuilderCompanion.userId)) {
            return true;
        }
        int i4 = onNavigationEvent + 5;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 123;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 78 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.ci.hashCode() + 13) % this.userId.hashCode() : (this.ci.hashCode() * 31) + this.userId.hashCode();
        int i3 = onNavigationEvent + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TmoneyUser(ci=" + this.ci + ", userId=" + this.userId + ")";
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactInstanceManagerBuilderCompanion(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ci = str;
        this.userId = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReactInstanceManagerBuilderCompanion(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ci;
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.userId;
            int i4 = 80 / 0;
        } else {
            str = this.userId;
        }
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
