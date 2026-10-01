package o;

import java.io.IOException;
import java.io.Writer;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.commons.lang3.Range;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowEndCardNextAd extends setCountDownFor1InN {
    private final Range<Integer> onExtraCallback;
    private final boolean onExtraCallbackWithResult;

    public static setShowEndCardNextAd onNavigationEvent(int i, int i2) {
        return new setShowEndCardNextAd(i, i2, true);
    }

    public setShowEndCardNextAd() {
        this(0, IntCompanionObject.MAX_VALUE, true);
    }

    private setShowEndCardNextAd(int i, int i2, boolean z) {
        this.onExtraCallback = Range.IAuthTabCallback(Integer.valueOf(i), Integer.valueOf(i2));
        this.onExtraCallbackWithResult = z;
    }

    @Override // o.setCountDownFor1InN
    public boolean onWarmupCompleted(int i, Writer writer) throws IOException {
        if (this.onExtraCallbackWithResult != this.onExtraCallback.IAuthTabCallback(Integer.valueOf(i))) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
