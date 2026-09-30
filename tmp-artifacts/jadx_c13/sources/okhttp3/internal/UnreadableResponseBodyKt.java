package okhttp3.internal;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UnreadableResponseBodyKt {
    public static final Response stripBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        return response.newBuilder().body(new UnreadableResponseBody(response.body().contentType(), response.body().contentLength())).build();
    }
}
