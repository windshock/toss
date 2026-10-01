package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("buttonTheme")
    private r8lambdawFWhRWhus20GezotRyrNrYsbtYM buttonTheme;

    @SerializedName("description")
    private String description;

    @SerializedName("enable")
    private ReactPackageTurboModuleManagerDelegate enable;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    private String label;

    @SerializedName("scheme")
    private String scheme;

    @SerializedName("type")
    private String type;

    public r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ)) {
            int i3 = onExtraCallback + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ r8lambda_7vdailuq5qvpfgcfeev5lnygiq = (r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ) obj;
        if (!Intrinsics.areEqual(this.label, r8lambda_7vdailuq5qvpfgcfeev5lnygiq.label)) {
            int i5 = onExtraCallback + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, r8lambda_7vdailuq5qvpfgcfeev5lnygiq.description)) {
            return false;
        }
        if (Intrinsics.areEqual(this.scheme, r8lambda_7vdailuq5qvpfgcfeev5lnygiq.scheme)) {
            if (this.enable != r8lambda_7vdailuq5qvpfgcfeev5lnygiq.enable) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, r8lambda_7vdailuq5qvpfgcfeev5lnygiq.type)) {
                return Intrinsics.areEqual(this.buttonTheme, r8lambda_7vdailuq5qvpfgcfeev5lnygiq.buttonTheme);
            }
            int i7 = IAuthTabCallback + 113;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = IAuthTabCallback + 45;
        int i10 = i9 % 128;
        onExtraCallback = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 29;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.label.hashCode();
        String str = this.description;
        int iHashCode4 = 0;
        if (str == null) {
            int i4 = onExtraCallback + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode5 = this.scheme.hashCode();
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate = this.enable;
        int iHashCode6 = reactPackageTurboModuleManagerDelegate == null ? 0 : reactPackageTurboModuleManagerDelegate.hashCode();
        String str2 = this.type;
        if (str2 == null) {
            int i6 = IAuthTabCallback + 17;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        r8lambdawFWhRWhus20GezotRyrNrYsbtYM r8lambdawfwhrwhus20gezotryrnrysbtym = this.buttonTheme;
        if (r8lambdawfwhrwhus20gezotryrnrysbtym != null) {
            int i8 = IAuthTabCallback + 5;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 37 / 0;
                iHashCode4 = r8lambdawfwhrwhus20gezotryrnrysbtym.hashCode();
            } else {
                iHashCode4 = r8lambdawfwhrwhus20gezotryrnrysbtym.hashCode();
            }
            int i10 = onExtraCallback + 59;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Cta(label=" + this.label + ", description=" + this.description + ", scheme=" + this.scheme + ", enable=" + this.enable + ", type=" + this.type + ", buttonTheme=" + this.buttonTheme + ")";
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate, @Nullable String str4, @Nullable r8lambdawFWhRWhus20GezotRyrNrYsbtYM r8lambdawfwhrwhus20gezotryrnrysbtym) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.label = str;
        this.description = str2;
        this.scheme = str3;
        this.enable = reactPackageTurboModuleManagerDelegate;
        this.type = str4;
        this.buttonTheme = r8lambdawfwhrwhus20gezotryrnrysbtym;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambda_7VDailUq5qVpfgCfeev5lNyGiQ(String str, String str2, String str3, ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate, String str4, r8lambdawFWhRWhus20GezotRyrNrYsbtYM r8lambdawfwhrwhus20gezotryrnrysbtym, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegate2;
        String str5;
        int i2 = i & 1;
        String str6 = BuildConfig.FLAVOR;
        r8lambdawFWhRWhus20GezotRyrNrYsbtYM r8lambdawfwhrwhus20gezotryrnrysbtym2 = null;
        if (i2 != 0) {
            int i3 = onExtraCallback + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        String str7 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                r8lambdawfwhrwhus20gezotryrnrysbtym2.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallback + 93;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            reactPackageTurboModuleManagerDelegate2 = null;
        } else {
            reactPackageTurboModuleManagerDelegate2 = reactPackageTurboModuleManagerDelegate;
        }
        if ((i & 16) != 0) {
            int i9 = IAuthTabCallback + 69;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 32) != 0) {
            int i11 = IAuthTabCallback + 95;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            r8lambdawfwhrwhus20gezotryrnrysbtym2 = r8lambdawfwhrwhus20gezotryrnrysbtym;
        }
        this(str, str7, str6, reactPackageTurboModuleManagerDelegate2, str5, r8lambdawfwhrwhus20gezotryrnrysbtym2);
    }
}
