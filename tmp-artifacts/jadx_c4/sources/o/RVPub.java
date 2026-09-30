package o;

import android.graphics.Color;
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
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RVPub {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RVPub[] $VALUES;
    public static final RVPub FACE_EULER_ANGLE_FAIL;
    public static final RVPub FACE_EYE_CLOSED_DETECTED;
    public static final RVPub FACE_FAR_FROM_CENTER;
    public static final RVPub FACE_MASK_DETECTED;
    public static final RVPub FACE_NON_NEUTRAL_EXPRESSION_DETECTED;
    public static final RVPub FACE_OCCLUSION_DETECTED;
    public static final RVPub FACE_OUTSIDE_PREVIEW;
    public static final RVPub FACE_POSE_UNSTABLE;
    public static final RVPub FACE_POSITION_UNSTABLE;
    public static final RVPub FACE_RECOGNITION_QUALITY_LOW;
    public static final RVPub FACE_SIZE_UNSTABLE;
    public static final RVPub FACE_SUNGLASSES_DETECTED;
    public static final RVPub FACE_TOO_BIG;
    public static final RVPub FACE_TOO_BLURRY;
    public static final RVPub FACE_TOO_SMALL;
    private static int IAuthTabCallback;
    public static final RVPub IMAGE_BRIGHTNESS_TOO_HIGH;
    public static final RVPub IMAGE_BRIGHTNESS_TOO_LOW;
    public static final RVPub INPUT_IMAGE_EMPTY;
    public static final RVPub INPUT_IMAGE_NOT_READY;
    public static final RVPub NEAR_SAME_SIZE_FACES;
    public static final RVPub NO_FACE_IN_IMAGE;
    public static final RVPub NO_MAIN_FACE_IN_IMAGE;
    public static final RVPub PRE_BRIGHTNESS_TOO_HIGH;
    public static final RVPub PRE_BRIGHTNESS_TOO_LOW;
    public static final RVPub UNKNOWN;
    private static int asBinder;
    private static char[] onNavigationEvent;
    private static char onWarmupCompleted;
    private final String logName;
    private static final byte[] $$a = {115, -125, 45, -41};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static String $$c(short s, byte b, int i) {
        int i2 = (s * 3) + 105;
        int i3 = 4 - (b * 3);
        int i4 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i3 + i4;
            i3++;
            i2 = i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i3 = i7 + 1;
            i2 += bArr[i3];
        }
    }

    private static final /* synthetic */ RVPub[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RVPub[] rVPubArr = {PRE_BRIGHTNESS_TOO_LOW, PRE_BRIGHTNESS_TOO_HIGH, INPUT_IMAGE_NOT_READY, INPUT_IMAGE_EMPTY, NO_FACE_IN_IMAGE, NO_MAIN_FACE_IN_IMAGE, FACE_TOO_SMALL, FACE_TOO_BIG, NEAR_SAME_SIZE_FACES, FACE_OUTSIDE_PREVIEW, FACE_FAR_FROM_CENTER, FACE_MASK_DETECTED, FACE_SUNGLASSES_DETECTED, FACE_OCCLUSION_DETECTED, FACE_EYE_CLOSED_DETECTED, FACE_NON_NEUTRAL_EXPRESSION_DETECTED, FACE_EULER_ANGLE_FAIL, IMAGE_BRIGHTNESS_TOO_LOW, IMAGE_BRIGHTNESS_TOO_HIGH, FACE_TOO_BLURRY, FACE_SIZE_UNSTABLE, FACE_POSITION_UNSTABLE, FACE_POSE_UNSTABLE, FACE_RECOGNITION_QUALITY_LOW, UNKNOWN};
        int i5 = i3 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return rVPubArr;
    }

    public static EnumEntries<RVPub> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RVPub(String str, int i, String str2) {
        this.logName = str2;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        asBinder = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{15, 4, 65535, 65535, 15, 65532, 65535, 7, 0, 2, 65525, 15, 65522, 2, 65529, 65527, 65528, 4, 65534, 65525, 3, 3}, false, (ViewConfiguration.getEdgeSlop() >> 16) + 82, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((byte) (126 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getEdgeSlop() >> 16) + 27, new char[]{31, 14, '(', 22, 3, 19, '\t', '\r', 22, '.', 15, '#', 13927, 13927, 22, '/', 13939, 13939, 23, '\f', '\f', '-', 27, '(', 29, '\r', 13940}, objArr2);
        PRE_BRIGHTNESS_TOO_LOW = new RVPub(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b((byte) (TextUtils.getCapsMode("", 0, 0) + 113), 22 - Process.getGidForName(""), new char[]{15, 23, '(', '!', '$', 26, 31, '+', '.', '\t', '(', 28, 13882, 13882, 25, '\f', 13894, 13894, 23, '/', 31, '+', 13891}, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 28, 8 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65534, 0, '\t', 65529, 65526, 65532, '\t', 7, 3, 0, 65528, 65533, 65526, 65535, 65534, 0, 65535, 65526, 6, 6, 11, 65526, '\n', '\n', 65532, 5, 11, 65535}, true, 106 - MotionEvent.axisFromString(""), objArr4);
        PRE_BRIGHTNESS_TOO_HIGH = new RVPub(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b((byte) (85 - ((byte) KeyEvent.getModifierMetaStateMask())), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21, new char[]{28, '$', 23, ',', '\f', 25, '\"', '+', 3, ',', '(', '!', '$', 0, '\f', 25, 26, 29, 4, 30, 13849}, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(Color.green(0) + 21, 7 - ExpandableListView.getPackedPositionChild(0L), new char[]{5, '\n', 65525, '\b', 65531, 65527, 65530, 15, 65535, 4, 6, 11, '\n', 65525, 65535, 3, 65527, 65533, 65531, 65525, 4}, false, KeyEvent.normalizeMetaState(0) + 108, objArr6);
        INPUT_IMAGE_NOT_READY = new RVPub(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, Color.green(0) + 9, new char[]{65522, 65534, 65530, 16, 5, 6, 1, 65535, 65530, '\n', 5, 1, 65534, 65526, 16, 65526, 65528}, true, 80 - TextUtils.lastIndexOf("", '0', 0), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b((byte) (53 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 11 - ExpandableListView.getPackedPositionGroup(0L), new char[]{'&', 1, 29, '*', 19, 27, '\n', 1, '!', '\r', 13876}, objArr8);
        INPUT_IMAGE_EMPTY = new RVPub(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 17, new char[]{65529, 65531, 65525, 1, 65533, 19, 2, 65533, 19, 65529, 65527, 65525, 65530, 19, 3, 2}, true, 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b((byte) (TextUtils.indexOf("", "") + 105), 7 - ExpandableListView.getPackedPositionType(0L), new char[]{17, 7, 27, '(', 28, '\r', 13928}, objArr10);
        NO_FACE_IN_IMAGE = new RVPub(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a(21 - (ViewConfiguration.getTapTimeout() >> 16), 2 - ExpandableListView.getPackedPositionGroup(0L), new char[]{3, 2, 65529, 65531, 65525, 1, 65533, 19, 2, 65533, 19, 65529, 65527, 65525, 65530, 19, 2, 65533, 65525, 1, 19}, true, 78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b((byte) (81 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 12, new char[]{17, 7, 24, 5, 29, '\r', 19, 21, '0', ')', '\b', '#'}, objArr12);
        NO_MAIN_FACE_IN_IMAGE = new RVPub(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        b((byte) (KeyEvent.keyCodeFromString("") + 48), (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, new char[]{23, 3, 5, 28, 25, '\f', 13829, 13829, 27, 21, ',', 6, 13830, 13830}, objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 115), 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{'-', '\b', '\f', 24, '&', 4, 30, '\r', '\f', 23, '0', ')', '\b', '#'}, objArr14);
        FACE_TOO_SMALL = new RVPub(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        b((byte) (76 - MotionEvent.axisFromString("")), TextUtils.indexOf("", "") + 12, new char[]{23, 3, 5, 28, 25, '\f', 13858, 13858, '!', '/', 31, '+'}, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a(12 - (ViewConfiguration.getLongPressTimeout() >> 16), 5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{65529, 0, 65531, 65533, 65535, 14, '\t', '\t', 65529, 65532, 3, 1}, false, 104 - Gravity.getAbsoluteGravity(0, 0), objArr16);
        FACE_TOO_BIG = new RVPub(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a(20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, new char[]{6, 18, 65528, 0, 65524, 6, 18, 5, 65524, 65528, 1, 6, 65528, 65526, 65524, 65529, 18, 65528, '\r', 65532}, true, 79 - KeyEvent.keyCodeFromString(""), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a(14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 5 - View.resolveSize(0, 0), new char[]{65529, '\f', 65531, 65535, '\b', 65535, 65533, 65531, 0, 65529, 65535, 7, 65531, '\r'}, true, (ViewConfiguration.getTapTimeout() >> 16) + 104, objArr18);
        NEAR_SAME_SIZE_FACES = new RVPub(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(20 - ExpandableListView.getPackedPositionType(0L), 16 - KeyEvent.getDeadChar(0, 0), new char[]{18, 2, '\b', 7, 6, 65532, 65527, 65528, 18, 3, 5, 65528, '\t', 65532, 65528, '\n', 65529, 65524, 65526, 65528}, false, (Process.myTid() >> 22) + 79, objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a(16 - TextUtils.getCapsMode("", 0, 0), 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{'\b', 65524, '\t', '\n', 4, '\f', 65530, 65534, 11, 65530, 7, 5, 65524, 65530, 65529, 65534}, true, 109 - View.resolveSizeAndState(0, 0, 0), objArr20);
        FACE_OUTSIDE_PREVIEW = new RVPub(strIntern10, 9, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6), 20 - Drawable.resolveOpacity(0, 0), new char[]{23, 3, 5, 28, 27, 25, 1, 23, 27, 25, 29, '\b', '/', 27, 5, 28, '\'', 7, 29, 26}, objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b((byte) (44 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{'0', ')', 19, 24, '&', 20, 17, '\n', 21, '\f', '#', 15, 1, '+', 13844}, objArr22);
        FACE_FAR_FROM_CENTER = new RVPub(strIntern11, 10, ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        b((byte) (50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 19, new char[]{23, 3, 5, 28, 27, '/', 6, 23, '!', 24, '!', '\"', '\f', ' ', 4, 7, '\"', '!'}, objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a(Color.alpha(0) + 9, 6 - TextUtils.lastIndexOf("", '0', 0), new char[]{'\f', 4, 65528, 65535, 65530, 2, 5, 6, 65530}, false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 105, objArr24);
        FACE_MASK_DETECTED = new RVPub(strIntern12, 11, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        b((byte) (101 - TextUtils.indexOf((CharSequence) "", '0', 0)), 23 - Process.getGidForName(""), new char[]{23, 3, 5, 28, 27, 21, '&', '$', '.', 3, 6, 23, 26, '\"', 21, 27, '!', '\"', '\f', ' ', 4, 7, '\"', '!'}, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a('?' - AndroidCharacter.getMirror('0'), 4 - Color.red(0), new char[]{65532, 65527, 65535, 2, '\t', 11, 4, 65533, 2, 65527, '\t', '\t', 65531, '\t', 65525}, false, KeyEvent.getDeadChar(0, 0) + 108, objArr26);
        FACE_SUNGLASSES_DETECTED = new RVPub(strIntern13, 12, ((String) objArr26[0]).intern());
        Object[] objArr27 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0') + 31), 23 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{23, 3, 5, 28, 22, 5, 13815, 13815, 2, '\'', 22, '\"', 0, '$', 25, '!', ' ', '\f', 28, 5, '\f', ' ', 13820}, objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 14, (ViewConfiguration.getFadingEdgeLength() >> 16) + 10, new char[]{'\f', '\n', 0, 6, 5, 65526, 65533, 65528, 0, 3, 6, 65530, 65530, 3}, false, Color.green(0) + 107, objArr28);
        FACE_OCCLUSION_DETECTED = new RVPub(strIntern14, 13, ((String) objArr28[0]).intern());
        Object[] objArr29 = new Object[1];
        a(25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 23, new char[]{65526, 65528, 65530, 20, 65530, 14, 65530, 20, 65528, 1, 4, '\b', 65530, 65529, 20, 65529, 65530, '\t', 65530, 65528, '\t', 65530, 65529, 65531}, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 77, objArr29);
        String strIntern15 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 8, 3 - TextUtils.getCapsMode("", 0, 0), new char[]{65530, 2, 5, 65534, 18, 65534, 65528, 65535}, false, ExpandableListView.getPackedPositionType(0L) + 105, objArr30);
        FACE_EYE_CLOSED_DETECTED = new RVPub(strIntern15, 14, ((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        b((byte) (84 - TextUtils.indexOf("", "", 0)), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{23, 3, 5, 28, 21, '(', 0, '$', 21, '(', 30, '(', '\b', 25, 3, 5, '!', '(', ',', 14, 26, 29, 13853, 13853, '$', '\b', '(', 21, '!', '\"', '\f', ' ', 4, 7, '\"', '!'}, objArr31);
        String strIntern16 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        a(23 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getTrimmedLength("") + 10, new char[]{'\b', '\b', 65534, 4, 3, 65524, 65531, 65526, 65534, 1, 3, 65530, '\n', '\t', 7, 65526, 1, 65524, 65530, '\r', 5, 7, 65530}, false, TextUtils.getOffsetAfter("", 0) + 109, objArr32);
        FACE_NON_NEUTRAL_EXPRESSION_DETECTED = new RVPub(strIntern16, 15, ((String) objArr32[0]).intern());
        Object[] objArr33 = new Object[1];
        a(21 - KeyEvent.normalizeMetaState(0), 21 - Color.argb(0, 0, 0, 0), new char[]{1, 65534, 65526, 65531, 20, 65530, 1, 65532, 3, 65526, 20, 7, 65530, 1, '\n', 65530, 20, 65530, 65528, 65526, 65531}, true, Color.argb(0, 0, 0, 0) + 77, objArr33);
        String strIntern17 = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        b((byte) (83 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 8 - TextUtils.lastIndexOf("", '0', 0), new char[]{31, 7, '(', '%', 27, '(', 29, '\r', 13898}, objArr34);
        FACE_EULER_ANGLE_FAIL = new RVPub(strIntern17, 16, ((String) objArr34[0]).intern());
        Object[] objArr35 = new Object[1];
        b((byte) (38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 24 - KeyEvent.getDeadChar(0, 0), new char[]{'\"', '+', 3, ',', '(', '!', '$', 26, 31, '+', '.', '\t', '(', 28, 13807, 13807, 25, '\f', 13819, 13819, 25, 5, 4, 15}, objArr35);
        String strIntern18 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, 9 - ExpandableListView.getPackedPositionChild(0L), new char[]{5, 65525, 2, 5, '\r', 65525, 65532, 65527, 65535, 2, 65528, '\b', 65535, 65533, 65534, '\n', 4, 65531, '\t', '\t', 65525, '\n', 5}, false, TextUtils.getOffsetAfter("", 0) + 108, objArr36);
        IMAGE_BRIGHTNESS_TOO_LOW = new RVPub(strIntern18, 17, ((String) objArr36[0]).intern());
        Object[] objArr37 = new Object[1];
        a(25 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 19, new char[]{7, 18, 6, 6, 65528, 1, 7, 65531, 65530, 65532, 5, 65525, 18, 65528, 65530, 65524, 0, 65532, 65531, 65530, 65532, 65531, 18, 2, 2}, true, 79 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr37);
        String strIntern19 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        b((byte) (View.combineMeasuredStates(0, 0) + 5), View.MeasureSpec.getMode(0) + 24, new char[]{3, 19, '\t', '\r', 22, '.', 15, '#', 13806, 13806, 22, '/', 13818, 13818, 27, 26, '\t', '\r', 26, 27, '0', ')', '\t', '\n'}, objArr38);
        IMAGE_BRIGHTNESS_TOO_HIGH = new RVPub(strIntern19, 18, ((String) objArr38[0]).intern());
        Object[] objArr39 = new Object[1];
        a(15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{6, 1, 1, 17, 65524, 65534, 7, 4, 4, 11, 65528, 65523, 65525, 65527, 17}, false, 80 - (ViewConfiguration.getScrollBarSize() >> 8), objArr39);
        String strIntern20 = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        b((byte) (TextUtils.getOffsetAfter("", 0) + 94), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, new char[]{2, '\f', 31, 16, 27, '(', 29, '\r', 13908}, objArr40);
        FACE_TOO_BLURRY = new RVPub(strIntern20, 19, ((String) objArr40[0]).intern());
        Object[] objArr41 = new Object[1];
        b((byte) (114 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{23, 3, 5, 28, 27, 21, 30, 22, '(', '!', '&', '$', 25, '\r', 5, '%', 5, ' '}, objArr41);
        String strIntern21 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        b((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 116), TextUtils.getOffsetAfter("", 0) + 23, new char[]{'0', ')', '\b', '#', 25, '(', 11, '+', '(', 22, 28, 16, '$', '.', '!', 6, '\b', '%', 27, '(', 29, '\r', 13930}, objArr42);
        FACE_SIZE_UNSTABLE = new RVPub(strIntern21, 20, ((String) objArr42[0]).intern());
        Object[] objArr43 = new Object[1];
        a(Process.getGidForName("") + 23, TextUtils.indexOf("", "") + 16, new char[]{2, 6, 65532, 7, 65532, 2, 1, 18, '\b', 1, 6, 7, 65524, 65525, 65535, 65528, 65529, 65524, 65526, 65528, 18, 3}, false, View.MeasureSpec.getSize(0) + 79, objArr43);
        String strIntern22 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        b((byte) (108 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{'0', ')', '\b', '#', 27, '!', '$', '\n', '(', 25, 28, 16, '$', '.', '!', 6, '\b', '%', 27, '(', 29, '\r', 13921}, objArr44);
        FACE_POSITION_UNSTABLE = new RVPub(strIntern22, 21, ((String) objArr44[0]).intern());
        Object[] objArr45 = new Object[1];
        a(17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{3, 4, 19, 65529, 65527, 65525, 65530, 65529, 0, 65526, 65525, '\b', 7, 2, '\t', 19, 65529, 7}, true, (ViewConfiguration.getEdgeSlop() >> 16) + 78, objArr45);
        String strIntern23 = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        a(22 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionType(0L) + 9, new char[]{65533, 11, 7, '\b', 65527, 65533, 65531, 65529, 65534, 4, 1, 65529, 65534, 65527, 65533, 4, 65530, 65529, '\f', 11, 6, '\r', 65527}, true, 107 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr46);
        FACE_POSE_UNSTABLE = new RVPub(strIntern23, 22, ((String) objArr46[0]).intern());
        Object[] objArr47 = new Object[1];
        b((byte) (70 - TextUtils.lastIndexOf("", '0')), 28 - Color.alpha(0), new char[]{23, 3, 5, 28, 27, 23, 28, 5, 3, '+', '$', 28, '\b', ' ', 0, '$', 27, '\f', ',', '\t', 1, ' ', '\f', 18, 25, 5, 4, 15}, objArr47);
        String strIntern24 = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, 13 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{5, 65523, 2, 3, 65533, '\b', 65533, 2, 65531, 3, 65527, 65529, 6, 11, 3, 0, 65523, '\r', '\b', 65533, 0, 65525, '\t'}, true, 109 - Process.getGidForName(""), objArr48);
        FACE_RECOGNITION_QUALITY_LOW = new RVPub(strIntern24, 23, ((String) objArr48[0]).intern());
        Object[] objArr49 = new Object[1];
        b((byte) (61 - TextUtils.indexOf("", "", 0, 0)), 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{'&', '$', 28, '&', 4, 15, 13841}, objArr49);
        String strIntern25 = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 7, 4 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, true, Color.green(0) + 114, objArr50);
        UNKNOWN = new RVPub(strIntern25, 24, ((String) objArr50[0]).intern());
        RVPub[] rVPubArr$values = $values();
        $VALUES = rVPubArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(rVPubArr$values);
        int i = asInterface + 53;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static RVPub valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RVPub rVPub = (RVPub) Enum.valueOf(RVPub.class, str);
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return rVPub;
    }

    public static RVPub[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        RVPub[] rVPubArr = (RVPub[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return rVPubArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - KeyEvent.getDeadChar(0, 0)), TextUtils.getCapsMode("", 0, 0) + 23, TextUtils.getTrimmedLength("") + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 12843), View.MeasureSpec.getMode(0) + 55, View.resolveSizeAndState(0, 0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i7 = $10 + 87;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 41;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) % 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, 2168 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    i4 = 2083011369;
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 12843), TextUtils.lastIndexOf("", '0') + 56, 2167 - View.MeasureSpec.makeMeasureSpec(0, 0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            int i10 = $10 + 123;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), Process.getGidForName("") + 27, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0') + 27, TextUtils.getOffsetAfter("", 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - TextUtils.getOffsetAfter("", 0)), 74 - View.combineMeasuredStates(0, 0), 8088 - View.combineMeasuredStates(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $10 + 21;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 30 - ExpandableListView.getPackedPositionType(0L), 19488 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        int i12 = $11 + 7;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i14 = $11 + 27;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 478308907;
        onNavigationEvent = new char[]{65008, 65020, 65010, 64990, 65023, 64977, 65011, 64976, 64986, 64991, 64988, 64999, 64980, 64994, 64989, 64973, 64995, 64961, 64996, 65002, 64970, 64968, 64993, 65001, 65013, 64987, 65004, 64992, 64963, 65018, 64966, 65016, 65015, 65014, 64978, 65021, 64982, 64998, 64971, 64960, 65009, 64981, 65003, 64967, 65019, 65012, 64969, 64964, 65022};
        onWarmupCompleted = (char) 51246;
    }
}
