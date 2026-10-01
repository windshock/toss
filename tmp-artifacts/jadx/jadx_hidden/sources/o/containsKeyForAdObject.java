package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import o.AppNode61;
import o.makePFX_WINS;

/* loaded from: classes.dex */
public final class containsKeyForAdObject {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access100 = 1;
    private static int asBinder;
    private static char asInterface;
    private static final AppSetIdAndScope1 onExtraCallback;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2073681056 + (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{28363, 16100, 48235, 21706, 26310, 60016, 29126, 59187, 8087}, new char[]{0, 0, 0, 0}, new char[]{41144, 39388, 38011, 45588}, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), 1571417307 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{10279, 33227, 48091, 63895, 28106, 55462, 15667, 1652, 40803}, new char[]{0, 0, 0, 0}, new char[]{56096, 43500, 2397, 1638}, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19778), (-696418294) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{65281, 47628, 41834, 11833, 35294, 33588, 6677, 39050, 15946, 36879, 22000, 49638, 33861, 221, 41261}, new char[]{0, 0, 0, 0}, new char[]{3032, 32128, 17366, 49485}, objArr3);
        onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0), new char[]{41814, 33990, 50603, 34388, 32506, 59273, 60693, 25505, 63544, 49669, 51546, 22115}, new char[]{0, 0, 0, 0}, new char[]{10564, 20413, 12169, 7176}, objArr4);
        onExtraCallback = ea10.onExtraCallbackWithResult(((String) objArr4[0]).intern());
        int i = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static final AppSetIdAndScope1 onExtraCallbackWithResult() {
        AppSetIdAndScope1 appSetIdAndScope1;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 15;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            appSetIdAndScope1 = onExtraCallbackWithResult;
            int i4 = 96 / 0;
        } else {
            appSetIdAndScope1 = onExtraCallbackWithResult;
        }
        int i5 = i2 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return appSetIdAndScope1;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 117;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        onNavigationEvent = 7798559133331975163L;
        onTransact = -1776194565;
        asInterface = (char) 52667;
    }
}
