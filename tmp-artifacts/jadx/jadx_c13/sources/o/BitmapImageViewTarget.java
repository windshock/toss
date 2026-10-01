package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface BitmapImageViewTarget extends UpdatePackagePackage {
    void onExtraCallbackWithResult(@Nullable Throwable th);

    public static final class onNavigationEvent implements BitmapImageViewTarget {
        private final Function1<Throwable, Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull Function1<? super Throwable, Unit> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        @Override // o.BitmapImageViewTarget
        public void onExtraCallbackWithResult(@Nullable Throwable th) {
            this.onExtraCallbackWithResult.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + getResCount.IAuthTabCallback(this.onExtraCallbackWithResult) + '@' + getResCount.onExtraCallbackWithResult(this) + ']';
        }
    }
}
