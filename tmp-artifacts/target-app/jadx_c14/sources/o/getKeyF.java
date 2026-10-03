package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyF extends toRealPath {
    private final KeyBoardVisiblePoint onExtraCallback;
    private final onExtraCallback onWarmupCompleted;

    public interface onExtraCallback {
        void ICustomTabsServiceStub();

        void onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeyF)) {
            return false;
        }
        getKeyF getkeyf = (getKeyF) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, getkeyf.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, getkeyf.onExtraCallback);
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public long onWarmupCompleted() {
        return 1083922552L;
    }

    public String toString() {
        return "SavingBoxViewModel(navigator=" + this.onWarmupCompleted + ", account=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getKeyF(@NotNull onExtraCallback onextracallback, @NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        super(toRealPath.onNavigationEvent.SAVING_BOX);
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallback = keyBoardVisiblePoint;
    }

    public final void onNavigationEvent() {
        this.onWarmupCompleted.ICustomTabsServiceStub();
    }

    public final void IAuthTabCallback() {
        this.onWarmupCompleted.onExtraCallbackWithResult(this.onExtraCallback);
    }
}
