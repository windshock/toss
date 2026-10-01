package im.toss.features.affiliateauth.remote;

import im.toss.features.affiliateauth.remote.AffiliateAuthTokenResponse$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AffiliateAuthTokenResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String authToken;

    static {
        int i = IAuthTabCallback + 119;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AffiliateAuthTokenResponse)) {
            int i5 = i3 + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.authToken, ((AffiliateAuthTokenResponse) obj).authToken)) {
            return true;
        }
        int i7 = onExtraCallback + 77;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.authToken;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AffiliateAuthTokenResponse(authToken=" + this.authToken + ")";
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
        return str;
    }

    public /* synthetic */ AffiliateAuthTokenResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 == 0 ? AffiliateAuthTokenResponse$.serializer.INSTANCE : AffiliateAuthTokenResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.authToken = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AffiliateAuthTokenResponse affiliateAuthTokenResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, affiliateAuthTokenResponse.authToken);
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authToken;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
