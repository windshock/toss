package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RotationVectorAbility2$IAuthTabCallback implements RotationVectorAbility2 {
    public static final RotationVectorAbility2$IAuthTabCallback IAuthTabCallback = new RotationVectorAbility2$IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 31;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj instanceof RotationVectorAbility2$IAuthTabCallback) {
            return true;
        }
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return 606980367;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return "ThumbnailBannerWithoutSdk";
    }

    private RotationVectorAbility2$IAuthTabCallback() {
    }
}
