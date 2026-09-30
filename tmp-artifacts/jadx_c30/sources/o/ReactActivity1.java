package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactActivity1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final boolean isConsented;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactActivity1)) {
            return false;
        }
        if (this.isConsented == ((ReactActivity1) obj).isConsented) {
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallbackWithResult + 13;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 37;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isConsented);
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensLegalConsentNeededResponse(isConsented=" + this.isConsented + ")";
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
