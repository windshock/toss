package o;

import java.util.ServiceLoader;
import kotlin.jvm.internal.Intrinsics;
import o.getStackTraceString;
import o.getStackTraceString.IAuthTabCallback;
import o.getStackTraceString.onWarmupCompleted;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class EntryInfo<F extends getStackTraceString, D extends getStackTraceString.onWarmupCompleted, FP extends getStackTraceString.IAuthTabCallback<F, D>> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final D onExtraCallback;
    private F onNavigationEvent;
    private final String onWarmupCompleted;

    public EntryInfo(@NotNull String str, @NotNull D d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(d, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = d;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final F IAuthTabCallback(@NotNull Class<FP> cls) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cls, "");
        if (this.onNavigationEvent == null) {
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = (F) ((getStackTraceString.IAuthTabCallback) ServiceLoader.load(cls, cls.getClassLoader()).iterator().next()).get(this.onExtraCallback);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        F f = this.onNavigationEvent;
        Intrinsics.checkNotNull(f);
        return f;
    }
}
