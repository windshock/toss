package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResizeAndRotateProducerTransformingConsumer1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("agreedTerms")
    private final List<String> agreedTerms;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ResizeAndRotateProducerTransformingConsumer1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.agreedTerms, ((ResizeAndRotateProducerTransformingConsumer1) obj).agreedTerms)) {
            return true;
        }
        int i7 = onExtraCallback + 9;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.agreedTerms.hashCode();
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccTermWebRequest(agreedTerms=" + this.agreedTerms + ")";
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
