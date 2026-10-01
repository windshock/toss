package im.toss.devtool.action.quickaction;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.HttpDataSourceInvalidResponseCodeException;
import o.TimelineExternalSyntheticLambda1;
import o.getPageByNodeId;
import o.s5a;

/* loaded from: classes.dex */
final /* synthetic */ class QuickActionBottomSheetActivity$onWarmupCompleted extends FunctionReferenceImpl implements Function1<String, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallbackWithResult = {2732, 5866, 12850, 24159, 31651, 34770, 41788, 53085, 59571, 62691, 4149, 15478, 22970, 26102, 33076, 4685, 3595, 10963, 18110, 25410, 40755, 48093, 55228, 61522, 60418, 2260, 9367, 16731, 32023, 39381, 46552, 54883, 61956, 61132, 2714, 10058, 17221, 32709, 39817, 46153, 53249, 52362, 59575, 1367, 8464, 24008, 31118, 39544, 46693, 53940, 52874};
    private static long onExtraCallback = 8653033842975175061L;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$onWarmupCompleted(Object obj) {
        Object[] objArr = new Object[1];
        a(Process.myPid() >> 22, 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 59145), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 35 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 65515), objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((String) obj);
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 75;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallbackWithResult[i + i6]), i6, onExtraCallback, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
        }
        objArr[0] = new String(cArr);
    }
}
