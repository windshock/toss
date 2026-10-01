package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentBoldTextState {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("height")
    private final Integer height;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_URL)
    private final String url;

    @SerializedName("width")
    private final Integer width;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 105;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof getCurrentBoldTextState)) {
            return false;
        }
        getCurrentBoldTextState getcurrentboldtextstate = (getCurrentBoldTextState) obj;
        if (!Intrinsics.areEqual(this.url, getcurrentboldtextstate.url)) {
            int i9 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.width, getcurrentboldtextstate.width)) {
            return false;
        }
        if (Intrinsics.areEqual(this.height, getcurrentboldtextstate.height)) {
            return true;
        }
        int i11 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3 r4
      0x0028: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v4 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v6 java.lang.Integer) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r4v9 int) = (r4v0 int), (r4v10 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1 r4
      0x0026: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r4v1 int) = (r4v0 int), (r4v10 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Integer num;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.url.hashCode();
            num = this.width;
            iHashCode2 = 1;
            iHashCode3 = num == null ? 0 : num.hashCode();
        } else {
            iHashCode = this.url.hashCode();
            num = this.width;
            iHashCode2 = 0;
            if (num == null) {
            }
        }
        Integer num2 = this.height;
        if (num2 != null) {
            int i3 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode2 = num2.hashCode();
                int i4 = 68 / 0;
            } else {
                iHashCode2 = num2.hashCode();
            }
        }
        int i5 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i6 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LottieInfo(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ")";
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
