package okhttp3.internal.http1;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final TTAppOpenAdTransActivity source;

    public HeadersReader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.source = tTAppOpenAdTransActivity;
        this.headerLimit = 262144L;
    }

    public final TTAppOpenAdTransActivity getSource() {
        return this.source;
    }

    public final String readLine() throws IOException {
        String strOnExtraCallback = this.source.onExtraCallback(this.headerLimit);
        this.headerLimit -= strOnExtraCallback.length();
        return strOnExtraCallback;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() != 0) {
                builder.addLenient$okhttp(line);
            } else {
                return builder.build();
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
