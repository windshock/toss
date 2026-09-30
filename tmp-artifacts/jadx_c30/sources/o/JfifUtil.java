package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class JfifUtil {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("code")
    private final String code;

    @SerializedName("regex")
    private final ArrayList<String> regex;

    @SerializedName("type")
    private final String type;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JfifUtil)) {
            return false;
        }
        JfifUtil jfifUtil = (JfifUtil) obj;
        if (!Intrinsics.areEqual(this.type, jfifUtil.type)) {
            int i3 = IAuthTabCallback + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.code, jfifUtil.code)) {
            if (Intrinsics.areEqual(this.regex, jfifUtil.regex)) {
                return true;
            }
            int i5 = IAuthTabCallback + 49;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = onWarmupCompleted + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.type.hashCode() * 31) + this.code.hashCode()) * 31) + this.regex.hashCode();
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScrapingResourceBlacklistItem(type=" + this.type + ", code=" + this.code + ", regex=" + this.regex + ")";
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
