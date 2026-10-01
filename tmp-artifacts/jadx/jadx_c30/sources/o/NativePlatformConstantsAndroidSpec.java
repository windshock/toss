package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import net.sf.scuba.smartcards.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativePlatformConstantsAndroidSpec {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativePlatformConstantsAndroidSpec[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final NativePlatformConstantsAndroidSpec PLCC;
    public static final NativePlatformConstantsAndroidSpec SCRAP;
    public static final NativePlatformConstantsAndroidSpec TOSS_CHECK;
    public static final NativePlatformConstantsAndroidSpec UNKNOWN;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ NativePlatformConstantsAndroidSpec[] $values() {
        NativePlatformConstantsAndroidSpec[] nativePlatformConstantsAndroidSpecArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            NativePlatformConstantsAndroidSpec nativePlatformConstantsAndroidSpec = SCRAP;
            NativePlatformConstantsAndroidSpec nativePlatformConstantsAndroidSpec2 = TOSS_CHECK;
            NativePlatformConstantsAndroidSpec nativePlatformConstantsAndroidSpec3 = PLCC;
            NativePlatformConstantsAndroidSpec nativePlatformConstantsAndroidSpec4 = UNKNOWN;
            nativePlatformConstantsAndroidSpecArr = new NativePlatformConstantsAndroidSpec[5];
            nativePlatformConstantsAndroidSpecArr[1] = nativePlatformConstantsAndroidSpec;
            nativePlatformConstantsAndroidSpecArr[0] = nativePlatformConstantsAndroidSpec2;
            nativePlatformConstantsAndroidSpecArr[2] = nativePlatformConstantsAndroidSpec3;
            nativePlatformConstantsAndroidSpecArr[4] = nativePlatformConstantsAndroidSpec4;
        } else {
            nativePlatformConstantsAndroidSpecArr = new NativePlatformConstantsAndroidSpec[]{SCRAP, TOSS_CHECK, PLCC, UNKNOWN};
        }
        int i4 = i3 + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return nativePlatformConstantsAndroidSpecArr;
    }

    public static EnumEntries<NativePlatformConstantsAndroidSpec> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<NativePlatformConstantsAndroidSpec> enumEntries = $ENTRIES;
        int i4 = i3 + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static NativePlatformConstantsAndroidSpec valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativePlatformConstantsAndroidSpec nativePlatformConstantsAndroidSpec = (NativePlatformConstantsAndroidSpec) Enum.valueOf(NativePlatformConstantsAndroidSpec.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return nativePlatformConstantsAndroidSpec;
    }

    public static NativePlatformConstantsAndroidSpec[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativePlatformConstantsAndroidSpec[] nativePlatformConstantsAndroidSpecArr = (NativePlatformConstantsAndroidSpec[]) $VALUES.clone();
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return nativePlatformConstantsAndroidSpecArr;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 9;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), 84 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getTapTimeout() >> 16)), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 8808 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $10 + 37;
                $11 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private NativePlatformConstantsAndroidSpec(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        SCRAP = new NativePlatformConstantsAndroidSpec("SCRAP", 0);
        TOSS_CHECK = new NativePlatformConstantsAndroidSpec("TOSS_CHECK", 1);
        PLCC = new NativePlatformConstantsAndroidSpec("PLCC", 2);
        Object[] objArr = new Object[1];
        a(new char[]{18956, 26008, 10844, 11006, 19033, 52185, 30217, 8349, 62079, 900, 15944}, -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr);
        UNKNOWN = new NativePlatformConstantsAndroidSpec(((String) objArr[0]).intern(), 3);
        NativePlatformConstantsAndroidSpec[] nativePlatformConstantsAndroidSpecArr$values = $values();
        $VALUES = nativePlatformConstantsAndroidSpecArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativePlatformConstantsAndroidSpecArr$values);
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -1855564577112075005L;
    }
}
