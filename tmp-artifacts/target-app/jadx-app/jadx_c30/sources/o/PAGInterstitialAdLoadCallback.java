package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGInterstitialAdLoadCallback implements PAGInterstitialAdInteractionCallback {
    private final OutputStream onExtraCallback;
    private final Path onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public PAGInterstitialAdLoadCallback(Path path) throws FileNotFoundException {
        this.onExtraCallbackWithResult = path;
        try {
            this.onExtraCallback = Files.newOutputStream(path, new OpenOption[0]);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            onExtraCallback();
        } finally {
            Files.deleteIfExists(this.onExtraCallbackWithResult);
        }
    }

    public void onExtraCallback() throws IOException {
        if (this.onNavigationEvent) {
            return;
        }
        this.onExtraCallback.close();
        this.onNavigationEvent = true;
    }

    @Override // o.PAGInterstitialAdInteractionCallback
    public void onNavigationEvent(byte[] bArr, int i, int i2) throws IOException {
        this.onExtraCallback.write(bArr, i, i2);
    }
}
