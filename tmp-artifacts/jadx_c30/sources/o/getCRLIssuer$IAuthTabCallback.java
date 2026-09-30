package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class getCRLIssuer$IAuthTabCallback {
    public static final /* synthetic */ int[] onExtraCallback;

    static {
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1810677814);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 35, View.MeasureSpec.makeMeasureSpec(0, 0) + 7094, 1521237670, false, "values", new Class[0]);
            }
            int[] iArr = new int[((Object[]) ((Method) objOnExtraCallback).invoke(null, null)).length];
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-756916776);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 34 - KeyEvent.getDeadChar(0, 0), 7094 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -475880632, false, "CORE", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback2).get(null)).ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), KeyEvent.getDeadChar(0, 0) + 34, 7094 - KeyEvent.getDeadChar(0, 0), 160994366, false, "INVEST", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback3).get(null)).ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1874122086);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 34, 7093 - ExpandableListView.getPackedPositionChild(0L), 1593060342, false, "PAYMENTS", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback4).get(null)).ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1884816975);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), 34 - ExpandableListView.getPackedPositionType(0L), 7094 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1092155615, false, "INSURANCE", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback5).get(null)).ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2146115061);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 34 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7094, 1319887717, false, "BANK", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback6).get(null)).ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1346832636);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 34, 7095 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1627911788, false, "PLACE", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback7).get(null)).ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(66504750);
                if (objOnExtraCallback8 == null) {
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 34 - (ViewConfiguration.getTouchSlop() >> 8), 7094 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 850802366, false, "CX", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback8).get(null)).ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Object objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1199488219);
                if (objOnExtraCallback9 == null) {
                    objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 34 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7094, 1983791691, false, "MOBILE", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback9).get(null)).ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Object objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1995443614);
                if (objOnExtraCallback10 == null) {
                    objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 34 - Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 7094, -1202778894, false, "INCOME", (Class[]) null);
                }
                iArr[((Enum) ((Field) objOnExtraCallback10).get(null)).ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            onExtraCallback = iArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
