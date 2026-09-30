package o;

import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpServiceImplf {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private final ZonedDateTime IAuthTabCallback;
    private final ZonedDateTime IAuthTabCallbackDefault;
    private final ZonedDateTime IAuthTabCallbackStub;
    private final List<CmpServiceImplb> IAuthTabCallbackStubProxy;
    private final ZonedDateTime asBinder;
    private final ZonedDateTime asInterface;
    private final ZonedDateTime onExtraCallback;
    private final ZonedDateTime onExtraCallbackWithResult;
    private final ZonedDateTime onNavigationEvent;
    private final ZonedDateTime onTransact;
    private final ZonedDateTime onWarmupCompleted;

    public CmpServiceImplf() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmpServiceImplf)) {
            return false;
        }
        CmpServiceImplf cmpServiceImplf = (CmpServiceImplf) obj;
        if (!Intrinsics.areEqual(this.asInterface, cmpServiceImplf.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, cmpServiceImplf.IAuthTabCallbackDefault)) {
            int i4 = IAuthTabCallback_Parcel + 29;
            getInterfaceDescriptor = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, cmpServiceImplf.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, cmpServiceImplf.asBinder)) {
            int i5 = getInterfaceDescriptor + 1;
            IAuthTabCallback_Parcel = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, cmpServiceImplf.IAuthTabCallbackStub)) {
            int i6 = IAuthTabCallback_Parcel + 5;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, cmpServiceImplf.onTransact) || !Intrinsics.areEqual(this.IAuthTabCallback, cmpServiceImplf.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallback, cmpServiceImplf.onExtraCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, cmpServiceImplf.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, cmpServiceImplf.onNavigationEvent)) {
            int i8 = IAuthTabCallback_Parcel + 123;
            getInterfaceDescriptor = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i9 = getInterfaceDescriptor + 47;
        int i10 = i9 % 128;
        IAuthTabCallback_Parcel = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 25;
        getInterfaceDescriptor = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        ZonedDateTime zonedDateTime = this.asInterface;
        int iHashCode4 = 1;
        if (zonedDateTime == null) {
            int i2 = getInterfaceDescriptor + 101;
            IAuthTabCallback_Parcel = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = zonedDateTime.hashCode();
        }
        ZonedDateTime zonedDateTime2 = this.IAuthTabCallbackDefault;
        if (zonedDateTime2 == null) {
            int i3 = IAuthTabCallback_Parcel + 95;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = zonedDateTime2.hashCode();
        }
        ZonedDateTime zonedDateTime3 = this.onExtraCallbackWithResult;
        int iHashCode5 = zonedDateTime3 == null ? 0 : zonedDateTime3.hashCode();
        ZonedDateTime zonedDateTime4 = this.asBinder;
        int iHashCode6 = zonedDateTime4 == null ? 0 : zonedDateTime4.hashCode();
        ZonedDateTime zonedDateTime5 = this.IAuthTabCallbackStub;
        if (zonedDateTime5 == null) {
            int i5 = IAuthTabCallback_Parcel + 109;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = zonedDateTime5.hashCode();
        }
        ZonedDateTime zonedDateTime6 = this.onTransact;
        if (zonedDateTime6 == null) {
            int i6 = IAuthTabCallback_Parcel + 15;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = zonedDateTime6.hashCode();
        }
        ZonedDateTime zonedDateTime7 = this.IAuthTabCallback;
        int iHashCode7 = zonedDateTime7 == null ? 0 : zonedDateTime7.hashCode();
        ZonedDateTime zonedDateTime8 = this.onExtraCallback;
        int iHashCode8 = zonedDateTime8 == null ? 0 : zonedDateTime8.hashCode();
        ZonedDateTime zonedDateTime9 = this.onWarmupCompleted;
        int iHashCode9 = zonedDateTime9 == null ? 0 : zonedDateTime9.hashCode();
        ZonedDateTime zonedDateTime10 = this.onNavigationEvent;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (zonedDateTime10 != null ? zonedDateTime10.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KrxTradingHourFormat(krxPreMarketStartTime=" + this.asInterface + ", krxPreMarketEndTime=" + this.IAuthTabCallbackDefault + ", extendedStartTime=" + this.onExtraCallbackWithResult + ", officialExtendedStartTime=" + this.asBinder + ", preLastPriceOrderEndTime=" + this.IAuthTabCallbackStub + ", startTime=" + this.onTransact + ", afterMarketStartTime=" + this.IAuthTabCallback + ", endTime=" + this.onExtraCallback + ", afterExtraSinglePriceOrderStartTime=" + this.onWarmupCompleted + ", afterMarketEndTime=" + this.onNavigationEvent + ")";
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return str;
    }

    public CmpServiceImplf(@Nullable ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2, @Nullable ZonedDateTime zonedDateTime3, @Nullable ZonedDateTime zonedDateTime4, @Nullable ZonedDateTime zonedDateTime5, @Nullable ZonedDateTime zonedDateTime6, @Nullable ZonedDateTime zonedDateTime7, @Nullable ZonedDateTime zonedDateTime8, @Nullable ZonedDateTime zonedDateTime9, @Nullable ZonedDateTime zonedDateTime10) {
        this.asInterface = zonedDateTime;
        this.IAuthTabCallbackDefault = zonedDateTime2;
        this.onExtraCallbackWithResult = zonedDateTime3;
        this.asBinder = zonedDateTime4;
        this.IAuthTabCallbackStub = zonedDateTime5;
        this.onTransact = zonedDateTime6;
        this.IAuthTabCallback = zonedDateTime7;
        this.onExtraCallback = zonedDateTime8;
        this.onWarmupCompleted = zonedDateTime9;
        this.onNavigationEvent = zonedDateTime10;
        this.IAuthTabCallbackStubProxy = CollectionsKt.listOfNotNull(CmpServiceImplb.Companion.onExtraCallback(zonedDateTime3, zonedDateTime6));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CmpServiceImplf(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, ZonedDateTime zonedDateTime4, ZonedDateTime zonedDateTime5, ZonedDateTime zonedDateTime6, ZonedDateTime zonedDateTime7, ZonedDateTime zonedDateTime8, ZonedDateTime zonedDateTime9, ZonedDateTime zonedDateTime10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ZonedDateTime zonedDateTime11;
        ZonedDateTime zonedDateTime12;
        ZonedDateTime zonedDateTime13;
        ZonedDateTime zonedDateTime14;
        ZonedDateTime zonedDateTime15 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            zonedDateTime11 = null;
        } else {
            zonedDateTime11 = zonedDateTime;
        }
        ZonedDateTime zonedDateTime16 = (i & 2) != 0 ? null : zonedDateTime2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback_Parcel + 85;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            zonedDateTime12 = null;
        } else {
            zonedDateTime12 = zonedDateTime3;
        }
        ZonedDateTime zonedDateTime17 = (i & 8) != 0 ? null : zonedDateTime4;
        if ((i & 16) != 0) {
            int i5 = IAuthTabCallback_Parcel + 119;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            zonedDateTime13 = null;
        } else {
            zonedDateTime13 = zonedDateTime5;
        }
        ZonedDateTime zonedDateTime18 = (i & 32) != 0 ? null : zonedDateTime6;
        if ((i & 64) != 0) {
            int i8 = getInterfaceDescriptor + 73;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            zonedDateTime14 = null;
        } else {
            zonedDateTime14 = zonedDateTime7;
        }
        ZonedDateTime zonedDateTime19 = (i & 128) != 0 ? null : zonedDateTime8;
        ZonedDateTime zonedDateTime20 = (i & 256) != 0 ? null : zonedDateTime9;
        if ((i & 512) != 0) {
            int i11 = getInterfaceDescriptor + 67;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
        } else {
            zonedDateTime15 = zonedDateTime10;
        }
        this(zonedDateTime11, zonedDateTime16, zonedDateTime12, zonedDateTime17, zonedDateTime13, zonedDateTime18, zonedDateTime14, zonedDateTime19, zonedDateTime20, zonedDateTime15);
    }

    public final ZonedDateTime onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTime = this.asBinder;
        int i4 = i3 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final ZonedDateTime IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.onTransact;
        int i5 = i3 + 27;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return zonedDateTime;
    }

    public final ZonedDateTime onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final ZonedDateTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 105;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTime = this.onWarmupCompleted;
        int i4 = i2 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public ZonedDateTime IAuthTabCallback() {
        ZonedDateTime zonedDateTime;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            zonedDateTime = this.onNavigationEvent;
            int i4 = 19 / 0;
        } else {
            zonedDateTime = this.onNavigationEvent;
        }
        int i5 = i2 + 61;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return zonedDateTime;
        }
        throw null;
    }

    public final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onExtraCallback(@NotNull ZonedDateTime zonedDateTime) {
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.C0058onWarmupCompleted c0058onWarmupCompleted;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(zonedDateTime, "");
            r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, IAuthTabCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, IAuthTabCallback())) {
            int i3 = IAuthTabCallback_Parcel + 25;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onWarmupCompleted)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.asInterface.IAuthTabCallback;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onExtraCallback)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.IAuthTabCallbackDefault.onNavigationEvent;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.IAuthTabCallback)) {
            int i5 = getInterfaceDescriptor + 117;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onTransact)) {
            int i7 = IAuthTabCallback_Parcel + 75;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.IAuthTabCallbackStub.onWarmupCompleted;
            }
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.IAuthTabCallbackStub.onWarmupCompleted;
            throw null;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.IAuthTabCallbackStub)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.onTransact.onNavigationEvent;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.asBinder)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.asBinder.onExtraCallback;
        }
        if (r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(zonedDateTime, this.onExtraCallbackWithResult)) {
            return r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.onExtraCallback.onExtraCallback;
        }
        if (this.onTransact == null) {
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.onNavigationEvent onnavigationevent = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.onNavigationEvent.onNavigationEvent;
            int i8 = getInterfaceDescriptor + 125;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            return onnavigationevent;
        }
        int i10 = getInterfaceDescriptor + 71;
        IAuthTabCallback_Parcel = i10 % 128;
        if (i10 % 2 == 0) {
            c0058onWarmupCompleted = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.C0058onWarmupCompleted.onExtraCallback;
            int i11 = 88 / 0;
        } else {
            c0058onWarmupCompleted = r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted.C0058onWarmupCompleted.onExtraCallback;
        }
        int i12 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i12 % 128;
        int i13 = i12 % 2;
        return c0058onWarmupCompleted;
    }
}
