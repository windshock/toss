package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class onDowngrade implements Serializable {
    private final int major;
    private final int minor;

    public onDowngrade(int i, int i2) {
        this.major = i;
        this.minor = i2;
    }

    public int onExtraCallback() {
        return this.major;
    }

    public String onWarmupCompleted() {
        return this.major + onVideoError.onExtraCallbackWithResult + this.minor;
    }

    public String toString() {
        return "Version{major=" + this.major + ", minor=" + this.minor + '}';
    }
}
