package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanCompany {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String companyIconUrl;
    private final String companyName;

    static {
        int i = onExtraCallbackWithResult + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanCompany() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof LoanCompany) {
            LoanCompany loanCompany = (LoanCompany) obj;
            return Intrinsics.areEqual(this.companyName, loanCompany.companyName) && Intrinsics.areEqual(this.companyIconUrl, loanCompany.companyIconUrl);
        }
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.companyName.hashCode() * 31) + this.companyIconUrl.hashCode();
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanCompany(companyName=" + this.companyName + ", companyIconUrl=" + this.companyIconUrl + ")";
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanCompany> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanCompany$$serializer loanCompany$$serializer = LoanCompany$$serializer.INSTANCE;
            if (i3 == 0) {
                return loanCompany$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanCompany(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.companyName = "";
            int i2 = 2 % 2;
        } else {
            this.companyName = str;
        }
        if ((i & 2) == 0) {
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.companyIconUrl = "";
            return;
        }
        this.companyIconUrl = str2;
        int i5 = onWarmupCompleted + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public LoanCompany(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.companyName = str;
        this.companyIconUrl = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanCompany r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanCompany.onWarmupCompleted
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanCompany.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L19
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L29
            goto L21
        L19:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            r1 = r1 ^ r4
            if (r1 == r4) goto L21
            goto L29
        L21:
            java.lang.String r1 = r5.companyName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r4) goto L2e
        L29:
            java.lang.String r1 = r5.companyName
            r6.onExtraCallback(r7, r3, r1)
        L2e:
            boolean r1 = r6.onWarmupCompleted(r7, r4)
            if (r1 != 0) goto L3c
            java.lang.String r1 = r5.companyIconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r4) goto L4e
        L3c:
            java.lang.String r5 = r5.companyIconUrl
            r6.onExtraCallback(r7, r4, r5)
            int r5 = viva.republica.toss.network.model.loan.LoanCompany.onWarmupCompleted
            int r5 = r5 + 19
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanCompany.IAuthTabCallback = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L4e
            r5 = 3
            int r5 = r5 % r0
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanCompany.onNavigationEvent(viva.republica.toss.network.model.loan.LoanCompany, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanCompany(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.companyName;
        int i4 = i2 + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyIconUrl;
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return str;
    }
}
