package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class findStoragePaths extends toRealPath {
    private final swapLeftAndRightInRTL onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof findStoragePaths) && Intrinsics.areEqual(this.onExtraCallback, ((findStoragePaths) obj).onExtraCallback);
    }

    public int hashCode() {
        swapLeftAndRightInRTL swapleftandrightinrtl = this.onExtraCallback;
        if (swapleftandrightinrtl == null) {
            return 0;
        }
        return swapleftandrightinrtl.hashCode();
    }

    public long onWarmupCompleted() {
        return -247238836L;
    }

    public String toString() {
        return "HenemSavingBoxViewModel(henemBox=" + this.onExtraCallback + ")";
    }

    public final swapLeftAndRightInRTL onNavigationEvent() {
        return this.onExtraCallback;
    }

    public findStoragePaths(@Nullable swapLeftAndRightInRTL swapleftandrightinrtl) {
        super(toRealPath.onNavigationEvent.TEENS_HENEM_BOX);
        this.onExtraCallback = swapleftandrightinrtl;
    }
}
