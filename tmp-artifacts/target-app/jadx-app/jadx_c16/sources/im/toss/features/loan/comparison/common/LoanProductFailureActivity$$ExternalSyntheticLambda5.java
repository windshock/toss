package im.toss.features.loan.comparison.common;

import android.view.View;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ImagePipelineExternalSyntheticLambda4 f$0;
    public final /* synthetic */ LoanProductFailureActivity f$1;

    public /* synthetic */ LoanProductFailureActivity$$ExternalSyntheticLambda5(ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4, LoanProductFailureActivity loanProductFailureActivity) {
        this.f$0 = imagePipelineExternalSyntheticLambda4;
        this.f$1 = loanProductFailureActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, (View) obj};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (View) obj};
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Unit unit = (Unit) LoanProductFailureActivity.onWarmupCompleted(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -970580529, 970580533, iOnNavigationEvent3, iOnNavigationEvent4, objArr2);
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
