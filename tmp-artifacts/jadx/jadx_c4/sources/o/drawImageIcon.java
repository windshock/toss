package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawImageIcon extends Exception {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final int errorCode;
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drawImageIcon(int i, @NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = i;
        this.errorMessage = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i = 2 % 2;
        String str = "AuthenticationException(errorCode=" + this.errorCode + ", errorMessage='" + this.errorMessage + "')";
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
