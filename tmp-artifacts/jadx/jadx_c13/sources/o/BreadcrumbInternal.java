package o;

import im.toss.url.resolver.ResolverOptions;
import im.toss.url.resolver.internal.RouteEntry;
import im.toss.url.resolver.internal.RoutingKt;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BreadcrumbInternal<E, T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final List<RouteEntry<Function2<getObserversbugsnag_android_core_release, E, T>>> IAuthTabCallback;
    private final ResolverOptions onExtraCallbackWithResult;

    public BreadcrumbInternal(@NotNull List<RouteEntry<Function2<getObserversbugsnag_android_core_release, E, T>>> list, @NotNull ResolverOptions resolverOptions) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(resolverOptions, "");
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = resolverOptions;
    }

    public final T onExtraCallbackWithResult(@NotNull String str, E e) {
        BreadcrumbState breadcrumbStateOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            breadcrumbStateOnNavigationEvent = RoutingKt.onNavigationEvent(this.IAuthTabCallback, this.onExtraCallbackWithResult, str);
            int i3 = 85 / 0;
            if (breadcrumbStateOnNavigationEvent == null) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            breadcrumbStateOnNavigationEvent = RoutingKt.onNavigationEvent(this.IAuthTabCallback, this.onExtraCallbackWithResult, str);
            if (breadcrumbStateOnNavigationEvent == null) {
                return null;
            }
        }
        T t = (T) ((Function2) breadcrumbStateOnNavigationEvent.onExtraCallback()).invoke(breadcrumbStateOnNavigationEvent.onNavigationEvent(), e);
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }
}
