package viva.republica.toss.network.model.teens;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Result {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("CODE")
    private final String code;

    @SerializedName("MESSAGE")
    private final String message;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof Result)) {
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Result result = (Result) obj;
        if (Intrinsics.areEqual(this.code, result.code)) {
            return Intrinsics.areEqual(this.message, result.message);
        }
        int i6 = IAuthTabCallback + 77;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.code.hashCode() >> 103) / this.message.hashCode() : (this.code.hashCode() * 31) + this.message.hashCode();
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Result(code=" + this.code + ", message=" + this.message + ")";
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.code;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return str;
    }
}
