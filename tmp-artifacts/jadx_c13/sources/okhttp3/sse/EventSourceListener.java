package okhttp3.sse;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class EventSourceListener {
    public void onClosed(@NotNull EventSource eventSource) {
        Intrinsics.checkNotNullParameter(eventSource, "");
    }

    public void onEvent(@NotNull EventSource eventSource, @Nullable String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(eventSource, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    public void onFailure(@NotNull EventSource eventSource, @Nullable Throwable th, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(eventSource, "");
    }

    public void onOpen(@NotNull EventSource eventSource, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(eventSource, "");
        Intrinsics.checkNotNullParameter(response, "");
    }
}
