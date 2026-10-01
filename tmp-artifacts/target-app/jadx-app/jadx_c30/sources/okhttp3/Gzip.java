package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity1;
import o.TTHistoryActivity42;
import okhttp3.CompressionInterceptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Gzip implements CompressionInterceptor.DecompressionAlgorithm {
    public static final Gzip INSTANCE = new Gzip();

    private Gzip() {
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public String getEncoding() {
        return "gzip";
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public TTHistoryActivity42 decompress(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, BuildConfig.FLAVOR);
        return new TTCeilingLandingPageActivity1(tTAppOpenAdTransActivity);
    }
}
