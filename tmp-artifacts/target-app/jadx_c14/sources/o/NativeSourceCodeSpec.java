package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.CardRecommendBanner;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeSourceCodeSpec implements NativeKeyboardObserverSpec {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final CardRecommendBanner cardRecommendBanner;
    private final List<formatToParts> installments;
    private removePlugin section;
    private NativeRedBoxSpec selectedDailyTransaction;
    private final String totalExpense;
    private final List<NativeRedBoxSpec> transactions;
    private final String yearMonth;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int $stable = 8;
    private static boolean isCalendarCollapsed = resetScaleAndCenter.onNavigationEvent.onExtraCallbackWithResult();

    public static /* synthetic */ NativeSourceCodeSpec onExtraCallback(NativeSourceCodeSpec nativeSourceCodeSpec, String str, List list, List list2, String str2, NativeRedBoxSpec nativeRedBoxSpec, CardRecommendBanner cardRecommendBanner, int i, Object obj) {
        List list3;
        NativeRedBoxSpec nativeRedBoxSpec2;
        CardRecommendBanner cardRecommendBanner2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        String str3 = (i3 % 2 == 0 && (i & 1) != 0) ? nativeSourceCodeSpec.yearMonth : str;
        List list4 = (i & 2) != 0 ? nativeSourceCodeSpec.transactions : list;
        if ((i & 4) != 0) {
            list3 = nativeSourceCodeSpec.installments;
            int i5 = i4 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            list3 = list2;
        }
        String str4 = (i & 8) != 0 ? nativeSourceCodeSpec.totalExpense : str2;
        if ((i & 16) != 0) {
            nativeRedBoxSpec2 = nativeSourceCodeSpec.selectedDailyTransaction;
            int i7 = onWarmupCompleted + 37;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            nativeRedBoxSpec2 = nativeRedBoxSpec;
        }
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 123;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            cardRecommendBanner2 = nativeSourceCodeSpec.cardRecommendBanner;
        } else {
            cardRecommendBanner2 = cardRecommendBanner;
        }
        return nativeSourceCodeSpec.IAuthTabCallback(str3, list4, list3, str4, nativeRedBoxSpec2, cardRecommendBanner2);
    }

    public final NativeSourceCodeSpec IAuthTabCallback(@NotNull String str, @NotNull List<NativeRedBoxSpec> list, @NotNull List<formatToParts> list2, @NotNull String str2, @Nullable NativeRedBoxSpec nativeRedBoxSpec, @Nullable CardRecommendBanner cardRecommendBanner) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        NativeSourceCodeSpec nativeSourceCodeSpec = new NativeSourceCodeSpec(str, list, list2, str2, nativeRedBoxSpec, cardRecommendBanner);
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeSourceCodeSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof NativeSourceCodeSpec)) {
            int i3 = onWarmupCompleted + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        NativeSourceCodeSpec nativeSourceCodeSpec = (NativeSourceCodeSpec) obj;
        if (!Intrinsics.areEqual(this.yearMonth, nativeSourceCodeSpec.yearMonth)) {
            int i5 = onExtraCallback + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transactions, nativeSourceCodeSpec.transactions)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.installments, nativeSourceCodeSpec.installments))) {
            return Intrinsics.areEqual(this.totalExpense, nativeSourceCodeSpec.totalExpense) && Intrinsics.areEqual(this.selectedDailyTransaction, nativeSourceCodeSpec.selectedDailyTransaction) && Intrinsics.areEqual(this.cardRecommendBanner, nativeSourceCodeSpec.cardRecommendBanner);
        }
        int i7 = onExtraCallback + 83;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        NativeRedBoxSpec nativeRedBoxSpec;
        int iHashCode5;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int iHashCode6 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.yearMonth.hashCode();
            iHashCode2 = this.transactions.hashCode();
            iHashCode3 = this.installments.hashCode();
            iHashCode4 = this.totalExpense.hashCode();
            nativeRedBoxSpec = this.selectedDailyTransaction;
            iHashCode5 = 1;
            if (nativeRedBoxSpec != null) {
                iHashCode6 = 1;
                iHashCode5 = iHashCode6;
                iHashCode6 = nativeRedBoxSpec.hashCode();
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 53;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode = this.yearMonth.hashCode();
            iHashCode2 = this.transactions.hashCode();
            iHashCode3 = this.installments.hashCode();
            iHashCode4 = this.totalExpense.hashCode();
            nativeRedBoxSpec = this.selectedDailyTransaction;
            if (nativeRedBoxSpec == null) {
                iHashCode5 = 0;
                int i32 = onWarmupCompleted;
                int i42 = i32 + 21;
                onExtraCallback = i42 % 128;
                int i52 = i42 % 2;
                int i62 = i32 + 53;
                onExtraCallback = i62 % 128;
                int i72 = i62 % 2;
            }
            iHashCode5 = iHashCode6;
            iHashCode6 = nativeRedBoxSpec.hashCode();
        }
        CardRecommendBanner cardRecommendBanner = this.cardRecommendBanner;
        if (cardRecommendBanner != null) {
            int i8 = onExtraCallback + 107;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            iHashCode5 = cardRecommendBanner.hashCode();
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeConsumptionCalendar(yearMonth=" + this.yearMonth + ", transactions=" + this.transactions + ", installments=" + this.installments + ", totalExpense=" + this.totalExpense + ", selectedDailyTransaction=" + this.selectedDailyTransaction + ", cardRecommendBanner=" + this.cardRecommendBanner + ")";
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return str;
    }

    public NativeSourceCodeSpec(@NotNull String str, @NotNull List<NativeRedBoxSpec> list, @NotNull List<formatToParts> list2, @NotNull String str2, @Nullable NativeRedBoxSpec nativeRedBoxSpec, @Nullable CardRecommendBanner cardRecommendBanner) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.yearMonth = str;
        this.transactions = list;
        this.installments = list2;
        this.totalExpense = str2;
        this.selectedDailyTransaction = nativeRedBoxSpec;
        this.cardRecommendBanner = cardRecommendBanner;
    }

    public static final /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = isCalendarCollapsed;
        int i4 = i3 + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        long jIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            jIAuthTabCallback = super.IAuthTabCallback();
            int i3 = 11 / 0;
        } else {
            jIAuthTabCallback = super.IAuthTabCallback();
        }
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return jIAuthTabCallback;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.yearMonth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeSourceCodeSpec(String str, List list, List list2, String str2, NativeRedBoxSpec nativeRedBoxSpec, CardRecommendBanner cardRecommendBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        List listEmptyList2;
        String str3;
        if ((i & 2) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = list2;
        }
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str3 = "";
        } else {
            str3 = str2;
        }
        CardRecommendBanner cardRecommendBanner2 = null;
        NativeRedBoxSpec nativeRedBoxSpec2 = (i & 16) != 0 ? null : nativeRedBoxSpec;
        if ((i & 32) != 0) {
            int i7 = onWarmupCompleted;
            int i8 = i7 + 47;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 52 / 0;
            }
            int i10 = i7 + 61;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        } else {
            cardRecommendBanner2 = cardRecommendBanner;
        }
        this(str, listEmptyList, listEmptyList2, str3, nativeRedBoxSpec2, cardRecommendBanner2);
    }

    public final List<NativeRedBoxSpec> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<NativeRedBoxSpec> list = this.transactions;
        int i4 = i2 + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<formatToParts> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<formatToParts> list = this.installments;
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return list;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.totalExpense;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NativeRedBoxSpec onTransact() {
        NativeRedBoxSpec nativeRedBoxSpec;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            nativeRedBoxSpec = this.selectedDailyTransaction;
            int i4 = 49 / 0;
        } else {
            nativeRedBoxSpec = this.selectedDailyTransaction;
        }
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return nativeRedBoxSpec;
    }

    public final CardRecommendBanner onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CardRecommendBanner cardRecommendBanner = this.cardRecommendBanner;
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return cardRecommendBanner;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.yearMonth;
        int i4 = i2 + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = NativeSourceCodeSpec.onExtraCallback();
            if (i3 != 0) {
                int i4 = 95 / 0;
            }
            return zOnExtraCallback;
        }
    }

    static {
        int i = IAuthTabCallback + 55;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }
}
