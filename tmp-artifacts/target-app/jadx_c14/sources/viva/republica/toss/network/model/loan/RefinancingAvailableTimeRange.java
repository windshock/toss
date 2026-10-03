package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.IdGeneratorExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingAvailableTimeRange implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String end;
    private final String start;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RefinancingAvailableTimeRange> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RefinancingAvailableTimeRange> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final RefinancingAvailableTimeRange IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RefinancingAvailableTimeRange refinancingAvailableTimeRange = new RefinancingAvailableTimeRange(parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return refinancingAvailableTimeRange;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingAvailableTimeRange createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingAvailableTimeRange[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onNavigationEvent(i);
                obj.hashCode();
                throw null;
            }
            RefinancingAvailableTimeRange[] refinancingAvailableTimeRangeArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return refinancingAvailableTimeRangeArrOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public final RefinancingAvailableTimeRange[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            RefinancingAvailableTimeRange[] refinancingAvailableTimeRangeArr = new RefinancingAvailableTimeRange[i];
            if (i3 % 2 != 0) {
                return refinancingAvailableTimeRangeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RefinancingAvailableTimeRange() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof RefinancingAvailableTimeRange)) {
                return false;
            }
            RefinancingAvailableTimeRange refinancingAvailableTimeRange = (RefinancingAvailableTimeRange) obj;
            return !(Intrinsics.areEqual(this.start, refinancingAvailableTimeRange.start) ^ true) && Intrinsics.areEqual(this.end, refinancingAvailableTimeRange.end);
        }
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.start.hashCode();
        return i3 != 0 ? (iHashCode >> 57) / this.end.hashCode() : (iHashCode * 31) + this.end.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefinancingAvailableTimeRange(start=" + this.start + ", end=" + this.end + ")";
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.start);
            parcel.writeString(this.end);
            int i5 = 61 / 0;
        } else {
            parcel.writeString(this.start);
            parcel.writeString(this.end);
        }
        int i6 = onWarmupCompleted + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RefinancingAvailableTimeRange> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            RefinancingAvailableTimeRange$$serializer refinancingAvailableTimeRange$$serializer = RefinancingAvailableTimeRange$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return refinancingAvailableTimeRange$$serializer;
        }
    }

    public /* synthetic */ RefinancingAvailableTimeRange(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.start = "";
            int i2 = 2 % 2;
        } else {
            this.start = str;
        }
        if ((i & 2) == 0) {
            this.end = "";
            int i3 = onExtraCallback + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
                return;
            }
            return;
        }
        this.end = str2;
        int i5 = onWarmupCompleted + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
    }

    public RefinancingAvailableTimeRange(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.start = str;
        this.end = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onExtraCallback
            int r1 = r1 + 5
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onWarmupCompleted = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L1a
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            r1 = r1 ^ r4
            if (r1 == r4) goto L20
            goto L28
        L1a:
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 == r4) goto L28
        L20:
            java.lang.String r1 = r6.start
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L2d
        L28:
            java.lang.String r1 = r6.start
            r7.onExtraCallback(r8, r3, r1)
        L2d:
            boolean r1 = r7.onWarmupCompleted(r8, r4)
            if (r1 != 0) goto L52
            int r1 = viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onWarmupCompleted
            int r1 = r1 + 91
            int r5 = r1 % 128
            viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onExtraCallback = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L4a
            java.lang.String r1 = r6.end
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 93
            int r2 = r2 / r3
            if (r1 != 0) goto L57
            goto L52
        L4a:
            java.lang.String r1 = r6.end
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L57
        L52:
            java.lang.String r6 = r6.end
            r7.onExtraCallback(r8, r4, r6)
        L57:
            int r6 = viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onWarmupCompleted
            int r6 = r6 + 41
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onExtraCallback = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L63
            return
        L63:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange.onNavigationEvent(viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RefinancingAvailableTimeRange(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final Calendar IAuthTabCallback(@NotNull Calendar calendar) {
        Date date;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        try {
            Locale locale = Locale.KOREAN;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            date = new IdGeneratorExternalSyntheticLambda1("HH:mm:ss", locale).parse(this.end);
        } catch (Exception unused) {
            date = null;
        }
        if (date == null) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar.set(11, calendar2.get(11));
        calendar.set(12, calendar2.get(12));
        calendar.set(13, calendar2.get(13));
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return calendar;
    }
}
