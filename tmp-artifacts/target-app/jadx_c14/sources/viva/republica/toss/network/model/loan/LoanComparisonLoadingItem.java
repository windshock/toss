package viva.republica.toss.network.model.loan;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonLoadingItem {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final long amount;
    private final String companyLogoUrl;
    private final String companyName;
    private final float interestRate;
    private final boolean isMortgage;
    private final String loanReqNo;
    private final String productName;

    static {
        int i = onExtraCallback + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i2;
        int i11 = ~i;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i2 + i4 + ((-327997910) * i6) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i2) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i4) + (36700160 * i6) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i2 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i4 * (-238134313)) + (i6 * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        return i19 + ((i20 * i20) * 1404239872) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanComparisonLoadingItem)) {
            return false;
        }
        LoanComparisonLoadingItem loanComparisonLoadingItem = (LoanComparisonLoadingItem) obj;
        if (!Intrinsics.areEqual(this.loanReqNo, loanComparisonLoadingItem.loanReqNo)) {
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.companyName, loanComparisonLoadingItem.companyName)) {
            int i5 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.companyLogoUrl, loanComparisonLoadingItem.companyLogoUrl) || !Intrinsics.areEqual(this.productName, loanComparisonLoadingItem.productName)) {
            return false;
        }
        if (Float.compare(this.interestRate, loanComparisonLoadingItem.interestRate) != 0) {
            int i7 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.amount == loanComparisonLoadingItem.amount) {
            return this.isMortgage == loanComparisonLoadingItem.isMortgage;
        }
        int i9 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.loanReqNo.hashCode() * 31) + this.companyName.hashCode()) * 31) + this.companyLogoUrl.hashCode()) * 31) + this.productName.hashCode()) * 31) + Float.hashCode(this.interestRate)) * 31) + Long.hashCode(this.amount)) * 31) + Boolean.hashCode(this.isMortgage);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonLoadingItem(loanReqNo=" + this.loanReqNo + ", companyName=" + this.companyName + ", companyLogoUrl=" + this.companyLogoUrl + ", productName=" + this.productName + ", interestRate=" + this.interestRate + ", amount=" + this.amount + ", isMortgage=" + this.isMortgage + ")";
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonLoadingItem> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonLoadingItem$$serializer loanComparisonLoadingItem$$serializer = LoanComparisonLoadingItem$$serializer.INSTANCE;
            if (i3 != 0) {
                return loanComparisonLoadingItem$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ LoanComparisonLoadingItem(int i, String str, String str2, String str3, String str4, float f, long j, boolean z, okycx okycxVar) {
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, LoanComparisonLoadingItem$$serializer.INSTANCE.getDescriptor());
        }
        this.loanReqNo = str;
        this.companyName = str2;
        this.companyLogoUrl = str3;
        this.productName = str4;
        if ((i & 16) == 0) {
            this.interestRate = 0.0f;
        } else {
            this.interestRate = f;
            int i2 = 2 % 2;
        }
        if ((i & 32) == 0) {
            int i3 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i3 % 128;
            this.amount = i3 % 2 != 0 ? 1L : 0L;
        } else {
            this.amount = j;
        }
        if ((i & 64) != 0) {
            this.isMortgage = z;
            return;
        }
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.isMortgage = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanComparisonLoadingItem r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onExtraCallbackWithResult
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onNavigationEvent = r2
            int r1 = r1 % r0
            r1 = 0
            java.lang.String r2 = r7.loanReqNo
            r8.onExtraCallback(r9, r1, r2)
            java.lang.String r1 = r7.companyName
            r2 = 1
            r8.onExtraCallback(r9, r2, r1)
            java.lang.String r1 = r7.companyLogoUrl
            r8.onExtraCallback(r9, r0, r1)
            r1 = 3
            java.lang.String r3 = r7.productName
            r8.onExtraCallback(r9, r1, r3)
            r1 = 4
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto L33
            float r3 = r7.interestRate
            r4 = 0
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L38
        L33:
            float r3 = r7.interestRate
            r8.onExtraCallback(r9, r1, r3)
        L38:
            r1 = 5
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto L50
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onExtraCallbackWithResult
            int r3 = r3 + 21
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onNavigationEvent = r4
            int r3 = r3 % r0
            long r3 = r7.amount
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L55
        L50:
            long r3 = r7.amount
            r8.onExtraCallback(r9, r1, r3)
        L55:
            r1 = 6
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto L69
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onExtraCallbackWithResult
            int r3 = r3 + 91
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onNavigationEvent = r4
            int r3 = r3 % r0
            boolean r3 = r7.isMortgage
            if (r3 == 0) goto L76
        L69:
            boolean r7 = r7.isMortgage
            r8.onNavigationEvent(r9, r1, r7)
            int r7 = viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onNavigationEvent
            int r7 = r7 + r2
            int r8 = r7 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onExtraCallbackWithResult = r8
            int r7 = r7 % r0
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonLoadingItem.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanComparisonLoadingItem, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.loanReqNo;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyName;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyLogoUrl;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productName;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanComparisonLoadingItem loanComparisonLoadingItem = (LoanComparisonLoadingItem) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = loanComparisonLoadingItem.interestRate;
        int i5 = i2 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf(f);
        }
        int i6 = 41 / 0;
        return Float.valueOf(f);
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        int i3 = 86 / 0;
        return this.amount;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanComparisonLoadingItem loanComparisonLoadingItem = (LoanComparisonLoadingItem) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = loanComparisonLoadingItem.isMortgage;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return Boolean.valueOf(z);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        String str = this.interestRate + "%";
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        String str = this.companyName + this.productName + this.amount;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final float onExtraCallbackWithResult() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Float) onExtraCallback(iOnExtraCallback, -1428407773, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 1428407773, iOnExtraCallback3, new Object[]{this})).floatValue();
    }

    public final boolean asBinder() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) onExtraCallback(iOnExtraCallback, -1377439014, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 1377439015, iOnExtraCallback3, new Object[]{this})).booleanValue();
    }
}
