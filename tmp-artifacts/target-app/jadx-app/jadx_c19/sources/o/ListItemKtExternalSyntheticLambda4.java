package o;

import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ListItemKtExternalSyntheticLambda4 implements DrawerStateExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda2 IAuthTabCallback = new ExposedDropdownMenu_androidKtExternalSyntheticLambda2(-1, -1, "image/heif");

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(4);
        return onNavigationEvent(drawerKtExternalSyntheticLambda9, 1718909296) && onNavigationEvent(drawerKtExternalSyntheticLambda9, Sniffer.BRAND_HEIC);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return this.IAuthTabCallback.onWarmupCompleted(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.IAuthTabCallback.onNavigationEvent(j, j2);
    }

    private boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        this.onExtraCallbackWithResult.onExtraCallback(4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallback(), 0, 4);
        return this.onExtraCallbackWithResult.onActivityResized() == ((long) i2);
    }
}
