package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DestructorThreadTerminus {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String guardianPhoneNumber;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DestructorThreadTerminus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.guardianPhoneNumber, ((DestructorThreadTerminus) obj).guardianPhoneNumber)) {
            int i4 = IAuthTabCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 49;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.guardianPhoneNumber.hashCode();
            int i3 = 98 / 0;
        } else {
            iHashCode = this.guardianPhoneNumber.hashCode();
        }
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuardianPhoneNumberReq(guardianPhoneNumber=" + this.guardianPhoneNumber + ")";
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return str;
    }
}
