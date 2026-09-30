package o;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getConsentDialogState {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getConsentDialogState[] $VALUES;
    public static final getConsentDialogState BADGE_UPDATE;
    public static final getConsentDialogState CMA_ID_AUTH;
    public static final onExtraCallback Companion;
    public static final getConsentDialogState DELETE_NOTIFICATION;
    public static final getConsentDialogState DEVICE_CHANGED;
    public static final getConsentDialogState DUTCH_PAY;
    public static final getConsentDialogState FACEPAY_SILENT_PUSH;
    public static final getConsentDialogState GUEST;
    public static final getConsentDialogState HAPPY_TALK;
    public static final getConsentDialogState HEALTH_CHECK;
    private static int IAuthTabCallback = 1;
    public static final getConsentDialogState MOBILE_ID_RESET;
    public static final getConsentDialogState NEED_REGISTER;
    public static final getConsentDialogState NOTHING;
    public static final getConsentDialogState NOTICE;
    public static final getConsentDialogState PAYMENT;
    public static final getConsentDialogState POINT_BACK;
    public static final getConsentDialogState PUSH_TOKEN_REFRESH;
    public static final getConsentDialogState SCHEME;
    public static final getConsentDialogState SMS_RECEIVE_COMPLETED;
    public static final getConsentDialogState SMS_SEND;
    public static final getConsentDialogState TOSS_ALARM;
    public static final getConsentDialogState TYPE_1;
    public static final getConsentDialogState TYPE_100;
    public static final getConsentDialogState UNKNOWN;
    public static final getConsentDialogState USER_GROWTH_BLE_SCAN;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean serverSilent;
    private final String serverValue;

    private static final /* synthetic */ getConsentDialogState[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getConsentDialogState[] getconsentdialogstateArr = {USER_GROWTH_BLE_SCAN, NEED_REGISTER, TYPE_1, TYPE_100, SMS_SEND, SMS_RECEIVE_COMPLETED, NOTICE, DEVICE_CHANGED, PAYMENT, DUTCH_PAY, SCHEME, HAPPY_TALK, POINT_BACK, TOSS_ALARM, CMA_ID_AUTH, BADGE_UPDATE, DELETE_NOTIFICATION, NOTHING, HEALTH_CHECK, PUSH_TOKEN_REFRESH, MOBILE_ID_RESET, FACEPAY_SILENT_PUSH, GUEST, UNKNOWN};
        int i5 = i2 + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getconsentdialogstateArr;
    }

    @JvmStatic
    public static final getConsentDialogState fromValue(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getConsentDialogState getconsentdialogstateIAuthTabCallback = Companion.IAuthTabCallback(str);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getconsentdialogstateIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<getConsentDialogState> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<getConsentDialogState> enumEntries = $ENTRIES;
        int i4 = i3 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static getConsentDialogState valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getConsentDialogState getconsentdialogstate = (getConsentDialogState) Enum.valueOf(getConsentDialogState.class, str);
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getconsentdialogstate;
    }

    public static getConsentDialogState[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getConsentDialogState[] getconsentdialogstateArr = (getConsentDialogState[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return getconsentdialogstateArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getConsentDialogState(String str, int i, String str2, boolean z) {
        this.serverValue = str2;
        this.serverSilent = z;
    }

    public final boolean getServerSilent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serverSilent;
        }
        throw null;
    }

    public final String getServerValue() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.serverValue;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    static {
        onExtraCallback();
        USER_GROWTH_BLE_SCAN = new getConsentDialogState("USER_GROWTH_BLE_SCAN", 0, "-1", true);
        NEED_REGISTER = new getConsentDialogState("NEED_REGISTER", 1, "1000", false);
        Object[] objArr = new Object[1];
        DefaultConstructorMarker defaultConstructorMarker = null;
        a(new int[]{0, 1, 182, 1}, true, null, objArr);
        TYPE_1 = new getConsentDialogState("TYPE_1", 2, ((String) objArr[0]).intern(), false);
        TYPE_100 = new getConsentDialogState("TYPE_100", 3, "100", false);
        SMS_SEND = new getConsentDialogState("SMS_SEND", 4, "101", false);
        SMS_RECEIVE_COMPLETED = new getConsentDialogState("SMS_RECEIVE_COMPLETED", 5, "103", false);
        NOTICE = new getConsentDialogState("NOTICE", 6, "201", false);
        DEVICE_CHANGED = new getConsentDialogState("DEVICE_CHANGED", 7, "202", false);
        PAYMENT = new getConsentDialogState("PAYMENT", 8, "301", false);
        DUTCH_PAY = new getConsentDialogState("DUTCH_PAY", 9, "501", false);
        SCHEME = new getConsentDialogState("SCHEME", 10, "1001", false);
        HAPPY_TALK = new getConsentDialogState("HAPPY_TALK", 11, "1002", false);
        POINT_BACK = new getConsentDialogState("POINT_BACK", 12, "1003", false);
        TOSS_ALARM = new getConsentDialogState("TOSS_ALARM", 13, "900", false);
        CMA_ID_AUTH = new getConsentDialogState("CMA_ID_AUTH", 14, "602", false);
        BADGE_UPDATE = new getConsentDialogState("BADGE_UPDATE", 15, "2000", false);
        DELETE_NOTIFICATION = new getConsentDialogState("DELETE_NOTIFICATION", 16, "10001", true);
        NOTHING = new getConsentDialogState("NOTHING", 17, "10002", true);
        HEALTH_CHECK = new getConsentDialogState("HEALTH_CHECK", 18, "10003", true);
        PUSH_TOKEN_REFRESH = new getConsentDialogState("PUSH_TOKEN_REFRESH", 19, "10004", true);
        MOBILE_ID_RESET = new getConsentDialogState("MOBILE_ID_RESET", 20, "10005", true);
        FACEPAY_SILENT_PUSH = new getConsentDialogState("FACEPAY_SILENT_PUSH", 21, "10006", true);
        GUEST = new getConsentDialogState("GUEST", 22, "5001", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{1, 7, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr2);
        UNKNOWN = new getConsentDialogState(((String) objArr2[0]).intern(), 23, "", false);
        getConsentDialogState[] getconsentdialogstateArr$values = $values();
        $VALUES = getconsentdialogstateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getconsentdialogstateArr$values);
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallback + 89;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        @JvmStatic
        public final getConsentDialogState IAuthTabCallback(@NotNull String str) {
            Object obj;
            Object next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = getConsentDialogState.getEntries().iterator();
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((getConsentDialogState) next).getServerValue(), str)) {
                    int i4 = IAuthTabCallback + 111;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
            }
            getConsentDialogState getconsentdialogstate = (getConsentDialogState) next;
            if (getconsentdialogstate != null) {
                return getconsentdialogstate;
            }
            int i6 = onExtraCallback + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            getConsentDialogState getconsentdialogstate2 = getConsentDialogState.UNKNOWN;
            int i8 = onExtraCallback + 99;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return getconsentdialogstate2;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 35, 14287 - AndroidCharacter.getMirror(c), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $10 + 39;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10935), 65 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16718 - (ViewConfiguration.getTouchSlop() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    int i10 = $11 + 121;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), Color.green(0) + 29, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 69, ((byte) KeyEvent.getModifierMetaStateMask()) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $10 + 67;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $11 + 77;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i18 = $10 + 111;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{27305, 27236, 27167, 27138, 27138, 27136, 27165, 27164};
    }
}
