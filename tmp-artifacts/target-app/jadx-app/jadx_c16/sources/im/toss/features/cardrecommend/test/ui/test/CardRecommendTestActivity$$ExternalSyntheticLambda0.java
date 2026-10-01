package im.toss.features.cardrecommend.test.ui.test;

import android.view.View;
import im.toss.features.payment.ui.autopay.R;
import im.toss.uikit.widget.textField.TextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CardRecommendTestActivity f$0;
    public final /* synthetic */ TextField f$1;
    public final /* synthetic */ getTypedExportedConstants f$2;

    public /* synthetic */ CardRecommendTestActivity$$ExternalSyntheticLambda0(CardRecommendTestActivity cardRecommendTestActivity, TextField textField, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = cardRecommendTestActivity;
        this.f$1 = textField;
        this.f$2 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) CardRecommendTestActivity.onNavigationEvent(422518954, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{this.f$0, this.f$1, this.f$2, (View) obj}, -422518953);
            int i3 = 81 / 0;
        } else {
            unit = (Unit) CardRecommendTestActivity.onNavigationEvent(422518954, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{this.f$0, this.f$1, this.f$2, (View) obj}, -422518953);
        }
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
