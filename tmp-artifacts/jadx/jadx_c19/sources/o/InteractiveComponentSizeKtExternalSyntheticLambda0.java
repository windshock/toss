package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class InteractiveComponentSizeKtExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda2 onNavigationEvent = new ExposedDropdownMenu_androidKtExternalSyntheticLambda2(16973, 2, "image/bmp");

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9);
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
}
