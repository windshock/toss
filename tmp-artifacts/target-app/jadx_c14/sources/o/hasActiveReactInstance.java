package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasActiveReactInstance {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("aesKey")
    private final String aesKey;

    @SerializedName("installId")
    private final long installId;

    @SerializedName("rawPKey")
    private final String rawPKey;

    @SerializedName("rawWebPKey")
    private final String rawWebPKey;

    @SerializedName("webAesKey")
    private final String webAesKey;

    public hasActiveReactInstance() {
        this(null, null, null, null, 0L, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof hasActiveReactInstance)) {
            return false;
        }
        hasActiveReactInstance hasactivereactinstance = (hasActiveReactInstance) obj;
        if (!Intrinsics.areEqual(this.rawPKey, hasactivereactinstance.rawPKey)) {
            int i7 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.aesKey, hasactivereactinstance.aesKey)) {
            int i9 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rawWebPKey, hasactivereactinstance.rawWebPKey)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.webAesKey, hasactivereactinstance.webAesKey))) {
            return this.installId == hasactivereactinstance.installId;
        }
        int i11 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.rawPKey.hashCode() * 31) + this.aesKey.hashCode()) * 31) + this.rawWebPKey.hashCode()) * 31) + this.webAesKey.hashCode()) * 31) + Long.hashCode(this.installId);
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InitKeyResponse(rawPKey=" + this.rawPKey + ", aesKey=" + this.aesKey + ", rawWebPKey=" + this.rawWebPKey + ", webAesKey=" + this.webAesKey + ", installId=" + this.installId + ")";
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hasActiveReactInstance(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.rawPKey = str;
        this.aesKey = str2;
        this.rawWebPKey = str3;
        this.webAesKey = str4;
        this.installId = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hasActiveReactInstance(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            str6 = "";
        } else {
            str6 = str3;
        }
        String str7 = (i & 8) == 0 ? str4 : "";
        if ((i & 16) != 0) {
            int i7 = onWarmupCompleted;
            int i8 = i7 + 119;
            onExtraCallbackWithResult = i8 % 128;
            j = i8 % 2 == 0 ? 1L : 0L;
            int i9 = i7 + 115;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 3;
            } else {
                int i11 = 2 % 2;
            }
        }
        this(str, str5, str6, str7, j);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rawPKey;
        int i5 = i2 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.aesKey;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.rawWebPKey;
            int i4 = 68 / 0;
        } else {
            str = this.rawWebPKey;
        }
        int i5 = i3 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.webAesKey;
        int i5 = i3 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.installId;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
