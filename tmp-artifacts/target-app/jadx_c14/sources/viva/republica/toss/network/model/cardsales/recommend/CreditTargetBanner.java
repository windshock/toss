package viva.republica.toss.network.model.cardsales.recommend;

import com.bytedance.sdk.openadsdk.wwx.lt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CreditTargetBanner$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditTargetBanner {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long cardId;
    private final String cardType;
    private final String ctaText;
    private final long id;
    private final String landingUrl;
    private final String logName;
    private final String logoImageType;
    private final String logoImageUrl;
    private final String subTitle;
    private final String title;

    static {
        int i = onExtraCallback + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public CreditTargetBanner() {
        this(0L, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i5 | i7 | (~i);
        int i9 = ~i5;
        int i10 = (~(i | i7)) | (~(i7 | i9));
        int i11 = i6 + i5 + i4 + ((-92689393) * i3) + (1942122663 * i2);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i6) - 357761024) + ((-674687396) * i5) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i4) + ((-1056047104) * i3) + ((-742522880) * i2) + ((-592117760) * i12);
        int i14 = (i6 * 1048061654) + 1366922925 + (i5 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i4 * 1048061961) + (i3 * 439444615) + (i2 * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditTargetBanner)) {
            return false;
        }
        CreditTargetBanner creditTargetBanner = (CreditTargetBanner) obj;
        if (this.cardId != creditTargetBanner.cardId) {
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cardType, creditTargetBanner.cardType) || !Intrinsics.areEqual(this.ctaText, creditTargetBanner.ctaText)) {
            return false;
        }
        if (this.id != creditTargetBanner.id) {
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, creditTargetBanner.landingUrl)) {
            int i6 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.logName, creditTargetBanner.logName))) {
            return !(Intrinsics.areEqual(this.logoImageUrl, creditTargetBanner.logoImageUrl) ^ true) && Intrinsics.areEqual(this.logoImageType, creditTargetBanner.logoImageType) && Intrinsics.areEqual(this.subTitle, creditTargetBanner.subTitle) && Intrinsics.areEqual(this.title, creditTargetBanner.title);
        }
        int i8 = onExtraCallbackWithResult;
        int i9 = i8 + 41;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 51;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((Long.hashCode(this.cardId) * 31) + this.cardType.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.landingUrl.hashCode()) * 31) + this.logName.hashCode()) * 31) + this.logoImageUrl.hashCode()) * 31) + this.logoImageType.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.title.hashCode();
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditTargetBanner(cardId=" + this.cardId + ", cardType=" + this.cardType + ", ctaText=" + this.ctaText + ", id=" + this.id + ", landingUrl=" + this.landingUrl + ", logName=" + this.logName + ", logoImageUrl=" + this.logoImageUrl + ", logoImageType=" + this.logoImageType + ", subTitle=" + this.subTitle + ", title=" + this.title + ")";
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditTargetBanner> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CreditTargetBanner$.serializer serializerVar = CreditTargetBanner$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ CreditTargetBanner(int i, long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.cardId = -1L;
        } else {
            this.cardId = j;
        }
        if ((i & 2) == 0) {
            this.cardType = "";
        } else {
            this.cardType = str;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 5;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            int i5 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.ctaText = "";
            int i7 = 2 % 2;
        } else {
            this.ctaText = str2;
        }
        if ((i & 8) == 0) {
            this.id = -1L;
        } else {
            this.id = j2;
            int i8 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.landingUrl = "";
            int i9 = 2 % 2;
        } else {
            this.landingUrl = str3;
        }
        if ((i & 32) == 0) {
            this.logName = "";
        } else {
            this.logName = str4;
        }
        if ((i & 64) == 0) {
            this.logoImageUrl = "";
        } else {
            this.logoImageUrl = str5;
        }
        this.logoImageType = (i & 128) == 0 ? "DEFAULT" : str6;
        if ((i & 256) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str7;
        }
        if ((i & 512) != 0) {
            this.title = str8;
            return;
        }
        int i10 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        this.title = "";
    }

    public CreditTargetBanner(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.cardId = j;
        this.cardType = str;
        this.ctaText = str2;
        this.id = j2;
        this.landingUrl = str3;
        this.logName = str4;
        this.logoImageUrl = str5;
        this.logoImageType = str6;
        this.subTitle = str7;
        this.title = str8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.cardsales.recommend.CreditTargetBanner.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditTargetBanner(long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str9;
        String str10;
        String str11;
        long j4 = -1;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            j3 = -1;
        } else {
            j3 = j;
        }
        String str12 = "";
        String str13 = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 5;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str9 = "";
        } else {
            str9 = str2;
        }
        if ((i & 8) != 0) {
            int i10 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            j4 = j2;
        }
        String str14 = (i & 16) != 0 ? "" : str3;
        String str15 = (i & 32) != 0 ? "" : str4;
        if ((i & 64) != 0) {
            int i13 = 2 % 2;
            str10 = "";
        } else {
            str10 = str5;
        }
        if ((i & 128) != 0) {
            int i14 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            str11 = "DEFAULT";
        } else {
            str11 = str6;
        }
        String str16 = (i & 256) != 0 ? "" : str7;
        if ((i & 512) != 0) {
            int i17 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 % 2;
            }
        } else {
            str12 = str8;
        }
        this(j3, str13, str9, j4, str14, str15, str10, str11, str16, str12);
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cardId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.cardType;
        int i5 = i3 + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ctaText;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditTargetBanner creditTargetBanner = (CreditTargetBanner) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            long j = creditTargetBanner.id;
            throw null;
        }
        long j2 = creditTargetBanner.id;
        int i4 = i3 + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.landingUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoImageUrl;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoImageType;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CreditTargetBanner creditTargetBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, new Object[]{creditTargetBanner, vylVar, serialDescriptor}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1336824450, 1336824451);
    }

    public final long onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return ((Long) onExtraCallbackWithResult(iOnExtraCallbackWithResult, new Object[]{this}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1117591433, -1117591433)).longValue();
    }
}
