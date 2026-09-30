package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getOriginalUnhandled implements isAnr {
    private final byte onExtraCallback;
    private final String onExtraCallbackWithResult;
    private static final getOriginalUnhandled[] onWarmupCompleted = IAuthTabCallbackStub();
    static final getOriginalUnhandled IAuthTabCallback = onWarmupCompleted((byte) 0);
    static final getOriginalUnhandled onNavigationEvent = onWarmupCompleted((byte) 1);

    static getOriginalUnhandled onWarmupCompleted(byte b) {
        return onWarmupCompleted[b & 255];
    }

    private static getOriginalUnhandled[] IAuthTabCallbackStub() {
        getOriginalUnhandled[] getoriginalunhandledArr = new getOriginalUnhandled[256];
        for (int i = 0; i < 256; i++) {
            getoriginalunhandledArr[i] = new getOriginalUnhandled((byte) i);
        }
        return getoriginalunhandledArr;
    }

    private getOriginalUnhandled(byte b) {
        char[] cArr = new char[2];
        copybugsnag_android_core_release.onWarmupCompleted(b, cArr, 0);
        this.onExtraCallbackWithResult = new String(cArr);
        this.onExtraCallback = b;
    }

    @Override // o.isAnr
    public boolean IAuthTabCallback() {
        return (this.onExtraCallback & 1) != 0;
    }

    @Override // o.isAnr
    public String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.isAnr
    public byte onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public String toString() {
        return onNavigationEvent();
    }
}
