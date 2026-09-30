package im.toss.core.tracker.payload;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.appInfo;
import o.checkPosition;
import o.checkValidYaw;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
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
@nc(IAuthTabCallback = "v1")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppEventPayloadV1 implements checkPosition {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int asBinder;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
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
    private final String service;
    private final String sessionId;
    private final String userNo;
    private final String value;
    private final String version;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    private static String $$c(int i, int i2, byte b) {
        int i3 = i2 + 109;
        byte[] bArr = $$a;
        int i4 = i * 3;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 = i6 + i5;
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i5;
            i3 += bArr[i5];
            i5 = i9 + 1;
            i7 = i8;
        }
    }

    public static /* synthetic */ AppEventPayloadV1 onExtraCallback(AppEventPayloadV1 appEventPayloadV1, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, Referrer referrer, String str17, String str18, int i, Object obj) {
        Map map2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        Long l2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        String str25 = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : appEventPayloadV1.logName;
        String str26 = (i & 2) != 0 ? appEventPayloadV1.logType : str2;
        String str27 = (i & 4) != 0 ? appEventPayloadV1.service : str3;
        if ((i & 8) != 0) {
            map2 = appEventPayloadV1.params;
            int i5 = i4 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 4;
            }
        } else {
            map2 = map;
        }
        String str28 = (i & 16) != 0 ? appEventPayloadV1.logId : str4;
        String str29 = (i & 32) != 0 ? appEventPayloadV1.logTime : str5;
        if ((i & 64) != 0) {
            str19 = appEventPayloadV1.deviceId;
            int i7 = onWarmupCompleted + 65;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str19 = str6;
        }
        String str30 = (i & 128) != 0 ? appEventPayloadV1.clientVersion : str7;
        String str31 = (i & 256) != 0 ? appEventPayloadV1.sessionId : str8;
        String str32 = (i & 512) != 0 ? appEventPayloadV1.network : str9;
        String str33 = (i & 1024) != 0 ? appEventPayloadV1.networkConnected : str10;
        if ((i & 2048) != 0) {
            String str34 = appEventPayloadV1.osVersion;
            int i9 = IAuthTabCallback + 49;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            str20 = str34;
        } else {
            str20 = str11;
        }
        if ((i & 4096) != 0) {
            int i11 = IAuthTabCallback + 29;
            str21 = str20;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            str22 = appEventPayloadV1.company;
        } else {
            str21 = str20;
            str22 = str12;
        }
        String str35 = (i & 8192) != 0 ? appEventPayloadV1.userNo : str13;
        String str36 = (i & 16384) != 0 ? appEventPayloadV1.gaNo : str14;
        if ((i & 32768) != 0) {
            str23 = str36;
            int i13 = IAuthTabCallback + 31;
            str24 = str35;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 == 0) {
                l2 = appEventPayloadV1.installId;
                int i14 = 89 / 0;
            } else {
                l2 = appEventPayloadV1.installId;
            }
        } else {
            str23 = str36;
            str24 = str35;
            l2 = l;
        }
        return appEventPayloadV1.IAuthTabCallback(str25, str26, str27, map2, str28, str29, str19, str30, str31, str32, str33, str21, str22, str24, str23, l2, (65536 & i) != 0 ? appEventPayloadV1.version : str15, (i & 131072) != 0 ? appEventPayloadV1.bankDeviceSession : str16, (i & 262144) != 0 ? appEventPayloadV1.referrer : referrer, (i & 524288) != 0 ? appEventPayloadV1.locale : str17, (i & 1048576) != 0 ? appEventPayloadV1.value : str18);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (KSerializer) onWarmupCompleted(-448826220, ICustomTabsCallbackStubProxy.onExtraCallback(), 448826223, iOnExtraCallback, iOnExtraCallback2, new Object[0], iOnExtraCallback3);
        }
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback5 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback6 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9;
        int i11 = (~((~i4) | i7 | i3)) | (~(i8 | i));
        int i12 = i + i3 + i5 + (531708263 * i6) + ((-608630064) * i2);
        int i13 = i12 * i12;
        int i14 = (i * (-228234701)) + 730857472 + ((-228234701) * i3) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i5) + ((-45088768) * i6) + ((-419430400) * i2) + ((-1471938560) * i13);
        int i15 = ((i * (-1679524527)) - 150938974) + (i3 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i5 * (-1679524245)) + (i6 * (-166744051)) + (i2 * 2062148848) + (i13 * (-865337344));
        int i16 = i14 + (i15 * i15 * (-1617166336));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 3) {
            return onExtraCallback(objArr);
        }
        int i17 = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i18 = onWarmupCompleted + 85;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        return getmutilbackgrounddrawable;
    }

    public final AppEventPayloadV1 IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, ? extends Object> map, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @Nullable Long l, @NotNull String str15, @Nullable String str16, @Nullable Referrer referrer, @Nullable String str17, @Nullable String str18) {
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
        AppEventPayloadV1 appEventPayloadV1 = new AppEventPayloadV1(str, str2, str3, map, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, l, str15, str16, referrer, str17, str18);
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return appEventPayloadV1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof im.toss.core.tracker.payload.AppEventPayloadV1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 97;
        im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r6 = (im.toss.core.tracker.payload.AppEventPayloadV1) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logName, r6.logName) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logType, r6.logType) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.service, r6.service) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.params, r6.params) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted + 1;
        im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logId, r6.logId) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logTime, r6.logTime) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.deviceId, r6.deviceId) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted + 17;
        im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if ((r6 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.clientVersion, r6.clientVersion) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.sessionId, r6.sessionId) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted + 25;
        im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if ((r6 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.network, r6.network) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.networkConnected, r6.networkConnected) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.osVersion, r6.osVersion) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback + 21;
        im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.company, r6.company) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.userNo, r6.userNo) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted + 87;
        im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fa, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.gaNo, r6.gaNo) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.installId, r6.installId) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0107, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.version, r6.version) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.bankDeviceSession, r6.bankDeviceSession) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0126, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.referrer, r6.referrer) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0132, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.locale, r6.locale)) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback + 105;
        im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0146, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.value, r6.value) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0148, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0149, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014a, code lost:
    
        r6 = im.toss.core.tracker.payload.AppEventPayloadV1.IAuthTabCallback + 11;
        im.toss.core.tracker.payload.AppEventPayloadV1.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r2 r4 r5 r6
      0x003f: PHI (r2v48 int) = (r2v5 int), (r2v50 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r6v3 java.util.Map<java.lang.String, java.lang.Object>) = (r6v0 java.util.Map<java.lang.String, java.lang.Object>), (r6v5 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r2 r4 r5
      0x003d: PHI (r2v6 int) = (r2v5 int), (r2v50 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        Map<String, Object> map;
        int iHashCode4;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            iHashCode = this.logName.hashCode();
            iHashCode2 = this.logType.hashCode();
            iHashCode3 = this.service.hashCode();
            map = this.params;
            if (map == null) {
                iHashCode4 = 0;
            } else {
                iHashCode4 = map.hashCode();
                int i5 = IAuthTabCallback + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            iHashCode = this.logName.hashCode();
            iHashCode2 = this.logType.hashCode();
            iHashCode3 = this.service.hashCode();
            map = this.params;
            if (map == null) {
            }
        }
        int iHashCode5 = this.logId.hashCode();
        int iHashCode6 = this.logTime.hashCode();
        int iHashCode7 = this.deviceId.hashCode();
        int iHashCode8 = this.clientVersion.hashCode();
        int iHashCode9 = this.sessionId.hashCode();
        int iHashCode10 = this.network.hashCode();
        int iHashCode11 = this.networkConnected.hashCode();
        int iHashCode12 = this.osVersion.hashCode();
        int iHashCode13 = this.company.hashCode();
        int iHashCode14 = this.userNo.hashCode();
        int iHashCode15 = this.gaNo.hashCode();
        Long l = this.installId;
        if (l == null) {
            i = iHashCode14;
            i2 = 0;
        } else {
            int iHashCode16 = l.hashCode();
            int i7 = onWarmupCompleted + 39;
            i = iHashCode14;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i2 = iHashCode16;
        }
        int iHashCode17 = this.version.hashCode();
        String str = this.bankDeviceSession;
        int iHashCode18 = str == null ? 0 : str.hashCode();
        Referrer referrer = this.referrer;
        int iHashCode19 = referrer == null ? 0 : referrer.hashCode();
        String str2 = this.locale;
        int iHashCode20 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.InterfaceC0059deInitialize
    public String onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppEventPayloadV1(logName=" + this.logName + ", logType=" + this.logType + ", service=" + this.service + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ", deviceId=" + this.deviceId + ", clientVersion=" + this.clientVersion + ", sessionId=" + this.sessionId + ", network=" + this.network + ", networkConnected=" + this.networkConnected + ", osVersion=" + this.osVersion + ", company=" + this.company + ", userNo=" + this.userNo + ", gaNo=" + this.gaNo + ", installId=" + this.installId + ", version=" + this.version + ", bankDeviceSession=" + this.bankDeviceSession + ", referrer=" + this.referrer + ", locale=" + this.locale + ", value=" + this.value + ")";
        int i2 = onWarmupCompleted + 107;
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

        public final KSerializer<AppEventPayloadV1> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppEventPayloadV1$$serializer appEventPayloadV1$$serializer = AppEventPayloadV1$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            return appEventPayloadV1$$serializer;
        }
    }

    static {
        asBinder = 1;
        ICustomTabsCallbackStub();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.payload.AppEventPayloadV1$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return AppEventPayloadV1.onExtraCallback();
                }
                AppEventPayloadV1.onExtraCallback();
                throw null;
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        int i = IAuthTabCallbackDefault + 83;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
    }

    public /* synthetic */ AppEventPayloadV1(int i, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, Referrer referrer, String str17, String str18, okycx okycxVar) throws Throwable {
        String interfaceDescriptor;
        Long lIAuthTabCallback_Parcel;
        String strIntern;
        Referrer referrerOnNavigationEvent;
        String strAccess000;
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, AppEventPayloadV1$$serializer.INSTANCE.getDescriptor());
        }
        this.logName = str;
        this.logType = str2;
        this.service = str3;
        this.params = map;
        this.logId = (i & 16) == 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault() : str4;
        this.logTime = (i & 32) == 0 ? GetFeatureExtension.onWarmupCompleted.asInterface() : str5;
        if ((i & 64) == 0) {
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.deviceId = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            this.deviceId = str6;
            int i4 = 2 % 2;
        }
        this.clientVersion = (i & 128) == 0 ? GetFeatureExtension.onWarmupCompleted.bx_() : str7;
        this.sessionId = (i & 256) == 0 ? GetFeatureExtension.onWarmupCompleted.onActivityLayout() : str8;
        this.network = (i & 512) == 0 ? GetFeatureExtension.onWarmupCompleted.writeTypedObject() : str9;
        this.networkConnected = (i & 1024) == 0 ? GetFeatureExtension.onWarmupCompleted.extraCallback() : str10;
        String str19 = null;
        if ((i & 2048) == 0) {
            int i5 = onWarmupCompleted + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                this.osVersion = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
                str19.hashCode();
                throw null;
            }
            this.osVersion = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback();
            int i6 = 2 % 2;
        } else {
            this.osVersion = str11;
        }
        this.company = (i & 4096) == 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str12;
        this.userNo = (i & 8192) == 0 ? GetFeatureExtension.onWarmupCompleted.onMessageChannelReady() : str13;
        int i7 = 2 % 2;
        if ((i & 16384) == 0) {
            int i8 = onWarmupCompleted + 89;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            interfaceDescriptor = GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor();
        } else {
            interfaceDescriptor = str14;
        }
        this.gaNo = interfaceDescriptor;
        int i10 = IAuthTabCallback;
        int i11 = i10 + 39;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        if ((32768 & i) == 0) {
            int i13 = i10 + 65;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            lIAuthTabCallback_Parcel = GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel();
        } else {
            lIAuthTabCallback_Parcel = l;
        }
        this.installId = lIAuthTabCallback_Parcel;
        int i15 = onWarmupCompleted + 59;
        IAuthTabCallback = i15 % 128;
        int i16 = i15 % 2;
        if ((65536 & i) == 0) {
            Object[] objArr = new Object[1];
            a((char) (44080 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-190576974) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{35200}, new char[]{44051, 19399, 3978, 13224}, new char[]{45719, 41990, 12276, 59564}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str15;
        }
        this.version = strIntern;
        this.bankDeviceSession = (131072 & i) == 0 ? GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(asBinder()) : str16;
        if ((262144 & i) == 0) {
            int i17 = IAuthTabCallback + 73;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 == 0) {
                AFj1nSDK5.onNavigationEvent.onNavigationEvent();
                str19.hashCode();
                throw null;
            }
            referrerOnNavigationEvent = AFj1nSDK5.onNavigationEvent.onNavigationEvent();
        } else {
            referrerOnNavigationEvent = referrer;
        }
        this.referrer = referrerOnNavigationEvent;
        if ((524288 & i) == 0) {
            int i18 = onWarmupCompleted + 51;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            strAccess000 = GetFeatureExtension.onWarmupCompleted.access000();
        } else {
            strAccess000 = str17;
        }
        this.locale = strAccess000;
        int i20 = onWarmupCompleted + 69;
        int i21 = i20 % 128;
        IAuthTabCallback = i21;
        if (i20 % 2 != 0) {
            str19.hashCode();
            throw null;
        }
        if ((i & 1048576) == 0) {
            int i22 = i21 + 23;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
        } else {
            str19 = str18;
        }
        this.value = str19;
    }

    public AppEventPayloadV1(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, ? extends Object> map, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @Nullable Long l, @NotNull String str15, @Nullable String str16, @Nullable Referrer referrer, @Nullable String str17, @Nullable String str18) {
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
        this.installId = l;
        this.version = str15;
        this.bankDeviceSession = str16;
        this.referrer = referrer;
        this.locale = str17;
        this.value = str18;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c0  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(AppEventPayloadV1 appEventPayloadV1, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, appEventPayloadV1.IAuthTabCallbackStubProxy());
        vylVar.onExtraCallback(serialDescriptor, 1, appEventPayloadV1.logType);
        vylVar.onExtraCallback(serialDescriptor, 2, appEventPayloadV1.service);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), appEventPayloadV1.extraCallbackWithResult());
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(appEventPayloadV1.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault());
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(appEventPayloadV1.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault())) {
                vylVar.onExtraCallback(serialDescriptor, 4, appEventPayloadV1.access100());
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(appEventPayloadV1.access000(), GetFeatureExtension.onWarmupCompleted.asInterface())) {
            vylVar.onExtraCallback(serialDescriptor, 5, appEventPayloadV1.access000());
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 95 / 0;
                if (!Intrinsics.areEqual(appEventPayloadV1.deviceId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault())) {
                    vylVar.onExtraCallback(serialDescriptor, 6, appEventPayloadV1.deviceId);
                }
            } else if (!Intrinsics.areEqual(appEventPayloadV1.deviceId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault())) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(appEventPayloadV1.clientVersion, GetFeatureExtension.onWarmupCompleted.bx_())) {
            vylVar.onExtraCallback(serialDescriptor, 7, appEventPayloadV1.clientVersion);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || !Intrinsics.areEqual(appEventPayloadV1.sessionId, GetFeatureExtension.onWarmupCompleted.onActivityLayout())) {
            vylVar.onExtraCallback(serialDescriptor, 8, appEventPayloadV1.sessionId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || !Intrinsics.areEqual(appEventPayloadV1.network, GetFeatureExtension.onWarmupCompleted.writeTypedObject())) {
            vylVar.onExtraCallback(serialDescriptor, 9, appEventPayloadV1.network);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(appEventPayloadV1.networkConnected, GetFeatureExtension.onWarmupCompleted.extraCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 10, appEventPayloadV1.networkConnected);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || !Intrinsics.areEqual(appEventPayloadV1.osVersion, GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback())) {
            vylVar.onExtraCallback(serialDescriptor, 11, appEventPayloadV1.osVersion);
            int i5 = onWarmupCompleted + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || !Intrinsics.areEqual(appEventPayloadV1.asBinder(), GetFeatureExtension.onWarmupCompleted.asBinder())) {
            vylVar.onExtraCallback(serialDescriptor, 12, appEventPayloadV1.asBinder());
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 13)) {
            int i7 = IAuthTabCallback + 109;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV1.userNo, GetFeatureExtension.onWarmupCompleted.onMessageChannelReady())) {
                vylVar.onExtraCallback(serialDescriptor, 13, appEventPayloadV1.userNo);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 14) || !Intrinsics.areEqual(appEventPayloadV1.gaNo, GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor())) {
            vylVar.onExtraCallback(serialDescriptor, 14, appEventPayloadV1.gaNo);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 15)) {
            int i9 = IAuthTabCallback + 83;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            if (!Intrinsics.areEqual(appEventPayloadV1.installId, GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel())) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 15, oty1.onExtraCallback, appEventPayloadV1.installId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 16)) {
            int i11 = onWarmupCompleted + 47;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                String strOnActivityLayout = appEventPayloadV1.onActivityLayout();
                Object[] objArr = new Object[1];
                a((char) (44127 % AndroidCharacter.getMirror('B')), (-190576973) % ExpandableListView.getPackedPositionChild(1L), new char[]{35200}, new char[]{44051, 19399, 3978, 13224}, new char[]{45719, 41990, 12276, 59564}, objArr);
                if (!Intrinsics.areEqual(strOnActivityLayout, ((String) objArr[0]).intern())) {
                    vylVar.onExtraCallback(serialDescriptor, 16, appEventPayloadV1.onActivityLayout());
                }
            } else {
                String strOnActivityLayout2 = appEventPayloadV1.onActivityLayout();
                Object[] objArr2 = new Object[1];
                a((char) (44127 - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionChild(0L) - 190576973, new char[]{35200}, new char[]{44051, 19399, 3978, 13224}, new char[]{45719, 41990, 12276, 59564}, objArr2);
                if (!Intrinsics.areEqual(strOnActivityLayout2, ((String) objArr2[0]).intern())) {
                }
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 17) || !Intrinsics.areEqual(appEventPayloadV1.bankDeviceSession, GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(appEventPayloadV1.asBinder()))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, appEventPayloadV1.bankDeviceSession);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 18)) {
            int i12 = onWarmupCompleted + 55;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 53 / 0;
                if (!Intrinsics.areEqual(appEventPayloadV1.referrer, AFj1nSDK5.onNavigationEvent.onNavigationEvent())) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 18, Referrer$$serializer.INSTANCE, appEventPayloadV1.referrer);
                }
            } else if (!Intrinsics.areEqual(appEventPayloadV1.referrer, AFj1nSDK5.onNavigationEvent.onNavigationEvent())) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 19) || !Intrinsics.areEqual(appEventPayloadV1.locale, GetFeatureExtension.onWarmupCompleted.access000())) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, appEventPayloadV1.locale);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 20)) {
            int i14 = IAuthTabCallback + 103;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                String str = appEventPayloadV1.value;
                obj.hashCode();
                throw null;
            }
            if (appEventPayloadV1.value == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, appEventPayloadV1.value);
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return lazyArr;
    }

    @Override // o.InterfaceC0059deInitialize
    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logName;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppEventPayloadV1 appEventPayloadV1 = (AppEventPayloadV1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = appEventPayloadV1.logType;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.service;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.params;
        int i5 = i3 + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventPayloadV1(String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, Referrer referrer, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String strAsInterface;
        String str19;
        String strBx_;
        String strOnActivityLayout;
        String strWriteTypedObject;
        String strAsBinder;
        Long lIAuthTabCallback_Parcel;
        String strIntern;
        int i2;
        String strAccess000;
        String str20;
        String strICustomTabsCallbackDefault = (i & 16) != 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault() : str4;
        if ((i & 32) != 0) {
            int i3 = 2 % 2;
            strAsInterface = GetFeatureExtension.onWarmupCompleted.asInterface();
        } else {
            strAsInterface = str5;
        }
        if ((i & 64) != 0) {
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strIAuthTabCallbackDefault = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackDefault();
            int i6 = IAuthTabCallback + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str19 = strIAuthTabCallbackDefault;
        } else {
            str19 = str6;
        }
        if ((i & 128) != 0) {
            int i9 = onWarmupCompleted + 97;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.bx_();
                throw null;
            }
            strBx_ = GetFeatureExtension.onWarmupCompleted.bx_();
        } else {
            strBx_ = str7;
        }
        if ((i & 256) != 0) {
            int i10 = IAuthTabCallback + 75;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            strOnActivityLayout = GetFeatureExtension.onWarmupCompleted.onActivityLayout();
        } else {
            strOnActivityLayout = str8;
        }
        if ((i & 512) != 0) {
            int i12 = IAuthTabCallback + 19;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                GetFeatureExtension.onWarmupCompleted.writeTypedObject();
                throw null;
            }
            int i13 = 2 % 2;
            strWriteTypedObject = GetFeatureExtension.onWarmupCompleted.writeTypedObject();
        } else {
            strWriteTypedObject = str9;
        }
        String strExtraCallback = (i & 1024) != 0 ? GetFeatureExtension.onWarmupCompleted.extraCallback() : str10;
        String strICustomTabsCallback = (i & 2048) != 0 ? GetFeatureExtension.onWarmupCompleted.ICustomTabsCallback() : str11;
        if ((i & 4096) != 0) {
            int i14 = onWarmupCompleted + 5;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asBinder();
                throw null;
            }
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            strAsBinder = str12;
        }
        String strOnMessageChannelReady = (i & 8192) != 0 ? GetFeatureExtension.onWarmupCompleted.onMessageChannelReady() : str13;
        String interfaceDescriptor = (i & 16384) != 0 ? GetFeatureExtension.onWarmupCompleted.getInterfaceDescriptor() : str14;
        if ((32768 & i) != 0) {
            int i15 = onWarmupCompleted + 53;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            lIAuthTabCallback_Parcel = GetFeatureExtension.onWarmupCompleted.IAuthTabCallback_Parcel();
        } else {
            lIAuthTabCallback_Parcel = l;
        }
        if ((65536 & i) != 0) {
            Object[] objArr = new Object[1];
            a((char) (44079 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) - 190576974, new char[]{35200}, new char[]{44051, 19399, 3978, 13224}, new char[]{45719, 41990, 12276, 59564}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str15;
        }
        String strOnExtraCallbackWithResult = (131072 & i) != 0 ? GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(strAsBinder) : str16;
        Referrer referrerOnNavigationEvent = (262144 & i) != 0 ? AFj1nSDK5.onNavigationEvent.onNavigationEvent() : referrer;
        if ((524288 & i) != 0) {
            i2 = 2;
            int i17 = 2 % 2;
            strAccess000 = GetFeatureExtension.onWarmupCompleted.access000();
        } else {
            i2 = 2;
            strAccess000 = str17;
        }
        if ((i & 1048576) != 0) {
            int i18 = i2 % i2;
            str20 = null;
        } else {
            str20 = str18;
        }
        this(str, str2, str3, map, strICustomTabsCallbackDefault, strAsInterface, str19, strBx_, strOnActivityLayout, strWriteTypedObject, strExtraCallback, strICustomTabsCallback, strAsBinder, strOnMessageChannelReady, interfaceDescriptor, lIAuthTabCallback_Parcel, strIntern, strOnExtraCallbackWithResult, referrerOnNavigationEvent, strAccess000, str20);
    }

    @Override // o.InterfaceC0059deInitialize
    public String access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.logId;
        int i4 = i3 + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logTime;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AppEventPayloadV1 appEventPayloadV1 = (AppEventPayloadV1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = appEventPayloadV1.deviceId;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.clientVersion;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sessionId;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.network;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppEventPayloadV1 appEventPayloadV1 = (AppEventPayloadV1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = appEventPayloadV1.networkConnected;
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.osVersion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.company;
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.gaNo;
        int i4 = i3 + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.installId;
        }
        throw null;
    }

    public String onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.version;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankDeviceSession;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Referrer ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Referrer referrer = this.referrer;
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return referrer;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.locale;
        }
        throw null;
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return "logitems";
    }

    @Override // o.Deinitialize
    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outputStream, "");
        try {
            AppEventPayloadV1 appEventPayloadV1OnExtraCallback = onExtraCallback(this, null, null, null, checkValidYaw.onExtraCallback(extraCallbackWithResult(), onActivityLayout()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097143, null);
            wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), appEventPayloadV1OnExtraCallback, outputStream);
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // o.Deinitialize
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = access000() + access100() + ".json";
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 43 - View.resolveSizeAndState(0, 0, 0), 1451 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getSize(0)), 43 - ExpandableListView.getPackedPositionChild(0L), 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 23972), 50 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 45848), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (Process.myPid() >> 22) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallbackDefault() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (KSerializer) onWarmupCompleted(-448826220, ICustomTabsCallbackStubProxy.onExtraCallback(), 448826223, iOnExtraCallback, iOnExtraCallback2, new Object[0], iOnExtraCallback3);
    }

    public final String onTransact() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (String) onWarmupCompleted(-1481442239, ICustomTabsCallbackStubProxy.onExtraCallback(), 1481442240, iOnExtraCallback, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback3);
    }

    public final String getInterfaceDescriptor() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (String) onWarmupCompleted(613465596, ICustomTabsCallbackStubProxy.onExtraCallback(), -613465594, iOnExtraCallback, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback3);
    }

    public final String writeTypedObject() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (String) onWarmupCompleted(1216738448, ICustomTabsCallbackStubProxy.onExtraCallback(), -1216738448, iOnExtraCallback, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback3);
    }

    static void ICustomTabsCallbackStub() {
        onNavigationEvent = 6886570889914533864L;
        onExtraCallbackWithResult = -1776194565;
        onExtraCallback = (char) 27643;
    }
}
