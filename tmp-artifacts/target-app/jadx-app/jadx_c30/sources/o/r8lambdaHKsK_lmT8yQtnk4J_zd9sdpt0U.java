package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambdaHKsK_lmT8yQtnk4J_zd9sdpt0U {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private String contactName;

    @SerializedName("name")
    private String name;

    @SerializedName(PKCS12.KEY_PHONE)
    private String phone;

    @SerializedName(PKCS12.KEY_USER_NO)
    private long userNo;

    public r8lambdaHKsK_lmT8yQtnk4J_zd9sdpt0U() {
        this(null, null, 0L, 7, null);
    }

    public r8lambdaHKsK_lmT8yQtnk4J_zd9sdpt0U(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.phone = str;
        this.name = str2;
        this.userNo = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaHKsK_lmT8yQtnk4J_zd9sdpt0U(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i7 = onWarmupCompleted + 55;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            int i10 = 2 % 2;
            j = -1;
        }
        this(str, str2, j);
    }
}
