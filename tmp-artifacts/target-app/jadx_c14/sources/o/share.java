package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class share {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final clearCookies button;
    private final String lottieUrl;
    private final String title;

    public share() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof share)) {
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        share shareVar = (share) obj;
        if (Intrinsics.areEqual(this.lottieUrl, shareVar.lottieUrl)) {
            return Intrinsics.areEqual(this.title, shareVar.title) && Intrinsics.areEqual(this.button, shareVar.button);
        }
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.lottieUrl;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            iHashCode = (i2 % 2 != 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.title;
        if (str2 == null) {
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = onExtraCallback + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        clearCookies clearcookies = this.button;
        if (clearcookies != null) {
            iHashCode3 = clearcookies.hashCode();
            int i7 = onWarmupCompleted + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmptyState(lottieUrl=" + this.lottieUrl + ", title=" + this.title + ", button=" + this.button + ")";
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    public share(@Nullable String str, @Nullable String str2, @Nullable clearCookies clearcookies) {
        this.lottieUrl = str;
        this.title = str2;
        this.button = clearcookies;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ share(String str, String str2, clearCookies clearcookies, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 64 / 0;
            }
            clearcookies = null;
        }
        this(str, str2, clearcookies);
    }
}
