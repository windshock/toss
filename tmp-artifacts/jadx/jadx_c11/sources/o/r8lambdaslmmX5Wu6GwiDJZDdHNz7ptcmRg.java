package o;

import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CmpServiceImplb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg {
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final ZonedDateTime IAuthTabCallback;
    private final List<CmpServiceImplb> IAuthTabCallbackDefault;
    private final ZonedDateTime IAuthTabCallbackStub;
    private final ZonedDateTime access000;
    private final ZonedDateTime asBinder;
    private final ZonedDateTime asInterface;
    private final ZonedDateTime onExtraCallback;
    private final ZonedDateTime onExtraCallbackWithResult;
    private final ZonedDateTime onNavigationEvent;
    private final ZonedDateTime onTransact;
    private final ZonedDateTime onWarmupCompleted;

    public r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = getInterfaceDescriptor + 37;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg)) {
            return false;
        }
        r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg = (r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.onExtraCallback) || (!Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.onExtraCallbackWithResult)) || !Intrinsics.areEqual(this.onNavigationEvent, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallback, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.IAuthTabCallback) || !Intrinsics.areEqual(this.asInterface, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.onTransact)) {
            int i4 = access100 + 41;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.asBinder, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.asBinder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.access000, r8lambdaslmmx5wu6gwidjzddhnz7ptcmrg.access000)) {
            return true;
        }
        int i6 = getInterfaceDescriptor + 119;
        access100 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        ZonedDateTime zonedDateTime = this.onExtraCallback;
        int iHashCode7 = 0;
        int iHashCode8 = zonedDateTime == null ? 0 : zonedDateTime.hashCode();
        ZonedDateTime zonedDateTime2 = this.onExtraCallbackWithResult;
        if (zonedDateTime2 == null) {
            int i2 = access100 + 111;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = zonedDateTime2.hashCode();
        }
        ZonedDateTime zonedDateTime3 = this.onNavigationEvent;
        if (zonedDateTime3 == null) {
            int i4 = access100 + 95;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = zonedDateTime3.hashCode();
            int i6 = getInterfaceDescriptor + 43;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
        }
        ZonedDateTime zonedDateTime4 = this.onWarmupCompleted;
        if (zonedDateTime4 == null) {
            int i8 = access100 + 85;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = zonedDateTime4.hashCode();
        }
        ZonedDateTime zonedDateTime5 = this.IAuthTabCallback;
        int iHashCode9 = zonedDateTime5 == null ? 0 : zonedDateTime5.hashCode();
        ZonedDateTime zonedDateTime6 = this.asInterface;
        if (zonedDateTime6 == null) {
            int i10 = getInterfaceDescriptor + 55;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = zonedDateTime6.hashCode();
        }
        ZonedDateTime zonedDateTime7 = this.onTransact;
        int iHashCode10 = zonedDateTime7 == null ? 0 : zonedDateTime7.hashCode();
        ZonedDateTime zonedDateTime8 = this.IAuthTabCallbackStub;
        if (zonedDateTime8 == null) {
            int i12 = access100 + 43;
            getInterfaceDescriptor = i12 % 128;
            int i13 = i12 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = zonedDateTime8.hashCode();
        }
        ZonedDateTime zonedDateTime9 = this.asBinder;
        if (zonedDateTime9 == null) {
            int i14 = getInterfaceDescriptor + 109;
            access100 = i14 % 128;
            iHashCode6 = i14 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode6 = zonedDateTime9.hashCode();
        }
        ZonedDateTime zonedDateTime10 = this.access000;
        if (zonedDateTime10 != null) {
            iHashCode7 = zonedDateTime10.hashCode();
            int i15 = access100 + 7;
            getInterfaceDescriptor = i15 % 128;
            int i16 = i15 % 2;
        }
        return (((((((((((((((((iHashCode8 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode4) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsTradingHourFormat(date=" + this.onExtraCallback + ", afterStart=" + this.onExtraCallbackWithResult + ", afterEnd=" + this.onNavigationEvent + ", dayMarketStart=" + this.onWarmupCompleted + ", dayMarketEnd=" + this.IAuthTabCallback + ", extendedStartTime=" + this.asInterface + ", officialExtendedStartTime=" + this.onTransact + ", startTime=" + this.IAuthTabCallbackStub + ", endTime=" + this.asBinder + ", usAfterMarketEnd=" + this.access000 + ")";
        int i2 = access100 + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg(@Nullable ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2, @Nullable ZonedDateTime zonedDateTime3, @Nullable ZonedDateTime zonedDateTime4, @Nullable ZonedDateTime zonedDateTime5, @Nullable ZonedDateTime zonedDateTime6, @Nullable ZonedDateTime zonedDateTime7, @Nullable ZonedDateTime zonedDateTime8, @Nullable ZonedDateTime zonedDateTime9, @Nullable ZonedDateTime zonedDateTime10) {
        ZonedDateTime zonedDateTimeMinusMinutes;
        this.onExtraCallback = zonedDateTime;
        this.onExtraCallbackWithResult = zonedDateTime2;
        this.onNavigationEvent = zonedDateTime3;
        this.onWarmupCompleted = zonedDateTime4;
        this.IAuthTabCallback = zonedDateTime5;
        this.asInterface = zonedDateTime6;
        this.onTransact = zonedDateTime7;
        this.IAuthTabCallbackStub = zonedDateTime8;
        this.asBinder = zonedDateTime9;
        this.access000 = zonedDateTime10;
        CmpServiceImplb.onWarmupCompleted onwarmupcompleted = CmpServiceImplb.Companion;
        if (zonedDateTime7 != null) {
            zonedDateTimeMinusMinutes = zonedDateTime7.minusMinutes(1L);
        } else {
            int i = access100 + 73;
            getInterfaceDescriptor = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            zonedDateTimeMinusMinutes = null;
        }
        this.IAuthTabCallbackDefault = CollectionsKt.listOfNotNull(onwarmupcompleted.onExtraCallback(zonedDateTimeMinusMinutes, zonedDateTime7));
        int i4 = access100 + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, ZonedDateTime zonedDateTime4, ZonedDateTime zonedDateTime5, ZonedDateTime zonedDateTime6, ZonedDateTime zonedDateTime7, ZonedDateTime zonedDateTime8, ZonedDateTime zonedDateTime9, ZonedDateTime zonedDateTime10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ZonedDateTime zonedDateTime11;
        ZonedDateTime zonedDateTime12;
        ZonedDateTime zonedDateTime13;
        ZonedDateTime zonedDateTime14;
        ZonedDateTime zonedDateTime15;
        ZonedDateTime zonedDateTime16 = null;
        if ((i & 1) != 0) {
            int i2 = getInterfaceDescriptor + 75;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            zonedDateTime11 = null;
        } else {
            zonedDateTime11 = zonedDateTime;
        }
        ZonedDateTime zonedDateTime17 = (i & 2) != 0 ? null : zonedDateTime2;
        ZonedDateTime zonedDateTime18 = (i & 4) != 0 ? null : zonedDateTime3;
        if ((i & 8) != 0) {
            int i4 = getInterfaceDescriptor + 73;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            zonedDateTime12 = null;
        } else {
            zonedDateTime12 = zonedDateTime4;
        }
        ZonedDateTime zonedDateTime19 = (i & 16) != 0 ? null : zonedDateTime5;
        if ((i & 32) != 0) {
            int i6 = getInterfaceDescriptor + 17;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
            }
            zonedDateTime13 = null;
        } else {
            zonedDateTime13 = zonedDateTime6;
        }
        if ((i & 64) != 0) {
            int i8 = getInterfaceDescriptor + 47;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            zonedDateTime14 = null;
        } else {
            zonedDateTime14 = zonedDateTime7;
        }
        ZonedDateTime zonedDateTime20 = (i & 128) != 0 ? null : zonedDateTime8;
        if ((i & 256) != 0) {
            int i11 = access100 + 103;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            zonedDateTime15 = null;
        } else {
            zonedDateTime15 = zonedDateTime9;
        }
        if ((i & 512) != 0) {
            int i13 = getInterfaceDescriptor + 45;
            access100 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 88 / 0;
            }
            int i15 = 2 % 2;
        } else {
            zonedDateTime16 = zonedDateTime10;
        }
        this(zonedDateTime11, zonedDateTime17, zonedDateTime18, zonedDateTime12, zonedDateTime19, zonedDateTime13, zonedDateTime14, zonedDateTime20, zonedDateTime15, zonedDateTime16);
    }

    public final ZonedDateTime onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ZonedDateTime IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.onNavigationEvent;
        int i5 = i3 + 49;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return zonedDateTime;
    }

    public final ZonedDateTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        ZonedDateTime zonedDateTime = this.onWarmupCompleted;
        int i5 = i3 + 85;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ZonedDateTime zonedDateTime = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return zonedDateTime;
    }

    public final ZonedDateTime IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 81;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ZonedDateTime zonedDateTime = this.onTransact;
        int i4 = i3 + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime asInterface() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 41;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ZonedDateTime zonedDateTime = this.IAuthTabCallbackStub;
        int i4 = i2 + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zonedDateTime;
    }

    public final ZonedDateTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (o.r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(r4, r3.IAuthTabCallbackStub) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.asInterface.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (o.r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(r4, r3.onTransact) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.onExtraCallback.onNavigationEvent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (o.r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(r4, r3.onWarmupCompleted) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        return o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.IAuthTabCallback.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r3.IAuthTabCallbackStub == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        r4 = o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg.access100 + 91;
        o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg.getInterfaceDescriptor = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r3.asBinder == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.onNavigationEvent.onNavigationEvent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r4 = o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.onExtraCallbackWithResult.onExtraCallbackWithResult;
        r1 = o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg.access100 + 107;
        o.r8lambdaslmmX5Wu6GwiDJZDdHNz7ptcmRg.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        return o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk.onWarmupCompleted.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (o.r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(r4, r3.onExtraCallbackWithResult) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((!o.r8lambda5fhbJdN0LjlwdcLn1_emP6hl3uo.onExtraCallback(r4, r3.onExtraCallbackWithResult)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk onWarmupCompleted(@NotNull ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(zonedDateTime, "");
            int i3 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(zonedDateTime, "");
        }
    }
}
