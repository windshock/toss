package im.toss.tosssecurities.tracker.v1;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AFd1kSDKExternalSyntheticLambda0;
import o.AFd1lSDK;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.PangleEncryptUtilsType4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkValidYaw;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.sp;
import o.vyl;
import o.wie2;
import o.zzaj;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesLogV1 implements AFd1kSDKExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    public static final String VERSION = "v1";
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String clientVersion;
    private final String company;
    private final String deviceId;
    private final String deviceModel;
    private final String gaNo;
    private final String logId;
    private final String logName;
    private final String logTime;
    private final String logType;
    private final String network;
    private final String networkConnected;
    private final String os;
    private final String osVersion;
    private final Map<String, Object> params;
    private final String securitiesDeviceSession;
    private final String sessionId;
    private final String userNo;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) GetMotionInteractionState.onExtraCallback));
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof SecuritiesLogV1)) {
            return false;
        }
        SecuritiesLogV1 securitiesLogV1 = (SecuritiesLogV1) obj;
        if (!Intrinsics.areEqual(this.logType, securitiesLogV1.logType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logName, securitiesLogV1.logName)) {
            int i3 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, securitiesLogV1.params)) {
            int i5 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logId, securitiesLogV1.logId) || !Intrinsics.areEqual(this.logTime, securitiesLogV1.logTime) || !Intrinsics.areEqual(this.deviceId, securitiesLogV1.deviceId) || !Intrinsics.areEqual(this.clientVersion, securitiesLogV1.clientVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionId, securitiesLogV1.sessionId)) {
            int i7 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.network, securitiesLogV1.network)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.networkConnected, securitiesLogV1.networkConnected)) {
            int i9 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.osVersion, securitiesLogV1.osVersion)) {
            int i11 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.os, securitiesLogV1.os)) {
            int i13 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.company, securitiesLogV1.company)) {
            return Intrinsics.areEqual(this.gaNo, securitiesLogV1.gaNo) && Intrinsics.areEqual(this.userNo, securitiesLogV1.userNo) && Intrinsics.areEqual(this.securitiesDeviceSession, securitiesLogV1.securitiesDeviceSession) && Intrinsics.areEqual(this.deviceModel, securitiesLogV1.deviceModel);
        }
        int i15 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int iHashCode = this.logType.hashCode();
        int iHashCode2 = this.logName.hashCode();
        Map<String, Object> map = this.params;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        int iHashCode4 = this.logId.hashCode();
        int iHashCode5 = this.logTime.hashCode();
        int iHashCode6 = this.deviceId.hashCode();
        int iHashCode7 = this.clientVersion.hashCode();
        int iHashCode8 = this.sessionId.hashCode();
        int iHashCode9 = this.network.hashCode();
        int iHashCode10 = this.networkConnected.hashCode();
        int iHashCode11 = this.osVersion.hashCode();
        int iHashCode12 = this.os.hashCode();
        int iHashCode13 = this.company.hashCode();
        String str = this.gaNo;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            i = iHashCode13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i2 = 0;
        } else {
            i = iHashCode13;
            int iHashCode14 = str.hashCode();
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i2 = iHashCode14;
        }
        String str2 = this.userNo;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + i2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.securitiesDeviceSession.hashCode()) * 31) + this.deviceModel.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesLogV1(logType=" + this.logType + ", logName=" + this.logName + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ", deviceId=" + this.deviceId + ", clientVersion=" + this.clientVersion + ", sessionId=" + this.sessionId + ", network=" + this.network + ", networkConnected=" + this.networkConnected + ", osVersion=" + this.osVersion + ", os=" + this.os + ", company=" + this.company + ", gaNo=" + this.gaNo + ", userNo=" + this.userNo + ", securitiesDeviceSession=" + this.securitiesDeviceSession + ", deviceModel=" + this.deviceModel + ")";
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ SecuritiesLogV1(int i, String str, String str2, Map map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, okycx okycxVar) {
        if (131071 != (i & 131071)) {
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 131071, SecuritiesLogV1$$serializer.INSTANCE.getDescriptor());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            htf31.onExtraCallbackWithResult(i, 131071, SecuritiesLogV1$$serializer.INSTANCE.getDescriptor());
            int i3 = 2 % 2;
        }
        this.logType = str;
        this.logName = str2;
        this.params = map;
        this.logId = str3;
        this.logTime = str4;
        this.deviceId = str5;
        this.clientVersion = str6;
        this.sessionId = str7;
        this.network = str8;
        this.networkConnected = str9;
        this.osVersion = str10;
        this.os = str11;
        this.company = str12;
        this.gaNo = str13;
        this.userNo = str14;
        this.securitiesDeviceSession = str15;
        this.deviceModel = str16;
    }

    private SecuritiesLogV1(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.logType = str;
        this.logName = str2;
        this.params = map;
        this.logId = str3;
        this.logTime = str4;
        this.deviceId = str5;
        this.clientVersion = str6;
        this.sessionId = str7;
        this.network = str8;
        this.networkConnected = str9;
        this.osVersion = str10;
        this.os = str11;
        this.company = str12;
        this.gaNo = str13;
        this.userNo = str14;
        this.securitiesDeviceSession = str15;
        this.deviceModel = str16;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(SecuritiesLogV1 securitiesLogV1, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, securitiesLogV1.IAuthTabCallbackStub());
        vylVar.onExtraCallback(serialDescriptor, 1, securitiesLogV1.IAuthTabCallbackStubProxy());
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, lazyArr[2].getValue(), securitiesLogV1.extraCallbackWithResult());
        vylVar.onExtraCallback(serialDescriptor, 3, securitiesLogV1.access100());
        vylVar.onExtraCallback(serialDescriptor, 4, securitiesLogV1.onExtraCallback());
        vylVar.onExtraCallback(serialDescriptor, 5, securitiesLogV1.deviceId);
        vylVar.onExtraCallback(serialDescriptor, 6, securitiesLogV1.clientVersion);
        vylVar.onExtraCallback(serialDescriptor, 7, securitiesLogV1.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 8, securitiesLogV1.network);
        vylVar.onExtraCallback(serialDescriptor, 9, securitiesLogV1.networkConnected);
        vylVar.onExtraCallback(serialDescriptor, 10, securitiesLogV1.osVersion);
        vylVar.onExtraCallback(serialDescriptor, 11, securitiesLogV1.os);
        vylVar.onExtraCallback(serialDescriptor, 12, securitiesLogV1.onExtraCallbackWithResult());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, securitiesLogV1.gaNo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, securitiesLogV1.userNo);
        vylVar.onExtraCallback(serialDescriptor, 15, securitiesLogV1.securitiesDeviceSession);
        vylVar.onExtraCallback(serialDescriptor, 16, securitiesLogV1.deviceModel);
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.logType;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.params;
        int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public String access100() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.logId;
            int i4 = 71 / 0;
        } else {
            str = this.logId;
        }
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logTime;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.company;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesLogV1> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesLogV1$$serializer securitiesLogV1$$serializer = SecuritiesLogV1$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return securitiesLogV1$$serializer;
        }
    }

    static {
        asBinder();
        Companion = new Companion(null);
        $stable = 8;
        $childSerializers = new Lazy[]{null, null, LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.tracker.v1.SecuritiesLogV1$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = SecuritiesLogV1.IAuthTabCallback();
                int i4 = onWarmupCompleted + 103;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        int i = onWarmupCompleted + 85;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return "securities-logs";
        }
        throw null;
    }

    public String onMinimized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return VERSION;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecuritiesLogV1(String str, String str2, Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        long jIAuthTabCallbackDefault;
        if ((i & 8) != 0) {
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                jIAuthTabCallbackDefault = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
                int i3 = 18 / 0;
            } else {
                jIAuthTabCallbackDefault = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
            }
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            } else {
                int i6 = 2 % 2;
            }
            j2 = jIAuthTabCallbackDefault;
        } else {
            j2 = j;
        }
        this(str, str2, map, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SecuritiesLogV1(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map, long j) throws Throwable {
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        String strICustomTabsCallbackDefault = getFeatureExtension.ICustomTabsCallbackDefault();
        String str5 = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        String strIAuthTabCallbackDefault = getFeatureExtension.IAuthTabCallbackDefault();
        String strBx_ = getFeatureExtension.bx_();
        String strOnActivityLayout = getFeatureExtension.onActivityLayout();
        String strWriteTypedObject = getFeatureExtension.writeTypedObject();
        String strExtraCallback = getFeatureExtension.extraCallback();
        String strICustomTabsCallback = getFeatureExtension.ICustomTabsCallback();
        String interfaceDescriptor = getFeatureExtension.getInterfaceDescriptor();
        AFd1lSDK aFd1lSDK = AFd1lSDK.onWarmupCompleted;
        if (aFd1lSDK.onNavigationEvent()) {
            str3 = interfaceDescriptor;
        } else {
            int i = onNavigationEvent + 123;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            str3 = null;
        }
        String strOnMessageChannelReady = getFeatureExtension.onMessageChannelReady();
        if (aFd1lSDK.onNavigationEvent()) {
            str4 = strOnMessageChannelReady;
        } else {
            int i3 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str4 = null;
        }
        String strIAuthTabCallback = AFd1kSDKExternalSyntheticLambda0.Companion.IAuthTabCallback().IAuthTabCallback();
        String str6 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str6, "");
        Object[] objArr = new Object[1];
        a(new char[]{31245, 26448, 16523, 11754, 3872, 59488, 54728, 46874, 36931, 32174}, 7499 - Gravity.getAbsoluteGravity(0, 0), objArr);
        this(str, str2, map, strICustomTabsCallbackDefault, str5, strIAuthTabCallbackDefault, strBx_, strOnActivityLayout, strWriteTypedObject, strExtraCallback, strICustomTabsCallback, "android", ((String) objArr[0]).intern(), str3, str4, strIAuthTabCallback, str6);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 111;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), 23 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), (Process.myPid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Color.red(0) + 59, 6383 - ExpandableListView.getPackedPositionGroup(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 19;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 % 4;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 59, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(outputStream, "");
                wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), this, outputStream);
                int i3 = 85 / 0;
            } else {
                Intrinsics.checkNotNullParameter(outputStream, "");
                wie2 wie2VarIAuthTabCallback2 = checkValidYaw.IAuthTabCallback();
                wie2VarIAuthTabCallback2.onExtraCallback();
                PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback2, Companion.serializer(), this, outputStream);
            }
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = onExtraCallback() + access100() + ".json";
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void asBinder() {
        IAuthTabCallback = -7270262731619893431L;
    }
}
