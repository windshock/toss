package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ignoreAppPermission$onWarmupCompleted extends ignoreAppPermission {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ignoreAppPermission$onWarmupCompleted)) {
            int i6 = i4 + 23;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.IAuthTabCallback == ((ignoreAppPermission$onWarmupCompleted) obj).IAuthTabCallback) {
            return true;
        }
        int i7 = i2 + 23;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IAuthTabCallback);
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowToast(stringResId=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ignoreAppPermission$onWarmupCompleted(int i) {
        super((DefaultConstructorMarker) null);
        this.IAuthTabCallback = i;
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            i = this.IAuthTabCallback;
            int i5 = 72 / 0;
        } else {
            i = this.IAuthTabCallback;
        }
        int i6 = i4 + 115;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }
}
