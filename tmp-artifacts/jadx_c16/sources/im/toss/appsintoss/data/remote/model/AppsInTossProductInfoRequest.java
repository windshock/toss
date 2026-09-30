package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppsInTossProductInfoRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String countryCode;
    private final String offerId;
    private final String sku;

    static {
        int i = onNavigationEvent + 3;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossProductInfoRequest)) {
            return false;
        }
        AppsInTossProductInfoRequest appsInTossProductInfoRequest = (AppsInTossProductInfoRequest) obj;
        if (!Intrinsics.areEqual(this.sku, appsInTossProductInfoRequest.sku)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.countryCode, appsInTossProductInfoRequest.countryCode)) {
            int i4 = onExtraCallback + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.offerId, appsInTossProductInfoRequest.offerId)) {
            return true;
        }
        int i6 = onWarmupCompleted + 71;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[PHI: r1 r3 r4
      0x0048: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
      0x0033: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.sku.hashCode();
            iHashCode2 = this.countryCode.hashCode();
            str = this.offerId;
            int i3 = 47 / 0;
            if (str == null) {
                int i4 = onWarmupCompleted;
                int i5 = i4 + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 29;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
            } else {
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.sku.hashCode();
            iHashCode2 = this.countryCode.hashCode();
            str = this.offerId;
            if (str == null) {
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossProductInfoRequest(sku=" + this.sku + ", countryCode=" + this.countryCode + ", offerId=" + this.offerId + ")";
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AppsInTossProductInfoRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, AppsInTossProductInfoRequest$.serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.sku = str;
        this.countryCode = str2;
        if ((i & 4) != 0) {
            this.offerId = str3;
            return;
        }
        this.offerId = null;
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public AppsInTossProductInfoRequest(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sku = str;
        this.countryCode = str2;
        this.offerId = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AppsInTossProductInfoRequest appsInTossProductInfoRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProductInfoRequest.sku);
            vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProductInfoRequest.countryCode);
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2))) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, appsInTossProductInfoRequest.offerId);
            } else if (appsInTossProductInfoRequest.offerId != null) {
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, appsInTossProductInfoRequest.sku);
            vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProductInfoRequest.countryCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            }
        }
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
