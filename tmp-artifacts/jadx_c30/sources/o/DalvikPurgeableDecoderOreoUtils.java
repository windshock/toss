package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DalvikPurgeableDecoderOreoUtils {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("createAccount")
    private final boolean createAccount;

    @SerializedName("directIssueCard")
    private final boolean directIssueCard;

    @SerializedName("issueMain")
    private final nativeIterativeBoxBlur issueMain;

    @SerializedName("verify")
    private final boolean verify;

    public DalvikPurgeableDecoderOreoUtils() {
        this(false, false, null, false, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DalvikPurgeableDecoderOreoUtils)) {
            int i5 = i3 + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        DalvikPurgeableDecoderOreoUtils dalvikPurgeableDecoderOreoUtils = (DalvikPurgeableDecoderOreoUtils) obj;
        if (this.createAccount != dalvikPurgeableDecoderOreoUtils.createAccount) {
            return false;
        }
        if (this.directIssueCard == dalvikPurgeableDecoderOreoUtils.directIssueCard) {
            return Intrinsics.areEqual(this.issueMain, dalvikPurgeableDecoderOreoUtils.issueMain) && this.verify == dalvikPurgeableDecoderOreoUtils.verify;
        }
        int i7 = i3 + 79;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.createAccount);
        int iHashCode3 = Boolean.hashCode(this.directIssueCard);
        nativeIterativeBoxBlur nativeiterativeboxblur = this.issueMain;
        if (nativeiterativeboxblur == null) {
            iHashCode = 0;
        } else {
            iHashCode = nativeiterativeboxblur.hashCode();
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Boolean.hashCode(this.verify);
        int i6 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccAuditCreditResp(createAccount=" + this.createAccount + ", directIssueCard=" + this.directIssueCard + ", issueMain=" + this.issueMain + ", verify=" + this.verify + ")";
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public DalvikPurgeableDecoderOreoUtils(boolean z, boolean z2, @Nullable nativeIterativeBoxBlur nativeiterativeboxblur, boolean z3) {
        this.createAccount = z;
        this.directIssueCard = z2;
        this.issueMain = nativeiterativeboxblur;
        this.verify = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DalvikPurgeableDecoderOreoUtils(boolean z, boolean z2, nativeIterativeBoxBlur nativeiterativeboxblur, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z2 = false;
        }
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            nativeiterativeboxblur = null;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            z3 = false;
        }
        this(z, z2, nativeiterativeboxblur, z3);
    }
}
