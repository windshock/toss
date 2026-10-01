package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.PremiumAdEventDebug$;
import im.toss.features.benefit.dto.PremiumAdEventRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
public final class PremiumAdEventRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long adId;
    private final String adType;
    private final String brandName;
    private final long campaignId;
    private final PremiumAdEventDebug debug;
    private final String eventIdentifier;
    private final String eventTs;
    private final String eventType;
    private final String requestId;
    private final String trackingClickId;

    static {
        int i = onExtraCallback + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumAdEventRequest)) {
            return false;
        }
        PremiumAdEventRequest premiumAdEventRequest = (PremiumAdEventRequest) obj;
        if (!Intrinsics.areEqual(this.adType, premiumAdEventRequest.adType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.eventType, premiumAdEventRequest.eventType)) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.eventIdentifier, premiumAdEventRequest.eventIdentifier)) {
            return false;
        }
        if (this.adId != premiumAdEventRequest.adId) {
            int i4 = onNavigationEvent + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.campaignId != premiumAdEventRequest.campaignId || !Intrinsics.areEqual(this.brandName, premiumAdEventRequest.brandName) || !Intrinsics.areEqual(this.requestId, premiumAdEventRequest.requestId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.trackingClickId, premiumAdEventRequest.trackingClickId)) {
            return Intrinsics.areEqual(this.eventTs, premiumAdEventRequest.eventTs) && Intrinsics.areEqual(this.debug, premiumAdEventRequest.debug);
        }
        int i6 = onWarmupCompleted + 85;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.adType.hashCode();
        int iHashCode3 = this.eventType.hashCode();
        int iHashCode4 = this.eventIdentifier.hashCode();
        int iHashCode5 = Long.hashCode(this.adId);
        int iHashCode6 = Long.hashCode(this.campaignId);
        int iHashCode7 = this.brandName.hashCode();
        int iHashCode8 = this.requestId.hashCode();
        String str = this.trackingClickId;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = this.eventTs.hashCode();
        PremiumAdEventDebug premiumAdEventDebug = this.debug;
        if (premiumAdEventDebug != null) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                premiumAdEventDebug.hashCode();
                throw null;
            }
            iHashCode = premiumAdEventDebug.hashCode();
        } else {
            iHashCode = 0;
        }
        int i3 = (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return i3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PremiumAdEventRequest(adType=" + this.adType + ", eventType=" + this.eventType + ", eventIdentifier=" + this.eventIdentifier + ", adId=" + this.adId + ", campaignId=" + this.campaignId + ", brandName=" + this.brandName + ", requestId=" + this.requestId + ", trackingClickId=" + this.trackingClickId + ", eventTs=" + this.eventTs + ", debug=" + this.debug + ")";
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PremiumAdEventRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                PremiumAdEventRequest$.serializer serializerVar = PremiumAdEventRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PremiumAdEventRequest$.serializer serializerVar2 = PremiumAdEventRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ PremiumAdEventRequest(int i, String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, PremiumAdEventDebug premiumAdEventDebug, okycx okycxVar) {
        if (383 != (i & 383)) {
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 383, PremiumAdEventRequest$.serializer.INSTANCE.getDescriptor());
        }
        this.adType = str;
        this.eventType = str2;
        this.eventIdentifier = str3;
        this.adId = j;
        this.campaignId = j2;
        this.brandName = str4;
        this.requestId = str5;
        if ((i & 128) == 0) {
            this.trackingClickId = null;
        } else {
            this.trackingClickId = str6;
        }
        int i4 = 2 % 2;
        this.eventTs = str7;
        if ((i & 512) != 0) {
            this.debug = premiumAdEventDebug;
            return;
        }
        this.debug = null;
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
    }

    public PremiumAdEventRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull String str7, @Nullable PremiumAdEventDebug premiumAdEventDebug) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.adType = str;
        this.eventType = str2;
        this.eventIdentifier = str3;
        this.adId = j;
        this.campaignId = j2;
        this.brandName = str4;
        this.requestId = str5;
        this.trackingClickId = str6;
        this.eventTs = str7;
        this.debug = premiumAdEventDebug;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(PremiumAdEventRequest premiumAdEventRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, premiumAdEventRequest.adType);
        vylVar.onExtraCallback(serialDescriptor, 1, premiumAdEventRequest.eventType);
        vylVar.onExtraCallback(serialDescriptor, 2, premiumAdEventRequest.eventIdentifier);
        vylVar.onExtraCallback(serialDescriptor, 3, premiumAdEventRequest.adId);
        vylVar.onExtraCallback(serialDescriptor, 4, premiumAdEventRequest.campaignId);
        vylVar.onExtraCallback(serialDescriptor, 5, premiumAdEventRequest.brandName);
        vylVar.onExtraCallback(serialDescriptor, 6, premiumAdEventRequest.requestId);
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || premiumAdEventRequest.trackingClickId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, premiumAdEventRequest.trackingClickId);
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 8, premiumAdEventRequest.eventTs);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9) && premiumAdEventRequest.debug == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, PremiumAdEventDebug$.serializer.INSTANCE, premiumAdEventRequest.debug);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.eventType;
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.eventIdentifier;
        int i4 = i3 + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.adId;
        int i5 = i3 + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.campaignId;
        int i5 = i2 + 35;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return j;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.brandName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PremiumAdEventDebug onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.debug;
        }
        throw null;
    }
}
