package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.setExecute;
import okhttp3.internal.connection.RoutePlanner;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {
    private final RoutePlanner routePlanner;

    public SequentialExchangeFinder(@NotNull RoutePlanner routePlanner) {
        Intrinsics.checkNotNullParameter(routePlanner, "");
        this.routePlanner = routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RealConnection find() throws Throwable {
        RoutePlanner.Plan plan;
        IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                plan = getRoutePlanner().plan();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    setExecute.onNavigationEvent(iOException, e);
                }
                if (!RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!plan.isReady()) {
                RoutePlanner.ConnectResult connectResultMo312connectTcp = plan.mo312connectTcp();
                if (connectResultMo312connectTcp.isSuccess()) {
                    connectResultMo312connectTcp = plan.mo313connectTlsEtc();
                }
                RoutePlanner.Plan planComponent2 = connectResultMo312connectTcp.component2();
                Throwable thComponent3 = connectResultMo312connectTcp.component3();
                if (thComponent3 != null) {
                    throw thComponent3;
                }
                if (planComponent2 != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(planComponent2);
                }
            }
            return plan.mo309handleSuccess();
        }
        throw new IOException("Canceled");
    }
}
