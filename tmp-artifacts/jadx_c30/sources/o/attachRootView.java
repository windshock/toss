package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class attachRootView {

    @SerializedName("userToken")
    private final String IAuthTabCallback;

    @SerializedName("w")
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof attachRootView)) {
            return false;
        }
        attachRootView attachrootview = (attachRootView) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, attachrootview.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, attachrootview.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "TokenInfo(userToken=" + this.IAuthTabCallback + ", w=" + this.onExtraCallbackWithResult + ")";
    }

    public attachRootView(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
    }
}
