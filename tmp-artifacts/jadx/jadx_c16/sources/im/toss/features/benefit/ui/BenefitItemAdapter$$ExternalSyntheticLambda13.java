package im.toss.features.benefit.ui;

import android.view.View;
import com.horcrux.svg.SvgPackage;
import o.RotationVectorAbility1$onWarmupCompleted;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda13 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ getNameByOperatorName f$0;
    public final /* synthetic */ RotationVectorAbility1$onWarmupCompleted f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda13(getNameByOperatorName getnamebyoperatorname, RotationVectorAbility1$onWarmupCompleted rotationVectorAbility1$onWarmupCompleted) {
        this.f$0 = getnamebyoperatorname;
        this.f$1 = rotationVectorAbility1$onWarmupCompleted;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, view};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        getNameByOperatorName.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, 450882592, -450882592, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }
}
