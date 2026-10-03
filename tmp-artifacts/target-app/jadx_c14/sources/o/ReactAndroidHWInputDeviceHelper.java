package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactAndroidHWInputDeviceHelper {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("savingBoxes")
    private final List<ReactActivityDelegate> savingBoxes;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactAndroidHWInputDeviceHelper)) {
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.savingBoxes, ((ReactAndroidHWInputDeviceHelper) obj).savingBoxes)) {
            return true;
        }
        int i4 = onExtraCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.savingBoxes.hashCode();
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensSavingBoxListResponse(savingBoxes=" + this.savingBoxes + ")";
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<ReactActivityDelegate> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<ReactActivityDelegate> list = this.savingBoxes;
        int i5 = i2 + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
