package o;

import android.os.Process;
import android.view.ViewConfiguration;
import im.toss.devtool.sharedpref.presentation.SharedPrefEditViewModel;
import o.AppNode61;
import o.makePFX_WINS;

/* loaded from: classes.dex */
public final class getActivityStartIntent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    static SharedPrefEditViewModel keepFieldType;
    public static String onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a((char) (Process.myTid() >> 22), 1063878487 + (ViewConfiguration.getTouchSlop() >> 8), new char[]{55843, 19342, 27993, 39505, 49509, 51076, 36759, 26252, 61867, 19423, 50034, 27822, 55927, 53813, 64913, 27837, 23699, 54952, 16226, 57404, 16294, 12020, 6307, 11518, 43531, 10168, 21116, 35024, 15054, 14758, 31967, 9737, 39313, 58947, 11001, 52631, 14472, 55072, 58469, 7659, 1357, 34803, 33613, 34245, 34345, 8622, 41510, 64843, 28381, 64782, 64673, 11427, 11743, 55579, 32835, 61916, 24353, 30359, 33042, 12530, 65347, 14401, 41720}, new char[]{27512, 7394, 46325, 19554}, new char[]{22523, 27007, 61759, 3457}, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        int i = onNavigationEvent + 75;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
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
        int i3 = $10 + 119;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 2330815957150400643L;
        IAuthTabCallback = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
