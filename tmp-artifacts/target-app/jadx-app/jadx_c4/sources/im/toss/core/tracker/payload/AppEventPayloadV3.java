package im.toss.core.tracker.payload;

import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.Referrer$$serializer;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AFj1nSDK5;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.PangleEncryptUtilsType4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.appInfo;
import o.checkPosition;
import o.checkValidYaw;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.handleRemoveKey;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.oty1;
import o.py;
import o.sp;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@appInfo(IAuthTabCallback = "_type")
@nc(IAuthTabCallback = "v3")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppEventPayloadV3 implements checkPosition {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String bankDeviceSession;
    private final String clientVersion;
    private final String company;
    private final String deviceId;
    private final String gaNo;
    private final Long installId;
    private final String locale;
    private final String logId;
    private final String logName;
    private final String logTime;
    private final String logType;
    private final String network;
    private final String networkConnected;
    private final String osVersion;
    private final Map<String, Object> params;
    private final Referrer referrer;
    private final Long schemaId;
    private final String service;
    private final String sessionId;
    private final String userNo;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.payload.AppEventPayloadV3$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = AppEventPayloadV3.onExtraCallback();
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static /* synthetic */ AppEventPayloadV3 onExtraCallback(AppEventPayloadV3 appEventPayloadV3, Long l, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, Referrer referrer, String str17, String str18, int i, Object obj) {
        String str19;
        Map map2;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        int i2 = 2 % 2;
        Long l3 = (i & 1) != 0 ? appEventPayloadV3.schemaId : l;
        String str28 = (i & 2) != 0 ? appEventPayloadV3.logName : str;
        String str29 = (i & 4) != 0 ? appEventPayloadV3.logType : str2;
        if ((i & 8) != 0) {
            int i3 = onWarmupCompleted + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            str19 = appEventPayloadV3.service;
        } else {
            str19 = str3;
        }
        if ((i & 16) != 0) {
            int i5 = onWarmupCompleted + 61;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Map<String, Object> map3 = appEventPayloadV3.params;
                throw null;
            }
            map2 = appEventPayloadV3.params;
        } else {
            map2 = map;
        }
        String str30 = (i & 32) != 0 ? appEventPayloadV3.logId : str4;
        String str31 = (i & 64) != 0 ? appEventPayloadV3.logTime : str5;
        if ((i & 128) != 0) {
            int i6 = onWarmupCompleted + 117;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                String str32 = appEventPayloadV3.deviceId;
                throw null;
            }
            str20 = appEventPayloadV3.deviceId;
        } else {
            str20 = str6;
        }
        String str33 = (i & 256) != 0 ? appEventPayloadV3.clientVersion : str7;
        String str34 = (i & 512) != 0 ? appEventPayloadV3.sessionId : str8;
        String str35 = (i & 1024) != 0 ? appEventPayloadV3.network : str9;
        String str36 = (i & 2048) != 0 ? appEventPayloadV3.networkConnected : str10;
        String str37 = (i & 4096) != 0 ? appEventPayloadV3.osVersion : str11;
        if ((i & 8192) != 0) {
            int i7 = IAuthTabCallback + 77;
            str21 = str37;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str22 = appEventPayloadV3.company;
        } else {
            str21 = str37;
            str22 = str12;
        }
        if ((i & 16384) != 0) {
            int i9 = IAuthTabCallback + 73;
            str23 = str22;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                String str38 = appEventPayloadV3.userNo;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str24 = appEventPayloadV3.userNo;
        } else {
            str23 = str22;
            str24 = str13;
        }
        String str39 = (32768 & i) != 0 ? appEventPayloadV3.gaNo : str14;
        Long l4 = (i & 65536) != 0 ? appEventPayloadV3.installId : l2;
        String str40 = (i & 131072) != 0 ? appEventPayloadV3.version : str15;
        if ((i & 262144) != 0) {
            str26 = str40;
            int i10 = IAuthTabCallback + 29;
            str25 = str24;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            str27 = appEventPayloadV3.bankDeviceSession;
        } else {
            str25 = str24;
            str26 = str40;
            str27 = str16;
        }
        return appEventPayloadV3.onExtraCallbackWithResult(l3, str28, str29, str19, map2, str30, str31, str20, str33, str34, str35, str36, str21, str23, str25, str39, l4, str26, str27, (524288 & i) != 0 ? appEventPayloadV3.referrer : referrer, (i & 1048576) != 0 ? appEventPayloadV3.locale : str17, (i & 2097152) != 0 ? appEventPayloadV3.value : str18);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        KSerializer kSerializer = (KSerializer) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -992995580, new Object[0], iOnExtraCallbackWithResult, 992995580, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i3)) | i2;
        int i8 = (~((~i3) | i4)) | i2;
        int i9 = (~i2) | i4;
        int i10 = i2 + i4 + i6 + (440753341 * i5) + ((-634449194) * i);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i4) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i6) + (780402688 * i5) + ((-180879360) * i) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i4 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i6 * 892200819) + (i5 * (-770690073)) + (i * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppEventPayloadV3)) {
            return false;
        }
        AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) obj;
        if (!Intrinsics.areEqual(this.schemaId, appEventPayloadV3.schemaId) || !Intrinsics.areEqual(this.logName, appEventPayloadV3.logName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logType, appEventPayloadV3.logType)) {
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.service, appEventPayloadV3.service)) {
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, appEventPayloadV3.params)) {
            int i6 = onWarmupCompleted + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logId, appEventPayloadV3.logId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logTime, appEventPayloadV3.logTime)) {
            int i8 = IAuthTabCallback + 63;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, appEventPayloadV3.deviceId) || !Intrinsics.areEqual(this.clientVersion, appEventPayloadV3.clientVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionId, appEventPayloadV3.sessionId)) {
            int i10 = IAuthTabCallback + 27;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.network, appEventPayloadV3.network)) || !Intrinsics.areEqual(this.networkConnected, appEventPayloadV3.networkConnected)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.osVersion, appEventPayloadV3.osVersion)) {
            int i12 = onWarmupCompleted + 55;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.company, appEventPayloadV3.company) || !Intrinsics.areEqual(this.userNo, appEventPayloadV3.userNo) || !Intrinsics.areEqual(this.gaNo, appEventPayloadV3.gaNo) || !Intrinsics.areEqual(this.installId, appEventPayloadV3.installId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.version, appEventPayloadV3.version)) {
            int i14 = onWarmupCompleted + 115;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bankDeviceSession, appEventPayloadV3.bankDeviceSession)) {
            int i16 = onWarmupCompleted + 45;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.referrer, appEventPayloadV3.referrer)) {
            int i18 = onWarmupCompleted + 9;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.locale, appEventPayloadV3.locale)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, appEventPayloadV3.value)) {
            return true;
        }
        int i20 = IAuthTabCallback + 7;
        onWarmupCompleted = i20 % 128;
        if (i20 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int iHashCode3;
        int i3;
        int iHashCode4;
        int i4 = 2 % 2;
        Long l = this.schemaId;
        if (l == null) {
            int i5 = IAuthTabCallback + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        int iHashCode5 = this.logName.hashCode();
        int iHashCode6 = this.logType.hashCode();
        int iHashCode7 = this.service.hashCode();
        Map<String, Object> map = this.params;
        int iHashCode8 = map == null ? 0 : map.hashCode();
        int iHashCode9 = this.logId.hashCode();
        int iHashCode10 = this.logTime.hashCode();
        int iHashCode11 = this.deviceId.hashCode();
        int iHashCode12 = this.clientVersion.hashCode();
        int iHashCode13 = this.sessionId.hashCode();
        int iHashCode14 = this.network.hashCode();
        int iHashCode15 = this.networkConnected.hashCode();
        int iHashCode16 = this.osVersion.hashCode();
        int iHashCode17 = this.company.hashCode();
        int iHashCode18 = this.userNo.hashCode();
        int iHashCode19 = this.gaNo.hashCode();
        Long l2 = this.installId;
        if (l2 == null) {
            int i7 = onWarmupCompleted + 51;
            i = iHashCode17;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            i = iHashCode17;
            iHashCode2 = l2.hashCode();
        }
        int iHashCode20 = this.version.hashCode();
        String str = this.bankDeviceSession;
        int iHashCode21 = str == null ? 0 : str.hashCode();
        Referrer referrer = this.referrer;
        if (referrer == null) {
            int i9 = onWarmupCompleted + 15;
            i2 = iHashCode2;
            IAuthTabCallback = i9 % 128;
            iHashCode3 = i9 % 2 == 0 ? 1 : 0;
        } else {
            i2 = iHashCode2;
            iHashCode3 = referrer.hashCode();
        }
        String str2 = this.locale;
        if (str2 == null) {
            int i10 = onWarmupCompleted + 87;
            i3 = iHashCode3;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            i3 = iHashCode3;
            iHashCode4 = str2.hashCode();
        }
        String str3 = this.value;
        int iHashCode22 = (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i2) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + i3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i12 = onWarmupCompleted + 43;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode22;
    }

    public final AppEventPayloadV3 onExtraCallbackWithResult(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, ? extends Object> map, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @Nullable Long l2, @NotNull String str15, @Nullable String str16, @Nullable Referrer referrer, @Nullable String str17, @Nullable String str18) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        AppEventPayloadV3 appEventPayloadV3 = new AppEventPayloadV3(l, str, str2, str3, map, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, l2, str15, str16, referrer, str17, str18);
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return appEventPayloadV3;
        }
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onMinimized() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        int i3 = 72 / 0;
        return null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppEventPayloadV3(schemaId=" + this.schemaId + ", logName=" + this.logName + ", logType=" + this.logType + ", service=" + this.service + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ", deviceId=" + this.deviceId + ", clientVersion=" + this.clientVersion + ", sessionId=" + this.sessionId + ", network=" + this.network + ", networkConnected=" + this.networkConnected + ", osVersion=" + this.osVersion + ", company=" + this.company + ", userNo=" + this.userNo + ", gaNo=" + this.gaNo + ", installId=" + this.installId + ", version=" + this.version + ", bankDeviceSession=" + this.bankDeviceSession + ", referrer=" + this.referrer + ", locale=" + this.locale + ", value=" + this.value + ")";
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppEventPayloadV3> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                AppEventPayloadV3$$serializer appEventPayloadV3$$serializer = AppEventPayloadV3$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AppEventPayloadV3$$serializer appEventPayloadV3$$serializer2 = AppEventPayloadV3$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return appEventPayloadV3$$serializer2;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AppEventPayloadV3(int i, Long l, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, Referrer referrer, String str17, String str18, okycx okycxVar) {
        String strIAuthTabCallbackDefault;
        String strOnActivityLayout;
        String strOnMessageChannelReady;
        String interfaceDescriptor;
        String str19;
        Referrer referrerOnNavigationEvent;
        if (30 != (i & 30)) {
            htf31.onExtraCallbackWithResult(i, 30, AppEventPayloadV3$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.schemaId = null;
        } else {
            this.schemaId = l;
        }
        this.logName = str;
        this.logType = str2;
        this.service = str3;
        this.params = map;
        if ((i & 32) == 0) {
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.logId = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
            int i4 = 2 % 2;
        } else {
            this.logId = str4;
        }
        if ((i & 64) == 0) {
            this.logTime = GetFeatureExtension.onWarmupCompleted.asInterface();
            int i5 = 2 % 2;
        } else {
            this.logTime = str5;
        }
        if ((i & 128) == 0) {
            int i6 = onWarmupCompleted + 67;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            strIAuthTabCallbackDefault = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            strIAuthTabCallbackDefault = str6;
        }
        this.deviceId = strIAuthTabCallbackDefault;
        this.clientVersion = (i & 256) == 0 ? GetFeatureExtension.onWarmupCompleted.bx_() : str7;
        if ((i & 512) == 0) {
            int i8 = IAuthTabCallback + 77;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                this.sessionId = GetFeatureExtension.onWarmupCompleted.onActivityLayout();
                throw null;
            }
            strOnActivityLayout = GetFeatureExtension.onWarmupCompleted.onActivityLayout();
        } else {
            strOnActivityLayout = str8;
        }
        this.sessionId = strOnActivityLayout;
        this.network = (i & 1024) == 0 ? GetFeatureExtension.onWarmupCompleted.writeTypedObject() : str9;
        this.networkConnected = (i & 2048) == 0 ? GetFeatureExtension.onWarmupCompleted.extraCallback() : str10;
        this.osVersion = (i & 4096) == 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback() : str11;
        this.company = (i & 8192) == 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str12;
        if ((i & 16384) == 0) {
            strOnMessageChannelReady = GetFeatureExtension.onWarmupCompleted.onMessageChannelReady();
        } else {
            int i9 = 2 % 2;
            strOnMessageChannelReady = str13;
        }
        this.userNo = strOnMessageChannelReady;
        int i10 = onWarmupCompleted + 99;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 57 / 0;
            interfaceDescriptor = (i & 32768) == 0 ? GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor() : str14;
        } else if ((i & 32768) == 0) {
        }
        this.gaNo = interfaceDescriptor;
        this.installId = (65536 & i) == 0 ? GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel() : l2;
        int i12 = IAuthTabCallback + 29;
        int i13 = i12 % 128;
        onWarmupCompleted = i13;
        int i14 = i12 % 2;
        int i15 = 2 % 2;
        if ((131072 & i) == 0) {
            int i16 = i13 + 27;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            str19 = "3";
        } else {
            str19 = str15;
        }
        this.version = str19;
        int i17 = IAuthTabCallback + 75;
        onWarmupCompleted = i17 % 128;
        int i18 = i17 % 2;
        this.bankDeviceSession = (262144 & i) == 0 ? GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(IAuthTabCallbackDefault()) : str16;
        if ((524288 & i) == 0) {
            referrerOnNavigationEvent = AFj1nSDK5.onNavigationEvent.onNavigationEvent();
            int i19 = IAuthTabCallback + 57;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
        } else {
            referrerOnNavigationEvent = referrer;
        }
        this.referrer = referrerOnNavigationEvent;
        int i21 = onWarmupCompleted + 77;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        this.locale = (1048576 & i) == 0 ? GetFeatureExtension.onWarmupCompleted.access000() : str17;
        if ((i & 2097152) == 0) {
            this.value = null;
        } else {
            this.value = str18;
        }
    }

    public AppEventPayloadV3(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, ? extends Object> map, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @Nullable Long l2, @NotNull String str15, @Nullable String str16, @Nullable Referrer referrer, @Nullable String str17, @Nullable String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.schemaId = l;
        this.logName = str;
        this.logType = str2;
        this.service = str3;
        this.params = map;
        this.logId = str4;
        this.logTime = str5;
        this.deviceId = str6;
        this.clientVersion = str7;
        this.sessionId = str8;
        this.network = str9;
        this.networkConnected = str10;
        this.osVersion = str11;
        this.company = str12;
        this.userNo = str13;
        this.gaNo = str14;
        this.installId = l2;
        this.version = str15;
        this.bankDeviceSession = str16;
        this.referrer = referrer;
        this.locale = str17;
        this.value = str18;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r5
      0x0031: PHI (r5v70 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v71 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:10:0x002f, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r5
      0x002d: PHI (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v71 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Lazy<KSerializer<Object>>[] lazyArr;
        AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (appEventPayloadV3.schemaId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, appEventPayloadV3.schemaId);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, appEventPayloadV3.IAuthTabCallbackStubProxy());
        vylVar.onExtraCallback(serialDescriptor, 2, appEventPayloadV3.logType);
        vylVar.onExtraCallback(serialDescriptor, 3, appEventPayloadV3.service);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, (py) lazyArr[4].getValue(), appEventPayloadV3.extraCallbackWithResult());
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i3 = onWarmupCompleted + 37;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 14 / 0;
                if (!Intrinsics.areEqual(appEventPayloadV3.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault())) {
                    vylVar.onExtraCallback(serialDescriptor, 5, appEventPayloadV3.access100());
                }
            } else if (!Intrinsics.areEqual(appEventPayloadV3.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault())) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(appEventPayloadV3.IAuthTabCallback_Parcel(), GetFeatureExtension.onWarmupCompleted.asInterface())) {
            vylVar.onExtraCallback(serialDescriptor, 6, appEventPayloadV3.IAuthTabCallback_Parcel());
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i5 = IAuthTabCallback + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV3.deviceId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault())) {
                vylVar.onExtraCallback(serialDescriptor, 7, appEventPayloadV3.deviceId);
                int i7 = onWarmupCompleted + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i9 = onWarmupCompleted + 9;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV3.clientVersion, GetFeatureExtension.onWarmupCompleted.bx_())) {
                vylVar.onExtraCallback(serialDescriptor, 8, appEventPayloadV3.clientVersion);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || !Intrinsics.areEqual(appEventPayloadV3.sessionId, GetFeatureExtension.onWarmupCompleted.onActivityLayout())) {
            vylVar.onExtraCallback(serialDescriptor, 9, appEventPayloadV3.sessionId);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 10)) {
            int i11 = IAuthTabCallback + 119;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.areEqual(appEventPayloadV3.network, GetFeatureExtension.onWarmupCompleted.writeTypedObject());
                throw null;
            }
            if (!Intrinsics.areEqual(appEventPayloadV3.network, GetFeatureExtension.onWarmupCompleted.writeTypedObject())) {
                vylVar.onExtraCallback(serialDescriptor, 10, appEventPayloadV3.network);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || !Intrinsics.areEqual(appEventPayloadV3.networkConnected, GetFeatureExtension.onWarmupCompleted.extraCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 11, appEventPayloadV3.networkConnected);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || !Intrinsics.areEqual(appEventPayloadV3.osVersion, GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 12, appEventPayloadV3.osVersion);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 13) || !Intrinsics.areEqual(appEventPayloadV3.IAuthTabCallbackDefault(), GetFeatureExtension.onWarmupCompleted.asBinder())) {
            vylVar.onExtraCallback(serialDescriptor, 13, appEventPayloadV3.IAuthTabCallbackDefault());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 14) || !Intrinsics.areEqual(appEventPayloadV3.userNo, GetFeatureExtension.onWarmupCompleted.onMessageChannelReady())) {
            vylVar.onExtraCallback(serialDescriptor, 14, appEventPayloadV3.userNo);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 15) || !Intrinsics.areEqual(appEventPayloadV3.gaNo, GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor())) {
            vylVar.onExtraCallback(serialDescriptor, 15, appEventPayloadV3.gaNo);
            int i12 = onWarmupCompleted + 57;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 16) || !Intrinsics.areEqual(appEventPayloadV3.installId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel())) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 16, oty1.onExtraCallback, appEventPayloadV3.installId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 17) || !Intrinsics.areEqual(appEventPayloadV3.ICustomTabsCallbackStub(), "3")) {
            vylVar.onExtraCallback(serialDescriptor, 17, appEventPayloadV3.ICustomTabsCallbackStub());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 18) || !Intrinsics.areEqual(appEventPayloadV3.bankDeviceSession, GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(appEventPayloadV3.IAuthTabCallbackDefault()))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 18, getWriggleLayout.onNavigationEvent, appEventPayloadV3.bankDeviceSession);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 19)) {
            int i14 = onWarmupCompleted + 31;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.areEqual(appEventPayloadV3.referrer, AFj1nSDK5.onNavigationEvent.onNavigationEvent());
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(appEventPayloadV3.referrer, AFj1nSDK5.onNavigationEvent.onNavigationEvent())) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 19, Referrer$$serializer.INSTANCE, appEventPayloadV3.referrer);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 20) || !Intrinsics.areEqual(appEventPayloadV3.locale, GetFeatureExtension.onWarmupCompleted.access000())) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, appEventPayloadV3.locale);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 21)) {
            int i15 = onWarmupCompleted + 93;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            if (appEventPayloadV3.value != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 21, getWriggleLayout.onNavigationEvent, appEventPayloadV3.value);
            }
        }
        return null;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventPayloadV3(Long l, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, Referrer referrer, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str19;
        String str20;
        String strBx_;
        String strExtraCallback;
        String str21;
        String strAsBinder;
        String str22;
        String strAccess000;
        String str23;
        String strICustomTabsCallback;
        String strICustomTabsCallbackDefault;
        Long l3 = (i & 1) != 0 ? null : l;
        if ((i & 32) != 0) {
            int i2 = onWarmupCompleted + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                strICustomTabsCallbackDefault = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
                int i3 = 33 / 0;
            } else {
                strICustomTabsCallbackDefault = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
            }
            str19 = strICustomTabsCallbackDefault;
        } else {
            str19 = str4;
        }
        String strAsInterface = (i & 64) != 0 ? GetFeatureExtension.onWarmupCompleted.asInterface() : str5;
        if ((i & 128) != 0) {
            String strIAuthTabCallbackDefault = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str20 = strIAuthTabCallbackDefault;
        } else {
            str20 = str6;
        }
        if ((i & 256) != 0) {
            int i7 = 2 % 2;
            strBx_ = GetFeatureExtension.onWarmupCompleted.bx_();
        } else {
            strBx_ = str7;
        }
        String strOnActivityLayout = (i & 512) != 0 ? GetFeatureExtension.onWarmupCompleted.onActivityLayout() : str8;
        String strWriteTypedObject = (i & 1024) != 0 ? GetFeatureExtension.onWarmupCompleted.writeTypedObject() : str9;
        if ((i & 2048) != 0) {
            int i8 = IAuthTabCallback + 19;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            strExtraCallback = GetFeatureExtension.onWarmupCompleted.extraCallback();
        } else {
            strExtraCallback = str10;
        }
        if ((i & 4096) != 0) {
            int i11 = onWarmupCompleted + 81;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                strICustomTabsCallback = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
                int i12 = 97 / 0;
            } else {
                strICustomTabsCallback = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
            }
            str21 = strICustomTabsCallback;
        } else {
            str21 = str11;
        }
        if ((i & 8192) != 0) {
            int i13 = IAuthTabCallback + 7;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i15 = 2 % 2;
        } else {
            strAsBinder = str12;
        }
        if ((i & 16384) != 0) {
            String strOnMessageChannelReady = GetFeatureExtension.onWarmupCompleted.onMessageChannelReady();
            int i16 = IAuthTabCallback + 125;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 2 % 2;
            }
            str22 = strOnMessageChannelReady;
        } else {
            str22 = str13;
        }
        String interfaceDescriptor = (32768 & i) != 0 ? GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor() : str14;
        Long lIAuthTabCallback_Parcel = (65536 & i) != 0 ? GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel() : l2;
        String str24 = (131072 & i) != 0 ? "3" : str15;
        String strOnExtraCallbackWithResult = (262144 & i) != 0 ? GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(strAsBinder) : str16;
        Referrer referrerOnNavigationEvent = (524288 & i) != 0 ? AFj1nSDK5.onNavigationEvent.onNavigationEvent() : referrer;
        if ((1048576 & i) != 0) {
            int i18 = IAuthTabCallback + 35;
            onWarmupCompleted = i18 % 128;
            if (i18 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.access000();
                throw null;
            }
            strAccess000 = GetFeatureExtension.onWarmupCompleted.access000();
        } else {
            strAccess000 = str17;
        }
        if ((i & 2097152) != 0) {
            int i19 = onWarmupCompleted + 51;
            IAuthTabCallback = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            str23 = null;
        } else {
            str23 = str18;
        }
        this(l3, str, str2, str3, map, str19, strAsInterface, str20, strBx_, strOnActivityLayout, strWriteTypedObject, strExtraCallback, str21, strAsBinder, str22, interfaceDescriptor, lIAuthTabCallback_Parcel, str24, strOnExtraCallbackWithResult, referrerOnNavigationEvent, strAccess000, str23);
    }

    public final Long writeTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schemaId;
        }
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.logType;
        int i5 = i3 + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.service;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.params;
        int i5 = i2 + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.InterfaceC0059deInitialize
    public String access100() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.logId;
            int i4 = 21 / 0;
        } else {
            str = this.logId;
        }
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.logTime;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.deviceId;
        int i5 = i2 + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = appEventPayloadV3.clientVersion;
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.sessionId;
        int i5 = i3 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.network;
        int i4 = i3 + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.networkConnected;
        int i4 = i3 + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.osVersion;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.company;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.gaNo;
            int i4 = 59 / 0;
        } else {
            str = this.gaNo;
        }
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.installId;
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public String ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.version;
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankDeviceSession;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Referrer ICustomTabsCallback() {
        Referrer referrer;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            referrer = this.referrer;
            int i4 = 18 / 0;
        } else {
            referrer = this.referrer;
        }
        int i5 = i2 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return referrer;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = appEventPayloadV3.locale;
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        int i6 = i3 + 59;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onActivityLayout() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.value;
            int i4 = 72 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "logitems";
    }

    @Override // o.Deinitialize
    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outputStream, "");
        try {
            AppEventPayloadV3 appEventPayloadV3OnExtraCallback = onExtraCallback(this, null, null, null, null, checkValidYaw.onExtraCallback(extraCallbackWithResult(), ICustomTabsCallbackStub()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194287, null);
            wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), appEventPayloadV3OnExtraCallback, outputStream);
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // o.Deinitialize
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = IAuthTabCallback_Parcel() + access100() + ".v3.json";
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onUnminimized() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        return (KSerializer) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -992995580, new Object[0], iOnExtraCallbackWithResult, 992995580, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AppEventPayloadV3 appEventPayloadV3, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -767472166, new Object[]{appEventPayloadV3, vylVar, serialDescriptor}, iOnExtraCallbackWithResult, 767472169, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        return (String) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), 1659616036, new Object[]{this}, iOnExtraCallbackWithResult, -1659616035, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    public final String asBinder() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        return (String) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), 2030620956, new Object[]{this}, iOnExtraCallbackWithResult, -2030620954, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }
}
