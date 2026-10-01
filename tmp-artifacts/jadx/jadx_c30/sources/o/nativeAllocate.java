package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nativeAllocate {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("tokenType")
    private final String tokenType;

    @SerializedName(PKCS12.KEY_USER_NO)
    private final String userNo;

    /* JADX WARN: Illegal instructions before constructor call */
    public nativeAllocate() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nativeAllocate) {
            nativeAllocate nativeallocate = (nativeAllocate) obj;
            return Intrinsics.areEqual(this.userNo, nativeallocate.userNo) && Intrinsics.areEqual(this.tokenType, nativeallocate.tokenType);
        }
        int i5 = i3 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
      0x001c: PHI (r1v10 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            str = this.userNo;
            int i3 = 74 / 0;
            if (str != null) {
                iHashCode = str.hashCode();
            }
        } else {
            str = this.userNo;
            if (str != null) {
            }
        }
        int iHashCode2 = (iHashCode * 31) + this.tokenType.hashCode();
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrimeJoinInfoReq(userNo=" + this.userNo + ", tokenType=" + this.tokenType + ")";
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public nativeAllocate(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.userNo = str;
        this.tokenType = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nativeAllocate(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 3;
            } else {
                int i4 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "AUTOBILL";
            int i5 = onExtraCallback + 53;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
        }
        this(str, str2);
    }
}
