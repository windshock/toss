package o;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class _get_isNull_lambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private static String onExtraCallback;
    public static final _get_isNull_lambda0 onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static String onWarmupCompleted;

    static {
        onNavigationEvent();
        onExtraCallbackWithResult = new _get_isNull_lambda0();
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackStub + 47;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private _get_isNull_lambda0() {
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted = str;
        int i5 = i2 + 63;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback = str;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    public final int onExtraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 30 - ExpandableListView.getPackedPositionType(0L), 24887 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 29 - Process.getGidForName(""), 24887 - KeyEvent.keyCodeFromString(""), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue() + 1;
            int i4 = IAuthTabCallbackDefault + 99;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return iIntValue;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (setTestMode.onExtraCallback.onTransact() != asArray.PW_6_DIGIT || Build.VERSION.SDK_INT < 26) {
            Object[] objArr = new Object[1];
            a(new char[]{33192, 33227, 33789, 5832, 52539, 59361, 16329}, KeyEvent.keyCodeFromString(""), objArr);
            return ((String) objArr[0]).intern();
        }
        if (StringsKt.isBlank(isJacksonCreator.Companion.onNavigationEvent())) {
            Object[] objArr2 = new Object[1];
            a(new char[]{33192, 33227, 33789, 5832, 52539, 59361, 16329}, KeyEvent.normalizeMetaState(0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i4 = IAuthTabCallbackDefault + 97;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{20605, 20491, 30672, 58091, 59901, 49979, 40062}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        int i6 = IAuthTabCallbackDefault + 77;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 42 / 0;
        }
        return strIntern2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 123;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45812), 83 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 14185), 19 - (ViewConfiguration.getTouchSlop() >> 8), 8808 - (KeyEvent.getMaxKeyCode() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onNavigationEvent() {
        onNavigationEvent = -1576370108212908458L;
    }
}
