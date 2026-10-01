package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wwx9 extends getAdTitleTextView {
    private final getAdTitleTextView[] onExtraCallback;

    public wwx9(getAdTitleTextView... getadtitletextviewArr) {
        this.onExtraCallback = (getAdTitleTextView[]) getVideoProgress.onNavigationEvent(getadtitletextviewArr);
    }

    @Override // o.getAdTitleTextView
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (getAdTitleTextView getadtitletextview : this.onExtraCallback) {
            int iIAuthTabCallback = getadtitletextview.IAuthTabCallback(charSequence, i, writer);
            if (iIAuthTabCallback != 0) {
                return iIAuthTabCallback;
            }
        }
        return 0;
    }
}
