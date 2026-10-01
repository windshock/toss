package o;

import j$.time.ZonedDateTime;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpServiceImpla {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA> IAuthTabCallback;
    private final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> onExtraCallbackWithResult;
    private final Set<String> onNavigationEvent;
    private final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> onWarmupCompleted;

    public CmpServiceImpla() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmpServiceImpla)) {
            return false;
        }
        CmpServiceImpla cmpServiceImpla = (CmpServiceImpla) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, cmpServiceImpla.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, cmpServiceImpla.onWarmupCompleted)) {
            int i2 = onExtraCallback + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, cmpServiceImpla.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, cmpServiceImpla.onNavigationEvent);
        }
        int i4 = onTransact + 1;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 61;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 92 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
        int iHashCode3 = 0;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi == null) {
            int i2 = onExtraCallback + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.hashCode();
        }
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 = this.onWarmupCompleted;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 == null) {
            int i4 = onTransact + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2.hashCode();
        }
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3 = this.IAuthTabCallback;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3 != null) {
            int i6 = onTransact + 81;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int iHashCode4 = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3.hashCode();
                int i7 = 97 / 0;
                iHashCode3 = iHashCode4;
            } else {
                iHashCode3 = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3.hashCode();
            }
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IntegratedTradingHours(us=" + this.onExtraCallbackWithResult + ", ats=" + this.onWarmupCompleted + ", usOption=" + this.IAuthTabCallback + ", degradedMarkets=" + this.onNavigationEvent + ")";
        int i2 = onTransact + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public CmpServiceImpla(@Nullable r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi, @Nullable r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2, @Nullable r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.onExtraCallbackWithResult = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
        this.onWarmupCompleted = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2;
        this.IAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3;
        this.onNavigationEvent = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CmpServiceImpla(r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi, r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2, r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = (i & 1) != 0 ? null : r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
        if ((i & 2) != 0) {
            int i2 = onTransact + 11;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 = null;
        }
        if ((i & 4) != 0) {
            int i8 = onTransact + 73;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3 = null;
        }
        if ((i & 8) != 0) {
            int i9 = onExtraCallback + 57;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            set = clearFaultAdjacentMetadata.onExtraCallback();
            int i11 = onTransact + 83;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        this(r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2, r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3, set);
    }

    public final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
    }

    public final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onWarmupCompleted;
        int i5 = i2 + 79;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
    }

    public final r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = this.onNavigationEvent;
        int i5 = i2 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v5 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>) = 
      (r1v4 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>)
      (r1v9 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>)
     binds: [B:8:0x0022, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull ZonedDateTime zonedDateTime) {
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2;
        int i = 2 % 2;
        int i2 = onTransact + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(zonedDateTime, "");
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
            int i3 = 93 / 0;
            if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi != null) {
                if (!r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.IAuthTabCallback(zonedDateTime) && (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 = this.onWarmupCompleted) != null && (!r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2.IAuthTabCallback(zonedDateTime))) {
                    int i4 = onExtraCallback + 75;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(zonedDateTime, "");
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
            if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[PHI: r1
      0x004b: PHI (r1v13 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>) = 
      (r1v12 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>)
      (r1v14 o.r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg>)
     binds: [B:16:0x0049, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk IAuthTabCallback(@NotNull ZonedDateTime zonedDateTime) {
        ZonedDateTime zonedDateTimeIAuthTabCallback;
        r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgIAuthTabCallback;
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 = this.onExtraCallbackWithResult;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2 != null) {
            int i4 = onTransact + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi2.onWarmupCompleted();
            zonedDateTimeIAuthTabCallback = r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted != null ? r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted.IAuthTabCallback() : null;
        }
        if (!r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.IAuthTabCallback(zonedDateTime, zonedDateTimeIAuthTabCallback)) {
            r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3 = this.onExtraCallbackWithResult;
            if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3 == null || (r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgIAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi3.IAuthTabCallback()) == null) {
                return null;
            }
            return r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgIAuthTabCallback.onWarmupCompleted(zonedDateTime);
        }
        int i6 = onExtraCallback + 111;
        int i7 = i6 % 128;
        onTransact = i7;
        if (i6 % 2 == 0) {
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
            int i8 = 13 / 0;
            if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi != null) {
                int i9 = i7 + 77;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.onWarmupCompleted();
                    throw null;
                }
                r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted2 = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.onWarmupCompleted();
                if (r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted2 != null) {
                    return r8lambdaslmmx5wu6gwidjzddhnz7ptcmrgOnWarmupCompleted2.onWarmupCompleted(zonedDateTime);
                }
            }
        } else {
            r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onExtraCallbackWithResult;
            if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi != null) {
            }
        }
        return null;
    }

    public final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onNavigationEvent(@NotNull ZonedDateTime zonedDateTime) {
        r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onWarmupCompleted;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi != null && (r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.IAuthTabCallback()) != null) {
            int i2 = onExtraCallback + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            CmpServiceImplf cmpServiceImplfOnNavigationEvent = r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback.onNavigationEvent();
            if (cmpServiceImplfOnNavigationEvent != null) {
                int i4 = onTransact + 123;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cmpServiceImplfOnNavigationEvent.onExtraCallback(zonedDateTime);
                }
                cmpServiceImplfOnNavigationEvent.onExtraCallback(zonedDateTime);
                throw null;
            }
        }
        return null;
    }

    public final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onExtraCallback(@NotNull ZonedDateTime zonedDateTime) {
        r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi = this.onWarmupCompleted;
        if (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi == null || (r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wi.IAuthTabCallback()) == null) {
            return null;
        }
        int i4 = onTransact + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        CmpServiceImple cmpServiceImpleOnWarmupCompleted = r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback.onWarmupCompleted();
        if (i5 != 0) {
            int i6 = 54 / 0;
            if (cmpServiceImpleOnWarmupCompleted == null) {
                return null;
            }
        } else if (cmpServiceImpleOnWarmupCompleted == null) {
            return null;
        }
        return cmpServiceImpleOnWarmupCompleted.onExtraCallback(zonedDateTime);
    }
}
