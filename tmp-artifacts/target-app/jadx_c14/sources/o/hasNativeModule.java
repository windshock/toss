package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasNativeModule {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("publicKey")
    private final String publicKey;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof hasNativeModule) || (!Intrinsics.areEqual(this.publicKey, ((hasNativeModule) obj).publicKey))) {
            return false;
        }
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.publicKey.hashCode();
            throw null;
        }
        int iHashCode = this.publicKey.hashCode();
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IssueKeyForSelfieImageUploadResponse(publicKey=" + this.publicKey + ")";
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.publicKey;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return str;
    }
}
