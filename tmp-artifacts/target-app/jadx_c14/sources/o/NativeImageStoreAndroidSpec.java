package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeImageStoreAndroidSpec {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("status")
    private final getBase64ForTag status;

    @SerializedName("userName")
    private final String userName;

    @SerializedName("userNo")
    private final long userNo;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof NativeImageStoreAndroidSpec)) {
            return false;
        }
        NativeImageStoreAndroidSpec nativeImageStoreAndroidSpec = (NativeImageStoreAndroidSpec) obj;
        if (!Intrinsics.areEqual(this.userName, nativeImageStoreAndroidSpec.userName)) {
            return false;
        }
        if (this.userNo != nativeImageStoreAndroidSpec.userNo) {
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, nativeImageStoreAndroidSpec.iconUrl)) {
            int i5 = onWarmupCompleted + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.status == nativeImageStoreAndroidSpec.status) {
            return true;
        }
        int i7 = onNavigationEvent + 57;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.userName.hashCode();
        int iHashCode2 = Long.hashCode(this.userNo);
        int iHashCode3 = this.iconUrl.hashCode();
        getBase64ForTag getbase64fortag = this.status;
        if (getbase64fortag == null) {
            int i3 = onNavigationEvent + 27;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 77;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode4 = getbase64fortag.hashCode();
            int i8 = onWarmupCompleted + 107;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavingTogetherInfo(userName=" + this.userName + ", userNo=" + this.userNo + ", iconUrl=" + this.iconUrl + ", status=" + this.status + ")";
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.userName;
        int i5 = i2 + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.userNo;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return str;
    }

    public final getBase64ForTag onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getBase64ForTag getbase64fortag = this.status;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getbase64fortag;
    }
}
