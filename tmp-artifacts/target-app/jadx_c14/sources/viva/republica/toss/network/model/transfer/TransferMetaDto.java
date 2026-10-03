package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getBgColor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.onValueUpdate;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferBundleInfo$;
import viva.republica.toss.network.model.transfer.TransferClientLog$;
import viva.republica.toss.network.model.transfer.TransferLocation$;
import viva.republica.toss.network.model.transfer.TransferMetaDto$;
import viva.republica.toss.send.v4.entity.TransferTextType;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferMetaDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final JsonElement additionalMetaForSend;
    private final Boolean agreeNotifyReceiverForRcs;
    private final TransferBundleInfo bundleInfo;
    private final TransferClientLog clientLog;
    private final String depositTargetDisplayedPhrase;
    private final boolean inAuthorizedSession;
    private final boolean justClose;
    private final TransferLocation location;
    private final String myDepositAccountName;
    private final String origin;
    private final String receiveUserPhoneForRcs;
    private final String redirectUrlOnComplete;
    private final String sessionKey;
    private final boolean skipAd;
    private final onValueUpdate thirdPartyType;
    private final TransferTextType transferTextType;
    private final String transferUniqueKey;
    private final boolean useAdsSdk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = TransferTextType.Companion.serializer();
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferThirdPartyType", onValueUpdate.values());
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferMetaDto)) {
            return false;
        }
        TransferMetaDto transferMetaDto = (TransferMetaDto) obj;
        if (!Intrinsics.areEqual(this.sessionKey, transferMetaDto.sessionKey) || !Intrinsics.areEqual(this.transferUniqueKey, transferMetaDto.transferUniqueKey)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.agreeNotifyReceiverForRcs, transferMetaDto.agreeNotifyReceiverForRcs)) {
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.receiveUserPhoneForRcs, transferMetaDto.receiveUserPhoneForRcs)) {
            int i5 = onNavigationEvent + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.thirdPartyType != transferMetaDto.thirdPartyType) {
            return false;
        }
        if (!Intrinsics.areEqual(this.location, transferMetaDto.location)) {
            int i7 = onNavigationEvent + 121;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.bundleInfo, transferMetaDto.bundleInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.myDepositAccountName, transferMetaDto.myDepositAccountName)) {
            int i8 = onWarmupCompleted + 95;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.transferTextType != transferMetaDto.transferTextType || this.justClose != transferMetaDto.justClose || this.skipAd != transferMetaDto.skipAd) {
            return false;
        }
        if (this.inAuthorizedSession != transferMetaDto.inAuthorizedSession) {
            int i10 = onWarmupCompleted + 125;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.origin, transferMetaDto.origin) || !Intrinsics.areEqual(this.depositTargetDisplayedPhrase, transferMetaDto.depositTargetDisplayedPhrase) || !Intrinsics.areEqual(this.redirectUrlOnComplete, transferMetaDto.redirectUrlOnComplete) || !Intrinsics.areEqual(this.clientLog, transferMetaDto.clientLog)) {
            return false;
        }
        if (this.useAdsSdk != transferMetaDto.useAdsSdk) {
            int i12 = onNavigationEvent + 21;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.additionalMetaForSend, transferMetaDto.additionalMetaForSend)) {
            return true;
        }
        int i14 = onWarmupCompleted + 23;
        onNavigationEvent = i14 % 128;
        return i14 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i;
        int iHashCode6;
        int iHashCode7;
        int i2;
        int iHashCode8;
        int i3 = 2 % 2;
        String str = this.sessionKey;
        if (str == null) {
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.transferUniqueKey;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.agreeNotifyReceiverForRcs;
        if (bool == null) {
            int i5 = onNavigationEvent + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        String str3 = this.receiveUserPhoneForRcs;
        if (str3 == null) {
            int i7 = onWarmupCompleted + 85;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        onValueUpdate onvalueupdate = this.thirdPartyType;
        int iHashCode10 = onvalueupdate == null ? 0 : onvalueupdate.hashCode();
        TransferLocation transferLocation = this.location;
        int iHashCode11 = transferLocation == null ? 0 : transferLocation.hashCode();
        TransferBundleInfo transferBundleInfo = this.bundleInfo;
        int iHashCode12 = transferBundleInfo == null ? 0 : transferBundleInfo.hashCode();
        String str4 = this.myDepositAccountName;
        if (str4 == null) {
            int i9 = onNavigationEvent + 17;
            onWarmupCompleted = i9 % 128;
            iHashCode4 = i9 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        int iHashCode13 = this.transferTextType.hashCode();
        int iHashCode14 = Boolean.hashCode(this.justClose);
        int iHashCode15 = Boolean.hashCode(this.skipAd);
        int iHashCode16 = Boolean.hashCode(this.inAuthorizedSession);
        String str5 = this.origin;
        if (str5 == null) {
            int i10 = onWarmupCompleted + 45;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        String str6 = this.depositTargetDisplayedPhrase;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.redirectUrlOnComplete;
        if (str7 == null) {
            int i12 = onNavigationEvent + 27;
            i = iHashCode17;
            onWarmupCompleted = i12 % 128;
            iHashCode6 = i12 % 2 != 0 ? 1 : 0;
        } else {
            i = iHashCode17;
            iHashCode6 = str7.hashCode();
        }
        TransferClientLog transferClientLog = this.clientLog;
        if (transferClientLog == null) {
            int i13 = onWarmupCompleted + 93;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = transferClientLog.hashCode();
        }
        int iHashCode18 = Boolean.hashCode(this.useAdsSdk);
        JsonElement jsonElement = this.additionalMetaForSend;
        if (jsonElement != null) {
            int i15 = onNavigationEvent + 85;
            i2 = iHashCode7;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                jsonElement.hashCode();
                throw null;
            }
            iHashCode8 = jsonElement.hashCode();
        } else {
            i2 = iHashCode7;
            iHashCode8 = 0;
        }
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode5) * 31) + i) * 31) + iHashCode6) * 31) + i2) * 31) + iHashCode18) * 31) + iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferMetaDto(sessionKey=" + this.sessionKey + ", transferUniqueKey=" + this.transferUniqueKey + ", agreeNotifyReceiverForRcs=" + this.agreeNotifyReceiverForRcs + ", receiveUserPhoneForRcs=" + this.receiveUserPhoneForRcs + ", thirdPartyType=" + this.thirdPartyType + ", location=" + this.location + ", bundleInfo=" + this.bundleInfo + ", myDepositAccountName=" + this.myDepositAccountName + ", transferTextType=" + this.transferTextType + ", justClose=" + this.justClose + ", skipAd=" + this.skipAd + ", inAuthorizedSession=" + this.inAuthorizedSession + ", origin=" + this.origin + ", depositTargetDisplayedPhrase=" + this.depositTargetDisplayedPhrase + ", redirectUrlOnComplete=" + this.redirectUrlOnComplete + ", clientLog=" + this.clientLog + ", useAdsSdk=" + this.useAdsSdk + ", additionalMetaForSend=" + this.additionalMetaForSend + ")";
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferMetaDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferMetaDto$.serializer serializerVar = TransferMetaDto$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferMetaDto$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallbackWithResult = TransferMetaDto.onExtraCallbackWithResult();
                    int i3 = 69 / 0;
                } else {
                    kSerializerOnExtraCallbackWithResult = TransferMetaDto.onExtraCallbackWithResult();
                }
                int i4 = onNavigationEvent + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferMetaDto$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return TransferMetaDto.onWarmupCompleted();
                }
                TransferMetaDto.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null, null, null, null, null, null};
        int i = onExtraCallback + 51;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TransferMetaDto(int i, String str, String str2, Boolean bool, String str3, onValueUpdate onvalueupdate, TransferLocation transferLocation, TransferBundleInfo transferBundleInfo, String str4, TransferTextType transferTextType, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, TransferClientLog transferClientLog, boolean z4, okycx okycxVar) {
        if (131071 != (i & 131071)) {
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 131071, TransferMetaDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionKey = str;
        this.transferUniqueKey = str2;
        this.agreeNotifyReceiverForRcs = bool;
        this.receiveUserPhoneForRcs = str3;
        this.thirdPartyType = onvalueupdate;
        this.location = transferLocation;
        this.bundleInfo = transferBundleInfo;
        this.myDepositAccountName = str4;
        this.transferTextType = transferTextType;
        this.justClose = z;
        this.skipAd = z2;
        this.inAuthorizedSession = z3;
        this.origin = str5;
        this.depositTargetDisplayedPhrase = str6;
        this.redirectUrlOnComplete = str7;
        this.clientLog = transferClientLog;
        this.useAdsSdk = z4;
        this.additionalMetaForSend = null;
    }

    public TransferMetaDto(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable onValueUpdate onvalueupdate, @Nullable TransferLocation transferLocation, @Nullable TransferBundleInfo transferBundleInfo, @Nullable String str4, @NotNull TransferTextType transferTextType, boolean z, boolean z2, boolean z3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable TransferClientLog transferClientLog, boolean z4, @Nullable JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(transferTextType, "");
        this.sessionKey = str;
        this.transferUniqueKey = str2;
        this.agreeNotifyReceiverForRcs = bool;
        this.receiveUserPhoneForRcs = str3;
        this.thirdPartyType = onvalueupdate;
        this.location = transferLocation;
        this.bundleInfo = transferBundleInfo;
        this.myDepositAccountName = str4;
        this.transferTextType = transferTextType;
        this.justClose = z;
        this.skipAd = z2;
        this.inAuthorizedSession = z3;
        this.origin = str5;
        this.depositTargetDisplayedPhrase = str6;
        this.redirectUrlOnComplete = str7;
        this.clientLog = transferClientLog;
        this.useAdsSdk = z4;
        this.additionalMetaForSend = jsonElement;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferMetaDto transferMetaDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, transferMetaDto.sessionKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, transferMetaDto.transferUniqueKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, transferMetaDto.agreeNotifyReceiverForRcs);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, transferMetaDto.receiveUserPhoneForRcs);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), transferMetaDto.thirdPartyType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, TransferLocation$.serializer.INSTANCE, transferMetaDto.location);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, TransferBundleInfo$.serializer.INSTANCE, transferMetaDto.bundleInfo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, transferMetaDto.myDepositAccountName);
        vylVar.onNavigationEvent(serialDescriptor, 8, (py) lazyArr[8].getValue(), transferMetaDto.transferTextType);
        vylVar.onNavigationEvent(serialDescriptor, 9, transferMetaDto.justClose);
        vylVar.onNavigationEvent(serialDescriptor, 10, transferMetaDto.skipAd);
        vylVar.onNavigationEvent(serialDescriptor, 11, transferMetaDto.inAuthorizedSession);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, transferMetaDto.origin);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, transferMetaDto.depositTargetDisplayedPhrase);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, transferMetaDto.redirectUrlOnComplete);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 15, TransferClientLog$.serializer.INSTANCE, transferMetaDto.clientLog);
        vylVar.onNavigationEvent(serialDescriptor, 16, transferMetaDto.useAdsSdk);
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 72 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sessionKey;
        }
        throw null;
    }

    public final JsonElement IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        JsonElement jsonElement = this.additionalMetaForSend;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonElement;
        }
        throw null;
    }
}
