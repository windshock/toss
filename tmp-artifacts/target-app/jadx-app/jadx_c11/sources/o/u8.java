package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u8 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final <T> u7ExternalSyntheticLambda0<T> IAuthTabCallback(@NotNull Function1<? super u7a<T>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        u7a u7aVar = new u7a();
        function1.invoke(u7aVar);
        u7b u7bVar = new u7b(u7aVar.onWarmupCompleted());
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return u7bVar;
        }
        throw null;
    }

    public static final <T> u7b<T> onExtraCallbackWithResult() {
        int i = 2 % 2;
        u7b<T> u7bVar = new u7b<>(access8100.onNavigationEvent());
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return u7bVar;
    }
}
