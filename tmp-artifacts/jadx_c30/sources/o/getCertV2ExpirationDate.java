package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCertV2ExpirationDate implements decryptForRecoveryKey {
    private final Function0<Integer> onExtraCallback;
    private final getCertV3ExpirationDate onWarmupCompleted;

    public getCertV2ExpirationDate(@NotNull getCertV3ExpirationDate getcertv3expirationdate, @NotNull Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(getcertv3expirationdate, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        this.onWarmupCompleted = getcertv3expirationdate;
        this.onExtraCallback = function0;
    }

    private final int onTransact() {
        return ((Number) this.onExtraCallback.invoke()).intValue();
    }

    @Override // o.decryptForRecoveryKey
    public void onNavigationEvent(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.onWarmupCompleted.onExtraCallback(new changeAppCertPassword(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), z, str, str2));
    }

    @Override // o.decryptForRecoveryKey
    public void onNavigationEvent(@NotNull getSignForPKCS7AndVIDRV2 getsignforpkcs7andvidrv2) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2, BuildConfig.FLAVOR);
        this.onWarmupCompleted.onExtraCallback(new changeCertV2Password(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), getsignforpkcs7andvidrv2));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallback(@NotNull getSignForPKCS7 getsignforpkcs7) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7, BuildConfig.FLAVOR);
        this.onWarmupCompleted.onExtraCallback(new FPUtilType(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), getsignforpkcs7));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult(@NotNull getSignForPKCS7AndVIDRV2NoContentsWithAttr getsignforpkcs7andvidrv2nocontentswithattr) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2nocontentswithattr, BuildConfig.FLAVOR);
        this.onWarmupCompleted.onExtraCallback(new deleteCertV2(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), getsignforpkcs7andvidrv2nocontentswithattr));
    }

    @Override // o.decryptForRecoveryKey
    public void onWarmupCompleted(double d, double d2) {
        this.onWarmupCompleted.onExtraCallback(new deleteAppCert(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), d, d2));
    }

    @Override // o.decryptForRecoveryKey
    public void onWarmupCompleted() {
        this.onWarmupCompleted.onExtraCallback(new generateKeyForHidingWithFP(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void IAuthTabCallback(boolean z) {
        this.onWarmupCompleted.onExtraCallback(new generateKeyForHidingWithPin(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), z));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult(double d, int i, int i2) {
        this.onWarmupCompleted.onExtraCallback(new generateKeyForPrivate(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), d, i, i2));
    }

    @Override // o.decryptForRecoveryKey
    public void IAuthTabCallback(boolean z, boolean z2, boolean z3) {
        this.onWarmupCompleted.onExtraCallback(new exportAppCert(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), z, z2, z3));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallback(float f) {
        this.onWarmupCompleted.onExtraCallback(new addVerficationCertV3(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), f));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult(float f) {
        this.onWarmupCompleted.onExtraCallback(new changeCertV3Password(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), f));
    }

    @Override // o.decryptForRecoveryKey
    public void IAuthTabCallbackDefault() {
        this.onWarmupCompleted.onExtraCallback(new ToolkitManager(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void IAuthTabCallbackStub() {
        this.onWarmupCompleted.onExtraCallback(new deleteCertV3(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult(boolean z) {
        this.onWarmupCompleted.onExtraCallback(new extractNPKIPWFromFinger(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), z));
    }

    @Override // o.decryptForRecoveryKey
    public void IAuthTabCallback() {
        this.onWarmupCompleted.onExtraCallback(new encryptForPrivateKey(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void asBinder() {
        this.onWarmupCompleted.onExtraCallback(new FPUtila(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void onNavigationEvent() {
        this.onWarmupCompleted.onExtraCallback(new unHideCertWithFinger(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallback() {
        this.onWarmupCompleted.onExtraCallback(new hideCert(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult() {
        this.onWarmupCompleted.onExtraCallback(new unHideCertWithPin(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact()));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallback(boolean z) {
        this.onWarmupCompleted.onExtraCallback(new generateKeyForRecovery(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), z));
    }

    @Override // o.decryptForRecoveryKey
    public void onExtraCallbackWithResult(double d, double d2) {
        this.onWarmupCompleted.onExtraCallback(new encryptForHidingPrivateKeyWithFinger(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), d, d2));
    }

    @Override // o.decryptForRecoveryKey
    public void onNavigationEvent(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onWarmupCompleted.onExtraCallback(new addVerficationCertV2(this.onWarmupCompleted.onExtraCallbackWithResult(), onTransact(), str, j));
    }
}
