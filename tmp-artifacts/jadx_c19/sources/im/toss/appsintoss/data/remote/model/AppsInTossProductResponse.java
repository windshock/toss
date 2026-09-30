package im.toss.appsintoss.data.remote.model;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.encryptType4;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.setCurrentIndex;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossProductResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String description;
    private final String displayAmount;
    private final String displayName;
    private final JsonObject hint;
    private final String iconUrl;
    private final List<AppsInTossProductOffer> offers;
    private final String renewalCycle;
    private final String sku;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.data.remote.model.AppsInTossProductResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
            KSerializer kSerializer = (KSerializer) AppsInTossProductResponse.onExtraCallback(-554105356, 554105357, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, new Object[0], iOnNavigationEvent3, iOnNavigationEvent);
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 19 / 0;
            }
            return kSerializer;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i2 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AppsInTossProductOffer$$serializer.INSTANCE);
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallback(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i3;
        int i9 = i8 | i2;
        int i10 = ~i9;
        int i11 = ~i7;
        int i12 = i10 | (~(i11 | i2));
        int i13 = i9 | i11;
        int i14 = (~(i7 | i2)) | (~(i8 | (~i2)));
        int i15 = i2 + i3 + i5 + ((-1311665080) * i6) + (1761575915 * i4);
        int i16 = i15 * i15;
        int i17 = ((-2073022045) * i2) + 412680192 + (1917570655 * i3) + (i12 * (-1995296350)) + (1995296350 * i13) + ((-1995296350) * i14) + ((-77725696) * i5) + (175112192 * i6) + ((-649461760) * i4) + (1783169024 * i16);
        int i18 = ((i2 * 1226044109) - 1701849991) + (i3 * 1226043089) + (i12 * 510) + (i13 * (-510)) + (i14 * 510) + (i5 * 1226043599) + (i6 * (-858626504)) + (i4 * 1069087493) + (i16 * 1627848704);
        if (i17 + (i18 * i18 * 739704832) == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        AppsInTossProductResponse appsInTossProductResponse = (AppsInTossProductResponse) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallback;
        int i21 = i20 + 79;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        String str = appsInTossProductResponse.sku;
        int i23 = i20 + 43;
        onExtraCallback = i23 % 128;
        int i24 = i23 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i5 = IAuthTabCallback + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return kSerializerIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossProductResponse)) {
            int i6 = i3 + 123;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        AppsInTossProductResponse appsInTossProductResponse = (AppsInTossProductResponse) obj;
        if (!Intrinsics.areEqual(this.displayName, appsInTossProductResponse.displayName)) {
            int i7 = IAuthTabCallback + 111;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sku, appsInTossProductResponse.sku) || !Intrinsics.areEqual(this.description, appsInTossProductResponse.description) || !Intrinsics.areEqual(this.displayAmount, appsInTossProductResponse.displayAmount) || !Intrinsics.areEqual(this.iconUrl, appsInTossProductResponse.iconUrl) || !Intrinsics.areEqual(this.hint, appsInTossProductResponse.hint) || !Intrinsics.areEqual(this.type, appsInTossProductResponse.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.renewalCycle, appsInTossProductResponse.renewalCycle)) {
            int i9 = IAuthTabCallback + 99;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.offers, appsInTossProductResponse.offers)) {
            return true;
        }
        int i11 = IAuthTabCallback + 37;
        int i12 = i11 % 128;
        onExtraCallback = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 31;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = this.displayName.hashCode();
        int iHashCode3 = this.sku.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.displayAmount.hashCode();
        int iHashCode6 = this.iconUrl.hashCode();
        JsonObject jsonObject = this.hint;
        int iHashCode7 = 1;
        if (jsonObject == null) {
            int i3 = IAuthTabCallback + 77;
            onExtraCallback = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = jsonObject.hashCode();
            int i4 = onExtraCallback + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = this.type;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.renewalCycle;
        if (str2 == null) {
            int i6 = onExtraCallback + 95;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode7 = 0;
            }
        } else {
            iHashCode7 = str2.hashCode();
        }
        List<AppsInTossProductOffer> list = this.offers;
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppsInTossProductResponse(displayName=" + this.displayName + ", sku=" + this.sku + ", description=" + this.description + ", displayAmount=" + this.displayAmount + ", iconUrl=" + this.iconUrl + ", hint=" + this.hint + ", type=" + this.type + ", renewalCycle=" + this.renewalCycle + ", offers=" + this.offers + ")";
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossProductResponse> serializer() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AppsInTossProductResponse$$serializer appsInTossProductResponse$$serializer = AppsInTossProductResponse$$serializer.INSTANCE;
            int i5 = IAuthTabCallback + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return appsInTossProductResponse$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
    }

    public /* synthetic */ AppsInTossProductResponse(int i2, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 31;
        if (31 != (i2 & 31)) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = AppsInTossProductResponse$$serializer.INSTANCE.getDescriptor();
                i3 = 24;
            } else {
                descriptor = AppsInTossProductResponse$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i2, i3, descriptor);
            int i5 = 2 % 2;
        }
        this.displayName = str;
        this.sku = str2;
        this.description = str3;
        this.displayAmount = str4;
        this.iconUrl = str5;
        Object obj = null;
        if ((i2 & 32) == 0) {
            this.hint = null;
            int i6 = IAuthTabCallback + 117;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.hint = jsonObject;
        }
        if ((i2 & 64) == 0) {
            this.type = null;
            int i8 = 2 % 2;
        } else {
            this.type = str6;
        }
        if ((i2 & 128) == 0) {
            int i9 = IAuthTabCallback + 5;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            this.renewalCycle = null;
        } else {
            this.renewalCycle = str7;
            int i11 = 2 % 2;
        }
        if ((i2 & 256) != 0) {
            this.offers = list;
            return;
        }
        int i12 = IAuthTabCallback + 73;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        this.offers = null;
        if (i13 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AppsInTossProductResponse appsInTossProductResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossProductResponse.displayName);
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProductResponse.sku);
        vylVar.onExtraCallback(serialDescriptor, 2, appsInTossProductResponse.description);
        vylVar.onExtraCallback(serialDescriptor, 3, appsInTossProductResponse.displayAmount);
        vylVar.onExtraCallback(serialDescriptor, 4, appsInTossProductResponse.iconUrl);
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || appsInTossProductResponse.hint != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, appsInTossProductResponse.hint);
            int i5 = onExtraCallback + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || appsInTossProductResponse.type != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, appsInTossProductResponse.type);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i7 = onExtraCallback + 75;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                String str = appsInTossProductResponse.renewalCycle;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (appsInTossProductResponse.renewalCycle != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, appsInTossProductResponse.renewalCycle);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i8 = IAuthTabCallback + 105;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            List<AppsInTossProductOffer> list = appsInTossProductResponse.offers;
            if (i9 == 0) {
                int i10 = 21 / 0;
                if (list == null) {
                    return;
                }
            } else if (list == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, (py) lazyArr[8].getValue(), appsInTossProductResponse.offers);
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        return lazyArr;
    }

    public final String onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.displayName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.description;
        int i6 = i4 + 59;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.displayAmount;
        int i6 = i4 + 31;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 9;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        String str = this.iconUrl;
        int i6 = i4 + 125;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return str;
    }

    public final JsonObject asInterface() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JsonObject jsonObject = this.hint;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public final String onTransact() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.renewalCycle;
        }
        throw null;
    }

    public final List<AppsInTossProductOffer> IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        List<AppsInTossProductOffer> list = this.offers;
        int i6 = i4 + 43;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (KSerializer) onExtraCallback(-554105356, 554105357, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, new Object[0], iOnNavigationEvent3, iOnNavigationEvent);
    }

    public final String asBinder() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (String) onExtraCallback(-1426019944, 1426019944, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, iOnNavigationEvent3, iOnNavigationEvent);
    }
}
