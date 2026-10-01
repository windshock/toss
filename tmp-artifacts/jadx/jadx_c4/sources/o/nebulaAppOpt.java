package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import im.toss.features.credit.data.response.CreditHomeBannerResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class nebulaAppOpt {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final enableAppModelOpt onExtraCallbackWithResult;
    private final CreditOverview onNavigationEvent;
    private final CreditHomeBannerResponse onWarmupCompleted;

    public final enableAppModelOpt IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        enableAppModelOpt enableappmodelopt = this.onExtraCallbackWithResult;
        int i4 = i3 + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enableappmodelopt;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nebulaAppOpt)) {
            return false;
        }
        nebulaAppOpt nebulaappopt = (nebulaAppOpt) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, nebulaappopt.onNavigationEvent)) {
            int i3 = IAuthTabCallback + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onWarmupCompleted, nebulaappopt.onWarmupCompleted))) {
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, nebulaappopt.onExtraCallbackWithResult)) {
                int i5 = onExtraCallback;
                int i6 = i5 + 25;
                IAuthTabCallback = i6 % 128;
                z = i6 % 2 == 0;
                int i7 = i5 + 121;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            return z;
        }
        int i9 = IAuthTabCallback + 111;
        int i10 = i9 % 128;
        onExtraCallback = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 93;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        CreditOverview creditOverview;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (creditOverview = this.onNavigationEvent) != null : (creditOverview = this.onNavigationEvent) != null) {
            iHashCode = creditOverview.hashCode();
        } else {
            int i4 = i2 + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            }
            iHashCode = 0;
        }
        CreditHomeBannerResponse creditHomeBannerResponse = this.onWarmupCompleted;
        if (creditHomeBannerResponse == null) {
            int i6 = onExtraCallback + 73;
            IAuthTabCallback = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = creditHomeBannerResponse.hashCode();
        }
        enableAppModelOpt enableappmodelopt = this.onExtraCallbackWithResult;
        return (((iHashCode * 31) + iHashCode2) * 31) + (enableappmodelopt != null ? enableappmodelopt.hashCode() : 0);
    }

    public final CreditOverview onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final CreditHomeBannerResponse onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        CreditHomeBannerResponse creditHomeBannerResponse = this.onWarmupCompleted;
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return creditHomeBannerResponse;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHomeKcbData(creditOverview=" + this.onNavigationEvent + ", banners=" + this.onWarmupCompleted + ", loanManagementMissions=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public nebulaAppOpt(@Nullable CreditOverview creditOverview, @Nullable CreditHomeBannerResponse creditHomeBannerResponse, @Nullable enableAppModelOpt enableappmodelopt) {
        this.onNavigationEvent = creditOverview;
        this.onWarmupCompleted = creditHomeBannerResponse;
        this.onExtraCallbackWithResult = enableappmodelopt;
    }
}
