package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactNativeHost {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("isUssCard")
    private final boolean isUssCard;

    @SerializedName("payToken")
    private final String payToken;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactNativeHost)) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ReactNativeHost reactNativeHost = (ReactNativeHost) obj;
        if (this.isUssCard != reactNativeHost.isUssCard) {
            return false;
        }
        if (Intrinsics.areEqual(this.payToken, reactNativeHost.payToken)) {
            return true;
        }
        int i6 = onNavigationEvent;
        int i7 = i6 + 19;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 121;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Boolean.hashCode(this.isUssCard) - 76) / this.payToken.hashCode() : (Boolean.hashCode(this.isUssCard) * 31) + this.payToken.hashCode();
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TmoneyPayTokenReq(isUssCard=" + this.isUssCard + ", payToken=" + this.payToken + ")";
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ReactNativeHost(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isUssCard = z;
        this.payToken = str;
    }
}
