package viva.republica.toss.network.model.loan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanPreScreenResultSummary {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Product maxLimitAmountResult;
    private final Product minInterestRateResult;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 111;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanPreScreenResultSummary() {
        Product product = null;
        this(product, product, 3, (DefaultConstructorMarker) product);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPreScreenResultSummary)) {
            int i5 = i2 + 113;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 == 0;
        }
        LoanPreScreenResultSummary loanPreScreenResultSummary = (LoanPreScreenResultSummary) obj;
        if (!Intrinsics.areEqual(this.minInterestRateResult, loanPreScreenResultSummary.minInterestRateResult)) {
            int i6 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.maxLimitAmountResult, loanPreScreenResultSummary.maxLimitAmountResult)) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        Product product;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (product = this.minInterestRateResult) != null : (product = this.minInterestRateResult) != null) ? product.hashCode() : 0;
        Product product2 = this.maxLimitAmountResult;
        if (product2 != null) {
            int i3 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                product2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode = product2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreScreenResultSummary(minInterestRateResult=" + this.minInterestRateResult + ", maxLimitAmountResult=" + this.maxLimitAmountResult + ")";
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanPreScreenResultSummary> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LoanPreScreenResultSummary$.serializer serializerVar = LoanPreScreenResultSummary$.serializer.INSTANCE;
                throw null;
            }
            LoanPreScreenResultSummary$.serializer serializerVar2 = LoanPreScreenResultSummary$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 73;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanPreScreenResultSummary(int r3, viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.Product r4, viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.Product r5, o.okycx r6) {
        /*
            r2 = this;
            r2.<init>()
            r6 = r3 & 1
            r0 = 0
            r1 = 2
            if (r6 != 0) goto L17
            r2.minInterestRateResult = r0
            int r4 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onExtraCallbackWithResult
            int r4 = r4 + 55
            int r6 = r4 % 128
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onWarmupCompleted = r6
            int r4 = r4 % r1
            if (r4 != 0) goto L19
            goto L1b
        L17:
            r2.minInterestRateResult = r4
        L19:
            int r4 = r1 % r1
        L1b:
            r3 = r3 & r1
            if (r3 != 0) goto L2a
            r2.maxLimitAmountResult = r0
            int r3 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onExtraCallbackWithResult
            int r3 = r3 + 97
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onWarmupCompleted = r4
            int r3 = r3 % r1
            return
        L2a:
            r2.maxLimitAmountResult = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.<init>(int, viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product, viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product, o.okycx):void");
    }

    public LoanPreScreenResultSummary(@Nullable Product product, @Nullable Product product2) {
        this.minInterestRateResult = product;
        this.maxLimitAmountResult = product2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanPreScreenResultSummary r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onWarmupCompleted
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L2c
            int r2 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onWarmupCompleted
            int r2 = r2 + 3
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onExtraCallbackWithResult = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L25
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r0 = r5.minInterestRateResult
            if (r0 == 0) goto L33
            goto L2c
        L25:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r5 = r5.minInterestRateResult
            r5 = 0
            r5.hashCode()
            throw r5
        L2c:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer r0 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r2 = r5.minInterestRateResult
            r6.onExtraCallbackWithResult(r7, r1, r0, r2)
        L33:
            boolean r0 = r6.onWarmupCompleted(r7, r3)
            r0 = r0 ^ r3
            if (r0 == r3) goto L3b
            goto L3f
        L3b:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r0 = r5.maxLimitAmountResult
            if (r0 == 0) goto L46
        L3f:
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer r0 = viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product r5 = r5.maxLimitAmountResult
            r6.onExtraCallbackWithResult(r7, r3, r0, r5)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.onExtraCallback(viva.republica.toss.network.model.loan.LoanPreScreenResultSummary, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanPreScreenResultSummary(Product product, Product product2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            product = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            product2 = null;
        }
        this(product, product2);
    }

    public final Product onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Product product = this.minInterestRateResult;
        int i4 = i2 + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return product;
    }

    @liq
    public static final class Product {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String badgeText;
        private final String companyName;
        private final double interestRate;
        private final long limitAmount;
        private final String loanReqNo;
        private final String logoImageUrl;
        private final String productId;
        private final String productName;

        static {
            int i = onExtraCallback + 49;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public Product() {
            this((String) null, (String) null, (String) null, (String) null, 0.0d, 0L, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            if (Intrinsics.areEqual(this.productId, product.productId)) {
                if (!Intrinsics.areEqual(this.loanReqNo, product.loanReqNo)) {
                    int i4 = IAuthTabCallback + 13;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.logoImageUrl, product.logoImageUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.productName, product.productName)) {
                    int i6 = onNavigationEvent + 125;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Double.compare(this.interestRate, product.interestRate) != 0) {
                    int i8 = onNavigationEvent + 77;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (this.limitAmount != product.limitAmount) {
                    int i10 = onNavigationEvent + 89;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.companyName, product.companyName)) {
                    if (Intrinsics.areEqual(this.badgeText, product.badgeText)) {
                        return true;
                    }
                    int i12 = onNavigationEvent + 93;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.productId;
            int iHashCode2 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            int iHashCode4 = this.loanReqNo.hashCode();
            String str2 = this.logoImageUrl;
            if (str2 == null) {
                int i2 = IAuthTabCallback + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 4;
                }
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            int iHashCode5 = this.productName.hashCode();
            int iHashCode6 = Double.hashCode(this.interestRate);
            int iHashCode7 = Long.hashCode(this.limitAmount);
            int iHashCode8 = this.companyName.hashCode();
            String str3 = this.badgeText;
            if (str3 != null) {
                int i4 = onNavigationEvent + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = str3.hashCode();
            }
            return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Product(productId=" + this.productId + ", loanReqNo=" + this.loanReqNo + ", logoImageUrl=" + this.logoImageUrl + ", productName=" + this.productName + ", interestRate=" + this.interestRate + ", limitAmount=" + this.limitAmount + ", companyName=" + this.companyName + ", badgeText=" + this.badgeText + ")";
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Product> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                LoanPreScreenResultSummary$Product$$serializer loanPreScreenResultSummary$Product$$serializer = LoanPreScreenResultSummary$Product$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 23 / 0;
                }
                return loanPreScreenResultSummary$Product$$serializer;
            }
        }

        public /* synthetic */ Product(int i, String str, String str2, String str3, String str4, double d, long j, String str5, String str6, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.productId = null;
                int i2 = 2 % 2;
            } else {
                this.productId = str;
            }
            if ((i & 2) == 0) {
                int i3 = IAuthTabCallback + 89;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.loanReqNo = "";
            } else {
                this.loanReqNo = str2;
            }
            if ((i & 4) == 0) {
                this.logoImageUrl = null;
            } else {
                this.logoImageUrl = str3;
            }
            if ((i & 8) == 0) {
                int i5 = IAuthTabCallback + 117;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                this.productName = "";
            } else {
                this.productName = str4;
            }
            if ((i & 16) == 0) {
                int i7 = IAuthTabCallback + 27;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                this.interestRate = 0.0d;
            } else {
                this.interestRate = d;
                int i9 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.limitAmount = 0L;
                int i10 = 2 % 2;
            } else {
                this.limitAmount = j;
            }
            if ((i & 64) == 0) {
                int i11 = onNavigationEvent + 9;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                this.companyName = "";
                if (i12 != 0) {
                    int i13 = 23 / 0;
                }
            } else {
                this.companyName = str5;
            }
            if ((i & 128) != 0) {
                this.badgeText = str6;
                return;
            }
            int i14 = IAuthTabCallback + 1;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            this.badgeText = null;
        }

        public Product(@Nullable String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, double d, long j, @NotNull String str5, @Nullable String str6) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.productId = str;
            this.loanReqNo = str2;
            this.logoImageUrl = str3;
            this.productName = str4;
            this.interestRate = d;
            this.limitAmount = j;
            this.companyName = str5;
            this.badgeText = str6;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.Product r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.Product.onNavigationEvent(viva.republica.toss.network.model.loan.LoanPreScreenResultSummary$Product, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Product(String str, String str2, String str3, String str4, double d, long j, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            double d2;
            long j2;
            String str8 = null;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str7 = null;
            } else {
                str7 = str;
            }
            String str9 = (i & 2) != 0 ? "" : str2;
            String str10 = (i & 4) != 0 ? null : str3;
            String str11 = (i & 8) != 0 ? "" : str4;
            if ((i & 16) != 0) {
                int i3 = onNavigationEvent + 67;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                d2 = 0.0d;
            } else {
                d2 = d;
            }
            if ((i & 32) != 0) {
                int i6 = IAuthTabCallback + 39;
                onNavigationEvent = i6 % 128;
                j2 = i6 % 2 == 0 ? 1L : 0L;
                int i7 = 2 % 2;
            } else {
                j2 = j;
            }
            String str12 = (i & 64) == 0 ? str5 : "";
            if ((i & 128) != 0) {
                int i8 = onNavigationEvent + 61;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    str8.hashCode();
                    throw null;
                }
            } else {
                str8 = str6;
            }
            this(str7, str9, str10, str11, d2, j2, str12, str8);
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.productId;
            int i5 = i3 + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.loanReqNo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 83;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.logoImageUrl;
            int i4 = i2 + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return str;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = this.limitAmount;
            int i4 = i2 + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.companyName;
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.badgeText;
            int i5 = i2 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(this.interestRate) + "%";
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public final Product onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Product product = this.maxLimitAmountResult;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return product;
    }
}
