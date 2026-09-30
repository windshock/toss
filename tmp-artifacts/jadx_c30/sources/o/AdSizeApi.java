package o;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AdSizeApi {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("accountNo")
    private final String accountNo;

    @SerializedName("isMainAccount")
    private Integer mainAccount;

    @SerializedName("nickName")
    private String nickName;

    @SerializedName("signedBankCodes")
    private Set<String> signedBankCodes;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdSizeApi)) {
            return false;
        }
        AdSizeApi adSizeApi = (AdSizeApi) obj;
        if (!Intrinsics.areEqual(this.accountNo, adSizeApi.accountNo)) {
            int i4 = onExtraCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.nickName, adSizeApi.nickName)) {
            return Intrinsics.areEqual(this.mainAccount, adSizeApi.mainAccount) && Intrinsics.areEqual(this.signedBankCodes, adSizeApi.signedBankCodes);
        }
        int i5 = onExtraCallbackWithResult + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v5 java.lang.Integer) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        Integer num;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int iHashCode4 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.accountNo.hashCode();
            iHashCode2 = this.nickName.hashCode();
            num = this.mainAccount;
            iHashCode3 = num == null ? 0 : num.hashCode();
        } else {
            iHashCode = this.accountNo.hashCode();
            iHashCode2 = this.nickName.hashCode();
            num = this.mainAccount;
            if (num == null) {
            }
        }
        Set<String> set = this.signedBankCodes;
        if (set != null) {
            int i3 = onExtraCallbackWithResult + 61;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                set.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode4 = set.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SetAccountMainWithNicknameReq(accountNo=" + this.accountNo + ", nickName=" + this.nickName + ", mainAccount=" + this.mainAccount + ", signedBankCodes=" + this.signedBankCodes + ")";
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
