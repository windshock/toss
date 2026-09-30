package im.toss.splittarget.impl.fsm;

import android.os.Process;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.findSnapView;
import o.setCustomPostBody;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class AppStateImpl$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;
    private static int onWarmupCompleted;
    public final /* synthetic */ setCustomPostBody f$0;

    public /* synthetic */ AppStateImpl$$ExternalSyntheticLambda11(setCustomPostBody setcustompostbody) {
        this.f$0 = setcustompostbody;
    }

    public static int onWarmupCompleted() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 7101080;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        onNavigationEvent = elapsedCpuTime;
        return elapsedCpuTime;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (findSnapView.IAuthTabCallback) obj};
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (findSnapView.IAuthTabCallback) obj};
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) setCustomPostBody.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1659670441, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, 1659670445);
        int i3 = onExtraCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
