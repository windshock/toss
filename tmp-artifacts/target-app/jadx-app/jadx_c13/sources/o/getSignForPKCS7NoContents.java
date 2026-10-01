package o;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getSignForPKCS7NoContents {
    default void IAuthTabCallback(boolean z) {
    }

    default boolean IAuthTabCallbackDefault() {
        return false;
    }

    default void IAuthTabCallbackStub() {
    }

    default void IAuthTabCallbackStub(boolean z) {
    }

    void asBinder();

    default void asBinder(boolean z) {
    }

    void asInterface();

    default void asInterface(boolean z) {
    }

    View onExtraCallback(@NotNull Context context);

    default void onExtraCallback() {
    }

    default void onExtraCallback(float f) {
    }

    default void onExtraCallback(int i) {
    }

    default void onExtraCallback(@NotNull getCertV3PEM getcertv3pem) {
        Intrinsics.checkNotNullParameter(getcertv3pem, "");
    }

    void onExtraCallback(@Nullable getHashData gethashdata);

    default void onExtraCallback(boolean z) {
    }

    default void onExtraCallback(boolean z, boolean z2) {
    }

    default boolean onExtraCallback(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return false;
    }

    default void onExtraCallbackWithResult(int i) {
    }

    void onExtraCallbackWithResult(@NotNull getSignForPKCS7AndVIDRV3 getsignforpkcs7andvidrv3);

    default void onExtraCallbackWithResult(boolean z) {
    }

    void onNavigationEvent(double d, double d2);

    default void onNavigationEvent(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    default void onNavigationEvent(@NotNull getSignForPKCS7AndVIDRV3NoContents getsignforpkcs7andvidrv3nocontents) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv3nocontents, "");
    }

    default void onNavigationEvent(boolean z) {
    }

    default int onTransact() {
        return 0;
    }

    default void onWarmupCompleted() {
    }

    default void onWarmupCompleted(double d) {
    }

    default void onWarmupCompleted(float f) {
    }

    default void onWarmupCompleted(int i) {
    }

    default void onWarmupCompleted(@NotNull getSignForPKCS7AndVIDRV3NoContents getsignforpkcs7andvidrv3nocontents) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv3nocontents, "");
    }

    default void onWarmupCompleted(@NotNull getSignForPKCS7AndVIDRV3NoContentsWithAttr getsignforpkcs7andvidrv3nocontentswithattr) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv3nocontentswithattr, "");
    }

    default void onWarmupCompleted(boolean z) {
    }

    static /* synthetic */ void onExtraCallback(getSignForPKCS7NoContents getsignforpkcs7nocontents, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFullscreen");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        getsignforpkcs7nocontents.onExtraCallback(z, z2);
    }
}
