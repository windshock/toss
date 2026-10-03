package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManagerExternalSyntheticLambda4 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("head")
    private final List<ExceptionHelper> head;

    @SerializedName("row")
    private final List<ReactInstanceManager2> row;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof ReactInstanceManagerExternalSyntheticLambda4) {
            ReactInstanceManagerExternalSyntheticLambda4 reactInstanceManagerExternalSyntheticLambda4 = (ReactInstanceManagerExternalSyntheticLambda4) obj;
            return Intrinsics.areEqual(this.head, reactInstanceManagerExternalSyntheticLambda4.head) && Intrinsics.areEqual(this.row, reactInstanceManagerExternalSyntheticLambda4.row);
        }
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.head.hashCode();
        return i3 == 0 ? (iHashCode / 121) >> this.row.hashCode() : (iHashCode * 31) + this.row.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimetableInfo(head=" + this.head + ", row=" + this.row + ")";
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<ReactInstanceManager2> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<ReactInstanceManager2> list = this.row;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return list;
    }
}
