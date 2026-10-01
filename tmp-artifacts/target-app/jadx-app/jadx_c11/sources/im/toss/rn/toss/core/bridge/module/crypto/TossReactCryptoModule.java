package im.toss.rn.toss.core.bridge.module.crypto;

import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactCryptoModule extends ReactContextBaseJavaModule {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossReactCryptoModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return "TossCryptoModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getRandomBase64(int i) throws NoSuchAlgorithmException {
        int i2 = 2 % 2;
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        int i3 = onNavigationEvent + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return strEncodeToString;
        }
        throw null;
    }
}
