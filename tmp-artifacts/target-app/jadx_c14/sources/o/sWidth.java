package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sWidth {
    private final String IAuthTabCallback;
    private final sourceToViewX onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sWidth)) {
            return false;
        }
        sWidth swidth = (sWidth) obj;
        return this.onWarmupCompleted == swidth.onWarmupCompleted && Intrinsics.areEqual(this.IAuthTabCallback, swidth.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        String str = this.IAuthTabCallback;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GuestUnderFourteenFamilyCheckModel(type=" + this.onWarmupCompleted + ", reason=" + this.IAuthTabCallback + ")";
    }

    public sWidth(@NotNull sourceToViewX sourcetoviewx, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sourcetoviewx, "");
        this.onWarmupCompleted = sourcetoviewx;
        this.IAuthTabCallback = str;
    }

    public final sourceToViewX IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
