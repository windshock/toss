package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setMask extends RuntimeException {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMask(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.message;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }
}
