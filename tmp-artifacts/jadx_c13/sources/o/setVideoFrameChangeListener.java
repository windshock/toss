package o;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setVideoFrameChangeListener implements setJsbLandingPageOpenListener {
    private final /* synthetic */ thxzb onExtraCallback;

    setVideoFrameChangeListener(thxzb thxzbVar) {
        this.onExtraCallback = thxzbVar;
    }

    @Override // o.setJsbLandingPageOpenListener
    public Reader onExtraCallback(InputStream inputStream) {
        return new InputStreamReader(inputStream);
    }
}
