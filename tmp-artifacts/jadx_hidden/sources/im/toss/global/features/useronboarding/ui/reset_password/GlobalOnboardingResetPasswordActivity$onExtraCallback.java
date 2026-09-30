package im.toss.global.features.useronboarding.ui.reset_password;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class GlobalOnboardingResetPasswordActivity$onExtraCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalOnboardingResetPasswordActivity$onExtraCallback.class);
    final /* synthetic */ ComponentActivity IAuthTabCallback;

    public GlobalOnboardingResetPasswordActivity$onExtraCallback(ComponentActivity componentActivity) {
        this.IAuthTabCallback = componentActivity;
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 18) & 1) == 0) {
            return onExtraCallback();
        }
        int i3 = 60 / 0;
        return onExtraCallback();
    }

    public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 13) & 1) != 0) {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.IAuthTabCallback.getDefaultViewModelProviderFactory();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
            return defaultViewModelProviderFactory;
        }
        this.IAuthTabCallback.getDefaultViewModelProviderFactory();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
