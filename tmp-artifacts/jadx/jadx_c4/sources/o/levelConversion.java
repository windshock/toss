package o;

import im.toss.feature.credit.ui.main.R;
import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface levelConversion {

    public static final class onNavigationEvent implements levelConversion {
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        private final int IAuthTabCallback;
        private final CreditHighInterestComparisonResponse.Comparison onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final CreditHighInterestComparisonResponse.BottomSheetInfo onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = asInterface + 65;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.IAuthTabCallback != onnavigationevent.IAuthTabCallback || this.onExtraCallbackWithResult != onnavigationevent.onExtraCallbackWithResult || this.onNavigationEvent != onnavigationevent.onNavigationEvent) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                if (Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                    return true;
                }
                int i4 = IAuthTabCallbackStub + 91;
                asInterface = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = IAuthTabCallbackStub + 105;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3 r4 r5 r6
          0x0040: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r3v7 int) = (r3v1 int), (r3v9 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r4v5 int) = (r4v1 int), (r4v7 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r5v3 im.toss.features.credit.data.response.CreditHighInterestComparisonResponse$Comparison) = 
          (r5v0 im.toss.features.credit.data.response.CreditHighInterestComparisonResponse$Comparison)
          (r5v5 im.toss.features.credit.data.response.CreditHighInterestComparisonResponse$Comparison)
         binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x0040: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4 r6
          0x003e: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r3v2 int) = (r3v1 int), (r3v9 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r4v2 int) = (r4v1 int), (r4v7 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r6v1 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            CreditHighInterestComparisonResponse.Comparison comparison;
            int iHashCode4;
            int iHashCode5;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = Integer.hashCode(this.IAuthTabCallback);
                iHashCode2 = Integer.hashCode(this.onExtraCallbackWithResult);
                iHashCode3 = Integer.hashCode(this.onNavigationEvent);
                comparison = this.onExtraCallback;
                iHashCode4 = 1;
                iHashCode5 = comparison == null ? 0 : comparison.hashCode();
            } else {
                iHashCode = Integer.hashCode(this.IAuthTabCallback);
                iHashCode2 = Integer.hashCode(this.onExtraCallbackWithResult);
                iHashCode3 = Integer.hashCode(this.onNavigationEvent);
                comparison = this.onExtraCallback;
                iHashCode4 = 0;
                if (comparison == null) {
                }
            }
            CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo = this.onWarmupCompleted;
            if (bottomSheetInfo != null) {
                iHashCode4 = bottomSheetInfo.hashCode();
            }
            int i3 = (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4;
            int i4 = IAuthTabCallbackStub + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return i3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InterestRate(titleResId=" + this.IAuthTabCallback + ", tabNameResId=" + this.onExtraCallbackWithResult + ", logTypeResId=" + this.onNavigationEvent + ", comparison=" + this.onExtraCallback + ", bottomSheetInfo=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallbackStub + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(int i, int i2, int i3, @Nullable CreditHighInterestComparisonResponse.Comparison comparison, @Nullable CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo) {
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = i2;
            this.onNavigationEvent = i3;
            this.onExtraCallback = comparison;
            this.onWarmupCompleted = bottomSheetInfo;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(int i, int i2, int i3, CreditHighInterestComparisonResponse.Comparison comparison, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i4 & 1) != 0) {
                int i5 = asInterface + 59;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i = R.string.credit_ui_score_report_interest_rate_title;
            }
            int i7 = i;
            if ((i4 & 2) != 0) {
                int i8 = IAuthTabCallbackStub + 109;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                i2 = R.string.credit_ui_score_report_interest_rate_tab_name;
                int i10 = 2 % 2;
            }
            int i11 = i2;
            if ((i4 & 4) != 0) {
                i3 = R.string.credit_ui_score_report_interest_rate_log_type;
                int i12 = IAuthTabCallbackStub + 55;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            }
            this(i7, i11, i3, comparison, bottomSheetInfo);
        }

        public int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 37;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = this.IAuthTabCallback;
            int i6 = i3 + 29;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 121;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i2 + 49;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public CreditHighInterestComparisonResponse.Comparison IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 57;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            CreditHighInterestComparisonResponse.Comparison comparison = this.onExtraCallback;
            int i5 = i3 + 97;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return comparison;
            }
            throw null;
        }

        public CreditHighInterestComparisonResponse.BottomSheetInfo onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo = this.onWarmupCompleted;
            int i5 = i3 + 97;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return bottomSheetInfo;
            }
            throw null;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
            this(0, 0, 0, creditHighInterestComparisonResponse.onWarmupCompleted(), creditHighInterestComparisonResponse.onExtraCallbackWithResult(), 7, null);
            Intrinsics.checkNotNullParameter(creditHighInterestComparisonResponse, "");
        }
    }
}
