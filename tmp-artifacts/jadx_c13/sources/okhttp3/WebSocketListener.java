package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(response, "");
    }
}
