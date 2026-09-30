package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAdLogo extends getOverlayLayout {
    private final int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;

    private getAdLogo(int i, int i2, boolean z) {
        this.onExtraCallback = i;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = z;
    }

    public getAdLogo() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static getAdLogo onWarmupCompleted(int i, int i2) {
        return new getAdLogo(i, i2, true);
    }

    @Override // o.getOverlayLayout
    public boolean IAuthTabCallback(int i, Writer writer) throws IOException {
        if (this.onExtraCallbackWithResult) {
            if (i < this.onExtraCallback || i > this.onNavigationEvent) {
                return false;
            }
        } else if (i >= this.onExtraCallback && i <= this.onNavigationEvent) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
