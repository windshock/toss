package im.toss.features.credit.data.response.membership;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusAccessInfoResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String linkUrl;

    static {
        int i = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditPlusAccessInfoResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof CreditPlusAccessInfoResponse))) {
            return Intrinsics.areEqual(this.linkUrl, ((CreditPlusAccessInfoResponse) obj).linkUrl);
        }
        int i4 = i2 + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.linkUrl.hashCode();
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditPlusAccessInfoResponse(linkUrl=" + this.linkUrl + ")";
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CreditPlusAccessInfoResponse(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.linkUrl = "";
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.linkUrl = str;
        int i3 = IAuthTabCallback + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public CreditPlusAccessInfoResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linkUrl = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(CreditPlusAccessInfoResponse creditPlusAccessInfoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(creditPlusAccessInfoResponse.linkUrl, "");
                throw null;
            }
            if (Intrinsics.areEqual(creditPlusAccessInfoResponse.linkUrl, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, creditPlusAccessInfoResponse.linkUrl);
        int i3 = onNavigationEvent + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusAccessInfoResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            str = "";
            int i5 = i3 + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(str);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.linkUrl;
        int i4 = i2 + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
