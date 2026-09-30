package o;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TTWebsiteActivity7 {
    ByteBuffer onExtraCallbackWithResult(String str) throws IOException;

    String onNavigationEvent(byte[] bArr) throws IOException;

    boolean onWarmupCompleted(String str);
}
