package im.toss.features.manualselfie.model.network;

import im.toss.features.manualselfie.model.network.ManualSelfieVerifyResponse$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.isDecode;
import o.liq;
import o.okycx;
import o.py;
import o.realEncodeBigData;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ManualSelfieVerifyResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long id;
    private final isDecode manualSelfieStatus;
    private final long sessionId;
    private final String title;
    private final long unifiedId;
    private final long userNo;
    private final realEncodeBigData verifyResultStatus;
    private final String videoCallUrl;

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.manualselfie.model.network.ManualSelfieStatus", isDecode.values());
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact();
        }
        onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.manualselfie.model.network.ManualSelfieVerifyResultStatus", realEncodeBigData.values());
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.manualselfie.model.network.ManualSelfieVerifyResultStatus", realEncodeBigData.values());
        int i3 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerAsInterface;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerAsInterface = asInterface();
            int i3 = 6 / 0;
        } else {
            kSerializerAsInterface = asInterface();
        }
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerAsInterface;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualSelfieVerifyResponse)) {
            return false;
        }
        ManualSelfieVerifyResponse manualSelfieVerifyResponse = (ManualSelfieVerifyResponse) obj;
        if (this.id != manualSelfieVerifyResponse.id) {
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.sessionId != manualSelfieVerifyResponse.sessionId || this.unifiedId != manualSelfieVerifyResponse.unifiedId || this.userNo != manualSelfieVerifyResponse.userNo || this.manualSelfieStatus != manualSelfieVerifyResponse.manualSelfieStatus) {
            return false;
        }
        if (this.verifyResultStatus != manualSelfieVerifyResponse.verifyResultStatus) {
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, manualSelfieVerifyResponse.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.videoCallUrl, manualSelfieVerifyResponse.videoCallUrl)) {
            return true;
        }
        int i5 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = Long.hashCode(this.id);
        int iHashCode4 = Long.hashCode(this.sessionId);
        int iHashCode5 = Long.hashCode(this.unifiedId);
        int iHashCode6 = Long.hashCode(this.userNo);
        isDecode isdecode = this.manualSelfieStatus;
        int iHashCode7 = 0;
        int iHashCode8 = isdecode == null ? 0 : isdecode.hashCode();
        realEncodeBigData realencodebigdata = this.verifyResultStatus;
        if (realencodebigdata == null) {
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = realencodebigdata.hashCode();
        }
        String str = this.title;
        if (str == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i6 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        String str2 = this.videoCallUrl;
        if (str2 != null) {
            int i8 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                str2.hashCode();
                throw null;
            }
            iHashCode7 = str2.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ManualSelfieVerifyResponse(id=" + this.id + ", sessionId=" + this.sessionId + ", unifiedId=" + this.unifiedId + ", userNo=" + this.userNo + ", manualSelfieStatus=" + this.manualSelfieStatus + ", verifyResultStatus=" + this.verifyResultStatus + ", title=" + this.title + ", videoCallUrl=" + this.videoCallUrl + ")";
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new ManualSelfieVerifyResponse$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new ManualSelfieVerifyResponse$.ExternalSyntheticLambda1()), null, null};
        int i = IAuthTabCallback + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ManualSelfieVerifyResponse(int i, long j, long j2, long j3, long j4, isDecode isdecode, realEncodeBigData realencodebigdata, String str, String str2, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, ManualSelfieVerifyResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.sessionId = j2;
        this.unifiedId = j3;
        this.userNo = j4;
        if ((i & 16) == 0) {
            this.manualSelfieStatus = null;
        } else {
            this.manualSelfieStatus = isdecode;
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & 32) == 0) {
            int i7 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            this.verifyResultStatus = null;
            int i9 = 2 % 2;
        } else {
            this.verifyResultStatus = realencodebigdata;
        }
        if ((i & 64) == 0) {
            int i10 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.title = null;
            int i12 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 128) == 0) {
            this.videoCallUrl = null;
        } else {
            this.videoCallUrl = str2;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(ManualSelfieVerifyResponse manualSelfieVerifyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, manualSelfieVerifyResponse.id);
        vylVar.onExtraCallback(serialDescriptor, 1, manualSelfieVerifyResponse.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 2, manualSelfieVerifyResponse.unifiedId);
        vylVar.onExtraCallback(serialDescriptor, 3, manualSelfieVerifyResponse.userNo);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
                if (manualSelfieVerifyResponse.manualSelfieStatus != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), manualSelfieVerifyResponse.manualSelfieStatus);
                }
            } else if (manualSelfieVerifyResponse.manualSelfieStatus != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || manualSelfieVerifyResponse.verifyResultStatus != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), manualSelfieVerifyResponse.verifyResultStatus);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                String str = manualSelfieVerifyResponse.title;
                throw null;
            }
            if (manualSelfieVerifyResponse.title != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, manualSelfieVerifyResponse.title);
            }
        }
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 7)) && manualSelfieVerifyResponse.videoCallUrl == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, manualSelfieVerifyResponse.videoCallUrl);
    }

    public final realEncodeBigData onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.verifyResultStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.videoCallUrl;
        }
        throw null;
    }
}
