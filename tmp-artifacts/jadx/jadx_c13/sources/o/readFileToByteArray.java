package o;

import android.content.Context;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface readFileToByteArray {
    void IAuthTabCallback(float f);

    void IAuthTabCallback(@NotNull String str);

    void IAuthTabCallback(@NotNull CertUtil certUtil);

    void IAuthTabCallback(@NotNull FPUtil fPUtil);

    void IAuthTabCallback(@NotNull transV2GetOtherRole transv2getotherrole, int i);

    void IAuthTabCallback(@NotNull verifyPass verifypass);

    void IAuthTabCallback(boolean z);

    void IAuthTabCallbackDefault(boolean z);

    void IAuthTabCallbackStub(boolean z);

    void asBinder(boolean z);

    void asInterface(boolean z);

    View onExtraCallback(@NotNull Context context);

    void onExtraCallback();

    void onExtraCallback(@NotNull String str);

    void onExtraCallback(@NotNull String str, boolean z);

    void onExtraCallback(@NotNull CertUtil certUtil);

    void onExtraCallback(@NotNull parseDN parsedn);

    void onExtraCallback(@NotNull verifyPass verifypass);

    void onExtraCallback(boolean z);

    void onExtraCallbackWithResult(double d);

    void onExtraCallbackWithResult(int i, int i2);

    void onExtraCallbackWithResult(int i, int i2, int i3, int i4);

    void onExtraCallbackWithResult(@NotNull String str);

    void onExtraCallbackWithResult(@NotNull CertTransferMgrb certTransferMgrb);

    void onExtraCallbackWithResult(@NotNull FPUtil fPUtil);

    void onExtraCallbackWithResult(@NotNull getCertPolicyString getcertpolicystring);

    void onExtraCallbackWithResult(@NotNull transV2VerifyQRCodeCheckSum transv2verifyqrcodechecksum, boolean z);

    void onExtraCallbackWithResult(boolean z);

    void onNavigationEvent(@NotNull String str);

    void onNavigationEvent(@Nullable convertFromFingerRecoveryToNPKI convertfromfingerrecoverytonpki);

    void onNavigationEvent(@NotNull convertFromNPKItoFinger convertfromnpkitofinger);

    void onNavigationEvent(boolean z);

    void onTransact(boolean z);

    void onWarmupCompleted(double d);

    void onWarmupCompleted(@NotNull String str);

    void onWarmupCompleted(@NotNull compareWithCurrent comparewithcurrent);

    void onWarmupCompleted(@NotNull getCertPolicyString getcertpolicystring);

    void onWarmupCompleted(@NotNull parseDN parsedn);

    void onWarmupCompleted(boolean z);
}
