package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonIntroTypeSelectionRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String introKey;
    private final String referrer;
    private final String serviceReferrer;

    static {
        int i = onExtraCallback + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public LoanComparisonIntroTypeSelectionRequest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanComparisonIntroTypeSelectionRequest)) {
            return false;
        }
        LoanComparisonIntroTypeSelectionRequest loanComparisonIntroTypeSelectionRequest = (LoanComparisonIntroTypeSelectionRequest) obj;
        if (!Intrinsics.areEqual(this.introKey, loanComparisonIntroTypeSelectionRequest.introKey)) {
            return false;
        }
        if (Intrinsics.areEqual(this.referrer, loanComparisonIntroTypeSelectionRequest.referrer)) {
            if (Intrinsics.areEqual(this.serviceReferrer, loanComparisonIntroTypeSelectionRequest.serviceReferrer)) {
                return true;
            }
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onNavigationEvent + 29;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 75;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.introKey;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.referrer;
        if (str2 == null) {
            int i4 = onWarmupCompleted + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.serviceReferrer;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i6 = onWarmupCompleted + 13;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = 0;
        }
        int i8 = (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
        int i9 = onNavigationEvent + 99;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 4 / 0;
        }
        return i8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonIntroTypeSelectionRequest(introKey=" + this.introKey + ", referrer=" + this.referrer + ", serviceReferrer=" + this.serviceReferrer + ")";
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
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

        public final KSerializer<LoanComparisonIntroTypeSelectionRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonIntroTypeSelectionRequest$.serializer serializerVar = LoanComparisonIntroTypeSelectionRequest$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanComparisonIntroTypeSelectionRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.introKey = null;
        } else {
            this.introKey = str;
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.referrer = null;
        } else {
            this.referrer = str2;
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = 2 % 2;
        if ((i & 4) != 0) {
            this.serviceReferrer = str3;
            return;
        }
        int i7 = onNavigationEvent + 123;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        this.serviceReferrer = null;
        if (i8 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public LoanComparisonIntroTypeSelectionRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.introKey = str;
        this.referrer = str2;
        this.serviceReferrer = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L1e
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest.onWarmupCompleted
            int r2 = r2 + 113
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.introKey
            if (r2 == 0) goto L25
            goto L1e
        L1a:
            java.lang.String r4 = r4.introKey
            r4 = 0
            throw r4
        L1e:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.introKey
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L25:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            r2 = r2 ^ r1
            if (r2 == r1) goto L2e
            goto L3b
        L2e:
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest.onNavigationEvent
            int r2 = r2 + 81
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest.onWarmupCompleted = r3
            int r2 = r2 % r0
            java.lang.String r2 = r4.referrer
            if (r2 == 0) goto L42
        L3b:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.referrer
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L42:
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L4c
            java.lang.String r1 = r4.serviceReferrer
            if (r1 == 0) goto L53
        L4c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.serviceReferrer
            r5.onExtraCallbackWithResult(r6, r0, r1, r4)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonIntroTypeSelectionRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 117;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 95;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 5;
            } else {
                int i7 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = onWarmupCompleted + 19;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i10 = onWarmupCompleted + 63;
            int i11 = i10 % 128;
            onNavigationEvent = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 41;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }
}
