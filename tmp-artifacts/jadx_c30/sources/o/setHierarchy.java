package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setHierarchy {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("address")
    private String address;

    @SerializedName("addressDetail")
    private String addressDetail;

    @SerializedName("allowSubstitute")
    private boolean allowSubstitute;

    @SerializedName("roadCode")
    private String roadCode;

    @SerializedName("zipCode")
    private String zipCode;

    public setHierarchy() {
        this(null, null, null, null, false, 31, null);
    }

    public setHierarchy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.address = str;
        this.addressDetail = str2;
        this.roadCode = str3;
        this.zipCode = str4;
        this.allowSubstitute = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setHierarchy(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        int i2 = i & 1;
        String str7 = BuildConfig.FLAVOR;
        String str8 = i2 != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str5 = BuildConfig.FLAVOR;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 67;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str6 = BuildConfig.FLAVOR;
        } else {
            str6 = str3;
        }
        str7 = (i & 8) == 0 ? str4 : str7;
        if ((i & 16) != 0) {
            int i7 = onNavigationEvent + 63;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = true;
        }
        this(str8, str5, str6, str7, z);
    }
}
