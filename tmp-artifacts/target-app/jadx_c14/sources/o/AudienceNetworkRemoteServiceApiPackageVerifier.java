package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkRemoteServiceApiPackageVerifier implements getOther {
    public static final int $stable = 8;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final nativeAddRoundedCornersFilter banner;
    private final Function0<Unit> onClickEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AudienceNetworkRemoteServiceApiPackageVerifier)) {
            return false;
        }
        AudienceNetworkRemoteServiceApiPackageVerifier audienceNetworkRemoteServiceApiPackageVerifier = (AudienceNetworkRemoteServiceApiPackageVerifier) obj;
        if (Intrinsics.areEqual(this.banner, audienceNetworkRemoteServiceApiPackageVerifier.banner)) {
            return Intrinsics.areEqual(this.onClickEvent, audienceNetworkRemoteServiceApiPackageVerifier.onClickEvent);
        }
        int i3 = onNavigationEvent;
        int i4 = i3 + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 115;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.banner.hashCode();
        return i3 != 0 ? (iHashCode * 52) >>> this.onClickEvent.hashCode() : (iHashCode * 31) + this.onClickEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccBannerItem(banner=" + this.banner + ", onClickEvent=" + this.onClickEvent + ")";
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AudienceNetworkRemoteServiceApiPackageVerifier(@NotNull nativeAddRoundedCornersFilter nativeaddroundedcornersfilter, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(nativeaddroundedcornersfilter, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.banner = nativeaddroundedcornersfilter;
        this.onClickEvent = function0;
    }

    public final nativeAddRoundedCornersFilter onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.banner;
        }
        throw null;
    }

    public final Function0<Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.onClickEvent;
        int i4 = i3 + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return function0;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.PLCC_CARD_BANNER;
        if (i3 == 0) {
            return toasn1encodablevector;
        }
        throw null;
    }
}
