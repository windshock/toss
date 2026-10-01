package o;

import java.io.IOException;
import java.io.Writer;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setSkipText extends setCountDownFor1InN {
    private final boolean IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public setSkipText() {
        this(0, IntCompanionObject.MAX_VALUE, true);
    }

    protected setSkipText(int i, int i2, boolean z) {
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
        this.IAuthTabCallback = z;
    }

    protected String IAuthTabCallback(int i) {
        return "\\u" + hideCountDownText.onExtraCallbackWithResult(i);
    }

    @Override // o.setCountDownFor1InN
    public boolean onWarmupCompleted(int i, Writer writer) throws IOException {
        if (this.IAuthTabCallback) {
            if (i < this.onNavigationEvent || i > this.onExtraCallbackWithResult) {
                return false;
            }
        } else if (i >= this.onNavigationEvent && i <= this.onExtraCallbackWithResult) {
            return false;
        }
        if (i > 65535) {
            writer.write(IAuthTabCallback(i));
            return true;
        }
        writer.write("\\u");
        char[] cArr = hideCountDownText.onWarmupCompleted;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }
}
