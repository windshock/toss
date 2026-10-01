package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MoneyCalendarWidgetResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final long balance;
    private final long deposit;
    private final String landingScheme;
    private final long withdrawal;
    private final String yearMonth;

    static {
        int i = IAuthTabCallback + 31;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public MoneyCalendarWidgetResponse() {
        this((String) null, 0L, 0L, 0L, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof MoneyCalendarWidgetResponse)) {
            return false;
        }
        MoneyCalendarWidgetResponse moneyCalendarWidgetResponse = (MoneyCalendarWidgetResponse) obj;
        return !(Intrinsics.areEqual(this.yearMonth, moneyCalendarWidgetResponse.yearMonth) ^ true) && this.deposit == moneyCalendarWidgetResponse.deposit && this.withdrawal == moneyCalendarWidgetResponse.withdrawal && this.balance == moneyCalendarWidgetResponse.balance && Intrinsics.areEqual(this.landingScheme, moneyCalendarWidgetResponse.landingScheme);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.yearMonth.hashCode() * 31) + Long.hashCode(this.deposit)) * 31) + Long.hashCode(this.withdrawal)) * 31) + Long.hashCode(this.balance)) * 31) + this.landingScheme.hashCode();
        int i4 = onExtraCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MoneyCalendarWidgetResponse(yearMonth=" + this.yearMonth + ", deposit=" + this.deposit + ", withdrawal=" + this.withdrawal + ", balance=" + this.balance + ", landingScheme=" + this.landingScheme + ")";
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
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

        public final KSerializer<MoneyCalendarWidgetResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MoneyCalendarWidgetResponse$$serializer moneyCalendarWidgetResponse$$serializer = MoneyCalendarWidgetResponse$$serializer.INSTANCE;
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return moneyCalendarWidgetResponse$$serializer;
        }
    }

    public /* synthetic */ MoneyCalendarWidgetResponse(int i, String str, long j, long j2, long j3, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.yearMonth = BuildConfig.FLAVOR;
        } else {
            this.yearMonth = str;
        }
        if ((i & 2) == 0) {
            this.deposit = 0L;
        } else {
            this.deposit = j;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.withdrawal = 0L;
        } else {
            this.withdrawal = j2;
        }
        if ((i & 8) == 0) {
            this.balance = 0L;
        } else {
            this.balance = j3;
        }
        if ((i & 16) != 0) {
            this.landingScheme = str2;
            return;
        }
        int i5 = onExtraCallbackWithResult + 27;
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        this.landingScheme = BuildConfig.FLAVOR;
        int i8 = i6 + 91;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MoneyCalendarWidgetResponse(@NotNull String str, long j, long j2, long j3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.yearMonth = str;
        this.deposit = j;
        this.withdrawal = j2;
        this.balance = j3;
        this.landingScheme = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(MoneyCalendarWidgetResponse moneyCalendarWidgetResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, moneyCalendarWidgetResponse.yearMonth);
        } else if (!Intrinsics.areEqual(moneyCalendarWidgetResponse.yearMonth, BuildConfig.FLAVOR)) {
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || moneyCalendarWidgetResponse.deposit != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, moneyCalendarWidgetResponse.deposit);
            int i3 = onExtraCallbackWithResult + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || moneyCalendarWidgetResponse.withdrawal != 0) {
            vylVar.onExtraCallback(serialDescriptor, 2, moneyCalendarWidgetResponse.withdrawal);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || moneyCalendarWidgetResponse.balance != 0) {
            vylVar.onExtraCallback(serialDescriptor, 3, moneyCalendarWidgetResponse.balance);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i5 = onExtraCallbackWithResult + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (Intrinsics.areEqual(moneyCalendarWidgetResponse.landingScheme, BuildConfig.FLAVOR)) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 4, moneyCalendarWidgetResponse.landingScheme);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MoneyCalendarWidgetResponse(String str, long j, long j2, long j3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        long j4;
        long j5;
        int i2 = i & 1;
        String str4 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = onExtraCallbackWithResult + 121;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = str;
        }
        long j6 = 0;
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 3;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            j6 = j3;
        }
        if ((i & 16) != 0) {
            int i10 = onExtraCallbackWithResult + 59;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(str3, j4, j5, j6, str4);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.yearMonth;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.deposit;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.withdrawal;
        int i5 = i2 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.balance;
        int i5 = i2 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.landingScheme;
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
