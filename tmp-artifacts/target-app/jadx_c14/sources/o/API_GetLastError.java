package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class API_GetLastError extends toRealPath {
    private final onExtraCallback IAuthTabCallback;
    private final KeyBoardVisiblePoint onWarmupCompleted;

    public interface onExtraCallback {
        void IAuthTabCallback(long j);

        void onExtraCallback(long j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof API_GetLastError)) {
            return false;
        }
        API_GetLastError aPI_GetLastError = (API_GetLastError) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, aPI_GetLastError.IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, aPI_GetLastError.onWarmupCompleted);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
    }

    public long onWarmupCompleted() {
        return 605215212L;
    }

    public String toString() {
        return "TeensSavingBoxViewModel(navigator=" + this.IAuthTabCallback + ", account=" + this.onWarmupCompleted + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public API_GetLastError(@NotNull onExtraCallback onextracallback, @NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        super(toRealPath.onNavigationEvent.TEENS_SAVING_BOX);
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        this.IAuthTabCallback = onextracallback;
        this.onWarmupCompleted = keyBoardVisiblePoint;
    }

    public final void onNavigationEvent() {
        this.IAuthTabCallback.onExtraCallback(Long.parseLong(this.onWarmupCompleted.onExtraCallbackWithResult()));
    }

    public final void IAuthTabCallback() {
        this.IAuthTabCallback.IAuthTabCallback(Long.parseLong(this.onWarmupCompleted.onExtraCallbackWithResult()));
    }
}
