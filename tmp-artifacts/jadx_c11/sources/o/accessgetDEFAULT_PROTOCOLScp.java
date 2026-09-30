package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetDEFAULT_PROTOCOLScp implements deprecated_followRedirects {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetDEFAULT_PROTOCOLScp) {
            if (this.onExtraCallbackWithResult == ((accessgetDEFAULT_PROTOCOLScp) obj).onExtraCallbackWithResult) {
                return true;
            }
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onWarmupCompleted + 99;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DrawableImage(id=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public accessgetDEFAULT_PROTOCOLScp(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 29;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
