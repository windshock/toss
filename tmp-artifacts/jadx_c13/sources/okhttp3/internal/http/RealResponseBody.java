package okhttp3.internal.http;

import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final TTAppOpenAdTransActivity source;

    public RealResponseBody(@Nullable String str, long j, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = tTAppOpenAdTransActivity;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public TTAppOpenAdTransActivity source() {
        return this.source;
    }
}
