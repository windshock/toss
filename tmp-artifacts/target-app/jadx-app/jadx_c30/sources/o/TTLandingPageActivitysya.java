package o;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class TTLandingPageActivitysya {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static long asBinder = 0;
    private static int asInterface = 1;
    static final String onExtraCallbackWithResult;
    private static int onTransact = 1;
    private final byte[] onExtraCallback;
    private final byte[] onNavigationEvent;
    private final int onWarmupCompleted;

    static SecretKeySpec IAuthTabCallback(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{47910, 14535, 47975, 3210, 41398, 16049, 47746}, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1, objArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return secretKeySpec;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 71;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - Process.getGidForName(BuildConfig.FLAVOR)), 83 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 21233 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 14185), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, 8808 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    byte[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.onNavigationEvent;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onWarmupCompleted;
        if (i3 != 0) {
            int i5 = 46 / 0;
        }
        return i4;
    }

    byte[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.onExtraCallback;
        int i5 = i3 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return bArr;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{43757, 21956, 43692, 29879, 52405, 18060, 2026, 52313, 52862, 43906, 58316, 14249, 25347, 14207, 35055, 37559, 34041, 37380, 5126, 64904, 14794}, ViewConfiguration.getEdgeSlop() >> 16, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{47910, 14535, 47975, 3210, 41398, 16049, 47746}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        int i = IAuthTabCallbackStub + 51;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    static void IAuthTabCallback() {
        asBinder = 4492720468954899000L;
    }
}
