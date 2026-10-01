package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getPropagation {
    public static final onNavigationEvent onExtraCallback = new onNavigationEvent(null);

    @SerializedName("BAL_EP")
    private final String IAuthTabCallback;

    @SerializedName("SIGN3")
    private final String onExtraCallbackWithResult;

    public static final class onNavigationEvent {
        private onNavigationEvent() {
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final getPropagation onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strSubstring = str.substring(0, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(8, 16);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return new getPropagation(strSubstring, strSubstring2);
        }
    }

    public getPropagation(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPropagation)) {
            return false;
        }
        getPropagation getpropagation = (getPropagation) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, getpropagation.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getpropagation.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "KorailCompleteCreditResponse(BAL_EP=" + this.IAuthTabCallback + ", SIGN3=" + this.onExtraCallbackWithResult + ')';
    }
}
