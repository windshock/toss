package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFillColor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setFillColor[] $VALUES;
    public static final setFillColor DISABLED;
    public static final setFillColor ENABLED;
    private static int IAuthTabCallback = 1;
    public static final setFillColor NOT_REQUIRED;
    public static final setFillColor UNKNOWN;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private static final /* synthetic */ setFillColor[] $values() {
        setFillColor[] setfillcolorArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            setFillColor setfillcolor = UNKNOWN;
            setFillColor setfillcolor2 = ENABLED;
            setFillColor setfillcolor3 = DISABLED;
            setFillColor setfillcolor4 = NOT_REQUIRED;
            setfillcolorArr = new setFillColor[3];
            setfillcolorArr[1] = setfillcolor;
            setfillcolorArr[1] = setfillcolor2;
            setfillcolorArr[5] = setfillcolor3;
            setfillcolorArr[4] = setfillcolor4;
        } else {
            setfillcolorArr = new setFillColor[]{UNKNOWN, ENABLED, DISABLED, NOT_REQUIRED};
        }
        int i4 = i3 + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setfillcolorArr;
    }

    public static EnumEntries<setFillColor> getEntries() {
        EnumEntries<setFillColor> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 95 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static setFillColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setFillColor setfillcolor = (setFillColor) Enum.valueOf(setFillColor.class, str);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return setfillcolor;
    }

    public static setFillColor[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setFillColor[] setfillcolorArr = $VALUES;
        if (i3 != 0) {
            return (setFillColor[]) setfillcolorArr.clone();
        }
        throw null;
    }

    private setFillColor(String str, int i) {
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{36595, 36518, 45171, 59929, 20979, 10702, 27954, 2436, 14498, 51222, 25428}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr);
        UNKNOWN = new setFillColor(((String) objArr[0]).intern(), 0);
        ENABLED = new setFillColor("ENABLED", 1);
        DISABLED = new setFillColor("DISABLED", 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{54508, 54434, 46028, 55924, 21069, 6588, 9519, 21382, 15118, 32794, 21305, 44269, 56021, 41505, 52213, 13188}, TextUtils.getTrimmedLength(""), objArr2);
        NOT_REQUIRED = new setFillColor(((String) objArr2[0]).intern(), 3);
        setFillColor[] setfillcolorArr$values = $values();
        $VALUES = setfillcolorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setfillcolorArr$values);
        int i = IAuthTabCallback + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final boolean getCanUseAdMob() {
        int i = 2 % 2;
        if (this == ENABLED) {
            return true;
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == NOT_REQUIRED) {
            return true;
        }
        int i5 = i2 + 19;
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 99;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 66 / 0;
        }
        return false;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 83;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 4;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 84, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14185), 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $10 + 75;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 39323871191472834L;
    }
}
