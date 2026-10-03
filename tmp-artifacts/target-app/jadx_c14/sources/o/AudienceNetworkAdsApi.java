package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkAdsApi implements getOther {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final getInitializationType cardBanner;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudienceNetworkAdsApi() {
        getInitializationType getinitializationtype = null;
        this(getinitializationtype, 1, getinitializationtype);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudienceNetworkAdsApi) {
            if (Intrinsics.areEqual(this.cardBanner, ((AudienceNetworkAdsApi) obj).cardBanner)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i3 + 93;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 53;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        getInitializationType getinitializationtype = this.cardBanner;
        if (getinitializationtype != null) {
            return getinitializationtype.hashCode();
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardBannerWrapper(cardBanner=" + this.cardBanner + ")";
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AudienceNetworkAdsApi(@Nullable getInitializationType getinitializationtype) {
        this.cardBanner = getinitializationtype;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudienceNetworkAdsApi(getInitializationType getinitializationtype, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            getinitializationtype = null;
        }
        this(getinitializationtype);
    }

    public final getInitializationType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getInitializationType getinitializationtype = this.cardBanner;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return getinitializationtype;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.TRANSACTION_DETAIL_HEADER_BANNER;
            obj.hashCode();
            throw null;
        }
        toASN1EncodableVector toasn1encodablevector2 = toASN1EncodableVector.TRANSACTION_DETAIL_HEADER_BANNER;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return toasn1encodablevector2;
        }
        obj.hashCode();
        throw null;
    }
}
