package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko)) {
            int i6 = i2 + 25;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.verifyId == ((r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko) obj).verifyId) {
            int i8 = i4 + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = i4 + 105;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.verifyId);
        }
        Long.hashCode(this.verifyId);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyIdRequest(verifyId=" + this.verifyId + ")";
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko(long j) {
        this.verifyId = j;
    }
}
