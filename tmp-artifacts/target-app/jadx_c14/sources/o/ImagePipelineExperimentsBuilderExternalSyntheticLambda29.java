package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda29 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("joinDate")
    private final String joinDate;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExperimentsBuilderExternalSyntheticLambda29() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda29) && Intrinsics.areEqual(this.joinDate, ((ImagePipelineExperimentsBuilderExternalSyntheticLambda29) obj).joinDate);
        }
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.joinDate;
        if (str == null) {
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPreComparisonRequest(joinDate=" + this.joinDate + ")";
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return str;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda29(@Nullable String str) {
        this.joinDate = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda29(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 27;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 13 / 0;
            }
            int i5 = i3 + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }
}
