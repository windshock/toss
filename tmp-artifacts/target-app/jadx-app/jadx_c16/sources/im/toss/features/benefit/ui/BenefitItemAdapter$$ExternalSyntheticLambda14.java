package im.toss.features.benefit.ui;

import android.view.View;
import com.horcrux.svg.SvgPackage;
import o.RotationVectorAbility1$onWarmupCompleted;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda14 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getNameByOperatorName f$0;
    public final /* synthetic */ RotationVectorAbility1$onWarmupCompleted f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda14(getNameByOperatorName getnamebyoperatorname, RotationVectorAbility1$onWarmupCompleted rotationVectorAbility1$onWarmupCompleted) {
        this.f$0 = getnamebyoperatorname;
        this.f$1 = rotationVectorAbility1$onWarmupCompleted;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, view};
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -1032648328, 1032648331, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, view};
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr2, -1032648328, 1032648331, iOnExtraCallbackWithResult2, SvgPackage.21.onExtraCallbackWithResult());
        int i3 = onWarmupCompleted + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
