package o;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dbExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    public static final dbExternalSyntheticLambda0 onExtraCallback = new dbExternalSyntheticLambda0();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private dbExternalSyntheticLambda0() {
    }

    public final boolean IAuthTabCallback(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull String str, @NotNull PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(publicKey, "");
            Signature.getInstance("SHA512withRSA").initVerify(publicKey);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        Signature signature = Signature.getInstance("SHA512withRSA");
        signature.initVerify(publicKey);
        byte[] bArr = new byte[65536];
        while (true) {
            try {
                int iIAuthTabCallback = tTAppOpenAdTransActivity.IAuthTabCallback(bArr);
                if (iIAuthTabCallback == -1) {
                    break;
                }
                int i3 = IAuthTabCallback + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                signature.update(bArr, 0, iIAuthTabCallback);
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(tTAppOpenAdTransActivity, (Throwable) null);
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(str);
        if (tTBaseLandingPageActivityOnExtraCallback != null) {
            int i5 = onNavigationEvent + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            byte[] bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000();
            if (bArrAccess000 != null) {
                int i7 = IAuthTabCallback + 39;
                onNavigationEvent = i7 % 128;
                try {
                    if (i7 % 2 == 0) {
                        return signature.verify(bArrAccess000);
                    }
                    signature.verify(bArrAccess000);
                    obj.hashCode();
                    throw null;
                } catch (SignatureException unused) {
                }
            }
        }
        return false;
    }
}
