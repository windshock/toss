package o;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGInterstitialAdInteractionCallback extends Closeable {
    void onNavigationEvent(byte[] bArr, int i, int i2) throws IOException;
}
