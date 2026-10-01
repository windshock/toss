package im.toss.features.home.ui.view.asset.mydata;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access15300;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] $VALUES;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback ALL;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback BANK;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback CAR;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback CARD;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback CASH;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback EFIN;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback REAL_ESTATE;
    public static final MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback SECURITY;
    private static long onExtraCallback;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final Integer iconTintColorResId;
    private final String iconUri;
    private final String logType;
    private final String schemeUrl;
    private final int titleColorResId;
    private final int titleResId;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;

    private static String $$c(short s, int i, byte b) {
        int i2 = (b * 3) + 97;
        int i3 = 4 - (s * 3);
        byte[] bArr = $$a;
        int i4 = i * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = i3 + i4;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i5 = i6;
            i2 = bArr[i3] + i7;
            i3++;
        }
    }

    private static final /* synthetic */ MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr = {BANK, SECURITY, CARD, EFIN, ALL, REAL_ESTATE, CAR, CASH};
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr;
    }

    public static EnumEntries<MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback> enumEntries = $ENTRIES;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback = (MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback) Enum.valueOf(MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback;
    }

    public static MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr = $VALUES;
        if (i3 == 0) {
            return (MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[]) mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr.clone();
        }
        int i4 = 98 / 0;
        return (MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[]) mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 91;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            i3 = 3;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 59697), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, 10973 - ExpandableListView.getPackedPositionGroup(0L), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 31, (Process.myTid() >> 22) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1493 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $10 + i3;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49124), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 1494 - TextUtils.indexOf("", "", 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = 3;
        }
        objArr[0] = new String(cArr);
    }

    private MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback(String str, int i, String str2, String str3, String str4, int i2, Integer num, int i3) {
        this.logType = str2;
        this.schemeUrl = str3;
        this.iconUri = str4;
        this.titleResId = i2;
        this.iconTintColorResId = num;
        this.titleColorResId = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback(String str, int i, String str2, String str3, String str4, int i2, Integer num, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        int i5;
        if ((i4 & 16) != 0) {
            int i6 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i4 & 32) != 0) {
            int i9 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i5 = R.color.grey_700;
        } else {
            i5 = i3;
        }
        this(str, i, str2, str3, str4, i2, num2, i5);
    }

    public final String getLogType() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.logType;
        int i4 = i2 + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSchemeUrl() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schemeUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallback();
        int i = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_bank;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, MotionEvent.axisFromString("") + 85, (char) (Color.green(0) + 15360), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 84, 52 - (ViewConfiguration.getTouchSlop() >> 8), (char) (64529 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
        BANK = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("BANK", 0, "ACCOUNT", strIntern, ((String) objArr2[0]).intern(), i, null, 0, 48, null);
        int i2 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_security;
        Object[] objArr3 = new Object[1];
        a(184 - AndroidCharacter.getMirror('0'), 90 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 14082), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 226, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55, (char) (28815 - TextUtils.getTrimmedLength("")), objArr4);
        Integer num = null;
        int i3 = 0;
        int i4 = 48;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SECURITY = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("SECURITY", 1, "SECURITY", strIntern2, ((String) objArr4[0]).intern(), i2, num, i3, i4, defaultConstructorMarker);
        int i5 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_card;
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 281, 84 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 365, (ViewConfiguration.getTapTimeout() >> 16) + 54, (char) (TextUtils.indexOf("", "", 0, 0) + 3655), objArr6);
        Integer num2 = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        CARD = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("CARD", 2, "CARD", strIntern3, ((String) objArr6[0]).intern(), i5, num2, 0, 48, defaultConstructorMarker2);
        int i6 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_efin;
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 419, 84 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 17660), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 502, 58 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), objArr8);
        EFIN = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("EFIN", 3, "POINT_PAY", strIntern4, ((String) objArr8[0]).intern(), i6, num, i3, i4, defaultConstructorMarker);
        int i7 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_all;
        int i8 = R.color.light_theme_blue_600;
        Object[] objArr9 = new Object[1];
        a(560 - Color.argb(0, 0, 0, 0), 27 - (Process.myPid() >> 22), (char) (16649 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(587 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr10);
        ALL = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("ALL", 4, "ALL", strIntern5, ((String) objArr10[0]).intern(), i7, num2, i8, 16, defaultConstructorMarker2);
        int i9 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_real_estate;
        Object[] objArr11 = new Object[1];
        a(645 - TextUtils.indexOf((CharSequence) "", '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 99, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(746 - TextUtils.indexOf("", "", 0), 54 - ExpandableListView.getPackedPositionGroup(0L), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr12);
        REAL_ESTATE = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("REAL_ESTATE", 5, "REAL_ESTATE", strIntern6, ((String) objArr12[0]).intern(), i9, num, i3, i4, defaultConstructorMarker);
        int i10 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_car;
        Object[] objArr13 = new Object[1];
        a((-16776416) - Color.rgb(0, 0, 0), 70 - Color.red(0), (char) ((-16734290) - Color.rgb(0, 0, 0)), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(871 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 53, (char) (22778 - Gravity.getAbsoluteGravity(0, 0)), objArr14);
        CAR = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("CAR", 6, "CAR", strIntern7, ((String) objArr14[0]).intern(), i10, num2, 0, 48, defaultConstructorMarker2);
        int i11 = im.toss.features.home.ui.R.string.home_ui_mydata_asset_add_mydata_business_type_title_cash;
        Object[] objArr15 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 923, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 82, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 1006, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 57, (char) (Color.rgb(0, 0, 0) + 16777216), objArr16);
        CASH = new MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback("CASH", 7, "CASH", strIntern8, ((String) objArr16[0]).intern(), i11, Integer.valueOf(i8), 0, 32, null);
        MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback[] mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr$values = $values();
        $VALUES = mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallbackArr$values);
        int i12 = asBinder + 83;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
    }

    public final TdsListRowV1View toView(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(this.iconUri);
        Integer num = this.iconTintColorResId;
        if (num != null) {
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                num.intValue();
                tdsListRowV1View.mayLaunchUrl();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iIntValue = num.intValue();
            TdsImageView tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl();
            if (tdsImageViewMayLaunchUrl != null) {
                tdsImageViewMayLaunchUrl.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(tdsListRowV1View.getContext(), iIntValue), PorterDuff.Mode.SRC_IN));
                int i3 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        tdsListRowV1View.setLeftImageSize(setTagsokhttp.onExtraCallbackWithResult(tdsListRowV1View, 24), setTagsokhttp.onExtraCallbackWithResult(tdsListRowV1View, 24));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setCenterText1(tdsListRowV1View.getContext().getString(this.titleResId));
        tdsListRowV1View.setCenterText1Color(ContextCompat.getColor(tdsListRowV1View.getContext(), this.titleColorResId));
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        return tdsListRowV1View;
    }

    static void onExtraCallback() {
        char[] cArr = new char[1063];
        ByteBuffer.wrap("Ñ§§!<¤²1\u000b¦\u0081 \u0016»ì'e§ûnpûÆ{_¹Õ-ª° 5¹ \u000f5\u0084û\u001a&\u0093±i3þ½t'Í C1Ø¦®k'½½:2°\u0088!\u0001§\u0097 l¦â={±ñ'FéÜ\u0016U\u0095+\u001a \u009f6r\u008f¦\u00051\u009a²\u00101é¦\u007f&ô±J&ÃéY5.§¤'=±³ \bú\u009e6\u0017»í b ø;q¹Ç\u000b\\§Ò<«±!1¶ \fz\u0085·\u001b;\u0090ºf:ÿ±u7Ê @zÙ¶¯5$ºº?\u0011¬g0ü°r4Ë·A~Öë,k¥·;0°¥\u00060\u009f\u00ad\u0015'jêà0y«Ï7D·ÚjS\u00ad©)>ë´-\r§\u0083+\u0018ªn7çë}4òªH#ÁëWp¬¼\"k»\u00ad1'\u0086«\u001c*\u0095éë%`§ö'O«Å1ZªÐ0)ê¿44ª\u008a#Ú¥¬#7¦¹3\u0000¤\u008a\"\u001d¹ç%n¥ðl{ùÍyT»Þ/¡²+7²¢\u00047\u008fù\u0011$\u0098³b1õ¿\u007f%Æ¢H3Ó¤¥i,¿¶89²\u0083#\n¥\u009c\"g¤é?p³ú%Më×\u001f^\u0098 \u0000«\u0093=\u0005\u0084\u0082\u000ep\u0091¤\u001b3â°t3ÿ¤A$È³R$%ë¯76¥¸%\u0003³\u0095\"\u001cøæ4i¹ó\"z¢Ì9W»Ù\t ¥*>½³\u00073\u008e¢\u0010x\u009bµm9ô¸~8Á³K5Ò¢¤x/¥±38µ\u0082#\u0015¤\u009f?f¢è/\u009d3ë¯p/þ«G(ÍáZt ô)(·¯<:\u008a¯\u00132\u0099¸æul¯õ4C¨È(Võß2%¶²t8²\u00818\u000f´\u00945â¨ktñ«~5Ä¼MtÛï #®ô72½¸\n4\u0090µ\u0019vg¼ì)zºÃ+I³Öv\\¿¥43¬¸5\u0006õ\u008f+\u0015µb<í§\u009b!\u0000¤\u008e17¦½ *»Ð'Y§ÇnLûú{c¹é-\u0096°\u001c5\u0085 35¸û&&¯±U3Â½H'ñ \u007f1ä¦\u0092k\u001b½\u0081:\u000e°´!=§« P¦Þ=G±Í'zéà\u0017i\u0095\u0017\u0006\u009c\u0090\nr³¦91¦²,1Õ¦C&È±v&ÿée5\u0012§\u0098'\u0001±\u008f 4ú¢6+»Ñ ^ Ä;M¹û\u000b`§î<\u0097±\u001d1\u008a 0z¹·';¬ºZ:Ã±I7ö |zå·\u00935\u0018¦\u00860ãû\u0095g\u000eç\u0080c9à³)$¼Þ<WàÉgBòôgmúçp\u0098½\u0012g\u008bü=`¶à(=¡ú[~Ì¼Fzÿðq|êý\u009c`\u0015¼\u008fc\u0000ýºt3¼¥'^ëÐ<IúÃptüî}g¾\u0019p\u0092ò\u0004a½÷7>¨ñ\"\u007fÛæMvÆ½xcñýkt©[ßÝDXÊÍsZùÜnG\u0094Û\u001d[\u0083\u0092\b\u0007¾\u0087'E\u00adÑÒLXÉÁ\\wÉü\u0007bÚëM\u0011Ï\u0086A\fÛµ\\;Í ZÖ\u0097_AÅÆJLðÝy[ïÜ\u0014Z\u009aÁ\u0003M\u0089Û>\u0015¤í-nSáØfN\u008e÷Z}ÍâNhÍ\u0091Z\u0007Ú\u008cM2Ú»\u0015!ÉV[ÜÛEMËÜp\u0006æÊoG\u0095Ü\u001a\\\u0080Ç\tE¿÷$[ªÀÓMYÍÎ\\t\u0086ýKcÇèF\u001eÆ\u0087M\rË²\\8\u0086¡M×Î\\AÂÆí¼\u009b \u0000 \u008e$7§½n*ûÐ{Y§Ç Lµú c½é7\u0096ú\u001c \u0085»3'¸§&z¯½U9ÂûH=ñ·\u007f;äº\u0092'\u001bû\u0081$\u000eº´3=û«`P¬Þ{G½Í7z»à:iù\u0017$\u009c»\n=³º9 ¦ù,7Õ½C&È·v8ÿ±ez\u0012¤\u0098:\u0001³¬®Ú(A\u00adÏ8v¯ü)k²\u0091.\u0018®\u0086g\rò»r\"°¨$×¹]<Ä©r<ùòg/î¸\u0014:\u0083´\t.°©>8¥¯í¼\u009b \u0000 \u008e$7§½n*ûÐ{Y§Ç Lµú c½é7\u0096ú\u001c \u0085»3'¸§&z¯½U9ÂûH=ñ·\u007f;äº\u0092'\u001bû\u0081$\u000eº´3=û«`P¬Þ{G½Í7z»à:iù\u00178\u009c½\n3³¼9 ¦º,=ÕºC3Èùv6ÿ¸e!\u0012±\u0098z\u0001¤\u008f:4³í§\u009b1\u0000¦\u008e\"7½½7*±Ð Y»Ç'L§úncûé{\u0096¼\u001c;\u0085¡3'¸±&y¯¼U;Â¹H1ñû\u007f'ä±\u0092&\u001b¢\u0081=\u000e·´1=û«&P±Þ5G¸Íyz±à'i \u00175\u009c \n1³û9&¦±,3Õ½C'È v1ÿ¦ek\u0012¦\u00981\u0001²\u008f14¦¢&+±Ñ&^éÄ5M§û'`±î \u0097ú\u001d6\u008a»0 ¹ ';¬¹Z\u000bÃ§I<ö±|1å \u0093z\u0018·\u0086;\u000fºµ:\"±¨7Q ßzD¦ò1{µá8n\u0091\u0014'\u009d \u000b5° >1í¼\u009b \u0000 \u008e$7§½n*ûÐ{Y§Ç Lµú c½é7\u0096ú\u001c \u0085»3'¸§&z¯½U9ÂûH=ñ·\u007f;äº\u0092'\u001bû\u0081$\u000eº´3=û«`P¬Þ{G½Í7z»à:iù\u0017<\u009c»\n9³±9y¦¶,8Õ¡C1Èúv$ÿºe3J\t<\u009f§\b)\u008c\u0090\u0013\u001a\u0099\u008d\u001fw\u008eþ\u0015`\u0089ë\t]ÀÄUNÕ1\u001b»\u008f\"\u000e\u0094\u0095\u001f\u0017\u0081\u0095\b\u0018ò\u0093e\u0016ï\u009fVUØ\u0097C\u00035¹¼\u001b&\u0088©E\u0013\u0088\u009a\u001f\f\u009c÷\u001fy\u0088à\bj\u009fÝ\bGÇÎ\u001b°\u0089;\t\u00ad\u009f\u0014\u000e\u009eÔ\u0001\u0018\u008b\u0095r\u000eä\u008eo\u0015Ñ\u0097X%Â\u0089µ\u0012?\u009f¦\u001f(\u008e\u0093T\u0005\u0099\u008c\u0015v\u0094ù\u0014c\u009fê\u0019\\\u008eÇTI\u00990\u001bº\u0088µFÃÚXZÖÞo]å\u0094r\u0001\u0088\u0081\u0001]\u009fÚ\u0014O¢Ú;G±ÍÎ\u0000DÚÝAkÝà]~\u0080÷G\rÃ\u009a\u0001\u0010Ç©M'Á¼@ÊÝC\u0001ÙÞV@ìÉe\u0001ó\u009a\bV\u0086\u0081\u001fG\u0095Í\"A¸À1\u0003OÍÄORÜë\u0003aÌþBtÛ\u008dK\u001b\u0080\u0090^.À§Ií§\u009b1\u0000¦\u008e\"7½½7*±Ð Y»Ç'L§úncûé{\u0096µ\u001c7\u0085·3;¸¡&:¯ U'ÂûH7ñµ\u007f'ä¼\u0092y\u001bµ\u0081'\u000e§´1= «{PµÞ0G°Íyz·à5i§\u0017<\u009cë\n&³±92¦±,&Õ¦C1È¦viÿµe'\u0012§\u00981\u0001 \u008fz4¶¢;+ Ñ ^»Ä9M\u008bû'`¼î1\u0097±\u001d \u008aú07¹»':¬ºZ1Ã·I öú|7åµ\u0093'\u0018¼í¼\u009b \u0000 \u008e$7§½n*ûÐ{Y§Ç Lµú c½é7\u0096ú\u001c \u0085»3'¸§&z¯½U9ÂûH=ñ·\u007f;äº\u0092'\u001bû\u0081$\u000eº´3=û«`P¬Þ{G½Í7z»à:iù\u0017$\u009c±\n:³·9=¦¸,yÕ§C9Èµv8ÿ¸ez\u0012¤\u0098:\u0001³".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1063);
        onNavigationEvent = cArr;
        onExtraCallback = -4283342504338023596L;
    }
}
