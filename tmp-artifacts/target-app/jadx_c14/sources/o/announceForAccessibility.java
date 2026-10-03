package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class announceForAccessibility {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("answerable")
    private final boolean answerable;

    @SerializedName("popupMessage")
    private final String popupMessage;

    /* JADX WARN: Illegal instructions before constructor call */
    public announceForAccessibility() {
        String str = null;
        this(false, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof announceForAccessibility)) {
            return false;
        }
        announceForAccessibility announceforaccessibility = (announceForAccessibility) obj;
        if (this.answerable != announceforaccessibility.answerable) {
            int i3 = onWarmupCompleted + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.popupMessage, announceforaccessibility.popupMessage)) {
            return true;
        }
        int i5 = onNavigationEvent + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.answerable) * 31) + this.popupMessage.hashCode();
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CallAnswerable(answerable=" + this.answerable + ", popupMessage=" + this.popupMessage + ")";
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    public announceForAccessibility(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.answerable = z;
        this.popupMessage = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ announceForAccessibility(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        this(z, str);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.answerable;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.popupMessage;
        int i4 = i3 + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
