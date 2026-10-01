package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExposedDropdownMenuDefaultsExternalSyntheticLambda0 implements DrawerKtExternalSyntheticLambda9 {
    private final DrawerKtExternalSyntheticLambda9 onExtraCallbackWithResult;

    public ExposedDropdownMenuDefaultsExternalSyntheticLambda0(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) {
        this.onExtraCallbackWithResult = drawerKtExternalSyntheticLambda9;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        return this.onExtraCallbackWithResult.onWarmupCompleted(bArr, i2, i3);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallback(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.onExtraCallbackWithResult.onExtraCallback(bArr, i2, i3, z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onNavigationEvent(byte[] bArr, int i2, int i3) throws IOException {
        this.onExtraCallbackWithResult.onNavigationEvent(bArr, i2, i3);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onWarmupCompleted(int i2) throws IOException {
        return this.onExtraCallbackWithResult.onWarmupCompleted(i2);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean IAuthTabCallback(int i2, boolean z) throws IOException {
        return this.onExtraCallbackWithResult.IAuthTabCallback(i2, z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onExtraCallback(int i2) throws IOException {
        this.onExtraCallbackWithResult.onExtraCallback(i2);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onExtraCallbackWithResult(byte[] bArr, int i2, int i3) throws IOException {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(bArr, i2, i3);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallbackWithResult(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(bArr, i2, i3, z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void IAuthTabCallback(byte[] bArr, int i2, int i3) throws IOException {
        this.onExtraCallbackWithResult.IAuthTabCallback(bArr, i2, i3);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallbackWithResult(int i2, boolean z) throws IOException {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(i2, z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void IAuthTabCallback(int i2) throws IOException {
        this.onExtraCallbackWithResult.IAuthTabCallback(i2);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long onWarmupCompleted() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long IAuthTabCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }
}
