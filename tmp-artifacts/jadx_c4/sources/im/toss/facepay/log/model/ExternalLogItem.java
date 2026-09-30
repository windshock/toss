package im.toss.facepay.log.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.facepay.log.model.ExternalLogItem$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.encryptType4;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExternalLogItem {
    public static final Companion Companion;
    private static int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String action;
    private final String appId;
    private final String appVersion;
    private final JsonObject clientMetadata;
    private final String deviceModel;
    private final JsonObject extParam1;
    private final JsonObject extParam2;
    private final JsonObject extParam3;
    private final String feature;
    private final long merchantId;
    private final String offPayPartnerCode;
    private final String os;
    private final String osVersion;
    private final String resultCode;
    private final String resultMessage;
    private final String sdkVersion;
    private final long sequence;
    private final String service;
    private final String source;
    private final String specifyId;
    private final String status;
    private final String step;
    private final String subTransactionId;
    private final String successYn;
    private final long time;
    private final String transactionId;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2;
        int i3 = 1 - (b * 2);
        byte[] bArr = $$a;
        int i4 = (s2 * 2) + 4;
        int i5 = 105 - (s * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i3;
            i5 = (-i5) + i7;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i4];
            int i8 = i4;
            i7 = i5;
            i5 = b2;
            i6 = i8;
            i5 = (-i5) + i7;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        ICustomTabsCallbackStubProxy();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = (~(i4 | i3)) | i8;
        int i10 = (~(i3 | (~i))) | (~((~i4) | i7)) | i8;
        int i11 = i7 | i4 | i;
        int i12 = i4 + i + i2 + (1050315579 * i6) + (2086215248 * i5);
        int i13 = i12 * i12;
        int i14 = (i4 * (-1156115713)) + 1671168000 + ((-1156115713) * i) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i2) + ((-1303117824) * i6) + (314572800 * i5) + (431423488 * i13);
        int i15 = ((i4 * (-961373039)) - 1316831794) + (i * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i2 * (-961372049)) + (i6 * 755842709) + (i5 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? i16 != 4 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        ExternalLogItem externalLogItem = (ExternalLogItem) objArr[0];
        int i17 = 2 % 2;
        int i18 = onExtraCallback;
        int i19 = i18 + 27;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        String str = externalLogItem.os;
        int i21 = i18 + 105;
        IAuthTabCallbackStub = i21 % 128;
        int i22 = i21 % 2;
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 11;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof ExternalLogItem)) {
            int i3 = IAuthTabCallbackStub + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ExternalLogItem externalLogItem = (ExternalLogItem) obj;
        if (!Intrinsics.areEqual(this.specifyId, externalLogItem.specifyId)) {
            int i5 = IAuthTabCallbackStub + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.merchantId != externalLogItem.merchantId || this.time != externalLogItem.time || this.sequence != externalLogItem.sequence || !Intrinsics.areEqual(this.transactionId, externalLogItem.transactionId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTransactionId, externalLogItem.subTransactionId)) {
            int i6 = IAuthTabCallbackStub + 55;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.service, externalLogItem.service) || !Intrinsics.areEqual(this.offPayPartnerCode, externalLogItem.offPayPartnerCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.feature, externalLogItem.feature)) {
            int i8 = IAuthTabCallbackStub + 63;
            onExtraCallback = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.action, externalLogItem.action) || (!Intrinsics.areEqual(this.step, externalLogItem.step)) || !Intrinsics.areEqual(this.status, externalLogItem.status) || !Intrinsics.areEqual(this.successYn, externalLogItem.successYn) || !Intrinsics.areEqual(this.resultCode, externalLogItem.resultCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.resultMessage, externalLogItem.resultMessage)) {
            int i9 = IAuthTabCallbackStub + 11;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.extParam1, externalLogItem.extParam1) || !Intrinsics.areEqual(this.extParam2, externalLogItem.extParam2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.extParam3, externalLogItem.extParam3)) {
            int i11 = onExtraCallback + 11;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceModel, externalLogItem.deviceModel)) {
            int i13 = IAuthTabCallbackStub + 103;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.source, externalLogItem.source) || !Intrinsics.areEqual(this.os, externalLogItem.os)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.osVersion, externalLogItem.osVersion)) {
            int i15 = onExtraCallback + 3;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.appId, externalLogItem.appId) || !Intrinsics.areEqual(this.appVersion, externalLogItem.appVersion) || !Intrinsics.areEqual(this.clientMetadata, externalLogItem.clientMetadata)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sdkVersion, externalLogItem.sdkVersion)) {
            return true;
        }
        int i17 = onExtraCallback + 57;
        IAuthTabCallbackStub = i17 % 128;
        return i17 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.specifyId.hashCode();
        int iHashCode3 = Long.hashCode(this.merchantId);
        int iHashCode4 = Long.hashCode(this.time);
        int iHashCode5 = Long.hashCode(this.sequence);
        int iHashCode6 = this.transactionId.hashCode();
        String str = this.subTransactionId;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.service.hashCode();
        String str2 = this.offPayPartnerCode;
        if (str2 == null) {
            int i2 = IAuthTabCallbackStub + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iHashCode9 = this.feature.hashCode();
        int iHashCode10 = this.action.hashCode();
        int iHashCode11 = this.step.hashCode();
        int iHashCode12 = this.status.hashCode();
        String str3 = this.successYn;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        int iHashCode14 = this.resultCode.hashCode();
        int iHashCode15 = this.resultMessage.hashCode();
        int iHashCode16 = this.extParam1.hashCode();
        JsonObject jsonObject = this.extParam2;
        int iHashCode17 = jsonObject == null ? 0 : jsonObject.hashCode();
        JsonObject jsonObject2 = this.extParam3;
        int iHashCode18 = (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (jsonObject2 != null ? jsonObject2.hashCode() : 0)) * 31) + this.deviceModel.hashCode()) * 31) + this.source.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.clientMetadata.hashCode()) * 31) + this.sdkVersion.hashCode();
        int i4 = IAuthTabCallbackStub + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode18;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.specifyId;
        long j = this.merchantId;
        long j2 = this.time;
        long j3 = this.sequence;
        String str2 = this.transactionId;
        String str3 = this.subTransactionId;
        String str4 = this.service;
        String str5 = this.offPayPartnerCode;
        String str6 = this.feature;
        String str7 = this.action;
        String str8 = this.step;
        String str9 = this.status;
        String str10 = this.successYn;
        String str11 = this.resultCode;
        String str12 = this.resultMessage;
        JsonObject jsonObject = this.extParam1;
        JsonObject jsonObject2 = this.extParam2;
        JsonObject jsonObject3 = this.extParam3;
        String str13 = this.deviceModel;
        String str14 = this.source;
        String str15 = this.os;
        String str16 = this.osVersion;
        String str17 = this.appId;
        String str18 = this.appVersion;
        JsonObject jsonObject4 = this.clientMetadata;
        String str19 = this.sdkVersion;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{414896237, -1802494338, -948168554, -721510665, -51681274, 2100793138, 1178949832, -1328956025, 558813173, 1207201440, 1596502057, 201000007, 372334944, 2011403014}, 26 - TextUtils.getTrimmedLength(""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        b(11 - ExpandableListView.getPackedPositionType(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, new char[]{65520, 27, 21, '\b', 15, '\n', 25, '\f', 20, 65479, 65491, 65508, 11}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 137, true, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(j);
        Object[] objArr3 = new Object[1];
        b(2 - ExpandableListView.getPackedPositionGroup(0L), 7 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65487, 65499, 65516, 20, 28, 24, '#'}, 131 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(j2);
        Object[] objArr4 = new Object[1];
        a(new int[]{1849026722, 10709776, 424503052, -1226762921, -243541035, 1764865525}, 11 - ExpandableListView.getPackedPositionType(0L), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(j3);
        Object[] objArr5 = new Object[1];
        a(new int[]{-223211552, -1254205235, -924570353, 1174209476, 325900056, 1455917557, 1220121163, -762753487}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str2);
        Object[] objArr6 = new Object[1];
        b(16 - KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, new char[]{23, 4, 65526, 20, 3, 16, 21, 3, 5, 22, 11, 17, 16, 65515, 6, 65503, 65486, 65474, 21}, View.resolveSize(0, 0) + 143, false, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str3);
        Object[] objArr7 = new Object[1];
        a(new int[]{1849026722, 10709776, -881644920, -321162323, -52842671, 2145543224}, TextUtils.indexOf("", "", 0) + 10, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str4);
        Object[] objArr8 = new Object[1];
        b(18 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 20, new char[]{'\b', 7, 18, 65510, 21, '\b', 17, 23, 21, 4, 65523, 28, 4, 65523, '\t', '\t', 18, 65475, 65487, 65504}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 142, true, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(str5);
        Object[] objArr9 = new Object[1];
        a(new int[]{-1098265111, 2022423301, -496847795, 1934844273, -52842671, 2145543224}, ExpandableListView.getPackedPositionType(0L) + 10, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(str6);
        Object[] objArr10 = new Object[1];
        a(new int[]{1836537558, -1012582326, -1680466340, 373348590, -670136547, -1144775466}, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(str7);
        Object[] objArr11 = new Object[1];
        a(new int[]{-2061091140, -348619481, 1758581773, -116771038}, 7 - View.resolveSize(0, 0), objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(str8);
        Object[] objArr12 = new Object[1];
        b(MotionEvent.axisFromString("") + 7, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, new char[]{26, 7, 26, 27, 25, 65507, 65490, 65478, 25}, Process.getGidForName("") + 140, false, objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(str9);
        Object[] objArr13 = new Object[1];
        b(9 - ExpandableListView.getPackedPositionChild(0L), Color.blue(0) + 12, new char[]{65534, 24, 24, '\n', '\b', '\b', 26, 24, 65477, 65489, 65506, 19}, 140 - View.getDefaultSize(0, 0), true, objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(str10);
        Object[] objArr14 = new Object[1];
        a(new int[]{-1154156536, -1306986081, -1523256094, -1517444574, 126828797, -441432669, -670136547, -1144775466}, 13 - View.combineMeasuredStates(0, 0), objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(str11);
        Object[] objArr15 = new Object[1];
        b(3 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 16, new char[]{20, 65474, 65486, 65503, 7, '\t', 3, 21, 21, 7, 65519, 22, 14, 23, 21, 7}, 143 - TextUtils.getOffsetAfter("", 0), true, objArr15);
        sb.append(((String) objArr15[0]).intern());
        sb.append(str12);
        Object[] objArr16 = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{'\f', 65531, 31, '#', 16, 65483, 65495, 65512, 65500, 24, '\f', 29}, 134 - (Process.myTid() >> 22), true, objArr16);
        sb.append(((String) objArr16[0]).intern());
        sb.append(jsonObject);
        Object[] objArr17 = new Object[1];
        a(new int[]{685229053, -38373683, 1704377906, 1209275294, 152663836, 738573987}, 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr17);
        sb.append(((String) objArr17[0]).intern());
        sb.append(jsonObject2);
        Object[] objArr18 = new Object[1];
        a(new int[]{685229053, -38373683, 1704377906, 1209275294, -984036667, -1831995516}, 12 - View.MeasureSpec.getSize(0), objArr18);
        sb.append(((String) objArr18[0]).intern());
        sb.append(jsonObject3);
        Object[] objArr19 = new Object[1];
        a(new int[]{-1194612803, 1669039490, -1057676438, -27739980, -1565688548, 1841954982, -906137174, 551336865}, 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr19);
        sb.append(((String) objArr19[0]).intern());
        sb.append(str13);
        Object[] objArr20 = new Object[1];
        b(6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, new char[]{29, 23, 27, 65480, 65492, 65509, '\r', 11, 26}, 137 - (ViewConfiguration.getTapTimeout() >> 16), true, objArr20);
        sb.append(((String) objArr20[0]).intern());
        sb.append(str14);
        Object[] objArr21 = new Object[1];
        b(View.MeasureSpec.makeMeasureSpec(0, 0) + 5, 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{65525, '+', '\'', 65496, 65508}, ExpandableListView.getPackedPositionGroup(0L) + 121, true, objArr21);
        sb.append(((String) objArr21[0]).intern());
        sb.append(str15);
        Object[] objArr22 = new Object[1];
        a(new int[]{-1035036014, 2040241391, -347950845, -814728175, 783303717, -677970926}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, objArr22);
        sb.append(((String) objArr22[0]).intern());
        sb.append(str16);
        Object[] objArr23 = new Object[1];
        a(new int[]{26071085, 310184592, -1818155077, -47256396}, 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr23);
        sb.append(((String) objArr23[0]).intern());
        sb.append(str17);
        Object[] objArr24 = new Object[1];
        a(new int[]{26071085, 310184592, 383986670, 1503884036, 581227699, 727739100, -670136547, -1144775466}, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr24);
        sb.append(((String) objArr24[0]).intern());
        sb.append(str18);
        Object[] objArr25 = new Object[1];
        a(new int[]{290295873, -1172879276, -1618755901, -1277991581, 2082010067, -1951153245, 763203803, -2078946091, -670136547, -1144775466}, Color.argb(0, 0, 0, 0) + 17, objArr25);
        sb.append(((String) objArr25[0]).intern());
        sb.append(jsonObject4);
        Object[] objArr26 = new Object[1];
        a(new int[]{-1391034954, 1212169589, 28790779, -263454684, 581227699, 727739100, -670136547, -1144775466}, View.getDefaultSize(0, 0) + 13, objArr26);
        sb.append(((String) objArr26[0]).intern());
        sb.append(str19);
        Object[] objArr27 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{0}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 90, true, objArr27);
        sb.append(((String) objArr27[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallback + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExternalLogItem> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ExternalLogItem$.serializer serializerVar = ExternalLogItem$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ ExternalLogItem(int i, String str, long j, long j2, long j3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, String str13, String str14, String str15, String str16, String str17, String str18, JsonObject jsonObject4, String str19, okycx okycxVar) {
        if (67108863 != (i & 67108863)) {
            int i2 = IAuthTabCallbackStub + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 67108863, ExternalLogItem$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 37;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.specifyId = str;
        this.merchantId = j;
        this.time = j2;
        this.sequence = j3;
        this.transactionId = str2;
        this.subTransactionId = str3;
        this.service = str4;
        this.offPayPartnerCode = str5;
        this.feature = str6;
        this.action = str7;
        this.step = str8;
        this.status = str9;
        this.successYn = str10;
        this.resultCode = str11;
        this.resultMessage = str12;
        this.extParam1 = jsonObject;
        this.extParam2 = jsonObject2;
        this.extParam3 = jsonObject3;
        this.deviceModel = str13;
        this.source = str14;
        this.os = str15;
        this.osVersion = str16;
        this.appId = str17;
        this.appVersion = str18;
        this.clientMetadata = jsonObject4;
        this.sdkVersion = str19;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ExternalLogItem externalLogItem = (ExternalLogItem) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, externalLogItem.specifyId);
        vylVar.onExtraCallback(serialDescriptor, 1, externalLogItem.merchantId);
        vylVar.onExtraCallback(serialDescriptor, 2, externalLogItem.time);
        vylVar.onExtraCallback(serialDescriptor, 3, externalLogItem.sequence);
        vylVar.onExtraCallback(serialDescriptor, 4, externalLogItem.transactionId);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, externalLogItem.subTransactionId);
        vylVar.onExtraCallback(serialDescriptor, 6, externalLogItem.service);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, externalLogItem.offPayPartnerCode);
        vylVar.onExtraCallback(serialDescriptor, 8, externalLogItem.feature);
        vylVar.onExtraCallback(serialDescriptor, 9, externalLogItem.action);
        vylVar.onExtraCallback(serialDescriptor, 10, externalLogItem.step);
        vylVar.onExtraCallback(serialDescriptor, 11, externalLogItem.status);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, externalLogItem.successYn);
        vylVar.onExtraCallback(serialDescriptor, 13, externalLogItem.resultCode);
        vylVar.onExtraCallback(serialDescriptor, 14, externalLogItem.resultMessage);
        encryptType4 encrypttype4 = encryptType4.IAuthTabCallback;
        vylVar.onNavigationEvent(serialDescriptor, 15, encrypttype4, externalLogItem.extParam1);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 16, encrypttype4, externalLogItem.extParam2);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 17, encrypttype4, externalLogItem.extParam3);
        vylVar.onExtraCallback(serialDescriptor, 18, externalLogItem.deviceModel);
        vylVar.onExtraCallback(serialDescriptor, 19, externalLogItem.source);
        vylVar.onExtraCallback(serialDescriptor, 20, externalLogItem.os);
        vylVar.onExtraCallback(serialDescriptor, 21, externalLogItem.osVersion);
        vylVar.onExtraCallback(serialDescriptor, 22, externalLogItem.appId);
        vylVar.onExtraCallback(serialDescriptor, 23, externalLogItem.appVersion);
        vylVar.onNavigationEvent(serialDescriptor, 24, encrypttype4, externalLogItem.clientMetadata);
        vylVar.onExtraCallback(serialDescriptor, 25, externalLogItem.sdkVersion);
        int i4 = IAuthTabCallbackStub + 75;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public ExternalLogItem(@NotNull String str, long j, long j2, long j3, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10, @NotNull String str11, @NotNull String str12, @NotNull JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable JsonObject jsonObject3, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull JsonObject jsonObject4, @NotNull String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(jsonObject4, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.specifyId = str;
        this.merchantId = j;
        this.time = j2;
        this.sequence = j3;
        this.transactionId = str2;
        this.subTransactionId = str3;
        this.service = str4;
        this.offPayPartnerCode = str5;
        this.feature = str6;
        this.action = str7;
        this.step = str8;
        this.status = str9;
        this.successYn = str10;
        this.resultCode = str11;
        this.resultMessage = str12;
        this.extParam1 = jsonObject;
        this.extParam2 = jsonObject2;
        this.extParam3 = jsonObject3;
        this.deviceModel = str13;
        this.source = str14;
        this.os = str15;
        this.osVersion = str16;
        this.appId = str17;
        this.appVersion = str18;
        this.clientMetadata = jsonObject4;
        this.sdkVersion = str19;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.specifyId;
        int i5 = i3 + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ExternalLogItem externalLogItem = (ExternalLogItem) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            long j = externalLogItem.merchantId;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = externalLogItem.merchantId;
        int i4 = i2 + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.time;
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.sequence;
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        int i6 = i3 + 67;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ExternalLogItem externalLogItem = (ExternalLogItem) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = externalLogItem.transactionId;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subTransactionId;
        }
        throw null;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.service;
        int i5 = i2 + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            str = this.offPayPartnerCode;
            int i4 = 8 / 0;
        } else {
            str = this.offPayPartnerCode;
        }
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ExternalLogItem externalLogItem = (ExternalLogItem) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = externalLogItem.feature;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.action;
        int i5 = i2 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.step;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return str;
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.successYn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.resultCode;
        int i5 = i3 + 89;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.resultMessage;
        int i5 = i3 + 39;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extParam1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extParam2;
        }
        throw null;
    }

    public final JsonObject IAuthTabCallbackDefault() {
        JsonObject jsonObject;
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            jsonObject = this.extParam3;
            int i4 = 75 / 0;
        } else {
            jsonObject = this.extParam3;
        }
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.deviceModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.source;
        int i5 = i3 + 33;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.osVersion;
            int i4 = 5 / 0;
        } else {
            str = this.osVersion;
        }
        int i5 = i2 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.appId;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appVersion;
        int i5 = i2 + 7;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final JsonObject onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        JsonObject jsonObject = this.clientMetadata;
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.sdkVersion;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35125), Color.green(0) + 23, (-16766938) - Color.rgb(0, 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 55, 2167 - Color.alpha(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 23;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 55 - (ViewConfiguration.getEdgeSlop() >> 16), (-16775049) - Color.rgb(0, 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            int i11 = $11 + 87;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        char c = '0';
        char c2 = 0;
        if (iArr3 != null) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c) - '0'), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 72, TextUtils.lastIndexOf("", c, 0, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[c2] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 72 - (KeyEvent.getMaxKeyCode() >> 16), 8896 - AndroidCharacter.getMirror('0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                j = 0;
                c2 = 0;
            }
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 73;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionType(0L)), 38 - MotionEvent.axisFromString(""), 10301 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 4033), 79 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 7398 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(ExternalLogItem externalLogItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        onWarmupCompleted(new Object[]{externalLogItem, vylVar, serialDescriptor}, -1508440798, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 1508440802, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
    }

    public final String onTransact() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        return (String) onWarmupCompleted(new Object[]{this}, -1197502692, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 1197502695, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
    }

    public final long asBinder() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        return ((Long) onWarmupCompleted(new Object[]{this}, -1203265501, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 1203265501, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback())).longValue();
    }

    public final String access000() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        return (String) onWarmupCompleted(new Object[]{this}, -774151365, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 774151367, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
    }

    public final String onUnminimized() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        return (String) onWarmupCompleted(new Object[]{this}, -181616829, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, 181616830, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
    }

    static void ICustomTabsCallbackStubProxy() {
        IAuthTabCallback = new int[]{632984554, 1306541986, -239580265, -1290840763, -1304558746, 1977830276, 1707939316, 653830215, 100783501, 62900747, 1231528383, -142829052, -1108485567, -320389929, -1166747311, -357877427, 546035539, -208804549};
        onNavigationEvent = 478308888;
    }
}
