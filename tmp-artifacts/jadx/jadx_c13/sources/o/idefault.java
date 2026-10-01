package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class idefault {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final <T> AFg1eSDKAFa1ySDK<T> IAuthTabCallback(@NotNull Function1<? super ddefault<T>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        ddefault ddefaultVar = new ddefault();
        function1.invoke(ddefaultVar);
        wdefault wdefaultVar = new wdefault(ddefaultVar.onExtraCallbackWithResult());
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return wdefaultVar;
    }
}
