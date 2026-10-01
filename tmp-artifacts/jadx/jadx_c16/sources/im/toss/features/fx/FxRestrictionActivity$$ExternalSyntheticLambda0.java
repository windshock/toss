package im.toss.features.fx;

import android.view.View;
import im.toss.features.fx.model.ExchangeRestrictionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxRestrictionActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FxRestrictionActivity f$0;
    public final /* synthetic */ ExchangeRestrictionInfo f$1;

    public /* synthetic */ FxRestrictionActivity$$ExternalSyntheticLambda0(FxRestrictionActivity fxRestrictionActivity, ExchangeRestrictionInfo exchangeRestrictionInfo) {
        this.f$0 = fxRestrictionActivity;
        this.f$1 = exchangeRestrictionInfo;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = FxRestrictionActivity.onExtraCallback(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
