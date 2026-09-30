package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivity3 {
    private final int IAuthTabCallback;
    private final String onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    TTLandingPageActivity3(int i, int i2, int i3, String str) {
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = i3;
        this.onExtraCallback = str;
    }

    int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        int i = this.onExtraCallbackWithResult;
        return String.format("[%d]: %s", Integer.valueOf(i), this.onExtraCallback);
    }
}
