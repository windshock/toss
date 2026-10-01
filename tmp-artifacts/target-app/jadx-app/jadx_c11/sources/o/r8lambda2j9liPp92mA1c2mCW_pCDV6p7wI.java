package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<T> {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private final ZonedDateTime IAuthTabCallback;
    private final T onExtraCallback;
    private final T onNavigationEvent;
    private final T onWarmupCompleted;

    public r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 59;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI)) {
            int i3 = IAuthTabCallbackDefault + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = (r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.IAuthTabCallback) || !Intrinsics.areEqual(this.onNavigationEvent, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.onWarmupCompleted)) {
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.onExtraCallback)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v13 j$.time.ZonedDateTime) = (r1v4 j$.time.ZonedDateTime), (r1v15 j$.time.ZonedDateTime) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        ZonedDateTime zonedDateTime;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            zonedDateTime = this.IAuthTabCallback;
            iHashCode = 1;
            iHashCode2 = zonedDateTime == null ? 0 : zonedDateTime.hashCode();
        } else {
            zonedDateTime = this.IAuthTabCallback;
            iHashCode = 0;
            if (zonedDateTime == null) {
            }
        }
        T t = this.onNavigationEvent;
        int iHashCode4 = t == null ? 0 : t.hashCode();
        T t2 = this.onWarmupCompleted;
        if (t2 != null) {
            iHashCode3 = t2.hashCode();
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
            }
        }
        T t3 = this.onExtraCallback;
        if (t3 != null) {
            int i5 = IAuthTabCallbackDefault + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                t3.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode = t3.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TradingHour(expiredTime=" + this.IAuthTabCallback + ", prevBizDay=" + this.onNavigationEvent + ", today=" + this.onWarmupCompleted + ", nextBizDay=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI(@Nullable ZonedDateTime zonedDateTime, @Nullable T t, @Nullable T t2, @Nullable T t3) {
        this.IAuthTabCallback = zonedDateTime;
        this.onNavigationEvent = t;
        this.onWarmupCompleted = t2;
        this.onExtraCallback = t3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI(ZonedDateTime zonedDateTime, Object obj, Object obj2, Object obj3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackDefault + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            zonedDateTime = null;
        }
        obj = (i & 2) != 0 ? null : obj;
        if ((i & 4) != 0) {
            int i3 = 2 % 2;
            obj2 = null;
        }
        if ((i & 8) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 43;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 93;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            obj3 = null;
        }
        this(zonedDateTime, obj, obj2, obj3);
    }

    public final T onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        T t = this.onWarmupCompleted;
        int i5 = i3 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return t;
    }

    public final boolean IAuthTabCallback(@NotNull ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        ZonedDateTime zonedDateTime2 = this.IAuthTabCallback;
        if (zonedDateTime2 == null) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        isCivilized iscivilized = isCivilized.onWarmupCompleted;
        if (i5 != 0) {
            return iscivilized.onExtraCallbackWithResult(zonedDateTime, zonedDateTime2);
        }
        iscivilized.onExtraCallbackWithResult(zonedDateTime, zonedDateTime2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
