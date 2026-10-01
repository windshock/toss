package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class destruct {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String scheme;
    private final String socketPushId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof destruct)) {
            return false;
        }
        destruct destructVar = (destruct) obj;
        if (!Intrinsics.areEqual(this.scheme, destructVar.scheme)) {
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.socketPushId, destructVar.socketPushId)) {
            return true;
        }
        int i4 = IAuthTabCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.scheme;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.socketPushId;
        if (str2 != null) {
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = str2.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = onWarmupCompleted + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PushSocketEvent(scheme=" + this.scheme + ", socketPushId=" + this.socketPushId + ")";
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
