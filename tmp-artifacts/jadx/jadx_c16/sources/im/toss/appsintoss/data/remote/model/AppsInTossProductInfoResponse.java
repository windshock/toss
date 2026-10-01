package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoResponse$;
import im.toss.appsintoss.data.remote.model.ProductDetailContent$;
import im.toss.appsintoss.data.remote.model.ProductDetailDisclaimer$;
import im.toss.appsintoss.data.remote.model.ProductDetailHeader$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppsInTossProductInfoResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Long amount;
    private final List<ProductDetailContent> contents;
    private final String csEmail;
    private final String currency;
    private final ProductDetailDisclaimer disclaimer;
    private final String displayAmount;
    private final String displayName;
    private final String exceptionType;
    private final Integer fraction;
    private final ProductDetailHeader header;
    private final String miniAppIconUrl;
    private final String offerId;
    private final String requestedSku;
    private final String type;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AppsInTossProductInfoResponse$.ExternalSyntheticLambda0()), null, null, null};

    public AppsInTossProductInfoResponse() {
        this((String) null, (String) null, (Long) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (ProductDetailHeader) null, (List) null, (ProductDetailDisclaimer) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerWriteTypedObject = writeTypedObject();
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i4)) | i5;
        int i9 = ~i5;
        int i10 = ~(i7 | i9);
        int i11 = ~i4;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i4 | i9)) | (~(i7 | i11));
        int i14 = i + i5 + i6 + (417615942 * i2) + (566850886 * i3);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i2) + ((-85983232) * i3) + ((-608960512) * i15);
        int i17 = (i * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i6 * (-1357469401)) + (i2 * 1137340586) + (i3 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static final /* synthetic */ KSerializer writeTypedObject() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ProductDetailContent$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppsInTossProductInfoResponse) {
            AppsInTossProductInfoResponse appsInTossProductInfoResponse = (AppsInTossProductInfoResponse) obj;
            if (!Intrinsics.areEqual(this.displayAmount, appsInTossProductInfoResponse.displayAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.displayName, appsInTossProductInfoResponse.displayName)) {
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.amount, appsInTossProductInfoResponse.amount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.currency, appsInTossProductInfoResponse.currency)) {
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.fraction, appsInTossProductInfoResponse.fraction)) {
                int i5 = IAuthTabCallback + 121;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.miniAppIconUrl, appsInTossProductInfoResponse.miniAppIconUrl)) || !Intrinsics.areEqual(this.csEmail, appsInTossProductInfoResponse.csEmail) || !Intrinsics.areEqual(this.requestedSku, appsInTossProductInfoResponse.requestedSku) || !Intrinsics.areEqual(this.exceptionType, appsInTossProductInfoResponse.exceptionType)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.header, appsInTossProductInfoResponse.header)) {
                int i7 = IAuthTabCallback + 59;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.contents, appsInTossProductInfoResponse.contents)) {
                return Intrinsics.areEqual(this.disclaimer, appsInTossProductInfoResponse.disclaimer) && !(Intrinsics.areEqual(this.type, appsInTossProductInfoResponse.type) ^ true) && Intrinsics.areEqual(this.offerId, appsInTossProductInfoResponse.offerId);
            }
            int i9 = IAuthTabCallback + 101;
            int i10 = i9 % 128;
            onExtraCallback = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 29;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 71 / 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.displayAmount;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.displayName;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = IAuthTabCallback + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            }
        }
        Long l = this.amount;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str3 = this.currency;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.fraction;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        String str4 = this.miniAppIconUrl;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.csEmail;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.requestedSku;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.exceptionType;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        ProductDetailHeader productDetailHeader = this.header;
        if (productDetailHeader == null) {
            int i6 = IAuthTabCallback + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = productDetailHeader.hashCode();
        }
        List<ProductDetailContent> list = this.contents;
        if (list == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
            int i8 = IAuthTabCallback + 49;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        ProductDetailDisclaimer productDetailDisclaimer = this.disclaimer;
        if (productDetailDisclaimer == null) {
            int i10 = onExtraCallback + 89;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = productDetailDisclaimer.hashCode();
        }
        String str8 = this.type;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.offerId;
        return (((((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossProductInfoResponse(displayAmount=" + this.displayAmount + ", displayName=" + this.displayName + ", amount=" + this.amount + ", currency=" + this.currency + ", fraction=" + this.fraction + ", miniAppIconUrl=" + this.miniAppIconUrl + ", csEmail=" + this.csEmail + ", requestedSku=" + this.requestedSku + ", exceptionType=" + this.exceptionType + ", header=" + this.header + ", contents=" + this.contents + ", disclaimer=" + this.disclaimer + ", type=" + this.type + ", offerId=" + this.offerId + ")";
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AppsInTossProductInfoResponse(int i, String str, String str2, Long l, String str3, Integer num, String str4, String str5, String str6, String str7, ProductDetailHeader productDetailHeader, List list, ProductDetailDisclaimer productDetailDisclaimer, String str8, String str9, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.displayAmount = null;
        } else {
            this.displayAmount = str;
        }
        if ((i & 2) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = l;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.currency = null;
            int i4 = 2 % 2;
        } else {
            this.currency = str3;
        }
        if ((i & 16) == 0) {
            int i5 = onExtraCallback + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.fraction = null;
            if (i6 == 0) {
                int i7 = 26 / 0;
            }
        } else {
            this.fraction = num;
        }
        if ((i & 32) == 0) {
            this.miniAppIconUrl = null;
        } else {
            this.miniAppIconUrl = str4;
        }
        if ((i & 64) == 0) {
            int i8 = IAuthTabCallback + 111;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            this.csEmail = null;
            if (i9 != 0) {
                int i10 = 78 / 0;
            }
        } else {
            this.csEmail = str5;
        }
        if ((i & 128) == 0) {
            this.requestedSku = null;
        } else {
            this.requestedSku = str6;
            int i11 = IAuthTabCallback + 33;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = 2 % 2;
        if ((i & 256) == 0) {
            this.exceptionType = null;
        } else {
            this.exceptionType = str7;
        }
        if ((i & 512) == 0) {
            this.header = null;
        } else {
            this.header = productDetailHeader;
        }
        if ((i & 1024) == 0) {
            this.contents = null;
        } else {
            this.contents = list;
        }
        if ((i & 2048) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = productDetailDisclaimer;
        }
        if ((i & 4096) == 0) {
            this.type = null;
        } else {
            this.type = str8;
            int i14 = IAuthTabCallback + 61;
            onExtraCallback = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 2;
            }
        }
        if ((i & 8192) == 0) {
            this.offerId = null;
        } else {
            this.offerId = str9;
        }
    }

    public AppsInTossProductInfoResponse(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable ProductDetailHeader productDetailHeader, @Nullable List<ProductDetailContent> list, @Nullable ProductDetailDisclaimer productDetailDisclaimer, @Nullable String str8, @Nullable String str9) {
        this.displayAmount = str;
        this.displayName = str2;
        this.amount = l;
        this.currency = str3;
        this.fraction = num;
        this.miniAppIconUrl = str4;
        this.csEmail = str5;
        this.requestedSku = str6;
        this.exceptionType = str7;
        this.header = productDetailHeader;
        this.contents = list;
        this.disclaimer = productDetailDisclaimer;
        this.type = str8;
        this.offerId = str9;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossProductInfoResponse appsInTossProductInfoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || appsInTossProductInfoResponse.displayAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.displayAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (appsInTossProductInfoResponse.displayName != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.displayName);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (appsInTossProductInfoResponse.amount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, appsInTossProductInfoResponse.amount);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = onExtraCallback + 85;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
                if (appsInTossProductInfoResponse.currency != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.currency);
                }
            } else if (appsInTossProductInfoResponse.currency != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i8 = IAuthTabCallback + 7;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (appsInTossProductInfoResponse.fraction != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, appsInTossProductInfoResponse.fraction);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i10 = onExtraCallback + 67;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            if (appsInTossProductInfoResponse.miniAppIconUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.miniAppIconUrl);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || appsInTossProductInfoResponse.csEmail != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.csEmail);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i12 = IAuthTabCallback + 95;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                String str = appsInTossProductInfoResponse.requestedSku;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (appsInTossProductInfoResponse.requestedSku != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.requestedSku);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || appsInTossProductInfoResponse.exceptionType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.exceptionType);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || appsInTossProductInfoResponse.header != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, ProductDetailHeader$.serializer.INSTANCE, appsInTossProductInfoResponse.header);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || appsInTossProductInfoResponse.contents != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, (py) lazyArr[10].getValue(), appsInTossProductInfoResponse.contents);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || appsInTossProductInfoResponse.disclaimer != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, ProductDetailDisclaimer$.serializer.INSTANCE, appsInTossProductInfoResponse.disclaimer);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || appsInTossProductInfoResponse.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.type);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 13) || appsInTossProductInfoResponse.offerId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, appsInTossProductInfoResponse.offerId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppsInTossProductInfoResponse(String str, String str2, Long l, String str3, Integer num, String str4, String str5, String str6, String str7, ProductDetailHeader productDetailHeader, List list, ProductDetailDisclaimer productDetailDisclaimer, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        Integer num2;
        List list2;
        ProductDetailDisclaimer productDetailDisclaimer2;
        String str12;
        String str13;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str11 = null;
        } else {
            str11 = str2;
        }
        Long l2 = (i & 4) != 0 ? null : l;
        String str14 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        String str15 = (i & 32) != 0 ? null : str4;
        String str16 = (i & 64) != 0 ? null : str5;
        String str17 = (i & 128) != 0 ? null : str6;
        String str18 = (i & 256) != 0 ? null : str7;
        ProductDetailHeader productDetailHeader2 = (i & 512) != 0 ? null : productDetailHeader;
        if ((i & 1024) != 0) {
            int i7 = 2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i & 2048) != 0) {
            int i8 = 2 % 2;
            productDetailDisclaimer2 = null;
        } else {
            productDetailDisclaimer2 = productDetailDisclaimer;
        }
        if ((i & 4096) != 0) {
            int i9 = IAuthTabCallback + 51;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str12 = null;
        } else {
            str12 = str8;
        }
        if ((i & 8192) != 0) {
            int i11 = onExtraCallback + 121;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str13 = null;
        } else {
            str13 = str9;
        }
        this(str10, str11, l2, str14, num2, str15, str16, str17, str18, productDetailHeader2, list2, productDetailDisclaimer2, str12, str13);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayAmount;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AppsInTossProductInfoResponse appsInTossProductInfoResponse = (AppsInTossProductInfoResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = appsInTossProductInfoResponse.displayName;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppsInTossProductInfoResponse appsInTossProductInfoResponse = (AppsInTossProductInfoResponse) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = appsInTossProductInfoResponse.amount;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.fraction;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.miniAppIconUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.csEmail;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.exceptionType;
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ProductDetailHeader access100() {
        ProductDetailHeader productDetailHeader;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            productDetailHeader = this.header;
            int i4 = 67 / 0;
        } else {
            productDetailHeader = this.header;
        }
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return productDetailHeader;
    }

    public final List<ProductDetailContent> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.contents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProductDetailDisclaimer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProductDetailDisclaimer productDetailDisclaimer = this.disclaimer;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return productDetailDisclaimer;
        }
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offerId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Lazy[]) onNavigationEvent(1627638576, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[0], iIAuthTabCallback, -1627638574, iIAuthTabCallback2);
    }

    public final Long onWarmupCompleted() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Long) onNavigationEvent(-167435334, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 167435334, iIAuthTabCallback2);
    }

    public final String asBinder() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onNavigationEvent(-436421472, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 436421473, iIAuthTabCallback2);
    }
}
