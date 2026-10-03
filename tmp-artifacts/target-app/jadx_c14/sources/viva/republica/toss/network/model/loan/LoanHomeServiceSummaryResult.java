package viva.republica.toss.network.model.loan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanPreScreenResultSummary;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeServiceSummaryResult {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long amount;
    private final float interestRate;
    private final LoanPreScreenResultSummary.Product maxLimitAmountResult;
    private final LoanPreScreenResultSummary.Product minInterestRateResult;

    static {
        int i = onNavigationEvent + 39;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    public LoanHomeServiceSummaryResult() {
        this(0.0f, 0L, (LoanPreScreenResultSummary.Product) null, (LoanPreScreenResultSummary.Product) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoanHomeServiceSummaryResult onExtraCallback(LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, float f, long j, LoanPreScreenResultSummary.Product product, LoanPreScreenResultSummary.Product product2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = loanHomeServiceSummaryResult.interestRate;
        }
        float f2 = f;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                long j2 = loanHomeServiceSummaryResult.amount;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j = loanHomeServiceSummaryResult.amount;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            product = loanHomeServiceSummaryResult.minInterestRateResult;
            int i4 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        LoanPreScreenResultSummary.Product product3 = product;
        if ((i & 8) != 0) {
            product2 = loanHomeServiceSummaryResult.maxLimitAmountResult;
        }
        return loanHomeServiceSummaryResult.IAuthTabCallback(f2, j3, product3, product2);
    }

    public final LoanHomeServiceSummaryResult IAuthTabCallback(float f, long j, @Nullable LoanPreScreenResultSummary.Product product, @Nullable LoanPreScreenResultSummary.Product product2) {
        int i = 2 % 2;
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResult = new LoanHomeServiceSummaryResult(f, j, product, product2);
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return loanHomeServiceSummaryResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof LoanHomeServiceSummaryResult) {
            LoanHomeServiceSummaryResult loanHomeServiceSummaryResult = (LoanHomeServiceSummaryResult) obj;
            if (Float.compare(this.interestRate, loanHomeServiceSummaryResult.interestRate) != 0) {
                return false;
            }
            if (this.amount == loanHomeServiceSummaryResult.amount) {
                return Intrinsics.areEqual(this.minInterestRateResult, loanHomeServiceSummaryResult.minInterestRateResult) && Intrinsics.areEqual(this.maxLimitAmountResult, loanHomeServiceSummaryResult.maxLimitAmountResult);
            }
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallback + 109;
        int i7 = i6 % 128;
        onExtraCallbackWithResult = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 31;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 91 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Float.hashCode(this.interestRate);
        int iHashCode3 = Long.hashCode(this.amount);
        LoanPreScreenResultSummary.Product product = this.minInterestRateResult;
        int i2 = 0;
        if (product == null) {
            int i3 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = product.hashCode();
        }
        LoanPreScreenResultSummary.Product product2 = this.maxLimitAmountResult;
        if (product2 != null) {
            int i4 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int iHashCode4 = product2.hashCode();
            if (i5 != 0) {
                int i6 = 42 / 0;
            }
            i2 = iHashCode4;
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + i2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeServiceSummaryResult(interestRate=" + this.interestRate + ", amount=" + this.amount + ", minInterestRateResult=" + this.minInterestRateResult + ", maxLimitAmountResult=" + this.maxLimitAmountResult + ")";
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanHomeServiceSummaryResult> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeServiceSummaryResult$$serializer loanHomeServiceSummaryResult$$serializer = LoanHomeServiceSummaryResult$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return loanHomeServiceSummaryResult$$serializer;
        }
    }

    public LoanHomeServiceSummaryResult(float f, long j, @Nullable LoanPreScreenResultSummary.Product product, @Nullable LoanPreScreenResultSummary.Product product2) {
        this.interestRate = f;
        this.amount = j;
        this.minInterestRateResult = product;
        this.maxLimitAmountResult = product2;
    }

    public /* synthetic */ LoanHomeServiceSummaryResult(int i, float f, long j, LoanPreScreenResultSummary.Product product, LoanPreScreenResultSummary.Product product2, okycx okycxVar) {
        this.interestRate = (i & 1) == 0 ? 0.0f : f;
        if ((i & 2) == 0) {
            this.amount = 0L;
            int i2 = 2 % 2;
        } else {
            this.amount = j;
        }
        if ((i & 4) == 0) {
            this.minInterestRateResult = null;
        } else {
            this.minInterestRateResult = product;
            int i3 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.maxLimitAmountResult = null;
            return;
        }
        this.maxLimitAmountResult = product2;
        int i6 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.IAuthTabCallback
            int r1 = r1 + 19
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L25
            int r2 = viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.IAuthTabCallback
            int r2 = r2 + 101
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            float r2 = r7.interestRate
            r3 = 0
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L2a
        L25:
            float r2 = r7.interestRate
            r8.onExtraCallback(r9, r1, r2)
        L2a:
            r2 = 1
            boolean r3 = r8.onWarmupCompleted(r9, r2)
            if (r3 != 0) goto L39
            long r3 = r7.amount
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3e
        L39:
            long r3 = r7.amount
            r8.onExtraCallback(r9, r2, r3)
        L3e:
            boolean r3 = r8.onWarmupCompleted(r9, r0)
            r2 = r2 ^ r3
            if (r2 == 0) goto L5b
            int r2 = viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.onExtraCallbackWithResult
            int r2 = r2 + 35
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L57
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r2 = r7.minInterestRateResult
            r3 = 5
            int r3 = r3 / r1
            if (r2 == 0) goto L62
            goto L5b
        L57:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r1 = r7.minInterestRateResult
            if (r1 == 0) goto L62
        L5b:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer r1 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r2 = r7.minInterestRateResult
            r8.onExtraCallbackWithResult(r9, r0, r1, r2)
        L62:
            r1 = 3
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            if (r2 != 0) goto L80
            int r2 = viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.IAuthTabCallback
            int r2 = r2 + 15
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L79
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r0 = r7.maxLimitAmountResult
            if (r0 == 0) goto L87
            goto L80
        L79:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r7 = r7.maxLimitAmountResult
            r7 = 0
            r7.hashCode()
            throw r7
        L80:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer r0 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r7 = r7.maxLimitAmountResult
            r8.onExtraCallbackWithResult(r9, r1, r0, r7)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeServiceSummaryResult(float f, long j, LoanPreScreenResultSummary.Product product, LoanPreScreenResultSummary.Product product2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        LoanPreScreenResultSummary.Product product3;
        LoanPreScreenResultSummary.Product product4;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            j = i3 % 2 != 0 ? 1L : 0L;
            int i4 = 2 % 2;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            product3 = null;
        } else {
            product3 = product;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            product4 = null;
        } else {
            product4 = product2;
        }
        this(f, j2, product3, product4);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.amount;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final LoanPreScreenResultSummary.Product onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LoanPreScreenResultSummary.Product product = this.minInterestRateResult;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return product;
        }
        throw null;
    }

    public final LoanPreScreenResultSummary.Product IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LoanPreScreenResultSummary.Product product = this.maxLimitAmountResult;
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return product;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.interestRate)) + "%";
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
