package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class copyBitmap implements NativeKeyboardObserverSpec {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("ctaText")
    private final String ctaText;
    private final String itemId;

    @SerializedName("lottieUrl")
    private final String lottieUrl;

    @SerializedName("text")
    private final String text;

    @SerializedName("title")
    private final String title;

    public copyBitmap() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyBitmap)) {
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        copyBitmap copybitmap = (copyBitmap) obj;
        if (!Intrinsics.areEqual(this.title, copybitmap.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, copybitmap.text)) {
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.lottieUrl, copybitmap.lottieUrl)) {
            return Intrinsics.areEqual(this.ctaText, copybitmap.ctaText);
        }
        int i6 = onWarmupCompleted + 85;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? (((((r0 % 28) + this.text.hashCode()) / 73) >> this.lottieUrl.hashCode()) - 112) / this.ctaText.hashCode() : (((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.lottieUrl.hashCode()) * 31) + this.ctaText.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BottomSheetData(title=" + this.title + ", text=" + this.text + ", lottieUrl=" + this.lottieUrl + ", ctaText=" + this.ctaText + ")";
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public copyBitmap(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.text = str2;
        this.lottieUrl = str3;
        this.ctaText = str4;
        this.itemId = str + ":" + str2 + ":" + str3 + ":" + str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ copyBitmap(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            str3 = "";
        }
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.IAuthTabCallback();
        }
        super.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lottieUrl;
        int i5 = i2 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.ctaText;
            int i4 = 15 / 0;
        } else {
            str = this.ctaText;
        }
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.itemId;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return str;
    }
}
