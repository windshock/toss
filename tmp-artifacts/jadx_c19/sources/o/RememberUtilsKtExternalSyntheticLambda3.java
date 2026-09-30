package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RememberUtilsKtExternalSyntheticLambda3<T> {
    private final String IAuthTabCallback;
    private final T onNavigationEvent;

    public RememberUtilsKtExternalSyntheticLambda3(T t, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = t;
        this.IAuthTabCallback = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RememberUtilsKtExternalSyntheticLambda3)) {
            return false;
        }
        RememberUtilsKtExternalSyntheticLambda3 rememberUtilsKtExternalSyntheticLambda3 = (RememberUtilsKtExternalSyntheticLambda3) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, rememberUtilsKtExternalSyntheticLambda3.IAuthTabCallback);
    }

    public int hashCode() {
        T t = this.onNavigationEvent;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final T onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "ResponseWithDate(data=" + this.onNavigationEvent + ", date=" + this.IAuthTabCallback + ')';
    }
}
