package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse$;
import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse$Carousel$;
import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse$Item$;
import im.toss.features.benefit.dto.BenefitTabPremiumAdResponse$SummaryHeader$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitTabPremiumAdResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long adId;
    private final String adType;
    private final String brandName;
    private final long campaignId;
    private final Carousel carousel;
    private final List<String> eventTypes;
    private final long id;
    private final String requestId;
    private final SummaryHeader summaryHeader;
    private final String trackingClickId;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new BenefitTabPremiumAdResponse$.ExternalSyntheticLambda0()), null, null, null};

    public BenefitTabPremiumAdResponse() {
        this(0L, (String) null, (String) null, 0L, 0L, (String) null, (List) null, (String) null, (Carousel) null, (SummaryHeader) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) onNavigationEvent(new Object[0], PushInfo.Companion.onExtraCallback(), 1665760688, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1665760687, PushInfo.Companion.onExtraCallback());
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i2);
        int i13 = i5 + i2 + i3 + (1075552530 * i6) + ((-1519595880) * i4);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i5) - 1639710720) + ((-2116975300) * i2) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i3) + ((-189792256) * i6) + (1111490560 * i4) + (1415839744 * i14);
        int i16 = (i5 * 251836610) + 257048825 + (i2 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i3 * 251837547) + (i6 * 1710852742) + (i4 * (-1855850104)) + (i14 * (-1244921856));
        if (i15 + (i16 * i16 * (-1300496384)) == 1) {
            return onWarmupCompleted(objArr);
        }
        BenefitTabPremiumAdResponse benefitTabPremiumAdResponse = (BenefitTabPremiumAdResponse) objArr[0];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback + 117;
        int i19 = i18 % 128;
        onExtraCallback = i19;
        int i20 = i18 % 2;
        long j = benefitTabPremiumAdResponse.campaignId;
        int i21 = i19 + 87;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitTabPremiumAdResponse)) {
            return false;
        }
        BenefitTabPremiumAdResponse benefitTabPremiumAdResponse = (BenefitTabPremiumAdResponse) obj;
        if (this.id != benefitTabPremiumAdResponse.id) {
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, benefitTabPremiumAdResponse.requestId)) {
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.trackingClickId, benefitTabPremiumAdResponse.trackingClickId)) {
            return false;
        }
        if (this.campaignId != benefitTabPremiumAdResponse.campaignId) {
            int i6 = IAuthTabCallback + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.adId != benefitTabPremiumAdResponse.adId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.brandName, benefitTabPremiumAdResponse.brandName)) {
            int i8 = IAuthTabCallback + 83;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.eventTypes, benefitTabPremiumAdResponse.eventTypes)) || !Intrinsics.areEqual(this.adType, benefitTabPremiumAdResponse.adType) || !Intrinsics.areEqual(this.carousel, benefitTabPremiumAdResponse.carousel)) {
            return false;
        }
        if (Intrinsics.areEqual(this.summaryHeader, benefitTabPremiumAdResponse.summaryHeader)) {
            return true;
        }
        int i10 = IAuthTabCallback + 43;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((Long.hashCode(this.id) * 31) + this.requestId.hashCode()) * 31) + this.trackingClickId.hashCode()) * 31) + Long.hashCode(this.campaignId)) * 31) + Long.hashCode(this.adId)) * 31) + this.brandName.hashCode()) * 31) + this.eventTypes.hashCode()) * 31) + this.adType.hashCode()) * 31) + this.carousel.hashCode()) * 31) + this.summaryHeader.hashCode();
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitTabPremiumAdResponse(id=" + this.id + ", requestId=" + this.requestId + ", trackingClickId=" + this.trackingClickId + ", campaignId=" + this.campaignId + ", adId=" + this.adId + ", brandName=" + this.brandName + ", eventTypes=" + this.eventTypes + ", adType=" + this.adType + ", carousel=" + this.carousel + ", summaryHeader=" + this.summaryHeader + ")";
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    public /* synthetic */ BenefitTabPremiumAdResponse(int i, long j, String str, String str2, long j2, long j3, String str3, List list, String str4, Carousel carousel, SummaryHeader summaryHeader, okycx okycxVar) {
        List listEmptyList;
        Carousel carousel2;
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.requestId = "";
        } else {
            this.requestId = str;
        }
        int i2 = 2 % 2;
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallback + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.trackingClickId = "";
            if (i4 != 0) {
                int i5 = 14 / 0;
            }
        } else {
            this.trackingClickId = str2;
        }
        if ((i & 8) == 0) {
            this.campaignId = 0L;
        } else {
            this.campaignId = j2;
        }
        if ((i & 16) == 0) {
            this.adId = 0L;
        } else {
            this.adId = j3;
            int i6 = IAuthTabCallback + 101;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = 2 % 2;
        if ((i & 32) == 0) {
            this.brandName = "";
        } else {
            this.brandName = str3;
        }
        if ((i & 64) == 0) {
            int i9 = onExtraCallback + 5;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        this.eventTypes = listEmptyList;
        if ((i & 128) == 0) {
            this.adType = "";
            int i11 = 2 % 2;
        } else {
            this.adType = str4;
        }
        if ((i & 256) == 0) {
            List list2 = null;
            carousel2 = new Carousel(list2, 1, (DefaultConstructorMarker) list2);
        } else {
            carousel2 = carousel;
        }
        this.carousel = carousel2;
        this.summaryHeader = (i & 512) == 0 ? new SummaryHeader(false, (ImageAsset) null, (ImageAsset) null, (SemanticColor) null, (SemanticColor) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null) : summaryHeader;
    }

    public BenefitTabPremiumAdResponse(long j, @NotNull String str, @NotNull String str2, long j2, long j3, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, @NotNull Carousel carousel, @NotNull SummaryHeader summaryHeader) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(carousel, "");
        Intrinsics.checkNotNullParameter(summaryHeader, "");
        this.id = j;
        this.requestId = str;
        this.trackingClickId = str2;
        this.campaignId = j2;
        this.adId = j3;
        this.brandName = str3;
        this.eventTypes = list;
        this.adType = str4;
        this.carousel = carousel;
        this.summaryHeader = summaryHeader;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r4
      0x0030: PHI (r4v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r4v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v21 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v22 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0028, B:10:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r4
      0x002a: PHI (r4v21 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r4v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v22 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(BenefitTabPremiumAdResponse benefitTabPremiumAdResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = 1;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onExtraCallback(serialDescriptor, 0, benefitTabPremiumAdResponse.id);
            } else if (benefitTabPremiumAdResponse.id != 0) {
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(benefitTabPremiumAdResponse.requestId, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, benefitTabPremiumAdResponse.requestId);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(benefitTabPremiumAdResponse.trackingClickId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, benefitTabPremiumAdResponse.trackingClickId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || benefitTabPremiumAdResponse.campaignId != 0) {
            vylVar.onExtraCallback(serialDescriptor, 3, benefitTabPremiumAdResponse.campaignId);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4))) {
            vylVar.onExtraCallback(serialDescriptor, 4, benefitTabPremiumAdResponse.adId);
        } else {
            int i6 = IAuthTabCallback + 69;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0 ? benefitTabPremiumAdResponse.adId != 0 : benefitTabPremiumAdResponse.adId != 1) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(benefitTabPremiumAdResponse.brandName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 5, benefitTabPremiumAdResponse.brandName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(benefitTabPremiumAdResponse.eventTypes, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 6, (py) lazyArr[6].getValue(), benefitTabPremiumAdResponse.eventTypes);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(benefitTabPremiumAdResponse.adType, "")) {
            vylVar.onExtraCallback(serialDescriptor, 7, benefitTabPremiumAdResponse.adType);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            List list = null;
            if (!Intrinsics.areEqual(benefitTabPremiumAdResponse.carousel, new Carousel(list, i3, (DefaultConstructorMarker) list))) {
                vylVar.onNavigationEvent(serialDescriptor, 8, BenefitTabPremiumAdResponse$Carousel$.serializer.INSTANCE, benefitTabPremiumAdResponse.carousel);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || !Intrinsics.areEqual(benefitTabPremiumAdResponse.summaryHeader, new SummaryHeader(false, (ImageAsset) null, (ImageAsset) null, (SemanticColor) null, (SemanticColor) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 9, BenefitTabPremiumAdResponse$SummaryHeader$.serializer.INSTANCE, benefitTabPremiumAdResponse.summaryHeader);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BenefitTabPremiumAdResponse(long j, String str, String str2, long j2, long j3, String str3, List list, String str4, Carousel carousel, SummaryHeader summaryHeader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        long j4;
        Carousel carousel2;
        long j5 = 0;
        long j6 = (i & 1) != 0 ? 0L : j;
        String str7 = "";
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 111;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            } else {
                int i8 = 2 % 2;
            }
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 8) != 0) {
            int i9 = IAuthTabCallback + 23;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 2;
            } else {
                int i11 = 2 % 2;
            }
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
        } else {
            j5 = j3;
        }
        String str8 = (i & 32) != 0 ? "" : str3;
        List listEmptyList = (i & 64) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 128) != 0) {
            int i13 = IAuthTabCallback + 89;
            int i14 = i13 % 128;
            onExtraCallback = i14;
            if (i13 % 2 != 0) {
                int i15 = 72 / 0;
            }
            int i16 = i14 + 25;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 256) != 0) {
            List list2 = null;
            carousel2 = new Carousel(list2, 1, (DefaultConstructorMarker) list2);
        } else {
            carousel2 = carousel;
        }
        this(j6, str5, str6, j4, j5, str8, listEmptyList, str7, carousel2, (i & 512) != 0 ? new SummaryHeader(false, (ImageAsset) null, (ImageAsset) null, (SemanticColor) null, (SemanticColor) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null) : summaryHeader);
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            str = this.requestId;
            int i4 = 91 / 0;
        } else {
            str = this.requestId;
        }
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.trackingClickId;
        int i4 = i3 + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.adId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.brandName;
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<String> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<String> list = this.eventTypes;
        int i4 = i2 + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.adType;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Carousel IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Carousel carousel = this.carousel;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return carousel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SummaryHeader access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SummaryHeader summaryHeader = this.summaryHeader;
        int i5 = i3 + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return summaryHeader;
    }

    @liq
    public static final class Carousel {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final List<Item> items;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new BenefitTabPremiumAdResponse$Carousel$.ExternalSyntheticLambda0())};

        /* JADX WARN: Illegal instructions before constructor call */
        public Carousel() {
            List list = null;
            this(list, 1, (DefaultConstructorMarker) list);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BenefitTabPremiumAdResponse$Item$.serializer.INSTANCE);
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return kSerializerIAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Carousel) {
                return Intrinsics.areEqual(this.items, ((Carousel) obj).items);
            }
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.items.hashCode();
            int i4 = onNavigationEvent + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Carousel(items=" + this.items + ")";
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        static {
            int i = onWarmupCompleted + 71;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 86 / 0;
            }
        }

        public /* synthetic */ Carousel(int i, List list, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.items = CollectionsKt.emptyList();
                int i2 = IAuthTabCallback + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.items = list;
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public Carousel(@NotNull List<Item> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
          0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(Carousel carousel, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (Intrinsics.areEqual(carousel.items, CollectionsKt.emptyList())) {
                        return;
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), carousel.items);
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Carousel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    list = CollectionsKt.emptyList();
                    int i3 = 97 / 0;
                } else {
                    list = CollectionsKt.emptyList();
                }
                int i4 = IAuthTabCallback + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(list);
        }

        public final List<Item> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<Item> list = this.items;
            int i5 = i2 + 83;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        return (KSerializer) onNavigationEvent(new Object[0], PushInfo.Companion.onExtraCallback(), 1665760688, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1665760687, PushInfo.Companion.onExtraCallback());
    }

    public final long IAuthTabCallbackStub() {
        return ((Long) onNavigationEvent(new Object[]{this}, PushInfo.Companion.onExtraCallback(), 1620853286, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1620853286, PushInfo.Companion.onExtraCallback())).longValue();
    }
}
