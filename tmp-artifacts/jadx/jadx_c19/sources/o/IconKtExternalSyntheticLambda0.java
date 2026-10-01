package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IconKtExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda2 onNavigationEvent = new ExposedDropdownMenu_androidKtExternalSyntheticLambda2(-1, -1, "image/avif");

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(4);
        return IAuthTabCallback(drawerKtExternalSyntheticLambda9, 1718909296) && IAuthTabCallback(drawerKtExternalSyntheticLambda9, 1635150182);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onNavigationEvent.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return this.onNavigationEvent.onWarmupCompleted(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onNavigationEvent.onNavigationEvent(j, j2);
    }

    private boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        this.onExtraCallback.onExtraCallback(4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.onExtraCallback(), 0, 4);
        return this.onExtraCallback.onActivityResized() == ((long) i2);
    }
}
