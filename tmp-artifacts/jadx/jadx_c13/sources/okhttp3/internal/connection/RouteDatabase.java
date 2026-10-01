package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RouteDatabase {
    private final Set<Route> _failedRoutes = new LinkedHashSet();

    public final Set<Route> getFailedRoutes() {
        Set<Route> set;
        synchronized (this) {
            set = CollectionsKt___CollectionsKt.toSet(this._failedRoutes);
        }
        return set;
    }

    public final void failed(@NotNull Route route) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(route, "");
            this._failedRoutes.add(route);
        }
    }

    public final void connected(@NotNull Route route) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(route, "");
            this._failedRoutes.remove(route);
        }
    }

    public final boolean shouldPostpone(@NotNull Route route) {
        boolean zContains;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(route, "");
            zContains = this._failedRoutes.contains(route);
        }
        return zContains;
    }
}
