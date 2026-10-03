package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeExtensiveFeature {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long clickLogId;
    private final String iconUrl;
    private final long impressionLogId;
    private final String scheme;
    private final String title;

    static {
        int i = onWarmupCompleted + 45;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public LoanHomeExtensiveFeature() {
        this((String) null, (String) null, (String) null, 0L, 0L, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHomeExtensiveFeature)) {
            return false;
        }
        LoanHomeExtensiveFeature loanHomeExtensiveFeature = (LoanHomeExtensiveFeature) obj;
        if (!Intrinsics.areEqual(this.iconUrl, loanHomeExtensiveFeature.iconUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, loanHomeExtensiveFeature.title)) {
            int i3 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.scheme, loanHomeExtensiveFeature.scheme)) {
            int i5 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.impressionLogId == loanHomeExtensiveFeature.impressionLogId) {
            return this.clickLogId == loanHomeExtensiveFeature.clickLogId;
        }
        int i7 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.iconUrl;
        if (str == null) {
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.title.hashCode();
        String str2 = this.scheme;
        int iHashCode3 = (((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.impressionLogId)) * 31) + Long.hashCode(this.clickLogId);
        int i4 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeExtensiveFeature(iconUrl=" + this.iconUrl + ", title=" + this.title + ", scheme=" + this.scheme + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ")";
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanHomeExtensiveFeature> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeExtensiveFeature$$serializer loanHomeExtensiveFeature$$serializer = LoanHomeExtensiveFeature$$serializer.INSTANCE;
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return loanHomeExtensiveFeature$$serializer;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanHomeExtensiveFeature(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, long r9, o.okycx r11) {
        /*
            r2 = this;
            r2.<init>()
            r11 = r3 & 1
            r0 = 0
            r1 = 2
            if (r11 != 0) goto L17
            r2.iconUrl = r0
            int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent
            int r4 = r4 + 113
            int r11 = r4 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult = r11
            int r4 = r4 % r1
            int r4 = r1 % r1
            goto L19
        L17:
            r2.iconUrl = r4
        L19:
            r4 = r3 & 2
            if (r4 != 0) goto L22
            java.lang.String r4 = ""
            r2.title = r4
            goto L32
        L22:
            r2.title = r5
            int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult
            int r4 = r4 + 37
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent = r5
            int r4 = r4 % r1
            if (r4 != 0) goto L30
            goto L32
        L30:
            int r4 = r1 % r1
        L32:
            r4 = r3 & 4
            if (r4 != 0) goto L3b
            r2.scheme = r0
        L38:
            int r4 = r1 % r1
            goto L48
        L3b:
            r2.scheme = r6
            int r4 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent
            int r4 = r4 + 57
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult = r5
            int r4 = r4 % r1
            if (r4 == 0) goto L38
        L48:
            r4 = r3 & 8
            r5 = -1
            if (r4 != 0) goto L51
            r2.impressionLogId = r5
            goto L53
        L51:
            r2.impressionLogId = r7
        L53:
            r3 = r3 & 16
            if (r3 != 0) goto L63
            r2.clickLogId = r5
            int r3 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult
            int r3 = r3 + 61
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent = r4
            int r3 = r3 % r1
            return
        L63:
            r2.clickLogId = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.<init>(int, java.lang.String, java.lang.String, java.lang.String, long, long, o.okycx):void");
    }

    public LoanHomeExtensiveFeature(@Nullable String str, @NotNull String str2, @Nullable String str3, long j, long j2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.iconUrl = str;
        this.title = str2;
        this.scheme = str3;
        this.impressionLogId = j;
        this.clickLogId = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent
            int r1 = r1 + 7
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = r7.onWarmupCompleted(r8, r2)
            if (r1 != 0) goto L20
            goto L1c
        L16:
            boolean r1 = r7.onWarmupCompleted(r8, r2)
            if (r1 != 0) goto L20
        L1c:
            java.lang.String r1 = r6.iconUrl
            if (r1 == 0) goto L27
        L20:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r6.iconUrl
            r7.onExtraCallbackWithResult(r8, r2, r1, r3)
        L27:
            r1 = 1
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 == 0) goto L2f
            goto L44
        L2f:
            int r2 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent
            int r2 = r2 + 47
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            if (r2 != 0) goto L8a
            java.lang.String r2 = r6.title
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L52
        L44:
            java.lang.String r2 = r6.title
            r7.onExtraCallback(r8, r1, r2)
            int r1 = viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent
            int r1 = r1 + 61
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
        L52:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L5c
            java.lang.String r1 = r6.scheme
            if (r1 == 0) goto L63
        L5c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r6.scheme
            r7.onExtraCallbackWithResult(r8, r0, r1, r2)
        L63:
            r0 = 3
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            r2 = -1
            if (r1 != 0) goto L72
            long r4 = r6.impressionLogId
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L77
        L72:
            long r4 = r6.impressionLogId
            r7.onExtraCallback(r8, r0, r4)
        L77:
            r0 = 4
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L84
            long r4 = r6.clickLogId
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L89
        L84:
            long r1 = r6.clickLogId
            r7.onExtraCallback(r8, r0, r1)
        L89:
            return
        L8a:
            java.lang.String r6 = r6.title
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature.onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeExtensiveFeature, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeExtensiveFeature(String str, String str2, String str3, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str4 = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
        } else {
            str4 = str3;
        }
        long j4 = -1;
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            j3 = -1;
        } else {
            j3 = j;
        }
        if ((i & 16) != 0) {
            int i11 = 2 % 2;
        } else {
            j4 = j2;
        }
        this(str, str5, str4, j3, j4);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.iconUrl;
            int i4 = 45 / 0;
        } else {
            str = this.iconUrl;
        }
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.impressionLogId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.clickLogId;
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return j;
    }
}
