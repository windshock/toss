package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.AdsClickRequest$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AdsClickRequest {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long adId;
    private final long adSetId;
    private final long campaignId;
    private final ContractType contractType;
    private final String eventTs;
    private final String requestId;
    private final long spaceId;
    private final String trackingClickId;
    private final long unitPrice;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AdsClickRequest$.ExternalSyntheticLambda0()), null, null, null, null};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = ContractType.Companion.serializer();
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallback = onExtraCallback();
            int i3 = 54 / 0;
        } else {
            kSerializerOnExtraCallback = onExtraCallback();
        }
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdsClickRequest)) {
            return false;
        }
        AdsClickRequest adsClickRequest = (AdsClickRequest) obj;
        if (this.campaignId != adsClickRequest.campaignId) {
            int i4 = onWarmupCompleted + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return false;
        }
        if (this.adSetId != adsClickRequest.adSetId) {
            int i6 = onExtraCallback + 59;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.adId != adsClickRequest.adId || this.spaceId != adsClickRequest.spaceId || this.contractType != adsClickRequest.contractType) {
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, adsClickRequest.requestId)) {
            return Intrinsics.areEqual(this.trackingClickId, adsClickRequest.trackingClickId) && Intrinsics.areEqual(this.eventTs, adsClickRequest.eventTs) && this.unitPrice == adsClickRequest.unitPrice;
        }
        int i8 = onExtraCallback + 55;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[PHI: r1 r3 r4 r5 r6
      0x0053: PHI (r1v23 int) = (r1v4 int), (r1v24 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r3v5 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r6v4 im.toss.features.benefit.dto.ContractType) = (r6v0 im.toss.features.benefit.dto.ContractType), (r6v5 im.toss.features.benefit.dto.ContractType) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r1 r3 r4 r5
      0x0049: PHI (r1v5 int) = (r1v4 int), (r1v24 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r3v3 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        ContractType contractType;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode5 = 0;
        long j = this.campaignId;
        if (i3 == 0) {
            iHashCode = Long.hashCode(j);
            iHashCode2 = Long.hashCode(this.adSetId);
            iHashCode3 = Long.hashCode(this.adId);
            iHashCode4 = Long.hashCode(this.spaceId);
            contractType = this.contractType;
            int i4 = 71 / 0;
            if (contractType == null) {
                int i5 = onExtraCallback + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode5 = contractType.hashCode();
            }
        } else {
            iHashCode = Long.hashCode(j);
            iHashCode2 = Long.hashCode(this.adSetId);
            iHashCode3 = Long.hashCode(this.adId);
            iHashCode4 = Long.hashCode(this.spaceId);
            contractType = this.contractType;
            if (contractType == null) {
            }
        }
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + this.requestId.hashCode()) * 31) + this.trackingClickId.hashCode()) * 31) + this.eventTs.hashCode()) * 31) + Long.hashCode(this.unitPrice);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdsClickRequest(campaignId=" + this.campaignId + ", adSetId=" + this.adSetId + ", adId=" + this.adId + ", spaceId=" + this.spaceId + ", contractType=" + this.contractType + ", requestId=" + this.requestId + ", trackingClickId=" + this.trackingClickId + ", eventTs=" + this.eventTs + ", unitPrice=" + this.unitPrice + ")";
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return str;
    }

    static {
        int i = IAuthTabCallback + 13;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
    }

    public /* synthetic */ AdsClickRequest(int i, long j, long j2, long j3, long j4, ContractType contractType, String str, String str2, String str3, long j5, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 511;
        if (511 != (i & 511)) {
            int i3 = onExtraCallback + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AdsClickRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 13853;
            } else {
                descriptor = AdsClickRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.requestId = str;
        this.trackingClickId = str2;
        this.eventTs = str3;
        this.unitPrice = j5;
    }

    public AdsClickRequest(long j, long j2, long j3, long j4, @Nullable ContractType contractType, @NotNull String str, @NotNull String str2, @NotNull String str3, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.requestId = str;
        this.trackingClickId = str2;
        this.eventTs = str3;
        this.unitPrice = j5;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AdsClickRequest adsClickRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, adsClickRequest.campaignId);
        vylVar.onExtraCallback(serialDescriptor, 1, adsClickRequest.adSetId);
        vylVar.onExtraCallback(serialDescriptor, 2, adsClickRequest.adId);
        vylVar.onExtraCallback(serialDescriptor, 3, adsClickRequest.spaceId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), adsClickRequest.contractType);
        vylVar.onExtraCallback(serialDescriptor, 5, adsClickRequest.requestId);
        vylVar.onExtraCallback(serialDescriptor, 6, adsClickRequest.trackingClickId);
        vylVar.onExtraCallback(serialDescriptor, 7, adsClickRequest.eventTs);
        vylVar.onExtraCallback(serialDescriptor, 8, adsClickRequest.unitPrice);
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }
}
