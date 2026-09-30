package o;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findPartiallyOrCompletelyInvisibleChildClosestToStart {
    public static final Request IAuthTabCallback(@NotNull Request request, @NotNull String str) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(str, "");
        return request.newBuilder().removeHeader(RtspHeaders.AUTHORIZATION).addHeader(RtspHeaders.AUTHORIZATION, "Bearer " + str).build();
    }
}
