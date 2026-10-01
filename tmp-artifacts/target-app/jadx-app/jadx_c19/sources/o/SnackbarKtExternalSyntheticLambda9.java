package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarKtExternalSyntheticLambda9 implements DrawerStateExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda2 onWarmupCompleted = new ExposedDropdownMenu_androidKtExternalSyntheticLambda2(-1, -1, "image/webp");

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.onExtraCallbackWithResult.onExtraCallback(4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallback(), 0, 4);
        if (this.onExtraCallbackWithResult.onActivityResized() != 1380533830) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(4);
        this.onExtraCallbackWithResult.onExtraCallback(4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallback(), 0, 4);
        return this.onExtraCallbackWithResult.onActivityResized() == 1464156752;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onWarmupCompleted.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return this.onWarmupCompleted.onWarmupCompleted(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onWarmupCompleted.onNavigationEvent(j, j2);
    }
}
