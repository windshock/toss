package o;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class isInLayout implements Serializable {
    private static isInLayout onNavigationEvent = new isInLayout(1000);
    private static final long serialVersionUID = 1;
    protected final int _maxNestingDepth;

    protected isInLayout(int i2) {
        this._maxNestingDepth = i2;
    }

    public static isInLayout onNavigationEvent() {
        return onNavigationEvent;
    }

    public void onExtraCallbackWithResult(int i2) throws StreamConstraintsException {
        int i3 = this._maxNestingDepth;
        if (i2 <= i3) {
            return;
        }
        throw onWarmupCompleted("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), IAuthTabCallback("getMaxNestingDepth"));
    }

    protected StreamConstraintsException onWarmupCompleted(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    protected String IAuthTabCallback(String str) {
        return "`StreamWriteConstraints." + str + "()`";
    }
}
