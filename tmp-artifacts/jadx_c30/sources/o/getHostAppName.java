package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getHostAppName extends getOverlayLayout {
    private final int IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public getHostAppName() {
        this(0, Integer.MAX_VALUE, true);
    }

    protected getHostAppName(int i, int i2, boolean z) {
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = z;
    }

    @Override // o.getOverlayLayout
    public boolean IAuthTabCallback(int i, Writer writer) throws IOException {
        if (this.onNavigationEvent) {
            if (i < this.onExtraCallbackWithResult || i > this.IAuthTabCallback) {
                return false;
            }
        } else if (i >= this.onExtraCallbackWithResult && i <= this.IAuthTabCallback) {
            return false;
        }
        if (i > 65535) {
            writer.write(onExtraCallback(i));
            return true;
        }
        writer.write("\\u");
        char[] cArr = getAdTitleTextView.onWarmupCompleted;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }

    protected String onExtraCallback(int i) {
        return "\\u" + getAdTitleTextView.onNavigationEvent(i);
    }
}
