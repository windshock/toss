package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.AdContentType;
import im.toss.features.benefit.dto.AdsPlayTimePercentRequest$;
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
public final class AdsPlayTimePercentRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final AdContentType adContentType;
    private final long adId;
    private final long adSetId;
    private final long campaignId;
    private final ContractType contractType;
    private final String eventTs;
    private final int percentage;
    private final String requestId;
    private final long spaceId;
    private final long unitPrice;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AdContentType.Companion companion = AdContentType.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i3 = onNavigationEvent + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnWarmupCompleted;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = ContractType.Companion.serializer();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return kSerializerSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof AdsPlayTimePercentRequest)) {
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AdsPlayTimePercentRequest adsPlayTimePercentRequest = (AdsPlayTimePercentRequest) obj;
        if (this.campaignId != adsPlayTimePercentRequest.campaignId || this.adSetId != adsPlayTimePercentRequest.adSetId || this.adId != adsPlayTimePercentRequest.adId || this.spaceId != adsPlayTimePercentRequest.spaceId) {
            return false;
        }
        if (this.contractType != adsPlayTimePercentRequest.contractType) {
            int i5 = onExtraCallback;
            int i6 = i5 + 47;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 75;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.adContentType != adsPlayTimePercentRequest.adContentType || !Intrinsics.areEqual(this.requestId, adsPlayTimePercentRequest.requestId) || this.percentage != adsPlayTimePercentRequest.percentage) {
            return false;
        }
        if (this.unitPrice == adsPlayTimePercentRequest.unitPrice) {
            return Intrinsics.areEqual(this.eventTs, adsPlayTimePercentRequest.eventTs);
        }
        int i10 = onExtraCallback + 5;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Long.hashCode(this.campaignId);
        int iHashCode3 = Long.hashCode(this.adSetId);
        int iHashCode4 = Long.hashCode(this.adId);
        int iHashCode5 = Long.hashCode(this.spaceId);
        ContractType contractType = this.contractType;
        if (contractType == null) {
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = contractType.hashCode();
        }
        AdContentType adContentType = this.adContentType;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + (adContentType != null ? adContentType.hashCode() : 0)) * 31) + this.requestId.hashCode()) * 31) + Integer.hashCode(this.percentage)) * 31) + Long.hashCode(this.unitPrice)) * 31) + this.eventTs.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdsPlayTimePercentRequest(campaignId=" + this.campaignId + ", adSetId=" + this.adSetId + ", adId=" + this.adId + ", spaceId=" + this.spaceId + ", contractType=" + this.contractType + ", adContentType=" + this.adContentType + ", requestId=" + this.requestId + ", percentage=" + this.percentage + ", unitPrice=" + this.unitPrice + ", eventTs=" + this.eventTs + ")";
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AdsPlayTimePercentRequest$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AdsPlayTimePercentRequest$.ExternalSyntheticLambda1()), null, null, null, null};
        int i = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AdsPlayTimePercentRequest(int i, long j, long j2, long j3, long j4, ContractType contractType, AdContentType adContentType, String str, int i2, long j5, String str2, okycx okycxVar) {
        if (1023 != (i & 1023)) {
            int i3 = onExtraCallback + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 1023, AdsPlayTimePercentRequest$.serializer.INSTANCE.getDescriptor());
            int i5 = onExtraCallback + 65;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
        }
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.adContentType = adContentType;
        this.requestId = str;
        this.percentage = i2;
        this.unitPrice = j5;
        this.eventTs = str2;
    }

    public AdsPlayTimePercentRequest(long j, long j2, long j3, long j4, @Nullable ContractType contractType, @Nullable AdContentType adContentType, @NotNull String str, int i, long j5, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.adContentType = adContentType;
        this.requestId = str;
        this.percentage = i;
        this.unitPrice = j5;
        this.eventTs = str2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AdsPlayTimePercentRequest adsPlayTimePercentRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, adsPlayTimePercentRequest.campaignId);
        vylVar.onExtraCallback(serialDescriptor, 1, adsPlayTimePercentRequest.adSetId);
        vylVar.onExtraCallback(serialDescriptor, 2, adsPlayTimePercentRequest.adId);
        vylVar.onExtraCallback(serialDescriptor, 3, adsPlayTimePercentRequest.spaceId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), adsPlayTimePercentRequest.contractType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), adsPlayTimePercentRequest.adContentType);
        vylVar.onExtraCallback(serialDescriptor, 6, adsPlayTimePercentRequest.requestId);
        vylVar.onExtraCallback(serialDescriptor, 7, adsPlayTimePercentRequest.percentage);
        vylVar.onExtraCallback(serialDescriptor, 8, adsPlayTimePercentRequest.unitPrice);
        vylVar.onExtraCallback(serialDescriptor, 9, adsPlayTimePercentRequest.eventTs);
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }
}
