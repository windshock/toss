package im.toss.ads_sdk.remote.model;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import androidx.core.content.ContextCompat;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AdRequestOption$;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AppInfo$;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$DeviceInfo$;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$VideoOption$;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.Animatable2CompatAnimationCallback;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.checkCanOpenLandingPage;
import o.dj3;
import o.getBacktraceNoteBytes;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.onTextViewSizeChanged;
import o.oty1;
import o.py;
import o.setPageMargin;
import o.setPageTransformer;
import o.ul1;
import o.updateRenderInfoForVideo;
import o.varyFields;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetNativeAdsRequestBody {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AppInfo app;
    private final Set<String> availableStyleIds;
    private final DeviceInfo device;
    private final AdRequestOption options;
    private final List<Placement> placements;
    private final String platform;
    private final String productType;
    private final String referrer;
    private final String sdkId;
    private final String sdkVersion;
    private final String sessionId;
    private final String spaceUnitId;
    private final String specVersion;
    private final List<String> supportedSdkTemplateIds;

    public GetNativeAdsRequestBody() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Set) null, (AppInfo) null, (DeviceInfo) null, (AdRequestOption) null, (String) null, (String) null, (List) null, 16383, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        ul1 ul1Var = new ul1(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return ul1Var;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(GetNativeAdsRequestBody$Placement$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        KSerializer kSerializerIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 88 / 0;
        } else {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        }
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (KSerializer) IAuthTabCallback(lt.40.onExtraCallbackWithResult(), new Object[0], -1254659540, 1254659540, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNativeAdsRequestBody)) {
            return false;
        }
        GetNativeAdsRequestBody getNativeAdsRequestBody = (GetNativeAdsRequestBody) obj;
        if (!Intrinsics.areEqual(this.spaceUnitId, getNativeAdsRequestBody.spaceUnitId)) {
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.placements, getNativeAdsRequestBody.placements) || !Intrinsics.areEqual(this.sdkVersion, getNativeAdsRequestBody.sdkVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.specVersion, getNativeAdsRequestBody.specVersion)) {
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionId, getNativeAdsRequestBody.sessionId) || !Intrinsics.areEqual(this.platform, getNativeAdsRequestBody.platform) || !Intrinsics.areEqual(this.sdkId, getNativeAdsRequestBody.sdkId) || !Intrinsics.areEqual(this.availableStyleIds, getNativeAdsRequestBody.availableStyleIds)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.app, getNativeAdsRequestBody.app)) {
            int i6 = onWarmupCompleted + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.device, getNativeAdsRequestBody.device)) {
            int i8 = IAuthTabCallback + 95;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.options, getNativeAdsRequestBody.options)) {
            int i10 = IAuthTabCallback + 55;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productType, getNativeAdsRequestBody.productType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.referrer, getNativeAdsRequestBody.referrer)) {
            int i12 = IAuthTabCallback + 113;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.supportedSdkTemplateIds, getNativeAdsRequestBody.supportedSdkTemplateIds)) {
            return true;
        }
        int i14 = IAuthTabCallback + 15;
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.spaceUnitId;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        List<Placement> list = this.placements;
        if (list == null) {
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int iHashCode6 = this.sdkVersion.hashCode();
        String str2 = this.specVersion;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.sessionId.hashCode();
        int iHashCode9 = this.platform.hashCode();
        String str3 = this.sdkId;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        Set<String> set = this.availableStyleIds;
        if (set == null) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 27;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = set.hashCode();
        }
        int iHashCode11 = this.app.hashCode();
        int iHashCode12 = this.device.hashCode();
        AdRequestOption adRequestOption = this.options;
        int iHashCode13 = adRequestOption == null ? 0 : adRequestOption.hashCode();
        String str4 = this.productType;
        if (str4 == null) {
            int i9 = IAuthTabCallback + 101;
            onWarmupCompleted = i9 % 128;
            iHashCode3 = i9 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.referrer;
        if (str5 == null) {
            int i10 = IAuthTabCallback + 111;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        List<String> list2 = this.supportedSdkTemplateIds;
        return (((((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetNativeAdsRequestBody(spaceUnitId=" + this.spaceUnitId + ", placements=" + this.placements + ", sdkVersion=" + this.sdkVersion + ", specVersion=" + this.specVersion + ", sessionId=" + this.sessionId + ", platform=" + this.platform + ", sdkId=" + this.sdkId + ", availableStyleIds=" + this.availableStyleIds + ", app=" + this.app + ", device=" + this.device + ", options=" + this.options + ", productType=" + this.productType + ", referrer=" + this.referrer + ", supportedSdkTemplateIds=" + this.supportedSdkTemplateIds + ")";
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNativeAdsRequestBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GetNativeAdsRequestBody$.serializer serializerVar = GetNativeAdsRequestBody$.serializer.INSTANCE;
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = GetNativeAdsRequestBody.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = GetNativeAdsRequestBody.onExtraCallback();
                if (i3 == 0) {
                    int i4 = 78 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = GetNativeAdsRequestBody.onNavigationEvent();
                int i4 = onNavigationEvent + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = onExtraCallback + 35;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    public /* synthetic */ GetNativeAdsRequestBody(int i, String str, List list, String str2, String str3, String str4, String str5, String str6, Set set, AppInfo appInfo, DeviceInfo deviceInfo, AdRequestOption adRequestOption, String str7, String str8, List list2, okycx okycxVar) throws Throwable {
        String str9;
        Set setOnExtraCallback;
        Object obj = null;
        if ((i & 1) == 0) {
            this.spaceUnitId = null;
        } else {
            this.spaceUnitId = str;
        }
        if ((i & 2) == 0) {
            this.placements = null;
            int i2 = 2 % 2;
        } else {
            this.placements = list;
        }
        this.sdkVersion = (i & 4) == 0 ? "2.0.0" : str2;
        int i3 = onWarmupCompleted + 101;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 == 0 ? (i & 8) != 0 : (i & 37) != 0) {
            this.specVersion = str3;
            int i5 = i4 + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 2;
            } else {
                int i7 = 2 % 2;
            }
        } else {
            this.specVersion = null;
        }
        this.sessionId = (i & 16) == 0 ? "" : str4;
        if ((i & 32) == 0) {
            int i8 = i4 + 41;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str9 = "ANDROID";
        } else {
            int i11 = onWarmupCompleted + 31;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 2;
            }
            str9 = str5;
        }
        this.platform = str9;
        if ((i & 64) == 0) {
            this.sdkId = null;
        } else {
            this.sdkId = str6;
        }
        if ((i & 128) == 0) {
            int i13 = IAuthTabCallback + 49;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            setOnExtraCallback = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
        } else {
            int i15 = IAuthTabCallback + 21;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            setOnExtraCallback = set;
        }
        this.availableStyleIds = setOnExtraCallback;
        this.app = (i & 256) == 0 ? new AppInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : appInfo;
        this.device = (i & 512) == 0 ? new DeviceInfo((DeviceInfo.Os) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (Float) null, (String) null, (Float) null, (Boolean) null, 8388607, (DefaultConstructorMarker) null) : deviceInfo;
        if ((i & 1024) == 0) {
            this.options = null;
        } else {
            this.options = adRequestOption;
        }
        if ((i & 2048) == 0) {
            this.productType = null;
        } else {
            this.productType = str7;
        }
        if ((i & 4096) == 0) {
            int i17 = onWarmupCompleted + 125;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            this.referrer = null;
            if (i18 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.referrer = str8;
        }
        if ((i & 8192) == 0) {
            this.supportedSdkTemplateIds = null;
        } else {
            this.supportedSdkTemplateIds = list2;
        }
    }

    public GetNativeAdsRequestBody(@Nullable String str, @Nullable List<Placement> list, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable Set<String> set, @NotNull AppInfo appInfo, @NotNull DeviceInfo deviceInfo, @Nullable AdRequestOption adRequestOption, @Nullable String str7, @Nullable String str8, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(appInfo, "");
        Intrinsics.checkNotNullParameter(deviceInfo, "");
        this.spaceUnitId = str;
        this.placements = list;
        this.sdkVersion = str2;
        this.specVersion = str3;
        this.sessionId = str4;
        this.platform = str5;
        this.sdkId = str6;
        this.availableStyleIds = set;
        this.app = appInfo;
        this.device = deviceInfo;
        this.options = adRequestOption;
        this.productType = str7;
        this.referrer = str8;
        this.supportedSdkTemplateIds = list2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r4
      0x002b: PHI (r4v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r4v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0025, B:10:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r4
      0x0027: PHI (r4v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r4v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r4v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(GetNativeAdsRequestBody getNativeAdsRequestBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (getNativeAdsRequestBody.spaceUnitId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, getNativeAdsRequestBody.spaceUnitId);
                    int i3 = IAuthTabCallback + 45;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || getNativeAdsRequestBody.placements != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), getNativeAdsRequestBody.placements);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(getNativeAdsRequestBody.sdkVersion, "2.0.0")) {
            vylVar.onExtraCallback(serialDescriptor, 2, getNativeAdsRequestBody.sdkVersion);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || getNativeAdsRequestBody.specVersion != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, getNativeAdsRequestBody.specVersion);
        }
        Object obj = null;
        if (vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            vylVar.onExtraCallback(serialDescriptor, 4, getNativeAdsRequestBody.sessionId);
        } else {
            int i5 = IAuthTabCallback + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.areEqual(getNativeAdsRequestBody.sessionId, "");
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(getNativeAdsRequestBody.sessionId, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i6 = IAuthTabCallback + 77;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(getNativeAdsRequestBody.platform, "ANDROID")) {
                vylVar.onExtraCallback(serialDescriptor, 5, getNativeAdsRequestBody.platform);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || getNativeAdsRequestBody.sdkId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, getNativeAdsRequestBody.sdkId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i8 = IAuthTabCallback + 125;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.areEqual(getNativeAdsRequestBody.availableStyleIds, Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback());
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(getNativeAdsRequestBody.availableStyleIds, Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback())) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, (py) lazyArr[7].getValue(), getNativeAdsRequestBody.availableStyleIds);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || !Intrinsics.areEqual(getNativeAdsRequestBody.app, new AppInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 8, GetNativeAdsRequestBody$AppInfo$.serializer.INSTANCE, getNativeAdsRequestBody.app);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            String str = null;
            if (!Intrinsics.areEqual(getNativeAdsRequestBody.device, new DeviceInfo((DeviceInfo.Os) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, false, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (Float) null, (String) null, (Float) null, (Boolean) null, 8388607, (DefaultConstructorMarker) null))) {
                vylVar.onNavigationEvent(serialDescriptor, 9, GetNativeAdsRequestBody$DeviceInfo$.serializer.INSTANCE, getNativeAdsRequestBody.device);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 10)) {
            int i9 = onWarmupCompleted + 85;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (getNativeAdsRequestBody.options != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, GetNativeAdsRequestBody$AdRequestOption$.serializer.INSTANCE, getNativeAdsRequestBody.options);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || getNativeAdsRequestBody.productType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, getNativeAdsRequestBody.productType);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || getNativeAdsRequestBody.referrer != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, getNativeAdsRequestBody.referrer);
        }
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 13)) && getNativeAdsRequestBody.supportedSdkTemplateIds == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 13, (py) lazyArr[13].getValue(), getNativeAdsRequestBody.supportedSdkTemplateIds);
    }

    public /* synthetic */ GetNativeAdsRequestBody(String str, List list, String str2, String str3, String str4, String str5, String str6, Set set, AppInfo appInfo, DeviceInfo deviceInfo, AdRequestOption adRequestOption, String str7, String str8, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        List list3;
        String str9;
        String str10;
        Set setOnExtraCallback;
        AppInfo appInfo2;
        DeviceInfo deviceInfo2;
        AdRequestOption adRequestOption2;
        List list4;
        String str11 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            list3 = null;
        } else {
            list3 = list;
        }
        String str12 = (i & 4) != 0 ? "2.0.0" : str2;
        String str13 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i5 = onWarmupCompleted + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str9 = "";
        } else {
            str9 = str4;
        }
        String str14 = (i & 32) != 0 ? "ANDROID" : str5;
        if ((i & 64) != 0) {
            int i7 = onWarmupCompleted + 49;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i & 128) != 0) {
            setOnExtraCallback = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
            int i10 = IAuthTabCallback + 103;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            setOnExtraCallback = set;
        }
        if ((i & 256) != 0) {
            appInfo2 = new AppInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            int i12 = 2 % 2;
        } else {
            appInfo2 = appInfo;
        }
        if ((i & 512) != 0) {
            deviceInfo2 = new DeviceInfo((DeviceInfo.Os) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (Float) null, (String) null, (Float) null, (Boolean) null, 8388607, (DefaultConstructorMarker) null);
            int i13 = onWarmupCompleted + 123;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        } else {
            deviceInfo2 = deviceInfo;
        }
        if ((i & 1024) != 0) {
            int i16 = onWarmupCompleted + 69;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            adRequestOption2 = null;
        } else {
            adRequestOption2 = adRequestOption;
        }
        String str15 = (i & 2048) != 0 ? null : str7;
        String str16 = (i & 4096) != 0 ? null : str8;
        if ((i & 8192) != 0) {
            int i18 = onWarmupCompleted + 59;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 92 / 0;
            }
            list4 = null;
        } else {
            list4 = list2;
        }
        this(str11, list3, str12, str13, str9, str14, str10, setOnExtraCallback, appInfo2, deviceInfo2, adRequestOption2, str15, str16, list4);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GetNativeAdsRequestBody getNativeAdsRequestBody = (GetNativeAdsRequestBody) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = getNativeAdsRequestBody.sdkVersion;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.platform;
            int i4 = 15 / 0;
        } else {
            str = this.platform;
        }
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class Placement {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String placementId;
        private final String slotId;

        static {
            int i = onNavigationEvent + 111;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placement)) {
                int i5 = i3 + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Placement placement = (Placement) obj;
            if (!Intrinsics.areEqual(this.placementId, placement.placementId)) {
                return false;
            }
            if (Intrinsics.areEqual(this.slotId, placement.slotId)) {
                return true;
            }
            int i7 = onWarmupCompleted + 43;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 73 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.placementId.hashCode() * 31) + this.slotId.hashCode();
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Placement(placementId=" + this.placementId + ", slotId=" + this.slotId + ")";
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Placement> serializer() {
                GetNativeAdsRequestBody$Placement$$serializer getNativeAdsRequestBody$Placement$$serializer;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    getNativeAdsRequestBody$Placement$$serializer = GetNativeAdsRequestBody$Placement$$serializer.INSTANCE;
                    int i3 = 80 / 0;
                } else {
                    getNativeAdsRequestBody$Placement$$serializer = GetNativeAdsRequestBody$Placement$$serializer.INSTANCE;
                }
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return getNativeAdsRequestBody$Placement$$serializer;
            }
        }

        public /* synthetic */ Placement(int i, String str, String str2, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i2 = onWarmupCompleted + 95;
                onExtraCallback = i2 % 128;
                htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 != 0 ? GetNativeAdsRequestBody$Placement$$serializer.INSTANCE : GetNativeAdsRequestBody$Placement$$serializer.INSTANCE).getDescriptor());
                int i3 = onExtraCallback + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            this.placementId = str;
            this.slotId = str2;
        }

        public Placement(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.placementId = str;
            this.slotId = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Placement placement, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, placement.placementId);
            vylVar.onExtraCallback(serialDescriptor, 1, placement.slotId);
            int i4 = onWarmupCompleted + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    @liq
    public static final class AppInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String bundle;
        private final String subBundle;
        private final String version;

        static {
            int i = onExtraCallbackWithResult + 21;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public AppInfo() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppInfo)) {
                return false;
            }
            AppInfo appInfo = (AppInfo) obj;
            if (!Intrinsics.areEqual(this.bundle, appInfo.bundle)) {
                int i4 = onWarmupCompleted + 71;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.version, appInfo.version)) {
                int i6 = onExtraCallback + 39;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.subBundle, appInfo.subBundle)) {
                return true;
            }
            int i7 = onExtraCallback + 69;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.bundle.hashCode() * 31) + this.version.hashCode()) * 31) + this.subBundle.hashCode();
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AppInfo(bundle=" + this.bundle + ", version=" + this.version + ", subBundle=" + this.subBundle + ")";
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AppInfo> serializer() {
                GetNativeAdsRequestBody$AppInfo$.serializer serializerVar;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    serializerVar = GetNativeAdsRequestBody$AppInfo$.serializer.INSTANCE;
                    int i3 = 27 / 0;
                } else {
                    serializerVar = GetNativeAdsRequestBody$AppInfo$.serializer.INSTANCE;
                }
                int i4 = IAuthTabCallback + 107;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return serializerVar;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ AppInfo(int i, String str, String str2, String str3, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.bundle = "";
            } else {
                this.bundle = str;
                int i2 = onExtraCallback + 65;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                }
                if ((i & 2) == 0) {
                    this.version = str2;
                    int i3 = onExtraCallback + 99;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                    }
                    if ((i & 4) != 0) {
                        this.subBundle = str3;
                        return;
                    }
                    int i4 = onWarmupCompleted + 3;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    this.subBundle = "";
                    if (i5 != 0) {
                        int i6 = 71 / 0;
                        return;
                    }
                    return;
                }
                this.version = "";
                int i7 = onWarmupCompleted + 69;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                if ((i & 4) != 0) {
                }
            }
            int i10 = 2 % 2;
            if ((i & 2) == 0) {
            }
            int i92 = 2 % 2;
            if ((i & 4) != 0) {
            }
        }

        public AppInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.bundle = str;
            this.version = str2;
            this.subBundle = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(AppInfo appInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(appInfo.bundle, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, appInfo.bundle);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                vylVar.onExtraCallback(serialDescriptor, 1, appInfo.version);
                int i2 = onExtraCallback + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onWarmupCompleted + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.areEqual(appInfo.version, "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(appInfo.version, "")) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(appInfo.subBundle, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, appInfo.subBundle);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AppInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i & 1) != 0 ? "" : str;
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted + 125;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i8 = onExtraCallback + 111;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                str3 = "";
            }
            this(str, str2, str3);
        }
    }

    @liq
    public static final class DeviceInfo {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$DeviceInfo$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = GetNativeAdsRequestBody.DeviceInfo.onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final Float animationScale;
        private final String attStatus;
        private final String audioState;
        private final Integer batteryLevel;
        private final String carrier;
        private final Integer fontScale;
        private final Integer height;
        private final String ifa;
        private final String ifv;
        private final Boolean isCharging;
        private final Boolean isLowPowerMode;
        private final Boolean isVoiceOver;
        private final String model;
        private final String networkType;
        private final Os os;
        private final String osVersion;
        private final Float pixelRatio;
        private final boolean screenReaderEnabled;
        private final Long sessionDuration;
        private final String theme;
        private final String ua;
        private final String webViewVersion;
        private final Integer width;

        public DeviceInfo() {
            this((Os) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (Float) null, (String) null, (Float) null, (Boolean) null, 8388607, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer ICustomTabsCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Os.Companion companion = Os.Companion;
            if (i3 != 0) {
                return companion.serializer();
            }
            companion.serializer();
            throw null;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i5;
            int i8 = ~((~i) | i7 | i2);
            int i9 = (~(i7 | (~i2))) | (~(i2 | i));
            int i10 = (~(i | i5)) | i2;
            int i11 = i2 + i5 + i6 + ((-407681510) * i4) + ((-298114539) * i3);
            int i12 = i11 * i11;
            int i13 = ((-1498977624) * i2) + 672923648 + (2103481690 * i5) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i6) + ((-328728576) * i4) + ((-2108424192) * i3) + ((-1296629760) * i12);
            int i14 = ((i2 * 57881544) - 1472685786) + (i5 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i6 * 57881749) + (i4 * 289608994) + (i3 * 969284153) + (i12 * 813891584);
            int i15 = i13 + (i14 * i14 * 454098944);
            if (i15 == 1) {
                return onExtraCallback(objArr);
            }
            if (i15 == 2) {
                return onNavigationEvent(objArr);
            }
            if (i15 == 3) {
                int i16 = 2 % 2;
                int i17 = IAuthTabCallback + 21;
                int i18 = i17 % 128;
                onNavigationEvent = i18;
                int i19 = i17 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                int i20 = i18 + 61;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                return lazyArr;
            }
            if (i15 == 4) {
                return IAuthTabCallback(objArr);
            }
            DeviceInfo deviceInfo = (DeviceInfo) objArr[0];
            int i22 = 2 % 2;
            int i23 = IAuthTabCallback;
            int i24 = i23 + 45;
            onNavigationEvent = i24 % 128;
            int i25 = i24 % 2;
            Long l = deviceInfo.sessionDuration;
            int i26 = i23 + 11;
            onNavigationEvent = i26 % 128;
            int i27 = i26 % 2;
            return l;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return ICustomTabsCallbackDefault();
            }
            ICustomTabsCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                int i2 = onNavigationEvent + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (this.os != deviceInfo.os || !Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.ua, deviceInfo.ua)) {
                int i4 = onNavigationEvent + 39;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ifa, deviceInfo.ifa)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.ifv, deviceInfo.ifv)) {
                int i6 = IAuthTabCallback + 55;
                onNavigationEvent = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.attStatus, deviceInfo.attStatus)) {
                int i7 = IAuthTabCallback + 25;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.model, deviceInfo.model)) {
                int i9 = IAuthTabCallback + 119;
                onNavigationEvent = i9 % 128;
                return i9 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.carrier, deviceInfo.carrier) || this.screenReaderEnabled != deviceInfo.screenReaderEnabled || !Intrinsics.areEqual(this.batteryLevel, deviceInfo.batteryLevel) || !Intrinsics.areEqual(this.networkType, deviceInfo.networkType) || !Intrinsics.areEqual(this.sessionDuration, deviceInfo.sessionDuration) || !Intrinsics.areEqual(this.audioState, deviceInfo.audioState) || !Intrinsics.areEqual(this.theme, deviceInfo.theme) || !Intrinsics.areEqual(this.fontScale, deviceInfo.fontScale) || !Intrinsics.areEqual(this.isVoiceOver, deviceInfo.isVoiceOver)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.width, deviceInfo.width)) {
                int i10 = onNavigationEvent + 11;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.height, deviceInfo.height)) {
                int i12 = onNavigationEvent + 37;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.isLowPowerMode, deviceInfo.isLowPowerMode)) {
                int i13 = IAuthTabCallback + 3;
                onNavigationEvent = i13 % 128;
                return i13 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.animationScale, deviceInfo.animationScale)) {
                int i14 = IAuthTabCallback + 29;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.webViewVersion, deviceInfo.webViewVersion)) {
                return false;
            }
            if (Intrinsics.areEqual(this.pixelRatio, deviceInfo.pixelRatio)) {
                return Intrinsics.areEqual(this.isCharging, deviceInfo.isCharging);
            }
            int i16 = IAuthTabCallback + 33;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i;
            int iHashCode3;
            int i2;
            int i3;
            int iHashCode4;
            int i4;
            int i5;
            int i6;
            int iHashCode5;
            int i7 = 2 % 2;
            int iHashCode6 = this.os.hashCode();
            int iHashCode7 = this.osVersion.hashCode();
            int iHashCode8 = this.ua.hashCode();
            int iHashCode9 = this.ifa.hashCode();
            int iHashCode10 = this.ifv.hashCode();
            int iHashCode11 = this.attStatus.hashCode();
            int iHashCode12 = this.model.hashCode();
            int iHashCode13 = this.carrier.hashCode();
            int iHashCode14 = Boolean.hashCode(this.screenReaderEnabled);
            Integer num = this.batteryLevel;
            if (num == null) {
                int i8 = IAuthTabCallback + 51;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            String str = this.networkType;
            int iHashCode15 = str == null ? 0 : str.hashCode();
            Long l = this.sessionDuration;
            if (l == null) {
                int i10 = onNavigationEvent + 117;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = l.hashCode();
            }
            String str2 = this.audioState;
            int iHashCode16 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.theme;
            if (str3 == null) {
                int i12 = onNavigationEvent + 65;
                i = iHashCode16;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                iHashCode3 = 0;
            } else {
                i = iHashCode16;
                iHashCode3 = str3.hashCode();
            }
            Integer num2 = this.fontScale;
            if (num2 == null) {
                i2 = 0;
            } else {
                int iHashCode17 = num2.hashCode();
                int i14 = onNavigationEvent + 15;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                i2 = iHashCode17;
            }
            Boolean bool = this.isVoiceOver;
            int iHashCode18 = bool == null ? 0 : bool.hashCode();
            Integer num3 = this.width;
            int iHashCode19 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.height;
            if (num4 == null) {
                int i16 = IAuthTabCallback + 113;
                i3 = i2;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                iHashCode4 = 0;
            } else {
                i3 = i2;
                iHashCode4 = num4.hashCode();
            }
            Boolean bool2 = this.isLowPowerMode;
            int iHashCode20 = bool2 == null ? 0 : bool2.hashCode();
            Float f = this.animationScale;
            int iHashCode21 = f == null ? 0 : f.hashCode();
            String str4 = this.webViewVersion;
            int iHashCode22 = str4 == null ? 0 : str4.hashCode();
            Float f2 = this.pixelRatio;
            if (f2 == null) {
                i4 = iHashCode4;
                i5 = 0;
            } else {
                int iHashCode23 = f2.hashCode();
                int i18 = onNavigationEvent + 71;
                i4 = iHashCode4;
                IAuthTabCallback = i18 % 128;
                int i19 = i18 % 2;
                i5 = iHashCode23;
            }
            Boolean bool3 = this.isCharging;
            if (bool3 != null) {
                int i20 = onNavigationEvent + 71;
                i6 = i5;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                iHashCode5 = bool3.hashCode();
            } else {
                i6 = i5;
                iHashCode5 = 0;
            }
            return (((((((((((((((((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + iHashCode15) * 31) + iHashCode2) * 31) + i) * 31) + iHashCode3) * 31) + i3) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i4) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + i6) * 31) + iHashCode5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DeviceInfo(os=" + this.os + ", osVersion=" + this.osVersion + ", ua=" + this.ua + ", ifa=" + this.ifa + ", ifv=" + this.ifv + ", attStatus=" + this.attStatus + ", model=" + this.model + ", carrier=" + this.carrier + ", screenReaderEnabled=" + this.screenReaderEnabled + ", batteryLevel=" + this.batteryLevel + ", networkType=" + this.networkType + ", sessionDuration=" + this.sessionDuration + ", audioState=" + this.audioState + ", theme=" + this.theme + ", fontScale=" + this.fontScale + ", isVoiceOver=" + this.isVoiceOver + ", width=" + this.width + ", height=" + this.height + ", isLowPowerMode=" + this.isLowPowerMode + ", animationScale=" + this.animationScale + ", webViewVersion=" + this.webViewVersion + ", pixelRatio=" + this.pixelRatio + ", isCharging=" + this.isCharging + ")";
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public /* synthetic */ DeviceInfo(int i, Os os, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Integer num, String str8, Long l, String str9, String str10, Integer num2, Boolean bool, Integer num3, Integer num4, Boolean bool2, Float f, String str11, Float f2, Boolean bool3, okycx okycxVar) {
            Os os2;
            if ((i & 1) == 0) {
                os2 = Os.ANDROID;
                int i2 = 2 % 2;
            } else {
                os2 = os;
            }
            this.os = os2;
            if ((i & 2) == 0) {
                int i3 = IAuthTabCallback + 23;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.osVersion = "";
            } else {
                this.osVersion = str;
            }
            if ((i & 4) == 0) {
                this.ua = "";
            } else {
                this.ua = str2;
            }
            if ((i & 8) == 0) {
                int i5 = onNavigationEvent + 31;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.ifa = "";
            } else {
                this.ifa = str3;
            }
            if ((i & 16) == 0) {
                this.ifv = "";
            } else {
                this.ifv = str4;
            }
            if ((i & 32) == 0) {
                this.attStatus = "";
                int i7 = onNavigationEvent + 21;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } else {
                this.attStatus = str5;
            }
            if ((i & 64) == 0) {
                this.model = "";
            } else {
                this.model = str6;
            }
            if ((i & 128) == 0) {
                this.carrier = "";
            } else {
                this.carrier = str7;
            }
            if ((i & 256) == 0) {
                this.screenReaderEnabled = false;
            } else {
                this.screenReaderEnabled = z;
            }
            Object obj = null;
            if ((i & 512) == 0) {
                int i9 = IAuthTabCallback + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                this.batteryLevel = null;
                if (i10 != 0) {
                    int i11 = 1 / 0;
                }
            } else {
                this.batteryLevel = num;
            }
            if ((i & 1024) == 0) {
                this.networkType = null;
            } else {
                this.networkType = str8;
            }
            if ((i & 2048) == 0) {
                int i12 = IAuthTabCallback + 93;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                this.sessionDuration = null;
            } else {
                this.sessionDuration = l;
            }
            if ((i & 4096) == 0) {
                this.audioState = null;
            } else {
                this.audioState = str9;
            }
            if ((i & 8192) == 0) {
                this.theme = null;
            } else {
                this.theme = str10;
            }
            if ((i & 16384) == 0) {
                this.fontScale = null;
            } else {
                this.fontScale = num2;
                int i14 = 2 % 2;
            }
            if ((32768 & i) == 0) {
                this.isVoiceOver = null;
            } else {
                this.isVoiceOver = bool;
            }
            if ((65536 & i) == 0) {
                int i15 = IAuthTabCallback + 117;
                int i16 = i15 % 128;
                onNavigationEvent = i16;
                int i17 = i15 % 2;
                this.width = null;
                if (i17 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i18 = i16 + 103;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 2 % 2;
                }
            } else {
                this.width = num3;
            }
            if ((131072 & i) == 0) {
                int i20 = onNavigationEvent + 53;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                this.height = null;
                if (i21 == 0) {
                    int i22 = 97 / 0;
                }
            } else {
                this.height = num4;
            }
            if ((262144 & i) == 0) {
                this.isLowPowerMode = null;
            } else {
                this.isLowPowerMode = bool2;
            }
            if ((524288 & i) == 0) {
                this.animationScale = null;
            } else {
                this.animationScale = f;
            }
            if ((1048576 & i) == 0) {
                this.webViewVersion = null;
            } else {
                this.webViewVersion = str11;
            }
            if ((2097152 & i) == 0) {
                this.pixelRatio = null;
            } else {
                this.pixelRatio = f2;
            }
            if ((i & 4194304) == 0) {
                this.isCharging = null;
            } else {
                this.isCharging = bool3;
            }
        }

        public DeviceInfo(@NotNull Os os, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @Nullable Integer num, @Nullable String str8, @Nullable Long l, @Nullable String str9, @Nullable String str10, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Float f, @Nullable String str11, @Nullable Float f2, @Nullable Boolean bool3) {
            Intrinsics.checkNotNullParameter(os, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.os = os;
            this.osVersion = str;
            this.ua = str2;
            this.ifa = str3;
            this.ifv = str4;
            this.attStatus = str5;
            this.model = str6;
            this.carrier = str7;
            this.screenReaderEnabled = z;
            this.batteryLevel = num;
            this.networkType = str8;
            this.sessionDuration = l;
            this.audioState = str9;
            this.theme = str10;
            this.fontScale = num2;
            this.isVoiceOver = bool;
            this.width = num3;
            this.height = num4;
            this.isLowPowerMode = bool2;
            this.animationScale = f;
            this.webViewVersion = str11;
            this.pixelRatio = f2;
            this.isCharging = bool3;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(DeviceInfo deviceInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || deviceInfo.os != Os.ANDROID) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), deviceInfo.os);
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i2 = onNavigationEvent + 3;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(deviceInfo.osVersion, "");
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(deviceInfo.osVersion, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, deviceInfo.osVersion);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(deviceInfo.ua, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, deviceInfo.ua);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i3 = onNavigationEvent + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(deviceInfo.ifa, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, deviceInfo.ifa);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(deviceInfo.ifv, "")) {
                vylVar.onExtraCallback(serialDescriptor, 4, deviceInfo.ifv);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(deviceInfo.attStatus, "")) {
                vylVar.onExtraCallback(serialDescriptor, 5, deviceInfo.attStatus);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i5 = IAuthTabCallback + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (!Intrinsics.areEqual(deviceInfo.model, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, deviceInfo.model);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(deviceInfo.carrier, "")) {
                vylVar.onExtraCallback(serialDescriptor, 7, deviceInfo.carrier);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                int i7 = onNavigationEvent + 25;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    boolean z = deviceInfo.screenReaderEnabled;
                    throw null;
                }
                if (!(!deviceInfo.screenReaderEnabled)) {
                    vylVar.onNavigationEvent(serialDescriptor, 8, deviceInfo.screenReaderEnabled);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 9) || deviceInfo.batteryLevel != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getDynamicHeight.onWarmupCompleted, deviceInfo.batteryLevel);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 10) || deviceInfo.networkType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, deviceInfo.networkType);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 11) || deviceInfo.sessionDuration != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 11, oty1.onExtraCallback, deviceInfo.sessionDuration);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 12)) {
                int i8 = IAuthTabCallback + 23;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (deviceInfo.audioState != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, deviceInfo.audioState);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 13) || deviceInfo.theme != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, deviceInfo.theme);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
                int i10 = IAuthTabCallback + 53;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 68 / 0;
                    if (deviceInfo.fontScale != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 14, getDynamicHeight.onWarmupCompleted, deviceInfo.fontScale);
                    }
                } else if (deviceInfo.fontScale != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
                int i12 = onNavigationEvent + 119;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    Boolean bool = deviceInfo.isVoiceOver;
                    obj.hashCode();
                    throw null;
                }
                if (deviceInfo.isVoiceOver != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getBgColor.IAuthTabCallback, deviceInfo.isVoiceOver);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 16) || deviceInfo.width != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 16, getDynamicHeight.onWarmupCompleted, deviceInfo.width);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 17)) {
                int i13 = IAuthTabCallback + 111;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 68 / 0;
                    if (deviceInfo.height != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 17, getDynamicHeight.onWarmupCompleted, deviceInfo.height);
                    }
                } else if (deviceInfo.height != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 18)) {
                int i15 = IAuthTabCallback + 109;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    Boolean bool2 = deviceInfo.isLowPowerMode;
                    obj.hashCode();
                    throw null;
                }
                if (deviceInfo.isLowPowerMode != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 18, getBgColor.IAuthTabCallback, deviceInfo.isLowPowerMode);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 19) || deviceInfo.animationScale != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 19, dj3.onWarmupCompleted, deviceInfo.animationScale);
            }
            if (!(true ^ vylVar.onWarmupCompleted(serialDescriptor, 20)) || deviceInfo.webViewVersion != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, deviceInfo.webViewVersion);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 21)) {
                int i16 = IAuthTabCallback + 87;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    Float f = deviceInfo.pixelRatio;
                    obj.hashCode();
                    throw null;
                }
                if (deviceInfo.pixelRatio != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 21, dj3.onWarmupCompleted, deviceInfo.pixelRatio);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 22) || deviceInfo.isCharging != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 22, getBgColor.IAuthTabCallback, deviceInfo.isCharging);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ DeviceInfo(Os os, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Integer num, String str8, Long l, String str9, String str10, Integer num2, Boolean bool, Integer num3, Integer num4, Boolean bool2, Float f, String str11, Float f2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Os os2;
            String str12;
            String str13;
            boolean z2;
            Integer num5;
            String str14;
            String str15;
            Integer num6;
            String str16;
            Integer num7;
            Boolean bool4;
            Integer num8;
            Integer num9;
            String str17;
            String str18;
            Float f3;
            Boolean bool5;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                os2 = Os.ANDROID;
            } else {
                os2 = os;
            }
            if ((i & 2) != 0) {
                int i4 = 2 % 2;
                str12 = "";
            } else {
                str12 = str;
            }
            String str19 = (i & 4) != 0 ? "" : str2;
            String str20 = (i & 8) != 0 ? "" : str3;
            String str21 = (i & 16) != 0 ? "" : str4;
            String str22 = (i & 32) != 0 ? "" : str5;
            if ((i & 64) != 0) {
                int i5 = 2 % 2;
                str13 = "";
            } else {
                str13 = str6;
            }
            String str23 = (i & 128) == 0 ? str7 : "";
            if ((i & 256) != 0) {
                int i6 = onNavigationEvent + 95;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 512) != 0) {
                int i8 = onNavigationEvent + 47;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 12 / 0;
                }
                num5 = null;
            } else {
                num5 = num;
            }
            if ((i & 1024) != 0) {
                int i10 = IAuthTabCallback + 93;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                str14 = null;
            } else {
                str14 = str8;
            }
            Long l2 = (i & 2048) != 0 ? null : l;
            if ((i & 4096) != 0) {
                int i13 = onNavigationEvent + 21;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str15 = null;
            } else {
                str15 = str9;
            }
            String str24 = (i & 8192) != 0 ? null : str10;
            Integer num10 = (i & 16384) != 0 ? null : num2;
            Boolean bool6 = (i & 32768) != 0 ? null : bool;
            if ((i & 65536) != 0) {
                num6 = num10;
                int i14 = onNavigationEvent + 13;
                str16 = str24;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                num7 = null;
            } else {
                num6 = num10;
                str16 = str24;
                num7 = num3;
            }
            Integer num11 = (131072 & i) != 0 ? null : num4;
            if ((i & 262144) != 0) {
                int i16 = 2 % 2;
                bool4 = null;
            } else {
                bool4 = bool2;
            }
            Float f4 = (i & 524288) != 0 ? null : f;
            if ((i & 1048576) != 0) {
                num9 = num11;
                int i17 = IAuthTabCallback + 1;
                num8 = num7;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                str17 = null;
            } else {
                num8 = num7;
                num9 = num11;
                str17 = str11;
            }
            if ((2097152 & i) != 0) {
                int i19 = IAuthTabCallback + 81;
                str18 = str17;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 60 / 0;
                }
                int i21 = 2 % 2;
                f3 = null;
            } else {
                str18 = str17;
                f3 = f2;
            }
            if ((i & 4194304) != 0) {
                int i22 = onNavigationEvent + 77;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                bool5 = null;
            } else {
                bool5 = bool3;
            }
            this(os2, str12, str19, str20, str21, str22, str13, str23, z2, num5, str14, l2, str15, str16, num6, bool6, num8, num9, bool4, f4, str18, f3, bool5);
        }

        public final Os access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Os os = this.os;
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 91 / 0;
            }
            return os;
        }

        public final String access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.osVersion;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String readTypedObject() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ua;
            int i5 = i2 + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.ifa;
            int i4 = i3 + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ifv;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.attStatus;
            int i5 = i2 + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback_Parcel() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                str = this.model;
                int i4 = 48 / 0;
            } else {
                str = this.model;
            }
            int i5 = i3 + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.carrier;
            int i4 = i2 + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            DeviceInfo deviceInfo = (DeviceInfo) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = deviceInfo.screenReaderEnabled;
            int i5 = i3 + 53;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return Boolean.valueOf(z);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.batteryLevel;
            }
            throw null;
        }

        public final String getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.networkType;
            int i5 = i3 + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.audioState;
            int i5 = i2 + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            DeviceInfo deviceInfo = (DeviceInfo) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = deviceInfo.theme;
            int i5 = i2 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Integer num = this.fontScale;
            int i5 = i3 + 11;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return num;
        }

        public final Boolean onActivityResized() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.isVoiceOver;
            }
            throw null;
        }

        public final Integer onActivityLayout() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.width;
            int i5 = i2 + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final Integer asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.height;
            int i5 = i2 + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final Boolean onMessageChannelReady() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Boolean bool = this.isLowPowerMode;
            int i5 = i2 + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return bool;
        }

        public final Float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.animationScale;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            DeviceInfo deviceInfo = (DeviceInfo) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = deviceInfo.webViewVersion;
            if (i4 != 0) {
                int i5 = 49 / 0;
            }
            int i6 = i3 + 79;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Float ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Float f = this.pixelRatio;
            int i4 = i3 + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class Os {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Os[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Companion Companion;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            public static final Os ANDROID = new Os("ANDROID", 0);
            public static final Os IOS = new Os("IOS", 1);

            public static /* synthetic */ KSerializer $r8$lambda$gvVi1WSXrtjKnbqWI_A6W2KyT8c() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
                int i4 = onNavigationEvent + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer_init_$_anonymous_;
            }

            private static final /* synthetic */ Os[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                Os[] osArr = {ANDROID, IOS};
                int i5 = i3 + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return osArr;
            }

            public static EnumEntries<Os> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                EnumEntries<Os> enumEntries = $ENTRIES;
                int i5 = i3 + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return enumEntries;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Os valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Os os = (Os) Enum.valueOf(Os.class, str);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onWarmupCompleted + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 76 / 0;
                }
                return os;
            }

            public static Os[] values() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                Os[] osArr = (Os[]) $VALUES.clone();
                int i3 = onNavigationEvent + 39;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 59 / 0;
                }
                return osArr;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializer = (KSerializer) Os.access$get$cachedSerializer$delegate$cp().getValue();
                    int i3 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return kSerializer;
                    }
                    throw null;
                }

                public final KSerializer<Os> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 117;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallback();
                    }
                    onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            private Os(String str, int i) {
            }

            private static final /* synthetic */ KSerializer _init_$_anonymous_() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody.DeviceInfo.Os", values());
                }
                int i3 = 66 / 0;
                return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody.DeviceInfo.Os", values());
            }

            public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
                int i5 = i2 + 13;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return lazy;
                }
                throw null;
            }

            static {
                Os[] osArr$values = $values();
                $VALUES = osArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(osArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$DeviceInfo$Os$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            GetNativeAdsRequestBody.DeviceInfo.Os.$r8$lambda$gvVi1WSXrtjKnbqWI_A6W2KyT8c();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        KSerializer kSerializer$r8$lambda$gvVi1WSXrtjKnbqWI_A6W2KyT8c = GetNativeAdsRequestBody.DeviceInfo.Os.$r8$lambda$gvVi1WSXrtjKnbqWI_A6W2KyT8c();
                        int i3 = onExtraCallbackWithResult + 41;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 64 / 0;
                        }
                        return kSerializer$r8$lambda$gvVi1WSXrtjKnbqWI_A6W2KyT8c;
                    }
                });
                int i = IAuthTabCallback + 75;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }
        }

        public final Boolean onMinimized() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = this.isCharging;
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return bool;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DeviceInfo> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                GetNativeAdsRequestBody$DeviceInfo$.serializer serializerVar = GetNativeAdsRequestBody$DeviceInfo$.serializer.INSTANCE;
                int i4 = onWarmupCompleted + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return serializerVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final DeviceInfo onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @NotNull String str2) throws Throwable {
                String str3;
                String str4;
                String str5;
                Boolean boolValueOf;
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Context applicationContext = context.getApplicationContext();
                DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
                Intrinsics.checkNotNull(applicationContext);
                float fOnExtraCallbackWithResult = setPageMargin.onExtraCallbackWithResult(applicationContext);
                boolean zOnWarmupCompleted = varyFields.onWarmupCompleted(applicationContext);
                String str6 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(str6, "");
                if (str == null) {
                    int i4 = onWarmupCompleted + 13;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 97;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 4 % 3;
                    }
                    str3 = "";
                } else {
                    str3 = str;
                }
                String str7 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str7, "");
                Integer numOnWarmupCompleted = setPageMargin.onWarmupCompleted(applicationContext);
                String strOnWarmupCompleted = onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(applicationContext);
                long jIAuthTabCallback = setPageTransformer.onExtraCallback.IAuthTabCallback();
                String strOnNavigationEvent = setPageMargin.onNavigationEvent(applicationContext);
                String strIAuthTabCallback = setPageMargin.IAuthTabCallback(applicationContext);
                int i9 = (int) (applicationContext.getResources().getConfiguration().fontScale * 100.0f);
                int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(displayMetrics.widthPixels / displayMetrics.density);
                int iOnExtraCallback2 = getBacktraceNoteBytes.onExtraCallback(displayMetrics.heightPixels / displayMetrics.density);
                PowerManager powerManager = (PowerManager) ContextCompat.getSystemService(applicationContext, PowerManager.class);
                if (powerManager != null) {
                    str5 = strOnNavigationEvent;
                    int i10 = onWarmupCompleted + 107;
                    str4 = strOnWarmupCompleted;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    boolValueOf = Boolean.valueOf(powerManager.isPowerSaveMode());
                } else {
                    str4 = strOnWarmupCompleted;
                    str5 = strOnNavigationEvent;
                    boolValueOf = null;
                }
                Boolean bool = boolValueOf;
                int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                return new DeviceInfo((Os) null, str6, (String) null, str3, (String) null, (String) null, str7, str2, zOnWarmupCompleted, numOnWarmupCompleted, str4, Long.valueOf(jIAuthTabCallback), str5, strIAuthTabCallback, Integer.valueOf(i9), Boolean.valueOf(zOnWarmupCompleted), Integer.valueOf(iOnExtraCallback), Integer.valueOf(iOnExtraCallback2), bool, Float.valueOf(fOnExtraCallbackWithResult), (String) setPageMargin.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1345362779, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1345362779, iOnWarmupCompleted, new Object[]{applicationContext}), Float.valueOf(displayMetrics.density), setPageMargin.asBinder(applicationContext), 53, (DefaultConstructorMarker) null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallback + 39;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (Lazy[]) onExtraCallback(iOnExtraCallbackWithResult, 1093344459, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1093344456, new Object[0], iOnExtraCallbackWithResult2);
        }

        public final boolean extraCallback() {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return ((Boolean) onExtraCallback(iOnExtraCallbackWithResult, -1089535696, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1089535698, new Object[]{this}, iOnExtraCallbackWithResult2)).booleanValue();
        }

        public final Long writeTypedObject() {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (Long) onExtraCallback(iOnExtraCallbackWithResult, -206025311, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 206025311, new Object[]{this}, iOnExtraCallbackWithResult2);
        }

        public final String extraCallbackWithResult() {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (String) onExtraCallback(iOnExtraCallbackWithResult, 1091021591, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1091021587, new Object[]{this}, iOnExtraCallbackWithResult2);
        }

        public final String onPostMessage() {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (String) onExtraCallback(iOnExtraCallbackWithResult, -1246671315, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1246671316, new Object[]{this}, iOnExtraCallbackWithResult2);
        }
    }

    @liq
    public static final class AdRequestOption {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final Long adIndexBase;
        private final List<Long> itemIndexes;
        private final long maxSize;
        private final VideoOption video;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AdRequestOption$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = GetNativeAdsRequestBody.AdRequestOption.onExtraCallback();
                int i4 = onWarmupCompleted + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};

        public AdRequestOption() {
            this(0L, (VideoOption) null, (Long) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnWarmupCompleted;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof AdRequestOption)) {
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            AdRequestOption adRequestOption = (AdRequestOption) obj;
            if (this.maxSize != adRequestOption.maxSize) {
                return false;
            }
            if (!Intrinsics.areEqual(this.video, adRequestOption.video)) {
                int i6 = IAuthTabCallback + 121;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.adIndexBase, adRequestOption.adIndexBase)) {
                if (Intrinsics.areEqual(this.itemIndexes, adRequestOption.itemIndexes)) {
                    return true;
                }
                int i8 = onWarmupCompleted + 111;
                IAuthTabCallback = i8 % 128;
                return i8 % 2 == 0;
            }
            int i9 = IAuthTabCallback + 101;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = Long.hashCode(this.maxSize);
            VideoOption videoOption = this.video;
            if (videoOption == null) {
                int i2 = onWarmupCompleted + 99;
                IAuthTabCallback = i2 % 128;
                iHashCode = i2 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = videoOption.hashCode();
            }
            Long l = this.adIndexBase;
            if (l == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = l.hashCode();
                int i3 = IAuthTabCallback + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            List<Long> list = this.itemIndexes;
            return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AdRequestOption(maxSize=" + this.maxSize + ", video=" + this.video + ", adIndexBase=" + this.adIndexBase + ", itemIndexes=" + this.itemIndexes + ")";
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdRequestOption> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 73;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                GetNativeAdsRequestBody$AdRequestOption$.serializer serializerVar = GetNativeAdsRequestBody$AdRequestOption$.serializer.INSTANCE;
                int i4 = onWarmupCompleted + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return serializerVar;
            }
        }

        static {
            int i = onNavigationEvent + 41;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ AdRequestOption(int i, long j, VideoOption videoOption, Long l, List list, okycx okycxVar) {
            this.maxSize = (i & 1) == 0 ? 1L : j;
            if ((i & 2) == 0) {
                int i2 = IAuthTabCallback + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.video = null;
            } else {
                this.video = videoOption;
                int i4 = onWarmupCompleted + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i7 = IAuthTabCallback;
                int i8 = i7 + 115;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                this.adIndexBase = null;
                int i10 = i7 + 37;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 % 2;
                }
            } else {
                this.adIndexBase = l;
            }
            if ((i & 8) == 0) {
                this.itemIndexes = null;
            } else {
                this.itemIndexes = list;
            }
        }

        public AdRequestOption(long j, @Nullable VideoOption videoOption, @Nullable Long l, @Nullable List<Long> list) {
            this.maxSize = j;
            this.video = videoOption;
            this.adIndexBase = l;
            this.itemIndexes = list;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(AdRequestOption adRequestOption, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onExtraCallback(serialDescriptor, 0, adRequestOption.maxSize);
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = IAuthTabCallback + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                long j = adRequestOption.maxSize;
                if (i5 == 0 ? j != 1 : j != 1) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i6 = IAuthTabCallback + 65;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (adRequestOption.video != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, GetNativeAdsRequestBody$VideoOption$.serializer.INSTANCE, adRequestOption.video);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || adRequestOption.adIndexBase != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, adRequestOption.adIndexBase);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3) && adRequestOption.itemIndexes == null) {
                return;
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), adRequestOption.itemIndexes);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AdRequestOption(long j, VideoOption videoOption, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            VideoOption videoOption2;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 73;
                IAuthTabCallback = i2 % 128;
                j = i2 % 2 == 0 ? 0L : 1L;
                int i3 = 2 % 2;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                videoOption2 = null;
            } else {
                videoOption2 = videoOption;
            }
            this(j2, videoOption2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list);
        }
    }

    @liq
    public static final class VideoOption {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final long maxDurationMs;

        static {
            int i = onExtraCallbackWithResult + 37;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 44 / 0;
            }
        }

        public VideoOption() {
            this(0L, 1, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof VideoOption) {
                return this.maxDurationMs == ((VideoOption) obj).maxDurationMs;
            }
            int i5 = i2 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Long.hashCode(this.maxDurationMs);
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VideoOption(maxDurationMs=" + this.maxDurationMs + ")";
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<VideoOption> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                GetNativeAdsRequestBody$VideoOption$.serializer serializerVar = GetNativeAdsRequestBody$VideoOption$.serializer.INSTANCE;
                if (i3 != 0) {
                    return serializerVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ VideoOption(int i, long j, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.maxDurationMs = 0L;
                int i2 = onNavigationEvent + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.maxDurationMs = j;
            int i4 = onNavigationEvent + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public VideoOption(long j) {
            this.maxDurationMs = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(VideoOption videoOption, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onExtraCallback(serialDescriptor, 0, videoOption.maxDurationMs);
            } else {
                int i2 = IAuthTabCallback + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (videoOption.maxDurationMs != 0) {
                }
            }
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ VideoOption(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 65;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                j = 0;
            }
            this(j);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i5) | i7);
        int i9 = i2 | i8 | (~(i3 | i5));
        int i10 = (~(i5 | i2)) | (~(i7 | i5)) | (~(i7 | i2));
        int i11 = i2 + i3 + i6 + (1351532378 * i) + (1237199896 * i4);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i2) + 1314914304 + ((-491389116) * i3) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i6) + ((-1818230784) * i) + ((-914358272) * i4) + ((-2051670016) * i12);
        int i14 = ((i2 * 406040238) - 634933780) + (i3 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i6 * 406039561) + (i * 1283666474) + (i4 * 1712827608) + (i12 * (-77201408));
        if (i13 + (i14 * i14 * 1831469056) == 1) {
            return IAuthTabCallback(objArr);
        }
        int i15 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i16 = IAuthTabCallback + 119;
        onWarmupCompleted = i16 % 128;
        int i17 = i16 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (KSerializer) IAuthTabCallback(lt.40.onExtraCallbackWithResult(), new Object[0], -1254659540, 1254659540, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final String asBinder() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(lt.40.onExtraCallbackWithResult(), new Object[]{this}, -1596629759, 1596629760, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }
}
