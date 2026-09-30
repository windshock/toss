package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdauySRm1mZP8abhbkrYCVyutMa2H4 implements unload {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdauySRm1mZP8abhbkrYCVyutMa2H4) || !Intrinsics.areEqual(this.IAuthTabCallback, ((r8lambdauySRm1mZP8abhbkrYCVyutMa2H4) obj).IAuthTabCallback)) {
            return false;
        }
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.hashCode();
            throw null;
        }
        int iHashCode = this.IAuthTabCallback.hashCode();
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsMenuV1CheckBox(title=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.unload
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
