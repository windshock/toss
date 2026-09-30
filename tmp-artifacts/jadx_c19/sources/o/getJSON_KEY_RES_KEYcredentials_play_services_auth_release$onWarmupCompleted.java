package o;

import android.util.Base64;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class getJSON_KEY_RES_KEYcredentials_play_services_auth_release$onWarmupCompleted {
    private long onExtraCallbackWithResult = System.currentTimeMillis() + 30000;
    private final FileInputStream onWarmupCompleted;

    public getJSON_KEY_RES_KEYcredentials_play_services_auth_release$onWarmupCompleted(@Nullable String str) {
        this.onWarmupCompleted = new FileInputStream(str);
    }

    private final void onWarmupCompleted() {
        this.onExtraCallbackWithResult = System.currentTimeMillis() + 30000;
    }

    public final boolean IAuthTabCallback() {
        return System.currentTimeMillis() >= this.onExtraCallbackWithResult;
    }

    public final String IAuthTabCallback(int i2) throws IOException {
        onWarmupCompleted();
        byte[] bArr = new byte[i2];
        String strEncodeToString = Base64.encodeToString(bArr, 0, this.onWarmupCompleted.read(bArr), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final void onExtraCallbackWithResult() throws IOException {
        this.onWarmupCompleted.close();
    }
}
