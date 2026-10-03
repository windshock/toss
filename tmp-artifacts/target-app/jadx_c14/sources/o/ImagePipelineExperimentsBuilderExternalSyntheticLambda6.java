package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda6 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("headerText")
    private final String headerText;

    @SerializedName("headerTitle")
    private final String headerTitle;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("period")
    private final long period;

    @SerializedName("productInfoList")
    private final List<onWarmupCompleted> productInfoList;

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda6() {
        this(0L, null, null, 0L, 0.0f, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda6)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda6 imagePipelineExperimentsBuilderExternalSyntheticLambda6 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda6) obj;
        if (this.amount != imagePipelineExperimentsBuilderExternalSyntheticLambda6.amount || !Intrinsics.areEqual(this.headerTitle, imagePipelineExperimentsBuilderExternalSyntheticLambda6.headerTitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.headerText, imagePipelineExperimentsBuilderExternalSyntheticLambda6.headerText)) {
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.period != imagePipelineExperimentsBuilderExternalSyntheticLambda6.period) {
            int i6 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Float.compare(this.interestRate, imagePipelineExperimentsBuilderExternalSyntheticLambda6.interestRate) != 0) {
            return false;
        }
        if (Intrinsics.areEqual(this.productInfoList, imagePipelineExperimentsBuilderExternalSyntheticLambda6.productInfoList)) {
            return true;
        }
        int i8 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.amount) * 31) + this.headerTitle.hashCode()) * 31) + this.headerText.hashCode()) * 31) + Long.hashCode(this.period)) * 31) + Float.hashCode(this.interestRate)) * 31) + this.productInfoList.hashCode();
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanResultResponse(amount=" + this.amount + ", headerTitle=" + this.headerTitle + ", headerText=" + this.headerText + ", period=" + this.period + ", interestRate=" + this.interestRate + ", productInfoList=" + this.productInfoList + ")";
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda6(long j, @NotNull String str, @NotNull String str2, long j2, float f, @NotNull List<onWarmupCompleted> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.amount = j;
        this.headerTitle = str;
        this.headerText = str2;
        this.period = j2;
        this.interestRate = f;
        this.productInfoList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda6(long j, String str, String str2, long j2, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str3;
        float f2;
        List listEmptyList;
        long j4 = 0;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        String str4 = "";
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            j4 = j2;
        }
        if ((i & 16) != 0) {
            int i9 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        if ((i & 32) != 0) {
            int i11 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i12 = 39 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = list;
        }
        this(j3, str3, str4, j4, f2, listEmptyList);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.amount;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.headerTitle;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.headerText;
        int i5 = i3 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.period;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float f = this.interestRate;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return f;
    }
}
