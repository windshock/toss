package o;

import im.toss.url.resolver.internal.RegistrationContext;
import im.toss.url.resolver.internal.RoutingKt;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Breadcrumb<E, T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String onExtraCallbackWithResult;
    private final RegistrationContext<Function2<getObserversbugsnag_android_core_release, E, T>> onWarmupCompleted;

    public Breadcrumb(@NotNull String str, @NotNull RegistrationContext<Function2<getObserversbugsnag_android_core_release, E, T>> registrationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(registrationContext, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = registrationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(Breadcrumb breadcrumb, String str, Set set, Function2 function2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 73;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            set = clearNumber.onNavigationEvent();
        }
        breadcrumb.onWarmupCompleted(str, set, function2);
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull Set<String> set, @NotNull Function2<? super getObserversbugsnag_android_core_release, ? super E, ? extends T> function2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(function2, "");
            RoutingKt.onNavigationEvent(this.onWarmupCompleted, this.onExtraCallbackWithResult, str, set, function2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function2, "");
        RoutingKt.onNavigationEvent(this.onWarmupCompleted, this.onExtraCallbackWithResult, str, set, function2);
        int i3 = onNavigationEvent + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
