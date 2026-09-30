package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.AdsImpressionRequest$;
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
public final class AdsImpressionRequest {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long adId;
    private final long adSetId;
    private final long campaignId;
    private final ContractType contractType;
    private final String eventTs;
    private final String requestId;
    private final long spaceId;
    private final long unitPrice;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AdsImpressionRequest$.ExternalSyntheticLambda0()), null, null, null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = ContractType.Companion.serializer();
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsImpressionRequest)) {
            return false;
        }
        AdsImpressionRequest adsImpressionRequest = (AdsImpressionRequest) obj;
        if (this.campaignId != adsImpressionRequest.campaignId) {
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.adSetId != adsImpressionRequest.adSetId) {
            return false;
        }
        if (this.adId != adsImpressionRequest.adId) {
            int i4 = onNavigationEvent + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.spaceId != adsImpressionRequest.spaceId || this.contractType != adsImpressionRequest.contractType || !Intrinsics.areEqual(this.requestId, adsImpressionRequest.requestId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.eventTs, adsImpressionRequest.eventTs)) {
            int i6 = onNavigationEvent + 121;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.unitPrice == adsImpressionRequest.unitPrice) {
            return true;
        }
        int i8 = onWarmupCompleted + 99;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.campaignId);
        int iHashCode2 = Long.hashCode(this.adSetId);
        int iHashCode3 = Long.hashCode(this.adId);
        int iHashCode4 = Long.hashCode(this.spaceId);
        ContractType contractType = this.contractType;
        if (contractType == null) {
            int i5 = onWarmupCompleted + 33;
            onNavigationEvent = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode5 = contractType.hashCode();
            int i6 = onWarmupCompleted + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode5;
        }
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + this.requestId.hashCode()) * 31) + this.eventTs.hashCode()) * 31) + Long.hashCode(this.unitPrice);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdsImpressionRequest(campaignId=" + this.campaignId + ", adSetId=" + this.adSetId + ", adId=" + this.adId + ", spaceId=" + this.spaceId + ", contractType=" + this.contractType + ", requestId=" + this.requestId + ", eventTs=" + this.eventTs + ", unitPrice=" + this.unitPrice + ")";
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ AdsImpressionRequest(int i, long j, long j2, long j3, long j4, ContractType contractType, String str, String str2, long j5, okycx okycxVar) {
        if (255 != (i & 255)) {
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 255, AdsImpressionRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.requestId = str;
        this.eventTs = str2;
        this.unitPrice = j5;
    }

    public AdsImpressionRequest(long j, long j2, long j3, long j4, @Nullable ContractType contractType, @NotNull String str, @NotNull String str2, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.campaignId = j;
        this.adSetId = j2;
        this.adId = j3;
        this.spaceId = j4;
        this.contractType = contractType;
        this.requestId = str;
        this.eventTs = str2;
        this.unitPrice = j5;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AdsImpressionRequest adsImpressionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, adsImpressionRequest.campaignId);
        vylVar.onExtraCallback(serialDescriptor, 1, adsImpressionRequest.adSetId);
        vylVar.onExtraCallback(serialDescriptor, 2, adsImpressionRequest.adId);
        vylVar.onExtraCallback(serialDescriptor, 3, adsImpressionRequest.spaceId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), adsImpressionRequest.contractType);
        vylVar.onExtraCallback(serialDescriptor, 5, adsImpressionRequest.requestId);
        vylVar.onExtraCallback(serialDescriptor, 6, adsImpressionRequest.eventTs);
        vylVar.onExtraCallback(serialDescriptor, 7, adsImpressionRequest.unitPrice);
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        obj.hashCode();
        throw null;
    }
}
