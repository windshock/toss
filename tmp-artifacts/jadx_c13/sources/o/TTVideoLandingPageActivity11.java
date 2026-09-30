package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTVideoLandingPageActivity11 {
    private final boolean IAuthTabCallback;
    private final List<TTVideoLandingPageActivity10> onExtraCallbackWithResult;

    public TTVideoLandingPageActivity11(byte[] bArr) throws IOException {
        this.onExtraCallbackWithResult = new ArrayList(TTVideoLandingPageActivity4.onWarmupCompleted(bArr, 0, 21));
        this.IAuthTabCallback = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 504);
    }

    public List<TTVideoLandingPageActivity10> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }
}
