package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactDelegateExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("uploadedUrls")
    private final List<String> uploadedUrls;

    @SerializedName("yearMonth")
    private final String yearMonth;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactDelegateExternalSyntheticLambda0)) {
            int i5 = i3 + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ReactDelegateExternalSyntheticLambda0 reactDelegateExternalSyntheticLambda0 = (ReactDelegateExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.uploadedUrls, reactDelegateExternalSyntheticLambda0.uploadedUrls)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.yearMonth, reactDelegateExternalSyntheticLambda0.yearMonth)) {
            int i7 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.uploadedUrls.hashCode() * 31) + this.yearMonth.hashCode();
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensSchoolMealUploadImageReq(uploadedUrls=" + this.uploadedUrls + ", yearMonth=" + this.yearMonth + ")";
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactDelegateExternalSyntheticLambda0(@NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.uploadedUrls = list;
        this.yearMonth = str;
    }
}
