package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class bhiycx implements setPreProgressHundred {
    private final TTAppOpenAdActivity9 onExtraCallbackWithResult;

    public bhiycx(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        this.onExtraCallbackWithResult = tTAppOpenAdActivity9;
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(long j) throws IOException {
        onNavigationEvent(String.valueOf(j));
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(char c) throws IOException {
        this.onExtraCallbackWithResult.access100(c);
    }

    @Override // o.setPreProgressHundred
    public void onNavigationEvent(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult.onExtraCallback(str);
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult.access100(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < PglCryptUtils.onNavigationEvent().length && PglCryptUtils.onNavigationEvent()[cCharAt] != null) {
                this.onExtraCallbackWithResult.onNavigationEvent(str, i, i2);
                String str2 = PglCryptUtils.onNavigationEvent()[cCharAt];
                Intrinsics.checkNotNull(str2);
                this.onExtraCallbackWithResult.onNavigationEvent(str2, 0, str2.length());
                i = i2 + 1;
            }
        }
        this.onExtraCallbackWithResult.onNavigationEvent(str, i, str.length());
        this.onExtraCallbackWithResult.access100(34);
    }
}
