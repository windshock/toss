package com.appsflyer.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AFe1jSDK$AFa1vSDK {
    private String advertisingId;
    private boolean advertisingIdWithGps;
    private final StringBuilder gaidError;
    private Boolean isLimitAdTrackingEnabled;

    public AFe1jSDK$AFa1vSDK() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ AFe1jSDK$AFa1vSDK copy$default(AFe1jSDK$AFa1vSDK aFe1jSDK$AFa1vSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aFe1jSDK$AFa1vSDK.advertisingId;
        }
        if ((i2 & 2) != 0) {
            bool = aFe1jSDK$AFa1vSDK.isLimitAdTrackingEnabled;
        }
        if ((i2 & 4) != 0) {
            z = aFe1jSDK$AFa1vSDK.advertisingIdWithGps;
        }
        if ((i2 & 8) != 0) {
            sb = aFe1jSDK$AFa1vSDK.gaidError;
        }
        return aFe1jSDK$AFa1vSDK.copy(str, bool, z, sb);
    }

    public final String component1() {
        return this.advertisingId;
    }

    public final Boolean component2() {
        return this.isLimitAdTrackingEnabled;
    }

    public final boolean component3() {
        return this.advertisingIdWithGps;
    }

    public final StringBuilder component4() {
        return this.gaidError;
    }

    public final AFe1jSDK$AFa1vSDK copy(@Nullable String str, @Nullable Boolean bool, boolean z, @NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        return new AFe1jSDK$AFa1vSDK(str, bool, z, sb);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1jSDK$AFa1vSDK)) {
            return false;
        }
        AFe1jSDK$AFa1vSDK aFe1jSDK$AFa1vSDK = (AFe1jSDK$AFa1vSDK) obj;
        return Intrinsics.areEqual(this.advertisingId, aFe1jSDK$AFa1vSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFe1jSDK$AFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFe1jSDK$AFa1vSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFe1jSDK$AFa1vSDK.gaidError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.advertisingId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isLimitAdTrackingEnabled;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        boolean z = this.advertisingIdWithGps;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i2) * 31) + this.gaidError.hashCode();
    }

    public final String toString() {
        return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
    }

    public AFe1jSDK$AFa1vSDK(@Nullable String str, @Nullable Boolean bool, boolean z, @NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        this.advertisingId = str;
        this.isLimitAdTrackingEnabled = bool;
        this.advertisingIdWithGps = z;
        this.gaidError = sb;
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final void setAdvertisingId(@Nullable String str) {
        this.advertisingId = str;
    }

    public final Boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
        this.isLimitAdTrackingEnabled = bool;
    }

    public final boolean getAdvertisingIdWithGps() {
        return this.advertisingIdWithGps;
    }

    public final void setAdvertisingIdWithGps(boolean z) {
        this.advertisingIdWithGps = z;
    }

    public /* synthetic */ AFe1jSDK$AFa1vSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new StringBuilder() : sb);
    }

    public final StringBuilder getGaidError() {
        return this.gaidError;
    }
}
