package o;

import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BackdropScaffoldKtExternalSyntheticLambda9$onNavigationEvent implements DrawerStateExternalSyntheticLambda0 {
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
        return true;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public BackdropScaffoldKtExternalSyntheticLambda9$onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        this.onExtraCallbackWithResult = basicTextContextMenuProviderKtExternalSyntheticLambda4;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 3);
        drawerStateExternalSyntheticLambda1.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onExtraCallback().IAuthTabCallbackDefault("text/x-unknown").onExtraCallback(this.onExtraCallbackWithResult.isEngagementSignalsApiAvailable).onNavigationEvent());
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return drawerKtExternalSyntheticLambda9.onWarmupCompleted(Integer.MAX_VALUE) == -1 ? -1 : 0;
    }
}
