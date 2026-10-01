package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class initPlatForm {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("result")
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof initPlatForm)) {
            int i3 = onNavigationEvent + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((initPlatForm) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i5 = onNavigationEvent + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BLELocationTurnOnResult(result=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public initPlatForm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }
}
