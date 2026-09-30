package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setBannerType {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);

    @SerializedName("sign3")
    private final String onExtraCallbackWithResult;

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setBannerType onWarmupCompleted(String str) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            String strSubstring = str.substring(0, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            return new setBannerType(strSubstring);
        }
    }

    public setBannerType(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setBannerType) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((setBannerType) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public final String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "PurchaseCardResponse(sign3=" + this.onExtraCallbackWithResult + ')';
    }
}
