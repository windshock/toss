package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setLegacyVisibilityHandlingEnabled {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final boolean allowForeignPayment;
    private final boolean forbidDcc;
    private final long userNo;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLegacyVisibilityHandlingEnabled)) {
            return false;
        }
        setLegacyVisibilityHandlingEnabled setlegacyvisibilityhandlingenabled = (setLegacyVisibilityHandlingEnabled) obj;
        if (this.userNo != setlegacyvisibilityhandlingenabled.userNo) {
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.allowForeignPayment != setlegacyvisibilityhandlingenabled.allowForeignPayment) {
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.forbidDcc == setlegacyvisibilityhandlingenabled.forbidDcc) {
            return true;
        }
        int i5 = onNavigationEvent + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.userNo) * 31) + Boolean.hashCode(this.allowForeignPayment)) * 31) + Boolean.hashCode(this.forbidDcc);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserCardConfig(userNo=" + this.userNo + ", allowForeignPayment=" + this.allowForeignPayment + ", forbidDcc=" + this.forbidDcc + ")";
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return str;
    }
}
