package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLaunching {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int IAuthTabCallback;
    private final int onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof setLaunching)) {
            return false;
        }
        setLaunching setlaunching = (setLaunching) obj;
        if (this.onExtraCallback != setlaunching.onExtraCallback) {
            return false;
        }
        if (this.IAuthTabCallback == setlaunching.IAuthTabCallback) {
            return true;
        }
        int i3 = onNavigationEvent + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.IAuthTabCallback);
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnderlayStackRevealGeometry(contentBottomOffsetPx=" + this.onExtraCallback + ", motionTranslationYPx=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setLaunching(int i, int i2) {
        this.onExtraCallback = i;
        this.IAuthTabCallback = i2;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
