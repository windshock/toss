package im.toss.features.affiliateauth.remote;

import im.toss.features.affiliateauth.remote.AffiliateAuthTokenRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AffiliateAuthTokenRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String affiliateCode;

    static {
        Object obj = null;
        int i = onNavigationEvent + 101;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AffiliateAuthTokenRequest) {
            if (Intrinsics.areEqual(this.affiliateCode, ((AffiliateAuthTokenRequest) obj).affiliateCode)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onExtraCallbackWithResult + 21;
        int i7 = i6 % 128;
        onWarmupCompleted = i7;
        boolean z = i6 % 2 == 0;
        int i8 = i7 + 99;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 12 / 0;
        }
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.affiliateCode.hashCode();
            int i3 = 74 / 0;
        } else {
            iHashCode = this.affiliateCode.hashCode();
        }
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AffiliateAuthTokenRequest(affiliateCode=" + this.affiliateCode + ")";
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AffiliateAuthTokenRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AffiliateAuthTokenRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.affiliateCode = str;
    }

    public AffiliateAuthTokenRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.affiliateCode = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AffiliateAuthTokenRequest affiliateAuthTokenRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            str = affiliateAuthTokenRequest.affiliateCode;
            i = 1;
        } else {
            i = 0;
            str = affiliateAuthTokenRequest.affiliateCode;
        }
        vylVar.onExtraCallback(serialDescriptor, i, str);
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
