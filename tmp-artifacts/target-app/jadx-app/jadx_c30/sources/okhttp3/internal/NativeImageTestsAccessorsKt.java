package okhttp3.internal;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTFullScreenVideoActivity3;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeImageTestsAccessorsKt {
    public static final Cache buildCache(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, long j, @NotNull FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(fileSystem, BuildConfig.FLAVOR);
        return new Cache(fileSystem, tTFullScreenVideoActivity3, j);
    }

    public static final long getIdleAtNsAccessor(@NotNull RealConnection realConnection) {
        Intrinsics.checkNotNullParameter(realConnection, BuildConfig.FLAVOR);
        return realConnection.getIdleAtNs();
    }

    public static final void setIdleAtNsAccessor(@NotNull RealConnection realConnection, long j) {
        Intrinsics.checkNotNullParameter(realConnection, BuildConfig.FLAVOR);
        realConnection.setIdleAtNs(j);
    }

    public static final Exchange getExchangeAccessor(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        return response.exchange();
    }

    public static final RealConnection getConnectionAccessor(@NotNull Exchange exchange) {
        Intrinsics.checkNotNullParameter(exchange, BuildConfig.FLAVOR);
        return exchange.getConnection$okhttp();
    }

    public static final void finishedAccessor(@NotNull Dispatcher dispatcher, @NotNull RealCall.AsyncCall asyncCall) {
        Intrinsics.checkNotNullParameter(dispatcher, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(asyncCall, BuildConfig.FLAVOR);
        dispatcher.finished$okhttp(asyncCall);
    }
}
