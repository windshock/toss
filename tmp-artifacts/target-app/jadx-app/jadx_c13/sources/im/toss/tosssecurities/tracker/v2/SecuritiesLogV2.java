package im.toss.tosssecurities.tracker.v2;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.PangleEncryptUtilsType4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.checkValidYaw;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.sp;
import o.vyl;
import o.wie2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesLogV2 implements AFd1kSDKExternalSyntheticLambda0 {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    public static final String VERSION = "v2";
    private static int asInterface;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountSeq;
    private final String accountType;
    private final String clientVersion;
    private final String company;
    private final String logId;
    private final String logName;
    private final String logNameConvert;
    private final String logTime;
    private final String logType;
    private final String network;
    private final String networkConnected;
    private final Map<String, Object> params;
    private final String sessionId;
    private final UserContext userContext;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 166;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 4;
        int i4 = (i * 4) + 115;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i5++;
            i6 = bArr[i5];
            i4 += i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = onTransact + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) GetMotionInteractionState.onExtraCallback));
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return getmutilbackgrounddrawable;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecuritiesLogV2)) {
            return false;
        }
        SecuritiesLogV2 securitiesLogV2 = (SecuritiesLogV2) obj;
        if (!Intrinsics.areEqual(this.logType, securitiesLogV2.logType)) {
            int i4 = onTransact + 39;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logName, securitiesLogV2.logName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logNameConvert, securitiesLogV2.logNameConvert)) {
            int i6 = IAuthTabCallbackStub + 113;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, securitiesLogV2.params)) {
            int i8 = onTransact + 81;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logId, securitiesLogV2.logId) || !Intrinsics.areEqual(this.logTime, securitiesLogV2.logTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.clientVersion, securitiesLogV2.clientVersion)) {
            int i10 = IAuthTabCallbackStub + 85;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionId, securitiesLogV2.sessionId)) {
            int i12 = onTransact + 39;
            IAuthTabCallbackStub = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.network, securitiesLogV2.network)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.networkConnected, securitiesLogV2.networkConnected)) {
            int i13 = IAuthTabCallbackStub + 69;
            onTransact = i13 % 128;
            return i13 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.company, securitiesLogV2.company)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.userContext, securitiesLogV2.userContext)) {
            int i14 = IAuthTabCallbackStub + 67;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountType, securitiesLogV2.accountType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.accountSeq, securitiesLogV2.accountSeq)) {
            return true;
        }
        int i16 = IAuthTabCallbackStub + 99;
        onTransact = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[PHI: r2 r4 r5 r6
      0x0035: PHI (r2v34 int) = (r2v5 int), (r2v36 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r6v8 int) = (r6v0 int), (r6v9 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r2 r4 r6
      0x0033: PHI (r2v6 int) = (r2v5 int), (r2v36 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r6v1 int) = (r6v0 int), (r6v9 int) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int i;
        int iHashCode3;
        int iHashCode4;
        int i2;
        int iHashCode5;
        int iHashCode6;
        int i3 = 2 % 2;
        int i4 = onTransact + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            iHashCode = this.logType.hashCode();
            iHashCode2 = this.logName.hashCode();
            str = this.logNameConvert;
            i = 1;
            iHashCode3 = str == null ? 0 : str.hashCode();
        } else {
            iHashCode = this.logType.hashCode();
            iHashCode2 = this.logName.hashCode();
            str = this.logNameConvert;
            i = 0;
            if (str == null) {
            }
        }
        Map<String, Object> map = this.params;
        if (map == null) {
            int i5 = IAuthTabCallbackStub + 13;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = map.hashCode();
        }
        int iHashCode7 = this.logId.hashCode();
        int iHashCode8 = this.logTime.hashCode();
        int iHashCode9 = this.clientVersion.hashCode();
        int iHashCode10 = this.sessionId.hashCode();
        int iHashCode11 = this.network.hashCode();
        int iHashCode12 = this.networkConnected.hashCode();
        int iHashCode13 = this.company.hashCode();
        int iHashCode14 = this.userContext.hashCode();
        String str2 = this.accountType;
        if (str2 == null) {
            int i7 = onTransact + 109;
            i2 = i;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            iHashCode5 = 0;
        } else {
            i2 = i;
            iHashCode5 = str2.hashCode();
        }
        String str3 = this.accountSeq;
        if (str3 != null) {
            int i9 = onTransact + 91;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            iHashCode6 = str3.hashCode();
        } else {
            iHashCode6 = i2;
        }
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode5) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesLogV2(logType=" + this.logType + ", logName=" + this.logName + ", logNameConvert=" + this.logNameConvert + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ", clientVersion=" + this.clientVersion + ", sessionId=" + this.sessionId + ", network=" + this.network + ", networkConnected=" + this.networkConnected + ", company=" + this.company + ", userContext=" + this.userContext + ", accountType=" + this.accountType + ", accountSeq=" + this.accountSeq + ")";
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ SecuritiesLogV2(int i, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, UserContext userContext, String str11, String str12, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 16383;
        if (16383 != (i & 16383)) {
            int i3 = IAuthTabCallbackStub + 51;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = SecuritiesLogV2$$serializer.INSTANCE.getDescriptor();
                i2 = 22232;
            } else {
                descriptor = SecuritiesLogV2$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.logType = str;
        this.logName = str2;
        this.logNameConvert = str3;
        this.params = map;
        this.logId = str4;
        this.logTime = str5;
        this.clientVersion = str6;
        this.sessionId = str7;
        this.network = str8;
        this.networkConnected = str9;
        this.company = str10;
        this.userContext = userContext;
        this.accountType = str11;
        this.accountSeq = str12;
    }

    private SecuritiesLogV2(String str, String str2, String str3, Map<String, ? extends Object> map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, UserContext userContext, String str11, String str12) {
        this.logType = str;
        this.logName = str2;
        this.logNameConvert = str3;
        this.params = map;
        this.logId = str4;
        this.logTime = str5;
        this.clientVersion = str6;
        this.sessionId = str7;
        this.network = str8;
        this.networkConnected = str9;
        this.company = str10;
        this.userContext = userContext;
        this.accountType = str11;
        this.accountSeq = str12;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 71 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(SecuritiesLogV2 securitiesLogV2, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, securitiesLogV2.IAuthTabCallbackStub());
        vylVar.onExtraCallback(serialDescriptor, 1, securitiesLogV2.IAuthTabCallbackStubProxy());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, securitiesLogV2.logNameConvert);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, lazyArr[3].getValue(), securitiesLogV2.extraCallbackWithResult());
        vylVar.onExtraCallback(serialDescriptor, 4, securitiesLogV2.access100());
        vylVar.onExtraCallback(serialDescriptor, 5, securitiesLogV2.onExtraCallbackWithResult());
        vylVar.onExtraCallback(serialDescriptor, 6, securitiesLogV2.clientVersion);
        vylVar.onExtraCallback(serialDescriptor, 7, securitiesLogV2.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 8, securitiesLogV2.network);
        vylVar.onExtraCallback(serialDescriptor, 9, securitiesLogV2.networkConnected);
        vylVar.onExtraCallback(serialDescriptor, 10, securitiesLogV2.onNavigationEvent());
        vylVar.onNavigationEvent(serialDescriptor, 11, SecuritiesLogV2$UserContext$$serializer.INSTANCE, securitiesLogV2.userContext);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, securitiesLogV2.accountType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, securitiesLogV2.accountSeq);
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logType;
        }
        throw null;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.logName;
        int i5 = i3 + 9;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.params;
        int i5 = i3 + 13;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.logId;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = this.logTime;
        int i5 = i3 + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.company;
        int i4 = i3 + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesLogV2> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesLogV2$$serializer securitiesLogV2$$serializer = SecuritiesLogV2$$serializer.INSTANCE;
            if (i3 != 0) {
                return securitiesLogV2$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        asInterface = 1;
        asBinder();
        Companion = new Companion(null);
        $stable = 8;
        $childSerializers = new Lazy[]{null, null, null, LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.tracker.v2.SecuritiesLogV2$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    SecuritiesLogV2.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = SecuritiesLogV2.IAuthTabCallback();
                int i3 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null, null, null, null, null, null, null, null, null, null};
        int i = asBinder + 63;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 41;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return "securities-logs";
        }
        obj.hashCode();
        throw null;
    }

    public String onMinimized() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (Process.myPid() >> 22), (byte) (ImageFormat.getBitsPerPixel(0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1763539830, (-2115965661) + TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') - 78, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = IAuthTabCallbackStub + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public SecuritiesLogV2(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends Object> map, long j) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        String strICustomTabsCallbackDefault = getFeatureExtension.ICustomTabsCallbackDefault();
        String str6 = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(str6, "");
        String strBx_ = getFeatureExtension.bx_();
        String strOnActivityLayout = getFeatureExtension.onActivityLayout();
        String strWriteTypedObject = getFeatureExtension.writeTypedObject();
        String strExtraCallback = getFeatureExtension.extraCallback();
        String strIAuthTabCallbackDefault = getFeatureExtension.IAuthTabCallbackDefault();
        String interfaceDescriptor = getFeatureExtension.getInterfaceDescriptor();
        AFd1lSDK aFd1lSDK = AFd1lSDK.onWarmupCompleted;
        String str7 = null;
        if (!aFd1lSDK.onNavigationEvent()) {
            int i = onTransact + 73;
            int i2 = i % 128;
            IAuthTabCallbackStub = i2;
            if (i % 2 != 0) {
                int i3 = 92 / 0;
            }
            int i4 = i2 + 97;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            interfaceDescriptor = null;
        }
        String strOnMessageChannelReady = getFeatureExtension.onMessageChannelReady();
        if (aFd1lSDK.onNavigationEvent()) {
            int i7 = IAuthTabCallbackStub;
            int i8 = i7 + 13;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                str7.hashCode();
                throw null;
            }
            int i9 = i7 + 35;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str7 = strOnMessageChannelReady;
        }
        UserContext userContext = new UserContext(strIAuthTabCallbackDefault, interfaceDescriptor, str7, AFd1kSDKExternalSyntheticLambda0.Companion.IAuthTabCallback().IAuthTabCallback());
        Object[] objArr = new Object[1];
        a((short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1763539820, (-2115965664) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), (-72) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), objArr);
        this(str, str2, str3, map, strICustomTabsCallbackDefault, str6, strBx_, strOnActivityLayout, strWriteTypedObject, strExtraCallback, ((String) objArr[0]).intern(), userContext, str4, str5);
    }

    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(outputStream, "");
                wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), this, outputStream);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(outputStream, "");
            wie2 wie2VarIAuthTabCallback2 = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback2.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback2, Companion.serializer(), this, outputStream);
            int i3 = onTransact + 103;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @liq
    public static final class UserContext {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String deviceId;
        private final String gaNo;
        private final String securitiesDeviceSession;
        private final String userNo;

        static {
            int i = onExtraCallbackWithResult + 25;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserContext)) {
                int i4 = i3 + 55;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 75;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            UserContext userContext = (UserContext) obj;
            if (Intrinsics.areEqual(this.deviceId, userContext.deviceId)) {
                if (!Intrinsics.areEqual(this.gaNo, userContext.gaNo)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.userNo, userContext.userNo)) {
                    return Intrinsics.areEqual(this.securitiesDeviceSession, userContext.securitiesDeviceSession);
                }
                int i9 = onWarmupCompleted + 65;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = onWarmupCompleted;
            int i12 = i11 + 25;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 31;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            String str;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int iHashCode3 = 0;
            if (i2 % 2 != 0) {
                iHashCode = this.deviceId.hashCode();
                str = this.gaNo;
                iHashCode2 = 1;
                if (str != null) {
                    iHashCode3 = 1;
                    iHashCode2 = iHashCode3;
                    iHashCode3 = str.hashCode();
                }
                int i3 = IAuthTabCallback + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iHashCode = this.deviceId.hashCode();
                str = this.gaNo;
                if (str == null) {
                    iHashCode2 = 0;
                    int i32 = IAuthTabCallback + 61;
                    onWarmupCompleted = i32 % 128;
                    int i42 = i32 % 2;
                }
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
            String str2 = this.userNo;
            if (str2 != null) {
                int i5 = IAuthTabCallback + 39;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    str2.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode2 = str2.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + this.securitiesDeviceSession.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UserContext(deviceId=" + this.deviceId + ", gaNo=" + this.gaNo + ", userNo=" + this.userNo + ", securitiesDeviceSession=" + this.securitiesDeviceSession + ")";
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UserContext> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                SecuritiesLogV2$UserContext$$serializer securitiesLogV2$UserContext$$serializer = SecuritiesLogV2$UserContext$$serializer.INSTANCE;
                if (i3 != 0) {
                    return securitiesLogV2$UserContext$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ UserContext(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 15;
            if (15 != (i & 15)) {
                int i3 = onWarmupCompleted + 85;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = SecuritiesLogV2$UserContext$$serializer.INSTANCE.getDescriptor();
                    i2 = 76;
                } else {
                    descriptor = SecuritiesLogV2$UserContext$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = onWarmupCompleted + 5;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.deviceId = str;
            this.gaNo = str2;
            this.userNo = str3;
            this.securitiesDeviceSession = str4;
        }

        public UserContext(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.deviceId = str;
            this.gaNo = str2;
            this.userNo = str3;
            this.securitiesDeviceSession = str4;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(UserContext userContext, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, userContext.deviceId);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, userContext.gaNo);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, userContext.userNo);
            vylVar.onExtraCallback(serialDescriptor, 3, userContext.securitiesDeviceSession);
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = onExtraCallbackWithResult() + access100() + ".json";
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return str;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, 22439 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = onExtraCallback;
                char c = '0';
                if (bArr2 != null) {
                    int i7 = $10 + 55;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 5;
                        $10 = i9 % 128;
                        int i10 = i9 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 55, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            int i11 = $10 + 73;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            i5 = 2;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onExtraCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 43, 22439 - (ViewConfiguration.getEdgeSlop() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z2) {
                    int i14 = $10 + 119;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 87, 9567 - View.combineMeasuredStates(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int i16 = $10 + 113;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        int i19 = $11 + 1;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i21 = $10 + 59;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void asBinder() {
        IAuthTabCallback = 849697947;
        onNavigationEvent = -1538795431;
        onWarmupCompleted = -631714981;
        onExtraCallback = new byte[]{6, -12, -3, 3, -1, -11, 26, -10, -6, -76, 8, 8};
    }
}
