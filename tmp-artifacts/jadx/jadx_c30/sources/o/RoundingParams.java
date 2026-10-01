package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundingParams {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("password")
    private String password;

    @SerializedName("rrn")
    private String rrn;

    /* JADX WARN: Illegal instructions before constructor call */
    public RoundingParams() {
        String str = null;
        this(str, str, 3, str);
    }

    public RoundingParams(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.rrn = str;
        this.password = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundingParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }
}
