package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.VerifyBaseInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class raiseCatalystInstanceMissingException extends VerifyBaseInfo {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("bankAccountNo")
    private final String bankAccountNo;

    @SerializedName("bankCode")
    private final long bankCode;

    @SerializedName("userNo")
    private final Long userNo;

    @SerializedName("verifyHolderId")
    private final long verifyHolderId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof raiseCatalystInstanceMissingException)) {
            return false;
        }
        raiseCatalystInstanceMissingException raisecatalystinstancemissingexception = (raiseCatalystInstanceMissingException) obj;
        if (this.verifyHolderId != raisecatalystinstancemissingexception.verifyHolderId || this.bankCode != raisecatalystinstancemissingexception.bankCode || !Intrinsics.areEqual(this.bankAccountNo, raisecatalystinstancemissingexception.bankAccountNo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.userNo, raisecatalystinstancemissingexception.userNo)) {
            return true;
        }
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r1 r3 r4 r5
      0x003e: PHI (r1v12 int) = (r1v4 int), (r1v13 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v5 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v3 int) = (r4v1 int), (r4v5 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r5v1 java.lang.Long) = (r5v0 java.lang.Long), (r5v2 java.lang.Long) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.raiseCatalystInstanceMissingException.IAuthTabCallback
            int r1 = r1 + 109
            int r2 = r1 % 128
            o.raiseCatalystInstanceMissingException.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            long r3 = r7.verifyHolderId
            if (r1 == 0) goto L29
            int r1 = java.lang.Long.hashCode(r3)
            long r3 = r7.bankCode
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r7.bankAccountNo
            int r4 = r4.hashCode()
            java.lang.Long r5 = r7.userNo
            r6 = 97
            int r6 = r6 / r2
            if (r5 != 0) goto L3e
            goto L42
        L29:
            int r1 = java.lang.Long.hashCode(r3)
            long r3 = r7.bankCode
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r7.bankAccountNo
            int r4 = r4.hashCode()
            java.lang.Long r5 = r7.userNo
            if (r5 != 0) goto L3e
            goto L42
        L3e:
            int r2 = r5.hashCode()
        L42:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r2 = o.raiseCatalystInstanceMissingException.onExtraCallbackWithResult
            int r2 = r2 + 43
            int r3 = r2 % 128
            o.raiseCatalystInstanceMissingException.IAuthTabCallback = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.raiseCatalystInstanceMissingException.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankDepositSendRequest(verifyHolderId=" + this.verifyHolderId + ", bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ", userNo=" + this.userNo + ")";
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public raiseCatalystInstanceMissingException(long j, long j2, @NotNull String str, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.verifyHolderId = j;
        this.bankCode = j2;
        this.bankAccountNo = str;
        this.userNo = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ raiseCatalystInstanceMissingException(long j, long j2, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        if ((i & 8) != 0) {
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        this(j, j2, str, l2);
    }
}
