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
public final class LoanHomeCreditPeerAverageInfo {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final BottomSheetContent bottomSheetContent;
    private final String creditPeerAverageInterestAmountDiff;
    private final int creditScore;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public LoanHomeCreditPeerAverageInfo() {
        this((String) null, 0, (BottomSheetContent) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHomeCreditPeerAverageInfo)) {
            return false;
        }
        LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo = (LoanHomeCreditPeerAverageInfo) obj;
        if (!Intrinsics.areEqual(this.creditPeerAverageInterestAmountDiff, loanHomeCreditPeerAverageInfo.creditPeerAverageInterestAmountDiff)) {
            int i3 = onExtraCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.creditScore != loanHomeCreditPeerAverageInfo.creditScore || !Intrinsics.areEqual(this.bottomSheetContent, loanHomeCreditPeerAverageInfo.bottomSheetContent)) {
            return false;
        }
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.creditPeerAverageInterestAmountDiff.hashCode() % 63) >> Integer.hashCode(this.creditScore)) + 98) >> this.bottomSheetContent.hashCode() : (((this.creditPeerAverageInterestAmountDiff.hashCode() * 31) + Integer.hashCode(this.creditScore)) * 31) + this.bottomSheetContent.hashCode();
        int i3 = onExtraCallback + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeCreditPeerAverageInfo(creditPeerAverageInterestAmountDiff=" + this.creditPeerAverageInterestAmountDiff + ", creditScore=" + this.creditScore + ", bottomSheetContent=" + this.bottomSheetContent + ")";
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
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

        public final KSerializer<LoanHomeCreditPeerAverageInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                LoanHomeCreditPeerAverageInfo$$serializer loanHomeCreditPeerAverageInfo$$serializer = LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            LoanHomeCreditPeerAverageInfo$$serializer loanHomeCreditPeerAverageInfo$$serializer2 = LoanHomeCreditPeerAverageInfo$$serializer.INSTANCE;
            int i3 = onExtraCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return loanHomeCreditPeerAverageInfo$$serializer2;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanHomeCreditPeerAverageInfo(int i, String str, int i2, BottomSheetContent bottomSheetContent, okycx okycxVar) {
        this.creditPeerAverageInterestAmountDiff = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            int i3 = onNavigationEvent + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.creditScore = 0;
            int i5 = 2 % 2;
        } else {
            this.creditScore = i2;
        }
        if ((i & 4) != 0) {
            this.bottomSheetContent = bottomSheetContent;
            return;
        }
        this.bottomSheetContent = new BottomSheetContent((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        int i6 = onExtraCallback + 103;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
    }

    public LoanHomeCreditPeerAverageInfo(@NotNull String str, int i, @NotNull BottomSheetContent bottomSheetContent) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bottomSheetContent, "");
        this.creditPeerAverageInterestAmountDiff = str;
        this.creditScore = i;
        this.bottomSheetContent = bottomSheetContent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo r13, o.vyl r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r14.onWarmupCompleted(r15, r1)
            if (r2 != 0) goto L1d
            int r2 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onNavigationEvent
            int r2 = r2 + 53
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r13.creditPeerAverageInterestAmountDiff
            java.lang.String r3 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L2b
        L1d:
            java.lang.String r2 = r13.creditPeerAverageInterestAmountDiff
            r14.onExtraCallback(r15, r1, r2)
            int r1 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onNavigationEvent
            int r1 = r1 + 85
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onExtraCallback = r2
            int r1 = r1 % r0
        L2b:
            r1 = 1
            boolean r2 = r14.onWarmupCompleted(r15, r1)
            r3 = 0
            if (r2 != 0) goto L49
            int r2 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onNavigationEvent
            int r2 = r2 + 61
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onExtraCallback = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L43
            int r2 = r13.creditScore
            if (r2 == 0) goto L4e
            goto L49
        L43:
            int r13 = r13.creditScore
            r3.hashCode()
            throw r3
        L49:
            int r2 = r13.creditScore
            r14.onExtraCallback(r15, r1, r2)
        L4e:
            boolean r2 = r14.onWarmupCompleted(r15, r0)
            if (r2 != 0) goto L6c
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent r2 = r13.bottomSheetContent
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent r12 = new viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 31
            r11 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r12)
            r2 = r2 ^ r1
            if (r2 == r1) goto L6c
            goto L73
        L6c:
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer r1 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent r13 = r13.bottomSheetContent
            r14.onNavigationEvent(r15, r0, r1, r13)
        L73:
            int r13 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onExtraCallback
            int r13 = r13 + 39
            int r14 = r13 % 128
            viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.onNavigationEvent = r14
            int r13 = r13 % r0
            if (r13 == 0) goto L7f
            return
        L7f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public /* synthetic */ LoanHomeCreditPeerAverageInfo(String str, int i, BottomSheetContent bottomSheetContent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback;
            int i5 = i4 + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 63;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            } else {
                int i9 = 2 % 2;
            }
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bottomSheetContent = new BottomSheetContent((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            int i10 = onNavigationEvent + 95;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        this(str, i, bottomSheetContent);
    }

    @liq
    public static final class BottomSheetContent {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String iconUrl;
        private final String lowerText;
        private final String subtitle;
        private final String title;
        private final String upperText;

        static {
            int i = onExtraCallbackWithResult + 99;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public BottomSheetContent() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetContent)) {
                return false;
            }
            BottomSheetContent bottomSheetContent = (BottomSheetContent) obj;
            if (!Intrinsics.areEqual(this.title, bottomSheetContent.title)) {
                int i2 = onWarmupCompleted + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.subtitle, bottomSheetContent.subtitle)) {
                int i4 = onNavigationEvent + 19;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.upperText, bottomSheetContent.upperText)) {
                int i5 = onNavigationEvent + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.lowerText, bottomSheetContent.lowerText)) {
                return Intrinsics.areEqual(this.iconUrl, bottomSheetContent.iconUrl);
            }
            int i7 = onNavigationEvent + 107;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.upperText.hashCode()) * 31) + this.lowerText.hashCode()) * 31) + this.iconUrl.hashCode();
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomSheetContent(title=" + this.title + ", subtitle=" + this.subtitle + ", upperText=" + this.upperText + ", lowerText=" + this.lowerText + ", iconUrl=" + this.iconUrl + ")";
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BottomSheetContent> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer loanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer = LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE;
                if (i3 == 0) {
                    int i4 = 52 / 0;
                }
                return loanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer;
            }
        }

        public /* synthetic */ BottomSheetContent(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.title = "";
                int i2 = onNavigationEvent + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
                int i4 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.upperText = "";
                int i5 = 2 % 2;
            } else {
                this.upperText = str3;
            }
            if ((i & 8) == 0) {
                this.lowerText = "";
                int i6 = 2 % 2;
            } else {
                this.lowerText = str4;
            }
            if ((i & 16) != 0) {
                this.iconUrl = str5;
                return;
            }
            int i7 = onWarmupCompleted + 3;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            this.iconUrl = "";
            if (i9 == 0) {
                int i10 = 47 / 0;
            }
            int i11 = i8 + 71;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }

        public BottomSheetContent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.title = str;
            this.subtitle = str2;
            this.upperText = str3;
            this.lowerText = str4;
            this.iconUrl = str5;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                java.lang.String r3 = ""
                if (r2 == 0) goto Ld
                goto L15
            Ld:
                java.lang.String r2 = r5.title
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L1a
            L15:
                java.lang.String r2 = r5.title
                r6.onExtraCallback(r7, r1, r2)
            L1a:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L32
                int r2 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent.onNavigationEvent
                int r2 = r2 + 87
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent.onWarmupCompleted = r4
                int r2 = r2 % r0
                java.lang.String r2 = r5.subtitle
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L37
            L32:
                java.lang.String r2 = r5.subtitle
                r6.onExtraCallback(r7, r1, r2)
            L37:
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L5b
                int r2 = viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent.onNavigationEvent
                int r2 = r2 + 51
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent.onWarmupCompleted = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L51
                java.lang.String r2 = r5.upperText
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L60
                goto L5b
            L51:
                java.lang.String r5 = r5.upperText
                kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                r5 = 0
                r5.hashCode()
                throw r5
            L5b:
                java.lang.String r2 = r5.upperText
                r6.onExtraCallback(r7, r0, r2)
            L60:
                r0 = 3
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L71
                java.lang.String r2 = r5.lowerText
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                r2 = r2 ^ r1
                if (r2 == r1) goto L71
                goto L76
            L71:
                java.lang.String r1 = r5.lowerText
                r6.onExtraCallback(r7, r0, r1)
            L76:
                r0 = 4
                boolean r1 = r6.onWarmupCompleted(r7, r0)
                if (r1 != 0) goto L85
                java.lang.String r1 = r5.iconUrl
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L8a
            L85:
                java.lang.String r5 = r5.iconUrl
                r6.onExtraCallback(r7, r0, r5)
            L8a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo.BottomSheetContent.onNavigationEvent(viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo$BottomSheetContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BottomSheetContent(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            String str8;
            String str9 = "";
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 67;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                str6 = "";
            } else {
                str6 = str2;
            }
            if ((i & 4) != 0) {
                int i6 = onNavigationEvent + 123;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 32 / 0;
                }
                str7 = "";
            } else {
                str7 = str3;
            }
            if ((i & 8) != 0) {
                int i8 = 2 % 2;
                str8 = "";
            } else {
                str8 = str4;
            }
            if ((i & 16) != 0) {
                int i9 = onNavigationEvent + 57;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                int i10 = 2 % 2;
            } else {
                str9 = str5;
            }
            this(str, str6, str7, str8, str9);
        }
    }
}
