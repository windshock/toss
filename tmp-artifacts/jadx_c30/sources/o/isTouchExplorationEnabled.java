package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isTouchExplorationEnabled {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("certificationMethod")
    private final isReduceMotionEnabled certificationMethod;

    @SerializedName("occupation")
    private final String occupation;

    @SerializedName("occupationOptions")
    private final List<String> occupationOptions;

    @SerializedName("purposeOfTransaction")
    private final String purposeOfTransaction;

    @SerializedName("purposeOfTransactionOptions")
    private final List<String> purposeOfTransactionOptions;

    @SerializedName("sourceOfFunds")
    private final String sourceOfFunds;

    @SerializedName("sourceOfFundsOptions")
    private final List<String> sourceOfFundsOptions;

    public isTouchExplorationEnabled() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isTouchExplorationEnabled)) {
            return false;
        }
        isTouchExplorationEnabled istouchexplorationenabled = (isTouchExplorationEnabled) obj;
        if (!Intrinsics.areEqual(this.occupationOptions, istouchexplorationenabled.occupationOptions) || !Intrinsics.areEqual(this.purposeOfTransactionOptions, istouchexplorationenabled.purposeOfTransactionOptions) || !Intrinsics.areEqual(this.sourceOfFundsOptions, istouchexplorationenabled.sourceOfFundsOptions)) {
            return false;
        }
        if (this.certificationMethod != istouchexplorationenabled.certificationMethod) {
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.occupation, istouchexplorationenabled.occupation)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.purposeOfTransaction, istouchexplorationenabled.purposeOfTransaction)) {
            int i6 = onExtraCallback + 111;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.sourceOfFunds, istouchexplorationenabled.sourceOfFunds)) {
            return true;
        }
        int i8 = onNavigationEvent + 99;
        onExtraCallback = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.occupationOptions.hashCode();
        int iHashCode4 = this.purposeOfTransactionOptions.hashCode();
        int iHashCode5 = this.sourceOfFundsOptions.hashCode();
        isReduceMotionEnabled isreducemotionenabled = this.certificationMethod;
        if (isreducemotionenabled == null) {
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = isreducemotionenabled.hashCode();
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 3;
            }
        }
        String str = this.occupation;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.purposeOfTransaction;
        if (str2 == null) {
            int i6 = onNavigationEvent + 73;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.sourceOfFunds;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EddInfo(occupationOptions=" + this.occupationOptions + ", purposeOfTransactionOptions=" + this.purposeOfTransactionOptions + ", sourceOfFundsOptions=" + this.sourceOfFundsOptions + ", certificationMethod=" + this.certificationMethod + ", occupation=" + this.occupation + ", purposeOfTransaction=" + this.purposeOfTransaction + ", sourceOfFunds=" + this.sourceOfFunds + ")";
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isTouchExplorationEnabled(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @Nullable isReduceMotionEnabled isreducemotionenabled, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list3, BuildConfig.FLAVOR);
        this.occupationOptions = list;
        this.purposeOfTransactionOptions = list2;
        this.sourceOfFundsOptions = list3;
        this.certificationMethod = isreducemotionenabled;
        this.occupation = str;
        this.purposeOfTransaction = str2;
        this.sourceOfFunds = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isTouchExplorationEnabled(List list, List list2, List list3, isReduceMotionEnabled isreducemotionenabled, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        List listEmptyList2;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = CollectionsKt.emptyList();
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        List listEmptyList3 = (i & 2) != 0 ? CollectionsKt.emptyList() : list2;
        String str4 = null;
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 119;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                CollectionsKt.emptyList();
                str4.hashCode();
                throw null;
            }
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = list3;
        }
        isReduceMotionEnabled isreducemotionenabled2 = (i & 8) != 0 ? null : isreducemotionenabled;
        String str5 = (i & 16) != 0 ? null : str;
        String str6 = (i & 32) != 0 ? null : str2;
        if ((i & 64) != 0) {
            int i8 = 2 % 2;
        } else {
            str4 = str3;
        }
        this(listEmptyList, listEmptyList3, listEmptyList2, isreducemotionenabled2, str5, str6, str4);
    }
}
