package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GingerbreadPurgeableDecoder {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("bannerType")
    private final String bannerType;

    @SerializedName("bgColor")
    private final String bgColor;

    @SerializedName("countDown")
    private final boolean countDown;

    @SerializedName("endCountDownDate")
    private final String endCountDownDate;

    @SerializedName("id")
    private final long id;

    @SerializedName("imgPath")
    private final String imgPath;

    @SerializedName("link")
    private final String link;

    @SerializedName("moviePath")
    private final String moviePath;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("thumbnailPath")
    private final String thumbnailPath;

    @SerializedName("title")
    private final String title;

    public GingerbreadPurgeableDecoder() {
        this(0L, null, null, null, null, null, null, null, null, false, null, 2047, null);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i6);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i4 | i6)) | i10;
        int i13 = (~(i6 | i4 | i5)) | (~(i8 | (~i5)));
        int i14 = i4 + i5 + i2 + ((-2005657349) * i) + (1476006321 * i3);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i4) - 1319501824) + (407026429 * i5) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i2) + ((-798228480) * i) + ((-1404829696) * i3) + ((-1043726336) * i15);
        int i17 = (i4 * 961754349) + 784684277 + (i5 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i2 * 961754313) + (i * (-1264871149)) + (i3 * 72538105) + (i15 * 798621696);
        return i16 + ((i17 * i17) * (-1437204480)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof GingerbreadPurgeableDecoder)) {
            return false;
        }
        GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder = (GingerbreadPurgeableDecoder) obj;
        if (this.id != gingerbreadPurgeableDecoder.id) {
            int i7 = i3 + 95;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.title, gingerbreadPurgeableDecoder.title)) {
            int i8 = onWarmupCompleted + 11;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, gingerbreadPurgeableDecoder.subTitle) || (!Intrinsics.areEqual(this.bannerType, gingerbreadPurgeableDecoder.bannerType)) || !Intrinsics.areEqual(this.thumbnailPath, gingerbreadPurgeableDecoder.thumbnailPath) || !Intrinsics.areEqual(this.moviePath, gingerbreadPurgeableDecoder.moviePath) || !Intrinsics.areEqual(this.imgPath, gingerbreadPurgeableDecoder.imgPath)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bgColor, gingerbreadPurgeableDecoder.bgColor)) {
            return Intrinsics.areEqual(this.link, gingerbreadPurgeableDecoder.link) && this.countDown == gingerbreadPurgeableDecoder.countDown && Intrinsics.areEqual(this.endCountDownDate, gingerbreadPurgeableDecoder.endCountDownDate);
        }
        int i10 = onWarmupCompleted + 17;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.id);
        int iHashCode3 = this.title.hashCode();
        String str = this.subTitle;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.bannerType.hashCode();
        String str2 = this.thumbnailPath;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.moviePath;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.imgPath;
        if (str4 == null) {
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.bgColor;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.link;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        int iHashCode11 = Boolean.hashCode(this.countDown);
        String str7 = this.endCountDownDate;
        if (str7 != null) {
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int iHashCode12 = str7.hashCode();
                int i4 = 56 / 0;
                iHashCode4 = iHashCode12;
            } else {
                iHashCode4 = str7.hashCode();
            }
        }
        return (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccEventBanner(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", bannerType=" + this.bannerType + ", thumbnailPath=" + this.thumbnailPath + ", moviePath=" + this.moviePath + ", imgPath=" + this.imgPath + ", bgColor=" + this.bgColor + ", link=" + this.link + ", countDown=" + this.countDown + ", endCountDownDate=" + this.endCountDownDate + ")";
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public GingerbreadPurgeableDecoder(long j, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = j;
        this.title = str;
        this.subTitle = str2;
        this.bannerType = str3;
        this.thumbnailPath = str4;
        this.moviePath = str5;
        this.imgPath = str6;
        this.bgColor = str7;
        this.link = str8;
        this.countDown = z;
        this.endCountDownDate = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GingerbreadPurgeableDecoder(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        String str15 = null;
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                str15.hashCode();
                throw null;
            }
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 79;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str11 = null;
        } else {
            str11 = str2;
        }
        String str16 = (i & 8) != 0 ? "image" : str3;
        if ((i & 16) != 0) {
            int i8 = onWarmupCompleted + 23;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 65 / 0;
            }
            int i10 = 2 % 2;
            str12 = null;
        } else {
            str12 = str4;
        }
        if ((i & 32) != 0) {
            int i11 = onExtraCallback + 25;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                str15.hashCode();
                throw null;
            }
            int i12 = 2 % 2;
            str13 = null;
        } else {
            str13 = str5;
        }
        String str17 = (i & 64) != 0 ? null : str6;
        if ((i & 128) != 0) {
            int i13 = onWarmupCompleted + 47;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            str14 = null;
        } else {
            str14 = str7;
        }
        String str18 = (i & 256) != 0 ? null : str8;
        boolean z2 = (i & 512) == 0 ? z : false;
        if ((i & 1024) != 0) {
            int i16 = 2 % 2;
        } else {
            str15 = str9;
        }
        this(j2, str10, str11, str16, str12, str13, str17, str14, str18, z2, str15);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.id;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder = (GingerbreadPurgeableDecoder) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = gingerbreadPurgeableDecoder.title;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.moviePath;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.imgPath;
        int i4 = i2 + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.link;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.countDown;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.bannerType, "image");
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zAreEqual;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder = (GingerbreadPurgeableDecoder) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0 ? (iIntValue2 & 1) != 0 : (iIntValue2 & 1) != 0) {
            int i4 = i3 + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = charset.onExtraCallbackWithResult.ParcelableVolumeInfo().IAuthTabCallback();
            int i6 = onWarmupCompleted + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return Integer.valueOf(gingerbreadPurgeableDecoder.onExtraCallbackWithResult(iIntValue));
    }

    public final int onExtraCallbackWithResult(int i) {
        Integer numOnTransact;
        int i2 = 2 % 2;
        String str = this.bgColor;
        if (str != null && (numOnTransact = mergeParams.onTransact(str)) != null) {
            int i3 = onWarmupCompleted + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = numOnTransact.intValue();
        }
        int i5 = onWarmupCompleted + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    public final Date IAuthTabCallback() {
        Date date;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endCountDownDate;
        Object obj = null;
        if (str == null) {
            return null;
        }
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            date = ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(str);
            int i6 = 48 / 0;
        } else {
            Object[] objArr2 = {CommonModule_closeView.onWarmupCompleted};
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            date = ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr2, _string.onNavigationEvent.IAuthTabCallback())).parse(str);
        }
        int i7 = onExtraCallback + 123;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return date;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder, int i, int i2, Object obj) {
        Object[] objArr = {gingerbreadPurgeableDecoder, Integer.valueOf(i), Integer.valueOf(i2), obj};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return ((Integer) onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -902461325, objArr, 902461325, iIAuthTabCallback)).intValue();
    }

    public final String IAuthTabCallbackStub() {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (String) onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1848723695, new Object[]{this}, 1848723696, iIAuthTabCallback);
    }
}
