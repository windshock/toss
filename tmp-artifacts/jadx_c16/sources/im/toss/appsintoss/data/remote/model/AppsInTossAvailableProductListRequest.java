package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListRequest$;
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
public final class AppsInTossAvailableProductListRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String countryCode;

    static {
        int i = IAuthTabCallback + 73;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AppsInTossAvailableProductListRequest)) {
            int i7 = i3 + 27;
            onNavigationEvent = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.countryCode, ((AppsInTossAvailableProductListRequest) obj).countryCode)) {
            return false;
        }
        int i8 = onWarmupCompleted + 65;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.countryCode.hashCode();
            int i3 = 87 / 0;
        } else {
            iHashCode = this.countryCode.hashCode();
        }
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossAvailableProductListRequest(countryCode=" + this.countryCode + ")";
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AppsInTossAvailableProductListRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AppsInTossAvailableProductListRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.countryCode = str;
    }

    public AppsInTossAvailableProductListRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.countryCode = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AppsInTossAvailableProductListRequest appsInTossAvailableProductListRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossAvailableProductListRequest.countryCode);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }
}
