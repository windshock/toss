package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadNextAdForZoneId {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Set<loadNextAdForAdToken> onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loadNextAdForZoneId)) {
            return false;
        }
        loadNextAdForZoneId loadnextadforzoneid = (loadNextAdForZoneId) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, loadnextadforzoneid.onWarmupCompleted)) {
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, loadnextadforzoneid.onExtraCallbackWithResult)) {
            return true;
        }
        int i6 = IAuthTabCallback + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return i3 == 0 ? (iHashCode + 47) >>> this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SanitizeResult(text=" + this.onWarmupCompleted + ", detectedPiiTypes=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public loadNextAdForZoneId(@NotNull String str, @NotNull Set<? extends loadNextAdForAdToken> set) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = set;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Set<loadNextAdForAdToken> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Set<loadNextAdForAdToken> set = this.onExtraCallbackWithResult;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return set;
    }
}
