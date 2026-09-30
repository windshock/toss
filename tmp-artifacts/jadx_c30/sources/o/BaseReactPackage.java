package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BaseReactPackage {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final boolean isTossBankAccountUser;
    private final boolean isTossBankCardUser;
    private final boolean isUssCardUser;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseReactPackage)) {
            return false;
        }
        BaseReactPackage baseReactPackage = (BaseReactPackage) obj;
        if (this.isTossBankAccountUser != baseReactPackage.isTossBankAccountUser) {
            int i4 = i3 + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.isTossBankCardUser == baseReactPackage.isTossBankCardUser) {
            return this.isUssCardUser == baseReactPackage.isUssCardUser;
        }
        int i5 = i3 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isTossBankAccountUser);
        return i3 != 0 ? (((iHashCode + 32) - Boolean.hashCode(this.isTossBankCardUser)) << 59) << Boolean.hashCode(this.isUssCardUser) : (((iHashCode * 31) + Boolean.hashCode(this.isTossBankCardUser)) * 31) + Boolean.hashCode(this.isUssCardUser);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardMetricsResponse(isTossBankAccountUser=" + this.isTossBankAccountUser + ", isTossBankCardUser=" + this.isTossBankCardUser + ", isUssCardUser=" + this.isUssCardUser + ")";
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
