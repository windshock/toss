package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ConnectionListener {
    public static final Companion Companion = new Companion(null);
    private static final ConnectionListener NONE = new ConnectionListener() { // from class: okhttp3.internal.connection.ConnectionListener$Companion$NONE$1
    };

    public void connectEnd(@NotNull Connection connection, @NotNull Route route, @NotNull Call call) {
        Intrinsics.checkNotNullParameter(connection, "");
        Intrinsics.checkNotNullParameter(route, "");
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectFailed(@NotNull Route route, @NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(route, "");
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void connectStart(@NotNull Route route, @NotNull Call call) {
        Intrinsics.checkNotNullParameter(route, "");
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectionAcquired(@NotNull Connection connection, @NotNull Call call) {
        Intrinsics.checkNotNullParameter(connection, "");
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectionClosed(@NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectionReleased(@NotNull Connection connection, @NotNull Call call) {
        Intrinsics.checkNotNullParameter(connection, "");
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void noNewExchanges(@NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(connection, "");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConnectionListener getNONE() {
            return ConnectionListener.NONE;
        }
    }
}
