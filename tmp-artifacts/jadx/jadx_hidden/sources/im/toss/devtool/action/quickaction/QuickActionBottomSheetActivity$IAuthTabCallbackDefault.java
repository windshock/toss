package im.toss.devtool.action.quickaction;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class QuickActionBottomSheetActivity$IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(QuickActionBottomSheetActivity$IAuthTabCallbackDefault.class);
    final /* synthetic */ Function0 onExtraCallback;
    final /* synthetic */ ComponentActivity onWarmupCompleted;

    public QuickActionBottomSheetActivity$IAuthTabCallbackDefault(Function0 function0, ComponentActivity componentActivity) {
        this.onExtraCallback = function0;
        this.onWarmupCompleted = componentActivity;
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1) == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
        Function0 function0 = this.onExtraCallback;
        if (function0 != null) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
            if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
                int i3 = i2 & iOnWarmupCompleted;
                if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 7) & 1) != 0) {
                    int i4 = 81 / 0;
                }
                int i5 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
                if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 14) & 1) == 0) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.onWarmupCompleted.getDefaultViewModelCreationExtras();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        return defaultViewModelCreationExtras;
    }
}
