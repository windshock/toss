package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class accessgetDEFAULT_CONNECTION_SPECScp extends verifyClientState {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final deprecated_callTimeoutMillis onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDEFAULT_CONNECTION_SPECScp(@NotNull String str, @NotNull deprecated_callTimeoutMillis deprecated_calltimeoutmillis) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_calltimeoutmillis, "");
        this.onNavigationEvent = deprecated_calltimeoutmillis;
    }

    @Override // o.verifyClientState
    public String IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(onExtraCallback(), f);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
