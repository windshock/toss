package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceLandmark implements ALCFaceLivenessMode {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final char onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ALCFaceLandmark)) {
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != ((ALCFaceLandmark) obj).onExtraCallbackWithResult) {
            int i6 = onWarmupCompleted + 95;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        int i7 = IAuthTabCallback + 19;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Character.hashCode(this.onExtraCallbackWithResult);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return iHashCode;
    }

    public ALCFaceLandmark(char c) {
        this.onExtraCallbackWithResult = c;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(this.onExtraCallbackWithResult);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return strValueOf;
    }
}
