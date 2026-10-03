package o;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCurrentAppState implements Serializable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String redirectUrl;

    public getCurrentAppState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.redirectUrl = str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.redirectUrl;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return str;
    }
}
