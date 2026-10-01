package im.toss.global.features.useronboarding.ui.reset_password;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class GlobalOnboardingResetPasswordActivity$IAuthTabCallback implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalOnboardingResetPasswordActivity$IAuthTabCallback.class);
    final /* synthetic */ ComponentActivity onWarmupCompleted;

    public GlobalOnboardingResetPasswordActivity$IAuthTabCallback(ComponentActivity componentActivity) {
        this.onWarmupCompleted = componentActivity;
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        if ((((IAuthTabCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161)) >> 26) & 1) == 0) {
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }
        throw null;
    }

    public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 18) & 1) != 0) {
            return this.onWarmupCompleted.getViewModelStore();
        }
        int i3 = 46 / 0;
        return this.onWarmupCompleted.getViewModelStore();
    }
}
