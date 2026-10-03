package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class showActionSheetWithOptions {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("webAesKey")
    private final String webAesKey;

    @SerializedName("webPKey")
    private final String webPKey;

    /* JADX WARN: Illegal instructions before constructor call */
    public showActionSheetWithOptions() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showActionSheetWithOptions)) {
            int i5 = i3 + 115;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        showActionSheetWithOptions showactionsheetwithoptions = (showActionSheetWithOptions) obj;
        if (Intrinsics.areEqual(this.webPKey, showactionsheetwithoptions.webPKey)) {
            return !(Intrinsics.areEqual(this.webAesKey, showactionsheetwithoptions.webAesKey) ^ true);
        }
        int i6 = IAuthTabCallback;
        int i7 = i6 + 77;
        onWarmupCompleted = i7 % 128;
        boolean z = true ^ (i7 % 2 != 0);
        int i8 = i6 + 55;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.webPKey.hashCode() * 24) >> this.webAesKey.hashCode() : (this.webPKey.hashCode() * 31) + this.webAesKey.hashCode();
        int i3 = IAuthTabCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WebKeys(webPKey=" + this.webPKey + ", webAesKey=" + this.webAesKey + ")";
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return str;
    }

    public showActionSheetWithOptions(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.webPKey = str;
        this.webAesKey = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ showActionSheetWithOptions(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 121;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 53;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.webPKey;
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.webAesKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
