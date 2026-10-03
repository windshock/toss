package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda23;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda8;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeService {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final LoanHomeCreditPeerAverageInfo creditPeerAverageInfo;
    private final String iconUrl;
    private final String landingUrl;
    private final String loanStatus;
    private final LoanHomeServiceSummaryResult summaryResult;
    private final String title;
    private final String type;

    static {
        int i = onNavigationEvent + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public LoanHomeService() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (LoanHomeServiceSummaryResult) null, (LoanHomeCreditPeerAverageInfo) null, 127, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHomeService)) {
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        LoanHomeService loanHomeService = (LoanHomeService) obj;
        if (!Intrinsics.areEqual(this.iconUrl, loanHomeService.iconUrl)) {
            int i6 = onExtraCallback + 121;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.title, loanHomeService.title) || !Intrinsics.areEqual(this.type, loanHomeService.type) || !Intrinsics.areEqual(this.loanStatus, loanHomeService.loanStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, loanHomeService.landingUrl)) {
            int i7 = onExtraCallback + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.summaryResult, loanHomeService.summaryResult)) {
            return Intrinsics.areEqual(this.creditPeerAverageInfo, loanHomeService.creditPeerAverageInfo);
        }
        int i9 = onExtraCallback + 19;
        onExtraCallbackWithResult = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.type.hashCode();
        int iHashCode5 = this.loanStatus.hashCode();
        int iHashCode6 = this.landingUrl.hashCode();
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResult = this.summaryResult;
        int iHashCode7 = 0;
        if (loanHomeServiceSummaryResult == null) {
            int i4 = onExtraCallbackWithResult + 79;
            onExtraCallback = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = loanHomeServiceSummaryResult.hashCode();
        }
        LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo = this.creditPeerAverageInfo;
        if (loanHomeCreditPeerAverageInfo != null) {
            int i5 = onExtraCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int iHashCode8 = loanHomeCreditPeerAverageInfo.hashCode();
                int i6 = 53 / 0;
                iHashCode7 = iHashCode8;
            } else {
                iHashCode7 = loanHomeCreditPeerAverageInfo.hashCode();
            }
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeService(iconUrl=" + this.iconUrl + ", title=" + this.title + ", type=" + this.type + ", loanStatus=" + this.loanStatus + ", landingUrl=" + this.landingUrl + ", summaryResult=" + this.summaryResult + ", creditPeerAverageInfo=" + this.creditPeerAverageInfo + ")";
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanHomeService> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeService$$serializer loanHomeService$$serializer = LoanHomeService$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return loanHomeService$$serializer;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanHomeService(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult r8, viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo r9, o.okycx r10) {
        /*
            r1 = this;
            r1.<init>()
            r10 = r2 & 1
            java.lang.String r0 = ""
            if (r10 != 0) goto Lc
            r1.iconUrl = r0
            goto Le
        Lc:
            r1.iconUrl = r3
        Le:
            r3 = r2 & 2
            r10 = 2
            if (r3 != 0) goto L18
            r1.title = r0
            int r3 = r10 % r10
            goto L1a
        L18:
            r1.title = r4
        L1a:
            r3 = r2 & 4
            r4 = 0
            if (r3 != 0) goto L30
            int r3 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult
            int r3 = r3 + 15
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback = r5
            int r3 = r3 % r10
            r1.type = r0
            if (r3 == 0) goto L2f
        L2c:
            int r3 = r10 % r10
            goto L3d
        L2f:
            throw r4
        L30:
            r1.type = r5
            int r3 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult
            int r3 = r3 + 23
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback = r5
            int r3 = r3 % r10
            if (r3 != 0) goto L2c
        L3d:
            r3 = r2 & 8
            if (r3 != 0) goto L44
            r1.loanStatus = r0
            goto L46
        L44:
            r1.loanStatus = r6
        L46:
            r3 = r2 & 16
            if (r3 != 0) goto L56
            int r3 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback
            int r3 = r3 + 47
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult = r5
            int r3 = r3 % r10
            r1.landingUrl = r0
            goto L5a
        L56:
            r1.landingUrl = r7
            int r3 = r10 % r10
        L5a:
            r3 = r2 & 32
            if (r3 != 0) goto L61
            r1.summaryResult = r4
            goto L63
        L61:
            r1.summaryResult = r8
        L63:
            r2 = r2 & 64
            if (r2 != 0) goto L73
            int r2 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult
            int r2 = r2 + 79
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback = r3
            int r2 = r2 % r10
            r1.creditPeerAverageInfo = r4
            return
        L73:
            r1.creditPeerAverageInfo = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeService.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult, viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo, o.okycx):void");
    }

    public LoanHomeService(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, @Nullable LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.iconUrl = str;
        this.title = str2;
        this.type = str3;
        this.loanStatus = str4;
        this.landingUrl = str5;
        this.summaryResult = loanHomeServiceSummaryResult;
        this.creditPeerAverageInfo = loanHomeCreditPeerAverageInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeService r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = ""
            if (r2 == 0) goto L16
            java.lang.String r2 = r6.iconUrl
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L24
        L16:
            java.lang.String r2 = r6.iconUrl
            r7.onExtraCallback(r8, r1, r2)
            int r1 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
        L24:
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L3b
            int r1 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r1 = r6.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L40
        L3b:
            java.lang.String r1 = r6.title
            r7.onExtraCallback(r8, r3, r1)
        L40:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L4e
            java.lang.String r1 = r6.type
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L53
        L4e:
            java.lang.String r1 = r6.type
            r7.onExtraCallback(r8, r0, r1)
        L53:
            r1 = 3
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L6b
            int r2 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult
            int r2 = r2 + 105
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback = r5
            int r2 = r2 % r0
            java.lang.String r2 = r6.loanStatus
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L70
        L6b:
            java.lang.String r2 = r6.loanStatus
            r7.onExtraCallback(r8, r1, r2)
        L70:
            r1 = 4
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L89
            int r2 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback
            int r2 = r2 + 29
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            java.lang.String r2 = r6.landingUrl
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L8e
        L89:
            java.lang.String r2 = r6.landingUrl
            r7.onExtraCallback(r8, r1, r2)
        L8e:
            r1 = 5
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 == 0) goto L96
            goto La5
        L96:
            int r2 = viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallbackWithResult
            int r2 = r2 + 77
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto Lbf
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult r0 = r6.summaryResult
            if (r0 == 0) goto Lac
        La5:
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult$$serializer r0 = viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult r2 = r6.summaryResult
            r7.onExtraCallbackWithResult(r8, r1, r0, r2)
        Lac:
            r0 = 6
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto Lb7
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo r1 = r6.creditPeerAverageInfo
            if (r1 == 0) goto Lbe
        Lb7:
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo r6 = r6.creditPeerAverageInfo
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
        Lbe:
            return
        Lbf:
            viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult r6 = r6.summaryResult
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeService.onExtraCallback(viva.republica.toss.network.model.loan.LoanHomeService, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeService(String str, String str2, String str3, String str4, String str5, LoanHomeServiceSummaryResult loanHomeServiceSummaryResult, LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResult2;
        LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo2;
        String str9 = "";
        String str10 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 121;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 33 / 0;
            }
            str8 = "";
        } else {
            str8 = str4;
        }
        Object obj = null;
        if ((i & 16) != 0) {
            int i8 = onExtraCallback + 81;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = onExtraCallbackWithResult + 39;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            loanHomeServiceSummaryResult2 = null;
        } else {
            loanHomeServiceSummaryResult2 = loanHomeServiceSummaryResult;
        }
        if ((i & 64) != 0) {
            int i11 = onExtraCallback + 95;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            loanHomeCreditPeerAverageInfo2 = null;
        } else {
            loanHomeCreditPeerAverageInfo2 = loanHomeCreditPeerAverageInfo;
        }
        this(str10, str6, str7, str8, str9, loanHomeServiceSummaryResult2, loanHomeCreditPeerAverageInfo2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.loanStatus;
        int i4 = i3 + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return str;
    }

    public final LoanHomeServiceSummaryResult onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResult = this.summaryResult;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return loanHomeServiceSummaryResult;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 IAuthTabCallback() {
        int i = 2 % 2;
        String str = this.type;
        switch (str.hashCode()) {
            case -1724093249:
                if (!(!str.equals("CARD_LOAN"))) {
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.CARD_LOAN;
                }
                break;
            case -1665936717:
                if (!(!str.equals("MORTGAGE_LOAN"))) {
                    int i2 = onExtraCallbackWithResult + 19;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.MORTGAGE_LOAN;
                    }
                    ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23 = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.MORTGAGE_LOAN;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                break;
            case -583246037:
                if (str.equals("REFINANCING_LOAN")) {
                    ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda232 = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.REFINANCING_LOAN;
                    int i3 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 47 / 0;
                    }
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda232;
                }
                break;
            case -345823965:
                if (str.equals("JEONSE_LOAN")) {
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.JEONSE_LOAN;
                }
                break;
            case -15194623:
                if (str.equals("MORTGAGE_REFINANCING")) {
                    ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda233 = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.MORTGAGE_REFINANCING;
                    int i5 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda233;
                }
                break;
            case 812397969:
                if (str.equals("JEONSE_REFINANCING")) {
                    int i7 = onExtraCallbackWithResult + 55;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda234 = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.JEONSE_REFINANCING;
                    int i9 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 47 / 0;
                    }
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda234;
                }
                break;
            case 1879001718:
                if (str.equals("CREDIT_LOAN")) {
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.CREDIT_LOAN;
                }
                break;
        }
        return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.UNKNOWN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 onNavigationEvent() {
        int i = 2 % 2;
        String str = this.loanStatus;
        switch (str.hashCode()) {
            case -2011454200:
                if (!(!str.equals("PRE_SCREENING_APPROVE"))) {
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda8.PRE_SCREENING_APPROVE;
                }
                break;
            case -385922169:
                if (str.equals("PRE_SCREENING_DONE")) {
                    ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8 = ImagePipelineExperimentsBuilderExternalSyntheticLambda8.PRE_SCREENING_DONE;
                    int i2 = onExtraCallback + 13;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 15 / 0;
                    }
                    return imagePipelineExperimentsBuilderExternalSyntheticLambda8;
                }
                break;
            case -385876189:
                if (str.equals("PRE_SCREENING_FAIL")) {
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda8.PRE_SCREENING_FAIL;
                }
                break;
            case -122710966:
                if (str.equals("PRE_SCREENING_REQUEST")) {
                    int i4 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return ImagePipelineExperimentsBuilderExternalSyntheticLambda8.PRE_SCREENING_REQUEST;
                }
                break;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda82 = ImagePipelineExperimentsBuilderExternalSyntheticLambda8.INIT;
        int i6 = onExtraCallback + 95;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda82;
    }
}
