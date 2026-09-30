package im.toss.devtool.action.quickaction;

import android.view.View;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.HttpDataSourceInvalidContentTypeException;
import o.HttpDataSourceInvalidResponseCodeException;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.makePFX_WINS;

/* loaded from: classes.dex */
final /* synthetic */ class QuickActionBottomSheetActivity$onTransact extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = -1776194565;
    private static char onExtraCallbackWithResult = 30690;
    private static int onNavigationEvent = 0;
    private static long onWarmupCompleted = 7798559133331975163L;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$onTransact(Object obj) {
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{57311, 35297, 52250, 23406, 47687, 2262, 4935, 24574, 14590, 32647, 61160, 59682}, new char[]{0, 0, 0, 0}, new char[]{18185, 15626, 10359, 50813}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 20770), View.MeasureSpec.makeMeasureSpec(0, 0) - 326427998, new char[]{1316, 8708, 42178, 64717, 57683, 18892, 45697, 31720, 49890, 45173, 15673, 21185, 27794, 40180, 33350, 54648, 54368, 15525, 32422, 899, 38394, 18566, 32734, 2654, 48666, 25468, 51491, 21297, 26214, 36721, 64348}, new char[]{0, 0, 0, 0}, new char[]{41530, 35610, 8940, 18513}, objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public final void IAuthTabCallback(List<String> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ((DevToolActionListViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(list);
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((List) obj);
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        int i4 = 9 / 0;
        return Unit.INSTANCE;
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
        int i3 = $10 + 29;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 109;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }
}
