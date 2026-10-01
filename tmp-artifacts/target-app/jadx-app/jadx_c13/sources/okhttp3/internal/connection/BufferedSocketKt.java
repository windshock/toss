package okhttp3.internal.connection;

import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity5;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        return asBufferedSocket(TTCeilingLandingPageActivity5.onWarmupCompleted(socket));
    }

    public static final BufferedSocket asBufferedSocket(@NotNull TTHistoryActivity5 tTHistoryActivity5) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity5, "");
        return new BufferedSocket(tTHistoryActivity5) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            private final TTHistoryActivity5 delegate;
            private final TTAppOpenAdActivity9 sink;
            private final TTAppOpenAdTransActivity source;

            {
                this.delegate = tTHistoryActivity5;
                this.source = TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity5.getSource());
                this.sink = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity5.getSink());
            }

            @Override // o.TTHistoryActivity5
            public TTAppOpenAdTransActivity getSource() {
                return this.source;
            }

            @Override // o.TTHistoryActivity5
            public TTAppOpenAdActivity9 getSink() {
                return this.sink;
            }

            @Override // o.TTHistoryActivity5
            public void cancel() {
                this.delegate.cancel();
            }
        };
    }
}
