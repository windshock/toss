package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambda1f9R4bpuBp5V0AMbNzfRAFSrj8 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String status;
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda1f9R4bpuBp5V0AMbNzfRAFSrj8)) {
            int i2 = IAuthTabCallback + 25;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        r8lambda1f9R4bpuBp5V0AMbNzfRAFSrj8 r8lambda1f9r4bpubp5v0ambnzfrafsrj8 = (r8lambda1f9R4bpuBp5V0AMbNzfRAFSrj8) obj;
        if (this.verifyId != r8lambda1f9r4bpubp5v0ambnzfrafsrj8.verifyId) {
            int i6 = onNavigationEvent + 89;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.status, r8lambda1f9r4bpubp5v0ambnzfrafsrj8.status)) {
            return true;
        }
        int i8 = onNavigationEvent + 123;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.verifyId) * 31) + this.status.hashCode();
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyMobileIdVerifyResponse(verifyId=" + this.verifyId + ", status=" + this.status + ")";
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
