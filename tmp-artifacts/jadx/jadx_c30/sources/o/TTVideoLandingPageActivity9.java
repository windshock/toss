package o;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageActivity9 implements PAGMediaView {
    private final Path onExtraCallback;
    private final AtomicInteger onExtraCallbackWithResult = new AtomicInteger();

    public TTVideoLandingPageActivity9(Path path) {
        this.onExtraCallback = path;
    }

    @Override // o.PAGMediaView
    public PAGInterstitialAdInteractionCallback onExtraCallback() throws IOException {
        String str = "n" + this.onExtraCallbackWithResult.incrementAndGet();
        Path path = this.onExtraCallback;
        return new PAGInterstitialAdLoadCallback(path == null ? Files.createTempFile("parallelscatter", str, new FileAttribute[0]) : Files.createTempFile(path, "parallelscatter", str, new FileAttribute[0]));
    }
}
