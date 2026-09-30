package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ListItemKtOffsetToBaselineOrCenter11ExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private final DrawerStateExternalSyntheticLambda0 onExtraCallbackWithResult;

    public ListItemKtOffsetToBaselineOrCenter11ExternalSyntheticLambda0() {
        this(0);
    }

    public ListItemKtOffsetToBaselineOrCenter11ExternalSyntheticLambda0(int i2) {
        if ((i2 & 1) != 0) {
            this.onExtraCallbackWithResult = new ExposedDropdownMenu_androidKtExternalSyntheticLambda2(65496, 2, "image/jpeg");
        } else {
            this.onExtraCallbackWithResult = new ListItemKtExternalSyntheticLambda5();
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return this.onExtraCallbackWithResult.onExtraCallback(drawerKtExternalSyntheticLambda9);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return this.onExtraCallbackWithResult.onWarmupCompleted(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onExtraCallbackWithResult.onNavigationEvent(j, j2);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
        this.onExtraCallbackWithResult.onWarmupCompleted();
    }
}
