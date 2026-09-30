package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getProgressText {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getProgressText[] $VALUES;
    public static final getProgressText AppLaunch;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final getProgressText MainTabClick;
    public static final getProgressText Unknown;
    private static int asBinder;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private final String attributeValue;

    private static final /* synthetic */ getProgressText[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getProgressText[] getprogresstextArr = {MainTabClick, AppLaunch, Unknown};
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return getprogresstextArr;
    }

    public static EnumEntries<getProgressText> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getProgressText> enumEntries = $ENTRIES;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getProgressText valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getProgressText getprogresstext = (getProgressText) Enum.valueOf(getProgressText.class, str);
        int i4 = IAuthTabCallbackStub + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getprogresstext;
    }

    public static getProgressText[] values() {
        getProgressText[] getprogresstextArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            getprogresstextArr = (getProgressText[]) $VALUES.clone();
            int i3 = 24 / 0;
        } else {
            getprogresstextArr = (getProgressText[]) $VALUES.clone();
        }
        int i4 = onNavigationEvent + 3;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return getprogresstextArr;
        }
        throw null;
    }

    private getProgressText(String str, int i, String str2) {
        this.attributeValue = str2;
    }

    public final String getAttributeValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.attributeValue;
        int i5 = i3 + 19;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    static {
        onExtraCallback();
        MainTabClick = new getProgressText("MainTabClick", 0, "main-tab-click");
        AppLaunch = new getProgressText("AppLaunch", 1, "app-launch");
        Object[] objArr = new Object[1];
        a(new char[]{2966, 53351, 33123, 16643, 19394, 63373, 20088, 32857}, 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        Unknown = new getProgressText("Unknown", 2, ((String) objArr[0]).intern());
        getProgressText[] getprogresstextArr$values = $values();
        $VALUES = getprogresstextArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getprogresstextArr$values);
        int i = asBinder + 65;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, keyRepeatDelay, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getScrollBarSize() >> 8) + 10, (ViewConfiguration.getTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, (ViewConfiguration.getTouchSlop() >> 8) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 93;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 32795;
        IAuthTabCallback = (char) 9298;
        onExtraCallbackWithResult = (char) 31631;
        onWarmupCompleted = (char) 26102;
    }
}
