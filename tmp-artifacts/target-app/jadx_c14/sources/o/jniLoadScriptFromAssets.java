package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class jniLoadScriptFromAssets {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("arsPossessionTemplateId")
    private final long arsPossessionTemplateId;

    @SerializedName("possessionPriority")
    private final List<jniHandleMemoryPressure> possessionPriority;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof jniLoadScriptFromAssets))) {
            jniLoadScriptFromAssets jniloadscriptfromassets = (jniLoadScriptFromAssets) obj;
            return this.arsPossessionTemplateId == jniloadscriptfromassets.arsPossessionTemplateId && Intrinsics.areEqual(this.possessionPriority, jniloadscriptfromassets.possessionPriority);
        }
        int i3 = onExtraCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Long.hashCode(this.arsPossessionTemplateId) - 73) >> this.possessionPriority.hashCode() : (Long.hashCode(this.arsPossessionTemplateId) * 31) + this.possessionPriority.hashCode();
        int i3 = onExtraCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestPossessionMethodPolicy(arsPossessionTemplateId=" + this.arsPossessionTemplateId + ", possessionPriority=" + this.possessionPriority + ")";
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.arsPossessionTemplateId;
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        int i6 = i3 + 7;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final List<jniHandleMemoryPressure> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.possessionPriority;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
