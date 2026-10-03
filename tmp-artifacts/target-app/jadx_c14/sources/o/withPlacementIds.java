package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.IdGeneratorExternalSyntheticLambda1;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withPlacementIds {

    @SerializedName("from")
    private String from;

    @SerializedName("to")
    private String to;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof withPlacementIds)) {
            return false;
        }
        withPlacementIds withplacementids = (withPlacementIds) obj;
        return Intrinsics.areEqual(this.from, withplacementids.from) && Intrinsics.areEqual(this.to, withplacementids.to);
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.to.hashCode();
    }

    public String toString() {
        return "BreakTime(from=" + this.from + ", to=" + this.to + ")";
    }

    public final String onExtraCallback() {
        return this.from;
    }

    public final String onExtraCallbackWithResult() {
        return this.to;
    }

    public final String onWarmupCompleted() {
        try {
            IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback = onextracallback.onExtraCallback("yyyy-MM-dd'T'HH:mm");
            Date date = idGeneratorExternalSyntheticLambda1OnExtraCallback.parse(this.from);
            Date date2 = idGeneratorExternalSyntheticLambda1OnExtraCallback.parse(this.to);
            if (date == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (date2 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (zzan.IAuthTabCallback(date2, date)) {
                IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback2 = onextracallback.onExtraCallback("HH:mm");
                return idGeneratorExternalSyntheticLambda1OnExtraCallback2.format(date) + "-" + idGeneratorExternalSyntheticLambda1OnExtraCallback2.format(date2);
            }
            if (zzan.onNavigationEvent(date2, date)) {
                IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback3 = onextracallback.onExtraCallback("M월 d일 HH:mm");
                return idGeneratorExternalSyntheticLambda1OnExtraCallback3.format(date) + "-" + idGeneratorExternalSyntheticLambda1OnExtraCallback3.format(date2);
            }
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback4 = onextracallback.onExtraCallback("yyyy년 M월 d일 HH:mm");
            return idGeneratorExternalSyntheticLambda1OnExtraCallback4.format(date) + "-" + idGeneratorExternalSyntheticLambda1OnExtraCallback4.format(date2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
