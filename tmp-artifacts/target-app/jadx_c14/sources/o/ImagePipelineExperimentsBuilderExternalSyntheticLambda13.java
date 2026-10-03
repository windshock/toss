package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda13 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("loanReqNo")
    private final String loanReqNo;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExperimentsBuilderExternalSyntheticLambda13() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda13)) {
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.loanReqNo, ((ImagePipelineExperimentsBuilderExternalSyntheticLambda13) obj).loanReqNo)) {
            return true;
        }
        int i5 = onWarmupCompleted + 57;
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 33;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.loanReqNo.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.loanReqNo.hashCode();
        int i3 = onExtraCallback + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonLoanReqNo(loanReqNo=" + this.loanReqNo + ")";
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda13(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.loanReqNo = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda13(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        this(str);
    }
}
