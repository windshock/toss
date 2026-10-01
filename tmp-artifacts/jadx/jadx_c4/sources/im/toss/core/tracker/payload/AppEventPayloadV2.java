package im.toss.core.tracker.payload;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.Referrer$$serializer;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.PangleEncryptUtilsType4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.appInfo;
import o.checkPosition;
import o.checkValidYaw;
import o.forceDomainCheck;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
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
@nc(IAuthTabCallback = "v2")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppEventPayloadV2 implements checkPosition {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onTransact;
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
    private final String network;
    private final String networkConnected;
    private final String osVersion;
    private final Map<String, Object> params;
    private final Referrer referrer;
    private final long schemaId;
    private final String sessionId;
    private final String userNo;
    private final String version;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = s + 4;
        int i5 = 115 - (i * 4);
        byte[] bArr = $$a;
        int i6 = 1 - (b * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = i4 + i8;
            i2 = i3;
            i4 = i7;
            i5 = i9;
            int i10 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i10];
            i4 = i5;
            i7 = i10;
            int i92 = i4 + i8;
            i2 = i3;
            i4 = i7;
            i5 = i92;
            int i102 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public AppEventPayloadV2() {
        this(0L, (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i5));
        int i10 = ~(i3 | i5);
        int i11 = ~i5;
        int i12 = (~(i4 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i3 + i5 + i2 + ((-1570926368) * i6) + ((-1409401439) * i);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i3) - 657981440) + (821186744 * i5) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i2) + (1124073472 * i6) + ((-332922880) * i) + ((-1182662656) * i15);
        int i17 = (i3 * 1410161459) + 847508490 + (i5 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i2 * 1410159841) + (i6 * 1126552800) + (i * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onMessageChannelReady();
        }
        onMessageChannelReady();
        throw null;
    }

    private static final /* synthetic */ KSerializer onMessageChannelReady() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        Map<String, ? extends Object> map = (Map) objArr[2];
        String str6 = (String) objArr[3];
        String str7 = (String) objArr[4];
        String str8 = (String) objArr[5];
        String str9 = (String) objArr[6];
        String str10 = (String) objArr[7];
        String str11 = (String) objArr[8];
        String str12 = (String) objArr[9];
        String str13 = (String) objArr[10];
        String str14 = (String) objArr[11];
        String str15 = (String) objArr[12];
        String str16 = (String) objArr[13];
        Long l = (Long) objArr[14];
        String str17 = (String) objArr[15];
        String str18 = (String) objArr[16];
        Referrer referrer = (Referrer) objArr[17];
        String str19 = (String) objArr[18];
        int iIntValue = ((Number) objArr[19]).intValue();
        Object obj = objArr[20];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            jLongValue = appEventPayloadV2.schemaId;
        }
        if ((iIntValue & 2) != 0) {
            map = appEventPayloadV2.params;
        }
        if ((iIntValue & 4) != 0) {
            int i2 = IAuthTabCallbackStub + 35;
            str = str7;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                str6 = appEventPayloadV2.logId;
                int i3 = 58 / 0;
            } else {
                str6 = appEventPayloadV2.logId;
            }
        } else {
            str = str7;
        }
        String str20 = (iIntValue & 8) != 0 ? appEventPayloadV2.logTime : str;
        if ((iIntValue & 16) != 0) {
            str8 = appEventPayloadV2.deviceId;
        }
        if ((iIntValue & 32) != 0) {
            int i4 = IAuthTabCallbackDefault + 25;
            str2 = str10;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            str9 = appEventPayloadV2.clientVersion;
        } else {
            str2 = str10;
        }
        Object obj2 = null;
        if ((iIntValue & 64) != 0) {
            int i6 = IAuthTabCallbackStub + 113;
            str3 = str11;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                String str21 = appEventPayloadV2.sessionId;
                throw null;
            }
            str4 = appEventPayloadV2.sessionId;
        } else {
            str3 = str11;
            str4 = str2;
        }
        String str22 = (iIntValue & 128) != 0 ? appEventPayloadV2.network : str3;
        if ((iIntValue & 256) != 0) {
            int i7 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                String str23 = appEventPayloadV2.networkConnected;
                obj2.hashCode();
                throw null;
            }
            str12 = appEventPayloadV2.networkConnected;
        }
        if ((iIntValue & 512) != 0) {
            str13 = appEventPayloadV2.osVersion;
        }
        if ((iIntValue & 1024) != 0) {
            str14 = appEventPayloadV2.company;
        }
        if ((iIntValue & 2048) != 0) {
            str15 = appEventPayloadV2.userNo;
        }
        if ((iIntValue & 4096) != 0) {
            String str24 = appEventPayloadV2.gaNo;
            int i8 = IAuthTabCallbackDefault + 61;
            str5 = str15;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            str16 = str24;
        } else {
            str5 = str15;
        }
        if ((iIntValue & 8192) != 0) {
            l = appEventPayloadV2.installId;
        }
        if ((iIntValue & 16384) != 0) {
            str17 = appEventPayloadV2.version;
        }
        if ((32768 & iIntValue) != 0) {
            str18 = appEventPayloadV2.bankDeviceSession;
        }
        if ((65536 & iIntValue) != 0) {
            referrer = appEventPayloadV2.referrer;
        }
        if ((iIntValue & 131072) != 0) {
            str19 = appEventPayloadV2.locale;
        }
        return appEventPayloadV2.IAuthTabCallback(jLongValue, map, str6, str20, str8, str9, str4, str22, str12, str13, str14, str5, str16, l, str17, str18, referrer, str19);
    }

    public final AppEventPayloadV2 IAuthTabCallback(long j, @Nullable Map<String, ? extends Object> map, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @Nullable Long l, @NotNull String str12, @Nullable String str13, @Nullable Referrer referrer, @Nullable String str14) {
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
        AppEventPayloadV2 appEventPayloadV2 = new AppEventPayloadV2(j, map, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, l, str12, str13, referrer, str14);
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return appEventPayloadV2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppEventPayloadV2)) {
            int i2 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) obj;
        if (this.schemaId != appEventPayloadV2.schemaId) {
            int i4 = IAuthTabCallbackStub + 59;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, appEventPayloadV2.params)) {
            int i6 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.logId, appEventPayloadV2.logId) && Intrinsics.areEqual(this.logTime, appEventPayloadV2.logTime) && Intrinsics.areEqual(this.deviceId, appEventPayloadV2.deviceId)) {
            if (!Intrinsics.areEqual(this.clientVersion, appEventPayloadV2.clientVersion)) {
                int i8 = IAuthTabCallbackDefault + 119;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.sessionId, appEventPayloadV2.sessionId)) {
                int i10 = IAuthTabCallbackStub + 5;
                IAuthTabCallbackDefault = i10 % 128;
                return i10 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.network, appEventPayloadV2.network) || !Intrinsics.areEqual(this.networkConnected, appEventPayloadV2.networkConnected)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.osVersion, appEventPayloadV2.osVersion)) {
                int i11 = IAuthTabCallbackDefault + 37;
                int i12 = i11 % 128;
                IAuthTabCallbackStub = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 91;
                IAuthTabCallbackDefault = i14 % 128;
                if (i14 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.company, appEventPayloadV2.company)) {
                int i15 = IAuthTabCallbackDefault + 49;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.userNo, appEventPayloadV2.userNo) || !Intrinsics.areEqual(this.gaNo, appEventPayloadV2.gaNo)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.installId, appEventPayloadV2.installId)) {
                int i17 = IAuthTabCallbackStub + 55;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.version, appEventPayloadV2.version)) {
                return false;
            }
            if (Intrinsics.areEqual(this.bankDeviceSession, appEventPayloadV2.bankDeviceSession)) {
                return Intrinsics.areEqual(this.referrer, appEventPayloadV2.referrer) && Intrinsics.areEqual(this.locale, appEventPayloadV2.locale);
            }
            int i19 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i19 % 128;
            if (i19 % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int iHashCode;
        int i4 = 2 % 2;
        int iHashCode2 = Long.hashCode(this.schemaId);
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
        int iHashCode12 = this.company.hashCode();
        int iHashCode13 = this.userNo.hashCode();
        int iHashCode14 = this.gaNo.hashCode();
        Long l = this.installId;
        if (l == null) {
            int i5 = IAuthTabCallbackStub + 83;
            i = iHashCode14;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        } else {
            i = iHashCode14;
            int iHashCode15 = l.hashCode();
            int i7 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            i2 = iHashCode15;
        }
        int iHashCode16 = this.version.hashCode();
        String str = this.bankDeviceSession;
        int iHashCode17 = str == null ? 0 : str.hashCode();
        Referrer referrer = this.referrer;
        int iHashCode18 = referrer == null ? 0 : referrer.hashCode();
        String str2 = this.locale;
        if (str2 != null) {
            int i9 = IAuthTabCallbackStub + 51;
            i3 = iHashCode16;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode = str2.hashCode();
        } else {
            i3 = iHashCode16;
            iHashCode = 0;
        }
        int i11 = (((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + i3) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode;
        int i12 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i12 % 128;
        int i13 = i12 % 2;
        return i11;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppEventPayloadV2(schemaId=" + this.schemaId + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ", deviceId=" + this.deviceId + ", clientVersion=" + this.clientVersion + ", sessionId=" + this.sessionId + ", network=" + this.network + ", networkConnected=" + this.networkConnected + ", osVersion=" + this.osVersion + ", company=" + this.company + ", userNo=" + this.userNo + ", gaNo=" + this.gaNo + ", installId=" + this.installId + ", version=" + this.version + ", bankDeviceSession=" + this.bankDeviceSession + ", referrer=" + this.referrer + ", locale=" + this.locale + ")";
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppEventPayloadV2> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppEventPayloadV2$$serializer appEventPayloadV2$$serializer = AppEventPayloadV2$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
            return appEventPayloadV2$$serializer;
        }
    }

    static {
        onTransact = 1;
        onActivityResized();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.payload.AppEventPayloadV2$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = AppEventPayloadV2.onExtraCallbackWithResult();
                if (i3 != 0) {
                    int i4 = 85 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        int i = asBinder + 99;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AppEventPayloadV2(int i, long j, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, String str12, String str13, Referrer referrer, String str14, okycx okycxVar) throws Throwable {
        String strICustomTabsCallbackDefault;
        String strOnActivityLayout;
        String strWriteTypedObject;
        String strICustomTabsCallback;
        String interfaceDescriptor;
        String strIntern;
        long j2 = (i & 1) == 0 ? 0L : j;
        this.schemaId = j2;
        Object obj = null;
        if ((i & 2) == 0) {
            this.params = null;
        } else {
            this.params = map;
        }
        if ((i & 4) == 0) {
            int i2 = IAuthTabCallbackStub + 117;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                this.logId = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
                obj.hashCode();
                throw null;
            }
            strICustomTabsCallbackDefault = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
        } else {
            strICustomTabsCallbackDefault = str;
        }
        this.logId = strICustomTabsCallbackDefault;
        if ((i & 8) == 0) {
            this.logTime = GetFeatureExtension.onWarmupCompleted.asInterface();
            int i3 = 2 % 2;
        } else {
            this.logTime = str2;
        }
        this.deviceId = (i & 16) == 0 ? GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault() : str3;
        this.clientVersion = (i & 32) == 0 ? GetFeatureExtension.onWarmupCompleted.bx_() : str4;
        if ((i & 64) == 0) {
            int i4 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            strOnActivityLayout = GetFeatureExtension.onWarmupCompleted.onActivityLayout();
        } else {
            strOnActivityLayout = str5;
        }
        this.sessionId = strOnActivityLayout;
        if ((i & 128) == 0) {
            int i6 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                this.network = GetFeatureExtension.onWarmupCompleted.writeTypedObject();
                throw null;
            }
            strWriteTypedObject = GetFeatureExtension.onWarmupCompleted.writeTypedObject();
        } else {
            strWriteTypedObject = str6;
        }
        this.network = strWriteTypedObject;
        this.networkConnected = (i & 256) == 0 ? GetFeatureExtension.onWarmupCompleted.extraCallback() : str7;
        if ((i & 512) == 0) {
            int i7 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                this.osVersion = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
                throw null;
            }
            strICustomTabsCallback = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
        } else {
            strICustomTabsCallback = str8;
        }
        this.osVersion = strICustomTabsCallback;
        if ((i & 1024) == 0) {
            this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            this.company = str9;
            int i8 = 2 % 2;
        }
        this.userNo = (i & 2048) == 0 ? GetFeatureExtension.onWarmupCompleted.onMessageChannelReady() : str10;
        if ((i & 4096) == 0) {
            int i9 = IAuthTabCallbackDefault + 29;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor();
                obj.hashCode();
                throw null;
            }
            interfaceDescriptor = GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor();
            int i10 = 2 % 2;
        } else {
            interfaceDescriptor = str11;
        }
        this.gaNo = interfaceDescriptor;
        this.installId = (i & 8192) == 0 ? GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel() : l;
        if ((i & 16384) == 0) {
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (Process.myTid() >> 22), 231578409 + View.getDefaultSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1441323923, (-62) - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str12;
        }
        this.version = strIntern;
        int i11 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 2 % 2;
        }
        this.bankDeviceSession = (32768 & i) == 0 ? GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(asBinder()) : str13;
        int i13 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i13 % 128;
        int i14 = i13 % 2;
        this.referrer = (65536 & i) == 0 ? AFj1nSDK5.onNavigationEvent.onNavigationEvent() : referrer;
        int i15 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i15 % 128;
        int i16 = i15 % 2;
        this.locale = (i & 131072) == 0 ? GetFeatureExtension.onWarmupCompleted.access000() : str14;
        this.logName = "schema:" + j2;
    }

    public AppEventPayloadV2(long j, @Nullable Map<String, ? extends Object> map, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @Nullable Long l, @NotNull String str12, @Nullable String str13, @Nullable Referrer referrer, @Nullable String str14) {
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
        this.schemaId = j;
        this.params = map;
        this.logId = str;
        this.logTime = str2;
        this.deviceId = str3;
        this.clientVersion = str4;
        this.sessionId = str5;
        this.network = str6;
        this.networkConnected = str7;
        this.osVersion = str8;
        this.company = str9;
        this.userNo = str10;
        this.gaNo = str11;
        this.installId = l;
        this.version = str12;
        this.bankDeviceSession = str13;
        this.referrer = referrer;
        this.locale = str14;
        this.logName = "schema:" + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AppEventPayloadV2 appEventPayloadV2, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || appEventPayloadV2.schemaId != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, appEventPayloadV2.schemaId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || appEventPayloadV2.extraCallbackWithResult() != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), appEventPayloadV2.extraCallbackWithResult());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(appEventPayloadV2.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault())) {
            vylVar.onExtraCallback(serialDescriptor, 2, appEventPayloadV2.access100());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(appEventPayloadV2.IAuthTabCallback_Parcel(), GetFeatureExtension.onWarmupCompleted.asInterface())) {
            vylVar.onExtraCallback(serialDescriptor, 3, appEventPayloadV2.IAuthTabCallback_Parcel());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(appEventPayloadV2.deviceId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault())) {
            vylVar.onExtraCallback(serialDescriptor, 4, appEventPayloadV2.deviceId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(appEventPayloadV2.clientVersion, GetFeatureExtension.onWarmupCompleted.bx_())) {
            vylVar.onExtraCallback(serialDescriptor, 5, appEventPayloadV2.clientVersion);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i4 = IAuthTabCallbackStub + 47;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV2.sessionId, GetFeatureExtension.onWarmupCompleted.onActivityLayout())) {
                vylVar.onExtraCallback(serialDescriptor, 6, appEventPayloadV2.sessionId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i6 = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(appEventPayloadV2.network, GetFeatureExtension.onWarmupCompleted.writeTypedObject());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(appEventPayloadV2.network, GetFeatureExtension.onWarmupCompleted.writeTypedObject())) {
                vylVar.onExtraCallback(serialDescriptor, 7, appEventPayloadV2.network);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || !Intrinsics.areEqual(appEventPayloadV2.networkConnected, GetFeatureExtension.onWarmupCompleted.extraCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 8, appEventPayloadV2.networkConnected);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || !Intrinsics.areEqual(appEventPayloadV2.osVersion, GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 9, appEventPayloadV2.osVersion);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(appEventPayloadV2.asBinder(), GetFeatureExtension.onWarmupCompleted.asBinder())) {
            vylVar.onExtraCallback(serialDescriptor, 10, appEventPayloadV2.asBinder());
            int i7 = IAuthTabCallbackStub + 73;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || !Intrinsics.areEqual(appEventPayloadV2.userNo, GetFeatureExtension.onWarmupCompleted.onMessageChannelReady())) {
            vylVar.onExtraCallback(serialDescriptor, 11, appEventPayloadV2.userNo);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 12)) {
            int i9 = IAuthTabCallbackStub + 117;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV2.gaNo, GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor())) {
                vylVar.onExtraCallback(serialDescriptor, 12, appEventPayloadV2.gaNo);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 13)) {
            int i11 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV2.installId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel())) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 13, oty1.onExtraCallback, appEventPayloadV2.installId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 14)) {
            int i13 = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            String strOnActivityLayout = appEventPayloadV2.onActivityLayout();
            Object[] objArr = new Object[1];
            a((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.combineMeasuredStates(0, 0) + 231578409, 1441323923 + (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 62, objArr);
            if (!Intrinsics.areEqual(strOnActivityLayout, ((String) objArr[0]).intern())) {
                vylVar.onExtraCallback(serialDescriptor, 14, appEventPayloadV2.onActivityLayout());
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 15) || !Intrinsics.areEqual(appEventPayloadV2.bankDeviceSession, GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(appEventPayloadV2.asBinder()))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, appEventPayloadV2.bankDeviceSession);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 16) || !Intrinsics.areEqual(appEventPayloadV2.referrer, AFj1nSDK5.onNavigationEvent.onNavigationEvent())) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 16, Referrer$$serializer.INSTANCE, appEventPayloadV2.referrer);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 17) || !Intrinsics.areEqual(appEventPayloadV2.locale, GetFeatureExtension.onWarmupCompleted.access000())) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, appEventPayloadV2.locale);
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return lazyArr;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.schemaId;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 13;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // o.InterfaceC0059deInitialize
    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.params;
        int i5 = i2 + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventPayloadV2(long j, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, String str12, String str13, Referrer referrer, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String strIAuthTabCallbackDefault;
        String strBx_;
        String strWriteTypedObject;
        String strAsBinder;
        String strOnMessageChannelReady;
        String str15;
        Long l2;
        String str16;
        String strIntern;
        String strOnExtraCallbackWithResult;
        Referrer referrer2;
        String strAccess000;
        long j2 = (i & 1) != 0 ? 0L : j;
        Object obj = null;
        Map map2 = (i & 2) != 0 ? null : map;
        String strICustomTabsCallbackDefault = (i & 4) != 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault() : str;
        String strAsInterface = (i & 8) != 0 ? GetFeatureExtension.onWarmupCompleted.asInterface() : str2;
        if ((i & 16) != 0) {
            int i2 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallbackDefault = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            strIAuthTabCallbackDefault = str3;
        }
        if ((i & 32) != 0) {
            int i3 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                strBx_ = GetFeatureExtension.onWarmupCompleted.bx_();
                int i4 = 96 / 0;
            } else {
                strBx_ = GetFeatureExtension.onWarmupCompleted.bx_();
            }
            int i5 = 2 % 2;
        } else {
            strBx_ = str4;
        }
        String strOnActivityLayout = (i & 64) != 0 ? GetFeatureExtension.onWarmupCompleted.onActivityLayout() : str5;
        if ((i & 128) != 0) {
            int i6 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                GetFeatureExtension.onWarmupCompleted.writeTypedObject();
                obj.hashCode();
                throw null;
            }
            strWriteTypedObject = GetFeatureExtension.onWarmupCompleted.writeTypedObject();
        } else {
            strWriteTypedObject = str6;
        }
        String strExtraCallback = (i & 256) != 0 ? GetFeatureExtension.onWarmupCompleted.extraCallback() : str7;
        String strICustomTabsCallback = (i & 512) != 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback() : str8;
        if ((i & 1024) != 0) {
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i7 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            strAsBinder = str9;
        }
        if ((i & 2048) != 0) {
            strOnMessageChannelReady = GetFeatureExtension.onWarmupCompleted.onMessageChannelReady();
            int i9 = 2 % 2;
        } else {
            strOnMessageChannelReady = str10;
        }
        String interfaceDescriptor = (i & 4096) != 0 ? GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor() : str11;
        if ((i & 8192) != 0) {
            Long lIAuthTabCallback_Parcel = GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel();
            int i10 = IAuthTabCallbackStub + 67;
            str15 = interfaceDescriptor;
            IAuthTabCallbackDefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 % 5;
            } else {
                int i12 = 2 % 2;
            }
            l2 = lIAuthTabCallback_Parcel;
        } else {
            str15 = interfaceDescriptor;
            l2 = l;
        }
        Long l3 = l2;
        if ((i & 16384) != 0) {
            str16 = strOnMessageChannelReady;
            Object[] objArr = new Object[1];
            a((short) Color.red(0), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 231578409 - Color.green(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1441323923, (-61) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            str16 = strOnMessageChannelReady;
            strIntern = str12;
        }
        if ((32768 & i) != 0) {
            strOnExtraCallbackWithResult = GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(strAsBinder);
            int i13 = 2 % 2;
        } else {
            strOnExtraCallbackWithResult = str13;
        }
        Referrer referrerOnNavigationEvent = (65536 & i) != 0 ? AFj1nSDK5.onNavigationEvent.onNavigationEvent() : referrer;
        if ((i & 131072) != 0) {
            int i14 = IAuthTabCallbackDefault + 93;
            referrer2 = referrerOnNavigationEvent;
            IAuthTabCallbackStub = i14 % 128;
            if (i14 % 2 != 0) {
                strAccess000 = GetFeatureExtension.onWarmupCompleted.access000();
                int i15 = 92 / 0;
            } else {
                strAccess000 = GetFeatureExtension.onWarmupCompleted.access000();
            }
        } else {
            referrer2 = referrerOnNavigationEvent;
            strAccess000 = str14;
        }
        this(j2, map2, strICustomTabsCallbackDefault, strAsInterface, strIAuthTabCallbackDefault, strBx_, strOnActivityLayout, strWriteTypedObject, strExtraCallback, strICustomTabsCallback, strAsBinder, str16, str15, l3, strIntern, strOnExtraCallbackWithResult, referrer2, strAccess000);
    }

    @Override // o.InterfaceC0059deInitialize
    public String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logId;
        int i5 = i2 + 89;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 43;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logTime;
        int i5 = i2 + 13;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.deviceId;
        int i4 = i3 + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.clientVersion;
        int i4 = i2 + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return str;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sessionId;
        int i5 = i2 + 1;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = appEventPayloadV2.network;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.networkConnected;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = appEventPayloadV2.osVersion;
        int i5 = i2 + 119;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.company;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.gaNo;
        int i4 = i2 + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Long l = this.installId;
        int i5 = i3 + 91;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public String onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 87;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.version;
        int i4 = i2 + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.bankDeviceSession;
        int i4 = i3 + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Referrer extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Referrer referrer = this.referrer;
        int i4 = i3 + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return referrer;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 97;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.locale;
        int i5 = i2 + 13;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return "logitems";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 37;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.Deinitialize
    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outputStream, "");
        try {
            Object obj = null;
            AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{this, 0L, checkValidYaw.onExtraCallback(extraCallbackWithResult(), onActivityLayout()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262141, null}, forceDomainCheck.IAuthTabCallback(), -1217172885, forceDomainCheck.IAuthTabCallback(), 1217172887, forceDomainCheck.IAuthTabCallback());
            wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), appEventPayloadV2, outputStream);
            int i4 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // o.Deinitialize
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = IAuthTabCallback_Parcel() + access100() + ".v2.json";
        int i2 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43424), (ViewConfiguration.getTapTimeout() >> 16) + 42, View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int i6 = $11 + 93;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.combineMeasuredStates(0, 0)), Process.getGidForName("") + 56, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 42 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getMode(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 86, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int i9 = $11 + 115;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i12 = $10 + 67;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ AppEventPayloadV2 onWarmupCompleted(AppEventPayloadV2 appEventPayloadV2, long j, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, String str12, String str13, Referrer referrer, String str14, int i, Object obj) {
        Object[] objArr = {appEventPayloadV2, Long.valueOf(j), map, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, l, str12, str13, referrer, str14, Integer.valueOf(i), obj};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return (AppEventPayloadV2) onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), objArr, forceDomainCheck.IAuthTabCallback(), -1217172885, iIAuthTabCallback, 1217172887, forceDomainCheck.IAuthTabCallback());
    }

    public final String getInterfaceDescriptor() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, -620949636, iIAuthTabCallback, 620949636, iIAuthTabCallback3);
    }

    public final String writeTypedObject() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback2, -384001452, iIAuthTabCallback, 384001453, iIAuthTabCallback3);
    }

    static void onActivityResized() {
        IAuthTabCallback = 1450556639;
        onWarmupCompleted = -1538795465;
        onExtraCallbackWithResult = 240188567;
        onExtraCallback = new byte[]{8};
    }
}
