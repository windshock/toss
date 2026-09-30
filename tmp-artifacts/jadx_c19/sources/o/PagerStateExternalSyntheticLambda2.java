package o;

import android.content.res.ColorStateList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateExternalSyntheticLambda2 {
    private final ColorStateList onExtraCallback;
    private final ColorStateList onWarmupCompleted;

    public final ColorStateList IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerStateExternalSyntheticLambda2)) {
            return false;
        }
        PagerStateExternalSyntheticLambda2 pagerStateExternalSyntheticLambda2 = (PagerStateExternalSyntheticLambda2) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, pagerStateExternalSyntheticLambda2.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, pagerStateExternalSyntheticLambda2.onExtraCallback);
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public final ColorStateList onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "DayNightColorStateList(day=" + this.onWarmupCompleted + ", night=" + this.onExtraCallback + ')';
    }

    public PagerStateExternalSyntheticLambda2(@NotNull ColorStateList colorStateList, @NotNull ColorStateList colorStateList2) {
        this.onWarmupCompleted = colorStateList;
        this.onExtraCallback = colorStateList2;
    }
}
