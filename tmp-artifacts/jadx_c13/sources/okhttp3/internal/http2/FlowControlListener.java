package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface FlowControlListener {
    void receivingConnectionWindowChanged(@NotNull WindowCounter windowCounter);

    void receivingStreamWindowChanged(int i, @NotNull WindowCounter windowCounter, long j);

    public static final class None implements FlowControlListener {
        public static final None INSTANCE = new None();

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingConnectionWindowChanged(@NotNull WindowCounter windowCounter) {
            Intrinsics.checkNotNullParameter(windowCounter, "");
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingStreamWindowChanged(int i, @NotNull WindowCounter windowCounter, long j) {
            Intrinsics.checkNotNullParameter(windowCounter, "");
        }

        private None() {
        }
    }
}
