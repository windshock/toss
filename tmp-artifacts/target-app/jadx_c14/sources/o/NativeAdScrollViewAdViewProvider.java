package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdScrollViewAdViewProvider {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("bankAccountNo")
    private final String bankAccountNo;

    @SerializedName("bankCode")
    private final int bankCode;

    @SerializedName("status")
    private final getNativeAdViewTypeApi status;

    @SerializedName("userMessage")
    private final String userMessage;

    @SerializedName("userTitle")
    private final String userTitle;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdScrollViewAdViewProvider)) {
            return false;
        }
        NativeAdScrollViewAdViewProvider nativeAdScrollViewAdViewProvider = (NativeAdScrollViewAdViewProvider) obj;
        if (this.bankCode != nativeAdScrollViewAdViewProvider.bankCode || (!Intrinsics.areEqual(this.bankAccountNo, nativeAdScrollViewAdViewProvider.bankAccountNo))) {
            return false;
        }
        if (this.status != nativeAdScrollViewAdViewProvider.status) {
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.userTitle, nativeAdScrollViewAdViewProvider.userTitle)) {
            return false;
        }
        if (Intrinsics.areEqual(this.userMessage, nativeAdScrollViewAdViewProvider.userMessage)) {
            int i6 = onExtraCallback + 47;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i7 = onExtraCallback;
        int i8 = i7 + 41;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 111;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r1 r3 r4 r5
      0x0034: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v3 o.getNativeAdViewTypeApi) = (r4v0 o.getNativeAdViewTypeApi), (r4v5 o.getNativeAdViewTypeApi) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r5v10 int) = (r5v0 int), (r5v11 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r3 r5
      0x0032: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r5v1 int) = (r5v0 int), (r5v11 int) binds: [B:8:0x0030, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeAdScrollViewAdViewProvider.IAuthTabCallback
            int r1 = r1 + 3
            int r2 = r1 % 128
            o.NativeAdScrollViewAdViewProvider.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L21
            int r1 = r9.bankCode
            int r1 = java.lang.Integer.hashCode(r1)
            java.lang.String r3 = r9.bankAccountNo
            int r3 = r3.hashCode()
            o.getNativeAdViewTypeApi r4 = r9.status
            r5 = 1
            if (r4 != 0) goto L34
            goto L32
        L21:
            int r1 = r9.bankCode
            int r1 = java.lang.Integer.hashCode(r1)
            java.lang.String r3 = r9.bankAccountNo
            int r3 = r3.hashCode()
            o.getNativeAdViewTypeApi r4 = r9.status
            r5 = r2
            if (r4 != 0) goto L34
        L32:
            r4 = r2
            goto L38
        L34:
            int r4 = r4.hashCode()
        L38:
            java.lang.String r6 = r9.userTitle
            if (r6 != 0) goto L3e
            r6 = r2
            goto L42
        L3e:
            int r6 = r6.hashCode()
        L42:
            java.lang.String r7 = r9.userMessage
            if (r7 == 0) goto L59
            int r5 = o.NativeAdScrollViewAdViewProvider.onExtraCallback
            int r5 = r5 + 75
            int r8 = r5 % 128
            o.NativeAdScrollViewAdViewProvider.IAuthTabCallback = r8
            int r5 = r5 % r0
            int r0 = r7.hashCode()
            if (r5 == 0) goto L58
            r5 = 62
            int r5 = r5 / r2
        L58:
            r5 = r0
        L59:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdScrollViewAdViewProvider.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckAvailableCancelWithdrawAgreementResp(bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ", status=" + this.status + ", userTitle=" + this.userTitle + ", userMessage=" + this.userMessage + ")";
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.bankCode;
            int i5 = 56 / 0;
        } else {
            i = this.bankCode;
        }
        int i6 = i3 + 43;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.bankAccountNo;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.userTitle;
        int i5 = i3 + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.userMessage;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (this.status != getNativeAdViewTypeApi.AVAILABLE) {
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
            return false;
        }
        int i4 = IAuthTabCallback + 59;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 27;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }
}
