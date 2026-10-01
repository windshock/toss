package im.toss.rn.toss.core.legacy.bundle.v2;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleExtensionsKt {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return r1.verify(r6);
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallbackWithResult(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull String str, @NotNull PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Signature signature;
        byte[] bArr;
        byte[] bArrAccess000;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(publicKey, "");
            signature = Signature.getInstance("SHA512withRSA");
            signature.initVerify(publicKey);
            bArr = new byte[65536];
            int i3 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(publicKey, "");
            signature = Signature.getInstance("SHA512withRSA");
            signature.initVerify(publicKey);
            bArr = new byte[65536];
        }
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            try {
                int iIAuthTabCallback = tTAppOpenAdTransActivity.IAuthTabCallback(bArr);
                if (iIAuthTabCallback == -1) {
                    break;
                }
                signature.update(bArr, 0, iIAuthTabCallback);
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(tTAppOpenAdTransActivity, (Throwable) null);
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(str);
        if (tTBaseLandingPageActivityOnExtraCallback != null) {
            int i6 = onNavigationEvent + 97;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000();
                int i7 = 39 / 0;
            } else {
                bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000();
            }
        }
        return false;
    }
}
