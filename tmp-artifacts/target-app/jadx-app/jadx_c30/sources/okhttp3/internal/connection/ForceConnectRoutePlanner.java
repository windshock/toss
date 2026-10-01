package okhttp3.internal.connection;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access6900;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RoutePlanner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ForceConnectRoutePlanner implements RoutePlanner {
    private final RealRoutePlanner delegate;

    public Address getAddress() {
        return this.delegate.getAddress();
    }

    public access6900<RoutePlanner.Plan> getDeferredPlans() {
        return this.delegate.getDeferredPlans();
    }

    public boolean hasNext(@Nullable RealConnection realConnection) {
        return this.delegate.hasNext(realConnection);
    }

    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    public boolean sameHostAndPort(@NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, BuildConfig.FLAVOR);
        return this.delegate.sameHostAndPort(httpUrl);
    }

    public ForceConnectRoutePlanner(@NotNull RealRoutePlanner realRoutePlanner) {
        Intrinsics.checkNotNullParameter(realRoutePlanner, BuildConfig.FLAVOR);
        this.delegate = realRoutePlanner;
    }

    public RoutePlanner.Plan plan() {
        return this.delegate.planConnect$okhttp();
    }
}
