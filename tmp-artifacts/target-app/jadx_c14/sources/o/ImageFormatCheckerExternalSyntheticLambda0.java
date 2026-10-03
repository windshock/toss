package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImageFormatCheckerExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("balanceSummary")
    private initHybrid balanceSummary;

    @SerializedName("openBankingTransition")
    private convertToCase openBankingTransition;

    @SerializedName("transfer")
    private dismissActionSheet transfer;

    @SerializedName("unifiedTransaction")
    private showShareActionSheetWithOptions unifiedTransaction;

    @SerializedName("withdraw")
    private setAccessibilityContentSizeMultipliers withdraw;

    public ImageFormatCheckerExternalSyntheticLambda0() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof ImageFormatCheckerExternalSyntheticLambda0) {
            ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0 = (ImageFormatCheckerExternalSyntheticLambda0) obj;
            return Intrinsics.areEqual(this.withdraw, imageFormatCheckerExternalSyntheticLambda0.withdraw) && Intrinsics.areEqual(this.transfer, imageFormatCheckerExternalSyntheticLambda0.transfer) && Intrinsics.areEqual(this.balanceSummary, imageFormatCheckerExternalSyntheticLambda0.balanceSummary) && Intrinsics.areEqual(this.unifiedTransaction, imageFormatCheckerExternalSyntheticLambda0.unifiedTransaction) && Intrinsics.areEqual(this.openBankingTransition, imageFormatCheckerExternalSyntheticLambda0.openBankingTransition);
        }
        int i6 = i3 + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        setAccessibilityContentSizeMultipliers setaccessibilitycontentsizemultipliers = this.withdraw;
        int iHashCode3 = 0;
        if (setaccessibilitycontentsizemultipliers == null) {
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setaccessibilitycontentsizemultipliers.hashCode();
        }
        dismissActionSheet dismissactionsheet = this.transfer;
        int iHashCode4 = dismissactionsheet == null ? 0 : dismissactionsheet.hashCode();
        initHybrid inithybrid = this.balanceSummary;
        if (inithybrid == null) {
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = inithybrid.hashCode();
        }
        showShareActionSheetWithOptions showshareactionsheetwithoptions = this.unifiedTransaction;
        int iHashCode5 = showshareactionsheetwithoptions == null ? 0 : showshareactionsheetwithoptions.hashCode();
        convertToCase converttocase = this.openBankingTransition;
        if (converttocase != null) {
            int i6 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                converttocase.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = converttocase.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawLimit(withdraw=" + this.withdraw + ", transfer=" + this.transfer + ", balanceSummary=" + this.balanceSummary + ", unifiedTransaction=" + this.unifiedTransaction + ", openBankingTransition=" + this.openBankingTransition + ")";
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImageFormatCheckerExternalSyntheticLambda0(@Nullable setAccessibilityContentSizeMultipliers setaccessibilitycontentsizemultipliers, @Nullable dismissActionSheet dismissactionsheet, @Nullable initHybrid inithybrid, @Nullable showShareActionSheetWithOptions showshareactionsheetwithoptions, @Nullable convertToCase converttocase) {
        this.withdraw = setaccessibilitycontentsizemultipliers;
        this.transfer = dismissactionsheet;
        this.balanceSummary = inithybrid;
        this.unifiedTransaction = showshareactionsheetwithoptions;
        this.openBankingTransition = converttocase;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageFormatCheckerExternalSyntheticLambda0(setAccessibilityContentSizeMultipliers setaccessibilitycontentsizemultipliers, dismissActionSheet dismissactionsheet, initHybrid inithybrid, showShareActionSheetWithOptions showshareactionsheetwithoptions, convertToCase converttocase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        dismissActionSheet dismissactionsheet2;
        initHybrid inithybrid2;
        showShareActionSheetWithOptions showshareactionsheetwithoptions2;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 77 / 0;
            }
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            } else {
                int i7 = 2 % 2;
            }
            setaccessibilitycontentsizemultipliers = null;
        }
        if ((i & 2) != 0) {
            int i8 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            dismissactionsheet2 = null;
        } else {
            dismissactionsheet2 = dismissactionsheet;
        }
        if ((i & 4) != 0) {
            int i10 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            inithybrid2 = null;
        } else {
            inithybrid2 = inithybrid;
        }
        if ((i & 8) != 0) {
            int i12 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
            showshareactionsheetwithoptions2 = null;
        } else {
            showshareactionsheetwithoptions2 = showshareactionsheetwithoptions;
        }
        this(setaccessibilitycontentsizemultipliers, dismissactionsheet2, inithybrid2, showshareactionsheetwithoptions2, (i & 16) == 0 ? converttocase : null);
    }

    public final setAccessibilityContentSizeMultipliers onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        setAccessibilityContentSizeMultipliers setaccessibilitycontentsizemultipliers = this.withdraw;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return setaccessibilitycontentsizemultipliers;
    }

    public final dismissActionSheet onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        dismissActionSheet dismissactionsheet = this.transfer;
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return dismissactionsheet;
    }

    public final initHybrid IAuthTabCallback() {
        initHybrid inithybrid;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            inithybrid = this.balanceSummary;
            int i4 = 17 / 0;
        } else {
            inithybrid = this.balanceSummary;
        }
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return inithybrid;
    }

    public final showShareActionSheetWithOptions onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        showShareActionSheetWithOptions showshareactionsheetwithoptions = this.unifiedTransaction;
        int i5 = i3 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return showshareactionsheetwithoptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final convertToCase onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        convertToCase converttocase = this.openBankingTransition;
        int i4 = i3 + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return converttocase;
    }
}
