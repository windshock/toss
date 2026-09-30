package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final CmpServiceImplf IAuthTabCallback;
    private final CmpServiceImple onExtraCallback;
    private final ZonedDateTime onWarmupCompleted;

    public r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I)) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7i = (r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, r8lambda33yzb1yb9xyib5h4msmqwcehb7i.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallback, r8lambda33yzb1yb9xyib5h4msmqwcehb7i.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, r8lambda33yzb1yb9xyib5h4msmqwcehb7i.onExtraCallback)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r2 r4
      0x0023: PHI (r2v6 j$.time.ZonedDateTime) = (r2v2 j$.time.ZonedDateTime), (r2v7 j$.time.ZonedDateTime) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r4v8 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r4
      0x001a: PHI (r4v1 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        ZonedDateTime zonedDateTime;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            zonedDateTime = this.onWarmupCompleted;
            iHashCode = 1;
            if (zonedDateTime == null) {
                int i4 = i2 + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = zonedDateTime.hashCode();
            }
        } else {
            zonedDateTime = this.onWarmupCompleted;
            iHashCode = 0;
            if (zonedDateTime == null) {
            }
        }
        CmpServiceImplf cmpServiceImplf = this.IAuthTabCallback;
        int iHashCode3 = cmpServiceImplf != null ? cmpServiceImplf.hashCode() : 0;
        CmpServiceImple cmpServiceImple = this.onExtraCallback;
        if (cmpServiceImple != null) {
            int i6 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                cmpServiceImple.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode = cmpServiceImple.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AtsTradingHourFormat(date=" + this.onWarmupCompleted + ", krxEntireTradingHours=" + this.IAuthTabCallback + ", nxtEntireTradingHours=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I(@Nullable ZonedDateTime zonedDateTime, @Nullable CmpServiceImplf cmpServiceImplf, @Nullable CmpServiceImple cmpServiceImple) {
        this.onWarmupCompleted = zonedDateTime;
        this.IAuthTabCallback = cmpServiceImplf;
        this.onExtraCallback = cmpServiceImple;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I(ZonedDateTime zonedDateTime, CmpServiceImplf cmpServiceImplf, CmpServiceImple cmpServiceImple, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            zonedDateTime = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            cmpServiceImplf = null;
        }
        if ((i & 4) != 0) {
            int i7 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 99 / 0;
            }
            cmpServiceImple = null;
        }
        this(zonedDateTime, cmpServiceImplf, cmpServiceImple);
    }

    public final CmpServiceImplf onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CmpServiceImplf cmpServiceImplf = this.IAuthTabCallback;
        int i5 = i2 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return cmpServiceImplf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CmpServiceImple onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        CmpServiceImple cmpServiceImple = this.onExtraCallback;
        int i4 = i3 + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return cmpServiceImple;
        }
        obj.hashCode();
        throw null;
    }
}
