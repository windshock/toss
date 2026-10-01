package im.toss.feature.credit.ui.quiz.next;

import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizNextInfoActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditQuizNextInfoActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CreditQuizNextInfoActivity$$ExternalSyntheticLambda8(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2) {
        this.f$0 = creditQuizNextInfoActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizNextInfoActivity creditQuizNextInfoActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {creditQuizNextInfoActivity, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            return (Unit) CreditQuizNextInfoActivity.IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 573224578, -573224575);
        }
        Object[] objArr2 = {creditQuizNextInfoActivity, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
