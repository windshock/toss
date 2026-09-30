package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getSharedElementReturnTransition implements Serializable {
    private static getSharedElementReturnTransition onWarmupCompleted = new getSharedElementReturnTransition(256, 500);
    private static final long serialVersionUID = 1;
    protected final int _maxErrorTokenLength;
    protected final int _maxRawContentLength;

    protected getSharedElementReturnTransition(int i2, int i3) {
        this._maxErrorTokenLength = i2;
        this._maxRawContentLength = i3;
    }

    public static getSharedElementReturnTransition IAuthTabCallback() {
        return onWarmupCompleted;
    }

    public int onExtraCallbackWithResult() {
        return this._maxErrorTokenLength;
    }

    public int onExtraCallback() {
        return this._maxRawContentLength;
    }
}
