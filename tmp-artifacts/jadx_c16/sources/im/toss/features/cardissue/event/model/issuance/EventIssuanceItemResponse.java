package im.toss.features.cardissue.event.model.issuance;

import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.cardissue.event.model.issuance.EventImageModel$;
import im.toss.features.cardissue.event.model.issuance.EventIssuanceItemResponse$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.enableTabBar;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EventIssuanceItemResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final enableTabBar cardType;
    private final int id;
    private final EventImageModel image;
    private final String linkUri;
    private final String providerCode;
    private final String providerName;
    private final String startTs;
    private final String subTitle;
    private final String title;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new EventIssuanceItemResponse$.ExternalSyntheticLambda0())};

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = i9 | i10 | (~(i8 | i5));
        int i12 = i10 | i3;
        int i13 = ~i5;
        int i14 = (~(i3 | i13 | i2)) | (~(i7 | i13 | i8)) | (~(i8 | i2 | i5));
        int i15 = i2 + i5 + i + ((-1329026341) * i6) + ((-1277752516) * i4);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i2) - 1912602624) + ((-659060787) * i5) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i) + (494927872 * i6) + (1577058304 * i4) + ((-1783103488) * i16);
        int i18 = (i2 * 595972471) + 129777640 + (i5 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i * 595972219) + (i6 * (-1341978823)) + (i4 * 731850196) + (i16 * 1869086720);
        if (i17 + (i18 * i18 * (-846725120)) != 1) {
            return onWarmupCompleted(objArr);
        }
        EventIssuanceItemResponse eventIssuanceItemResponse = (EventIssuanceItemResponse) objArr[0];
        int i19 = 2 % 2;
        int i20 = onNavigationEvent + 73;
        int i21 = i20 % 128;
        onWarmupCompleted = i21;
        int i22 = i20 % 2;
        String str = eventIssuanceItemResponse.title;
        int i23 = i21 + 21;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        return str;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            return (KSerializer) IAuthTabCallback(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -588014658, new Object[0], iIAuthTabCallback, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 588014658, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int i3 = 3 / 0;
        return (KSerializer) IAuthTabCallback(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -588014658, new Object[0], iIAuthTabCallback2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 588014658, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.cardissue.event.data.type.EventCardType", enableTabBar.values());
        }
        int i3 = 49 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.cardissue.event.data.type.EventCardType", enableTabBar.values());
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof EventIssuanceItemResponse)) {
            return false;
        }
        EventIssuanceItemResponse eventIssuanceItemResponse = (EventIssuanceItemResponse) obj;
        if (this.id != eventIssuanceItemResponse.id || !Intrinsics.areEqual(this.title, eventIssuanceItemResponse.title) || !Intrinsics.areEqual(this.subTitle, eventIssuanceItemResponse.subTitle) || !Intrinsics.areEqual(this.linkUri, eventIssuanceItemResponse.linkUri)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.providerName, eventIssuanceItemResponse.providerName)) {
            int i7 = onWarmupCompleted + 45;
            onNavigationEvent = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.image, eventIssuanceItemResponse.image)) {
            int i8 = onNavigationEvent + 23;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.startTs, eventIssuanceItemResponse.startTs)) {
            int i10 = onWarmupCompleted + 71;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.providerCode, eventIssuanceItemResponse.providerCode)) {
            return false;
        }
        if (this.cardType == eventIssuanceItemResponse.cardType) {
            return true;
        }
        int i12 = onWarmupCompleted + 65;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Integer.hashCode(this.id);
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.subTitle.hashCode();
        int iHashCode5 = this.linkUri.hashCode();
        int iHashCode6 = this.providerName.hashCode();
        EventImageModel eventImageModel = this.image;
        if (eventImageModel == null) {
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = eventImageModel.hashCode();
        }
        int iHashCode7 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + this.startTs.hashCode()) * 31) + this.providerCode.hashCode()) * 31) + this.cardType.hashCode();
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EventIssuanceItemResponse(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", linkUri=" + this.linkUri + ", providerName=" + this.providerName + ", image=" + this.image + ", startTs=" + this.startTs + ", providerCode=" + this.providerCode + ", cardType=" + this.cardType + ")";
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ EventIssuanceItemResponse(int i, int i2, String str, String str2, String str3, String str4, EventImageModel eventImageModel, String str5, String str6, enableTabBar enabletabbar, okycx okycxVar) {
        if (257 != (i & 257)) {
            htf31.onExtraCallbackWithResult(i, 257, EventIssuanceItemResponse$.serializer.INSTANCE.getDescriptor());
            int i3 = onWarmupCompleted + 53;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 2;
            } else {
                int i5 = 2 % 2;
            }
        }
        this.id = i2;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i6 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str2;
        }
        if ((i & 8) == 0) {
            this.linkUri = "";
        } else {
            this.linkUri = str3;
        }
        if ((i & 16) == 0) {
            this.providerName = "";
        } else {
            this.providerName = str4;
        }
        int i7 = 2 % 2;
        Object obj = null;
        if ((i & 32) == 0) {
            int i8 = onWarmupCompleted + 53;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.image = null;
        } else {
            this.image = eventImageModel;
            int i10 = onWarmupCompleted + 29;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.startTs = "";
        } else {
            this.startTs = str5;
        }
        if ((i & 128) == 0) {
            int i13 = onNavigationEvent + 71;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            this.providerCode = "";
            if (i14 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.providerCode = str6;
        }
        this.cardType = enabletabbar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r1
      0x0035: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:10:0x0033, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(EventIssuanceItemResponse eventIssuanceItemResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, eventIssuanceItemResponse.id);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (!Intrinsics.areEqual(eventIssuanceItemResponse.title, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, eventIssuanceItemResponse.title);
                }
            }
        } else {
            lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, eventIssuanceItemResponse.id);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(eventIssuanceItemResponse.subTitle, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, eventIssuanceItemResponse.subTitle);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i3 = onWarmupCompleted + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean zAreEqual = Intrinsics.areEqual(eventIssuanceItemResponse.linkUri, "");
            if (i4 != 0) {
                int i5 = 3 / 0;
                if (!zAreEqual) {
                    vylVar.onExtraCallback(serialDescriptor, 3, eventIssuanceItemResponse.linkUri);
                }
            } else if (!zAreEqual) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(eventIssuanceItemResponse.providerName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 4, eventIssuanceItemResponse.providerName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || eventIssuanceItemResponse.image != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, EventImageModel$.serializer.INSTANCE, eventIssuanceItemResponse.image);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(eventIssuanceItemResponse.startTs, "")) {
            vylVar.onExtraCallback(serialDescriptor, 6, eventIssuanceItemResponse.startTs);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(eventIssuanceItemResponse.providerCode, "")) {
            vylVar.onExtraCallback(serialDescriptor, 7, eventIssuanceItemResponse.providerCode);
        }
        vylVar.onNavigationEvent(serialDescriptor, 8, (py) lazyArr[8].getValue(), eventIssuanceItemResponse.cardType);
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return lazyArr;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.id;
        if (i3 != 0) {
            int i5 = 43 / 0;
        }
        return i4;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.subTitle;
        int i5 = i3 + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.linkUri;
        int i5 = i2 + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EventImageModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EventImageModel eventImageModel = this.image;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return eventImageModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.startTs;
        int i5 = i3 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.providerCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final enableTabBar onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        enableTabBar enabletabbar = this.cardType;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return enabletabbar;
    }

    private static final /* synthetic */ KSerializer access100() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (KSerializer) IAuthTabCallback(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -588014658, new Object[0], iIAuthTabCallback, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 588014658, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
    }

    public final String IAuthTabCallbackDefault() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (String) IAuthTabCallback(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1618812530, new Object[]{this}, iIAuthTabCallback, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1618812531, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
    }
}
