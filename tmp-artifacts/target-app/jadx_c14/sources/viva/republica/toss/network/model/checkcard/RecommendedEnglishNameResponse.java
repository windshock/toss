package viva.republica.toss.network.model.checkcard;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecommendedEnglishNameResponse {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("results")
    private final List<RecommendedEnglishName> results;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedEnglishNameResponse)) {
            int i4 = i2 + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.results, ((RecommendedEnglishNameResponse) obj).results)) {
            return false;
        }
        int i6 = onWarmupCompleted + 53;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.results.hashCode();
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendedEnglishNameResponse(results=" + this.results + ")";
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RecommendedEnglishNameResponse(@NotNull List<RecommendedEnglishName> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.results = list;
    }

    public final List<RecommendedEnglishName> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.results;
        }
        throw null;
    }
}
