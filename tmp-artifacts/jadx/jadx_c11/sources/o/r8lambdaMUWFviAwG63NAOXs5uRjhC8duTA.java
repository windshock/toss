package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final ZonedDateTime IAuthTabCallback;
    private final ZonedDateTime asBinder;
    private final ZonedDateTime onExtraCallback;
    private final ZonedDateTime onExtraCallbackWithResult;
    private final ZonedDateTime onNavigationEvent;
    private final ZonedDateTime onTransact;
    private final ZonedDateTime onWarmupCompleted;

    public r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA)) {
            return false;
        }
        r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA r8lambdamuwfviawg63naoxs5urjhc8duta = (r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, r8lambdamuwfviawg63naoxs5urjhc8duta.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, r8lambdamuwfviawg63naoxs5urjhc8duta.asBinder)) {
            int i2 = IAuthTabCallbackStub + 47;
            asInterface = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdamuwfviawg63naoxs5urjhc8duta.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, r8lambdamuwfviawg63naoxs5urjhc8duta.onTransact)) {
            int i3 = asInterface + 29;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r8lambdamuwfviawg63naoxs5urjhc8duta.IAuthTabCallback)) {
            int i5 = asInterface + 85;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, r8lambdamuwfviawg63naoxs5urjhc8duta.onNavigationEvent)) {
            int i7 = IAuthTabCallbackStub + 81;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, r8lambdamuwfviawg63naoxs5urjhc8duta.onWarmupCompleted)) {
            return true;
        }
        int i9 = IAuthTabCallbackStub + 125;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        ZonedDateTime zonedDateTime;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = asInterface + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int iHashCode4 = 0;
        if (i2 % 2 != 0 ? (zonedDateTime = this.onExtraCallback) != null : (zonedDateTime = this.onExtraCallback) != null) {
            iHashCode = zonedDateTime.hashCode();
        } else {
            int i4 = i3 + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        ZonedDateTime zonedDateTime2 = this.asBinder;
        int iHashCode5 = zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode();
        ZonedDateTime zonedDateTime3 = this.onExtraCallbackWithResult;
        if (zonedDateTime3 == null) {
            int i6 = IAuthTabCallbackStub + 57;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = zonedDateTime3.hashCode();
        }
        ZonedDateTime zonedDateTime4 = this.onTransact;
        int iHashCode6 = zonedDateTime4 == null ? 0 : zonedDateTime4.hashCode();
        ZonedDateTime zonedDateTime5 = this.IAuthTabCallback;
        if (zonedDateTime5 == null) {
            int i8 = asInterface + 11;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = zonedDateTime5.hashCode();
        }
        ZonedDateTime zonedDateTime6 = this.onNavigationEvent;
        int iHashCode7 = zonedDateTime6 == null ? 0 : zonedDateTime6.hashCode();
        ZonedDateTime zonedDateTime7 = this.onWarmupCompleted;
        if (zonedDateTime7 != null) {
            int i10 = IAuthTabCallbackStub + 57;
            asInterface = i10 % 128;
            if (i10 % 2 != 0) {
                int iHashCode8 = zonedDateTime7.hashCode();
                int i11 = 70 / 0;
                iHashCode4 = iHashCode8;
            } else {
                iHashCode4 = zonedDateTime7.hashCode();
            }
        }
        return (((((((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsOptionTradingHourFormat(date=" + this.onExtraCallback + ", preStart=" + this.asBinder + ", preEnd=" + this.onExtraCallbackWithResult + ", startTime=" + this.onTransact + ", endTime=" + this.IAuthTabCallback + ", afterStart=" + this.onNavigationEvent + ", afterEnd=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return str;
    }

    public r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA(@Nullable ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2, @Nullable ZonedDateTime zonedDateTime3, @Nullable ZonedDateTime zonedDateTime4, @Nullable ZonedDateTime zonedDateTime5, @Nullable ZonedDateTime zonedDateTime6, @Nullable ZonedDateTime zonedDateTime7) {
        this.onExtraCallback = zonedDateTime;
        this.asBinder = zonedDateTime2;
        this.onExtraCallbackWithResult = zonedDateTime3;
        this.onTransact = zonedDateTime4;
        this.IAuthTabCallback = zonedDateTime5;
        this.onNavigationEvent = zonedDateTime6;
        this.onWarmupCompleted = zonedDateTime7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaMUWFviAwG63NAOXs5uRjhC8duTA(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, ZonedDateTime zonedDateTime4, ZonedDateTime zonedDateTime5, ZonedDateTime zonedDateTime6, ZonedDateTime zonedDateTime7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ZonedDateTime zonedDateTime8;
        ZonedDateTime zonedDateTime9;
        ZonedDateTime zonedDateTime10;
        ZonedDateTime zonedDateTime11;
        ZonedDateTime zonedDateTime12;
        ZonedDateTime zonedDateTime13 = null;
        ZonedDateTime zonedDateTime14 = (i & 1) != 0 ? null : zonedDateTime;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub + 85;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 13 / 0;
            }
            zonedDateTime8 = null;
        } else {
            zonedDateTime8 = zonedDateTime2;
        }
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            zonedDateTime9 = null;
        } else {
            zonedDateTime9 = zonedDateTime3;
        }
        if ((i & 8) != 0) {
            int i5 = asInterface + 109;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            zonedDateTime10 = null;
        } else {
            zonedDateTime10 = zonedDateTime4;
        }
        if ((i & 16) != 0) {
            int i7 = asInterface + 115;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                zonedDateTime13.hashCode();
                throw null;
            }
            zonedDateTime11 = null;
        } else {
            zonedDateTime11 = zonedDateTime5;
        }
        if ((i & 32) != 0) {
            int i8 = 2 % 2;
            zonedDateTime12 = null;
        } else {
            zonedDateTime12 = zonedDateTime6;
        }
        if ((i & 64) != 0) {
            int i9 = asInterface + 117;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        } else {
            zonedDateTime13 = zonedDateTime7;
        }
        this(zonedDateTime14, zonedDateTime8, zonedDateTime9, zonedDateTime10, zonedDateTime11, zonedDateTime12, zonedDateTime13);
    }

    public final ZonedDateTime IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.asBinder;
        int i5 = i3 + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ZonedDateTime zonedDateTime = this.onExtraCallbackWithResult;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ZonedDateTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.IAuthTabCallback;
        int i5 = i3 + 121;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return zonedDateTime;
        }
        throw null;
    }

    public final ZonedDateTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTime = this.onNavigationEvent;
        int i4 = i3 + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.onWarmupCompleted;
        int i5 = i3 + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return zonedDateTime;
    }
}
