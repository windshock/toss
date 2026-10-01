package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.enums.EnumEntries;
import o.s5a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IconRoundCornerProgressBarSavedState1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconRoundCornerProgressBarSavedState1[] $VALUES;
    public static final IconRoundCornerProgressBarSavedState1 DEBUGGER;
    public static final IconRoundCornerProgressBarSavedState1 EMULATOR;
    public static final IconRoundCornerProgressBarSavedState1 HOOK;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    public static final IconRoundCornerProgressBarSavedState1 ROOT;
    public static final IconRoundCornerProgressBarSavedState1 TAMPER_CERT;
    public static final IconRoundCornerProgressBarSavedState1 VIRTUAL_ENVIRONMENT;
    private static int asBinder = 1;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final String id;

    private static final /* synthetic */ IconRoundCornerProgressBarSavedState1[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        IconRoundCornerProgressBarSavedState1[] iconRoundCornerProgressBarSavedState1Arr = {DEBUGGER, EMULATOR, ROOT, HOOK, TAMPER_CERT, VIRTUAL_ENVIRONMENT};
        int i5 = i2 + 3;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return iconRoundCornerProgressBarSavedState1Arr;
    }

    public static EnumEntries<IconRoundCornerProgressBarSavedState1> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        EnumEntries<IconRoundCornerProgressBarSavedState1> enumEntries = $ENTRIES;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static IconRoundCornerProgressBarSavedState1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBarSavedState1 iconRoundCornerProgressBarSavedState1 = (IconRoundCornerProgressBarSavedState1) Enum.valueOf(IconRoundCornerProgressBarSavedState1.class, str);
        int i4 = onNavigationEvent + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return iconRoundCornerProgressBarSavedState1;
    }

    public static IconRoundCornerProgressBarSavedState1[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBarSavedState1[] iconRoundCornerProgressBarSavedState1Arr = $VALUES;
        if (i3 != 0) {
            return (IconRoundCornerProgressBarSavedState1[]) iconRoundCornerProgressBarSavedState1Arr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private IconRoundCornerProgressBarSavedState1(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, TextUtils.getCapsMode("", 0, 0) + 8, (char) (19445 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((byte) (65 - KeyEvent.getDeadChar(0, 0)), Color.green(0) + 8, new char[]{1, '\b', 16, 19, 13886, 13886, 7, 21}, objArr2);
        DEBUGGER = new IconRoundCornerProgressBarSavedState1(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(8 - TextUtils.getOffsetAfter("", 0), 8 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.getOffsetAfter("", 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(16 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr4);
        EMULATOR = new IconRoundCornerProgressBarSavedState1(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(View.getDefaultSize(0, 0) + 24, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 28, 4 - (ViewConfiguration.getTouchSlop() >> 8), (char) (AndroidCharacter.getMirror('0') - '0'), objArr6);
        ROOT = new IconRoundCornerProgressBarSavedState1(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 4 - (Process.myTid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0') + 49799), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b((byte) (84 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 4 - View.MeasureSpec.getSize(0), new char[]{5, '\b', 6, '\f'}, objArr8);
        HOOK = new IconRoundCornerProgressBarSavedState1(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 23), 11 - Color.red(0), new char[]{15, 4, '\t', 23, 15, 11, 2, 16, 15, 11, 13797}, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 36, 4 - TextUtils.indexOf("", "", 0, 0), (char) (Color.blue(0) + 32733), objArr10);
        TAMPER_CERT = new IconRoundCornerProgressBarSavedState1(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a(40 - View.MeasureSpec.makeMeasureSpec(0, 0), 19 - Color.alpha(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b((byte) (116 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, new char[]{11, 22, 23, 24, 19, '\r', 11, 3, 7, 1, 11, 22, 2, '\f', 0, 22, 7, 1, 13921}, objArr12);
        VIRTUAL_ENVIRONMENT = new IconRoundCornerProgressBarSavedState1(strIntern6, 5, ((String) objArr12[0]).intern());
        IconRoundCornerProgressBarSavedState1[] iconRoundCornerProgressBarSavedState1Arr$values = $values();
        $VALUES = iconRoundCornerProgressBarSavedState1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(iconRoundCornerProgressBarSavedState1Arr$values);
        int i = onTransact + 15;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallback[i + i5]), i5, onExtraCallbackWithResult, c);
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallback[i + i6]), i6, onExtraCallbackWithResult, c);
            }
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                int i8 = 16 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r22, int r23, char[] r24, java.lang.Object[] r25) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IconRoundCornerProgressBarSavedState1.b(byte, int, char[], java.lang.Object[]):void");
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{42596, 39455, 56982, 4891, 22415, 34821, 52409, 292, 60817, 53731, 38261, 22774, 7293, 50146, 34631, 19152, 60849, 53699, 38229, 22742, 7261, 50114, 34663, 19184, 60806, 53729, 38255, 22766, 60838, 53697, 38223, 22734, 12058, 4967, 22505, 39543, 37482, 44566, 60047, 10003, 60802, 53735, 38258, 22766, 7273, 50167, 34628, 19165, 3649, 52688, 45382, 29859, 14398, 65449, 41782, 26303, 10801, 59776, 44308};
        onExtraCallbackWithResult = -9204351825316163154L;
        IAuthTabCallback = new char[]{65010, 65004, 64989, 64983, 64980, 65013, 64982, 64988, 65022, 64987, 64993, 64984, 64965, 64991, 64978, 64977, 65014, 65008, 64966, 64999, 64990, 64986, 64961, 64967, 64995};
        onWarmupCompleted = (char) 51244;
    }
}
