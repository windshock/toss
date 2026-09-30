package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BufferedDiskCacheExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("color")
    private final String color;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    public BufferedDiskCacheExternalSyntheticLambda4() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof BufferedDiskCacheExternalSyntheticLambda4))) {
            BufferedDiskCacheExternalSyntheticLambda4 bufferedDiskCacheExternalSyntheticLambda4 = (BufferedDiskCacheExternalSyntheticLambda4) obj;
            return Intrinsics.areEqual(this.color, bufferedDiskCacheExternalSyntheticLambda4.color) && Intrinsics.areEqual(this.text, bufferedDiskCacheExternalSyntheticLambda4.text);
        }
        int i5 = i2 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        String str = this.color;
        if (str == null) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 49;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = onWarmupCompleted + 111;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return (i * 31) + this.text.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ColoredSubText(color=" + this.color + ", text=" + this.text + ")";
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BufferedDiskCacheExternalSyntheticLambda4(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.color = str;
        this.text = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda4(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }
}
