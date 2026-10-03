package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdScrollView {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("accountList")
    private List<IAuthTabCallback> accountList;

    @SerializedName("openBankingAgreed")
    private boolean openBankingAgreed;

    @SerializedName("openBankingInquiryAgreed")
    private boolean openBankingInquiryAgreed;

    @SerializedName("restrictYouthUser")
    private boolean restrictYouthUser;

    @SerializedName("userNo")
    private long userNo;

    @SerializedName("verifyingMethod")
    private String verifyingMethod;

    public NativeAdScrollView(long j, @NotNull String str, @NotNull List<IAuthTabCallback> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.userNo = j;
        this.verifyingMethod = str;
        this.accountList = list;
        this.openBankingAgreed = z;
        this.openBankingInquiryAgreed = z2;
        this.restrictYouthUser = z3;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("accountGroupName")
        private String accountGroupName;

        @SerializedName("bankAccountNo")
        private String bankAccountNo;

        @SerializedName("bankCode")
        private int bankCode;

        @SerializedName("requesterCode")
        private String requesterCode;

        @SerializedName("sessionId")
        private Long sessionId;

        @SerializedName("sessionType")
        private String sessionType;

        @SerializedName("signId")
        private long signId;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 89;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.accountGroupName, iAuthTabCallback.accountGroupName)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.bankAccountNo, iAuthTabCallback.bankAccountNo)) {
                int i3 = onNavigationEvent + 89;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.bankCode != iAuthTabCallback.bankCode) {
                int i5 = onNavigationEvent + 59;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.signId != iAuthTabCallback.signId) {
                return false;
            }
            if (!Intrinsics.areEqual(this.sessionId, iAuthTabCallback.sessionId)) {
                int i7 = onNavigationEvent + 105;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 28 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.sessionType, iAuthTabCallback.sessionType)) {
                return false;
            }
            if (Intrinsics.areEqual(this.requesterCode, iAuthTabCallback.requesterCode)) {
                return true;
            }
            int i9 = onNavigationEvent + 65;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
          0x001c: PHI (r1v19 java.lang.String) = (r1v4 java.lang.String), (r1v21 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
          0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.NativeAdScrollView.IAuthTabCallback.onNavigationEvent
                int r1 = r1 + 29
                int r2 = r1 % 128
                o.NativeAdScrollView.IAuthTabCallback.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L15
                java.lang.String r1 = r10.accountGroupName
                r3 = 1
                if (r1 != 0) goto L1c
                goto L1a
            L15:
                java.lang.String r1 = r10.accountGroupName
                r3 = r2
                if (r1 != 0) goto L1c
            L1a:
                r1 = r2
                goto L20
            L1c:
                int r1 = r1.hashCode()
            L20:
                java.lang.String r4 = r10.bankAccountNo
                int r4 = r4.hashCode()
                int r5 = r10.bankCode
                int r5 = java.lang.Integer.hashCode(r5)
                long r6 = r10.signId
                int r6 = java.lang.Long.hashCode(r6)
                java.lang.Long r7 = r10.sessionId
                if (r7 != 0) goto L41
                int r7 = o.NativeAdScrollView.IAuthTabCallback.onNavigationEvent
                int r7 = r7 + 37
                int r8 = r7 % 128
                o.NativeAdScrollView.IAuthTabCallback.onExtraCallback = r8
                int r7 = r7 % r0
                r7 = r2
                goto L45
            L41:
                int r7 = r7.hashCode()
            L45:
                java.lang.String r8 = r10.sessionType
                if (r8 != 0) goto L58
                int r8 = o.NativeAdScrollView.IAuthTabCallback.onExtraCallback
                int r8 = r8 + 115
                int r9 = r8 % 128
                o.NativeAdScrollView.IAuthTabCallback.onNavigationEvent = r9
                int r8 = r8 % r0
                if (r8 != 0) goto L5c
                r8 = 5
                int r8 = r8 / 3
                goto L5c
            L58:
                int r2 = r8.hashCode()
            L5c:
                java.lang.String r8 = r10.requesterCode
                if (r8 == 0) goto L78
                int r3 = o.NativeAdScrollView.IAuthTabCallback.onExtraCallback
                int r3 = r3 + 65
                int r9 = r3 % 128
                o.NativeAdScrollView.IAuthTabCallback.onNavigationEvent = r9
                int r3 = r3 % r0
                if (r3 == 0) goto L70
                int r3 = r8.hashCode()
                goto L78
            L70:
                r8.hashCode()
                r0 = 0
                r0.hashCode()
                throw r0
            L78:
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r5
                int r1 = r1 * 31
                int r1 = r1 + r6
                int r1 = r1 * 31
                int r1 = r1 + r7
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r1 = r1 + r3
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NativeAdScrollView.IAuthTabCallback.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TossCertAccount(accountGroupName=" + this.accountGroupName + ", bankAccountNo=" + this.bankAccountNo + ", bankCode=" + this.bankCode + ", signId=" + this.signId + ", sessionId=" + this.sessionId + ", sessionType=" + this.sessionType + ", requesterCode=" + this.requesterCode + ")";
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@Nullable String str, @NotNull String str2, int i, long j, @Nullable Long l, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.accountGroupName = str;
            this.bankAccountNo = str2;
            this.bankCode = i;
            this.signId = j;
            this.sessionId = l;
            this.sessionType = str3;
            this.requesterCode = str4;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddAccountWithTossCertRequest(userNo=" + this.userNo + ", verifyingMethod=" + this.verifyingMethod + ", openBankingAgreed=" + this.openBankingAgreed + ", openBankingInquiryAgreed=" + this.openBankingInquiryAgreed + ", restrictYouthUser=" + this.restrictYouthUser + ", accountList=" + this.accountList + ")";
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
