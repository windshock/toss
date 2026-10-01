package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMixedContentMode extends setCalculationMethod {
    private final wie2 onExtraCallback;
    private int onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMixedContentMode(@NotNull setPreProgressHundred setpreprogresshundred, @NotNull wie2 wie2Var) {
        super(setpreprogresshundred);
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        this.onExtraCallback = wie2Var;
    }

    @Override // o.setCalculationMethod
    public void onWarmupCompleted() {
        onExtraCallbackWithResult(true);
        this.onExtraCallbackWithResult++;
    }

    @Override // o.setCalculationMethod
    public void asInterface() {
        this.onExtraCallbackWithResult--;
    }

    @Override // o.setCalculationMethod
    public void onExtraCallback() {
        onExtraCallbackWithResult(false);
        onExtraCallbackWithResult("\n");
        int i = this.onExtraCallbackWithResult;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = {this.onExtraCallback.IAuthTabCallback()};
            onExtraCallbackWithResult((String) changeVideoState.onExtraCallback(309595837, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -309595836, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()));
        }
    }

    @Override // o.setCalculationMethod
    public void IAuthTabCallback() {
        if (onExtraCallbackWithResult()) {
            onExtraCallbackWithResult(false);
        } else {
            onExtraCallback();
        }
    }

    @Override // o.setCalculationMethod
    public void onNavigationEvent() {
        onExtraCallback(' ');
    }
}
