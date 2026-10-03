package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setHidden {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final boolean status;

    public setHidden() {
        this(false, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHidden)) {
            int i4 = i3 + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.status == ((setHidden) obj).status) {
            return true;
        }
        int i6 = i3 + 71;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.status);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.status);
        int i3 = IAuthTabCallback + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeActivationOpenBankingReq(status=" + this.status + ")";
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setHidden(boolean z) {
        this.status = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setHidden(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        this(z);
    }
}
