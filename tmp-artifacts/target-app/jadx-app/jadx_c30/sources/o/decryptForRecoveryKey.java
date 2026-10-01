package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface decryptForRecoveryKey {
    void IAuthTabCallback();

    void IAuthTabCallback(boolean z);

    void IAuthTabCallback(boolean z, boolean z2, boolean z3);

    void IAuthTabCallbackDefault();

    void IAuthTabCallbackStub();

    void asBinder();

    void onExtraCallback();

    void onExtraCallback(float f);

    void onExtraCallback(@NotNull getSignForPKCS7 getsignforpkcs7);

    void onExtraCallback(boolean z);

    void onExtraCallbackWithResult();

    void onExtraCallbackWithResult(double d, double d2);

    void onExtraCallbackWithResult(double d, int i, int i2);

    void onExtraCallbackWithResult(float f);

    void onExtraCallbackWithResult(@NotNull getSignForPKCS7AndVIDRV2NoContentsWithAttr getsignforpkcs7andvidrv2nocontentswithattr);

    void onExtraCallbackWithResult(boolean z);

    void onNavigationEvent();

    default void onNavigationEvent(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }

    void onNavigationEvent(@NotNull getSignForPKCS7AndVIDRV2 getsignforpkcs7andvidrv2);

    void onNavigationEvent(boolean z, @NotNull String str, @NotNull String str2);

    void onWarmupCompleted();

    void onWarmupCompleted(double d, double d2);
}
