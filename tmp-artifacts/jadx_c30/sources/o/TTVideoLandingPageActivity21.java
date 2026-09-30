package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTVideoLandingPageActivity21 extends PAGInterstitialRequest {
    TTVideoLandingPageActivity21(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    int IAuthTabCallback() throws IOException {
        return (int) onExtraCallbackWithResult(1);
    }

    long IAuthTabCallback(int i) throws IOException {
        if (i < 0 || i > 8) {
            throw new IOException("Trying to read " + i + " bits, at most 8 are allowed");
        }
        return onExtraCallbackWithResult(i);
    }

    int onNavigationEvent() throws IOException {
        return (int) onExtraCallbackWithResult(8);
    }
}
