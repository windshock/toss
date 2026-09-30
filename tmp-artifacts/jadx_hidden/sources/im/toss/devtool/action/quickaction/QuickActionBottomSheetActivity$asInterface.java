package im.toss.devtool.action.quickaction;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class QuickActionBottomSheetActivity$asInterface implements Function0<ViewModelProvider.onWarmupCompleted> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(QuickActionBottomSheetActivity$asInterface.class);
    final /* synthetic */ ComponentActivity IAuthTabCallback;

    public QuickActionBottomSheetActivity$asInterface(ComponentActivity componentActivity) {
        this.IAuthTabCallback = componentActivity;
    }

    public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
        ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.IAuthTabCallback.getDefaultViewModelProviderFactory();
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 15) & 1) != 0) {
            int i5 = 11 / 0;
        }
        return defaultViewModelProviderFactory;
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 23) & 1) == 0) {
            IAuthTabCallback();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
        int i3 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
        int i4 = i3 & iOnWarmupCompleted2;
        if ((((((i3 ^ iOnWarmupCompleted2) | i4) & (~i4)) >> 17) & 1) != 0) {
            return onwarmupcompletedIAuthTabCallback;
        }
        throw null;
    }
}
