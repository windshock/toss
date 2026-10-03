package o;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class fromBundle {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ fromBundle[] $VALUES;
    public static final fromBundle BANK_ACCOUNT;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final fromBundle TOSS_ACCOUNT;
    public static final fromBundle UNKNOWN;
    public static final fromBundle USER;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    private static final /* synthetic */ fromBundle[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        fromBundle[] frombundleArr = {USER, BANK_ACCOUNT, TOSS_ACCOUNT, UNKNOWN};
        int i5 = i3 + 105;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return frombundleArr;
        }
        throw null;
    }

    public static EnumEntries<fromBundle> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static fromBundle valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        fromBundle frombundle = (fromBundle) Enum.valueOf(fromBundle.class, str);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallbackStub + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return frombundle;
    }

    public static fromBundle[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        fromBundle[] frombundleArr = (fromBundle[]) $VALUES.clone();
        int i4 = onNavigationEvent + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return frombundleArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private fromBundle(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        USER = new fromBundle("USER", 0);
        BANK_ACCOUNT = new fromBundle("BANK_ACCOUNT", 1);
        TOSS_ACCOUNT = new fromBundle("TOSS_ACCOUNT", 2);
        Object[] objArr = new Object[1];
        a(new char[]{2743, 37359, 16809, 54788, 855, 18352, 53818, 16786}, '7' - AndroidCharacter.getMirror('0'), objArr);
        UNKNOWN = new fromBundle(((String) objArr[0]).intern(), 3);
        fromBundle[] frombundleArr$values = $values();
        $VALUES = frombundleArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(frombundleArr$values);
        int i = asInterface + 109;
        onTransact = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % i4 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i6] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i6] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i6;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i6];
                char[] cArr4 = cArr3;
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[i4] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        int packedPositionType = 12434 - ExpandableListView.getPackedPositionType(0L);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, edgeSlop, packedPositionType, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    int i11 = $10 + 111;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i4 = 2;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i3 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.alpha(0)), TextUtils.indexOf("", "") + 14, (KeyEvent.getMaxKeyCode() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i4 = i3;
            cArr3 = cArr5;
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 8470;
        onExtraCallbackWithResult = (char) 7964;
        onWarmupCompleted = (char) 50481;
        IAuthTabCallback = (char) 34558;
    }
}
