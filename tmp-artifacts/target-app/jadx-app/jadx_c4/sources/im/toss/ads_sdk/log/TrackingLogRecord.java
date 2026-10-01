package im.toss.ads_sdk.log;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o._string;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TrackingLogRecord {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean attachTossHeaders;
    private final long createdAt;
    private final String creativeId;
    private final String httpMethod;
    private final String id;
    private final String itemKey;
    private final String logType;
    private final String payload;
    private final String requestBodyJson;
    private final String requestId;
    private final int retryCount;
    private final String slotId;
    private final List<String> urls;

    public static /* synthetic */ TrackingLogRecord IAuthTabCallback(TrackingLogRecord trackingLogRecord, String str, String str2, List list, String str3, String str4, long j, String str5, int i, String str6, String str7, String str8, String str9, boolean z, int i2, Object obj) {
        List list2;
        String str10;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 65;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        String str11 = (i4 % 2 == 0 && (i2 & 1) != 0) ? trackingLogRecord.id : str;
        String str12 = (i2 & 2) != 0 ? trackingLogRecord.requestId : str2;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 43;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                List<String> list3 = trackingLogRecord.urls;
                throw null;
            }
            list2 = trackingLogRecord.urls;
        } else {
            list2 = list;
        }
        String str13 = (i2 & 8) != 0 ? trackingLogRecord.payload : str3;
        String str14 = (i2 & 16) != 0 ? trackingLogRecord.logType : str4;
        long j2 = (i2 & 32) != 0 ? trackingLogRecord.createdAt : j;
        String str15 = (i2 & 64) != 0 ? trackingLogRecord.requestBodyJson : str5;
        int i7 = (i2 & 128) != 0 ? trackingLogRecord.retryCount : i;
        String str16 = (i2 & 256) != 0 ? trackingLogRecord.itemKey : str6;
        String str17 = (i2 & 512) != 0 ? trackingLogRecord.httpMethod : str7;
        String str18 = (i2 & 1024) != 0 ? trackingLogRecord.creativeId : str8;
        String str19 = (i2 & 2048) != 0 ? trackingLogRecord.slotId : str9;
        if ((i2 & 4096) != 0) {
            int i8 = i5 + 33;
            str10 = str19;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            z2 = trackingLogRecord.attachTossHeaders;
            int i10 = i5 + 13;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str10 = str19;
            z2 = z;
        }
        return (TrackingLogRecord) IAuthTabCallback(new Object[]{trackingLogRecord, str11, str12, list2, str13, str14, Long.valueOf(j2), str15, Integer.valueOf(i7), str16, str17, str18, str10, Boolean.valueOf(z2)}, _string.onNavigationEvent.IAuthTabCallback(), -49155697, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 49155697);
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i6;
        int i13 = ~(i12 | i2);
        int i14 = (~(i5 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i6 + i2 + i4 + (1650861130 * i) + ((-924421097) * i3);
        int i16 = i15 * i15;
        int i17 = (i6 * (-405912681)) + 1474035712 + ((-405912681) * i2) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i4) + (986710016 * i) + ((-948436992) * i3) + ((-1864630272) * i16);
        int i18 = ((i6 * (-959335331)) - 587927435) + (i2 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i4 * (-959334869)) + (i * 22983790) + (i3 * 637852125) + (i16 * (-1124859904));
        int i19 = i17 + (i18 * i18 * (-1807482880));
        return i19 != 1 ? i19 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer interfaceDescriptor = getInterfaceDescriptor();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        List list = (List) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        String str5 = (String) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        String str6 = (String) objArr[9];
        String str7 = (String) objArr[10];
        String str8 = (String) objArr[11];
        String str9 = (String) objArr[12];
        boolean zBooleanValue = ((Boolean) objArr[13]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        TrackingLogRecord trackingLogRecord = new TrackingLogRecord(str, str2, list, str3, str4, jLongValue, str5, iIntValue, str6, str7, str8, str9, zBooleanValue);
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return trackingLogRecord;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingLogRecord)) {
            return false;
        }
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) obj;
        if (!Intrinsics.areEqual(this.id, trackingLogRecord.id) || !Intrinsics.areEqual(this.requestId, trackingLogRecord.requestId) || (!Intrinsics.areEqual(this.urls, trackingLogRecord.urls)) || !Intrinsics.areEqual(this.payload, trackingLogRecord.payload) || !Intrinsics.areEqual(this.logType, trackingLogRecord.logType) || this.createdAt != trackingLogRecord.createdAt || !Intrinsics.areEqual(this.requestBodyJson, trackingLogRecord.requestBodyJson) || this.retryCount != trackingLogRecord.retryCount || !Intrinsics.areEqual(this.itemKey, trackingLogRecord.itemKey) || !Intrinsics.areEqual(this.httpMethod, trackingLogRecord.httpMethod) || !Intrinsics.areEqual(this.creativeId, trackingLogRecord.creativeId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.slotId, trackingLogRecord.slotId)) {
            int i3 = onExtraCallback + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.attachTossHeaders == trackingLogRecord.attachTossHeaders) {
            return true;
        }
        int i5 = IAuthTabCallback + 119;
        onExtraCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.requestId.hashCode();
        int iHashCode4 = this.urls.hashCode();
        int iHashCode5 = this.payload.hashCode();
        int iHashCode6 = this.logType.hashCode();
        int iHashCode7 = Long.hashCode(this.createdAt);
        String str = this.requestBodyJson;
        int iHashCode8 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode9 = Integer.hashCode(this.retryCount);
        String str2 = this.itemKey;
        if (str2 != null) {
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode8 = str2.hashCode();
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode8) * 31) + this.httpMethod.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.slotId.hashCode()) * 31) + Boolean.hashCode(this.attachTossHeaders);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackingLogRecord(id=" + this.id + ", requestId=" + this.requestId + ", urls=" + this.urls + ", payload=" + this.payload + ", logType=" + this.logType + ", createdAt=" + this.createdAt + ", requestBodyJson=" + this.requestBodyJson + ", retryCount=" + this.retryCount + ", itemKey=" + this.itemKey + ", httpMethod=" + this.httpMethod + ", creativeId=" + this.creativeId + ", slotId=" + this.slotId + ", attachTossHeaders=" + this.attachTossHeaders + ")";
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TrackingLogRecord(int i, String str, String str2, List list, String str3, String str4, long j, String str5, int i2, String str6, String str7, String str8, String str9, boolean z, okycx okycxVar) throws Throwable {
        String strIntern;
        if (63 != (i & 63)) {
            htf31.onExtraCallbackWithResult(i, 63, TrackingLogRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.requestId = str2;
        this.urls = list;
        this.payload = str3;
        this.logType = str4;
        this.createdAt = j;
        Object obj = null;
        if ((i & 64) == 0) {
            this.requestBodyJson = null;
        } else {
            this.requestBodyJson = str5;
        }
        if ((i & 128) == 0) {
            this.retryCount = 0;
        } else {
            this.retryCount = i2;
        }
        if ((i & 256) == 0) {
            this.itemKey = null;
        } else {
            this.itemKey = str6;
        }
        boolean z2 = true;
        if ((i & 512) == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{62261, 32443, 59412, 23426}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36240, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str7;
        }
        this.httpMethod = strIntern;
        if ((i & 1024) == 0) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.creativeId = "";
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.creativeId = str8;
        }
        int i5 = 2 % 2;
        if ((i & 2048) == 0) {
            this.slotId = "";
            int i6 = IAuthTabCallback + 25;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
            }
            if ((i & 4096) != 0) {
                int i7 = IAuthTabCallback + 49;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } else {
                z2 = z;
            }
            this.attachTossHeaders = z2;
        }
        this.slotId = str9;
        int i10 = 2 % 2;
        if ((i & 4096) != 0) {
        }
        this.attachTossHeaders = z2;
    }

    public TrackingLogRecord(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, long j, @Nullable String str5, int i, @Nullable String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.id = str;
        this.requestId = str2;
        this.urls = list;
        this.payload = str3;
        this.logType = str4;
        this.createdAt = j;
        this.requestBodyJson = str5;
        this.retryCount = i;
        this.itemKey = str6;
        this.httpMethod = str7;
        this.creativeId = str8;
        this.slotId = str9;
        this.attachTossHeaders = z;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0043  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TrackingLogRecord trackingLogRecord, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, trackingLogRecord.id);
        vylVar.onExtraCallback(serialDescriptor, 1, trackingLogRecord.requestId);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), trackingLogRecord.urls);
        vylVar.onExtraCallback(serialDescriptor, 3, trackingLogRecord.payload);
        vylVar.onExtraCallback(serialDescriptor, 4, trackingLogRecord.logType);
        vylVar.onExtraCallback(serialDescriptor, 5, trackingLogRecord.createdAt);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (trackingLogRecord.requestBodyJson != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, trackingLogRecord.requestBodyJson);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || trackingLogRecord.retryCount != 0) {
            vylVar.onExtraCallback(serialDescriptor, 7, trackingLogRecord.retryCount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || trackingLogRecord.itemKey != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, trackingLogRecord.itemKey);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            String str = trackingLogRecord.httpMethod;
            Object[] objArr = new Object[1];
            a(new char[]{62261, 32443, 59412, 23426}, 36241 - Color.blue(0), objArr);
            if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                vylVar.onExtraCallback(serialDescriptor, 9, trackingLogRecord.httpMethod);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(trackingLogRecord.creativeId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 10, trackingLogRecord.creativeId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
                if (!Intrinsics.areEqual(trackingLogRecord.slotId, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 11, trackingLogRecord.slotId);
                }
            } else if (!Intrinsics.areEqual(trackingLogRecord.slotId, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 12)) {
            int i6 = IAuthTabCallback + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            boolean z = trackingLogRecord.attachTossHeaders;
            if (i7 == 0) {
                if (!z) {
                    return;
                }
            } else if (z) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 12, trackingLogRecord.attachTossHeaders);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackingLogRecord(String str, String str2, List list, String str3, String str4, long j, String str5, int i, String str6, String str7, String str8, String str9, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Object obj = null;
        if ((i2 & 64) != 0) {
            int i3 = IAuthTabCallback + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str10 = null;
        } else {
            str10 = str5;
        }
        int i4 = (i2 & 128) != 0 ? 0 : i;
        if ((i2 & 256) != 0) {
            int i5 = onExtraCallback;
            int i6 = i5 + 87;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = i5 + 29;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 4;
            } else {
                int i9 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str6;
        }
        if ((i2 & 512) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{62261, 32443, 59412, 23426}, 36241 - View.getDefaultSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i10 = onExtraCallback + 67;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            str12 = strIntern;
        } else {
            str12 = str7;
        }
        if ((i2 & 1024) != 0) {
            int i12 = 2 % 2;
            str13 = "";
        } else {
            str13 = str8;
        }
        if ((i2 & 2048) != 0) {
            int i13 = 2 % 2;
            str14 = "";
        } else {
            str14 = str9;
        }
        this(str, str2, list, str3, str4, j, str10, i4, str11, str12, str13, str14, (i2 & 4096) != 0 ? true : z);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestId;
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.urls;
        int i4 = i2 + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.payload;
            int i4 = 81 / 0;
        } else {
            str = this.payload;
        }
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.logType;
        int i4 = i2 + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.createdAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.requestBodyJson;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = trackingLogRecord.retryCount;
        int i6 = i3 + 73;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.httpMethod;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.attachTossHeaders;
        int i4 = i3 + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TrackingLogRecord trackingLogRecord = (TrackingLogRecord) objArr[0];
        int i = 2 % 2;
        String str = trackingLogRecord.requestId;
        String str2 = trackingLogRecord.slotId;
        String str3 = trackingLogRecord.creativeId;
        String str4 = trackingLogRecord.itemKey;
        if (str4 == null) {
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str4 = "";
        }
        String str5 = trackingLogRecord.httpMethod;
        boolean z = trackingLogRecord.attachTossHeaders;
        String str6 = trackingLogRecord.requestBodyJson;
        if (str6 == null) {
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                str6 = trackingLogRecord.payload;
                int i5 = 37 / 0;
            } else {
                str6 = trackingLogRecord.payload;
            }
        }
        String str7 = str + ":" + str2 + ":" + str3 + ":" + str4 + ":" + str5 + ":" + z + ":" + str6 + ":" + trackingLogRecord.logType;
        int i6 = onExtraCallback + 89;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return str7;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrackingLogRecord> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TrackingLogRecord$$serializer trackingLogRecord$$serializer = TrackingLogRecord$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return trackingLogRecord$$serializer;
        }
    }

    static {
        IAuthTabCallback_Parcel();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.log.TrackingLogRecord$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = TrackingLogRecord.onExtraCallback();
                int i4 = onNavigationEvent + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, null, null, null, null, null, null, null, null, null};
        int i = onNavigationEvent + 119;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 19627 - (ViewConfiguration.getTouchSlop() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (5407414049857832247L | onExtraCallbackWithResult);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), ExpandableListView.getPackedPositionChild(0L) + 60, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSize(0, 0) + 24, 19627 - View.resolveSize(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onExtraCallbackWithResult);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 59, View.combineMeasuredStates(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 59 - View.resolveSize(0, 0), (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 59 - View.resolveSize(0, 0), 6383 - Gravity.getAbsoluteGravity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    public final TrackingLogRecord onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, long j, @Nullable String str5, int i, @Nullable String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z) {
        Object[] objArr = {this, str, str2, list, str3, str4, Long.valueOf(j), str5, Integer.valueOf(i), str6, str7, str8, str9, Boolean.valueOf(z)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (TrackingLogRecord) IAuthTabCallback(objArr, _string.onNavigationEvent.IAuthTabCallback(), -49155697, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 49155697);
    }

    public final String onExtraCallbackWithResult() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (String) IAuthTabCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), 928218804, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -928218802);
    }

    public final int access100() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return ((Integer) IAuthTabCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), 239726099, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -239726098)).intValue();
    }

    static void IAuthTabCallback_Parcel() {
        onExtraCallbackWithResult = 7834691985296750162L;
    }
}
