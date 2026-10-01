package im.toss.features.edoc.wallet;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ DocumentWalletJoinLoadingActivity f$1;

    public /* synthetic */ DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda8(Ref.IntRef intRef, DocumentWalletJoinLoadingActivity documentWalletJoinLoadingActivity) {
        this.f$0 = intRef;
        this.f$1 = documentWalletJoinLoadingActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (Throwable) obj};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) DocumentWalletJoinLoadingActivity.onWarmupCompleted(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -980114649, iOnExtraCallbackWithResult, objArr, 980114653, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }
}
