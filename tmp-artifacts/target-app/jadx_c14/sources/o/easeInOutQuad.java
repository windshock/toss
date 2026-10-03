package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class easeInOutQuad {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ easeInOutQuad[] $VALUES;
    public static final easeInOutQuad BIRTHDAY;
    public static final easeInOutQuad GENDER;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    public static final easeInOutQuad MOBILE_CARRIER;
    public static final easeInOutQuad PHONE_NUMBER;
    public static final easeInOutQuad RRN;
    public static final easeInOutQuad USER_NAME;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final String logName;

    private static final /* synthetic */ easeInOutQuad[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        easeInOutQuad[] easeinoutquadArr = {USER_NAME, PHONE_NUMBER, BIRTHDAY, RRN, GENDER, MOBILE_CARRIER};
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return easeinoutquadArr;
    }

    public static EnumEntries<easeInOutQuad> getEntries() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<easeInOutQuad> enumEntries = $ENTRIES;
        int i5 = i3 + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static easeInOutQuad valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        easeInOutQuad easeinoutquad = (easeInOutQuad) Enum.valueOf(easeInOutQuad.class, str);
        int i4 = onNavigationEvent + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return easeinoutquad;
    }

    public static easeInOutQuad[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        easeInOutQuad[] easeinoutquadArr = (easeInOutQuad[]) $VALUES.clone();
        int i3 = asInterface + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return easeinoutquadArr;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 39;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (-16777139) - Color.rgb(0, 0, 0), Color.rgb(0, 0, 0) + 16798168, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.resolveSize(0, 0) + 75, (Process.myTid() >> 22) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i9 = 1052772399;
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 35;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] << iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12214 - Color.green(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i9 = 1052772399;
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i9 = 1052772399;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.normalizeMetaState(0) + 63, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 51;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    private easeInOutQuad(String str, int i, String str2) {
        this.logName = str2;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.logName;
        int i5 = i3 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, Process.getGidForName("") + 128, objArr);
        USER_NAME = new easeInOutQuad("USER_NAME", 0, ((String) objArr[0]).intern());
        PHONE_NUMBER = new easeInOutQuad("PHONE_NUMBER", 1, "phone_number");
        BIRTHDAY = new easeInOutQuad("BIRTHDAY", 2, "birthday");
        RRN = new easeInOutQuad("RRN", 3, "rrn");
        GENDER = new easeInOutQuad("GENDER", 4, "gender");
        MOBILE_CARRIER = new easeInOutQuad("MOBILE_CARRIER", 5, "carrier");
        easeInOutQuad[] easeinoutquadArr$values = $values();
        $VALUES = easeinoutquadArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(easeinoutquadArr$values);
        int i = IAuthTabCallbackDefault + 63;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{32506, 32463, 32507, 32451};
        onWarmupCompleted = -1184333976;
        IAuthTabCallback = true;
        onExtraCallbackWithResult = true;
    }
}
