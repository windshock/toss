package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setSdkTypeFactory {
    int IAuthTabCallback;
    int onExtraCallback;
    int[] onExtraCallbackWithResult;
    int[] onNavigationEvent;

    public int IAuthTabCallback() {
        int[] iArr = this.onExtraCallbackWithResult;
        int i = this.IAuthTabCallback;
        this.IAuthTabCallback = i + 1;
        return iArr[i];
    }

    public int onExtraCallbackWithResult() {
        int[] iArr = this.onNavigationEvent;
        int i = this.onExtraCallback;
        this.onExtraCallback = i + 1;
        return iArr[i];
    }
}
