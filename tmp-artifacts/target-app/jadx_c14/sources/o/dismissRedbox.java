package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class dismissRedbox {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("certType")
    private final String certType;

    @SerializedName("docCode")
    private final Long docCode;

    @SerializedName("docCodes")
    private final List<Long> docCodes;

    @SerializedName("isMultiSign")
    private final boolean isMultiSign;

    @SerializedName("trxId")
    private final String tossCertTrxId;

    public dismissRedbox() {
        this(null, null, null, false, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dismissRedbox)) {
            return false;
        }
        dismissRedbox dismissredbox = (dismissRedbox) obj;
        if (!Intrinsics.areEqual(this.docCodes, dismissredbox.docCodes)) {
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.tossCertTrxId, dismissredbox.tossCertTrxId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.docCode, dismissredbox.docCode)) {
            return this.isMultiSign == dismissredbox.isMultiSign && Intrinsics.areEqual(this.certType, dismissredbox.certType);
        }
        int i3 = onExtraCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        List<Long> list = this.docCodes;
        if (list == null) {
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        String str = this.tossCertTrxId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l = this.docCode;
        if (l == null) {
            int i5 = onExtraCallback + 111;
            onWarmupCompleted = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode3 = l.hashCode();
            int i6 = onWarmupCompleted + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode3;
        }
        int iHashCode4 = Boolean.hashCode(this.isMultiSign);
        String str2 = this.certType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletSignatureReq(docCodes=" + this.docCodes + ", tossCertTrxId=" + this.tossCertTrxId + ", docCode=" + this.docCode + ", isMultiSign=" + this.isMultiSign + ", certType=" + this.certType + ")";
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    public dismissRedbox(@Nullable List<Long> list, @Nullable String str, @Nullable Long l, boolean z, @Nullable String str2) {
        this.docCodes = list;
        this.tossCertTrxId = str;
        this.docCode = l;
        this.isMultiSign = z;
        this.certType = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dismissRedbox(List list, String str, Long l, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        Long l2 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            list = null;
        }
        if ((i & 2) != 0) {
            int i7 = onWarmupCompleted + 97;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i9 = onExtraCallback + 119;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        } else {
            l2 = l;
        }
        if ((i & 8) != 0) {
            int i11 = onExtraCallback + 105;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            int i14 = onExtraCallback + 109;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            str2 = "TOSS";
        }
        this(list, str3, l2, z2, str2);
    }
}
