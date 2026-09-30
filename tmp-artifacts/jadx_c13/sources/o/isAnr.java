package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface isAnr {
    static int onWarmupCompleted() {
        return 2;
    }

    boolean IAuthTabCallback();

    byte onExtraCallbackWithResult();

    String onNavigationEvent();

    static isAnr onExtraCallback() {
        return getOriginalUnhandled.IAuthTabCallback;
    }

    static isAnr IAuthTabCallbackDefault() {
        return getOriginalUnhandled.onNavigationEvent;
    }

    static isAnr onExtraCallbackWithResult(byte b) {
        return getOriginalUnhandled.onWarmupCompleted(b);
    }
}
