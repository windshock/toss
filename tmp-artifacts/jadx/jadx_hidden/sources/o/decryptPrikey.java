package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class decryptPrikey {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ decryptPrikey[] $VALUES;
    public static final decryptPrikey APP;
    public static final onWarmupCompleted Companion;
    private static byte[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    public static final decryptPrikey MINI_APP;
    public static final decryptPrikey REACT_NATIVE;
    public static final decryptPrikey WEB;
    private static long asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static short[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final String typeName;
    private final String typeNameForAppium;

    private static final /* synthetic */ decryptPrikey[] $values() {
        decryptPrikey[] decryptprikeyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            decryptPrikey decryptprikey = APP;
            decryptPrikey decryptprikey2 = WEB;
            decryptPrikey decryptprikey3 = REACT_NATIVE;
            decryptPrikey decryptprikey4 = MINI_APP;
            decryptprikeyArr = new decryptPrikey[2];
            decryptprikeyArr[0] = decryptprikey;
            decryptprikeyArr[0] = decryptprikey2;
            decryptprikeyArr[4] = decryptprikey3;
            decryptprikeyArr[4] = decryptprikey4;
        } else {
            decryptprikeyArr = new decryptPrikey[]{APP, WEB, REACT_NATIVE, MINI_APP};
        }
        int i4 = i3 + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return decryptprikeyArr;
    }

    public static EnumEntries<decryptPrikey> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<decryptPrikey> enumEntries = $ENTRIES;
        int i4 = i3 + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return enumEntries;
    }

    public static decryptPrikey valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        decryptPrikey decryptprikey = (decryptPrikey) Enum.valueOf(decryptPrikey.class, str);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return decryptprikey;
    }

    public static decryptPrikey[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        decryptPrikey[] decryptprikeyArr = (decryptPrikey[]) $VALUES.clone();
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return decryptprikeyArr;
    }

    private decryptPrikey(String str, int i, String str2, String str3) {
        this.typeName = str2;
        this.typeNameForAppium = str3;
    }

    public final String getTypeName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.typeName;
        int i4 = i3 + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTypeNameForAppium() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.typeNameForAppium;
        int i5 = i3 + 59;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (((byte) KeyEvent.getModifierMetaStateMask()) - 52), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 119), 1542598652 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-523714709) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-31155) - Color.alpha(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{38730, 9838, 53909, 32568, 38793, 37067, 23571, 41620}, -ImageFormat.getBitsPerPixel(0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) (View.resolveSizeAndState(0, 0, 0) + 30), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 4), (ViewConfiguration.getTapTimeout() >> 16) + 1542598655, (-523714708) - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 31156, objArr3);
        APP = new decryptPrikey(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        b(new char[]{36022, 36065, 23875, 14303, 47041, 25137, 17881}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27), (byte) ((-72) - Color.blue(0)), (Process.myTid() >> 22) + 1542598665, Color.blue(0) - 523663836, (-31155) - KeyEvent.keyCodeFromString(""), objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(new char[]{58883, 58964, 14643, 21423, 53223, 6679, 39957, 56513, 19764, 17873, 20131, 30655, 45198, 37440}, 1 - Color.argb(0, 0, 0, 0), objArr6);
        WEB = new decryptPrikey(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b(new char[]{21572, 21526, 6326, 29226, 64504, 11787, 29733, 13549, 65396, 25672, 31392, 40843, 728, 46018, 55252, 58163}, View.MeasureSpec.getSize(0) + 1, objArr7);
        String strIntern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(new char[]{49126, 1610, 9936, 35176, 62947, 62185, 34044, 50263, 42406, 22561, 42501, 53535}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr8);
        String strIntern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 89), (byte) (19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1542598666 + (ViewConfiguration.getEdgeSlop() >> 16), 49069 - AndroidCharacter.getMirror('0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 31155, objArr9);
        REACT_NATIVE = new decryptPrikey(strIntern5, 2, strIntern6, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        b(new char[]{52521, 52580, 49608, 43864, 20777, 34005, 34848, 51426, 26130, 48420, 53359, 25503}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
        String strIntern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a((short) (KeyEvent.normalizeMetaState(0) + 83), (byte) (KeyEvent.getDeadChar(0, 0) + 91), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1542598675, MotionEvent.axisFromString("") - 523666652, KeyEvent.keyCodeFromString("") - 31155, objArr11);
        String strIntern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((short) (25 - TextUtils.lastIndexOf("", '0', 0)), (byte) (View.getDefaultSize(0, 0) - 69), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1542598677, (-523714696) - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 31156, objArr12);
        MINI_APP = new decryptPrikey(strIntern7, 3, strIntern8, ((String) objArr12[0]).intern());
        decryptPrikey[] decryptprikeyArr$values = $values();
        $VALUES = decryptprikeyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(decryptprikeyArr$values);
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallbackDefault + 75;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 37;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 73;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, asBinder);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r15, byte r16, int r17, int r18, int r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.decryptPrikey.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 4851724;
        onExtraCallbackWithResult = -1538809414;
        onExtraCallback = -1150248739;
        onNavigationEvent = new short[]{24153, -10075, -10076, 24144, 10207, 10198, 10233, 10205, 10214, 10210, 10205, 10198, 10205, 24135, 24159, -10115, -10140, -10189, -10113, -10188, -10168, -10155, -10176, 24153, -13673, 11824, 24149, 10128, 10153, -10202, 10130, -10183, -10179, 10130, 10153, 10130, -10185, 10139, -10194, 10156, -10203};
        asBinder = 7529701346788774357L;
    }
}
