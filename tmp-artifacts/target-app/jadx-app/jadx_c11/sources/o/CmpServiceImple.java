package o;

import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CmpServiceImplb;
import o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpServiceImple {
    private static int access000 = 0;
    private static int access100 = 1;
    private final ZonedDateTime IAuthTabCallback;
    private final ZonedDateTime IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final List<CmpServiceImplb> IAuthTabCallback_Parcel;
    private final ZonedDateTime asBinder;
    private final ZonedDateTime asInterface;
    private final ZonedDateTime onExtraCallback;
    private final ZonedDateTime onExtraCallbackWithResult;
    private final ZonedDateTime onNavigationEvent;
    private final ZonedDateTime onTransact;
    private final ZonedDateTime onWarmupCompleted;

    public CmpServiceImple() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 115;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 55;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof CmpServiceImple)) {
            return false;
        }
        CmpServiceImple cmpServiceImple = (CmpServiceImple) obj;
        if (!Intrinsics.areEqual(this.onTransact, cmpServiceImple.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, cmpServiceImple.IAuthTabCallbackDefault)) {
            int i7 = access000 + 87;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, cmpServiceImple.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, cmpServiceImple.asInterface)) {
            int i9 = access100 + 33;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, cmpServiceImple.IAuthTabCallback) || !Intrinsics.areEqual(this.onNavigationEvent, cmpServiceImple.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, cmpServiceImple.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, cmpServiceImple.onExtraCallback)) {
            int i11 = access000 + 25;
            access100 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, cmpServiceImple.onExtraCallbackWithResult))) {
            return true;
        }
        int i13 = access100 + 25;
        access000 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        ZonedDateTime zonedDateTime;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = access100 + 95;
        access000 = i2 % 128;
        int iHashCode5 = 0;
        int iHashCode6 = (i2 % 2 == 0 ? (zonedDateTime = this.onTransact) != null : (zonedDateTime = this.onTransact) != null) ? zonedDateTime.hashCode() : 0;
        ZonedDateTime zonedDateTime2 = this.IAuthTabCallbackDefault;
        int iHashCode7 = zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode();
        ZonedDateTime zonedDateTime3 = this.asBinder;
        if (zonedDateTime3 == null) {
            int i3 = access100 + 117;
            access000 = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = zonedDateTime3.hashCode();
        }
        ZonedDateTime zonedDateTime4 = this.asInterface;
        if (zonedDateTime4 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = zonedDateTime4.hashCode();
            int i4 = access100 + 85;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        ZonedDateTime zonedDateTime5 = this.IAuthTabCallback;
        if (zonedDateTime5 == null) {
            int i6 = access100 + 71;
            access000 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = zonedDateTime5.hashCode();
        }
        ZonedDateTime zonedDateTime6 = this.onNavigationEvent;
        if (zonedDateTime6 == null) {
            int i7 = access000;
            int i8 = i7 + 65;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 61;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = zonedDateTime6.hashCode();
        }
        ZonedDateTime zonedDateTime7 = this.onWarmupCompleted;
        int iHashCode8 = zonedDateTime7 == null ? 0 : zonedDateTime7.hashCode();
        ZonedDateTime zonedDateTime8 = this.onExtraCallback;
        int iHashCode9 = zonedDateTime8 == null ? 0 : zonedDateTime8.hashCode();
        ZonedDateTime zonedDateTime9 = this.onExtraCallbackWithResult;
        if (zonedDateTime9 != null) {
            int i12 = access000 + 1;
            access100 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode5 = zonedDateTime9.hashCode();
            int i14 = access100 + 89;
            access000 = i14 % 128;
            int i15 = i14 % 2;
        }
        return (((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NxtTradingHourFormat(preMarketStartTime=" + this.onTransact + ", preMarketEndTime=" + this.IAuthTabCallbackDefault + ", startTime=" + this.asBinder + ", endTime=" + this.asInterface + ", afterMarketStartTime=" + this.IAuthTabCallback + ", closingPriceStartTime=" + this.onNavigationEvent + ", afterMarketSinglePriceEndTime=" + this.onWarmupCompleted + ", closingPriceEndTime=" + this.onExtraCallback + ", afterMarketEndTime=" + this.onExtraCallbackWithResult + ")";
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public CmpServiceImple(@Nullable ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2, @Nullable ZonedDateTime zonedDateTime3, @Nullable ZonedDateTime zonedDateTime4, @Nullable ZonedDateTime zonedDateTime5, @Nullable ZonedDateTime zonedDateTime6, @Nullable ZonedDateTime zonedDateTime7, @Nullable ZonedDateTime zonedDateTime8, @Nullable ZonedDateTime zonedDateTime9) {
        boolean z;
        this.onTransact = zonedDateTime;
        this.IAuthTabCallbackDefault = zonedDateTime2;
        this.asBinder = zonedDateTime3;
        this.asInterface = zonedDateTime4;
        this.IAuthTabCallback = zonedDateTime5;
        this.onNavigationEvent = zonedDateTime6;
        this.onWarmupCompleted = zonedDateTime7;
        this.onExtraCallback = zonedDateTime8;
        this.onExtraCallbackWithResult = zonedDateTime9;
        CmpServiceImplb.onWarmupCompleted onwarmupcompleted = CmpServiceImplb.Companion;
        this.IAuthTabCallback_Parcel = CollectionsKt.listOfNotNull(new CmpServiceImplb[]{onwarmupcompleted.onExtraCallback(zonedDateTime2, zonedDateTime3), onwarmupcompleted.onExtraCallback(zonedDateTime4, zonedDateTime5)});
        if (zonedDateTime == null && zonedDateTime2 == null) {
            int i = access100 + 61;
            access000 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        } else {
            z = false;
        }
        this.IAuthTabCallbackStub = z;
        int i4 = access100 + 123;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CmpServiceImple(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, ZonedDateTime zonedDateTime4, ZonedDateTime zonedDateTime5, ZonedDateTime zonedDateTime6, ZonedDateTime zonedDateTime7, ZonedDateTime zonedDateTime8, ZonedDateTime zonedDateTime9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ZonedDateTime zonedDateTime10;
        ZonedDateTime zonedDateTime11;
        ZonedDateTime zonedDateTime12;
        ZonedDateTime zonedDateTime13;
        ZonedDateTime zonedDateTime14;
        if ((i & 1) != 0) {
            int i2 = access100 + 31;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                zonedDateTime.hashCode();
                throw null;
            }
            zonedDateTime10 = null;
        } else {
            zonedDateTime10 = zonedDateTime;
        }
        ZonedDateTime zonedDateTime15 = (i & 2) != 0 ? null : zonedDateTime2;
        if ((i & 4) != 0) {
            int i3 = access100;
            int i4 = i3 + 29;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                zonedDateTime.hashCode();
                throw null;
            }
            int i5 = i3 + 27;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            zonedDateTime11 = null;
        } else {
            zonedDateTime11 = zonedDateTime3;
        }
        ZonedDateTime zonedDateTime16 = (i & 8) != 0 ? null : zonedDateTime4;
        if ((i & 16) != 0) {
            int i7 = access000;
            int i8 = i7 + 47;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 115;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            zonedDateTime12 = null;
        } else {
            zonedDateTime12 = zonedDateTime5;
        }
        ZonedDateTime zonedDateTime17 = (i & 32) != 0 ? null : zonedDateTime6;
        if ((i & 64) != 0) {
            int i13 = 2 % 2;
            zonedDateTime13 = null;
        } else {
            zonedDateTime13 = zonedDateTime7;
        }
        if ((i & 128) != 0) {
            int i14 = 2 % 2;
            zonedDateTime14 = null;
        } else {
            zonedDateTime14 = zonedDateTime8;
        }
        this(zonedDateTime10, zonedDateTime15, zonedDateTime11, zonedDateTime16, zonedDateTime12, zonedDateTime17, zonedDateTime13, zonedDateTime14, (i & 256) == 0 ? zonedDateTime9 : null);
    }

    public final ZonedDateTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 97;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTime = this.onTransact;
        int i4 = i2 + 83;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.IAuthTabCallbackDefault;
        int i5 = i3 + 117;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return zonedDateTime;
        }
        throw null;
    }

    public final ZonedDateTime IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 41;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.asBinder;
        int i5 = i3 + 43;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ZonedDateTime zonedDateTime = this.asInterface;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return zonedDateTime;
    }

    public final ZonedDateTime onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 41;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ZonedDateTime zonedDateTime = this.IAuthTabCallback;
        int i4 = i3 + 19;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zonedDateTime;
        }
        obj.hashCode();
        throw null;
    }

    public ZonedDateTime onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onExtraCallback(@NotNull ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        Object obj = null;
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, onNavigationEvent())) {
            int i2 = access000 + 33;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted;
            int i4 = access100 + 73;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onExtraCallback)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onWarmupCompleted)) {
            return (this.onExtraCallback == null && this.onNavigationEvent == null) ? r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted : r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.C0057onExtraCallbackWithResult.IAuthTabCallback;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.IAuthTabCallback)) {
            if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.IAuthTabCallback(zonedDateTime, this.onWarmupCompleted)) {
                return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent;
            }
            if (!r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.IAuthTabCallback(zonedDateTime, this.onExtraCallback)) {
                return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted;
            }
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.C0057onExtraCallbackWithResult c0057onExtraCallbackWithResult = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.C0057onExtraCallbackWithResult.IAuthTabCallback;
            int i5 = access000 + 35;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return c0057onExtraCallbackWithResult;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.asInterface)) {
            int i7 = access100 + 25;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onTransact.IAuthTabCallback;
            }
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onTransact ontransact = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onTransact.IAuthTabCallback;
            obj.hashCode();
            throw null;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.asBinder)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.IAuthTabCallbackDefault.onExtraCallback;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.IAuthTabCallbackDefault)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.asBinder.onWarmupCompleted;
        }
        if (!r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onTransact)) {
            return this.asBinder != null ? r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted : r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.asInterface.onWarmupCompleted;
        }
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.IAuthTabCallbackStub iAuthTabCallbackStub = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.IAuthTabCallbackStub.onWarmupCompleted;
        int i8 = access000 + 3;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return iAuthTabCallbackStub;
    }
}
