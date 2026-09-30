package o;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setScrollingCacheEnabled {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setScrollingCacheEnabled[] $VALUES;
    public static final setScrollingCacheEnabled BLOCKED;
    public static final setScrollingCacheEnabled CONSENT_REQUIRED;
    public static final onNavigationEvent Companion;
    public static final setScrollingCacheEnabled ERROR;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    public static final setScrollingCacheEnabled INVALID_REQUEST;
    public static final setScrollingCacheEnabled LIMITED_AD;
    public static final setScrollingCacheEnabled NO_AD;
    public static final setScrollingCacheEnabled OK;
    public static final setScrollingCacheEnabled TEST_MODE;
    public static final setScrollingCacheEnabled TIMEOUT;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    private static final /* synthetic */ setScrollingCacheEnabled[] $values() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setScrollingCacheEnabled[] setscrollingcacheenabledArr = {OK, NO_AD, BLOCKED, ERROR, TIMEOUT, INVALID_REQUEST, LIMITED_AD, CONSENT_REQUIRED, TEST_MODE};
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return setscrollingcacheenabledArr;
    }

    public static EnumEntries<setScrollingCacheEnabled> getEntries() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setScrollingCacheEnabled valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setScrollingCacheEnabled setscrollingcacheenabled = (setScrollingCacheEnabled) Enum.valueOf(setScrollingCacheEnabled.class, str);
        if (i3 != 0) {
            return setscrollingcacheenabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setScrollingCacheEnabled[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        setScrollingCacheEnabled[] setscrollingcacheenabledArr = (setScrollingCacheEnabled[]) $VALUES.clone();
        int i3 = asInterface + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return setscrollingcacheenabledArr;
        }
        obj.hashCode();
        throw null;
    }

    private setScrollingCacheEnabled(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        OK = new setScrollingCacheEnabled("OK", 0);
        NO_AD = new setScrollingCacheEnabled("NO_AD", 1);
        BLOCKED = new setScrollingCacheEnabled("BLOCKED", 2);
        ERROR = new setScrollingCacheEnabled("ERROR", 3);
        TIMEOUT = new setScrollingCacheEnabled("TIMEOUT", 4);
        Object[] objArr = new Object[1];
        a(new char[]{1230, 64036, 39655, 51348, 4590, 12531, 32628, 39247, 48975, 27982, 9889, 43154, 37934, 57737, 52405, 3240}, ExpandableListView.getPackedPositionType(0L) + 15, objArr);
        INVALID_REQUEST = new setScrollingCacheEnabled(((String) objArr[0]).intern(), 5);
        LIMITED_AD = new setScrollingCacheEnabled("LIMITED_AD", 6);
        CONSENT_REQUIRED = new setScrollingCacheEnabled("CONSENT_REQUIRED", 7);
        TEST_MODE = new setScrollingCacheEnabled("TEST_MODE", 8);
        setScrollingCacheEnabled[] setscrollingcacheenabledArr$values = $values();
        $VALUES = setscrollingcacheenabledArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setscrollingcacheenabledArr$values);
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final setScrollingCacheEnabled onExtraCallback(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = setScrollingCacheEnabled.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((setScrollingCacheEnabled) next).name(), str)) {
                    int i4 = IAuthTabCallback + 121;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 15;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    obj = next;
                    break;
                }
            }
            setScrollingCacheEnabled setscrollingcacheenabled = (setScrollingCacheEnabled) obj;
            if (setscrollingcacheenabled != null) {
                return setscrollingcacheenabled;
            }
            int i9 = onWarmupCompleted + 115;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return setScrollingCacheEnabled.ERROR;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 49;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 47;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, longPressTimeout, jumpTapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, TextUtils.getTrimmedLength("") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16014), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, 19900 - MotionEvent.axisFromString(""), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 4031;
        IAuthTabCallback = (char) 4749;
        onExtraCallbackWithResult = (char) 22005;
        onWarmupCompleted = (char) 4366;
    }
}
