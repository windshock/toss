package o;

import im.toss.url.resolver.ResolverOptions;
import im.toss.url.resolver.internal.RegistrationContext;
import im.toss.url.resolver.internal.RoutingKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class updateStatebugsnag_android_core_release {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final <E, T> BreadcrumbInternal<E, T> onExtraCallback(@NotNull String str, @NotNull Function1<? super Breadcrumb<E, T>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        RegistrationContext registrationContext = new RegistrationContext();
        function1.invoke(new Breadcrumb(str, registrationContext));
        Pair pairOnExtraCallbackWithResult = RoutingKt.onExtraCallbackWithResult(registrationContext);
        BreadcrumbInternal<E, T> breadcrumbInternal = new BreadcrumbInternal<>((List) pairOnExtraCallbackWithResult.onExtraCallbackWithResult(), (ResolverOptions) pairOnExtraCallbackWithResult.IAuthTabCallback());
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return breadcrumbInternal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
