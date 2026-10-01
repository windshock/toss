package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDefStyleRes {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("binNumber")
    private final String binNumber;

    @SerializedName("cardNoLength")
    private final Number cardNoLength;

    @SerializedName("companyFullName")
    private final String companyFullName;

    @SerializedName("vendorCode")
    private final Number vendorCode;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_CARD_VENDOR_NAME)
    private final String vendorName;

    public getDefStyleRes() {
        this(null, null, null, null, null, 31, null);
    }

    public getDefStyleRes(@NotNull String str, @NotNull Number number, @NotNull Number number2, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(number, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(number2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.binNumber = str;
        this.cardNoLength = number;
        this.vendorCode = number2;
        this.vendorName = str2;
        this.companyFullName = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDefStyleRes(String str, Number number, Number number2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Number number3;
        String str4;
        int i2 = i & 1;
        String str5 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = onNavigationEvent + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            number3 = number;
        } else {
            number3 = number;
        }
        number = (i & 4) == 0 ? number2 : 0;
        if ((i & 8) != 0) {
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = str2;
        }
        this(str, number3, number, str4, (i & 16) == 0 ? str3 : str5);
    }
}
