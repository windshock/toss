package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.asMaplambda6;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asMaplambda6 {
    private static char IAuthTabCallback;
    private static char IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int access000;
    private static char asBinder;
    public static final asMaplambda6 onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {35, -11, -97, -73};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int onTransact = 0;
    private static int asInterface = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[shortValue.onNavigationEvent.values().length];
            try {
                iArr[shortValue.onNavigationEvent.BANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[shortValue.onNavigationEvent.SECURITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r0 = o.asMaplambda6.$$a
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = r7 + 105
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asMaplambda6.$$c(short, short, short):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        String str7 = (String) objArr[6];
        String str8 = (String) objArr[7];
        long jLongValue = ((Number) objArr[8]).longValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[9];
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, str4, str5, str6, str7, str8, jLongValue, setDetectableSize);
        int i4 = onTransact + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, str4, str5, str6, str7, setDetectableSize);
        int i4 = asInterface + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        String str7 = (String) objArr[6];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[7];
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, str3, str4, str5, str6, str7, setDetectableSize);
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(setDetectableSize);
        }
        onWarmupCompleted(setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, str5, str6, str7, j, setDetectableSize);
        int i4 = onTransact + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = i | i6;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i) | (~i6)));
        int i13 = i + i6 + i3 + (1699743442 * i2) + (2071835342 * i5);
        int i14 = i13 * i13;
        int i15 = ((i * (-355764420)) - 259725689) + (i6 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + ((-355763899) * i3) + (2119243930 * i2) + ((-943812730) * i5) + (i14 * (-597164032));
        switch ((((-557635572) * i) - 1375207424) + ((-557635572) * i6) + ((-2106796043) * i9) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i3) + ((-648019968) * i2) + ((-1801453568) * i5) + (1296564224 * i14) + (i15 * i15 * 58195968)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                String str4 = (String) objArr[3];
                String str5 = (String) objArr[4];
                String str6 = (String) objArr[5];
                String str7 = (String) objArr[6];
                String str8 = (String) objArr[7];
                long jLongValue = ((Number) objArr[8]).longValue();
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[9];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, Color.green(0) + 8, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
                Object[] objArr3 = new Object[1];
                a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, Color.blue(0) + 11, objArr3);
                setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str2);
                Object[] objArr4 = new Object[1];
                b(TextUtils.lastIndexOf("", '0', 0, 0) + 4, 5 - TextUtils.getOffsetBefore("", 0), new char[]{7, 65535, 65528, 7, 65532}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 261, false, objArr4);
                setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str3);
                Object[] objArr5 = new Object[1];
                b(2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, View.MeasureSpec.makeMeasureSpec(0, 0) + 260, true, objArr5);
                setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str4);
                Object[] objArr6 = new Object[1];
                a(new char[]{14803, 28277, 35409, 47960, 57036, 20248, 19531, 1491, 15663, 10141, 33377, 30773}, 12 - Color.blue(0), objArr6);
                setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str5);
                StringBuilder sb = new StringBuilder();
                sb.append(str6);
                Object[] objArr7 = new Object[1];
                b(-TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, new char[]{0}, (Process.myTid() >> 22) + 201, true, objArr7);
                sb.append(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                b(7 - Color.green(0), 11 - TextUtils.getCapsMode("", 0, 0), new char[]{'\t', 5, 2, 65530, '\t', '\t', 65526, '\t', 3, 65528, 65524}, ExpandableListView.getPackedPositionGroup(0L) + 259, true, objArr8);
                setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), sb.toString());
                Object[] objArr9 = new Object[1];
                b(Color.rgb(0, 0, 0) + 16777227, 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, View.MeasureSpec.getSize(0) + 258, false, objArr9);
                setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), str7);
                Object[] objArr10 = new Object[1];
                b(14 - TextUtils.indexOf("", "", 0), 17 - (Process.myTid() >> 22), new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 256, false, objArr10);
                setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), str8);
                Object[] objArr11 = new Object[1];
                b((ViewConfiguration.getEdgeSlop() >> 16) + 9, TextUtils.indexOf("", "", 0) + 9, new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, View.MeasureSpec.makeMeasureSpec(0, 0) + 257, true, objArr11);
                setDetectableSize.onExtraCallback(((String) objArr11[0]).intern(), Long.valueOf(jLongValue));
                Unit unit = Unit.INSTANCE;
                int i17 = onTransact + 71;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                return unit;
            case 5:
                String str9 = (String) objArr[0];
                String str10 = (String) objArr[1];
                String str11 = (String) objArr[2];
                String str12 = (String) objArr[3];
                String str13 = (String) objArr[4];
                String str14 = (String) objArr[5];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[6];
                int i19 = 2 % 2;
                int i20 = asInterface + 85;
                onTransact = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize2, "");
                Object[] objArr12 = new Object[1];
                a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
                setDetectableSize2.onExtraCallback(((String) objArr12[0]).intern(), str9);
                Object[] objArr13 = new Object[1];
                a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr13);
                setDetectableSize2.onExtraCallback(((String) objArr13[0]).intern(), str10);
                Object[] objArr14 = new Object[1];
                b(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 5 - View.resolveSizeAndState(0, 0, 0), new char[]{7, 65535, 65528, 7, 65532}, 261 - View.resolveSizeAndState(0, 0, 0), false, objArr14);
                setDetectableSize2.onExtraCallback(((String) objArr14[0]).intern(), str11);
                Object[] objArr15 = new Object[1];
                b(2 - Color.green(0), 10 - MotionEvent.axisFromString(""), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, 259 - ImageFormat.getBitsPerPixel(0), true, objArr15);
                setDetectableSize2.onExtraCallback(((String) objArr15[0]).intern(), str12);
                Object[] objArr16 = new Object[1];
                b(11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - View.resolveSizeAndState(0, 0, 0), new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, 258 - (KeyEvent.getMaxKeyCode() >> 16), false, objArr16);
                setDetectableSize2.onExtraCallback(((String) objArr16[0]).intern(), str13);
                Object[] objArr17 = new Object[1];
                b((ViewConfiguration.getWindowTouchSlop() >> 8) + 14, Color.green(0) + 17, new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, 255 - Process.getGidForName(""), false, objArr17);
                setDetectableSize2.onExtraCallback(((String) objArr17[0]).intern(), str14);
                Unit unit2 = Unit.INSTANCE;
                int i22 = asInterface + 19;
                onTransact = i22 % 128;
                int i23 = i22 % 2;
                return unit2;
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 85;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallback(str, str2, str3, str4, str5, str6, i, j, str7, str8, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, str2, str3, str4, str5, str6, i, j, str7, str8, setDetectableSize);
        int i4 = asInterface + 53;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ LoadInfo3 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[6];
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(193151386, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -193151381, new Object[]{str, str2, str3, str4, str5, str6, setDetectableSize});
            int i3 = 64 / 0;
        } else {
            Object[] objArr2 = {str, str2, str3, str4, str5, str6, setDetectableSize};
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(193151386, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -193151381, objArr2);
        }
        int i4 = onTransact + 99;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, String str9, String str10, String str11, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, str4, str5, str6, i, j, str7, str8, str9, str10, str11, setDetectableSize);
        int i5 = asInterface + 71;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, long j, String str6, Set set, String str7, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, str4, str5, j, str6, set, str7, function1, setDetectableSize);
        int i4 = asInterface + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, str4, str5, str6, i, j, str7, str8, setDetectableSize);
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, Long.valueOf(j), setDetectableSize};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(414347468, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -414347464, objArr);
            int i3 = 25 / 0;
        } else {
            Object[] objArr2 = {str, str2, str3, str4, str5, str6, str7, str8, Long.valueOf(j), setDetectableSize};
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallbackWithResult(414347468, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -414347464, objArr2);
        }
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private asMaplambda6() {
    }

    static {
        access000 = 1;
        onExtraCallback();
        onExtraCallback = new asMaplambda6();
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda8
            public final Object invoke() {
                return asMaplambda6.onExtraCallbackWithResult();
            }
        });
        onNavigationEvent = 8;
        int i = getInterfaceDescriptor + 91;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final LoadInfo3 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LoadInfo3 loadInfo3 = (LoadInfo3) onExtraCallbackWithResult.getValue();
        int i4 = asInterface + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return loadInfo3;
    }

    private static final LoadInfo3 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LoadInfo3 iconAttribute = ((asStringlambda4) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), asStringlambda4.class)).setIconAttribute();
        int i4 = asInterface + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iconAttribute;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final String str = (String) objArr[1];
        final String str2 = (String) objArr[2];
        final String str3 = (String) objArr[3];
        final String str4 = (String) objArr[4];
        final String str5 = (String) objArr[5];
        final String str6 = (String) objArr[6];
        final String str7 = (String) objArr[7];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223323L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return asMaplambda6.IAuthTabCallback(str, str2, str3, str4, str5, str6, str7, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b((KeyEvent.getMaxKeyCode() >> 16) + 7, 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65534, 3, 65524, '\n', '\n', 65534, 65529, 5}, Color.alpha(0) + 259, false, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, 10 - ImageFormat.getBitsPerPixel(0), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str2);
        Object[] objArr4 = new Object[1];
        b(3 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 5, new char[]{7, 65535, 65528, 7, 65532}, 262 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str3);
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, (-16777205) - Color.rgb(0, 0, 0), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, 260 - (ViewConfiguration.getScrollBarSize() >> 8), true, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str4);
        Object[] objArr6 = new Object[1];
        a(new char[]{14803, 28277, 35409, 47960, 57036, 20248, 19531, 1491, 15663, 10141, 33377, 30773}, 12 - (ViewConfiguration.getTapTimeout() >> 16), objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str5);
        Object[] objArr7 = new Object[1];
        b(ExpandableListView.getPackedPositionGroup(0L) + 11, 11 - Gravity.getAbsoluteGravity(0, 0), new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, View.combineMeasuredStates(0, 0) + 258, false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), str6);
        Object[] objArr8 = new Object[1];
        b(14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - ExpandableListView.getPackedPositionType(0L), new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, View.MeasureSpec.getMode(0) + 256, false, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), str7);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unit;
    }

    public final void onExtraCallback(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223325L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr = {str, str2, str3, str4, str5, str6, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                return (Unit) asMaplambda6.onExtraCallbackWithResult(-1061075937, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1061075939, objArr);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, @NotNull final String str7) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223331L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                Object[] objArr = {str, str2, str3, str4, str5, str6, str7, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                return (Unit) asMaplambda6.onExtraCallbackWithResult(-1262232273, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1262232280, objArr);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, MotionEvent.axisFromString("") + 9, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        b(ExpandableListView.getPackedPositionChild(0L) + 4, Color.alpha(0) + 5, new char[]{7, 65535, 65528, 7, 65532}, TextUtils.indexOf("", "", 0, 0) + 261, false, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        b(2 - TextUtils.indexOf("", "", 0), 10 - MotionEvent.axisFromString(""), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, MotionEvent.axisFromString("") + 261, true, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        Object[] objArr5 = new Object[1];
        a(new char[]{14803, 28277, 35409, 47960, 57036, 20248, 19531, 1491, 15663, 10141, 33377, 30773}, View.MeasureSpec.makeMeasureSpec(0, 0) + 12, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str5);
        Object[] objArr6 = new Object[1];
        b(10 - TextUtils.lastIndexOf("", '0', 0), 10 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, 258 - (ViewConfiguration.getPressedStateDuration() >> 16), false, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str6);
        Object[] objArr7 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 15, (ViewConfiguration.getScrollBarSize() >> 8) + 17, new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, View.MeasureSpec.getSize(0) + 256, false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), str7);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(asMaplambda6 asmaplambda6, Set set, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Function1 function1, int i, Object obj) {
        Function1 function12;
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str8 = (i & 256) != 0 ? null : str7;
        if ((i & 512) != 0) {
            Function1 function13 = new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2) {
                    int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    return (Unit) asMaplambda6.onExtraCallbackWithResult(781330039, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -781330033, new Object[]{(SetDetectableSize) obj2});
                }
            };
            int i5 = onTransact + 61;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            function12 = function13;
        } else {
            function12 = function1;
        }
        asmaplambda6.onNavigationEvent((Set<? extends isNumber>) set, str, str2, j, str3, str4, str5, str6, str8, (Function1<? super SetDetectableSize, Unit>) function12);
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (true) {
            Object obj = null;
            if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                break;
            }
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i7 = (c3 + i6) ^ ((c3 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c] = Integer.valueOf(i7);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int gidForName = Process.getGidForName("") + 11;
                        int iGreen = Color.green(0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, gidForName, iGreen, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 10, 12434 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    obj = null;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 16014), 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19901 - (ViewConfiguration.getPressedStateDuration() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i9 = $10 + 113;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 5;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final void onNavigationEvent(@NotNull final Set<? extends isNumber> set, @Nullable final String str, @NotNull final String str2, final long j, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, @NotNull final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1498527L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return asMaplambda6.onWarmupCompleted(str4, str5, str3, str, str2, j, str6, set, str7, function1, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, Set set, String str7, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b(3 - ((Process.getThreadPriority(0) + 20) >> 6), 4 - ImageFormat.getBitsPerPixel(0), new char[]{7, 65535, 65528, 7, 65532}, 262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        b(2 - (Process.myTid() >> 22), 11 - TextUtils.getOffsetAfter("", 0), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, KeyEvent.normalizeMetaState(0) + 260, true, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        _get_isNull_lambda0 _get_isnull_lambda0 = _get_isNull_lambda0.onExtraCallbackWithResult;
        Object[] objArr3 = new Object[1];
        b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, TextUtils.getTrimmedLength("") + 11, new char[]{'\t', 5, 2, 65530, '\t', '\t', 65526, '\t', 3, 65528, 65524}, 259 - (ViewConfiguration.getPressedStateDuration() >> 16), true, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), Integer.valueOf(_get_isnull_lambda0.onExtraCallback()));
        Object[] objArr4 = new Object[1];
        b(3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, new char[]{'\b', '\r', 4, 65529, '\n', 65525, 6, 65533, 65525, 2, '\b', 65523}, TextUtils.getCapsMode("", 0, 0) + 260, false, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), _get_isnull_lambda0.onWarmupCompleted());
        Object[] objArr5 = new Object[1];
        b(6 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7, new char[]{65534, 3, 65524, '\n', '\n', 65534, 65529, 5}, TextUtils.indexOf("", "", 0) + 259, false, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str3);
        Object[] objArr6 = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, 11 - Color.blue(0), objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str4);
        Object[] objArr7 = new Object[1];
        b(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 6, new char[]{'\n', 65531, 3, 65530, 5, 65534}, 258 - (ViewConfiguration.getTouchSlop() >> 8), true, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), str5);
        Object[] objArr8 = new Object[1];
        b(4 - (Process.myTid() >> 22), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{'\b', '\r', 4, 65529, '\n', 65525, 6, 65533, 65525, 2, '\b', 65523}, 260 - (KeyEvent.getMaxKeyCode() >> 16), false, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), _get_isnull_lambda0.onWarmupCompleted());
        Object[] objArr9 = new Object[1];
        b(Color.blue(0) + 9, 9 - View.MeasureSpec.getSize(0), new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, 256 - ImageFormat.getBitsPerPixel(0), true, objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), Long.valueOf(j));
        Object[] objArr10 = new Object[1];
        a(new char[]{22021, 48745, 50091, 37674, 64245, 43803, 39116, 31290}, 7 - TextUtils.getOffsetAfter("", 0), objArr10);
        setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        Object[] objArr11 = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7, objArr11);
        setDetectableSize.onExtraCallback(((String) objArr11[0]).intern(), str6);
        Object[] objArr12 = new Object[1];
        a(new char[]{63444, 53884, 63482, 3749, 10206, 45083, 58522, 24927, 38811, 43906, 3467, 62578, 882, 34552, 40152, 27301, 24944, 6208, 4868, 9105, 570, 5580}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, objArr12);
        setDetectableSize.onExtraCallback(((String) objArr12[0]).intern(), CatalystInstanceImplPendingJSCall.onNavigationEvent(set));
        onExtraCallback.onExtraCallbackWithResult(setDetectableSize, str7);
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r22, int r23, char[] r24, int r25, boolean r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asMaplambda6.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    public static /* synthetic */ void onNavigationEvent(asMaplambda6 asmaplambda6, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, shortValue.onNavigationEvent onnavigationevent, String str7, String str8, String str9, String str10, String str11, int i2, Object obj) throws Throwable {
        int i3;
        shortValue.onNavigationEvent onnavigationevent2;
        String str12;
        int i4 = 2 % 2;
        String str13 = (i2 & 8) != 0 ? "" : str4;
        String str14 = (i2 & 16) != 0 ? "" : str5;
        String str15 = (i2 & 32) != 0 ? "" : str6;
        if ((i2 & 64) != 0) {
            int i5 = onTransact + 39;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            int i7 = onTransact;
            int i8 = i7 + 19;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 111;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        String str16 = (i2 & 512) != 0 ? null : str7;
        String strOnExtraCallbackWithResult = (i2 & 2048) != 0 ? _get_isNull_lambda0.onExtraCallbackWithResult.onExtraCallbackWithResult() : str9;
        if ((i2 & 8192) != 0) {
            int i12 = onTransact + 103;
            asInterface = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 69 / 0;
            }
            str12 = null;
        } else {
            str12 = str11;
        }
        asmaplambda6.onNavigationEvent(str, str2, str3, str13, str14, str15, i3, j, onnavigationevent2, str16, str8, strOnExtraCallbackWithResult, str10, str12);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, String str9, String str10, String str11, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, TextUtils.indexOf("", "", 0, 0) + 11, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        b(3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, new char[]{'\n', 65531, 3, 65530, 5, 65534}, 258 - View.MeasureSpec.makeMeasureSpec(0, 0), true, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{28868, 41047, 29919, 45455, 50344, 1619, 19531, 1491, 469, 39222, 22917, 5882}, KeyEvent.getDeadChar(0, 0) + 11, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        a(new char[]{28868, 41047, 56023, 36124, 57036, 20248}, 6 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        Object[] objArr5 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, (ViewConfiguration.getLongPressTimeout() >> 16) + 5, new char[]{7, 65535, 65528, 7, 65532}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 260, false, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str5);
        Object[] objArr6 = new Object[1];
        b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 260, true, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str6);
        Object[] objArr7 = new Object[1];
        b(MotionEvent.axisFromString("") + 8, Drawable.resolveOpacity(0, 0) + 11, new char[]{'\t', 5, 2, 65530, '\t', '\t', 65526, '\t', 3, 65528, 65524}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 259, true, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), Integer.valueOf(i + 1));
        Object[] objArr8 = new Object[1];
        b(9 - Color.green(0), 9 - Color.green(0), new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, 256 - TextUtils.lastIndexOf("", '0', 0), true, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), Long.valueOf(j));
        Object[] objArr9 = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), str7);
        Object[] objArr10 = new Object[1];
        b(6 - MotionEvent.axisFromString(""), 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65534, 3, 65524, '\n', '\n', 65534, 65529, 5}, (KeyEvent.getMaxKeyCode() >> 16) + 259, false, objArr10);
        setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), str8);
        Object[] objArr11 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, TextUtils.indexOf((CharSequence) "", '0', 0) + 13, new char[]{'\b', '\r', 4, 65529, '\n', 65525, 6, 65533, 65525, 2, '\b', 65523}, TextUtils.getOffsetAfter("", 0) + 260, false, objArr11);
        setDetectableSize.onExtraCallback(((String) objArr11[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Object[] objArr12 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 14, ExpandableListView.getPackedPositionChild(0L) + 18, new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, 256 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr12);
        setDetectableSize.onExtraCallback(((String) objArr12[0]).intern(), str9);
        Object[] objArr13 = new Object[1];
        a(new char[]{22021, 48745, 50091, 37674, 64245, 43803, 39116, 31290}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, objArr13);
        setDetectableSize.onExtraCallback(((String) objArr13[0]).intern(), zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        Object[] objArr14 = new Object[1];
        b(2 - Color.argb(0, 0, 0, 0), 4 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{0, 65525, 4, '\t'}, 265 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, objArr14);
        setDetectableSize.onExtraCallback(((String) objArr14[0]).intern(), str10);
        onExtraCallback.onExtraCallbackWithResult(setDetectableSize, str11);
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onNavigationEvent(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, final int i, final long j, @Nullable shortValue.onNavigationEvent onnavigationevent, @Nullable final String str7, @NotNull final String str8, @Nullable final String str9, @NotNull final String str10, @Nullable final String str11) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1498529L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return asMaplambda6.onNavigationEvent(str, str2, str3, str4, str5, str6, i, j, str7, str8, str9, str10, str11, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i3 = onnavigationevent == null ? -1 : onExtraCallbackWithResult.onWarmupCompleted[onnavigationevent.ordinal()];
        if (i3 != -1) {
            int i4 = asInterface;
            int i5 = i4 + 109;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (i3 == 1) {
                Object[] objArr = new Object[1];
                a(new char[]{31934, 3168, 41421, 39060}, 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                ConvertByteArrayToFloatArray.onExtraCallback(1383322L, false, ((String) objArr[0]).intern(), (Map) null, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj) {
                        return asMaplambda6.onExtraCallbackWithResult(str, str2, str3, str4, str5, str6, i, j, str7, str10, (SetDetectableSize) obj);
                    }
                }, 10, (Object) null);
                return;
            }
            int i7 = i4 + 19;
            onTransact = i7 % 128;
            if (i7 % 2 == 0 ? i3 != 2 : i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onNavigationEvent().onNavigationEvent(new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return asMaplambda6.onWarmupCompleted(str, str2, str3, str4, str5, str6, i, j, str7, str10, (SetDetectableSize) obj);
                }
            });
        }
    }

    private static final Unit onExtraCallback(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, Color.blue(0) + 11, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        b(Color.alpha(0) + 3, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, new char[]{'\n', 65531, 3, 65530, 5, 65534}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 258, true, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{28868, 41047, 29919, 45455, 50344, 1619, 19531, 1491, 469, 39222, 22917, 5882}, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        a(new char[]{28868, 41047, 56023, 36124, 57036, 20248}, 6 - Drawable.resolveOpacity(0, 0), objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        Object[] objArr5 = new Object[1];
        b(3 - TextUtils.getTrimmedLength(""), AndroidCharacter.getMirror('0') - '+', new char[]{7, 65535, 65528, 7, 65532}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 261, false, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str5);
        Object[] objArr6 = new Object[1];
        b(3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 11 - TextUtils.getTrimmedLength(""), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, 260 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str6);
        Object[] objArr7 = new Object[1];
        b(5 - Color.alpha(0), 12 - Color.blue(0), new char[]{65528, 0, 3, 7, 6, 1, '\b', 0, 65522, 65524, 7, 7}, 261 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), Integer.valueOf(i));
        Object[] objArr8 = new Object[1];
        b(9 - View.resolveSizeAndState(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, 305 - AndroidCharacter.getMirror('0'), true, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), Long.valueOf(j));
        Object[] objArr9 = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, 8 - Color.blue(0), objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), str7);
        Object[] objArr10 = new Object[1];
        a(new char[]{22021, 48745, 50091, 37674, 64245, 43803, 39116, 31290}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr10);
        setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        Object[] objArr11 = new Object[1];
        b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, Drawable.resolveOpacity(0, 0) + 4, new char[]{0, 65525, 4, '\t'}, TextUtils.lastIndexOf("", '0', 0) + 265, false, objArr11);
        setDetectableSize.onExtraCallback(((String) objArr11[0]).intern(), str8);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 103;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, String str7, String str8, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, TextUtils.indexOf("", "", 0) + 11, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, (ViewConfiguration.getLongPressTimeout() >> 16) + 6, new char[]{'\n', 65531, 3, 65530, 5, 65534}, 258 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{28868, 41047, 29919, 45455, 50344, 1619, 19531, 1491, 469, 39222, 22917, 5882}, Color.rgb(0, 0, 0) + 16777227, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        a(new char[]{28868, 41047, 56023, 36124, 57036, 20248}, 6 - View.MeasureSpec.getMode(0), objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        Object[] objArr5 = new Object[1];
        b(3 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, new char[]{7, 65535, 65528, 7, 65532}, 261 - (ViewConfiguration.getTapTimeout() >> 16), false, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str5);
        Object[] objArr6 = new Object[1];
        b(((Process.getThreadPriority(0) + 20) >> 6) + 2, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, (ViewConfiguration.getPressedStateDuration() >> 16) + 260, true, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), str6);
        Object[] objArr7 = new Object[1];
        b((ViewConfiguration.getScrollBarSize() >> 8) + 5, 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{65528, 0, 3, 7, 6, 1, '\b', 0, 65522, 65524, 7, 7}, 261 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), Integer.valueOf(i));
        Object[] objArr8 = new Object[1];
        b(9 - (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 257, true, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), Long.valueOf(j));
        Object[] objArr9 = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, 8 - Drawable.resolveOpacity(0, 0), objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), str7);
        Object[] objArr10 = new Object[1];
        a(new char[]{22021, 48745, 50091, 37674, 64245, 43803, 39116, 31290}, 6 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
        setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        Object[] objArr11 = new Object[1];
        b(2 - (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSizeAndState(0, 0, 0) + 4, new char[]{0, 65525, 4, '\t'}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 263, false, objArr11);
        setDetectableSize.onExtraCallback(((String) objArr11[0]).intern(), str8);
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 5;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return unit;
    }

    public final void onExtraCallbackWithResult(long j, @NotNull String str) {
        String logValue;
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            CatalystInstanceImplPendingJSCall.onWarmupCompleted();
            createPaints.IAuthTabCallback.access100();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Set<isNumber> setOnWarmupCompleted = CatalystInstanceImplPendingJSCall.onWarmupCompleted();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            logValue = indicatorViewAccess100.getLogValue();
            int i3 = asInterface + 3;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 5;
            }
        } else {
            int i5 = onTransact + 45;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            logValue = null;
        }
        String eventName = isNumber.TOSS_FACE.getEventName();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        IAuthTabCallback(this, setOnWarmupCompleted, logValue, eventName, j, str, (String) null, (String) null, indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLoginYN() : null, (String) null, (Function1) null, 768, (Object) null);
    }

    public final void onNavigationEvent(@NotNull TypeUtils4 typeUtils4, @NotNull String str, long j, @NotNull String str2, @NotNull String str3) throws Throwable {
        String logValue;
        String loginYN;
        String str4 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils4, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            int i2 = onTransact + 29;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                logValue = indicatorViewAccess100.getLogValue();
                int i3 = 69 / 0;
            } else {
                logValue = indicatorViewAccess100.getLogValue();
            }
        } else {
            logValue = null;
        }
        if (logValue == null) {
            int i4 = onTransact + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str4 = logValue;
        }
        String eventName = isNumber.TOSS_FACE.getEventName();
        String logValue2 = typeUtils4.getLogValue();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        if (indicatorViewAccess1002 != null) {
            int i6 = onTransact + 85;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                loginYN = indicatorViewAccess1002.getLoginYN();
                int i7 = 29 / 0;
            } else {
                loginYN = indicatorViewAccess1002.getLoginYN();
            }
        } else {
            loginYN = null;
        }
        onNavigationEvent(this, str4, eventName, logValue2, str, null, null, 0, j, null, loginYN, str2, null, str3, null, 10608, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(o.SetDetectableSize r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.asMaplambda6.onTransact
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.asMaplambda6.asInterface = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L51
            if (r7 == 0) goto L1e
            int r2 = r2 + 15
            int r1 = r2 % 128
            o.asMaplambda6.onTransact = r1
            int r2 = r2 % r0
            boolean r1 = kotlin.text.StringsKt.isBlank(r7)
            if (r1 == 0) goto L2d
        L1e:
            int r7 = o.asMaplambda6.asInterface
            int r7 = r7 + 73
            int r1 = r7 % 128
            o.asMaplambda6.onTransact = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L2c
            r7 = 5
            int r7 = r7 / 4
        L2c:
            r7 = r3
        L2d:
            r0 = 10
            char[] r0 = new char[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [-19393, 6598, 6907, 12365, -23175, 19013, -15445, -27862, -18741, 11433} // fill-array
            long r1 = android.os.SystemClock.currentThreadTimeMillis()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            int r1 = 11 - r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r0, r1, r2)
            r0 = 0
            r0 = r2[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r6.onExtraCallback(r0, r7)
            return
        L51:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asMaplambda6.onExtraCallbackWithResult(o.SetDetectableSize, java.lang.String):void");
    }

    public static /* synthetic */ void IAuthTabCallback(asMaplambda6 asmaplambda6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, Map map, int i, Object obj) {
        Map map2;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 512) != 0) {
            int i6 = i3 + 11;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            map2 = null;
        } else {
            map2 = map;
        }
        asmaplambda6.onWarmupCompleted(str, str2, str3, str4, str5, str6, str7, str8, j, (Map<String, ?>) map2);
        int i8 = asInterface + 15;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void onWarmupCompleted(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, @NotNull final String str7, @NotNull final String str8, final long j, @Nullable Map<String, ?> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223649L, false, (String) null, map, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return asMaplambda6.onWarmupCompleted(str, str2, str3, str4, str5, str6, str7, str8, j, (SetDetectableSize) obj);
            }
        }, 6, (Object) null);
        int i2 = onTransact + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        asMaplambda6 asmaplambda6 = (asMaplambda6) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        long jLongValue = ((Number) objArr[8]).longValue();
        Map<String, ?> map = (Map) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        Object obj = objArr[11];
        int i = 2 % 2;
        if ((iIntValue & 256) != 0) {
            int i2 = asInterface + 25;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            map = null;
        }
        asmaplambda6.IAuthTabCallback(str, str2, str3, str4, str5, str6, str7, jLongValue, map);
        int i3 = asInterface + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void IAuthTabCallback(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, @NotNull final String str7, final long j, @Nullable Map<String, ?> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223651L, false, (String) null, map, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return asMaplambda6.onExtraCallback(str, str2, str3, str4, str5, str6, str7, j, (SetDetectableSize) obj);
            }
        }, 6, (Object) null);
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, Color.red(0) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, 10 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        b(3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{7, 65535, 65528, 7, 65532}, (ViewConfiguration.getLongPressTimeout() >> 16) + 261, false, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        b(2 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, Drawable.resolveOpacity(0, 0) + 260, true, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        Object[] objArr5 = new Object[1];
        b((Process.myTid() >> 22) + 1, ExpandableListView.getPackedPositionGroup(0L) + 1, new char[]{0}, KeyEvent.keyCodeFromString("") + 201, true, objArr5);
        sb.append(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        b('7' - AndroidCharacter.getMirror('0'), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, new char[]{'\t', 5, 2, 65530, '\t', '\t', 65526, '\t', 3, 65528, 65524}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 260, true, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), sb.toString());
        Object[] objArr7 = new Object[1];
        b(11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, TextUtils.getTrimmedLength("") + 258, false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), str6);
        Object[] objArr8 = new Object[1];
        b(TextUtils.indexOf("", "", 0) + 14, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, 256 - View.resolveSizeAndState(0, 0, 0), false, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), str7);
        Object[] objArr9 = new Object[1];
        b(8 - TextUtils.indexOf((CharSequence) "", '0', 0), 8 + (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 257, true, objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), Long.valueOf(j));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(asMaplambda6 asmaplambda6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        onTransact = i3 % 128;
        asmaplambda6.onExtraCallbackWithResult(str, str2, str3, str4, str5, str6, str7, str8, j, (Map<String, ?>) ((i3 % 2 == 0 ? (i & 512) == 0 : (i & 26014) == 0) ? map : null));
        int i4 = onTransact + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, @NotNull final String str7, @NotNull final String str8, final long j, @Nullable Map<String, ?> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1223657L, false, (String) null, map, new Function1() { // from class: viva.republica.toss.password.log.SixPinTrackLog$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                String str9 = str;
                String str10 = str2;
                String str11 = str3;
                String str12 = str4;
                String str13 = str5;
                String str14 = str6;
                String str15 = str7;
                String str16 = str8;
                Long lValueOf = Long.valueOf(j);
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                return (Unit) asMaplambda6.onExtraCallbackWithResult(-6700073, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 6700073, new Object[]{str9, str10, str11, str12, str13, str14, str15, str16, lValueOf, (SetDetectableSize) obj});
            }
        }, 6, (Object) null);
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{47997, 37418, 60324, 44747, 15190, 38058, 9278, 1861}, 7 - Process.getGidForName(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{50091, 37674, 59354, 42951, 50516, 37068, 19531, 1491, 469, 39222, 22917, 5882}, 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        b(3 - TextUtils.indexOf("", "", 0, 0), 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{7, 65535, 65528, 7, 65532}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 260, false, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str3);
        Object[] objArr4 = new Object[1];
        b(2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - TextUtils.getOffsetAfter("", 0), new char[]{65529, 65528, 2, 3, 65533, '\b', 4, 65533, 6, 65527, 7}, 261 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str4);
        Object[] objArr5 = new Object[1];
        a(new char[]{14803, 28277, 35409, 47960, 57036, 20248, 19531, 1491, 15663, 10141, 33377, 30773}, 12 - View.getDefaultSize(0, 0), objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), str5);
        StringBuilder sb = new StringBuilder();
        sb.append(str6);
        Object[] objArr6 = new Object[1];
        b(Color.blue(0) + 1, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{0}, 201 - Color.argb(0, 0, 0, 0), true, objArr6);
        sb.append(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b(TextUtils.indexOf("", "") + 7, Gravity.getAbsoluteGravity(0, 0) + 11, new char[]{'\t', 5, 2, 65530, '\t', '\t', 65526, '\t', 3, 65528, 65524}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 260, true, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), sb.toString());
        Object[] objArr8 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, Gravity.getAbsoluteGravity(0, 0) + 11, new char[]{65528, 65535, 5, 65525, 65527, 11, '\n', 65534, 65525, 15, 4}, 258 - Drawable.resolveOpacity(0, 0), false, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), str7);
        Object[] objArr9 = new Object[1];
        b(View.MeasureSpec.getMode(0) + 14, View.MeasureSpec.getSize(0) + 17, new char[]{65527, 65529, '\r', '\f', 0, 65527, 65531, 0, 65533, 65531, 3, 65527, 17, 6, 65530, 1, 7}, 256 - Color.red(0), false, objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), str8);
        Object[] objArr10 = new Object[1];
        b(9 - ExpandableListView.getPackedPositionType(0L), 9 - (Process.myTid() >> 22), new char[]{65531, 0, 65526, 3, 65532, 5, 5, '\f', 65533}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 258, true, objArr10);
        setDetectableSize.onExtraCallback(((String) objArr10[0]).intern(), Long.valueOf(j));
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, Long.valueOf(j), setDetectableSize};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-6700073, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 6700073, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(781330039, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -781330033, new Object[]{setDetectableSize});
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, String str7, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, setDetectableSize};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1262232273, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1262232280, objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, String str4, String str5, String str6, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, setDetectableSize};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1061075937, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1061075939, objArr);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, setDetectableSize};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(193151386, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -193151381, objArr);
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, Long.valueOf(j), setDetectableSize};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(414347468, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -414347464, objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(asMaplambda6 asmaplambda6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, Map map, int i, Object obj) throws Throwable {
        Object[] objArr = {asmaplambda6, str, str2, str3, str4, str5, str6, str7, Long.valueOf(j), map, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1721522975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1721522972, objArr);
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) throws Throwable {
        Object[] objArr = {this, str, str2, str3, str4, str5, str6, str7};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onExtraCallbackWithResult(254313752, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -254313751, objArr);
    }

    static void onExtraCallback() {
        IAuthTabCallback = (char) 40995;
        onWarmupCompleted = (char) 8637;
        asBinder = (char) 20993;
        IAuthTabCallbackDefault = (char) 55982;
        IAuthTabCallbackStub = 478309041;
    }
}
