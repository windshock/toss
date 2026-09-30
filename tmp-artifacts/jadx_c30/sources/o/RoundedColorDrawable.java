package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedColorDrawable {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("address")
    private String address;

    @SerializedName("addressDetail")
    private String addressDetail;

    @SerializedName("zipCode")
    private String zipCode;

    public RoundedColorDrawable() {
        this(null, null, null, 7, null);
    }

    public RoundedColorDrawable(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.address = str;
        this.addressDetail = str2;
        this.zipCode = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundedColorDrawable(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 3;
            } else {
                int i4 = 2 % 2;
            }
            str = BuildConfig.FLAVOR;
        }
        str2 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 5;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str3 = BuildConfig.FLAVOR;
        }
        this(str, str2, str3);
    }
}
