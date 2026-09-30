package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.matches;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBaseActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ComposeBaseActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ComposeBaseActivity$$ExternalSyntheticLambda6(ComposeBaseActivity composeBaseActivity, int i) {
        this.f$0 = composeBaseActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ComposeBaseActivity composeBaseActivity = this.f$0;
        int i4 = this.f$1;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {composeBaseActivity, Integer.valueOf(i4), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        Unit unit = (Unit) ComposeBaseActivity.IAuthTabCallback(matches.onExtraCallback(), -751275699, objArr, 751275700, matches.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
        int i5 = IAuthTabCallback + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return unit;
    }
}
