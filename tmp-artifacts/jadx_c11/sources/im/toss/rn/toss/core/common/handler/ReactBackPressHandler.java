package im.toss.rn.toss.core.common.handler;

import com.facebook.react.ReactHost;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBackPressHandler {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Function0<Unit> onNavigationEvent;
    private boolean onWarmupCompleted;

    public ReactBackPressHandler(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = function0;
        this.onWarmupCompleted = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@Nullable ReactHost reactHost) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (reactHost != null) {
            int i5 = i3 + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
                if (this.onWarmupCompleted) {
                    if (reactHost.onExtraCallback()) {
                        return true;
                    }
                }
            } else if (this.onWarmupCompleted) {
            }
        }
        this.onWarmupCompleted = true;
        return false;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted = true;
        } else {
            this.onWarmupCompleted = false;
        }
        this.onNavigationEvent.invoke();
        int i3 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
