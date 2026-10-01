package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.ToolkitManagerc;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ToolkitManagerc {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final ToolkitManagerc onNavigationEvent;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4 = 105 - (i * 2);
        int i5 = s * 4;
        byte[] bArr = $$a;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            i4 = i7;
            i3 = 0;
            i4 += i8;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i6];
            i4 += i8;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        onNavigationEvent = new ToolkitManagerc();
        int i = onWarmupCompleted + 125;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, onExtraCallback onextracallback, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, str3, onextracallback, str4, str5, str6, str7, str8, querytabbarinfo, setDetectableSize);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallbackWithResult + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3, onNavigationEvent onnavigationevent, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(str, str2, str3, onnavigationevent, str4, str5, str6, str7, str8, querytabbarinfo, setDetectableSize);
        }
        onExtraCallback(str, str2, str3, onnavigationevent, str4, str5, str6, str7, str8, querytabbarinfo, setDetectableSize);
        throw null;
    }

    private ToolkitManagerc() {
    }

    public static /* synthetic */ void onNavigationEvent(ToolkitManagerc toolkitManagerc, String str, String str2, String str3, onExtraCallback onextracallback, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        int i2 = 2 % 2;
        queryTabBarInfo querytabbarinfo2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            str9 = null;
        } else {
            str9 = str;
        }
        String str13 = (i & 2) != 0 ? null : str2;
        String str14 = (i & 4) != 0 ? null : str3;
        onExtraCallback onextracallback2 = (i & 8) != 0 ? null : onextracallback;
        if ((i & 16) != 0) {
            int i5 = onExtraCallbackWithResult + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str10 = null;
        } else {
            str10 = str4;
        }
        String str15 = (i & 32) != 0 ? null : str5;
        String str16 = (i & 64) != 0 ? null : str6;
        if ((i & 128) != 0) {
            int i6 = onExtraCallbackWithResult + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            str11 = null;
        } else {
            str11 = str7;
        }
        if ((i & 256) != 0) {
            int i8 = onExtraCallback + 61;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            str12 = null;
        } else {
            str12 = str8;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i10 = onExtraCallbackWithResult + 53;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } else {
            querytabbarinfo2 = querytabbarinfo;
        }
        toolkitManagerc.onExtraCallbackWithResult(str9, str13, str14, onextracallback2, str10, str15, str16, str11, str12, querytabbarinfo2);
    }

    public final void onExtraCallbackWithResult(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final onExtraCallback onextracallback, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, @Nullable final String str8, @Nullable final queryTabBarInfo querytabbarinfo) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1214737L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.AccountHistoryLogManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolkitManagerc.IAuthTabCallback(str, str2, str3, onextracallback, str4, str5, str6, str7, str8, querytabbarinfo, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, String str2, String str3, onExtraCallback onextracallback, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int i3 = 59 / 0;
            if (str != null) {
                int i4 = onExtraCallback + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    setDetectableSize.onExtraCallback(StompHeader.ID, str);
                    int i5 = 83 / 0;
                } else {
                    setDetectableSize.onExtraCallback(StompHeader.ID, str);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            if (str != null) {
            }
        }
        if (str2 != null) {
            int i6 = onExtraCallback + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int maximumFlingVelocity = 2 - (ViewConfiguration.getMaximumFlingVelocity() + 36);
                TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 1);
                Object[] objArr = new Object[1];
                a(maximumFlingVelocity, 0, new char[]{65528, 7, 65532, 7, 65535}, true, 19503 % View.combineMeasuredStates(1, 1), objArr);
                setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str2);
            } else {
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, 1 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), new char[]{65528, 7, 65532, 7, 65535}, false, 235 - View.combineMeasuredStates(0, 0), objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
            }
        }
        if (str3 != null) {
            Object[] objArr3 = new Object[1];
            a(KeyEvent.normalizeMetaState(0) + 11, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{2, 65528, 65529, 7, 65527, 6, 65533, 4, '\b', 65533, 3}, false, 234 - View.combineMeasuredStates(0, 0), objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        }
        if (onextracallback != null) {
            int i7 = onExtraCallback + 73;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr4 = new Object[1];
                a(2 - (ViewConfiguration.getTapTimeout() / 91), 5 << (ViewConfiguration.getWindowTouchSlop() >>> Imgproc.COLOR_YUV2BGRA_YVYU), new char[]{4, '\t', 0, 65525}, true, 20457 >> ExpandableListView.getPackedPositionChild(1L), objArr4);
                obj = objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                a((ViewConfiguration.getTapTimeout() >> 16) + 4, 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{4, '\t', 0, 65525}, false, ExpandableListView.getPackedPositionChild(0L) + 239, objArr5);
                obj = objArr5[0];
            }
            setDetectableSize.onExtraCallback(((String) obj).intern(), onextracallback.name());
        }
        if (str4 != null) {
            setDetectableSize.onExtraCallback("bankCode", str4);
        }
        if (str5 != null) {
            setDetectableSize.onExtraCallback("account_name", str5);
        }
        if (str6 != null) {
            setDetectableSize.onExtraCallback("screen_name", str6);
        }
        if (str7 != null) {
            setDetectableSize.onExtraCallback("bank_account_type", str7);
            int i8 = onExtraCallback + 93;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        if (str8 != null) {
            Object[] objArr6 = new Object[1];
            a(3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{4, 1, 65531}, false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 238, objArr6);
            setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str8);
        }
        if (querytabbarinfo != null) {
            setDetectableSize.onExtraCallback("inquiry_method", querytabbarinfo);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ToolkitManagerc toolkitManagerc, String str, String str2, String str3, onNavigationEvent onnavigationevent, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallback + 29;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            onnavigationevent = null;
        }
        if ((i & 16) != 0) {
            int i9 = onExtraCallback;
            int i10 = i9 + 15;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 85;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            int i14 = onExtraCallback + 15;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            str7 = null;
        }
        if ((i & 256) != 0) {
            str8 = null;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            querytabbarinfo = null;
        }
        toolkitManagerc.IAuthTabCallback(str, str2, str3, onnavigationevent, str4, str5, str6, str7, str8, querytabbarinfo);
    }

    public final void IAuthTabCallback(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final onNavigationEvent onnavigationevent, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, @Nullable final String str8, @Nullable final queryTabBarInfo querytabbarinfo) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1214739L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.AccountHistoryLogManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolkitManagerc.onNavigationEvent(str, str2, str3, onnavigationevent, str4, str5, str6, str7, str8, querytabbarinfo, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, String str2, String str3, onNavigationEvent onnavigationevent, String str4, String str5, String str6, String str7, String str8, queryTabBarInfo querytabbarinfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (str != null) {
            setDetectableSize.onExtraCallback(StompHeader.ID, str);
        }
        if (str2 != null) {
            Object[] objArr = new Object[1];
            a(4 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{65528, 7, 65532, 7, 65535}, false, 235 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str2);
        }
        if (str3 != null) {
            Object[] objArr2 = new Object[1];
            a(View.resolveSize(0, 0) + 11, -TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), new char[]{2, 65528, 65529, 7, 65527, 6, 65533, 4, '\b', 65533, 3}, false, 234 - View.resolveSizeAndState(0, 0, 0), objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str3);
        }
        if (onnavigationevent != null) {
            Object[] objArr3 = new Object[1];
            a(4 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), 4 - View.MeasureSpec.getMode(0), new char[]{4, '\t', 0, 65525}, false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 237, objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), onnavigationevent.name());
        }
        if (str4 != null) {
            setDetectableSize.onExtraCallback("bankCode", str4);
        }
        if (str5 != null) {
            int i4 = onExtraCallbackWithResult + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            setDetectableSize.onExtraCallback("account_name", str5);
        }
        if (str6 != null) {
            int i6 = onExtraCallback + 125;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                setDetectableSize.onExtraCallback("screen_name", str6);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setDetectableSize.onExtraCallback("screen_name", str6);
        }
        if (str7 != null) {
            setDetectableSize.onExtraCallback("bank_account_type", str7);
        }
        if (str8 != null) {
            int i7 = onExtraCallback + 103;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr4 = new Object[1];
            a(TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 3, 3 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{4, 1, 65531}, false, (ViewConfiguration.getTouchSlop() >> 8) + 239, objArr4);
            setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str8);
        }
        if (querytabbarinfo != null) {
            int i9 = onExtraCallback + 37;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            setDetectableSize.onExtraCallback("inquiry_method", querytabbarinfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback TRANSACTION = new onExtraCallback("TRANSACTION", 0);
        public static final onExtraCallback SETTING = new onExtraCallback("SETTING", 1);
        public static final onExtraCallback LOAD_MORE = new onExtraCallback("LOAD_MORE", 2);
        public static final onExtraCallback TRANSFER = new onExtraCallback("TRANSFER", 3);
        public static final onExtraCallback CHARGE = new onExtraCallback("CHARGE", 4);
        public static final onExtraCallback FILTER_NONE = new onExtraCallback("FILTER_NONE", 5);
        public static final onExtraCallback FILTER_INCOME = new onExtraCallback("FILTER_INCOME", 6);
        public static final onExtraCallback FILTER_EXPENSE = new onExtraCallback("FILTER_EXPENSE", 7);
        public static final onExtraCallback REFRESH_BUTTON = new onExtraCallback("REFRESH_BUTTON", 8);
        public static final onExtraCallback COPY_ACCOUNT_NUMBER = new onExtraCallback("COPY_ACCOUNT_NUMBER", 9);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{TRANSACTION, SETTING, LOAD_MORE, TRANSFER, CHARGE, FILTER_NONE, FILTER_INCOME, FILTER_EXPENSE, REFRESH_BUTTON, COPY_ACCOUNT_NUMBER};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 35125), KeyEvent.getDeadChar(0, 0) + 23, 10278 - (ViewConfiguration.getLongPressTimeout() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 55, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i9 = $11 + 23;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12844), ((byte) KeyEvent.getModifierMetaStateMask()) + 56, 2167 - ExpandableListView.getPackedPositionGroup(j), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 478308951;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent TRANSACTION = new onNavigationEvent("TRANSACTION", 0);
        public static final onNavigationEvent LOAD_MORE = new onNavigationEvent("LOAD_MORE", 1);
        public static final onNavigationEvent CHARGE_AND_TRANSFER = new onNavigationEvent("CHARGE_AND_TRANSFER", 2);
        public static final onNavigationEvent TRANSFER_ONLY = new onNavigationEvent("TRANSFER_ONLY", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            return new onNavigationEvent[]{TRANSACTION, LOAD_MORE, CHARGE_AND_TRANSFER, TRANSFER_ONLY};
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            return $ENTRIES;
        }

        public static onNavigationEvent valueOf(String str) {
            return (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
        }

        public static onNavigationEvent[] values() {
            return (onNavigationEvent[]) $VALUES.clone();
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
        }
    }
}
