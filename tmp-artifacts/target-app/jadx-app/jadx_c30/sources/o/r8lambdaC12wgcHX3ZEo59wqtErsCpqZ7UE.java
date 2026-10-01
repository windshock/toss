package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("ctaBtnTitle")
    private String cta;

    @SerializedName("linkUrl")
    private String linkUrl;

    @SerializedName("title")
    private String title;

    public r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE)) {
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE r8lambdac12wgchx3zeo59wqterscpqz7ue = (r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE) obj;
        if (!Intrinsics.areEqual(this.title, r8lambdac12wgchx3zeo59wqterscpqz7ue.title)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.cta, r8lambdac12wgchx3zeo59wqterscpqz7ue.cta))) {
            return Intrinsics.areEqual(this.linkUrl, r8lambdac12wgchx3zeo59wqterscpqz7ue.linkUrl);
        }
        int i6 = IAuthTabCallback + 49;
        onWarmupCompleted = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.title;
        if (str == null) {
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.cta;
        if (str2 == null) {
            int i4 = IAuthTabCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.linkUrl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BottomBanner(title=" + this.title + ", cta=" + this.cta + ", linkUrl=" + this.linkUrl + ")";
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.cta = str2;
        this.linkUrl = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaC12wgcHX3ZEo59wqtErsCpqZ7UE(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        str2 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 29;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str3 = BuildConfig.FLAVOR;
        }
        this(str, str2, str3);
    }
}
