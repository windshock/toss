package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.ApplyAvailableDateTimeRange$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ApplyAvailableDateTimeRange {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String endDateTime;
    private final String startDateTime;

    static {
        int i = onNavigationEvent + 19;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApplyAvailableDateTimeRange() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ApplyAvailableDateTimeRange)) {
            return false;
        }
        ApplyAvailableDateTimeRange applyAvailableDateTimeRange = (ApplyAvailableDateTimeRange) obj;
        if (Intrinsics.areEqual(this.startDateTime, applyAvailableDateTimeRange.startDateTime)) {
            return Intrinsics.areEqual(this.endDateTime, applyAvailableDateTimeRange.endDateTime);
        }
        int i7 = IAuthTabCallback + 45;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.startDateTime;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.endDateTime;
        if (str2 != null) {
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ApplyAvailableDateTimeRange(startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ")";
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ApplyAvailableDateTimeRange> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ApplyAvailableDateTimeRange$.serializer serializerVar = ApplyAvailableDateTimeRange$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ ApplyAvailableDateTimeRange(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.startDateTime = null;
        } else {
            this.startDateTime = str;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.endDateTime = str2;
            return;
        }
        this.endDateTime = null;
        int i5 = IAuthTabCallback + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public ApplyAvailableDateTimeRange(@Nullable String str, @Nullable String str2) {
        this.startDateTime = str;
        this.endDateTime = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ApplyAvailableDateTimeRange applyAvailableDateTimeRange, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || applyAvailableDateTimeRange.startDateTime != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, applyAvailableDateTimeRange.startDateTime);
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (applyAvailableDateTimeRange.endDateTime == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, applyAvailableDateTimeRange.endDateTime);
        int i6 = IAuthTabCallback + 111;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApplyAvailableDateTimeRange(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.startDateTime;
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.endDateTime;
        }
        throw null;
    }
}
